/**
 */
package chessHour;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Move Rule</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link chessHour.MoveRule#getDirection <em>Direction</em>}</li>
 *   <li>{@link chessHour.MoveRule#getMaxDistance <em>Max Distance</em>}</li>
 *   <li>{@link chessHour.MoveRule#isInfinite <em>Infinite</em>}</li>
 *   <li>{@link chessHour.MoveRule#getMoveType <em>Move Type</em>}</li>
 *   <li>{@link chessHour.MoveRule#isCanJumpOverBlocked <em>Can Jump Over Blocked</em>}</li>
 * </ul>
 *
 * @see chessHour.ChessHourPackage#getMoveRule()
 * @model
 * @generated
 */
public interface MoveRule extends EObject {
	/**
	 * Returns the value of the '<em><b>Direction</b></em>' attribute.
	 * The literals are from the enumeration {@link chessHour.Direction}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Direction</em>' attribute.
	 * @see chessHour.Direction
	 * @see #setDirection(Direction)
	 * @see chessHour.ChessHourPackage#getMoveRule_Direction()
	 * @model
	 * @generated
	 */
	Direction getDirection();

	/**
	 * Sets the value of the '{@link chessHour.MoveRule#getDirection <em>Direction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Direction</em>' attribute.
	 * @see chessHour.Direction
	 * @see #getDirection()
	 * @generated
	 */
	void setDirection(Direction value);

	/**
	 * Returns the value of the '<em><b>Max Distance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Max Distance</em>' attribute.
	 * @see #setMaxDistance(int)
	 * @see chessHour.ChessHourPackage#getMoveRule_MaxDistance()
	 * @model
	 * @generated
	 */
	int getMaxDistance();

	/**
	 * Sets the value of the '{@link chessHour.MoveRule#getMaxDistance <em>Max Distance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max Distance</em>' attribute.
	 * @see #getMaxDistance()
	 * @generated
	 */
	void setMaxDistance(int value);

	/**
	 * Returns the value of the '<em><b>Infinite</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Infinite</em>' attribute.
	 * @see #setInfinite(boolean)
	 * @see chessHour.ChessHourPackage#getMoveRule_Infinite()
	 * @model
	 * @generated
	 */
	boolean isInfinite();

	/**
	 * Sets the value of the '{@link chessHour.MoveRule#isInfinite <em>Infinite</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Infinite</em>' attribute.
	 * @see #isInfinite()
	 * @generated
	 */
	void setInfinite(boolean value);

	/**
	 * Returns the value of the '<em><b>Move Type</b></em>' attribute.
	 * The literals are from the enumeration {@link chessHour.MoveType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Move Type</em>' attribute.
	 * @see chessHour.MoveType
	 * @see #setMoveType(MoveType)
	 * @see chessHour.ChessHourPackage#getMoveRule_MoveType()
	 * @model
	 * @generated
	 */
	MoveType getMoveType();

	/**
	 * Sets the value of the '{@link chessHour.MoveRule#getMoveType <em>Move Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Move Type</em>' attribute.
	 * @see chessHour.MoveType
	 * @see #getMoveType()
	 * @generated
	 */
	void setMoveType(MoveType value);

	/**
	 * Returns the value of the '<em><b>Can Jump Over Blocked</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Can Jump Over Blocked</em>' attribute.
	 * @see #setCanJumpOverBlocked(boolean)
	 * @see chessHour.ChessHourPackage#getMoveRule_CanJumpOverBlocked()
	 * @model
	 * @generated
	 */
	boolean isCanJumpOverBlocked();

	/**
	 * Sets the value of the '{@link chessHour.MoveRule#isCanJumpOverBlocked <em>Can Jump Over Blocked</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Can Jump Over Blocked</em>' attribute.
	 * @see #isCanJumpOverBlocked()
	 * @generated
	 */
	void setCanJumpOverBlocked(boolean value);

} // MoveRule
