/**
 */
package chessHour.impl;

import chessHour.ChessHourPackage;
import chessHour.MoveRule;
import chessHour.PieceType;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Piece Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link chessHour.impl.PieceTypeImpl#getName <em>Name</em>}</li>
 *   <li>{@link chessHour.impl.PieceTypeImpl#getIconFile <em>Icon File</em>}</li>
 *   <li>{@link chessHour.impl.PieceTypeImpl#getMoveRules <em>Move Rules</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PieceTypeImpl extends MinimalEObjectImpl.Container implements PieceType {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getIconFile() <em>Icon File</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIconFile()
	 * @generated
	 * @ordered
	 */
	protected static final String ICON_FILE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getIconFile() <em>Icon File</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIconFile()
	 * @generated
	 * @ordered
	 */
	protected String iconFile = ICON_FILE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getMoveRules() <em>Move Rules</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMoveRules()
	 * @generated
	 * @ordered
	 */
	protected EList<MoveRule> moveRules;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PieceTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ChessHourPackage.Literals.PIECE_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ChessHourPackage.PIECE_TYPE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getIconFile() {
		return iconFile;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIconFile(String newIconFile) {
		String oldIconFile = iconFile;
		iconFile = newIconFile;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ChessHourPackage.PIECE_TYPE__ICON_FILE, oldIconFile,
					iconFile));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<MoveRule> getMoveRules() {
		if (moveRules == null) {
			moveRules = new EObjectContainmentEList<MoveRule>(MoveRule.class, this,
					ChessHourPackage.PIECE_TYPE__MOVE_RULES);
		}
		return moveRules;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case ChessHourPackage.PIECE_TYPE__MOVE_RULES:
			return ((InternalEList<?>) getMoveRules()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case ChessHourPackage.PIECE_TYPE__NAME:
			return getName();
		case ChessHourPackage.PIECE_TYPE__ICON_FILE:
			return getIconFile();
		case ChessHourPackage.PIECE_TYPE__MOVE_RULES:
			return getMoveRules();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case ChessHourPackage.PIECE_TYPE__NAME:
			setName((String) newValue);
			return;
		case ChessHourPackage.PIECE_TYPE__ICON_FILE:
			setIconFile((String) newValue);
			return;
		case ChessHourPackage.PIECE_TYPE__MOVE_RULES:
			getMoveRules().clear();
			getMoveRules().addAll((Collection<? extends MoveRule>) newValue);
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
		case ChessHourPackage.PIECE_TYPE__NAME:
			setName(NAME_EDEFAULT);
			return;
		case ChessHourPackage.PIECE_TYPE__ICON_FILE:
			setIconFile(ICON_FILE_EDEFAULT);
			return;
		case ChessHourPackage.PIECE_TYPE__MOVE_RULES:
			getMoveRules().clear();
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
		case ChessHourPackage.PIECE_TYPE__NAME:
			return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
		case ChessHourPackage.PIECE_TYPE__ICON_FILE:
			return ICON_FILE_EDEFAULT == null ? iconFile != null : !ICON_FILE_EDEFAULT.equals(iconFile);
		case ChessHourPackage.PIECE_TYPE__MOVE_RULES:
			return moveRules != null && !moveRules.isEmpty();
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
		result.append(" (name: ");
		result.append(name);
		result.append(", iconFile: ");
		result.append(iconFile);
		result.append(')');
		return result.toString();
	}

} //PieceTypeImpl
