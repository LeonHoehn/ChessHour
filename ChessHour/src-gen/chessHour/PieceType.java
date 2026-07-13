/**
 */
package chessHour;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Piece Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link chessHour.PieceType#getName <em>Name</em>}</li>
 *   <li>{@link chessHour.PieceType#getIconFile <em>Icon File</em>}</li>
 *   <li>{@link chessHour.PieceType#getMoveRules <em>Move Rules</em>}</li>
 * </ul>
 *
 * @see chessHour.ChessHourPackage#getPieceType()
 * @model
 * @generated
 */
public interface PieceType extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see chessHour.ChessHourPackage#getPieceType_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link chessHour.PieceType#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Icon File</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Icon File</em>' attribute.
	 * @see #setIconFile(String)
	 * @see chessHour.ChessHourPackage#getPieceType_IconFile()
	 * @model
	 * @generated
	 */
	String getIconFile();

	/**
	 * Sets the value of the '{@link chessHour.PieceType#getIconFile <em>Icon File</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Icon File</em>' attribute.
	 * @see #getIconFile()
	 * @generated
	 */
	void setIconFile(String value);

	/**
	 * Returns the value of the '<em><b>Move Rules</b></em>' containment reference list.
	 * The list contents are of type {@link chessHour.MoveRule}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Move Rules</em>' containment reference list.
	 * @see chessHour.ChessHourPackage#getPieceType_MoveRules()
	 * @model containment="true"
	 * @generated
	 */
	EList<MoveRule> getMoveRules();

} // PieceType
