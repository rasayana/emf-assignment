/**
 */
package ipl.model.annotated.tests;

import ipl.model.annotated.AnnotatedFactory;
import ipl.model.annotated.WicketKeeper;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Wicket Keeper</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class WicketKeeperTest extends PlayerTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(WicketKeeperTest.class);
	}

	/**
	 * Constructs a new Wicket Keeper test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WicketKeeperTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Wicket Keeper test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected WicketKeeper getFixture() {
		return (WicketKeeper)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(AnnotatedFactory.eINSTANCE.createWicketKeeper());
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

} //WicketKeeperTest
