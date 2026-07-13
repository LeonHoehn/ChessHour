/**
 */
package chessHour;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Puzzle</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link chessHour.Puzzle#getBoard <em>Board</em>}</li>
 *   <li>{@link chessHour.Puzzle#getPieceTypes <em>Piece Types</em>}</li>
 *   <li>{@link chessHour.Puzzle#getPieces <em>Pieces</em>}</li>
 * </ul>
 *
 * @see chessHour.ChessHourPackage#getPuzzle()
 * @model
 * @generated
 */
public interface Puzzle extends EObject {
	/**
	 * Returns the value of the '<em><b>Board</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Board</em>' containment reference.
	 * @see #setBoard(Board)
	 * @see chessHour.ChessHourPackage#getPuzzle_Board()
	 * @model containment="true"
	 * @generated
	 */
	Board getBoard();

	/**
	 * Sets the value of the '{@link chessHour.Puzzle#getBoard <em>Board</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Board</em>' containment reference.
	 * @see #getBoard()
	 * @generated
	 */
	void setBoard(Board value);

	/**
	 * Returns the value of the '<em><b>Piece Types</b></em>' containment reference list.
	 * The list contents are of type {@link chessHour.PieceType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Piece Types</em>' containment reference list.
	 * @see chessHour.ChessHourPackage#getPuzzle_PieceTypes()
	 * @model containment="true"
	 * @generated
	 */
	EList<PieceType> getPieceTypes();

	/**
	 * Returns the value of the '<em><b>Pieces</b></em>' containment reference list.
	 * The list contents are of type {@link chessHour.PieceInstance}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pieces</em>' containment reference list.
	 * @see chessHour.ChessHourPackage#getPuzzle_Pieces()
	 * @model containment="true"
	 * @generated
	 */
	EList<PieceInstance> getPieces();

} // Puzzle
