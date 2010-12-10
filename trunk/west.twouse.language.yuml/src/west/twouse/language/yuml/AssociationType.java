/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package west.twouse.language.yuml;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Association Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see west.twouse.language.yuml.YumlPackage#getAssociationType()
 * @model
 * @generated
 */
public enum AssociationType implements Enumerator {
	/**
   * The '<em><b>Simple Association</b></em>' literal object.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #SIMPLE_ASSOCIATION_VALUE
   * @generated
   * @ordered
   */
	SIMPLE_ASSOCIATION(1, "simpleAssociation", "simpleAssociation"),

	/**
   * The '<em><b>Aggregation</b></em>' literal object.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #AGGREGATION_VALUE
   * @generated
   * @ordered
   */
	AGGREGATION(2, "aggregation", "aggregation"),

	/**
   * The '<em><b>Composition</b></em>' literal object.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #COMPOSITION_VALUE
   * @generated
   * @ordered
   */
	COMPOSITION(3, "composition", "composition");

	/**
   * The '<em><b>Simple Association</b></em>' literal value.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Simple Association</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @see #SIMPLE_ASSOCIATION
   * @model name="simpleAssociation"
   * @generated
   * @ordered
   */
	public static final int SIMPLE_ASSOCIATION_VALUE = 1;

	/**
   * The '<em><b>Aggregation</b></em>' literal value.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Aggregation</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @see #AGGREGATION
   * @model name="aggregation"
   * @generated
   * @ordered
   */
	public static final int AGGREGATION_VALUE = 2;

	/**
   * The '<em><b>Composition</b></em>' literal value.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Composition</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @see #COMPOSITION
   * @model name="composition"
   * @generated
   * @ordered
   */
	public static final int COMPOSITION_VALUE = 3;

	/**
   * An array of all the '<em><b>Association Type</b></em>' enumerators.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	private static final AssociationType[] VALUES_ARRAY =
		new AssociationType[]
    {
      SIMPLE_ASSOCIATION,
      AGGREGATION,
      COMPOSITION,
    };

	/**
   * A public read-only list of all the '<em><b>Association Type</b></em>' enumerators.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public static final List<AssociationType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
   * Returns the '<em><b>Association Type</b></em>' literal with the specified literal value.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public static AssociationType get(String literal) {
    for (int i = 0; i < VALUES_ARRAY.length; ++i)
    {
      AssociationType result = VALUES_ARRAY[i];
      if (result.toString().equals(literal))
      {
        return result;
      }
    }
    return null;
  }

	/**
   * Returns the '<em><b>Association Type</b></em>' literal with the specified name.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public static AssociationType getByName(String name) {
    for (int i = 0; i < VALUES_ARRAY.length; ++i)
    {
      AssociationType result = VALUES_ARRAY[i];
      if (result.getName().equals(name))
      {
        return result;
      }
    }
    return null;
  }

	/**
   * Returns the '<em><b>Association Type</b></em>' literal with the specified integer value.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public static AssociationType get(int value) {
    switch (value)
    {
      case SIMPLE_ASSOCIATION_VALUE: return SIMPLE_ASSOCIATION;
      case AGGREGATION_VALUE: return AGGREGATION;
      case COMPOSITION_VALUE: return COMPOSITION;
    }
    return null;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	private final int value;

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	private final String name;

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	private final String literal;

	/**
   * Only this class can construct instances.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	private AssociationType(int value, String name, String literal) {
    this.value = value;
    this.name = name;
    this.literal = literal;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public int getValue() {
    return value;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public String getName() {
    return name;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public String getLiteral() {
    return literal;
  }

	/**
   * Returns the literal value of the enumerator, which is its string representation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	@Override
	public String toString() {
    return literal;
  }
	
} //AssociationType
