/**
 */
package ipl.model.annotated.util;

import ipl.model.annotated.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see ipl.model.annotated.AnnotatedPackage
 * @generated
 */
public class AnnotatedAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static AnnotatedPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AnnotatedAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = AnnotatedPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AnnotatedSwitch<Adapter> modelSwitch =
		new AnnotatedSwitch<Adapter>() {
			@Override
			public Adapter caseAbstractEntity(AbstractEntity object) {
				return createAbstractEntityAdapter();
			}
			@Override
			public Adapter caseCaptain(Captain object) {
				return createCaptainAdapter();
			}
			@Override
			public Adapter caseMatch(Match object) {
				return createMatchAdapter();
			}
			@Override
			public Adapter casePlayer(Player object) {
				return createPlayerAdapter();
			}
			@Override
			public Adapter caseTeam(Team object) {
				return createTeamAdapter();
			}
			@Override
			public Adapter caseTournament(Tournament object) {
				return createTournamentAdapter();
			}
			@Override
			public Adapter caseUmpire(Umpire object) {
				return createUmpireAdapter();
			}
			@Override
			public Adapter caseVenue(Venue object) {
				return createVenueAdapter();
			}
			@Override
			public Adapter caseViceCaptain(ViceCaptain object) {
				return createViceCaptainAdapter();
			}
			@Override
			public Adapter caseWicketKeeper(WicketKeeper object) {
				return createWicketKeeperAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link ipl.model.annotated.AbstractEntity <em>Abstract Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ipl.model.annotated.AbstractEntity
	 * @generated
	 */
	public Adapter createAbstractEntityAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ipl.model.annotated.Captain <em>Captain</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ipl.model.annotated.Captain
	 * @generated
	 */
	public Adapter createCaptainAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ipl.model.annotated.Match <em>Match</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ipl.model.annotated.Match
	 * @generated
	 */
	public Adapter createMatchAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ipl.model.annotated.Player <em>Player</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ipl.model.annotated.Player
	 * @generated
	 */
	public Adapter createPlayerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ipl.model.annotated.Team <em>Team</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ipl.model.annotated.Team
	 * @generated
	 */
	public Adapter createTeamAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ipl.model.annotated.Tournament <em>Tournament</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ipl.model.annotated.Tournament
	 * @generated
	 */
	public Adapter createTournamentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ipl.model.annotated.Umpire <em>Umpire</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ipl.model.annotated.Umpire
	 * @generated
	 */
	public Adapter createUmpireAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ipl.model.annotated.Venue <em>Venue</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ipl.model.annotated.Venue
	 * @generated
	 */
	public Adapter createVenueAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ipl.model.annotated.ViceCaptain <em>Vice Captain</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ipl.model.annotated.ViceCaptain
	 * @generated
	 */
	public Adapter createViceCaptainAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ipl.model.annotated.WicketKeeper <em>Wicket Keeper</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ipl.model.annotated.WicketKeeper
	 * @generated
	 */
	public Adapter createWicketKeeperAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //AnnotatedAdapterFactory
