/**
 */
package ipl.model.annotated;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EOperation;
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
 * @see ipl.model.annotated.AnnotatedFactory
 * @model kind="package"
 * @generated
 */
public interface AnnotatedPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "annotated";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http:///ipl/model/annotated.ecore";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "ipl.model.annotated";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	AnnotatedPackage eINSTANCE = ipl.model.annotated.impl.AnnotatedPackageImpl.init();

	/**
	 * The meta object id for the '{@link ipl.model.annotated.impl.AbstractEntityImpl <em>Abstract Entity</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ipl.model.annotated.impl.AbstractEntityImpl
	 * @see ipl.model.annotated.impl.AnnotatedPackageImpl#getAbstractEntity()
	 * @generated
	 */
	int ABSTRACT_ENTITY = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_ENTITY__NAME = 0;

	/**
	 * The number of structural features of the '<em>Abstract Entity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_ENTITY_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Abstract Entity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_ENTITY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link ipl.model.annotated.impl.PlayerImpl <em>Player</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ipl.model.annotated.impl.PlayerImpl
	 * @see ipl.model.annotated.impl.AnnotatedPackageImpl#getPlayer()
	 * @generated
	 */
	int PLAYER = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAYER__NAME = ABSTRACT_ENTITY__NAME;

	/**
	 * The feature id for the '<em><b>Team</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAYER__TEAM = ABSTRACT_ENTITY_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Player</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAYER_FEATURE_COUNT = ABSTRACT_ENTITY_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Can Bowl</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAYER___CAN_BOWL = ABSTRACT_ENTITY_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Player</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAYER_OPERATION_COUNT = ABSTRACT_ENTITY_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link ipl.model.annotated.impl.CaptainImpl <em>Captain</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ipl.model.annotated.impl.CaptainImpl
	 * @see ipl.model.annotated.impl.AnnotatedPackageImpl#getCaptain()
	 * @generated
	 */
	int CAPTAIN = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPTAIN__NAME = PLAYER__NAME;

	/**
	 * The feature id for the '<em><b>Team</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPTAIN__TEAM = PLAYER__TEAM;

	/**
	 * The number of structural features of the '<em>Captain</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPTAIN_FEATURE_COUNT = PLAYER_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Can Bowl</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPTAIN___CAN_BOWL = PLAYER___CAN_BOWL;

	/**
	 * The number of operations of the '<em>Captain</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPTAIN_OPERATION_COUNT = PLAYER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ipl.model.annotated.impl.MatchImpl <em>Match</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ipl.model.annotated.impl.MatchImpl
	 * @see ipl.model.annotated.impl.AnnotatedPackageImpl#getMatch()
	 * @generated
	 */
	int MATCH = 2;

	/**
	 * The feature id for the '<em><b>Veue</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATCH__VEUE = 0;

	/**
	 * The feature id for the '<em><b>Match Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATCH__MATCH_DATE = 1;

	/**
	 * The feature id for the '<em><b>Overs</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATCH__OVERS = 2;

	/**
	 * The feature id for the '<em><b>Team A</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATCH__TEAM_A = 3;

	/**
	 * The feature id for the '<em><b>Team B</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATCH__TEAM_B = 4;

	/**
	 * The feature id for the '<em><b>Toss</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATCH__TOSS = 5;

	/**
	 * The feature id for the '<em><b>Umpires</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATCH__UMPIRES = 6;

	/**
	 * The feature id for the '<em><b>Result</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATCH__RESULT = 7;

	/**
	 * The number of structural features of the '<em>Match</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATCH_FEATURE_COUNT = 8;

	/**
	 * The number of operations of the '<em>Match</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATCH_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link ipl.model.annotated.impl.TeamImpl <em>Team</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ipl.model.annotated.impl.TeamImpl
	 * @see ipl.model.annotated.impl.AnnotatedPackageImpl#getTeam()
	 * @generated
	 */
	int TEAM = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEAM__NAME = 0;

	/**
	 * The feature id for the '<em><b>Batsmen</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEAM__BATSMEN = 1;

	/**
	 * The feature id for the '<em><b>Bowlers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEAM__BOWLERS = 2;

	/**
	 * The feature id for the '<em><b>Captain</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEAM__CAPTAIN = 3;

	/**
	 * The feature id for the '<em><b>Vice Captain</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEAM__VICE_CAPTAIN = 4;

	/**
	 * The feature id for the '<em><b>Wicket Keeper</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEAM__WICKET_KEEPER = 5;

	/**
	 * The number of structural features of the '<em>Team</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEAM_FEATURE_COUNT = 6;

	/**
	 * The operation id for the '<em>Get12th Man</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEAM___GET12TH_MAN = 0;

	/**
	 * The number of operations of the '<em>Team</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEAM_OPERATION_COUNT = 1;

	/**
	 * The meta object id for the '{@link ipl.model.annotated.impl.TournamentImpl <em>Tournament</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ipl.model.annotated.impl.TournamentImpl
	 * @see ipl.model.annotated.impl.AnnotatedPackageImpl#getTournament()
	 * @generated
	 */
	int TOURNAMENT = 5;

	/**
	 * The feature id for the '<em><b>Teams</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOURNAMENT__TEAMS = 0;

	/**
	 * The feature id for the '<em><b>Venues</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOURNAMENT__VENUES = 1;

	/**
	 * The feature id for the '<em><b>Matches</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOURNAMENT__MATCHES = 2;

	/**
	 * The number of structural features of the '<em>Tournament</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOURNAMENT_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Tournament</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOURNAMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link ipl.model.annotated.impl.UmpireImpl <em>Umpire</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ipl.model.annotated.impl.UmpireImpl
	 * @see ipl.model.annotated.impl.AnnotatedPackageImpl#getUmpire()
	 * @generated
	 */
	int UMPIRE = 6;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UMPIRE__NAME = ABSTRACT_ENTITY__NAME;

	/**
	 * The number of structural features of the '<em>Umpire</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UMPIRE_FEATURE_COUNT = ABSTRACT_ENTITY_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Umpire</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UMPIRE_OPERATION_COUNT = ABSTRACT_ENTITY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ipl.model.annotated.impl.VenueImpl <em>Venue</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ipl.model.annotated.impl.VenueImpl
	 * @see ipl.model.annotated.impl.AnnotatedPackageImpl#getVenue()
	 * @generated
	 */
	int VENUE = 7;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VENUE__NAME = ABSTRACT_ENTITY__NAME;

	/**
	 * The number of structural features of the '<em>Venue</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VENUE_FEATURE_COUNT = ABSTRACT_ENTITY_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Venue</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VENUE_OPERATION_COUNT = ABSTRACT_ENTITY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ipl.model.annotated.impl.ViceCaptainImpl <em>Vice Captain</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ipl.model.annotated.impl.ViceCaptainImpl
	 * @see ipl.model.annotated.impl.AnnotatedPackageImpl#getViceCaptain()
	 * @generated
	 */
	int VICE_CAPTAIN = 8;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VICE_CAPTAIN__NAME = PLAYER__NAME;

	/**
	 * The feature id for the '<em><b>Team</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VICE_CAPTAIN__TEAM = PLAYER__TEAM;

	/**
	 * The number of structural features of the '<em>Vice Captain</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VICE_CAPTAIN_FEATURE_COUNT = PLAYER_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Can Bowl</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VICE_CAPTAIN___CAN_BOWL = PLAYER___CAN_BOWL;

	/**
	 * The number of operations of the '<em>Vice Captain</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VICE_CAPTAIN_OPERATION_COUNT = PLAYER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ipl.model.annotated.impl.WicketKeeperImpl <em>Wicket Keeper</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ipl.model.annotated.impl.WicketKeeperImpl
	 * @see ipl.model.annotated.impl.AnnotatedPackageImpl#getWicketKeeper()
	 * @generated
	 */
	int WICKET_KEEPER = 9;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WICKET_KEEPER__NAME = PLAYER__NAME;

	/**
	 * The feature id for the '<em><b>Team</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WICKET_KEEPER__TEAM = PLAYER__TEAM;

	/**
	 * The number of structural features of the '<em>Wicket Keeper</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WICKET_KEEPER_FEATURE_COUNT = PLAYER_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Can Bowl</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WICKET_KEEPER___CAN_BOWL = PLAYER___CAN_BOWL;

	/**
	 * The number of operations of the '<em>Wicket Keeper</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WICKET_KEEPER_OPERATION_COUNT = PLAYER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ipl.model.annotated.MatchResult <em>Match Result</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ipl.model.annotated.MatchResult
	 * @see ipl.model.annotated.impl.AnnotatedPackageImpl#getMatchResult()
	 * @generated
	 */
	int MATCH_RESULT = 10;

	/**
	 * The meta object id for the '{@link ipl.model.annotated.Toss <em>Toss</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ipl.model.annotated.Toss
	 * @see ipl.model.annotated.impl.AnnotatedPackageImpl#getToss()
	 * @generated
	 */
	int TOSS = 11;


	/**
	 * Returns the meta object for class '{@link ipl.model.annotated.AbstractEntity <em>Abstract Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Abstract Entity</em>'.
	 * @see ipl.model.annotated.AbstractEntity
	 * @generated
	 */
	EClass getAbstractEntity();

	/**
	 * Returns the meta object for the attribute '{@link ipl.model.annotated.AbstractEntity#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see ipl.model.annotated.AbstractEntity#getName()
	 * @see #getAbstractEntity()
	 * @generated
	 */
	EAttribute getAbstractEntity_Name();

	/**
	 * Returns the meta object for class '{@link ipl.model.annotated.Captain <em>Captain</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Captain</em>'.
	 * @see ipl.model.annotated.Captain
	 * @generated
	 */
	EClass getCaptain();

	/**
	 * Returns the meta object for class '{@link ipl.model.annotated.Match <em>Match</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Match</em>'.
	 * @see ipl.model.annotated.Match
	 * @generated
	 */
	EClass getMatch();

	/**
	 * Returns the meta object for the reference '{@link ipl.model.annotated.Match#getVeue <em>Veue</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Veue</em>'.
	 * @see ipl.model.annotated.Match#getVeue()
	 * @see #getMatch()
	 * @generated
	 */
	EReference getMatch_Veue();

	/**
	 * Returns the meta object for the attribute '{@link ipl.model.annotated.Match#getMatchDate <em>Match Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Match Date</em>'.
	 * @see ipl.model.annotated.Match#getMatchDate()
	 * @see #getMatch()
	 * @generated
	 */
	EAttribute getMatch_MatchDate();

	/**
	 * Returns the meta object for the attribute '{@link ipl.model.annotated.Match#getOvers <em>Overs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Overs</em>'.
	 * @see ipl.model.annotated.Match#getOvers()
	 * @see #getMatch()
	 * @generated
	 */
	EAttribute getMatch_Overs();

	/**
	 * Returns the meta object for the containment reference '{@link ipl.model.annotated.Match#getTeamA <em>Team A</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Team A</em>'.
	 * @see ipl.model.annotated.Match#getTeamA()
	 * @see #getMatch()
	 * @generated
	 */
	EReference getMatch_TeamA();

	/**
	 * Returns the meta object for the containment reference '{@link ipl.model.annotated.Match#getTeamB <em>Team B</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Team B</em>'.
	 * @see ipl.model.annotated.Match#getTeamB()
	 * @see #getMatch()
	 * @generated
	 */
	EReference getMatch_TeamB();

	/**
	 * Returns the meta object for the attribute '{@link ipl.model.annotated.Match#getToss <em>Toss</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Toss</em>'.
	 * @see ipl.model.annotated.Match#getToss()
	 * @see #getMatch()
	 * @generated
	 */
	EAttribute getMatch_Toss();

	/**
	 * Returns the meta object for the containment reference list '{@link ipl.model.annotated.Match#getUmpires <em>Umpires</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Umpires</em>'.
	 * @see ipl.model.annotated.Match#getUmpires()
	 * @see #getMatch()
	 * @generated
	 */
	EReference getMatch_Umpires();

	/**
	 * Returns the meta object for the attribute '{@link ipl.model.annotated.Match#getResult <em>Result</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Result</em>'.
	 * @see ipl.model.annotated.Match#getResult()
	 * @see #getMatch()
	 * @generated
	 */
	EAttribute getMatch_Result();

	/**
	 * Returns the meta object for class '{@link ipl.model.annotated.Player <em>Player</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Player</em>'.
	 * @see ipl.model.annotated.Player
	 * @generated
	 */
	EClass getPlayer();

	/**
	 * Returns the meta object for the reference '{@link ipl.model.annotated.Player#getTeam <em>Team</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Team</em>'.
	 * @see ipl.model.annotated.Player#getTeam()
	 * @see #getPlayer()
	 * @generated
	 */
	EReference getPlayer_Team();

	/**
	 * Returns the meta object for the '{@link ipl.model.annotated.Player#canBowl() <em>Can Bowl</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Can Bowl</em>' operation.
	 * @see ipl.model.annotated.Player#canBowl()
	 * @generated
	 */
	EOperation getPlayer__CanBowl();

	/**
	 * Returns the meta object for class '{@link ipl.model.annotated.Team <em>Team</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Team</em>'.
	 * @see ipl.model.annotated.Team
	 * @generated
	 */
	EClass getTeam();

	/**
	 * Returns the meta object for the attribute '{@link ipl.model.annotated.Team#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see ipl.model.annotated.Team#getName()
	 * @see #getTeam()
	 * @generated
	 */
	EAttribute getTeam_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link ipl.model.annotated.Team#getBatsmen <em>Batsmen</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Batsmen</em>'.
	 * @see ipl.model.annotated.Team#getBatsmen()
	 * @see #getTeam()
	 * @generated
	 */
	EReference getTeam_Batsmen();

	/**
	 * Returns the meta object for the containment reference list '{@link ipl.model.annotated.Team#getBowlers <em>Bowlers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Bowlers</em>'.
	 * @see ipl.model.annotated.Team#getBowlers()
	 * @see #getTeam()
	 * @generated
	 */
	EReference getTeam_Bowlers();

	/**
	 * Returns the meta object for the reference '{@link ipl.model.annotated.Team#getCaptain <em>Captain</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Captain</em>'.
	 * @see ipl.model.annotated.Team#getCaptain()
	 * @see #getTeam()
	 * @generated
	 */
	EReference getTeam_Captain();

	/**
	 * Returns the meta object for the reference '{@link ipl.model.annotated.Team#getViceCaptain <em>Vice Captain</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Vice Captain</em>'.
	 * @see ipl.model.annotated.Team#getViceCaptain()
	 * @see #getTeam()
	 * @generated
	 */
	EReference getTeam_ViceCaptain();

	/**
	 * Returns the meta object for the reference '{@link ipl.model.annotated.Team#getWicketKeeper <em>Wicket Keeper</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Wicket Keeper</em>'.
	 * @see ipl.model.annotated.Team#getWicketKeeper()
	 * @see #getTeam()
	 * @generated
	 */
	EReference getTeam_WicketKeeper();

	/**
	 * Returns the meta object for the '{@link ipl.model.annotated.Team#get12thMan() <em>Get12th Man</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get12th Man</em>' operation.
	 * @see ipl.model.annotated.Team#get12thMan()
	 * @generated
	 */
	EOperation getTeam__Get12thMan();

	/**
	 * Returns the meta object for class '{@link ipl.model.annotated.Tournament <em>Tournament</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Tournament</em>'.
	 * @see ipl.model.annotated.Tournament
	 * @generated
	 */
	EClass getTournament();

	/**
	 * Returns the meta object for the containment reference list '{@link ipl.model.annotated.Tournament#getTeams <em>Teams</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Teams</em>'.
	 * @see ipl.model.annotated.Tournament#getTeams()
	 * @see #getTournament()
	 * @generated
	 */
	EReference getTournament_Teams();

	/**
	 * Returns the meta object for the containment reference list '{@link ipl.model.annotated.Tournament#getVenues <em>Venues</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Venues</em>'.
	 * @see ipl.model.annotated.Tournament#getVenues()
	 * @see #getTournament()
	 * @generated
	 */
	EReference getTournament_Venues();

	/**
	 * Returns the meta object for the containment reference list '{@link ipl.model.annotated.Tournament#getMatches <em>Matches</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Matches</em>'.
	 * @see ipl.model.annotated.Tournament#getMatches()
	 * @see #getTournament()
	 * @generated
	 */
	EReference getTournament_Matches();

	/**
	 * Returns the meta object for class '{@link ipl.model.annotated.Umpire <em>Umpire</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Umpire</em>'.
	 * @see ipl.model.annotated.Umpire
	 * @generated
	 */
	EClass getUmpire();

	/**
	 * Returns the meta object for class '{@link ipl.model.annotated.Venue <em>Venue</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Venue</em>'.
	 * @see ipl.model.annotated.Venue
	 * @generated
	 */
	EClass getVenue();

	/**
	 * Returns the meta object for class '{@link ipl.model.annotated.ViceCaptain <em>Vice Captain</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Vice Captain</em>'.
	 * @see ipl.model.annotated.ViceCaptain
	 * @generated
	 */
	EClass getViceCaptain();

	/**
	 * Returns the meta object for class '{@link ipl.model.annotated.WicketKeeper <em>Wicket Keeper</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Wicket Keeper</em>'.
	 * @see ipl.model.annotated.WicketKeeper
	 * @generated
	 */
	EClass getWicketKeeper();

	/**
	 * Returns the meta object for enum '{@link ipl.model.annotated.MatchResult <em>Match Result</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Match Result</em>'.
	 * @see ipl.model.annotated.MatchResult
	 * @generated
	 */
	EEnum getMatchResult();

	/**
	 * Returns the meta object for enum '{@link ipl.model.annotated.Toss <em>Toss</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Toss</em>'.
	 * @see ipl.model.annotated.Toss
	 * @generated
	 */
	EEnum getToss();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	AnnotatedFactory getAnnotatedFactory();

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
		 * The meta object literal for the '{@link ipl.model.annotated.impl.AbstractEntityImpl <em>Abstract Entity</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ipl.model.annotated.impl.AbstractEntityImpl
		 * @see ipl.model.annotated.impl.AnnotatedPackageImpl#getAbstractEntity()
		 * @generated
		 */
		EClass ABSTRACT_ENTITY = eINSTANCE.getAbstractEntity();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ABSTRACT_ENTITY__NAME = eINSTANCE.getAbstractEntity_Name();

		/**
		 * The meta object literal for the '{@link ipl.model.annotated.impl.CaptainImpl <em>Captain</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ipl.model.annotated.impl.CaptainImpl
		 * @see ipl.model.annotated.impl.AnnotatedPackageImpl#getCaptain()
		 * @generated
		 */
		EClass CAPTAIN = eINSTANCE.getCaptain();

		/**
		 * The meta object literal for the '{@link ipl.model.annotated.impl.MatchImpl <em>Match</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ipl.model.annotated.impl.MatchImpl
		 * @see ipl.model.annotated.impl.AnnotatedPackageImpl#getMatch()
		 * @generated
		 */
		EClass MATCH = eINSTANCE.getMatch();

		/**
		 * The meta object literal for the '<em><b>Veue</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MATCH__VEUE = eINSTANCE.getMatch_Veue();

		/**
		 * The meta object literal for the '<em><b>Match Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MATCH__MATCH_DATE = eINSTANCE.getMatch_MatchDate();

		/**
		 * The meta object literal for the '<em><b>Overs</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MATCH__OVERS = eINSTANCE.getMatch_Overs();

		/**
		 * The meta object literal for the '<em><b>Team A</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MATCH__TEAM_A = eINSTANCE.getMatch_TeamA();

		/**
		 * The meta object literal for the '<em><b>Team B</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MATCH__TEAM_B = eINSTANCE.getMatch_TeamB();

		/**
		 * The meta object literal for the '<em><b>Toss</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MATCH__TOSS = eINSTANCE.getMatch_Toss();

		/**
		 * The meta object literal for the '<em><b>Umpires</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MATCH__UMPIRES = eINSTANCE.getMatch_Umpires();

		/**
		 * The meta object literal for the '<em><b>Result</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MATCH__RESULT = eINSTANCE.getMatch_Result();

		/**
		 * The meta object literal for the '{@link ipl.model.annotated.impl.PlayerImpl <em>Player</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ipl.model.annotated.impl.PlayerImpl
		 * @see ipl.model.annotated.impl.AnnotatedPackageImpl#getPlayer()
		 * @generated
		 */
		EClass PLAYER = eINSTANCE.getPlayer();

		/**
		 * The meta object literal for the '<em><b>Team</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PLAYER__TEAM = eINSTANCE.getPlayer_Team();

		/**
		 * The meta object literal for the '<em><b>Can Bowl</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation PLAYER___CAN_BOWL = eINSTANCE.getPlayer__CanBowl();

		/**
		 * The meta object literal for the '{@link ipl.model.annotated.impl.TeamImpl <em>Team</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ipl.model.annotated.impl.TeamImpl
		 * @see ipl.model.annotated.impl.AnnotatedPackageImpl#getTeam()
		 * @generated
		 */
		EClass TEAM = eINSTANCE.getTeam();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEAM__NAME = eINSTANCE.getTeam_Name();

		/**
		 * The meta object literal for the '<em><b>Batsmen</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TEAM__BATSMEN = eINSTANCE.getTeam_Batsmen();

		/**
		 * The meta object literal for the '<em><b>Bowlers</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TEAM__BOWLERS = eINSTANCE.getTeam_Bowlers();

		/**
		 * The meta object literal for the '<em><b>Captain</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TEAM__CAPTAIN = eINSTANCE.getTeam_Captain();

		/**
		 * The meta object literal for the '<em><b>Vice Captain</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TEAM__VICE_CAPTAIN = eINSTANCE.getTeam_ViceCaptain();

		/**
		 * The meta object literal for the '<em><b>Wicket Keeper</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TEAM__WICKET_KEEPER = eINSTANCE.getTeam_WicketKeeper();

		/**
		 * The meta object literal for the '<em><b>Get12th Man</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation TEAM___GET12TH_MAN = eINSTANCE.getTeam__Get12thMan();

		/**
		 * The meta object literal for the '{@link ipl.model.annotated.impl.TournamentImpl <em>Tournament</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ipl.model.annotated.impl.TournamentImpl
		 * @see ipl.model.annotated.impl.AnnotatedPackageImpl#getTournament()
		 * @generated
		 */
		EClass TOURNAMENT = eINSTANCE.getTournament();

		/**
		 * The meta object literal for the '<em><b>Teams</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TOURNAMENT__TEAMS = eINSTANCE.getTournament_Teams();

		/**
		 * The meta object literal for the '<em><b>Venues</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TOURNAMENT__VENUES = eINSTANCE.getTournament_Venues();

		/**
		 * The meta object literal for the '<em><b>Matches</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TOURNAMENT__MATCHES = eINSTANCE.getTournament_Matches();

		/**
		 * The meta object literal for the '{@link ipl.model.annotated.impl.UmpireImpl <em>Umpire</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ipl.model.annotated.impl.UmpireImpl
		 * @see ipl.model.annotated.impl.AnnotatedPackageImpl#getUmpire()
		 * @generated
		 */
		EClass UMPIRE = eINSTANCE.getUmpire();

		/**
		 * The meta object literal for the '{@link ipl.model.annotated.impl.VenueImpl <em>Venue</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ipl.model.annotated.impl.VenueImpl
		 * @see ipl.model.annotated.impl.AnnotatedPackageImpl#getVenue()
		 * @generated
		 */
		EClass VENUE = eINSTANCE.getVenue();

		/**
		 * The meta object literal for the '{@link ipl.model.annotated.impl.ViceCaptainImpl <em>Vice Captain</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ipl.model.annotated.impl.ViceCaptainImpl
		 * @see ipl.model.annotated.impl.AnnotatedPackageImpl#getViceCaptain()
		 * @generated
		 */
		EClass VICE_CAPTAIN = eINSTANCE.getViceCaptain();

		/**
		 * The meta object literal for the '{@link ipl.model.annotated.impl.WicketKeeperImpl <em>Wicket Keeper</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ipl.model.annotated.impl.WicketKeeperImpl
		 * @see ipl.model.annotated.impl.AnnotatedPackageImpl#getWicketKeeper()
		 * @generated
		 */
		EClass WICKET_KEEPER = eINSTANCE.getWicketKeeper();

		/**
		 * The meta object literal for the '{@link ipl.model.annotated.MatchResult <em>Match Result</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ipl.model.annotated.MatchResult
		 * @see ipl.model.annotated.impl.AnnotatedPackageImpl#getMatchResult()
		 * @generated
		 */
		EEnum MATCH_RESULT = eINSTANCE.getMatchResult();

		/**
		 * The meta object literal for the '{@link ipl.model.annotated.Toss <em>Toss</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ipl.model.annotated.Toss
		 * @see ipl.model.annotated.impl.AnnotatedPackageImpl#getToss()
		 * @generated
		 */
		EEnum TOSS = eINSTANCE.getToss();

	}

} //AnnotatedPackage
