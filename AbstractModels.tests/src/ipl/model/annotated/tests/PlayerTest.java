/**
 */
package ipl.model.annotated.tests;

import ipl.model.annotated.AnnotatedFactory;
import ipl.model.annotated.Player;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Player</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following operations are tested:
 * <ul>
 *   <li>{@link ipl.model.annotated.Player#canBowl() <em>Can Bowl</em>}</li>
 * </ul>
 * </p>
 * @generated
 */
public class PlayerTest extends AbstractEntityTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(PlayerTest.class);
	}

	/**
	 * Constructs a new Player test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PlayerTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Player test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected Player getFixture() {
		return (Player)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(AnnotatedFactory.eINSTANCE.createPlayer());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#tearDown()
	 * @generated
	 */
	@Override
	protected void tearDown() throws Exception {
		setFixture(null);
	}

	/**
	 * Tests the '{@link ipl.model.annotated.Player#canBowl() <em>Can Bowl</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ipl.model.annotated.Player#canBowl()
	 * @generated
	 */
	public void testCanBowl() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

} //PlayerTest
