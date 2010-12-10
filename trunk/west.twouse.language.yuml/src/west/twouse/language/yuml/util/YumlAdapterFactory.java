/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package west.twouse.language.yuml.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

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
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see west.twouse.language.yuml.YumlPackage
 * @generated
 */
public class YumlAdapterFactory extends AdapterFactoryImpl {
	/**
   * The cached model package.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	protected static YumlPackage modelPackage;

	/**
   * Creates an instance of the adapter factory.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public YumlAdapterFactory() {
    if (modelPackage == null)
    {
      modelPackage = YumlPackage.eINSTANCE;
    }
  }

	/**
   * Returns whether this factory is applicable for the type of the object.
   * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
   * @return whether this factory is applicable for the type of the object.
   * @generated
   */
	@Override
	public boolean isFactoryForType(Object object) {
    if (object == modelPackage)
    {
      return true;
    }
    if (object instanceof EObject)
    {
      return ((EObject)object).eClass().getEPackage() == modelPackage;
    }
    return false;
  }

	/**
   * The switch that delegates to the <code>createXXX</code> methods.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	protected YumlSwitch<Adapter> modelSwitch =
		new YumlSwitch<Adapter>()
    {
      @Override
      public Adapter caseModel(Model object)
      {
        return createModelAdapter();
      }
      @Override
      public Adapter caseModelElement(ModelElement object)
      {
        return createModelElementAdapter();
      }
      @Override
      public Adapter caseColorableElement(ColorableElement object)
      {
        return createColorableElementAdapter();
      }
      @Override
      public Adapter caseClass(west.twouse.language.yuml.Class object)
      {
        return createClassAdapter();
      }
      @Override
      public Adapter caseRelationship(Relationship object)
      {
        return createRelationshipAdapter();
      }
      @Override
      public Adapter caseAssociation(Association object)
      {
        return createAssociationAdapter();
      }
      @Override
      public Adapter caseInheritance(Inheritance object)
      {
        return createInheritanceAdapter();
      }
      @Override
      public Adapter caseCardinality(Cardinality object)
      {
        return createCardinalityAdapter();
      }
      @Override
      public Adapter caseClassMember(ClassMember object)
      {
        return createClassMemberAdapter();
      }
      @Override
      public Adapter caseAttribute(Attribute object)
      {
        return createAttributeAdapter();
      }
      @Override
      public Adapter caseMethod(Method object)
      {
        return createMethodAdapter();
      }
      @Override
      public Adapter caseNote(Note object)
      {
        return createNoteAdapter();
      }
      @Override
      public Adapter caseNoteAssociation(NoteAssociation object)
      {
        return createNoteAssociationAdapter();
      }
      @Override
      public Adapter caseEquivalence(Equivalence object)
      {
        return createEquivalenceAdapter();
      }
      @Override
      public Adapter defaultCase(EObject object)
      {
        return createEObjectAdapter();
      }
    };

	/**
   * Creates an adapter for the <code>target</code>.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param target the object to adapt.
   * @return the adapter for the <code>target</code>.
   * @generated
   */
	@Override
	public Adapter createAdapter(Notifier target) {
    return modelSwitch.doSwitch((EObject)target);
  }


	/**
   * Creates a new adapter for an object of class '{@link west.twouse.language.yuml.Model <em>Model</em>}'.
   * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
   * @return the new adapter.
   * @see west.twouse.language.yuml.Model
   * @generated
   */
	public Adapter createModelAdapter() {
    return null;
  }

	/**
   * Creates a new adapter for an object of class '{@link west.twouse.language.yuml.ModelElement <em>Model Element</em>}'.
   * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
   * @return the new adapter.
   * @see west.twouse.language.yuml.ModelElement
   * @generated
   */
	public Adapter createModelElementAdapter() {
    return null;
  }

	/**
   * Creates a new adapter for an object of class '{@link west.twouse.language.yuml.ColorableElement <em>Colorable Element</em>}'.
   * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
   * @return the new adapter.
   * @see west.twouse.language.yuml.ColorableElement
   * @generated
   */
	public Adapter createColorableElementAdapter() {
    return null;
  }

	/**
   * Creates a new adapter for an object of class '{@link west.twouse.language.yuml.Class <em>Class</em>}'.
   * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
   * @return the new adapter.
   * @see west.twouse.language.yuml.Class
   * @generated
   */
	public Adapter createClassAdapter() {
    return null;
  }

	/**
   * Creates a new adapter for an object of class '{@link west.twouse.language.yuml.Relationship <em>Relationship</em>}'.
   * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
   * @return the new adapter.
   * @see west.twouse.language.yuml.Relationship
   * @generated
   */
	public Adapter createRelationshipAdapter() {
    return null;
  }

	/**
   * Creates a new adapter for an object of class '{@link west.twouse.language.yuml.Association <em>Association</em>}'.
   * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
   * @return the new adapter.
   * @see west.twouse.language.yuml.Association
   * @generated
   */
	public Adapter createAssociationAdapter() {
    return null;
  }

	/**
   * Creates a new adapter for an object of class '{@link west.twouse.language.yuml.Inheritance <em>Inheritance</em>}'.
   * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
   * @return the new adapter.
   * @see west.twouse.language.yuml.Inheritance
   * @generated
   */
	public Adapter createInheritanceAdapter() {
    return null;
  }

	/**
   * Creates a new adapter for an object of class '{@link west.twouse.language.yuml.Cardinality <em>Cardinality</em>}'.
   * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
   * @return the new adapter.
   * @see west.twouse.language.yuml.Cardinality
   * @generated
   */
	public Adapter createCardinalityAdapter() {
    return null;
  }

	/**
   * Creates a new adapter for an object of class '{@link west.twouse.language.yuml.ClassMember <em>Class Member</em>}'.
   * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
   * @return the new adapter.
   * @see west.twouse.language.yuml.ClassMember
   * @generated
   */
	public Adapter createClassMemberAdapter() {
    return null;
  }

	/**
   * Creates a new adapter for an object of class '{@link west.twouse.language.yuml.Attribute <em>Attribute</em>}'.
   * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
   * @return the new adapter.
   * @see west.twouse.language.yuml.Attribute
   * @generated
   */
	public Adapter createAttributeAdapter() {
    return null;
  }

	/**
   * Creates a new adapter for an object of class '{@link west.twouse.language.yuml.Method <em>Method</em>}'.
   * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
   * @return the new adapter.
   * @see west.twouse.language.yuml.Method
   * @generated
   */
	public Adapter createMethodAdapter() {
    return null;
  }

	/**
   * Creates a new adapter for an object of class '{@link west.twouse.language.yuml.Note <em>Note</em>}'.
   * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
   * @return the new adapter.
   * @see west.twouse.language.yuml.Note
   * @generated
   */
	public Adapter createNoteAdapter() {
    return null;
  }

	/**
   * Creates a new adapter for an object of class '{@link west.twouse.language.yuml.NoteAssociation <em>Note Association</em>}'.
   * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
   * @return the new adapter.
   * @see west.twouse.language.yuml.NoteAssociation
   * @generated
   */
	public Adapter createNoteAssociationAdapter() {
    return null;
  }

	/**
   * Creates a new adapter for an object of class '{@link west.twouse.language.yuml.Equivalence <em>Equivalence</em>}'.
   * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
   * @return the new adapter.
   * @see west.twouse.language.yuml.Equivalence
   * @generated
   */
	public Adapter createEquivalenceAdapter() {
    return null;
  }

	/**
   * Creates a new adapter for the default case.
   * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
   * @return the new adapter.
   * @generated
   */
	public Adapter createEObjectAdapter() {
    return null;
  }

} //YumlAdapterFactory
