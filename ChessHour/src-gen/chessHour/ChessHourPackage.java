/**
 */
package chessHour;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see chessHour.ChessHourFactory
 * @model kind="package"
 * @generated
 */
public interface ChessHourPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "chessHour";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.example.org/chessHour";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "chessHour";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ChessHourPackage eINSTANCE = chessHour.impl.ChessHourPackageImpl.init();

	/**
	 * The meta object id for the '{@link chessHour.impl.PuzzleImpl <em>Puzzle</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see chessHour.impl.PuzzleImpl
	 * @see chessHour.impl.ChessHourPackageImpl#getPuzzle()
	 * @generated
	 */
	int PUZZLE = 0;

	/**
	 * The feature id for the '<em><b>Board</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUZZLE__BOARD = 0;

	/**
	 * The feature id for the '<em><b>Piece Types</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUZZLE__PIECE_TYPES = 1;

	/**
	 * The feature id for the '<em><b>Pieces</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUZZLE__PIECES = 2;

	/**
	 * The number of structural features of the '<em>Puzzle</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUZZLE_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Puzzle</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUZZLE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link chessHour.impl.BoardImpl <em>Board</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see chessHour.impl.BoardImpl
	 * @see chessHour.impl.ChessHourPackageImpl#getBoard()
	 * @generated
	 */
	int BOARD = 1;

	/**
	 * The feature id for the '<em><b>Cells</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOARD__CELLS = 0;

	/**
	 * The feature id for the '<em><b>Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOARD__WIDTH = 1;

	/**
	 * The feature id for the '<em><b>Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOARD__HEIGHT = 2;

	/**
	 * The number of structural features of the '<em>Board</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOARD_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Board</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOARD_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link chessHour.impl.CellImpl <em>Cell</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see chessHour.impl.CellImpl
	 * @see chessHour.impl.ChessHourPackageImpl#getCell()
	 * @generated
	 */
	int CELL = 2;

	/**
	 * The feature id for the '<em><b>X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CELL__X = 0;

	/**
	 * The feature id for the '<em><b>Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CELL__Y = 1;

	/**
	 * The feature id for the '<em><b>Active</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CELL__ACTIVE = 2;

	/**
	 * The feature id for the '<em><b>Blocked</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CELL__BLOCKED = 3;

	/**
	 * The number of structural features of the '<em>Cell</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CELL_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Cell</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CELL_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link chessHour.impl.PieceTypeImpl <em>Piece Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see chessHour.impl.PieceTypeImpl
	 * @see chessHour.impl.ChessHourPackageImpl#getPieceType()
	 * @generated
	 */
	int PIECE_TYPE = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PIECE_TYPE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Icon File</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PIECE_TYPE__ICON_FILE = 1;

	/**
	 * The feature id for the '<em><b>Move Rules</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PIECE_TYPE__MOVE_RULES = 2;

	/**
	 * The number of structural features of the '<em>Piece Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PIECE_TYPE_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Piece Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PIECE_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link chessHour.impl.MoveRuleImpl <em>Move Rule</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see chessHour.impl.MoveRuleImpl
	 * @see chessHour.impl.ChessHourPackageImpl#getMoveRule()
	 * @generated
	 */
	int MOVE_RULE = 4;

	/**
	 * The feature id for the '<em><b>Direction</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOVE_RULE__DIRECTION = 0;

	/**
	 * The feature id for the '<em><b>Max Distance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOVE_RULE__MAX_DISTANCE = 1;

	/**
	 * The feature id for the '<em><b>Infinite</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOVE_RULE__INFINITE = 2;

	/**
	 * The feature id for the '<em><b>Move Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOVE_RULE__MOVE_TYPE = 3;

	/**
	 * The feature id for the '<em><b>Can Jump Over Blocked</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOVE_RULE__CAN_JUMP_OVER_BLOCKED = 4;

	/**
	 * The number of structural features of the '<em>Move Rule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOVE_RULE_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Move Rule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOVE_RULE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link chessHour.impl.PieceInstanceImpl <em>Piece Instance</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see chessHour.impl.PieceInstanceImpl
	 * @see chessHour.impl.ChessHourPackageImpl#getPieceInstance()
	 * @generated
	 */
	int PIECE_INSTANCE = 5;

	/**
	 * The feature id for the '<em><b>X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PIECE_INSTANCE__X = 0;

	/**
	 * The feature id for the '<em><b>Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PIECE_INSTANCE__Y = 1;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PIECE_INSTANCE__OWNER = 2;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PIECE_INSTANCE__TYPE = 3;

	/**
	 * The number of structural features of the '<em>Piece Instance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PIECE_INSTANCE_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Piece Instance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PIECE_INSTANCE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link chessHour.Direction <em>Direction</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see chessHour.Direction
	 * @see chessHour.impl.ChessHourPackageImpl#getDirection()
	 * @generated
	 */
	int DIRECTION = 6;

	/**
	 * The meta object id for the '{@link chessHour.MoveType <em>Move Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see chessHour.MoveType
	 * @see chessHour.impl.ChessHourPackageImpl#getMoveType()
	 * @generated
	 */
	int MOVE_TYPE = 7;

	/**
	 * The meta object id for the '{@link chessHour.Owner <em>Owner</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see chessHour.Owner
	 * @see chessHour.impl.ChessHourPackageImpl#getOwner()
	 * @generated
	 */
	int OWNER = 8;

	/**
	 * Returns the meta object for class '{@link chessHour.Puzzle <em>Puzzle</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Puzzle</em>'.
	 * @see chessHour.Puzzle
	 * @generated
	 */
	EClass getPuzzle();

	/**
	 * Returns the meta object for the containment reference '{@link chessHour.Puzzle#getBoard <em>Board</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Board</em>'.
	 * @see chessHour.Puzzle#getBoard()
	 * @see #getPuzzle()
	 * @generated
	 */
	EReference getPuzzle_Board();

	/**
	 * Returns the meta object for the containment reference list '{@link chessHour.Puzzle#getPieceTypes <em>Piece Types</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Piece Types</em>'.
	 * @see chessHour.Puzzle#getPieceTypes()
	 * @see #getPuzzle()
	 * @generated
	 */
	EReference getPuzzle_PieceTypes();

	/**
	 * Returns the meta object for the containment reference list '{@link chessHour.Puzzle#getPieces <em>Pieces</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Pieces</em>'.
	 * @see chessHour.Puzzle#getPieces()
	 * @see #getPuzzle()
	 * @generated
	 */
	EReference getPuzzle_Pieces();

	/**
	 * Returns the meta object for class '{@link chessHour.Board <em>Board</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Board</em>'.
	 * @see chessHour.Board
	 * @generated
	 */
	EClass getBoard();

	/**
	 * Returns the meta object for the containment reference list '{@link chessHour.Board#getCells <em>Cells</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Cells</em>'.
	 * @see chessHour.Board#getCells()
	 * @see #getBoard()
	 * @generated
	 */
	EReference getBoard_Cells();

	/**
	 * Returns the meta object for the attribute '{@link chessHour.Board#getWidth <em>Width</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Width</em>'.
	 * @see chessHour.Board#getWidth()
	 * @see #getBoard()
	 * @generated
	 */
	EAttribute getBoard_Width();

	/**
	 * Returns the meta object for the attribute '{@link chessHour.Board#getHeight <em>Height</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Height</em>'.
	 * @see chessHour.Board#getHeight()
	 * @see #getBoard()
	 * @generated
	 */
	EAttribute getBoard_Height();

	/**
	 * Returns the meta object for class '{@link chessHour.Cell <em>Cell</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Cell</em>'.
	 * @see chessHour.Cell
	 * @generated
	 */
	EClass getCell();

	/**
	 * Returns the meta object for the attribute '{@link chessHour.Cell#getX <em>X</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>X</em>'.
	 * @see chessHour.Cell#getX()
	 * @see #getCell()
	 * @generated
	 */
	EAttribute getCell_X();

	/**
	 * Returns the meta object for the attribute '{@link chessHour.Cell#getY <em>Y</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Y</em>'.
	 * @see chessHour.Cell#getY()
	 * @see #getCell()
	 * @generated
	 */
	EAttribute getCell_Y();

	/**
	 * Returns the meta object for the attribute '{@link chessHour.Cell#isActive <em>Active</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Active</em>'.
	 * @see chessHour.Cell#isActive()
	 * @see #getCell()
	 * @generated
	 */
	EAttribute getCell_Active();

	/**
	 * Returns the meta object for the attribute '{@link chessHour.Cell#isBlocked <em>Blocked</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Blocked</em>'.
	 * @see chessHour.Cell#isBlocked()
	 * @see #getCell()
	 * @generated
	 */
	EAttribute getCell_Blocked();

	/**
	 * Returns the meta object for class '{@link chessHour.PieceType <em>Piece Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Piece Type</em>'.
	 * @see chessHour.PieceType
	 * @generated
	 */
	EClass getPieceType();

	/**
	 * Returns the meta object for the attribute '{@link chessHour.PieceType#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see chessHour.PieceType#getName()
	 * @see #getPieceType()
	 * @generated
	 */
	EAttribute getPieceType_Name();

	/**
	 * Returns the meta object for the attribute '{@link chessHour.PieceType#getIconFile <em>Icon File</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Icon File</em>'.
	 * @see chessHour.PieceType#getIconFile()
	 * @see #getPieceType()
	 * @generated
	 */
	EAttribute getPieceType_IconFile();

	/**
	 * Returns the meta object for the containment reference list '{@link chessHour.PieceType#getMoveRules <em>Move Rules</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Move Rules</em>'.
	 * @see chessHour.PieceType#getMoveRules()
	 * @see #getPieceType()
	 * @generated
	 */
	EReference getPieceType_MoveRules();

	/**
	 * Returns the meta object for class '{@link chessHour.MoveRule <em>Move Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Move Rule</em>'.
	 * @see chessHour.MoveRule
	 * @generated
	 */
	EClass getMoveRule();

	/**
	 * Returns the meta object for the attribute '{@link chessHour.MoveRule#getDirection <em>Direction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Direction</em>'.
	 * @see chessHour.MoveRule#getDirection()
	 * @see #getMoveRule()
	 * @generated
	 */
	EAttribute getMoveRule_Direction();

	/**
	 * Returns the meta object for the attribute '{@link chessHour.MoveRule#getMaxDistance <em>Max Distance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Max Distance</em>'.
	 * @see chessHour.MoveRule#getMaxDistance()
	 * @see #getMoveRule()
	 * @generated
	 */
	EAttribute getMoveRule_MaxDistance();

	/**
	 * Returns the meta object for the attribute '{@link chessHour.MoveRule#isInfinite <em>Infinite</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Infinite</em>'.
	 * @see chessHour.MoveRule#isInfinite()
	 * @see #getMoveRule()
	 * @generated
	 */
	EAttribute getMoveRule_Infinite();

	/**
	 * Returns the meta object for the attribute '{@link chessHour.MoveRule#getMoveType <em>Move Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Move Type</em>'.
	 * @see chessHour.MoveRule#getMoveType()
	 * @see #getMoveRule()
	 * @generated
	 */
	EAttribute getMoveRule_MoveType();

	/**
	 * Returns the meta object for the attribute '{@link chessHour.MoveRule#isCanJumpOverBlocked <em>Can Jump Over Blocked</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Can Jump Over Blocked</em>'.
	 * @see chessHour.MoveRule#isCanJumpOverBlocked()
	 * @see #getMoveRule()
	 * @generated
	 */
	EAttribute getMoveRule_CanJumpOverBlocked();

	/**
	 * Returns the meta object for class '{@link chessHour.PieceInstance <em>Piece Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Piece Instance</em>'.
	 * @see chessHour.PieceInstance
	 * @generated
	 */
	EClass getPieceInstance();

	/**
	 * Returns the meta object for the attribute '{@link chessHour.PieceInstance#getX <em>X</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>X</em>'.
	 * @see chessHour.PieceInstance#getX()
	 * @see #getPieceInstance()
	 * @generated
	 */
	EAttribute getPieceInstance_X();

	/**
	 * Returns the meta object for the attribute '{@link chessHour.PieceInstance#getY <em>Y</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Y</em>'.
	 * @see chessHour.PieceInstance#getY()
	 * @see #getPieceInstance()
	 * @generated
	 */
	EAttribute getPieceInstance_Y();

	/**
	 * Returns the meta object for the attribute '{@link chessHour.PieceInstance#getOwner <em>Owner</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Owner</em>'.
	 * @see chessHour.PieceInstance#getOwner()
	 * @see #getPieceInstance()
	 * @generated
	 */
	EAttribute getPieceInstance_Owner();

	/**
	 * Returns the meta object for the reference '{@link chessHour.PieceInstance#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Type</em>'.
	 * @see chessHour.PieceInstance#getType()
	 * @see #getPieceInstance()
	 * @generated
	 */
	EReference getPieceInstance_Type();

	/**
	 * Returns the meta object for enum '{@link chessHour.Direction <em>Direction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Direction</em>'.
	 * @see chessHour.Direction
	 * @generated
	 */
	EEnum getDirection();

	/**
	 * Returns the meta object for enum '{@link chessHour.MoveType <em>Move Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Move Type</em>'.
	 * @see chessHour.MoveType
	 * @generated
	 */
	EEnum getMoveType();

	/**
	 * Returns the meta object for enum '{@link chessHour.Owner <em>Owner</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Owner</em>'.
	 * @see chessHour.Owner
	 * @generated
	 */
	EEnum getOwner();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ChessHourFactory getChessHourFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link chessHour.impl.PuzzleImpl <em>Puzzle</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see chessHour.impl.PuzzleImpl
		 * @see chessHour.impl.ChessHourPackageImpl#getPuzzle()
		 * @generated
		 */
		EClass PUZZLE = eINSTANCE.getPuzzle();

		/**
		 * The meta object literal for the '<em><b>Board</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PUZZLE__BOARD = eINSTANCE.getPuzzle_Board();

		/**
		 * The meta object literal for the '<em><b>Piece Types</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PUZZLE__PIECE_TYPES = eINSTANCE.getPuzzle_PieceTypes();

		/**
		 * The meta object literal for the '<em><b>Pieces</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PUZZLE__PIECES = eINSTANCE.getPuzzle_Pieces();

		/**
		 * The meta object literal for the '{@link chessHour.impl.BoardImpl <em>Board</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see chessHour.impl.BoardImpl
		 * @see chessHour.impl.ChessHourPackageImpl#getBoard()
		 * @generated
		 */
		EClass BOARD = eINSTANCE.getBoard();

		/**
		 * The meta object literal for the '<em><b>Cells</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BOARD__CELLS = eINSTANCE.getBoard_Cells();

		/**
		 * The meta object literal for the '<em><b>Width</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BOARD__WIDTH = eINSTANCE.getBoard_Width();

		/**
		 * The meta object literal for the '<em><b>Height</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BOARD__HEIGHT = eINSTANCE.getBoard_Height();

		/**
		 * The meta object literal for the '{@link chessHour.impl.CellImpl <em>Cell</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see chessHour.impl.CellImpl
		 * @see chessHour.impl.ChessHourPackageImpl#getCell()
		 * @generated
		 */
		EClass CELL = eINSTANCE.getCell();

		/**
		 * The meta object literal for the '<em><b>X</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CELL__X = eINSTANCE.getCell_X();

		/**
		 * The meta object literal for the '<em><b>Y</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CELL__Y = eINSTANCE.getCell_Y();

		/**
		 * The meta object literal for the '<em><b>Active</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CELL__ACTIVE = eINSTANCE.getCell_Active();

		/**
		 * The meta object literal for the '<em><b>Blocked</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CELL__BLOCKED = eINSTANCE.getCell_Blocked();

		/**
		 * The meta object literal for the '{@link chessHour.impl.PieceTypeImpl <em>Piece Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see chessHour.impl.PieceTypeImpl
		 * @see chessHour.impl.ChessHourPackageImpl#getPieceType()
		 * @generated
		 */
		EClass PIECE_TYPE = eINSTANCE.getPieceType();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PIECE_TYPE__NAME = eINSTANCE.getPieceType_Name();

		/**
		 * The meta object literal for the '<em><b>Icon File</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PIECE_TYPE__ICON_FILE = eINSTANCE.getPieceType_IconFile();

		/**
		 * The meta object literal for the '<em><b>Move Rules</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PIECE_TYPE__MOVE_RULES = eINSTANCE.getPieceType_MoveRules();

		/**
		 * The meta object literal for the '{@link chessHour.impl.MoveRuleImpl <em>Move Rule</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see chessHour.impl.MoveRuleImpl
		 * @see chessHour.impl.ChessHourPackageImpl#getMoveRule()
		 * @generated
		 */
		EClass MOVE_RULE = eINSTANCE.getMoveRule();

		/**
		 * The meta object literal for the '<em><b>Direction</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MOVE_RULE__DIRECTION = eINSTANCE.getMoveRule_Direction();

		/**
		 * The meta object literal for the '<em><b>Max Distance</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MOVE_RULE__MAX_DISTANCE = eINSTANCE.getMoveRule_MaxDistance();

		/**
		 * The meta object literal for the '<em><b>Infinite</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MOVE_RULE__INFINITE = eINSTANCE.getMoveRule_Infinite();

		/**
		 * The meta object literal for the '<em><b>Move Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MOVE_RULE__MOVE_TYPE = eINSTANCE.getMoveRule_MoveType();

		/**
		 * The meta object literal for the '<em><b>Can Jump Over Blocked</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MOVE_RULE__CAN_JUMP_OVER_BLOCKED = eINSTANCE.getMoveRule_CanJumpOverBlocked();

		/**
		 * The meta object literal for the '{@link chessHour.impl.PieceInstanceImpl <em>Piece Instance</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see chessHour.impl.PieceInstanceImpl
		 * @see chessHour.impl.ChessHourPackageImpl#getPieceInstance()
		 * @generated
		 */
		EClass PIECE_INSTANCE = eINSTANCE.getPieceInstance();

		/**
		 * The meta object literal for the '<em><b>X</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PIECE_INSTANCE__X = eINSTANCE.getPieceInstance_X();

		/**
		 * The meta object literal for the '<em><b>Y</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PIECE_INSTANCE__Y = eINSTANCE.getPieceInstance_Y();

		/**
		 * The meta object literal for the '<em><b>Owner</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PIECE_INSTANCE__OWNER = eINSTANCE.getPieceInstance_Owner();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PIECE_INSTANCE__TYPE = eINSTANCE.getPieceInstance_Type();

		/**
		 * The meta object literal for the '{@link chessHour.Direction <em>Direction</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see chessHour.Direction
		 * @see chessHour.impl.ChessHourPackageImpl#getDirection()
		 * @generated
		 */
		EEnum DIRECTION = eINSTANCE.getDirection();

		/**
		 * The meta object literal for the '{@link chessHour.MoveType <em>Move Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see chessHour.MoveType
		 * @see chessHour.impl.ChessHourPackageImpl#getMoveType()
		 * @generated
		 */
		EEnum MOVE_TYPE = eINSTANCE.getMoveType();

		/**
		 * The meta object literal for the '{@link chessHour.Owner <em>Owner</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see chessHour.Owner
		 * @see chessHour.impl.ChessHourPackageImpl#getOwner()
		 * @generated
		 */
		EEnum OWNER = eINSTANCE.getOwner();

	}

} //ChessHourPackage
