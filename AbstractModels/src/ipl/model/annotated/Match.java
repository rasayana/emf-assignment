package ipl.model.annotated;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import java.util.Date;

/**
 * @model
 */
public interface Match extends EObject {
	/**
	 * @model
	 */
	Venue getVeue();
	/**
	 * Sets the value of the '{@link ipl.model.annotated.Match#getVeue <em>Veue</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Veue</em>' reference.
	 * @see #getVeue()
	 * @generated
	 */
	void setVeue(Venue value);
	/**
	 * @model
	 */
	Date getMatchDate();
	/**
	 * Sets the value of the '{@link ipl.model.annotated.Match#getMatchDate <em>Match Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Match Date</em>' attribute.
	 * @see #getMatchDate()
	 * @generated
	 */
	void setMatchDate(Date value);
	/**
	 * @model
	 */
	Integer getOvers();
	/**
	 * Sets the value of the '{@link ipl.model.annotated.Match#getOvers <em>Overs</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Overs</em>' attribute.
	 * @see #getOvers()
	 * @generated
	 */
	void setOvers(Integer value);
	/**
	 * @model containment="true"
	 */
	Team getTeamA();
	/**
	 * Sets the value of the '{@link ipl.model.annotated.Match#getTeamA <em>Team A</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Team A</em>' containment reference.
	 * @see #getTeamA()
	 * @generated
	 */
	void setTeamA(Team value);
	/**
	 * @model containment="true"
	 */
	Team getTeamB();
	/**
	 * Sets the value of the '{@link ipl.model.annotated.Match#getTeamB <em>Team B</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Team B</em>' containment reference.
	 * @see #getTeamB()
	 * @generated
	 */
	void setTeamB(Team value);
	/**
	 * @model unsettable="true"
	 */
	Toss getToss();
	/**
	 * Sets the value of the '{@link ipl.model.annotated.Match#getToss <em>Toss</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Toss</em>' attribute.
	 * @see ipl.model.annotated.Toss
	 * @see #isSetToss()
	 * @see #unsetToss()
	 * @see #getToss()
	 * @generated
	 */
	void setToss(Toss value);
	/**
	 * Unsets the value of the '{@link ipl.model.annotated.Match#getToss <em>Toss</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetToss()
	 * @see #getToss()
	 * @see #setToss(Toss)
	 * @generated
	 */
	void unsetToss();
	/**
	 * Returns whether the value of the '{@link ipl.model.annotated.Match#getToss <em>Toss</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Toss</em>' attribute is set.
	 * @see #unsetToss()
	 * @see #getToss()
	 * @see #setToss(Toss)
	 * @generated
	 */
	boolean isSetToss();
	/**
	 * @model type="Umpire" containment="true"
	 */
	EList<Umpire> getUmpires();
	/**
	 * @model
	 */
	MatchResult getResult();
	/**
	 * Sets the value of the '{@link ipl.model.annotated.Match#getResult <em>Result</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Result</em>' attribute.
	 * @see ipl.model.annotated.MatchResult
	 * @see #getResult()
	 * @generated
	 */
	void setResult(MatchResult value);
}
