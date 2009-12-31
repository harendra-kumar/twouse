/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.uniko.isweb.emftext.owl2fs.owl2fs;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Built In ID</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see de.uniko.isweb.emftext.owl2fs.owl2fs.Owl2fsPackage#getBuiltInID()
 * @model
 * @generated
 */
public enum BuiltInID implements Enumerator
{
  /**
   * The '<em><b>EQUAL</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #EQUAL_VALUE
   * @generated
   * @ordered
   */
  EQUAL(0, "EQUAL", "swrlb:equal"),

  /**
   * The '<em><b>NOT EQUAL</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #NOT_EQUAL_VALUE
   * @generated
   * @ordered
   */
  NOT_EQUAL(0, "NOT_EQUAL", "swrlb:notEqual");

  /**
   * The '<em><b>EQUAL</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>EQUAL</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #EQUAL
   * @model literal="swrlb:equal"
   * @generated
   * @ordered
   */
  public static final int EQUAL_VALUE = 0;

  /**
   * The '<em><b>NOT EQUAL</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>NOT EQUAL</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #NOT_EQUAL
   * @model literal="swrlb:notEqual"
   * @generated
   * @ordered
   */
  public static final int NOT_EQUAL_VALUE = 0;

  /**
   * An array of all the '<em><b>Built In ID</b></em>' enumerators.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private static final BuiltInID[] VALUES_ARRAY =
    new BuiltInID[]
    {
      EQUAL,
      NOT_EQUAL,
    };

  /**
   * A public read-only list of all the '<em><b>Built In ID</b></em>' enumerators.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final List<BuiltInID> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

  /**
   * Returns the '<em><b>Built In ID</b></em>' literal with the specified literal value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static BuiltInID get(String literal)
  {
    for (int i = 0; i < VALUES_ARRAY.length; ++i)
    {
      BuiltInID result = VALUES_ARRAY[i];
      if (result.toString().equals(literal))
      {
        return result;
      }
    }
    return null;
  }

  /**
   * Returns the '<em><b>Built In ID</b></em>' literal with the specified name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static BuiltInID getByName(String name)
  {
    for (int i = 0; i < VALUES_ARRAY.length; ++i)
    {
      BuiltInID result = VALUES_ARRAY[i];
      if (result.getName().equals(name))
      {
        return result;
      }
    }
    return null;
  }

  /**
   * Returns the '<em><b>Built In ID</b></em>' literal with the specified integer value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static BuiltInID get(int value)
  {
    switch (value)
    {
      case EQUAL_VALUE: return EQUAL;
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
  private BuiltInID(int value, String name, String literal)
  {
    this.value = value;
    this.name = name;
    this.literal = literal;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public int getValue()
  {
    return value;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getName()
  {
    return name;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getLiteral()
  {
    return literal;
  }

  /**
   * Returns the literal value of the enumerator, which is its string representation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    return literal;
  }
  
} //BuiltInID
