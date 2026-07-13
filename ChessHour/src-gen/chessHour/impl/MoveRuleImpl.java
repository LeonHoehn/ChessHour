/**
 */
package chessHour.impl;

import chessHour.ChessHourPackage;
import chessHour.Direction;
import chessHour.MoveRule;
import chessHour.MoveType;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Move Rule</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link chessHour.impl.MoveRuleImpl#getDirection <em>Direction</em>}</li>
 *   <li>{@link chessHour.impl.MoveRuleImpl#getMaxDistance <em>Max Distance</em>}</li>
 *   <li>{@link chessHour.impl.MoveRuleImpl#isInfinite <em>Infinite</em>}</li>
 *   <li>{@link chessHour.impl.MoveRuleImpl#getMoveType <em>Move Type</em>}</li>
 *   <li>{@link chessHour.impl.MoveRuleImpl#isCanJumpOverBlocked <em>Can Jump Over Blocked</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MoveRuleImpl extends MinimalEObjectImpl.Container implements MoveRule {
	/**
	 * The default value of the '{@link #getDirection() <em>Direction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDirection()
	 * @generated
	 * @ordered
	 */
	protected static final Direction DIRECTION_EDEFAULT = Direction.ORTHOGONAL;

	/**
	 * The cached value of the '{@link #getDirection() <em>Direction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDirection()
	 * @generated
	 * @ordered
	 */
	protected Direction direction = DIRECTION_EDEFAULT;

	/**
	 * The default value of the '{@link #getMaxDistance() <em>Max Distance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxDistance()
	 * @generated
	 * @ordered
	 */
	protected static final int MAX_DISTANCE_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getMaxDistance() <em>Max Distance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxDistance()
	 * @generated
	 * @ordered
	 */
	protected int maxDistance = MAX_DISTANCE_EDEFAULT;

	/**
	 * The default value of the '{@link #isInfinite() <em>Infinite</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isInfinite()
	 * @generated
	 * @ordered
	 */
	protected static final boolean INFINITE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isInfinite() <em>Infinite</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isInfinite()
	 * @generated
	 * @ordered
	 */
	protected boolean infinite = INFINITE_EDEFAULT;

	/**
	 * The default value of the '{@link #getMoveType() <em>Move Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMoveType()
	 * @generated
	 * @ordered
	 */
	protected static final MoveType MOVE_TYPE_EDEFAULT = MoveType.MOVE_ONLY;

	/**
	 * The cached value of the '{@link #getMoveType() <em>Move Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMoveType()
	 * @generated
	 * @ordered
	 */
	protected MoveType moveType = MOVE_TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #isCanJumpOverBlocked() <em>Can Jump Over Blocked</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isCanJumpOverBlocked()
	 * @generated
	 * @ordered
	 */
	protected static final boolean CAN_JUMP_OVER_BLOCKED_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isCanJumpOverBlocked() <em>Can Jump Over Blocked</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isCanJumpOverBlocked()
	 * @generated
	 * @ordered
	 */
	protected boolean canJumpOverBlocked = CAN_JUMP_OVER_BLOCKED_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MoveRuleImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ChessHourPackage.Literals.MOVE_RULE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Direction getDirection() {
		return direction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDirection(Direction newDirection) {
		Direction oldDirection = direction;
		direction = newDirection == null ? DIRECTION_EDEFAULT : newDirection;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ChessHourPackage.MOVE_RULE__DIRECTION, oldDirection,
					direction));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getMaxDistance() {
		return maxDistance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMaxDistance(int newMaxDistance) {
		int oldMaxDistance = maxDistance;
		maxDistance = newMaxDistance;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ChessHourPackage.MOVE_RULE__MAX_DISTANCE,
					oldMaxDistance, maxDistance));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isInfinite() {
		return infinite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setInfinite(boolean newInfinite) {
		boolean oldInfinite = infinite;
		infinite = newInfinite;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ChessHourPackage.MOVE_RULE__INFINITE, oldInfinite,
					infinite));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MoveType getMoveType() {
		return moveType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMoveType(MoveType newMoveType) {
		MoveType oldMoveType = moveType;
		moveType = newMoveType == null ? MOVE_TYPE_EDEFAULT : newMoveType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ChessHourPackage.MOVE_RULE__MOVE_TYPE, oldMoveType,
					moveType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isCanJumpOverBlocked() {
		return canJumpOverBlocked;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCanJumpOverBlocked(boolean newCanJumpOverBlocked) {
		boolean oldCanJumpOverBlocked = canJumpOverBlocked;
		canJumpOverBlocked = newCanJumpOverBlocked;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ChessHourPackage.MOVE_RULE__CAN_JUMP_OVER_BLOCKED,
					oldCanJumpOverBlocked, canJumpOverBlocked));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case ChessHourPackage.MOVE_RULE__DIRECTION:
			return getDirection();
		case ChessHourPackage.MOVE_RULE__MAX_DISTANCE:
			return getMaxDistance();
		case ChessHourPackage.MOVE_RULE__INFINITE:
			return isInfinite();
		case ChessHourPackage.MOVE_RULE__MOVE_TYPE:
			return getMoveType();
		case ChessHourPackage.MOVE_RULE__CAN_JUMP_OVER_BLOCKED:
			return isCanJumpOverBlocked();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case ChessHourPackage.MOVE_RULE__DIRECTION:
			setDirection((Direction) newValue);
			return;
		case ChessHourPackage.MOVE_RULE__MAX_DISTANCE:
			setMaxDistance((Integer) newValue);
			return;
		case ChessHourPackage.MOVE_RULE__INFINITE:
			setInfinite((Boolean) newValue);
			return;
		case ChessHourPackage.MOVE_RULE__MOVE_TYPE:
			setMoveType((MoveType) newValue);
			return;
		case ChessHourPackage.MOVE_RULE__CAN_JUMP_OVER_BLOCKED:
			setCanJumpOverBlocked((Boolean) newValue);
			return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
		case ChessHourPackage.MOVE_RULE__DIRECTION:
			setDirection(DIRECTION_EDEFAULT);
			return;
		case ChessHourPackage.MOVE_RULE__MAX_DISTANCE:
			setMaxDistance(MAX_DISTANCE_EDEFAULT);
			return;
		case ChessHourPackage.MOVE_RULE__INFINITE:
			setInfinite(INFINITE_EDEFAULT);
			return;
		case ChessHourPackage.MOVE_RULE__MOVE_TYPE:
			setMoveType(MOVE_TYPE_EDEFAULT);
			return;
		case ChessHourPackage.MOVE_RULE__CAN_JUMP_OVER_BLOCKED:
			setCanJumpOverBlocked(CAN_JUMP_OVER_BLOCKED_EDEFAULT);
			return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
		case ChessHourPackage.MOVE_RULE__DIRECTION:
			return direction != DIRECTION_EDEFAULT;
		case ChessHourPackage.MOVE_RULE__MAX_DISTANCE:
			return maxDistance != MAX_DISTANCE_EDEFAULT;
		case ChessHourPackage.MOVE_RULE__INFINITE:
			return infinite != INFINITE_EDEFAULT;
		case ChessHourPackage.MOVE_RULE__MOVE_TYPE:
			return moveType != MOVE_TYPE_EDEFAULT;
		case ChessHourPackage.MOVE_RULE__CAN_JUMP_OVER_BLOCKED:
			return canJumpOverBlocked != CAN_JUMP_OVER_BLOCKED_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy())
			return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (direction: ");
		result.append(direction);
		result.append(", maxDistance: ");
		result.append(maxDistance);
		result.append(", infinite: ");
		result.append(infinite);
		result.append(", moveType: ");
		result.append(moveType);
		result.append(", canJumpOverBlocked: ");
		result.append(canJumpOverBlocked);
		result.append(')');
		return result.toString();
	}

} //MoveRuleImpl
