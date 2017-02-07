/**
 */
package ipl.model.annotated.impl;

import ipl.model.annotated.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class AnnotatedFactoryImpl extends EFactoryImpl implements AnnotatedFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static AnnotatedFactory init() {
		try {
			AnnotatedFactory theAnnotatedFactory = (AnnotatedFactory)EPackage.Registry.INSTANCE.getEFactory(AnnotatedPackage.eNS_URI);
			if (theAnnotatedFactory != null) {
				return theAnnotatedFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new AnnotatedFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AnnotatedFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case AnnotatedPackage.ABSTRACT_ENTITY: return createAbstractEntity();
			case AnnotatedPackage.CAPTAIN: return createCaptain();
			case AnnotatedPackage.MATCH: return createMatch();
			case AnnotatedPackage.PLAYER: return createPlayer();
			case AnnotatedPackage.TEAM: return createTeam();
			case AnnotatedPackage.TOURNAMENT: return createTournament();
			case AnnotatedPackage.UMPIRE: return createUmpire();
			case AnnotatedPackage.VENUE: return createVenue();
			case AnnotatedPackage.VICE_CAPTAIN: return createViceCaptain();
			case AnnotatedPackage.WICKET_KEEPER: return createWicketKeeper();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case AnnotatedPackage.MATCH_RESULT:
				return createMatchResultFromString(eDataType, initialValue);
			case AnnotatedPackage.TOSS:
				return createTossFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case AnnotatedPackage.MATCH_RESULT:
				return convertMatchResultToString(eDataType, instanceValue);
			case AnnotatedPackage.TOSS:
				return convertTossToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AbstractEntity createAbstractEntity() {
		AbstractEntityImpl abstractEntity = new AbstractEntityImpl();
		return abstractEntity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Captain createCaptain() {
		CaptainImpl captain = new CaptainImpl();
		return captain;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Match createMatch() {
		MatchImpl match = new MatchImpl();
		return match;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Player createPlayer() {
		PlayerImpl player = new PlayerImpl();
		return player;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Team createTeam() {
		TeamImpl team = new TeamImpl();
		return team;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Tournament createTournament() {
		TournamentImpl tournament = new TournamentImpl();
		return tournament;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Umpire createUmpire() {
		UmpireImpl umpire = new UmpireImpl();
		return umpire;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Venue createVenue() {
		VenueImpl venue = new VenueImpl();
		return venue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ViceCaptain createViceCaptain() {
		ViceCaptainImpl viceCaptain = new ViceCaptainImpl();
		return viceCaptain;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WicketKeeper createWicketKeeper() {
		WicketKeeperImpl wicketKeeper = new WicketKeeperImpl();
		return wicketKeeper;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MatchResult createMatchResultFromString(EDataType eDataType, String initialValue) {
		MatchResult result = MatchResult.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertMatchResultToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Toss createTossFromString(EDataType eDataType, String initialValue) {
		Toss result = Toss.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTossToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AnnotatedPackage getAnnotatedPackage() {
		return (AnnotatedPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static AnnotatedPackage getPackage() {
		return AnnotatedPackage.eINSTANCE;
	}

} //AnnotatedFactoryImpl
