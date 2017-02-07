package ipl.model.annotated;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * @model
 */
public interface Team extends EObject {
	/**
	 * @model
	 */
	String getName();
	/**
	 * Sets the value of the '{@link ipl.model.annotated.Team#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);
	/**
	 * @model type="Player" containment="true"
	 */
	EList<Player> getBatsmen();
	/**
	 * @model type="Player" containment="true"
	 */
	EList<Player> getBowlers();
	/**
	 * @model
	 */
	Captain getCaptain();
	/**
	 * Sets the value of the '{@link ipl.model.annotated.Team#getCaptain <em>Captain</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Captain</em>' reference.
	 * @see #getCaptain()
	 * @generated
	 */
	void setCaptain(Captain value);
	/**
	 * @model
	 */
	ViceCaptain getViceCaptain();
	/**
	 * Sets the value of the '{@link ipl.model.annotated.Team#getViceCaptain <em>Vice Captain</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Vice Captain</em>' reference.
	 * @see #getViceCaptain()
	 * @generated
	 */
	void setViceCaptain(ViceCaptain value);
	/**
	 * @model
	 */
	WicketKeeper getWicketKeeper();
	/**
	 * Sets the value of the '{@link ipl.model.annotated.Team#getWicketKeeper <em>Wicket Keeper</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Wicket Keeper</em>' reference.
	 * @see #getWicketKeeper()
	 * @generated
	 */
	void setWicketKeeper(WicketKeeper value);
	/**
	 * @model
	 */
	Player get12thMan();
}