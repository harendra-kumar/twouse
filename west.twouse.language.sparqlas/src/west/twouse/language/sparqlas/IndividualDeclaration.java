/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package west.twouse.language.sparqlas;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Individual Declaration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link west.twouse.language.sparqlas.IndividualDeclaration#getIndividual <em>Individual</em>}</li>
 *   <li>{@link west.twouse.language.sparqlas.IndividualDeclaration#getIndividualVariable <em>Individual Variable</em>}</li>
 * </ul>
 * </p>
 *
 * @see west.twouse.language.sparqlas.SparqlasPackage#getIndividualDeclaration()
 * @model
 * @generated
 */
public interface IndividualDeclaration extends Declaration
{
  /**
   * Returns the value of the '<em><b>Individual</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Individual</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Individual</em>' containment reference.
   * @see #setIndividual(NamedIndividual)
   * @see west.twouse.language.sparqlas.SparqlasPackage#getIndividualDeclaration_Individual()
   * @model containment="true"
   * @generated
   */
  NamedIndividual getIndividual();

  /**
   * Sets the value of the '{@link west.twouse.language.sparqlas.IndividualDeclaration#getIndividual <em>Individual</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Individual</em>' containment reference.
   * @see #getIndividual()
   * @generated
   */
  void setIndividual(NamedIndividual value);

  /**
   * Returns the value of the '<em><b>Individual Variable</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Individual Variable</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Individual Variable</em>' containment reference.
   * @see #setIndividualVariable(IndividualVariable)
   * @see west.twouse.language.sparqlas.SparqlasPackage#getIndividualDeclaration_IndividualVariable()
   * @model containment="true"
   * @generated
   */
  IndividualVariable getIndividualVariable();

  /**
   * Sets the value of the '{@link west.twouse.language.sparqlas.IndividualDeclaration#getIndividualVariable <em>Individual Variable</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Individual Variable</em>' containment reference.
   * @see #getIndividualVariable()
   * @generated
   */
  void setIndividualVariable(IndividualVariable value);

} // IndividualDeclaration
