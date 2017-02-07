package ipl.model.annotated;

import org.eclipse.emf.ecore.EObject;

/**
 * @model
 */
public interface AbstractEntity extends EObject {
	/**
	 * @model
	 */
	String getName();

	/**
	 * Sets the value of the '{@link ipl.model.annotated.AbstractEntity#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);
}
