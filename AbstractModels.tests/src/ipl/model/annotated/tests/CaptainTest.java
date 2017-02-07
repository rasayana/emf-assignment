/**
 */
package ipl.model.annotated.tests;

import ipl.model.annotated.AnnotatedFactory;
import ipl.model.annotated.Captain;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Captain</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class CaptainTest extends PlayerTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(CaptainTest.class);
	}

	/**
	 * Constructs a new Captain test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CaptainTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Captain test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected Captain getFixture() {
		return (Captain)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(AnnotatedFactory.eINSTANCE.createCaptain());
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

} //CaptainTest
