/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package west.twouse.language.yuml;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see west.twouse.language.yuml.YumlPackage
 * @generated
 */
public interface YumlFactory extends EFactory {
	/**
   * The singleton instance of the factory.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	YumlFactory eINSTANCE = west.twouse.language.yuml.impl.YumlFactoryImpl.init();

	/**
   * Returns a new object of class '<em>Model</em>'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return a new object of class '<em>Model</em>'.
   * @generated
   */
	Model createModel();

	/**
   * Returns a new object of class '<em>Class</em>'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return a new object of class '<em>Class</em>'.
   * @generated
   */
	Class createClass();

	/**
   * Returns a new object of class '<em>Association</em>'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return a new object of class '<em>Association</em>'.
   * @generated
   */
	Association createAssociation();

	/**
   * Returns a new object of class '<em>Inheritance</em>'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return a new object of class '<em>Inheritance</em>'.
   * @generated
   */
	Inheritance createInheritance();

	/**
   * Returns a new object of class '<em>Cardinality</em>'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return a new object of class '<em>Cardinality</em>'.
   * @generated
   */
	Cardinality createCardinality();

	/**
   * Returns a new object of class '<em>Attribute</em>'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return a new object of class '<em>Attribute</em>'.
   * @generated
   */
	Attribute createAttribute();

	/**
   * Returns a new object of class '<em>Method</em>'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return a new object of class '<em>Method</em>'.
   * @generated
   */
	Method createMethod();

	/**
   * Returns a new object of class '<em>Note</em>'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return a new object of class '<em>Note</em>'.
   * @generated
   */
	Note createNote();

	/**
   * Returns a new object of class '<em>Note Association</em>'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return a new object of class '<em>Note Association</em>'.
   * @generated
   */
	NoteAssociation createNoteAssociation();

	/**
   * Returns a new object of class '<em>Equivalence</em>'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return a new object of class '<em>Equivalence</em>'.
   * @generated
   */
	Equivalence createEquivalence();

	/**
   * Returns the package supported by this factory.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return the package supported by this factory.
   * @generated
   */
	YumlPackage getYumlPackage();

} //YumlFactory
