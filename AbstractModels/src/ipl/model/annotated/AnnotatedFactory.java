/**
 */
package ipl.model.annotated;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see ipl.model.annotated.AnnotatedPackage
 * @generated
 */
public interface AnnotatedFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	AnnotatedFactory eINSTANCE = ipl.model.annotated.impl.AnnotatedFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Abstract Entity</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Abstract Entity</em>'.
	 * @generated
	 */
	AbstractEntity createAbstractEntity();

	/**
	 * Returns a new object of class '<em>Captain</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Captain</em>'.
	 * @generated
	 */
	Captain createCaptain();

	/**
	 * Returns a new object of class '<em>Match</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Match</em>'.
	 * @generated
	 */
	Match createMatch();

	/**
	 * Returns a new object of class '<em>Player</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Player</em>'.
	 * @generated
	 */
	Player createPlayer();

	/**
	 * Returns a new object of class '<em>Team</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Team</em>'.
	 * @generated
	 */
	Team createTeam();

	/**
	 * Returns a new object of class '<em>Tournament</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Tournament</em>'.
	 * @generated
	 */
	Tournament createTournament();

	/**
	 * Returns a new object of class '<em>Umpire</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Umpire</em>'.
	 * @generated
	 */
	Umpire createUmpire();

	/**
	 * Returns a new object of class '<em>Venue</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Venue</em>'.
	 * @generated
	 */
	Venue createVenue();

	/**
	 * Returns a new object of class '<em>Vice Captain</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Vice Captain</em>'.
	 * @generated
	 */
	ViceCaptain createViceCaptain();

	/**
	 * Returns a new object of class '<em>Wicket Keeper</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Wicket Keeper</em>'.
	 * @generated
	 */
	WicketKeeper createWicketKeeper();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	AnnotatedPackage getAnnotatedPackage();

} //AnnotatedFactory
