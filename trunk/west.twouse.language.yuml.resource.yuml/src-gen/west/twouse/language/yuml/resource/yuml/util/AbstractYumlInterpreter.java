/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package west.twouse.language.yuml.resource.yuml.util;

/**
 * This class provides basic infrastructure to interpret models. To implement
 * concrete interpreters, subclass this abstract interpreter and override the
 * interprete_* methods. The interpretation can be customized by binding the two
 * type parameters (ResultType, ContextType). The former is returned by all
 * interprete_* methods, while the latter is passed from method to method while
 * traversing the model. The concrete traversal strategy can also be exchanged.
 * One can use a static traversal strategy by pushing all objects to interpret on
 * the interpretation stack (using addObjectToInterprete()) before calling
 * interprete(). Alternatively, the traversal strategy can be dynamic by pushing
 * objects on the interpretation stack during interpretation.
 */
public class AbstractYumlInterpreter<ResultType, ContextType> {
	
	private java.util.Stack<org.eclipse.emf.ecore.EObject> interpretationStack = new java.util.Stack<org.eclipse.emf.ecore.EObject>();
	
	public ResultType interprete(ContextType context) {
		ResultType result = null;
		while (!interpretationStack.empty()) {
			org.eclipse.emf.ecore.EObject next = interpretationStack.pop();
			result = interprete(next, context);
			if (!continueInterpretation(result)) {
				break;
			}
		}
		return result;
	}
	
	/**
	 * Override this method to stop the overall interpretation depending on the result
	 * of the interpretation of a single model elements.
	 */
	public boolean continueInterpretation(ResultType result) {
		return true;
	}
	
	public ResultType interprete(org.eclipse.emf.ecore.EObject object, ContextType context) {
		ResultType result = null;
		if (object instanceof west.twouse.language.yuml.Equivalence) {
			result = interprete_west_twouse_language_yuml_Equivalence((west.twouse.language.yuml.Equivalence) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof west.twouse.language.yuml.NoteAssociation) {
			result = interprete_west_twouse_language_yuml_NoteAssociation((west.twouse.language.yuml.NoteAssociation) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof west.twouse.language.yuml.Note) {
			result = interprete_west_twouse_language_yuml_Note((west.twouse.language.yuml.Note) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof west.twouse.language.yuml.Method) {
			result = interprete_west_twouse_language_yuml_Method((west.twouse.language.yuml.Method) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof west.twouse.language.yuml.Attribute) {
			result = interprete_west_twouse_language_yuml_Attribute((west.twouse.language.yuml.Attribute) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof west.twouse.language.yuml.ClassMember) {
			result = interprete_west_twouse_language_yuml_ClassMember((west.twouse.language.yuml.ClassMember) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof west.twouse.language.yuml.Cardinality) {
			result = interprete_west_twouse_language_yuml_Cardinality((west.twouse.language.yuml.Cardinality) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof west.twouse.language.yuml.Inheritance) {
			result = interprete_west_twouse_language_yuml_Inheritance((west.twouse.language.yuml.Inheritance) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof west.twouse.language.yuml.Association) {
			result = interprete_west_twouse_language_yuml_Association((west.twouse.language.yuml.Association) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof west.twouse.language.yuml.Relationship) {
			result = interprete_west_twouse_language_yuml_Relationship((west.twouse.language.yuml.Relationship) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof west.twouse.language.yuml.Class) {
			result = interprete_west_twouse_language_yuml_Class((west.twouse.language.yuml.Class) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof west.twouse.language.yuml.ColorableElement) {
			result = interprete_west_twouse_language_yuml_ColorableElement((west.twouse.language.yuml.ColorableElement) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof west.twouse.language.yuml.ModelElement) {
			result = interprete_west_twouse_language_yuml_ModelElement((west.twouse.language.yuml.ModelElement) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof west.twouse.language.yuml.Model) {
			result = interprete_west_twouse_language_yuml_Model((west.twouse.language.yuml.Model) object, context);
		}
		if (result != null) {
			return result;
		}
		return result;
	}
	
	public ResultType interprete_west_twouse_language_yuml_Model(west.twouse.language.yuml.Model object, ContextType context) {
		return null;
	}
	
	public ResultType interprete_west_twouse_language_yuml_ModelElement(west.twouse.language.yuml.ModelElement object, ContextType context) {
		return null;
	}
	
	public ResultType interprete_west_twouse_language_yuml_ColorableElement(west.twouse.language.yuml.ColorableElement object, ContextType context) {
		return null;
	}
	
	public ResultType interprete_west_twouse_language_yuml_Class(west.twouse.language.yuml.Class object, ContextType context) {
		return null;
	}
	
	public ResultType interprete_west_twouse_language_yuml_Relationship(west.twouse.language.yuml.Relationship object, ContextType context) {
		return null;
	}
	
	public ResultType interprete_west_twouse_language_yuml_Association(west.twouse.language.yuml.Association object, ContextType context) {
		return null;
	}
	
	public ResultType interprete_west_twouse_language_yuml_Inheritance(west.twouse.language.yuml.Inheritance object, ContextType context) {
		return null;
	}
	
	public ResultType interprete_west_twouse_language_yuml_Cardinality(west.twouse.language.yuml.Cardinality object, ContextType context) {
		return null;
	}
	
	public ResultType interprete_west_twouse_language_yuml_ClassMember(west.twouse.language.yuml.ClassMember object, ContextType context) {
		return null;
	}
	
	public ResultType interprete_west_twouse_language_yuml_Attribute(west.twouse.language.yuml.Attribute object, ContextType context) {
		return null;
	}
	
	public ResultType interprete_west_twouse_language_yuml_Method(west.twouse.language.yuml.Method object, ContextType context) {
		return null;
	}
	
	public ResultType interprete_west_twouse_language_yuml_Note(west.twouse.language.yuml.Note object, ContextType context) {
		return null;
	}
	
	public ResultType interprete_west_twouse_language_yuml_NoteAssociation(west.twouse.language.yuml.NoteAssociation object, ContextType context) {
		return null;
	}
	
	public ResultType interprete_west_twouse_language_yuml_Equivalence(west.twouse.language.yuml.Equivalence object, ContextType context) {
		return null;
	}
	
	public void addObjectToInterprete(org.eclipse.emf.ecore.EObject object) {
		interpretationStack.push(object);
	}
	
}
