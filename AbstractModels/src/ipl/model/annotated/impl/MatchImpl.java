/**
 */
package ipl.model.annotated.impl;

import ipl.model.annotated.AnnotatedPackage;
import ipl.model.annotated.Match;
import ipl.model.annotated.MatchResult;
import ipl.model.annotated.Team;
import ipl.model.annotated.Toss;
import ipl.model.annotated.Umpire;
import ipl.model.annotated.Venue;

import java.util.Collection;
import java.util.Date;

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
 * An implementation of the model object '<em><b>Match</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ipl.model.annotated.impl.MatchImpl#getVeue <em>Veue</em>}</li>
 *   <li>{@link ipl.model.annotated.impl.MatchImpl#getMatchDate <em>Match Date</em>}</li>
 *   <li>{@link ipl.model.annotated.impl.MatchImpl#getOvers <em>Overs</em>}</li>
 *   <li>{@link ipl.model.annotated.impl.MatchImpl#getTeamA <em>Team A</em>}</li>
 *   <li>{@link ipl.model.annotated.impl.MatchImpl#getTeamB <em>Team B</em>}</li>
 *   <li>{@link ipl.model.annotated.impl.MatchImpl#getToss <em>Toss</em>}</li>
 *   <li>{@link ipl.model.annotated.impl.MatchImpl#getUmpires <em>Umpires</em>}</li>
 *   <li>{@link ipl.model.annotated.impl.MatchImpl#getResult <em>Result</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MatchImpl extends MinimalEObjectImpl.Container implements Match {
	/**
	 * The cached value of the '{@link #getVeue() <em>Veue</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVeue()
	 * @generated
	 * @ordered
	 */
	protected Venue veue;

	/**
	 * The default value of the '{@link #getMatchDate() <em>Match Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMatchDate()
	 * @generated
	 * @ordered
	 */
	protected static final Date MATCH_DATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMatchDate() <em>Match Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMatchDate()
	 * @generated
	 * @ordered
	 */
	protected Date matchDate = MATCH_DATE_EDEFAULT;

	/**
	 * The default value of the '{@link #getOvers() <em>Overs</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOvers()
	 * @generated
	 * @ordered
	 */
	protected static final Integer OVERS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOvers() <em>Overs</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOvers()
	 * @generated
	 * @ordered
	 */
	protected Integer overs = OVERS_EDEFAULT;

	/**
	 * The cached value of the '{@link #getTeamA() <em>Team A</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTeamA()
	 * @generated
	 * @ordered
	 */
	protected Team teamA;

	/**
	 * The cached value of the '{@link #getTeamB() <em>Team B</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTeamB()
	 * @generated
	 * @ordered
	 */
	protected Team teamB;

	/**
	 * The default value of the '{@link #getToss() <em>Toss</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getToss()
	 * @generated
	 * @ordered
	 */
	protected static final Toss TOSS_EDEFAULT = Toss.TEAM_A;

	/**
	 * The cached value of the '{@link #getToss() <em>Toss</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getToss()
	 * @generated
	 * @ordered
	 */
	protected Toss toss = TOSS_EDEFAULT;

	/**
	 * This is true if the Toss attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean tossESet;

	/**
	 * The cached value of the '{@link #getUmpires() <em>Umpires</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUmpires()
	 * @generated
	 * @ordered
	 */
	protected EList<Umpire> umpires;

	/**
	 * The default value of the '{@link #getResult() <em>Result</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResult()
	 * @generated
	 * @ordered
	 */
	protected static final MatchResult RESULT_EDEFAULT = MatchResult.TIE;

	/**
	 * The cached value of the '{@link #getResult() <em>Result</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResult()
	 * @generated
	 * @ordered
	 */
	protected MatchResult result = RESULT_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MatchImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AnnotatedPackage.Literals.MATCH;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Venue getVeue() {
		if (veue != null && veue.eIsProxy()) {
			InternalEObject oldVeue = (InternalEObject)veue;
			veue = (Venue)eResolveProxy(oldVeue);
			if (veue != oldVeue) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AnnotatedPackage.MATCH__VEUE, oldVeue, veue));
			}
		}
		return veue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Venue basicGetVeue() {
		return veue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVeue(Venue newVeue) {
		Venue oldVeue = veue;
		veue = newVeue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AnnotatedPackage.MATCH__VEUE, oldVeue, veue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date getMatchDate() {
		return matchDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMatchDate(Date newMatchDate) {
		Date oldMatchDate = matchDate;
		matchDate = newMatchDate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AnnotatedPackage.MATCH__MATCH_DATE, oldMatchDate, matchDate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer getOvers() {
		return overs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOvers(Integer newOvers) {
		Integer oldOvers = overs;
		overs = newOvers;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AnnotatedPackage.MATCH__OVERS, oldOvers, overs));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Team getTeamA() {
		return teamA;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTeamA(Team newTeamA, NotificationChain msgs) {
		Team oldTeamA = teamA;
		teamA = newTeamA;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AnnotatedPackage.MATCH__TEAM_A, oldTeamA, newTeamA);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTeamA(Team newTeamA) {
		if (newTeamA != teamA) {
			NotificationChain msgs = null;
			if (teamA != null)
				msgs = ((InternalEObject)teamA).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AnnotatedPackage.MATCH__TEAM_A, null, msgs);
			if (newTeamA != null)
				msgs = ((InternalEObject)newTeamA).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AnnotatedPackage.MATCH__TEAM_A, null, msgs);
			msgs = basicSetTeamA(newTeamA, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AnnotatedPackage.MATCH__TEAM_A, newTeamA, newTeamA));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Team getTeamB() {
		return teamB;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTeamB(Team newTeamB, NotificationChain msgs) {
		Team oldTeamB = teamB;
		teamB = newTeamB;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AnnotatedPackage.MATCH__TEAM_B, oldTeamB, newTeamB);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTeamB(Team newTeamB) {
		if (newTeamB != teamB) {
			NotificationChain msgs = null;
			if (teamB != null)
				msgs = ((InternalEObject)teamB).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AnnotatedPackage.MATCH__TEAM_B, null, msgs);
			if (newTeamB != null)
				msgs = ((InternalEObject)newTeamB).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AnnotatedPackage.MATCH__TEAM_B, null, msgs);
			msgs = basicSetTeamB(newTeamB, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AnnotatedPackage.MATCH__TEAM_B, newTeamB, newTeamB));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Toss getToss() {
		return toss;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setToss(Toss newToss) {
		Toss oldToss = toss;
		toss = newToss == null ? TOSS_EDEFAULT : newToss;
		boolean oldTossESet = tossESet;
		tossESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AnnotatedPackage.MATCH__TOSS, oldToss, toss, !oldTossESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetToss() {
		Toss oldToss = toss;
		boolean oldTossESet = tossESet;
		toss = TOSS_EDEFAULT;
		tossESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, AnnotatedPackage.MATCH__TOSS, oldToss, TOSS_EDEFAULT, oldTossESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetToss() {
		return tossESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Umpire> getUmpires() {
		if (umpires == null) {
			umpires = new EObjectContainmentEList<Umpire>(Umpire.class, this, AnnotatedPackage.MATCH__UMPIRES);
		}
		return umpires;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MatchResult getResult() {
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setResult(MatchResult newResult) {
		MatchResult oldResult = result;
		result = newResult == null ? RESULT_EDEFAULT : newResult;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AnnotatedPackage.MATCH__RESULT, oldResult, result));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case AnnotatedPackage.MATCH__TEAM_A:
				return basicSetTeamA(null, msgs);
			case AnnotatedPackage.MATCH__TEAM_B:
				return basicSetTeamB(null, msgs);
			case AnnotatedPackage.MATCH__UMPIRES:
				return ((InternalEList<?>)getUmpires()).basicRemove(otherEnd, msgs);
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
			case AnnotatedPackage.MATCH__VEUE:
				if (resolve) return getVeue();
				return basicGetVeue();
			case AnnotatedPackage.MATCH__MATCH_DATE:
				return getMatchDate();
			case AnnotatedPackage.MATCH__OVERS:
				return getOvers();
			case AnnotatedPackage.MATCH__TEAM_A:
				return getTeamA();
			case AnnotatedPackage.MATCH__TEAM_B:
				return getTeamB();
			case AnnotatedPackage.MATCH__TOSS:
				return getToss();
			case AnnotatedPackage.MATCH__UMPIRES:
				return getUmpires();
			case AnnotatedPackage.MATCH__RESULT:
				return getResult();
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
			case AnnotatedPackage.MATCH__VEUE:
				setVeue((Venue)newValue);
				return;
			case AnnotatedPackage.MATCH__MATCH_DATE:
				setMatchDate((Date)newValue);
				return;
			case AnnotatedPackage.MATCH__OVERS:
				setOvers((Integer)newValue);
				return;
			case AnnotatedPackage.MATCH__TEAM_A:
				setTeamA((Team)newValue);
				return;
			case AnnotatedPackage.MATCH__TEAM_B:
				setTeamB((Team)newValue);
				return;
			case AnnotatedPackage.MATCH__TOSS:
				setToss((Toss)newValue);
				return;
			case AnnotatedPackage.MATCH__UMPIRES:
				getUmpires().clear();
				getUmpires().addAll((Collection<? extends Umpire>)newValue);
				return;
			case AnnotatedPackage.MATCH__RESULT:
				setResult((MatchResult)newValue);
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
			case AnnotatedPackage.MATCH__VEUE:
				setVeue((Venue)null);
				return;
			case AnnotatedPackage.MATCH__MATCH_DATE:
				setMatchDate(MATCH_DATE_EDEFAULT);
				return;
			case AnnotatedPackage.MATCH__OVERS:
				setOvers(OVERS_EDEFAULT);
				return;
			case AnnotatedPackage.MATCH__TEAM_A:
				setTeamA((Team)null);
				return;
			case AnnotatedPackage.MATCH__TEAM_B:
				setTeamB((Team)null);
				return;
			case AnnotatedPackage.MATCH__TOSS:
				unsetToss();
				return;
			case AnnotatedPackage.MATCH__UMPIRES:
				getUmpires().clear();
				return;
			case AnnotatedPackage.MATCH__RESULT:
				setResult(RESULT_EDEFAULT);
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
			case AnnotatedPackage.MATCH__VEUE:
				return veue != null;
			case AnnotatedPackage.MATCH__MATCH_DATE:
				return MATCH_DATE_EDEFAULT == null ? matchDate != null : !MATCH_DATE_EDEFAULT.equals(matchDate);
			case AnnotatedPackage.MATCH__OVERS:
				return OVERS_EDEFAULT == null ? overs != null : !OVERS_EDEFAULT.equals(overs);
			case AnnotatedPackage.MATCH__TEAM_A:
				return teamA != null;
			case AnnotatedPackage.MATCH__TEAM_B:
				return teamB != null;
			case AnnotatedPackage.MATCH__TOSS:
				return isSetToss();
			case AnnotatedPackage.MATCH__UMPIRES:
				return umpires != null && !umpires.isEmpty();
			case AnnotatedPackage.MATCH__RESULT:
				return result != RESULT_EDEFAULT;
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
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (matchDate: ");
		result.append(matchDate);
		result.append(", overs: ");
		result.append(overs);
		result.append(", toss: ");
		if (tossESet) result.append(toss); else result.append("<unset>");
		result.append(", result: ");
		result.append(result);
		result.append(')');
		return result.toString();
	}

} //MatchImpl
