/**
 */
package ipl.model.annotated.impl;

import ipl.model.annotated.AnnotatedPackage;
import ipl.model.annotated.Match;
import ipl.model.annotated.Team;
import ipl.model.annotated.Tournament;
import ipl.model.annotated.Venue;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Tournament</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ipl.model.annotated.impl.TournamentImpl#getTeams <em>Teams</em>}</li>
 *   <li>{@link ipl.model.annotated.impl.TournamentImpl#getVenues <em>Venues</em>}</li>
 *   <li>{@link ipl.model.annotated.impl.TournamentImpl#getMatches <em>Matches</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TournamentImpl extends MinimalEObjectImpl.Container implements Tournament {
	/**
	 * The cached value of the '{@link #getTeams() <em>Teams</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTeams()
	 * @generated
	 * @ordered
	 */
	protected EList<Team> teams;

	/**
	 * The cached value of the '{@link #getVenues() <em>Venues</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVenues()
	 * @generated
	 * @ordered
	 */
	protected EList<Venue> venues;

	/**
	 * The cached value of the '{@link #getMatches() <em>Matches</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMatches()
	 * @generated
	 * @ordered
	 */
	protected EList<Match> matches;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TournamentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AnnotatedPackage.Literals.TOURNAMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Team> getTeams() {
		if (teams == null) {
			teams = new EObjectContainmentEList<Team>(Team.class, this, AnnotatedPackage.TOURNAMENT__TEAMS);
		}
		return teams;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Venue> getVenues() {
		if (venues == null) {
			venues = new EObjectContainmentEList<Venue>(Venue.class, this, AnnotatedPackage.TOURNAMENT__VENUES);
		}
		return venues;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Match> getMatches() {
		if (matches == null) {
			matches = new EObjectContainmentEList<Match>(Match.class, this, AnnotatedPackage.TOURNAMENT__MATCHES);
		}
		return matches;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case AnnotatedPackage.TOURNAMENT__TEAMS:
				return ((InternalEList<?>)getTeams()).basicRemove(otherEnd, msgs);
			case AnnotatedPackage.TOURNAMENT__VENUES:
				return ((InternalEList<?>)getVenues()).basicRemove(otherEnd, msgs);
			case AnnotatedPackage.TOURNAMENT__MATCHES:
				return ((InternalEList<?>)getMatches()).basicRemove(otherEnd, msgs);
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
			case AnnotatedPackage.TOURNAMENT__TEAMS:
				return getTeams();
			case AnnotatedPackage.TOURNAMENT__VENUES:
				return getVenues();
			case AnnotatedPackage.TOURNAMENT__MATCHES:
				return getMatches();
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
			case AnnotatedPackage.TOURNAMENT__TEAMS:
				getTeams().clear();
				getTeams().addAll((Collection<? extends Team>)newValue);
				return;
			case AnnotatedPackage.TOURNAMENT__VENUES:
				getVenues().clear();
				getVenues().addAll((Collection<? extends Venue>)newValue);
				return;
			case AnnotatedPackage.TOURNAMENT__MATCHES:
				getMatches().clear();
				getMatches().addAll((Collection<? extends Match>)newValue);
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
			case AnnotatedPackage.TOURNAMENT__TEAMS:
				getTeams().clear();
				return;
			case AnnotatedPackage.TOURNAMENT__VENUES:
				getVenues().clear();
				return;
			case AnnotatedPackage.TOURNAMENT__MATCHES:
				getMatches().clear();
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
			case AnnotatedPackage.TOURNAMENT__TEAMS:
				return teams != null && !teams.isEmpty();
			case AnnotatedPackage.TOURNAMENT__VENUES:
				return venues != null && !venues.isEmpty();
			case AnnotatedPackage.TOURNAMENT__MATCHES:
				return matches != null && !matches.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //TournamentImpl
