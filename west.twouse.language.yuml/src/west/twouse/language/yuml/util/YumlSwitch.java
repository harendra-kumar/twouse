/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package west.twouse.language.yuml.util;

import java.util.List;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;

import west.twouse.language.yuml.Association;
import west.twouse.language.yuml.Attribute;
import west.twouse.language.yuml.Cardinality;
import west.twouse.language.yuml.ClassMember;
import west.twouse.language.yuml.ColorableElement;
import west.twouse.language.yuml.Equivalence;
import west.twouse.language.yuml.Inheritance;
import west.twouse.language.yuml.Method;
import west.twouse.language.yuml.Model;
import west.twouse.language.yuml.ModelElement;
import west.twouse.language.yuml.Note;
import west.twouse.language.yuml.NoteAssociation;
import west.twouse.language.yuml.Relationship;
import west.twouse.language.yuml.YumlPackage;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see west.twouse.language.yuml.YumlPackage
 * @generated
 */
public class YumlSwitch<T> {
	/**
   * The cached model package
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	protected static YumlPackage modelPackage;

	/**
   * Creates an instance of the switch.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public YumlSwitch() {
    if (modelPackage == null)
    {
      modelPackage = YumlPackage.eINSTANCE;
    }
  }

	/**
   * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return the first non-null result returned by a <code>caseXXX</code> call.
   * @generated
   */
	public T doSwitch(EObject theEObject) {
    return doSwitch(theEObject.eClass(), theEObject);
  }

	/**
   * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return the first non-null result returned by a <code>caseXXX</code> call.
   * @generated
   */
	protected T doSwitch(EClass theEClass, EObject theEObject) {
    if (theEClass.eContainer() == modelPackage)
    {
      return doSwitch(theEClass.getClassifierID(), theEObject);
    }
    else
    {
      List<EClass> eSuperTypes = theEClass.getESuperTypes();
      return
        eSuperTypes.isEmpty() ?
          defaultCase(theEObject) :
          doSwitch(eSuperTypes.get(0), theEObject);
    }
  }

	/**
   * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return the first non-null result returned by a <code>caseXXX</code> call.
   * @generated
   */
	protected T doSwitch(int classifierID, EObject theEObject) {
    switch (classifierID)
    {
      case YumlPackage.MODEL:
      {
        Model model = (Model)theEObject;
        T result = caseModel(model);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case YumlPackage.MODEL_ELEMENT:
      {
        ModelElement modelElement = (ModelElement)theEObject;
        T result = caseModelElement(modelElement);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case YumlPackage.COLORABLE_ELEMENT:
      {
        ColorableElement colorableElement = (ColorableElement)theEObject;
        T result = caseColorableElement(colorableElement);
        if (result == null) result = caseModelElement(colorableElement);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case YumlPackage.CLASS:
      {
        west.twouse.language.yuml.Class class_ = (west.twouse.language.yuml.Class)theEObject;
        T result = caseClass(class_);
        if (result == null) result = caseColorableElement(class_);
        if (result == null) result = caseModelElement(class_);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case YumlPackage.RELATIONSHIP:
      {
        Relationship relationship = (Relationship)theEObject;
        T result = caseRelationship(relationship);
        if (result == null) result = caseModelElement(relationship);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case YumlPackage.ASSOCIATION:
      {
        Association association = (Association)theEObject;
        T result = caseAssociation(association);
        if (result == null) result = caseRelationship(association);
        if (result == null) result = caseModelElement(association);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case YumlPackage.INHERITANCE:
      {
        Inheritance inheritance = (Inheritance)theEObject;
        T result = caseInheritance(inheritance);
        if (result == null) result = caseRelationship(inheritance);
        if (result == null) result = caseModelElement(inheritance);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case YumlPackage.CARDINALITY:
      {
        Cardinality cardinality = (Cardinality)theEObject;
        T result = caseCardinality(cardinality);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case YumlPackage.CLASS_MEMBER:
      {
        ClassMember classMember = (ClassMember)theEObject;
        T result = caseClassMember(classMember);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case YumlPackage.ATTRIBUTE:
      {
        Attribute attribute = (Attribute)theEObject;
        T result = caseAttribute(attribute);
        if (result == null) result = caseClassMember(attribute);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case YumlPackage.METHOD:
      {
        Method method = (Method)theEObject;
        T result = caseMethod(method);
        if (result == null) result = caseClassMember(method);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case YumlPackage.NOTE:
      {
        Note note = (Note)theEObject;
        T result = caseNote(note);
        if (result == null) result = caseColorableElement(note);
        if (result == null) result = caseModelElement(note);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case YumlPackage.NOTE_ASSOCIATION:
      {
        NoteAssociation noteAssociation = (NoteAssociation)theEObject;
        T result = caseNoteAssociation(noteAssociation);
        if (result == null) result = caseRelationship(noteAssociation);
        if (result == null) result = caseModelElement(noteAssociation);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case YumlPackage.EQUIVALENCE:
      {
        Equivalence equivalence = (Equivalence)theEObject;
        T result = caseEquivalence(equivalence);
        if (result == null) result = caseRelationship(equivalence);
        if (result == null) result = caseModelElement(equivalence);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      default: return defaultCase(theEObject);
    }
  }

	/**
   * Returns the result of interpreting the object as an instance of '<em>Model</em>'.
   * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Model</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
	public T caseModel(Model object) {
    return null;
  }

	/**
   * Returns the result of interpreting the object as an instance of '<em>Model Element</em>'.
   * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Model Element</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
	public T caseModelElement(ModelElement object) {
    return null;
  }

	/**
   * Returns the result of interpreting the object as an instance of '<em>Colorable Element</em>'.
   * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Colorable Element</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
	public T caseColorableElement(ColorableElement object) {
    return null;
  }

	/**
   * Returns the result of interpreting the object as an instance of '<em>Class</em>'.
   * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Class</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
	public T caseClass(west.twouse.language.yuml.Class object) {
    return null;
  }

	/**
   * Returns the result of interpreting the object as an instance of '<em>Relationship</em>'.
   * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Relationship</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
	public T caseRelationship(Relationship object) {
    return null;
  }

	/**
   * Returns the result of interpreting the object as an instance of '<em>Association</em>'.
   * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Association</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
	public T caseAssociation(Association object) {
    return null;
  }

	/**
   * Returns the result of interpreting the object as an instance of '<em>Inheritance</em>'.
   * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Inheritance</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
	public T caseInheritance(Inheritance object) {
    return null;
  }

	/**
   * Returns the result of interpreting the object as an instance of '<em>Cardinality</em>'.
   * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Cardinality</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
	public T caseCardinality(Cardinality object) {
    return null;
  }

	/**
   * Returns the result of interpreting the object as an instance of '<em>Class Member</em>'.
   * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Class Member</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
	public T caseClassMember(ClassMember object) {
    return null;
  }

	/**
   * Returns the result of interpreting the object as an instance of '<em>Attribute</em>'.
   * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Attribute</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
	public T caseAttribute(Attribute object) {
    return null;
  }

	/**
   * Returns the result of interpreting the object as an instance of '<em>Method</em>'.
   * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Method</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
	public T caseMethod(Method object) {
    return null;
  }

	/**
   * Returns the result of interpreting the object as an instance of '<em>Note</em>'.
   * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Note</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
	public T caseNote(Note object) {
    return null;
  }

	/**
   * Returns the result of interpreting the object as an instance of '<em>Note Association</em>'.
   * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Note Association</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
	public T caseNoteAssociation(NoteAssociation object) {
    return null;
  }

	/**
   * Returns the result of interpreting the object as an instance of '<em>Equivalence</em>'.
   * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Equivalence</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
	public T caseEquivalence(Equivalence object) {
    return null;
  }

	/**
   * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
   * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject)
   * @generated
   */
	public T defaultCase(EObject object) {
    return null;
  }

} //YumlSwitch
