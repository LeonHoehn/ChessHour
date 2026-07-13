/**
 */
package chessHour;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Piece Instance</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link chessHour.PieceInstance#getX <em>X</em>}</li>
 *   <li>{@link chessHour.PieceInstance#getY <em>Y</em>}</li>
 *   <li>{@link chessHour.PieceInstance#getOwner <em>Owner</em>}</li>
 *   <li>{@link chessHour.PieceInstance#getType <em>Type</em>}</li>
 * </ul>
 *
 * @see chessHour.ChessHourPackage#getPieceInstance()
 * @model
 * @generated
 */
public interface PieceInstance extends EObject {
	/**
	 * Returns the value of the '<em><b>X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>X</em>' attribute.
	 * @see #setX(int)
	 * @see chessHour.ChessHourPackage#getPieceInstance_X()
	 * @model
	 * @generated
	 */
	int getX();

	/**
	 * Sets the value of the '{@link chessHour.PieceInstance#getX <em>X</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>X</em>' attribute.
	 * @see #getX()
	 * @generated
	 */
	void setX(int value);

	/**
	 * Returns the value of the '<em><b>Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Y</em>' attribute.
	 * @see #setY(int)
	 * @see chessHour.ChessHourPackage#getPieceInstance_Y()
	 * @model
	 * @generated
	 */
	int getY();

	/**
	 * Sets the value of the '{@link chessHour.PieceInstance#getY <em>Y</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Y</em>' attribute.
	 * @see #getY()
	 * @generated
	 */
	void setY(int value);

	/**
	 * Returns the value of the '<em><b>Owner</b></em>' attribute.
	 * The literals are from the enumeration {@link chessHour.Owner}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owner</em>' attribute.
	 * @see chessHour.Owner
	 * @see #setOwner(Owner)
	 * @see chessHour.ChessHourPackage#getPieceInstance_Owner()
	 * @model
	 * @generated
	 */
	Owner getOwner();

	/**
	 * Sets the value of the '{@link chessHour.PieceInstance#getOwner <em>Owner</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Owner</em>' attribute.
	 * @see chessHour.Owner
	 * @see #getOwner()
	 * @generated
	 */
	void setOwner(Owner value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' reference.
	 * @see #setType(PieceType)
	 * @see chessHour.ChessHourPackage#getPieceInstance_Type()
	 * @model required="true"
	 * @generated
	 */
	PieceType getType();

	/**
	 * Sets the value of the '{@link chessHour.PieceInstance#getType <em>Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' reference.
	 * @see #getType()
	 * @generated
	 */
	void setType(PieceType value);

} // PieceInstance
