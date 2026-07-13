/**
 */
package chessHour.impl;

import chessHour.Board;
import chessHour.ChessHourPackage;
import chessHour.PieceInstance;
import chessHour.PieceType;
import chessHour.Puzzle;

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
 * An implementation of the model object '<em><b>Puzzle</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link chessHour.impl.PuzzleImpl#getBoard <em>Board</em>}</li>
 *   <li>{@link chessHour.impl.PuzzleImpl#getPieceTypes <em>Piece Types</em>}</li>
 *   <li>{@link chessHour.impl.PuzzleImpl#getPieces <em>Pieces</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PuzzleImpl extends MinimalEObjectImpl.Container implements Puzzle {
	/**
	 * The cached value of the '{@link #getBoard() <em>Board</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBoard()
	 * @generated
	 * @ordered
	 */
	protected Board board;

	/**
	 * The cached value of the '{@link #getPieceTypes() <em>Piece Types</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPieceTypes()
	 * @generated
	 * @ordered
	 */
	protected EList<PieceType> pieceTypes;

	/**
	 * The cached value of the '{@link #getPieces() <em>Pieces</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPieces()
	 * @generated
	 * @ordered
	 */
	protected EList<PieceInstance> pieces;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PuzzleImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ChessHourPackage.Literals.PUZZLE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Board getBoard() {
		return board;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBoard(Board newBoard, NotificationChain msgs) {
		Board oldBoard = board;
		board = newBoard;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					ChessHourPackage.PUZZLE__BOARD, oldBoard, newBoard);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setBoard(Board newBoard) {
		if (newBoard != board) {
			NotificationChain msgs = null;
			if (board != null)
				msgs = ((InternalEObject) board).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - ChessHourPackage.PUZZLE__BOARD, null, msgs);
			if (newBoard != null)
				msgs = ((InternalEObject) newBoard).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - ChessHourPackage.PUZZLE__BOARD, null, msgs);
			msgs = basicSetBoard(newBoard, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ChessHourPackage.PUZZLE__BOARD, newBoard, newBoard));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<PieceType> getPieceTypes() {
		if (pieceTypes == null) {
			pieceTypes = new EObjectContainmentEList<PieceType>(PieceType.class, this,
					ChessHourPackage.PUZZLE__PIECE_TYPES);
		}
		return pieceTypes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<PieceInstance> getPieces() {
		if (pieces == null) {
			pieces = new EObjectContainmentEList<PieceInstance>(PieceInstance.class, this,
					ChessHourPackage.PUZZLE__PIECES);
		}
		return pieces;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case ChessHourPackage.PUZZLE__BOARD:
			return basicSetBoard(null, msgs);
		case ChessHourPackage.PUZZLE__PIECE_TYPES:
			return ((InternalEList<?>) getPieceTypes()).basicRemove(otherEnd, msgs);
		case ChessHourPackage.PUZZLE__PIECES:
			return ((InternalEList<?>) getPieces()).basicRemove(otherEnd, msgs);
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
		case ChessHourPackage.PUZZLE__BOARD:
			return getBoard();
		case ChessHourPackage.PUZZLE__PIECE_TYPES:
			return getPieceTypes();
		case ChessHourPackage.PUZZLE__PIECES:
			return getPieces();
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
		case ChessHourPackage.PUZZLE__BOARD:
			setBoard((Board) newValue);
			return;
		case ChessHourPackage.PUZZLE__PIECE_TYPES:
			getPieceTypes().clear();
			getPieceTypes().addAll((Collection<? extends PieceType>) newValue);
			return;
		case ChessHourPackage.PUZZLE__PIECES:
			getPieces().clear();
			getPieces().addAll((Collection<? extends PieceInstance>) newValue);
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
		case ChessHourPackage.PUZZLE__BOARD:
			setBoard((Board) null);
			return;
		case ChessHourPackage.PUZZLE__PIECE_TYPES:
			getPieceTypes().clear();
			return;
		case ChessHourPackage.PUZZLE__PIECES:
			getPieces().clear();
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
		case ChessHourPackage.PUZZLE__BOARD:
			return board != null;
		case ChessHourPackage.PUZZLE__PIECE_TYPES:
			return pieceTypes != null && !pieceTypes.isEmpty();
		case ChessHourPackage.PUZZLE__PIECES:
			return pieces != null && !pieces.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //PuzzleImpl
