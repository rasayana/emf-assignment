package ipl.model.annotated;

/**
 * @model
 */
public interface Player extends AbstractEntity {
	/**
	 * @model
	 */
	Team getTeam();
	/**
	 * Sets the value of the '{@link ipl.model.annotated.Player#getTeam <em>Team</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Team</em>' reference.
	 * @see #getTeam()
	 * @generated
	 */
	void setTeam(Team value);
	/**
	 * @model
	 */
	Boolean canBowl();
}
