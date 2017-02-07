/**
 */
package ipl.model.annotated.tests;

import ipl.model.annotated.AnnotatedFactory;
import ipl.model.annotated.Umpire;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Umpire</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class UmpireTest extends AbstractEntityTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(UmpireTest.class);
	}

	/**
	 * Constructs a new Umpire test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UmpireTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Umpire test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected Umpire getFixture() {
		return (Umpire)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(AnnotatedFactory.eINSTANCE.createUmpire());
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

} //UmpireTest
