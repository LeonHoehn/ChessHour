package chessHour.generator

import chessHour.ChessHourPackage
import chessHour.MoveRule
import chessHour.PieceInstance
import chessHour.PieceType
import chessHour.Puzzle
import java.io.FileOutputStream
import java.io.PrintWriter
import java.util.Base64
import org.eclipse.emf.common.util.EList
import org.eclipse.emf.common.util.URI
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl


class PuzzleGenerator {

    // ─── Entry point for standalone execution ───────────────────────────────

    def static void main(String[] args) {
        if (args.length < 2) {
            System.err.println("Usage: PuzzleGenerator <puzzle.xmi> <output.html>")
            return
        }
        ChessHourPackage.eINSTANCE.eClass()
        val rs = new ResourceSetImpl
        rs.resourceFactoryRegistry.extensionToFactoryMap.put("chesshour", new XMIResourceFactoryImpl)
		rs.resourceFactoryRegistry.extensionToFactoryMap.put("xmi", new XMIResourceFactoryImpl)
        val resource = rs.getResource(URI.createFileURI(args.get(0)), true)
        val puzzle = resource.contents.get(0) as Puzzle
        new PuzzleGenerator().generate(puzzle, args.get(1))
        println("Generated: " + args.get(1))
    }

    // ─── Public API ─────────────────────────────────────────────────────────

    def void generate(Puzzle puzzle, String outputPath) {
        val html = generateHtml(puzzle)
        val out = new PrintWriter(new FileOutputStream(outputPath))
        out.print(html)
        out.close()
    }

    // ─── HTML document ──────────────────────────────────────────────────────

    def generateHtml(Puzzle puzzle) {
        val board = puzzle.board
        val w = board.width
        val h = board.height
        val cs = 70  // cell size in px
        '''
<!DOCTYPE html>
<html lang="de">
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<title>ChessHour Puzzle</title>
<style>
«css(cs)»
</style>
</head>
<body>
<h1>ChessHour Puzzle</h1>
<div id="board"
     style="grid-template-columns:repeat(«w»,«cs»px);grid-template-rows:repeat(«h»,«cs»px);">
</div>
<div id="status">Wähle eine Figur aus</div>
<div id="win-overlay">
  <div class="win-box">
    <h2>Puzzle gelöst!</h2>
    <button onclick="location.reload()">Nochmal</button>
  </div>
</div>
<script>
const BOARD_WIDTH  = «w»;
const BOARD_HEIGHT = «h»;

const CELLS = [
«FOR cell : board.cells»
  {x:«cell.x»,y:«cell.y»,active:«cell.active»,blocked:«cell.blocked»},
«ENDFOR»
];

const PIECE_TYPES = {
«FOR pt : puzzle.pieceTypes»
  "«pt.name»": {
    name:  "«pt.name»",
    image: "data:image/png;base64,«loadBase64(pt.iconFile)»",
    rules: [«FOR rule : pt.moveRules SEPARATOR ","»«ruleJs(rule)»«ENDFOR»]
  },
«ENDFOR»
};

let pieces = [
«FOR pi : puzzle.pieces»
  «pieceJs(pi, puzzle.pieces.indexOf(pi))»,
«ENDFOR»
];

const SOUNDS = {
  move:    new Audio("data:audio/mpeg;base64,«loadBase64Asset("sounds", "move-self.mp3")»"),
  capture: new Audio("data:audio/mpeg;base64,«loadBase64Asset("sounds", "capture.mp3")»"),
  win:     new Audio("data:audio/mpeg;base64,«loadBase64Asset("sounds", "game-end.mp3")»")
};

«gameJs»

render();
</script>
</body>
</html>
'''
    }

    // ─── CSS (chess.com dark theme) ─────────────────────────────────────────

    def css(int cs) '''
* { box-sizing: border-box; margin: 0; padding: 0; }
body {
  background: #262421;
  color: #ccc;
  display: flex;
  flex-direction: column;
  align-items: center;
  justify-content: center;
  min-height: 100vh;
  font-family: 'Segoe UI', Arial, sans-serif;
  gap: 16px;
}
h1 { font-size: 22px; color: #b0b0b0; letter-spacing: 1px; }
#board {
  display: grid;
  box-shadow: 0 6px 32px rgba(0,0,0,0.7);
}
.cell {
  width: «cs»px;
  height: «cs»px;
  position: relative;
  display: flex;
  align-items: center;
  justify-content: center;
}
.cell.light    { background: #f0d9b5; }
.cell.dark     { background: #b58863; }
.cell.inactive { background: transparent; }
.cell.blocked  {
  background: #3a3540;
  background-image: repeating-linear-gradient(
    45deg,
    rgba(0,0,0,0.18) 0px, rgba(0,0,0,0.18) 4px,
    transparent 4px, transparent 8px
  );
}
.cell.selected-cell::after {
  content: '';
  position: absolute;
  inset: 0;
  background: rgba(255,240,50,0.35);
  pointer-events: none;
}
.cell.hint-move::before {
  content: '';
  position: absolute;
  width: 34%;
  height: 34%;
  border-radius: 50%;
  background: rgba(0,0,0,0.18);
  z-index: 1;
  pointer-events: none;
}
.cell.hint-capture::before {
  content: '';
  position: absolute;
  inset: 0;
  box-shadow: inset 0 0 0 5px rgba(0,0,0,0.22);
  border-radius: 0;
  z-index: 1;
  pointer-events: none;
}
.piece {
  width: 84%;
  height: 84%;
  object-fit: contain;
  position: relative;
  z-index: 2;
  cursor: default;
  user-select: none;
  -webkit-user-drag: none;
}
.piece.own-piece { cursor: pointer; }
.piece.selected { filter: drop-shadow(0 0 8px rgba(100,210,255,0.95)); }
#status { font-size: 15px; color: #888; min-height: 22px; }
#win-overlay {
  display: none;
  position: fixed;
  inset: 0;
  background: rgba(0,0,0,0.75);
  align-items: center;
  justify-content: center;
  z-index: 100;
}
#win-overlay.show { display: flex; }
.win-box {
  background: #2f2d2a;
  border: 2px solid #769656;
  border-radius: 12px;
  padding: 40px 60px;
  text-align: center;
}
.win-box h2 { font-size: 34px; color: #FFD700; margin-bottom: 20px; }
.win-box button {
  padding: 10px 28px;
  font-size: 15px;
  background: #769656;
  color: #fff;
  border: none;
  border-radius: 6px;
  cursor: pointer;
}
.win-box button:hover { background: #5c7a3e; }
'''

    // ─── JS serialisation helpers ────────────────────────────────────────────

    def ruleJs(MoveRule r) '''
{dir:"«r.direction.literal»",infinite:«r.infinite»,maxDist:«r.maxDistance»,moveType:"«r.moveType.literal»",canJump:«r.canJumpOverBlocked»}'''

    def pieceJs(PieceInstance pi, int id) '''
{id:«id»,x:«pi.x»,y:«pi.y»,owner:"«pi.owner.literal»",typeName:"«pi.type.name»",captured:false}'''

    // ─── Static game logic (JS) ──────────────────────────────────────────────

    def gameJs() '''
const cellMap = Object.fromEntries(CELLS.map(c => [c.x + ',' + c.y, c]));

function getCell(x, y) { return cellMap[x + ',' + y] || null; }
function getPieceAt(x, y) { return pieces.find(p => !p.captured && p.x === x && p.y === y) || null; }

const DIR_VECTORS = {
  ORTHOGONAL: [[1,0],[-1,0],[0,1],[0,-1]],
  DIAGONAL:   [[1,1],[1,-1],[-1,1],[-1,-1]],
  LSHAPE:     [[2,1],[2,-1],[-2,1],[-2,-1],[1,2],[1,-2],[-1,2],[-1,-2]]
};

// PLAYER advances toward y-1, OPPONENT toward y+1.
function getForwardDy(owner) {
  return owner === 'PLAYER' ? -1 : 1;
}

function getValidMoves(piece) {
  const type = PIECE_TYPES[piece.typeName];
  const moves = [];
  for (const rule of type.rules) {
    let dirs;
    if (rule.dir === "FORWARD") {
      dirs = [[0, getForwardDy(piece.owner)]];
    } else if (rule.dir === "FORWARD_DIAGONAL") {
      const dy = getForwardDy(piece.owner);
      dirs = [[-1, dy], [1, dy]];
    } else {
      dirs = DIR_VECTORS[rule.dir] || [];
    }
    if (rule.dir === "LSHAPE") {
      for (const [dx, dy] of dirs) {
        const nx = piece.x + dx, ny = piece.y + dy;
        const cell = getCell(nx, ny);
        if (!cell || !cell.active || cell.blocked) continue;
        const target = getPieceAt(nx, ny);
        if (target) {
          if (target.owner !== piece.owner && rule.moveType !== "MOVE_ONLY")
            moves.push({x: nx, y: ny, capture: true});
        } else if (rule.moveType !== "CAPTURE_ONLY") {
          moves.push({x: nx, y: ny, capture: false});
        }
      }
    } else {
      const maxSteps = (rule.dir === "FORWARD" || rule.dir === "FORWARD_DIAGONAL")
        ? 1
        : (rule.infinite ? (BOARD_WIDTH + BOARD_HEIGHT) : rule.maxDist);
      for (const [dx, dy] of dirs) {
        for (let d = 1; d <= maxSteps; d++) {
          const nx = piece.x + dx * d, ny = piece.y + dy * d;
          const cell = getCell(nx, ny);
          if (!cell || !cell.active) break;
          if (cell.blocked) { if (!rule.canJump) break; continue; }
          const target = getPieceAt(nx, ny);
          if (target) {
            if (target.owner !== piece.owner && rule.moveType !== "MOVE_ONLY")
              moves.push({x: nx, y: ny, capture: true});
            break;
          } else if (rule.moveType !== "CAPTURE_ONLY") {
            moves.push({x: nx, y: ny, capture: false});
          }
        }
      }
    }
  }
  return moves;
}

const hasOpponentPieces = pieces.some(p => p.owner === 'OPPONENT');

function playSound(name) {
  const audio = SOUNDS[name];
  if (!audio) return;
  audio.currentTime = 0;
  audio.play().catch(() => {});
}

let selected  = null;
let validMoves = [];

function handleClick(x, y) {
  const moveTarget = validMoves.find(m => m.x === x && m.y === y);
  if (moveTarget) {
    const victim = getPieceAt(x, y);
    if (victim) victim.captured = true;
    selected.x = x;
    selected.y = y;
    selected   = null;
    validMoves  = [];
    playSound(victim ? 'capture' : 'move');
    if (hasOpponentPieces && pieces.every(p => p.owner !== 'OPPONENT' || p.captured)) {
      render();
      playSound('win');
      document.getElementById('win-overlay').classList.add('show');
      return;
    }
    document.getElementById('status').textContent = 'Wähle eine Figur aus';
  } else {
    const piece = getPieceAt(x, y);
    if (piece && piece.owner === 'PLAYER') {
      selected   = piece;
      validMoves  = getValidMoves(piece);
      const n = validMoves.length;
      document.getElementById('status').textContent =
        PIECE_TYPES[piece.typeName].name + ' — ' + n + (n === 1 ? ' Zug' : ' Züge') + ' möglich';
    } else {
      selected   = null;
      validMoves  = [];
      document.getElementById('status').textContent = 'Wähle eine Figur aus';
    }
  }
  render();
}

function render() {
  const boardEl = document.getElementById('board');
  boardEl.innerHTML = '';
  for (let y = 0; y < BOARD_HEIGHT; y++) {
    for (let x = 0; x < BOARD_WIDTH; x++) {
      const cell = getCell(x, y);
      const div  = document.createElement('div');
      div.className = 'cell';

      if (!cell || !cell.active) {
        div.classList.add('inactive');
      } else if (cell.blocked) {
        div.classList.add('blocked');
      } else {
        div.classList.add((x + y) % 2 === 0 ? 'light' : 'dark');
        div.addEventListener('click', () => handleClick(x, y));
      }

      if (selected && selected.x === x && selected.y === y)
        div.classList.add('selected-cell');

      const move = validMoves.find(m => m.x === x && m.y === y);
      if (move) div.classList.add(move.capture ? 'hint-capture' : 'hint-move');

      const piece = (cell && !cell.blocked) ? getPieceAt(x, y) : null;
      if (piece) {
        const img = document.createElement('img');
        img.src       = PIECE_TYPES[piece.typeName].image;
        img.className = 'piece' + (piece.owner === 'PLAYER' ? ' own-piece' : '') + (selected === piece ? ' selected' : '');
        img.alt       = piece.typeName;
        div.appendChild(img);
      }
      boardEl.appendChild(div);
    }
  }
}
'''

    // ─── Image loading ───────────────────────────────────────────────────────

    def loadBase64(String iconFile) {
        loadBase64Asset("pieces", iconFile)
    }

    def loadBase64Asset(String folder, String file) {
        try {
            val stream = class.getResourceAsStream("/assets/" + folder + "/" + file)
            if (stream === null) return ""
            val bytes = stream.readAllBytes()
            stream.close()
            return Base64.getEncoder().encodeToString(bytes)
        } catch (Exception e) {
            return ""
        }
    }
}
