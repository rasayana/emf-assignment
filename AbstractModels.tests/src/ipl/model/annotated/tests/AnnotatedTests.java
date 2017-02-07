/**
 */
package ipl.model.annotated.tests;

import junit.framework.Test;
import junit.framework.TestSuite;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test suite for the '<em><b>annotated</b></em>' package.
 * <!-- end-user-doc -->
 * @generated
 */
public class AnnotatedTests extends TestSuite {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(suite());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static Test suite() {
		TestSuite suite = new AnnotatedTests("annotated Tests");
		suite.addTestSuite(CaptainTest.class);
		suite.addTestSuite(PlayerTest.class);
		suite.addTestSuite(TeamTest.class);
		suite.addTestSuite(ViceCaptainTest.class);
		suite.addTestSuite(WicketKeeperTest.class);
		return suite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AnnotatedTests(String name) {
		super(name);
	}

} //AnnotatedTests
