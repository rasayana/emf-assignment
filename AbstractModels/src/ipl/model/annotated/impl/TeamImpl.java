/**
 */
package ipl.model.annotated.impl;

import ipl.model.annotated.AnnotatedPackage;
import ipl.model.annotated.Captain;
import ipl.model.annotated.Player;
import ipl.model.annotated.Team;
import ipl.model.annotated.ViceCaptain;
import ipl.model.annotated.WicketKeeper;

import java.lang.reflect.InvocationTargetException;

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
 * An implementation of the model object '<em><b>Team</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ipl.model.annotated.impl.TeamImpl#getName <em>Name</em>}</li>
 *   <li>{@link ipl.model.annotated.impl.TeamImpl#getBatsmen <em>Batsmen</em>}</li>
 *   <li>{@link ipl.model.annotated.impl.TeamImpl#getBowlers <em>Bowlers</em>}</li>
 *   <li>{@link ipl.model.annotated.impl.TeamImpl#getCaptain <em>Captain</em>}</li>
 *   <li>{@link ipl.model.annotated.impl.TeamImpl#getViceCaptain <em>Vice Captain</em>}</li>
 *   <li>{@link ipl.model.annotated.impl.TeamImpl#getWicketKeeper <em>Wicket Keeper</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TeamImpl extends MinimalEObjectImpl.Container implements Team {
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
	 * The cached value of the '{@link #getBatsmen() <em>Batsmen</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBatsmen()
	 * @generated
	 * @ordered
	 */
	protected EList<Player> batsmen;

	/**
	 * The cached value of the '{@link #getBowlers() <em>Bowlers</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBowlers()
	 * @generated
	 * @ordered
	 */
	protected EList<Player> bowlers;

	/**
	 * The cached value of the '{@link #getCaptain() <em>Captain</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCaptain()
	 * @generated
	 * @ordered
	 */
	protected Captain captain;

	/**
	 * The cached value of the '{@link #getViceCaptain() <em>Vice Captain</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getViceCaptain()
	 * @generated
	 * @ordered
	 */
	protected ViceCaptain viceCaptain;

	/**
	 * The cached value of the '{@link #getWicketKeeper() <em>Wicket Keeper</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWicketKeeper()
	 * @generated
	 * @ordered
	 */
	protected WicketKeeper wicketKeeper;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TeamImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AnnotatedPackage.Literals.TEAM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AnnotatedPackage.TEAM__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Player> getBatsmen() {
		if (batsmen == null) {
			batsmen = new EObjectContainmentEList<Player>(Player.class, this, AnnotatedPackage.TEAM__BATSMEN);
		}
		return batsmen;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Player> getBowlers() {
		if (bowlers == null) {
			bowlers = new EObjectContainmentEList<Player>(Player.class, this, AnnotatedPackage.TEAM__BOWLERS);
		}
		return bowlers;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Captain getCaptain() {
		if (captain != null && captain.eIsProxy()) {
			InternalEObject oldCaptain = (InternalEObject)captain;
			captain = (Captain)eResolveProxy(oldCaptain);
			if (captain != oldCaptain) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AnnotatedPackage.TEAM__CAPTAIN, oldCaptain, captain));
			}
		}
		return captain;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Captain basicGetCaptain() {
		return captain;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCaptain(Captain newCaptain) {
		Captain oldCaptain = captain;
		captain = newCaptain;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AnnotatedPackage.TEAM__CAPTAIN, oldCaptain, captain));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ViceCaptain getViceCaptain() {
		if (viceCaptain != null && viceCaptain.eIsProxy()) {
			InternalEObject oldViceCaptain = (InternalEObject)viceCaptain;
			viceCaptain = (ViceCaptain)eResolveProxy(oldViceCaptain);
			if (viceCaptain != oldViceCaptain) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AnnotatedPackage.TEAM__VICE_CAPTAIN, oldViceCaptain, viceCaptain));
			}
		}
		return viceCaptain;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ViceCaptain basicGetViceCaptain() {
		return viceCaptain;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setViceCaptain(ViceCaptain newViceCaptain) {
		ViceCaptain oldViceCaptain = viceCaptain;
		viceCaptain = newViceCaptain;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AnnotatedPackage.TEAM__VICE_CAPTAIN, oldViceCaptain, viceCaptain));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WicketKeeper getWicketKeeper() {
		if (wicketKeeper != null && wicketKeeper.eIsProxy()) {
			InternalEObject oldWicketKeeper = (InternalEObject)wicketKeeper;
			wicketKeeper = (WicketKeeper)eResolveProxy(oldWicketKeeper);
			if (wicketKeeper != oldWicketKeeper) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AnnotatedPackage.TEAM__WICKET_KEEPER, oldWicketKeeper, wicketKeeper));
			}
		}
		return wicketKeeper;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WicketKeeper basicGetWicketKeeper() {
		return wicketKeeper;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWicketKeeper(WicketKeeper newWicketKeeper) {
		WicketKeeper oldWicketKeeper = wicketKeeper;
		wicketKeeper = newWicketKeeper;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AnnotatedPackage.TEAM__WICKET_KEEPER, oldWicketKeeper, wicketKeeper));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Player get12thMan() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case AnnotatedPackage.TEAM__BATSMEN:
				return ((InternalEList<?>)getBatsmen()).basicRemove(otherEnd, msgs);
			case AnnotatedPackage.TEAM__BOWLERS:
				return ((InternalEList<?>)getBowlers()).basicRemove(otherEnd, msgs);
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
			case AnnotatedPackage.TEAM__NAME:
				return getName();
			case AnnotatedPackage.TEAM__BATSMEN:
				return getBatsmen();
			case AnnotatedPackage.TEAM__BOWLERS:
				return getBowlers();
			case AnnotatedPackage.TEAM__CAPTAIN:
				if (resolve) return getCaptain();
				return basicGetCaptain();
			case AnnotatedPackage.TEAM__VICE_CAPTAIN:
				if (resolve) return getViceCaptain();
				return basicGetViceCaptain();
			case AnnotatedPackage.TEAM__WICKET_KEEPER:
				if (resolve) return getWicketKeeper();
				return basicGetWicketKeeper();
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
			case AnnotatedPackage.TEAM__NAME:
				setName((String)newValue);
				return;
			case AnnotatedPackage.TEAM__BATSMEN:
				getBatsmen().clear();
				getBatsmen().addAll((Collection<? extends Player>)newValue);
				return;
			case AnnotatedPackage.TEAM__BOWLERS:
				getBowlers().clear();
				getBowlers().addAll((Collection<? extends Player>)newValue);
				return;
			case AnnotatedPackage.TEAM__CAPTAIN:
				setCaptain((Captain)newValue);
				return;
			case AnnotatedPackage.TEAM__VICE_CAPTAIN:
				setViceCaptain((ViceCaptain)newValue);
				return;
			case AnnotatedPackage.TEAM__WICKET_KEEPER:
				setWicketKeeper((WicketKeeper)newValue);
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
			case AnnotatedPackage.TEAM__NAME:
				setName(NAME_EDEFAULT);
				return;
			case AnnotatedPackage.TEAM__BATSMEN:
				getBatsmen().clear();
				return;
			case AnnotatedPackage.TEAM__BOWLERS:
				getBowlers().clear();
				return;
			case AnnotatedPackage.TEAM__CAPTAIN:
				setCaptain((Captain)null);
				return;
			case AnnotatedPackage.TEAM__VICE_CAPTAIN:
				setViceCaptain((ViceCaptain)null);
				return;
			case AnnotatedPackage.TEAM__WICKET_KEEPER:
				setWicketKeeper((WicketKeeper)null);
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
			case AnnotatedPackage.TEAM__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case AnnotatedPackage.TEAM__BATSMEN:
				return batsmen != null && !batsmen.isEmpty();
			case AnnotatedPackage.TEAM__BOWLERS:
				return bowlers != null && !bowlers.isEmpty();
			case AnnotatedPackage.TEAM__CAPTAIN:
				return captain != null;
			case AnnotatedPackage.TEAM__VICE_CAPTAIN:
				return viceCaptain != null;
			case AnnotatedPackage.TEAM__WICKET_KEEPER:
				return wicketKeeper != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case AnnotatedPackage.TEAM___GET12TH_MAN:
				return get12thMan();
		}
		return super.eInvoke(operationID, arguments);
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
		result.append(" (name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //TeamImpl
