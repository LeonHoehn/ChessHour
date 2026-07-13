/**
 */
package chessHour.impl;

import chessHour.Board;
import chessHour.Cell;
import chessHour.ChessHourFactory;
import chessHour.ChessHourPackage;
import chessHour.Direction;
import chessHour.MoveRule;
import chessHour.MoveType;
import chessHour.Owner;
import chessHour.PieceInstance;
import chessHour.PieceType;
import chessHour.Puzzle;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ChessHourPackageImpl extends EPackageImpl implements ChessHourPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass puzzleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass boardEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass cellEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pieceTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass moveRuleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pieceInstanceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum directionEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum moveTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum ownerEEnum = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see chessHour.ChessHourPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private ChessHourPackageImpl() {
		super(eNS_URI, ChessHourFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 *
	 * <p>This method is used to initialize {@link ChessHourPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static ChessHourPackage init() {
		if (isInited)
			return (ChessHourPackage) EPackage.Registry.INSTANCE.getEPackage(ChessHourPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredChessHourPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		ChessHourPackageImpl theChessHourPackage = registeredChessHourPackage instanceof ChessHourPackageImpl
				? (ChessHourPackageImpl) registeredChessHourPackage
				: new ChessHourPackageImpl();

		isInited = true;

		// Create package meta-data objects
		theChessHourPackage.createPackageContents();

		// Initialize created meta-data
		theChessHourPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theChessHourPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(ChessHourPackage.eNS_URI, theChessHourPackage);
		return theChessHourPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPuzzle() {
		return puzzleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPuzzle_Board() {
		return (EReference) puzzleEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPuzzle_PieceTypes() {
		return (EReference) puzzleEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPuzzle_Pieces() {
		return (EReference) puzzleEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getBoard() {
		return boardEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getBoard_Cells() {
		return (EReference) boardEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getBoard_Width() {
		return (EAttribute) boardEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getBoard_Height() {
		return (EAttribute) boardEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCell() {
		return cellEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCell_X() {
		return (EAttribute) cellEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCell_Y() {
		return (EAttribute) cellEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCell_Active() {
		return (EAttribute) cellEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCell_Blocked() {
		return (EAttribute) cellEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPieceType() {
		return pieceTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPieceType_Name() {
		return (EAttribute) pieceTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPieceType_IconFile() {
		return (EAttribute) pieceTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPieceType_MoveRules() {
		return (EReference) pieceTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getMoveRule() {
		return moveRuleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMoveRule_Direction() {
		return (EAttribute) moveRuleEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMoveRule_MaxDistance() {
		return (EAttribute) moveRuleEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMoveRule_Infinite() {
		return (EAttribute) moveRuleEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMoveRule_MoveType() {
		return (EAttribute) moveRuleEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMoveRule_CanJumpOverBlocked() {
		return (EAttribute) moveRuleEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPieceInstance() {
		return pieceInstanceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPieceInstance_X() {
		return (EAttribute) pieceInstanceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPieceInstance_Y() {
		return (EAttribute) pieceInstanceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPieceInstance_Owner() {
		return (EAttribute) pieceInstanceEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPieceInstance_Type() {
		return (EReference) pieceInstanceEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getDirection() {
		return directionEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getMoveType() {
		return moveTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getOwner() {
		return ownerEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ChessHourFactory getChessHourFactory() {
		return (ChessHourFactory) getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated)
			return;
		isCreated = true;

		// Create classes and their features
		puzzleEClass = createEClass(PUZZLE);
		createEReference(puzzleEClass, PUZZLE__BOARD);
		createEReference(puzzleEClass, PUZZLE__PIECE_TYPES);
		createEReference(puzzleEClass, PUZZLE__PIECES);

		boardEClass = createEClass(BOARD);
		createEReference(boardEClass, BOARD__CELLS);
		createEAttribute(boardEClass, BOARD__WIDTH);
		createEAttribute(boardEClass, BOARD__HEIGHT);

		cellEClass = createEClass(CELL);
		createEAttribute(cellEClass, CELL__X);
		createEAttribute(cellEClass, CELL__Y);
		createEAttribute(cellEClass, CELL__ACTIVE);
		createEAttribute(cellEClass, CELL__BLOCKED);

		pieceTypeEClass = createEClass(PIECE_TYPE);
		createEAttribute(pieceTypeEClass, PIECE_TYPE__NAME);
		createEAttribute(pieceTypeEClass, PIECE_TYPE__ICON_FILE);
		createEReference(pieceTypeEClass, PIECE_TYPE__MOVE_RULES);

		moveRuleEClass = createEClass(MOVE_RULE);
		createEAttribute(moveRuleEClass, MOVE_RULE__DIRECTION);
		createEAttribute(moveRuleEClass, MOVE_RULE__MAX_DISTANCE);
		createEAttribute(moveRuleEClass, MOVE_RULE__INFINITE);
		createEAttribute(moveRuleEClass, MOVE_RULE__MOVE_TYPE);
		createEAttribute(moveRuleEClass, MOVE_RULE__CAN_JUMP_OVER_BLOCKED);

		pieceInstanceEClass = createEClass(PIECE_INSTANCE);
		createEAttribute(pieceInstanceEClass, PIECE_INSTANCE__X);
		createEAttribute(pieceInstanceEClass, PIECE_INSTANCE__Y);
		createEAttribute(pieceInstanceEClass, PIECE_INSTANCE__OWNER);
		createEReference(pieceInstanceEClass, PIECE_INSTANCE__TYPE);

		// Create enums
		directionEEnum = createEEnum(DIRECTION);
		moveTypeEEnum = createEEnum(MOVE_TYPE);
		ownerEEnum = createEEnum(OWNER);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized)
			return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes

		// Initialize classes, features, and operations; add parameters
		initEClass(puzzleEClass, Puzzle.class, "Puzzle", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPuzzle_Board(), this.getBoard(), null, "board", null, 0, 1, Puzzle.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEReference(getPuzzle_PieceTypes(), this.getPieceType(), null, "pieceTypes", null, 0, -1, Puzzle.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPuzzle_Pieces(), this.getPieceInstance(), null, "pieces", null, 0, -1, Puzzle.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(boardEClass, Board.class, "Board", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getBoard_Cells(), this.getCell(), null, "cells", null, 0, -1, Board.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEAttribute(getBoard_Width(), ecorePackage.getEInt(), "width", null, 0, 1, Board.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBoard_Height(), ecorePackage.getEInt(), "height", null, 0, 1, Board.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(cellEClass, Cell.class, "Cell", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCell_X(), ecorePackage.getEInt(), "x", null, 0, 1, Cell.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCell_Y(), ecorePackage.getEInt(), "y", null, 0, 1, Cell.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCell_Active(), ecorePackage.getEBoolean(), "active", null, 0, 1, Cell.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCell_Blocked(), ecorePackage.getEBoolean(), "blocked", null, 0, 1, Cell.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(pieceTypeEClass, PieceType.class, "PieceType", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPieceType_Name(), ecorePackage.getEString(), "name", null, 0, 1, PieceType.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPieceType_IconFile(), ecorePackage.getEString(), "iconFile", null, 0, 1, PieceType.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPieceType_MoveRules(), this.getMoveRule(), null, "moveRules", null, 0, -1, PieceType.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(moveRuleEClass, MoveRule.class, "MoveRule", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMoveRule_Direction(), this.getDirection(), "direction", null, 0, 1, MoveRule.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMoveRule_MaxDistance(), ecorePackage.getEInt(), "maxDistance", null, 0, 1, MoveRule.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMoveRule_Infinite(), ecorePackage.getEBoolean(), "infinite", null, 0, 1, MoveRule.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMoveRule_MoveType(), this.getMoveType(), "moveType", null, 0, 1, MoveRule.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMoveRule_CanJumpOverBlocked(), ecorePackage.getEBoolean(), "canJumpOverBlocked", null, 0, 1,
				MoveRule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);

		initEClass(pieceInstanceEClass, PieceInstance.class, "PieceInstance", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPieceInstance_X(), ecorePackage.getEInt(), "x", null, 0, 1, PieceInstance.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPieceInstance_Y(), ecorePackage.getEInt(), "y", null, 0, 1, PieceInstance.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPieceInstance_Owner(), this.getOwner(), "owner", null, 0, 1, PieceInstance.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPieceInstance_Type(), this.getPieceType(), null, "type", null, 1, 1, PieceInstance.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(directionEEnum, Direction.class, "Direction");
		addEEnumLiteral(directionEEnum, Direction.ORTHOGONAL);
		addEEnumLiteral(directionEEnum, Direction.DIAGONAL);
		addEEnumLiteral(directionEEnum, Direction.LSHAPE);
		addEEnumLiteral(directionEEnum, Direction.FORWARD);
		addEEnumLiteral(directionEEnum, Direction.FORWARD_DIAGONAL);

		initEEnum(moveTypeEEnum, MoveType.class, "MoveType");
		addEEnumLiteral(moveTypeEEnum, MoveType.MOVE_ONLY);
		addEEnumLiteral(moveTypeEEnum, MoveType.CAPTURE_ONLY);
		addEEnumLiteral(moveTypeEEnum, MoveType.MOVE_OR_CAPTURE);

		initEEnum(ownerEEnum, Owner.class, "Owner");
		addEEnumLiteral(ownerEEnum, Owner.PLAYER);
		addEEnumLiteral(ownerEEnum, Owner.OPPONENT);

		// Create resource
		createResource(eNS_URI);
	}

} //ChessHourPackageImpl
