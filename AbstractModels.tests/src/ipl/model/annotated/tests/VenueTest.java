/**
 */
package ipl.model.annotated.tests;

import ipl.model.annotated.AnnotatedFactory;
import ipl.model.annotated.Venue;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Venue</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class VenueTest extends AbstractEntityTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(VenueTest.class);
	}

	/**
	 * Constructs a new Venue test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VenueTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Venue test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected Venue getFixture() {
		return (Venue)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(AnnotatedFactory.eINSTANCE.createVenue());
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

} //VenueTest
