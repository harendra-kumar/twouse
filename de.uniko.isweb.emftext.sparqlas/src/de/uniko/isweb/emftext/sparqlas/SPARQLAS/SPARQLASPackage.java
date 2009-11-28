/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.uniko.isweb.emftext.sparqlas.SPARQLAS;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see de.uniko.isweb.emftext.sparqlas.SPARQLAS.SPARQLASFactory
 * @model kind="package"
 * @generated
 */
public interface SPARQLASPackage extends EPackage {
	/**
   * The package name.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	String eNAME = "SPARQLAS";

	/**
   * The package namespace URI.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	String eNS_URI = "http://west.uni-koblenz.de/SPARQLAS";

	/**
   * The package namespace name.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	String eNS_PREFIX = "SPARQLAS";

	/**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	SPARQLASPackage eINSTANCE = de.uniko.isweb.emftext.sparqlas.SPARQLAS.impl.SPARQLASPackageImpl.init();

	/**
   * The meta object id for the '{@link de.uniko.isweb.emftext.sparqlas.SPARQLAS.impl.OntologyDocumentImpl <em>Ontology Document</em>}' class.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see de.uniko.isweb.emftext.sparqlas.SPARQLAS.impl.OntologyDocumentImpl
   * @see de.uniko.isweb.emftext.sparqlas.SPARQLAS.impl.SPARQLASPackageImpl#getOntologyDocument()
   * @generated
   */
	int ONTOLOGY_DOCUMENT = 0;

	/**
   * The feature id for the '<em><b>Prefix Definition</b></em>' containment reference list.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int ONTOLOGY_DOCUMENT__PREFIX_DEFINITION = 0;

	/**
   * The feature id for the '<em><b>Query</b></em>' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int ONTOLOGY_DOCUMENT__QUERY = 1;

	/**
   * The number of structural features of the '<em>Ontology Document</em>' class.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int ONTOLOGY_DOCUMENT_FEATURE_COUNT = 2;

	/**
   * The meta object id for the '{@link de.uniko.isweb.emftext.sparqlas.SPARQLAS.impl.PrefixDefinitionImpl <em>Prefix Definition</em>}' class.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see de.uniko.isweb.emftext.sparqlas.SPARQLAS.impl.PrefixDefinitionImpl
   * @see de.uniko.isweb.emftext.sparqlas.SPARQLAS.impl.SPARQLASPackageImpl#getPrefixDefinition()
   * @generated
   */
	int PREFIX_DEFINITION = 1;

	/**
   * The feature id for the '<em><b>Pref</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int PREFIX_DEFINITION__PREF = 0;

	/**
   * The feature id for the '<em><b>Namespace</b></em>' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int PREFIX_DEFINITION__NAMESPACE = 1;

	/**
   * The number of structural features of the '<em>Prefix Definition</em>' class.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int PREFIX_DEFINITION_FEATURE_COUNT = 2;

	/**
   * The meta object id for the '{@link de.uniko.isweb.emftext.sparqlas.SPARQLAS.impl.QueryImpl <em>Query</em>}' class.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see de.uniko.isweb.emftext.sparqlas.SPARQLAS.impl.QueryImpl
   * @see de.uniko.isweb.emftext.sparqlas.SPARQLAS.impl.SPARQLASPackageImpl#getQuery()
   * @generated
   */
	int QUERY = 2;

	/**
   * The feature id for the '<em><b>Query IRI</b></em>' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int QUERY__QUERY_IRI = 0;

	/**
   * The feature id for the '<em><b>Atoms</b></em>' containment reference list.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int QUERY__ATOMS = 1;

	/**
   * The number of structural features of the '<em>Query</em>' class.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int QUERY_FEATURE_COUNT = 2;

	/**
   * The meta object id for the '{@link de.uniko.isweb.emftext.sparqlas.SPARQLAS.impl.AtomImpl <em>Atom</em>}' class.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see de.uniko.isweb.emftext.sparqlas.SPARQLAS.impl.AtomImpl
   * @see de.uniko.isweb.emftext.sparqlas.SPARQLAS.impl.SPARQLASPackageImpl#getAtom()
   * @generated
   */
	int ATOM = 3;

	/**
   * The number of structural features of the '<em>Atom</em>' class.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int ATOM_FEATURE_COUNT = 0;

	/**
   * The meta object id for the '{@link de.uniko.isweb.emftext.sparqlas.SPARQLAS.impl.TermImpl <em>Term</em>}' class.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see de.uniko.isweb.emftext.sparqlas.SPARQLAS.impl.TermImpl
   * @see de.uniko.isweb.emftext.sparqlas.SPARQLAS.impl.SPARQLASPackageImpl#getTerm()
   * @generated
   */
	int TERM = 60;

	/**
   * The number of structural features of the '<em>Term</em>' class.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int TERM_FEATURE_COUNT = 0;

	/**
   * The meta object id for the '{@link de.uniko.isweb.emftext.sparqlas.SPARQLAS.impl.VariableImpl <em>Variable</em>}' class.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see de.uniko.isweb.emftext.sparqlas.SPARQLAS.impl.VariableImpl
   * @see de.uniko.isweb.emftext.sparqlas.SPARQLAS.impl.SPARQLASPackageImpl#getVariable()
   * @generated
   */
	int VARIABLE = 4;

	/**
   * The feature id for the '<em><b>Symbol</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int VARIABLE__SYMBOL = TERM_FEATURE_COUNT + 0;

	/**
   * The number of structural features of the '<em>Variable</em>' class.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int VARIABLE_FEATURE_COUNT = TERM_FEATURE_COUNT + 1;

	/**
   * The meta object id for the '{@link de.uniko.isweb.emftext.sparqlas.SPARQLAS.impl.ClassVariableImpl <em>Class Variable</em>}' class.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see de.uniko.isweb.emftext.sparqlas.SPARQLAS.impl.ClassVariableImpl
   * @see de.uniko.isweb.emftext.sparqlas.SPARQLAS.impl.SPARQLASPackageImpl#getClassVariable()
   * @generated
   */
	int CLASS_VARIABLE = 5;

	/**
   * The feature id for the '<em><b>Symbol</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int CLASS_VARIABLE__SYMBOL = VARIABLE__SYMBOL;

	/**
   * The number of structural features of the '<em>Class Variable</em>' class.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int CLASS_VARIABLE_FEATURE_COUNT = VARIABLE_FEATURE_COUNT + 0;

	/**
   * The meta object id for the '{@link de.uniko.isweb.emftext.sparqlas.SPARQLAS.impl.ObjectPropertyVariableImpl <em>Object Property Variable</em>}' class.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see de.uniko.isweb.emftext.sparqlas.SPARQLAS.impl.ObjectPropertyVariableImpl
   * @see de.uniko.isweb.emftext.sparqlas.SPARQLAS.impl.SPARQLASPackageImpl#getObjectPropertyVariable()
   * @generated
   */
	int OBJECT_PROPERTY_VARIABLE = 6;

	/**
   * The feature id for the '<em><b>Symbol</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int OBJECT_PROPERTY_VARIABLE__SYMBOL = VARIABLE__SYMBOL;

	/**
   * The number of structural features of the '<em>Object Property Variable</em>' class.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int OBJECT_PROPERTY_VARIABLE_FEATURE_COUNT = VARIABLE_FEATURE_COUNT + 0;

	/**
   * The meta object id for the '{@link de.uniko.isweb.emftext.sparqlas.SPARQLAS.impl.DataPropertyVariableImpl <em>Data Property Variable</em>}' class.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see de.uniko.isweb.emftext.sparqlas.SPARQLAS.impl.DataPropertyVariableImpl
   * @see de.uniko.isweb.emftext.sparqlas.SPARQLAS.impl.SPARQLASPackageImpl#getDataPropertyVariable()
   * @generated
   */
	int DATA_PROPERTY_VARIABLE = 7;

	/**
   * The feature id for the '<em><b>Symbol</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int DATA_PROPERTY_VARIABLE__SYMBOL = VARIABLE__SYMBOL;

	/**
   * The number of structural features of the '<em>Data Property Variable</em>' class.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int DATA_PROPERTY_VARIABLE_FEATURE_COUNT = VARIABLE_FEATURE_COUNT + 0;

	/**
   * The meta object id for the '{@link de.uniko.isweb.emftext.sparqlas.SPARQLAS.impl.IndividualVariableImpl <em>Individual Variable</em>}' class.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see de.uniko.isweb.emftext.sparqlas.SPARQLAS.impl.IndividualVariableImpl
   * @see de.uniko.isweb.emftext.sparqlas.SPARQLAS.impl.SPARQLASPackageImpl#getIndividualVariable()
   * @generated
   */
	int INDIVIDUAL_VARIABLE = 8;

	/**
   * The feature id for the '<em><b>Symbol</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int INDIVIDUAL_VARIABLE__SYMBOL = VARIABLE__SYMBOL;

	/**
   * The number of structural features of the '<em>Individual Variable</em>' class.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int INDIVIDUAL_VARIABLE_FEATURE_COUNT = VARIABLE_FEATURE_COUNT + 0;

	/**
   * The meta object id for the '{@link de.uniko.isweb.emftext.sparqlas.SPARQLAS.impl.ExpressionImpl <em>Expression</em>}' class.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see de.uniko.isweb.emftext.sparqlas.SPARQLAS.impl.ExpressionImpl
   * @see de.uniko.isweb.emftext.sparqlas.SPARQLAS.impl.SPARQLASPackageImpl#getExpression()
   * @generated
   */
	int EXPRESSION = 30;

	/**
   * The number of structural features of the '<em>Expression</em>' class.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int EXPRESSION_FEATURE_COUNT = 0;

	/**
   * The meta object id for the '{@link de.uniko.isweb.emftext.sparqlas.SPARQLAS.impl.ClassExpressionImpl <em>Class Expression</em>}' class.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see de.uniko.isweb.emftext.sparqlas.SPARQLAS.impl.ClassExpressionImpl
   * @see de.uniko.isweb.emftext.sparqlas.SPARQLAS.impl.SPARQLASPackageImpl#getClassExpression()
   * @generated
   */
	int CLASS_EXPRESSION = 38;

	/**
   * The number of structural features of the '<em>Class Expression</em>' class.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int CLASS_EXPRESSION_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 0;

	/**
   * The meta object id for the '{@link de.uniko.isweb.emftext.sparqlas.SPARQLAS.impl.ClassImpl <em>Class</em>}' class.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see de.uniko.isweb.emftext.sparqlas.SPARQLAS.impl.ClassImpl
   * @see de.uniko.isweb.emftext.sparqlas.SPARQLAS.impl.SPARQLASPackageImpl#getClass_()
   * @generated
   */
	int CLASS = 9;

	/**
   * The feature id for the '<em><b>Constant IRI</b></em>' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int CLASS__CONSTANT_IRI = CLASS_EXPRESSION_FEATURE_COUNT + 0;

	/**
   * The number of structural features of the '<em>Class</em>' class.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int CLASS_FEATURE_COUNT = CLASS_EXPRESSION_FEATURE_COUNT + 1;

	/**
   * The meta object id for the '{@link de.uniko.isweb.emftext.sparqlas.SPARQLAS.impl.ConstantImpl <em>Constant</em>}' class.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see de.uniko.isweb.emftext.sparqlas.SPARQLAS.impl.ConstantImpl
   * @see de.uniko.isweb.emftext.sparqlas.SPARQLAS.impl.SPARQLASPackageImpl#getConstant()
   * @generated
   */
	int CONSTANT = 59;

	/**
   * The feature id for the '<em><b>Constant IRI</b></em>' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int CONSTANT__CONSTANT_IRI = TERM_FEATURE_COUNT + 0;

	/**
   * The number of structural features of the '<em>Constant</em>' class.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int CONSTANT_FEATURE_COUNT = TERM_FEATURE_COUNT + 1;

	/**
   * The meta object id for the '{@link de.uniko.isweb.emftext.sparqlas.SPARQLAS.impl.DatatypeImpl <em>Datatype</em>}' class.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see de.uniko.isweb.emftext.sparqlas.SPARQLAS.impl.DatatypeImpl
   * @see de.uniko.isweb.emftext.sparqlas.SPARQLAS.impl.SPARQLASPackageImpl#getDatatype()
   * @generated
   */
	int DATATYPE = 10;

	/**
   * The feature id for the '<em><b>Constant IRI</b></em>' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int DATATYPE__CONSTANT_IRI = CONSTANT__CONSTANT_IRI;

	/**
   * The number of structural features of the '<em>Datatype</em>' class.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int DATATYPE_FEATURE_COUNT = CONSTANT_FEATURE_COUNT + 0;

	/**
   * The meta object id for the '{@link de.uniko.isweb.emftext.sparqlas.SPARQLAS.impl.ObjectPropertyExpressionImpl <em>Object Property Expression</em>}' class.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see de.uniko.isweb.emftext.sparqlas.SPARQLAS.impl.ObjectPropertyExpressionImpl
   * @see de.uniko.isweb.emftext.sparqlas.SPARQLAS.impl.SPARQLASPackageImpl#getObjectPropertyExpression()
   * @generated
   */
	int OBJECT_PROPERTY_EXPRESSION = 31;

	/**
   * The number of structural features of the '<em>Object Property Expression</em>' class.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int OBJECT_PROPERTY_EXPRESSION_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 0;

	/**
   * The meta object id for the '{@link de.uniko.isweb.emftext.sparqlas.SPARQLAS.impl.ObjectPropertyImpl <em>Object Property</em>}' class.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see de.uniko.isweb.emftext.sparqlas.SPARQLAS.impl.ObjectPropertyImpl
   * @see de.uniko.isweb.emftext.sparqlas.SPARQLAS.impl.SPARQLASPackageImpl#getObjectProperty()
   * @generated
   */
	int OBJECT_PROPERTY = 11;

	/**
   * The feature id for the '<em><b>Constant IRI</b></em>' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int OBJECT_PROPERTY__CONSTANT_IRI = OBJECT_PROPERTY_EXPRESSION_FEATURE_COUNT + 0;

	/**
   * The number of structural features of the '<em>Object Property</em>' class.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int OBJECT_PROPERTY_FEATURE_COUNT = OBJECT_PROPERTY_EXPRESSION_FEATURE_COUNT + 1;

	/**
   * The meta object id for the '{@link de.uniko.isweb.emftext.sparqlas.SPARQLAS.impl.DataPropertyExpressionImpl <em>Data Property Expression</em>}' class.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see de.uniko.isweb.emftext.sparqlas.SPARQLAS.impl.DataPropertyExpressionImpl
   * @see de.uniko.isweb.emftext.sparqlas.SPARQLAS.impl.SPARQLASPackageImpl#getDataPropertyExpression()
   * @generated
   */
	int DATA_PROPERTY_EXPRESSION = 39;

	/**
   * The number of structural features of the '<em>Data Property Expression</em>' class.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int DATA_PROPERTY_EXPRESSION_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 0;

	/**
   * The meta object id for the '{@link de.uniko.isweb.emftext.sparqlas.SPARQLAS.impl.DataPropertyImpl <em>Data Property</em>}' class.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see de.uniko.isweb.emftext.sparqlas.SPARQLAS.impl.DataPropertyImpl
   * @see de.uniko.isweb.emftext.sparqlas.SPARQLAS.impl.SPARQLASPackageImpl#getDataProperty()
   * @generated
   */
	int DATA_PROPERTY = 12;

	/**
   * The feature id for the '<em><b>Constant IRI</b></em>' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int DATA_PROPERTY__CONSTANT_IRI = DATA_PROPERTY_EXPRESSION_FEATURE_COUNT + 0;

	/**
   * The number of structural features of the '<em>Data Property</em>' class.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int DATA_PROPERTY_FEATURE_COUNT = DATA_PROPERTY_EXPRESSION_FEATURE_COUNT + 1;

	/**
   * The meta object id for the '{@link de.uniko.isweb.emftext.sparqlas.SPARQLAS.impl.IndividualImpl <em>Individual</em>}' class.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see de.uniko.isweb.emftext.sparqlas.SPARQLAS.impl.IndividualImpl
   * @see de.uniko.isweb.emftext.sparqlas.SPARQLAS.impl.SPARQLASPackageImpl#getIndividual()
   * @generated
   */
	int INDIVIDUAL = 13;

	/**
   * The number of structural features of the '<em>Individual</em>' class.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int INDIVIDUAL_FEATURE_COUNT = 0;

	/**
   * The meta object id for the '{@link de.uniko.isweb.emftext.sparqlas.SPARQLAS.impl.NamedIndividualImpl <em>Named Individual</em>}' class.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see de.uniko.isweb.emftext.sparqlas.SPARQLAS.impl.NamedIndividualImpl
   * @see de.uniko.isweb.emftext.sparqlas.SPARQLAS.impl.SPARQLASPackageImpl#getNamedIndividual()
   * @generated
   */
	int NAMED_INDIVIDUAL = 14;

	/**
   * The feature id for the '<em><b>Constant IRI</b></em>' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int NAMED_INDIVIDUAL__CONSTANT_IRI = INDIVIDUAL_FEATURE_COUNT + 0;

	/**
   * The number of structural features of the '<em>Named Individual</em>' class.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int NAMED_INDIVIDUAL_FEATURE_COUNT = INDIVIDUAL_FEATURE_COUNT + 1;

	/**
   * The meta object id for the '{@link de.uniko.isweb.emftext.sparqlas.SPARQLAS.impl.AnonymousIndividualImpl <em>Anonymous Individual</em>}' class.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see de.uniko.isweb.emftext.sparqlas.SPARQLAS.impl.AnonymousIndividualImpl
   * @see de.uniko.isweb.emftext.sparqlas.SPARQLAS.impl.SPARQLASPackageImpl#getAnonymousIndividual()
   * @generated
   */
	int ANONYMOUS_INDIVIDUAL = 15;

	/**
   * The feature id for the '<em><b>Node ID</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int ANONYMOUS_INDIVIDUAL__NODE_ID = INDIVIDUAL_FEATURE_COUNT + 0;

	/**
   * The number of structural features of the '<em>Anonymous Individual</em>' class.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int ANONYMOUS_INDIVIDUAL_FEATURE_COUNT = INDIVIDUAL_FEATURE_COUNT + 1;

	/**
   * The meta object id for the '{@link de.uniko.isweb.emftext.sparqlas.SPARQLAS.impl.LiteralImpl <em>Literal</em>}' class.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see de.uniko.isweb.emftext.sparqlas.SPARQLAS.impl.LiteralImpl
   * @see de.uniko.isweb.emftext.sparqlas.SPARQLAS.impl.SPARQLASPackageImpl#getLiteral()
   * @generated
   */
	int LITERAL = 16;

	/**
   * The feature id for the '<em><b>Lexical Form</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int LITERAL__LEXICAL_FORM = 0;

	/**
   * The feature id for the '<em><b>Datatype</b></em>' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int LITERAL__DATATYPE = 1;

	/**
   * The number of structural features of the '<em>Literal</em>' class.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int LITERAL_FEATURE_COUNT = 2;

	/**
   * The meta object id for the '{@link de.uniko.isweb.emftext.sparqlas.SPARQLAS.impl.ClassAtomImpl <em>Class Atom</em>}' class.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see de.uniko.isweb.emftext.sparqlas.SPARQLAS.impl.ClassAtomImpl
   * @see de.uniko.isweb.emftext.sparqlas.SPARQLAS.impl.SPARQLASPackageImpl#getClassAtom()
   * @generated
   */
	int CLASS_ATOM = 17;

	/**
   * The number of structural features of the '<em>Class Atom</em>' class.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int CLASS_ATOM_FEATURE_COUNT = ATOM_FEATURE_COUNT + 0;

	/**
   * The meta object id for the '{@link de.uniko.isweb.emftext.sparqlas.SPARQLAS.impl.EquivalentClassesImpl <em>Equivalent Classes</em>}' class.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see de.uniko.isweb.emftext.sparqlas.SPARQLAS.impl.EquivalentClassesImpl
   * @see de.uniko.isweb.emftext.sparqlas.SPARQLAS.impl.SPARQLASPackageImpl#getEquivalentClasses()
   * @generated
   */
	int EQUIVALENT_CLASSES = 18;

	/**
   * The feature id for the '<em><b>Class Expressions</b></em>' containment reference list.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int EQUIVALENT_CLASSES__CLASS_EXPRESSIONS = CLASS_ATOM_FEATURE_COUNT + 0;

	/**
   * The number of structural features of the '<em>Equivalent Classes</em>' class.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int EQUIVALENT_CLASSES_FEATURE_COUNT = CLASS_ATOM_FEATURE_COUNT + 1;

	/**
   * The meta object id for the '{@link de.uniko.isweb.emftext.sparqlas.SPARQLAS.impl.SubClassOfImpl <em>Sub Class Of</em>}' class.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see de.uniko.isweb.emftext.sparqlas.SPARQLAS.impl.SubClassOfImpl
   * @see de.uniko.isweb.emftext.sparqlas.SPARQLAS.impl.SPARQLASPackageImpl#getSubClassOf()
   * @generated
   */
	int SUB_CLASS_OF = 19;

	/**
   * The feature id for the '<em><b>Sub Class Expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int SUB_CLASS_OF__SUB_CLASS_EXPRESSION = CLASS_ATOM_FEATURE_COUNT + 0;

	/**
   * The feature id for the '<em><b>Super Class Expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int SUB_CLASS_OF__SUPER_CLASS_EXPRESSION = CLASS_ATOM_FEATURE_COUNT + 1;

	/**
   * The number of structural features of the '<em>Sub Class Of</em>' class.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int SUB_CLASS_OF_FEATURE_COUNT = CLASS_ATOM_FEATURE_COUNT + 2;

	/**
   * The meta object id for the '{@link de.uniko.isweb.emftext.sparqlas.SPARQLAS.impl.DisjointClassesImpl <em>Disjoint Classes</em>}' class.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see de.uniko.isweb.emftext.sparqlas.SPARQLAS.impl.DisjointClassesImpl
   * @see de.uniko.isweb.emftext.sparqlas.SPARQLAS.impl.SPARQLASPackageImpl#getDisjointClasses()
   * @generated
   */
	int DISJOINT_CLASSES = 20;

	/**
   * The feature id for the '<em><b>Class Expressions</b></em>' containment reference list.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int DISJOINT_CLASSES__CLASS_EXPRESSIONS = CLASS_ATOM_FEATURE_COUNT + 0;

	/**
   * The number of structural features of the '<em>Disjoint Classes</em>' class.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int DISJOINT_CLASSES_FEATURE_COUNT = CLASS_ATOM_FEATURE_COUNT + 1;

	/**
   * The meta object id for the '{@link de.uniko.isweb.emftext.sparqlas.SPARQLAS.impl.ObjectPropertyAtomImpl <em>Object Property Atom</em>}' class.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see de.uniko.isweb.emftext.sparqlas.SPARQLAS.impl.ObjectPropertyAtomImpl
   * @see de.uniko.isweb.emftext.sparqlas.SPARQLAS.impl.SPARQLASPackageImpl#getObjectPropertyAtom()
   * @generated
   */
	int OBJECT_PROPERTY_ATOM = 21;

	/**
   * The number of structural features of the '<em>Object Property Atom</em>' class.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int OBJECT_PROPERTY_ATOM_FEATURE_COUNT = ATOM_FEATURE_COUNT + 0;

	/**
   * The meta object id for the '{@link de.uniko.isweb.emftext.sparqlas.SPARQLAS.impl.AssertionImpl <em>Assertion</em>}' class.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see de.uniko.isweb.emftext.sparqlas.SPARQLAS.impl.AssertionImpl
   * @see de.uniko.isweb.emftext.sparqlas.SPARQLAS.impl.SPARQLASPackageImpl#getAssertion()
   * @generated
   */
	int ASSERTION = 22;

	/**
   * The number of structural features of the '<em>Assertion</em>' class.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int ASSERTION_FEATURE_COUNT = ATOM_FEATURE_COUNT + 0;

	/**
   * The meta object id for the '{@link de.uniko.isweb.emftext.sparqlas.SPARQLAS.impl.ObjectPropertyAssertionImpl <em>Object Property Assertion</em>}' class.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see de.uniko.isweb.emftext.sparqlas.SPARQLAS.impl.ObjectPropertyAssertionImpl
   * @see de.uniko.isweb.emftext.sparqlas.SPARQLAS.impl.SPARQLASPackageImpl#getObjectPropertyAssertion()
   * @generated
   */
	int OBJECT_PROPERTY_ASSERTION = 23;

	/**
   * The feature id for the '<em><b>Source Individual</b></em>' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int OBJECT_PROPERTY_ASSERTION__SOURCE_INDIVIDUAL = ASSERTION_FEATURE_COUNT + 0;

	/**
   * The feature id for the '<em><b>Target Individual</b></em>' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int OBJECT_PROPERTY_ASSERTION__TARGET_INDIVIDUAL = ASSERTION_FEATURE_COUNT + 1;

	/**
   * The feature id for the '<em><b>Object Property Expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int OBJECT_PROPERTY_ASSERTION__OBJECT_PROPERTY_EXPRESSION = ASSERTION_FEATURE_COUNT + 2;

	/**
   * The number of structural features of the '<em>Object Property Assertion</em>' class.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int OBJECT_PROPERTY_ASSERTION_FEATURE_COUNT = ASSERTION_FEATURE_COUNT + 3;

	/**
   * The meta object id for the '{@link de.uniko.isweb.emftext.sparqlas.SPARQLAS.impl.DataPropertyAssertionImpl <em>Data Property Assertion</em>}' class.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see de.uniko.isweb.emftext.sparqlas.SPARQLAS.impl.DataPropertyAssertionImpl
   * @see de.uniko.isweb.emftext.sparqlas.SPARQLAS.impl.SPARQLASPackageImpl#getDataPropertyAssertion()
   * @generated
   */
	int DATA_PROPERTY_ASSERTION = 24;

	/**
   * The feature id for the '<em><b>Source Individual</b></em>' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int DATA_PROPERTY_ASSERTION__SOURCE_INDIVIDUAL = ASSERTION_FEATURE_COUNT + 0;

	/**
   * The feature id for the '<em><b>Target Value</b></em>' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int DATA_PROPERTY_ASSERTION__TARGET_VALUE = ASSERTION_FEATURE_COUNT + 1;

	/**
   * The feature id for the '<em><b>Data Property Expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int DATA_PROPERTY_ASSERTION__DATA_PROPERTY_EXPRESSION = ASSERTION_FEATURE_COUNT + 2;

	/**
   * The number of structural features of the '<em>Data Property Assertion</em>' class.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int DATA_PROPERTY_ASSERTION_FEATURE_COUNT = ASSERTION_FEATURE_COUNT + 3;

	/**
   * The meta object id for the '{@link de.uniko.isweb.emftext.sparqlas.SPARQLAS.impl.ClassAssertionImpl <em>Class Assertion</em>}' class.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see de.uniko.isweb.emftext.sparqlas.SPARQLAS.impl.ClassAssertionImpl
   * @see de.uniko.isweb.emftext.sparqlas.SPARQLAS.impl.SPARQLASPackageImpl#getClassAssertion()
   * @generated
   */
	int CLASS_ASSERTION = 25;

	/**
   * The feature id for the '<em><b>Individual</b></em>' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int CLASS_ASSERTION__INDIVIDUAL = ASSERTION_FEATURE_COUNT + 0;

	/**
   * The feature id for the '<em><b>Class Expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int CLASS_ASSERTION__CLASS_EXPRESSION = ASSERTION_FEATURE_COUNT + 1;

	/**
   * The number of structural features of the '<em>Class Assertion</em>' class.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int CLASS_ASSERTION_FEATURE_COUNT = ASSERTION_FEATURE_COUNT + 2;

	/**
   * The meta object id for the '{@link de.uniko.isweb.emftext.sparqlas.SPARQLAS.impl.SameIndividualImpl <em>Same Individual</em>}' class.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see de.uniko.isweb.emftext.sparqlas.SPARQLAS.impl.SameIndividualImpl
   * @see de.uniko.isweb.emftext.sparqlas.SPARQLAS.impl.SPARQLASPackageImpl#getSameIndividual()
   * @generated
   */
	int SAME_INDIVIDUAL = 26;

	/**
   * The feature id for the '<em><b>Individuals</b></em>' containment reference list.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int SAME_INDIVIDUAL__INDIVIDUALS = ASSERTION_FEATURE_COUNT + 0;

	/**
   * The number of structural features of the '<em>Same Individual</em>' class.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int SAME_INDIVIDUAL_FEATURE_COUNT = ASSERTION_FEATURE_COUNT + 1;

	/**
   * The meta object id for the '{@link de.uniko.isweb.emftext.sparqlas.SPARQLAS.impl.DifferentIndividualsImpl <em>Different Individuals</em>}' class.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see de.uniko.isweb.emftext.sparqlas.SPARQLAS.impl.DifferentIndividualsImpl
   * @see de.uniko.isweb.emftext.sparqlas.SPARQLAS.impl.SPARQLASPackageImpl#getDifferentIndividuals()
   * @generated
   */
	int DIFFERENT_INDIVIDUALS = 27;

	/**
   * The feature id for the '<em><b>Individuals</b></em>' containment reference list.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int DIFFERENT_INDIVIDUALS__INDIVIDUALS = ASSERTION_FEATURE_COUNT + 0;

	/**
   * The number of structural features of the '<em>Different Individuals</em>' class.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int DIFFERENT_INDIVIDUALS_FEATURE_COUNT = ASSERTION_FEATURE_COUNT + 1;

	/**
   * The meta object id for the '{@link de.uniko.isweb.emftext.sparqlas.SPARQLAS.impl.EquivalentObjectPropertiesImpl <em>Equivalent Object Properties</em>}' class.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see de.uniko.isweb.emftext.sparqlas.SPARQLAS.impl.EquivalentObjectPropertiesImpl
   * @see de.uniko.isweb.emftext.sparqlas.SPARQLAS.impl.SPARQLASPackageImpl#getEquivalentObjectProperties()
   * @generated
   */
	int EQUIVALENT_OBJECT_PROPERTIES = 28;

	/**
   * The feature id for the '<em><b>Object Property Expression</b></em>' containment reference list.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int EQUIVALENT_OBJECT_PROPERTIES__OBJECT_PROPERTY_EXPRESSION = OBJECT_PROPERTY_ATOM_FEATURE_COUNT + 0;

	/**
   * The number of structural features of the '<em>Equivalent Object Properties</em>' class.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int EQUIVALENT_OBJECT_PROPERTIES_FEATURE_COUNT = OBJECT_PROPERTY_ATOM_FEATURE_COUNT + 1;

	/**
   * The meta object id for the '{@link de.uniko.isweb.emftext.sparqlas.SPARQLAS.impl.SubPropertyOfImpl <em>Sub Property Of</em>}' class.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see de.uniko.isweb.emftext.sparqlas.SPARQLAS.impl.SubPropertyOfImpl
   * @see de.uniko.isweb.emftext.sparqlas.SPARQLAS.impl.SPARQLASPackageImpl#getSubPropertyOf()
   * @generated
   */
	int SUB_PROPERTY_OF = 29;

	/**
   * The feature id for the '<em><b>Sub Object Property Expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int SUB_PROPERTY_OF__SUB_OBJECT_PROPERTY_EXPRESSION = OBJECT_PROPERTY_ATOM_FEATURE_COUNT + 0;

	/**
   * The feature id for the '<em><b>Super Object Property Expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int SUB_PROPERTY_OF__SUPER_OBJECT_PROPERTY_EXPRESSION = OBJECT_PROPERTY_ATOM_FEATURE_COUNT + 1;

	/**
   * The number of structural features of the '<em>Sub Property Of</em>' class.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int SUB_PROPERTY_OF_FEATURE_COUNT = OBJECT_PROPERTY_ATOM_FEATURE_COUNT + 2;

	/**
   * The meta object id for the '{@link de.uniko.isweb.emftext.sparqlas.SPARQLAS.impl.InverseObjectPropertyImpl <em>Inverse Object Property</em>}' class.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see de.uniko.isweb.emftext.sparqlas.SPARQLAS.impl.InverseObjectPropertyImpl
   * @see de.uniko.isweb.emftext.sparqlas.SPARQLAS.impl.SPARQLASPackageImpl#getInverseObjectProperty()
   * @generated
   */
	int INVERSE_OBJECT_PROPERTY = 32;

	/**
   * The feature id for the '<em><b>Object Property</b></em>' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int INVERSE_OBJECT_PROPERTY__OBJECT_PROPERTY = OBJECT_PROPERTY_EXPRESSION_FEATURE_COUNT + 0;

	/**
   * The number of structural features of the '<em>Inverse Object Property</em>' class.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int INVERSE_OBJECT_PROPERTY_FEATURE_COUNT = OBJECT_PROPERTY_EXPRESSION_FEATURE_COUNT + 1;

	/**
   * The meta object id for the '{@link de.uniko.isweb.emftext.sparqlas.SPARQLAS.impl.InverseObjectPropertyAtomImpl <em>Inverse Object Property Atom</em>}' class.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see de.uniko.isweb.emftext.sparqlas.SPARQLAS.impl.InverseObjectPropertyAtomImpl
   * @see de.uniko.isweb.emftext.sparqlas.SPARQLAS.impl.SPARQLASPackageImpl#getInverseObjectPropertyAtom()
   * @generated
   */
	int INVERSE_OBJECT_PROPERTY_ATOM = 33;

	/**
   * The feature id for the '<em><b>Object Property Expression1</b></em>' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int INVERSE_OBJECT_PROPERTY_ATOM__OBJECT_PROPERTY_EXPRESSION1 = OBJECT_PROPERTY_ATOM_FEATURE_COUNT + 0;

	/**
   * The feature id for the '<em><b>Object Property Expression2</b></em>' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int INVERSE_OBJECT_PROPERTY_ATOM__OBJECT_PROPERTY_EXPRESSION2 = OBJECT_PROPERTY_ATOM_FEATURE_COUNT + 1;

	/**
   * The number of structural features of the '<em>Inverse Object Property Atom</em>' class.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int INVERSE_OBJECT_PROPERTY_ATOM_FEATURE_COUNT = OBJECT_PROPERTY_ATOM_FEATURE_COUNT + 2;

	/**
   * The meta object id for the '{@link de.uniko.isweb.emftext.sparqlas.SPARQLAS.impl.FunctionalObjectPropertyImpl <em>Functional Object Property</em>}' class.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see de.uniko.isweb.emftext.sparqlas.SPARQLAS.impl.FunctionalObjectPropertyImpl
   * @see de.uniko.isweb.emftext.sparqlas.SPARQLAS.impl.SPARQLASPackageImpl#getFunctionalObjectProperty()
   * @generated
   */
	int FUNCTIONAL_OBJECT_PROPERTY = 34;

	/**
   * The feature id for the '<em><b>Object Property Expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int FUNCTIONAL_OBJECT_PROPERTY__OBJECT_PROPERTY_EXPRESSION = OBJECT_PROPERTY_ATOM_FEATURE_COUNT + 0;

	/**
   * The number of structural features of the '<em>Functional Object Property</em>' class.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int FUNCTIONAL_OBJECT_PROPERTY_FEATURE_COUNT = OBJECT_PROPERTY_ATOM_FEATURE_COUNT + 1;

	/**
   * The meta object id for the '{@link de.uniko.isweb.emftext.sparqlas.SPARQLAS.impl.InverseFunctionalObjectPropertyImpl <em>Inverse Functional Object Property</em>}' class.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see de.uniko.isweb.emftext.sparqlas.SPARQLAS.impl.InverseFunctionalObjectPropertyImpl
   * @see de.uniko.isweb.emftext.sparqlas.SPARQLAS.impl.SPARQLASPackageImpl#getInverseFunctionalObjectProperty()
   * @generated
   */
	int INVERSE_FUNCTIONAL_OBJECT_PROPERTY = 35;

	/**
   * The feature id for the '<em><b>Object Property Expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int INVERSE_FUNCTIONAL_OBJECT_PROPERTY__OBJECT_PROPERTY_EXPRESSION = OBJECT_PROPERTY_ATOM_FEATURE_COUNT + 0;

	/**
   * The number of structural features of the '<em>Inverse Functional Object Property</em>' class.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int INVERSE_FUNCTIONAL_OBJECT_PROPERTY_FEATURE_COUNT = OBJECT_PROPERTY_ATOM_FEATURE_COUNT + 1;

	/**
   * The meta object id for the '{@link de.uniko.isweb.emftext.sparqlas.SPARQLAS.impl.TransitiveObjectPropertyImpl <em>Transitive Object Property</em>}' class.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see de.uniko.isweb.emftext.sparqlas.SPARQLAS.impl.TransitiveObjectPropertyImpl
   * @see de.uniko.isweb.emftext.sparqlas.SPARQLAS.impl.SPARQLASPackageImpl#getTransitiveObjectProperty()
   * @generated
   */
	int TRANSITIVE_OBJECT_PROPERTY = 36;

	/**
   * The feature id for the '<em><b>Object Property Expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int TRANSITIVE_OBJECT_PROPERTY__OBJECT_PROPERTY_EXPRESSION = OBJECT_PROPERTY_ATOM_FEATURE_COUNT + 0;

	/**
   * The number of structural features of the '<em>Transitive Object Property</em>' class.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int TRANSITIVE_OBJECT_PROPERTY_FEATURE_COUNT = OBJECT_PROPERTY_ATOM_FEATURE_COUNT + 1;

	/**
   * The meta object id for the '{@link de.uniko.isweb.emftext.sparqlas.SPARQLAS.impl.SymmetricObjectPropertyImpl <em>Symmetric Object Property</em>}' class.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see de.uniko.isweb.emftext.sparqlas.SPARQLAS.impl.SymmetricObjectPropertyImpl
   * @see de.uniko.isweb.emftext.sparqlas.SPARQLAS.impl.SPARQLASPackageImpl#getSymmetricObjectProperty()
   * @generated
   */
	int SYMMETRIC_OBJECT_PROPERTY = 37;

	/**
   * The feature id for the '<em><b>Object Property Expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int SYMMETRIC_OBJECT_PROPERTY__OBJECT_PROPERTY_EXPRESSION = OBJECT_PROPERTY_ATOM_FEATURE_COUNT + 0;

	/**
   * The number of structural features of the '<em>Symmetric Object Property</em>' class.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int SYMMETRIC_OBJECT_PROPERTY_FEATURE_COUNT = OBJECT_PROPERTY_ATOM_FEATURE_COUNT + 1;

	/**
   * The meta object id for the '{@link de.uniko.isweb.emftext.sparqlas.SPARQLAS.impl.ObjectUnionOfImpl <em>Object Union Of</em>}' class.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see de.uniko.isweb.emftext.sparqlas.SPARQLAS.impl.ObjectUnionOfImpl
   * @see de.uniko.isweb.emftext.sparqlas.SPARQLAS.impl.SPARQLASPackageImpl#getObjectUnionOf()
   * @generated
   */
	int OBJECT_UNION_OF = 40;

	/**
   * The feature id for the '<em><b>Class Expressions</b></em>' containment reference list.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int OBJECT_UNION_OF__CLASS_EXPRESSIONS = CLASS_EXPRESSION_FEATURE_COUNT + 0;

	/**
   * The number of structural features of the '<em>Object Union Of</em>' class.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int OBJECT_UNION_OF_FEATURE_COUNT = CLASS_EXPRESSION_FEATURE_COUNT + 1;

	/**
   * The meta object id for the '{@link de.uniko.isweb.emftext.sparqlas.SPARQLAS.impl.ObjectComplementOfImpl <em>Object Complement Of</em>}' class.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see de.uniko.isweb.emftext.sparqlas.SPARQLAS.impl.ObjectComplementOfImpl
   * @see de.uniko.isweb.emftext.sparqlas.SPARQLAS.impl.SPARQLASPackageImpl#getObjectComplementOf()
   * @generated
   */
	int OBJECT_COMPLEMENT_OF = 41;

	/**
   * The feature id for the '<em><b>Class Expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int OBJECT_COMPLEMENT_OF__CLASS_EXPRESSION = CLASS_EXPRESSION_FEATURE_COUNT + 0;

	/**
   * The number of structural features of the '<em>Object Complement Of</em>' class.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int OBJECT_COMPLEMENT_OF_FEATURE_COUNT = CLASS_EXPRESSION_FEATURE_COUNT + 1;

	/**
   * The meta object id for the '{@link de.uniko.isweb.emftext.sparqlas.SPARQLAS.impl.ObjectOneOfImpl <em>Object One Of</em>}' class.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see de.uniko.isweb.emftext.sparqlas.SPARQLAS.impl.ObjectOneOfImpl
   * @see de.uniko.isweb.emftext.sparqlas.SPARQLAS.impl.SPARQLASPackageImpl#getObjectOneOf()
   * @generated
   */
	int OBJECT_ONE_OF = 42;

	/**
   * The feature id for the '<em><b>Individuals</b></em>' containment reference list.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int OBJECT_ONE_OF__INDIVIDUALS = CLASS_EXPRESSION_FEATURE_COUNT + 0;

	/**
   * The number of structural features of the '<em>Object One Of</em>' class.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int OBJECT_ONE_OF_FEATURE_COUNT = CLASS_EXPRESSION_FEATURE_COUNT + 1;

	/**
   * The meta object id for the '{@link de.uniko.isweb.emftext.sparqlas.SPARQLAS.impl.ObjectIntersectionOfImpl <em>Object Intersection Of</em>}' class.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see de.uniko.isweb.emftext.sparqlas.SPARQLAS.impl.ObjectIntersectionOfImpl
   * @see de.uniko.isweb.emftext.sparqlas.SPARQLAS.impl.SPARQLASPackageImpl#getObjectIntersectionOf()
   * @generated
   */
	int OBJECT_INTERSECTION_OF = 43;

	/**
   * The feature id for the '<em><b>Class Expressions</b></em>' containment reference list.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int OBJECT_INTERSECTION_OF__CLASS_EXPRESSIONS = CLASS_EXPRESSION_FEATURE_COUNT + 0;

	/**
   * The number of structural features of the '<em>Object Intersection Of</em>' class.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int OBJECT_INTERSECTION_OF_FEATURE_COUNT = CLASS_EXPRESSION_FEATURE_COUNT + 1;

	/**
   * The meta object id for the '{@link de.uniko.isweb.emftext.sparqlas.SPARQLAS.impl.ObjectAllValuesFromImpl <em>Object All Values From</em>}' class.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see de.uniko.isweb.emftext.sparqlas.SPARQLAS.impl.ObjectAllValuesFromImpl
   * @see de.uniko.isweb.emftext.sparqlas.SPARQLAS.impl.SPARQLASPackageImpl#getObjectAllValuesFrom()
   * @generated
   */
	int OBJECT_ALL_VALUES_FROM = 44;

	/**
   * The feature id for the '<em><b>Class Expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int OBJECT_ALL_VALUES_FROM__CLASS_EXPRESSION = CLASS_EXPRESSION_FEATURE_COUNT + 0;

	/**
   * The feature id for the '<em><b>Object Property Expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int OBJECT_ALL_VALUES_FROM__OBJECT_PROPERTY_EXPRESSION = CLASS_EXPRESSION_FEATURE_COUNT + 1;

	/**
   * The number of structural features of the '<em>Object All Values From</em>' class.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int OBJECT_ALL_VALUES_FROM_FEATURE_COUNT = CLASS_EXPRESSION_FEATURE_COUNT + 2;

	/**
   * The meta object id for the '{@link de.uniko.isweb.emftext.sparqlas.SPARQLAS.impl.ObjectSomeValuesFromImpl <em>Object Some Values From</em>}' class.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see de.uniko.isweb.emftext.sparqlas.SPARQLAS.impl.ObjectSomeValuesFromImpl
   * @see de.uniko.isweb.emftext.sparqlas.SPARQLAS.impl.SPARQLASPackageImpl#getObjectSomeValuesFrom()
   * @generated
   */
	int OBJECT_SOME_VALUES_FROM = 45;

	/**
   * The feature id for the '<em><b>Class Expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int OBJECT_SOME_VALUES_FROM__CLASS_EXPRESSION = CLASS_EXPRESSION_FEATURE_COUNT + 0;

	/**
   * The feature id for the '<em><b>Object Property Expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int OBJECT_SOME_VALUES_FROM__OBJECT_PROPERTY_EXPRESSION = CLASS_EXPRESSION_FEATURE_COUNT + 1;

	/**
   * The number of structural features of the '<em>Object Some Values From</em>' class.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int OBJECT_SOME_VALUES_FROM_FEATURE_COUNT = CLASS_EXPRESSION_FEATURE_COUNT + 2;

	/**
   * The meta object id for the '{@link de.uniko.isweb.emftext.sparqlas.SPARQLAS.impl.ObjectHasValueImpl <em>Object Has Value</em>}' class.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see de.uniko.isweb.emftext.sparqlas.SPARQLAS.impl.ObjectHasValueImpl
   * @see de.uniko.isweb.emftext.sparqlas.SPARQLAS.impl.SPARQLASPackageImpl#getObjectHasValue()
   * @generated
   */
	int OBJECT_HAS_VALUE = 46;

	/**
   * The feature id for the '<em><b>Individual</b></em>' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int OBJECT_HAS_VALUE__INDIVIDUAL = CLASS_EXPRESSION_FEATURE_COUNT + 0;

	/**
   * The feature id for the '<em><b>Object Property Expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int OBJECT_HAS_VALUE__OBJECT_PROPERTY_EXPRESSION = CLASS_EXPRESSION_FEATURE_COUNT + 1;

	/**
   * The number of structural features of the '<em>Object Has Value</em>' class.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int OBJECT_HAS_VALUE_FEATURE_COUNT = CLASS_EXPRESSION_FEATURE_COUNT + 2;

	/**
   * The meta object id for the '{@link de.uniko.isweb.emftext.sparqlas.SPARQLAS.impl.ObjectMinCardinalityImpl <em>Object Min Cardinality</em>}' class.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see de.uniko.isweb.emftext.sparqlas.SPARQLAS.impl.ObjectMinCardinalityImpl
   * @see de.uniko.isweb.emftext.sparqlas.SPARQLAS.impl.SPARQLASPackageImpl#getObjectMinCardinality()
   * @generated
   */
	int OBJECT_MIN_CARDINALITY = 47;

	/**
   * The feature id for the '<em><b>Cardinality</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int OBJECT_MIN_CARDINALITY__CARDINALITY = CLASS_EXPRESSION_FEATURE_COUNT + 0;

	/**
   * The feature id for the '<em><b>Class Expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int OBJECT_MIN_CARDINALITY__CLASS_EXPRESSION = CLASS_EXPRESSION_FEATURE_COUNT + 1;

	/**
   * The feature id for the '<em><b>Object Property Expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int OBJECT_MIN_CARDINALITY__OBJECT_PROPERTY_EXPRESSION = CLASS_EXPRESSION_FEATURE_COUNT + 2;

	/**
   * The number of structural features of the '<em>Object Min Cardinality</em>' class.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int OBJECT_MIN_CARDINALITY_FEATURE_COUNT = CLASS_EXPRESSION_FEATURE_COUNT + 3;

	/**
   * The meta object id for the '{@link de.uniko.isweb.emftext.sparqlas.SPARQLAS.impl.ObjectMaxCardinalityImpl <em>Object Max Cardinality</em>}' class.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see de.uniko.isweb.emftext.sparqlas.SPARQLAS.impl.ObjectMaxCardinalityImpl
   * @see de.uniko.isweb.emftext.sparqlas.SPARQLAS.impl.SPARQLASPackageImpl#getObjectMaxCardinality()
   * @generated
   */
	int OBJECT_MAX_CARDINALITY = 48;

	/**
   * The feature id for the '<em><b>Cardinality</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int OBJECT_MAX_CARDINALITY__CARDINALITY = CLASS_EXPRESSION_FEATURE_COUNT + 0;

	/**
   * The feature id for the '<em><b>Class Expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int OBJECT_MAX_CARDINALITY__CLASS_EXPRESSION = CLASS_EXPRESSION_FEATURE_COUNT + 1;

	/**
   * The feature id for the '<em><b>Object Property Expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int OBJECT_MAX_CARDINALITY__OBJECT_PROPERTY_EXPRESSION = CLASS_EXPRESSION_FEATURE_COUNT + 2;

	/**
   * The number of structural features of the '<em>Object Max Cardinality</em>' class.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int OBJECT_MAX_CARDINALITY_FEATURE_COUNT = CLASS_EXPRESSION_FEATURE_COUNT + 3;

	/**
   * The meta object id for the '{@link de.uniko.isweb.emftext.sparqlas.SPARQLAS.impl.ObjectExactCardinalityImpl <em>Object Exact Cardinality</em>}' class.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see de.uniko.isweb.emftext.sparqlas.SPARQLAS.impl.ObjectExactCardinalityImpl
   * @see de.uniko.isweb.emftext.sparqlas.SPARQLAS.impl.SPARQLASPackageImpl#getObjectExactCardinality()
   * @generated
   */
	int OBJECT_EXACT_CARDINALITY = 49;

	/**
   * The feature id for the '<em><b>Cardinality</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int OBJECT_EXACT_CARDINALITY__CARDINALITY = CLASS_EXPRESSION_FEATURE_COUNT + 0;

	/**
   * The feature id for the '<em><b>Class Expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int OBJECT_EXACT_CARDINALITY__CLASS_EXPRESSION = CLASS_EXPRESSION_FEATURE_COUNT + 1;

	/**
   * The feature id for the '<em><b>Object Property Expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int OBJECT_EXACT_CARDINALITY__OBJECT_PROPERTY_EXPRESSION = CLASS_EXPRESSION_FEATURE_COUNT + 2;

	/**
   * The number of structural features of the '<em>Object Exact Cardinality</em>' class.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int OBJECT_EXACT_CARDINALITY_FEATURE_COUNT = CLASS_EXPRESSION_FEATURE_COUNT + 3;

	/**
   * The meta object id for the '{@link de.uniko.isweb.emftext.sparqlas.SPARQLAS.impl.DataHasValueImpl <em>Data Has Value</em>}' class.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see de.uniko.isweb.emftext.sparqlas.SPARQLAS.impl.DataHasValueImpl
   * @see de.uniko.isweb.emftext.sparqlas.SPARQLAS.impl.SPARQLASPackageImpl#getDataHasValue()
   * @generated
   */
	int DATA_HAS_VALUE = 50;

	/**
   * The feature id for the '<em><b>Literal</b></em>' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int DATA_HAS_VALUE__LITERAL = CLASS_EXPRESSION_FEATURE_COUNT + 0;

	/**
   * The feature id for the '<em><b>Data Property Expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int DATA_HAS_VALUE__DATA_PROPERTY_EXPRESSION = CLASS_EXPRESSION_FEATURE_COUNT + 1;

	/**
   * The number of structural features of the '<em>Data Has Value</em>' class.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int DATA_HAS_VALUE_FEATURE_COUNT = CLASS_EXPRESSION_FEATURE_COUNT + 2;

	/**
   * The meta object id for the '{@link de.uniko.isweb.emftext.sparqlas.SPARQLAS.impl.IRIImpl <em>IRI</em>}' class.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see de.uniko.isweb.emftext.sparqlas.SPARQLAS.impl.IRIImpl
   * @see de.uniko.isweb.emftext.sparqlas.SPARQLAS.impl.SPARQLASPackageImpl#getIRI()
   * @generated
   */
	int IRI = 51;

	/**
   * The feature id for the '<em><b>Id</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int IRI__ID = 0;

	/**
   * The number of structural features of the '<em>IRI</em>' class.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int IRI_FEATURE_COUNT = 1;

	/**
   * The meta object id for the '{@link de.uniko.isweb.emftext.sparqlas.SPARQLAS.impl.FullIRIImpl <em>Full IRI</em>}' class.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see de.uniko.isweb.emftext.sparqlas.SPARQLAS.impl.FullIRIImpl
   * @see de.uniko.isweb.emftext.sparqlas.SPARQLAS.impl.SPARQLASPackageImpl#getFullIRI()
   * @generated
   */
	int FULL_IRI = 52;

	/**
   * The feature id for the '<em><b>Id</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int FULL_IRI__ID = IRI__ID;

	/**
   * The number of structural features of the '<em>Full IRI</em>' class.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int FULL_IRI_FEATURE_COUNT = IRI_FEATURE_COUNT + 0;

	/**
   * The meta object id for the '{@link de.uniko.isweb.emftext.sparqlas.SPARQLAS.impl.AbbreviatedIRIImpl <em>Abbreviated IRI</em>}' class.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see de.uniko.isweb.emftext.sparqlas.SPARQLAS.impl.AbbreviatedIRIImpl
   * @see de.uniko.isweb.emftext.sparqlas.SPARQLAS.impl.SPARQLASPackageImpl#getAbbreviatedIRI()
   * @generated
   */
	int ABBREVIATED_IRI = 53;

	/**
   * The feature id for the '<em><b>Id</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int ABBREVIATED_IRI__ID = IRI__ID;

	/**
   * The number of structural features of the '<em>Abbreviated IRI</em>' class.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int ABBREVIATED_IRI_FEATURE_COUNT = IRI_FEATURE_COUNT + 0;

	/**
   * The meta object id for the '{@link de.uniko.isweb.emftext.sparqlas.SPARQLAS.impl.DeclarationImpl <em>Declaration</em>}' class.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see de.uniko.isweb.emftext.sparqlas.SPARQLAS.impl.DeclarationImpl
   * @see de.uniko.isweb.emftext.sparqlas.SPARQLAS.impl.SPARQLASPackageImpl#getDeclaration()
   * @generated
   */
	int DECLARATION = 54;

	/**
   * The number of structural features of the '<em>Declaration</em>' class.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int DECLARATION_FEATURE_COUNT = ATOM_FEATURE_COUNT + 0;

	/**
   * The meta object id for the '{@link de.uniko.isweb.emftext.sparqlas.SPARQLAS.impl.ObjectPropertyDeclarationImpl <em>Object Property Declaration</em>}' class.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see de.uniko.isweb.emftext.sparqlas.SPARQLAS.impl.ObjectPropertyDeclarationImpl
   * @see de.uniko.isweb.emftext.sparqlas.SPARQLAS.impl.SPARQLASPackageImpl#getObjectPropertyDeclaration()
   * @generated
   */
	int OBJECT_PROPERTY_DECLARATION = 55;

	/**
   * The feature id for the '<em><b>Object Property Variable</b></em>' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int OBJECT_PROPERTY_DECLARATION__OBJECT_PROPERTY_VARIABLE = DECLARATION_FEATURE_COUNT + 0;

	/**
   * The number of structural features of the '<em>Object Property Declaration</em>' class.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int OBJECT_PROPERTY_DECLARATION_FEATURE_COUNT = DECLARATION_FEATURE_COUNT + 1;

	/**
   * The meta object id for the '{@link de.uniko.isweb.emftext.sparqlas.SPARQLAS.impl.DatatypePropertyDeclarationImpl <em>Datatype Property Declaration</em>}' class.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see de.uniko.isweb.emftext.sparqlas.SPARQLAS.impl.DatatypePropertyDeclarationImpl
   * @see de.uniko.isweb.emftext.sparqlas.SPARQLAS.impl.SPARQLASPackageImpl#getDatatypePropertyDeclaration()
   * @generated
   */
	int DATATYPE_PROPERTY_DECLARATION = 56;

	/**
   * The feature id for the '<em><b>Datatype Property Variable</b></em>' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int DATATYPE_PROPERTY_DECLARATION__DATATYPE_PROPERTY_VARIABLE = DECLARATION_FEATURE_COUNT + 0;

	/**
   * The number of structural features of the '<em>Datatype Property Declaration</em>' class.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int DATATYPE_PROPERTY_DECLARATION_FEATURE_COUNT = DECLARATION_FEATURE_COUNT + 1;

	/**
   * The meta object id for the '{@link de.uniko.isweb.emftext.sparqlas.SPARQLAS.impl.IndividualDeclarationImpl <em>Individual Declaration</em>}' class.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see de.uniko.isweb.emftext.sparqlas.SPARQLAS.impl.IndividualDeclarationImpl
   * @see de.uniko.isweb.emftext.sparqlas.SPARQLAS.impl.SPARQLASPackageImpl#getIndividualDeclaration()
   * @generated
   */
	int INDIVIDUAL_DECLARATION = 57;

	/**
   * The feature id for the '<em><b>Individual Variable</b></em>' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int INDIVIDUAL_DECLARATION__INDIVIDUAL_VARIABLE = DECLARATION_FEATURE_COUNT + 0;

	/**
   * The number of structural features of the '<em>Individual Declaration</em>' class.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int INDIVIDUAL_DECLARATION_FEATURE_COUNT = DECLARATION_FEATURE_COUNT + 1;

	/**
   * The meta object id for the '{@link de.uniko.isweb.emftext.sparqlas.SPARQLAS.impl.ClassDeclarationImpl <em>Class Declaration</em>}' class.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see de.uniko.isweb.emftext.sparqlas.SPARQLAS.impl.ClassDeclarationImpl
   * @see de.uniko.isweb.emftext.sparqlas.SPARQLAS.impl.SPARQLASPackageImpl#getClassDeclaration()
   * @generated
   */
	int CLASS_DECLARATION = 58;

	/**
   * The feature id for the '<em><b>Class Variable</b></em>' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int CLASS_DECLARATION__CLASS_VARIABLE = DECLARATION_FEATURE_COUNT + 0;

	/**
   * The number of structural features of the '<em>Class Declaration</em>' class.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int CLASS_DECLARATION_FEATURE_COUNT = DECLARATION_FEATURE_COUNT + 1;


	/**
   * Returns the meta object for class '{@link de.uniko.isweb.emftext.sparqlas.SPARQLAS.OntologyDocument <em>Ontology Document</em>}'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return the meta object for class '<em>Ontology Document</em>'.
   * @see de.uniko.isweb.emftext.sparqlas.SPARQLAS.OntologyDocument
   * @generated
   */
	EClass getOntologyDocument();

	/**
   * Returns the meta object for the containment reference list '{@link de.uniko.isweb.emftext.sparqlas.SPARQLAS.OntologyDocument#getPrefixDefinition <em>Prefix Definition</em>}'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Prefix Definition</em>'.
   * @see de.uniko.isweb.emftext.sparqlas.SPARQLAS.OntologyDocument#getPrefixDefinition()
   * @see #getOntologyDocument()
   * @generated
   */
	EReference getOntologyDocument_PrefixDefinition();

	/**
   * Returns the meta object for the containment reference '{@link de.uniko.isweb.emftext.sparqlas.SPARQLAS.OntologyDocument#getQuery <em>Query</em>}'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Query</em>'.
   * @see de.uniko.isweb.emftext.sparqlas.SPARQLAS.OntologyDocument#getQuery()
   * @see #getOntologyDocument()
   * @generated
   */
	EReference getOntologyDocument_Query();

	/**
   * Returns the meta object for class '{@link de.uniko.isweb.emftext.sparqlas.SPARQLAS.PrefixDefinition <em>Prefix Definition</em>}'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return the meta object for class '<em>Prefix Definition</em>'.
   * @see de.uniko.isweb.emftext.sparqlas.SPARQLAS.PrefixDefinition
   * @generated
   */
	EClass getPrefixDefinition();

	/**
   * Returns the meta object for the attribute '{@link de.uniko.isweb.emftext.sparqlas.SPARQLAS.PrefixDefinition#getPref <em>Pref</em>}'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Pref</em>'.
   * @see de.uniko.isweb.emftext.sparqlas.SPARQLAS.PrefixDefinition#getPref()
   * @see #getPrefixDefinition()
   * @generated
   */
	EAttribute getPrefixDefinition_Pref();

	/**
   * Returns the meta object for the containment reference '{@link de.uniko.isweb.emftext.sparqlas.SPARQLAS.PrefixDefinition#getNamespace <em>Namespace</em>}'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Namespace</em>'.
   * @see de.uniko.isweb.emftext.sparqlas.SPARQLAS.PrefixDefinition#getNamespace()
   * @see #getPrefixDefinition()
   * @generated
   */
	EReference getPrefixDefinition_Namespace();

	/**
   * Returns the meta object for class '{@link de.uniko.isweb.emftext.sparqlas.SPARQLAS.Query <em>Query</em>}'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return the meta object for class '<em>Query</em>'.
   * @see de.uniko.isweb.emftext.sparqlas.SPARQLAS.Query
   * @generated
   */
	EClass getQuery();

	/**
   * Returns the meta object for the containment reference '{@link de.uniko.isweb.emftext.sparqlas.SPARQLAS.Query#getQueryIRI <em>Query IRI</em>}'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Query IRI</em>'.
   * @see de.uniko.isweb.emftext.sparqlas.SPARQLAS.Query#getQueryIRI()
   * @see #getQuery()
   * @generated
   */
	EReference getQuery_QueryIRI();

	/**
   * Returns the meta object for the containment reference list '{@link de.uniko.isweb.emftext.sparqlas.SPARQLAS.Query#getAtoms <em>Atoms</em>}'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Atoms</em>'.
   * @see de.uniko.isweb.emftext.sparqlas.SPARQLAS.Query#getAtoms()
   * @see #getQuery()
   * @generated
   */
	EReference getQuery_Atoms();

	/**
   * Returns the meta object for class '{@link de.uniko.isweb.emftext.sparqlas.SPARQLAS.Atom <em>Atom</em>}'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return the meta object for class '<em>Atom</em>'.
   * @see de.uniko.isweb.emftext.sparqlas.SPARQLAS.Atom
   * @generated
   */
	EClass getAtom();

	/**
   * Returns the meta object for class '{@link de.uniko.isweb.emftext.sparqlas.SPARQLAS.Variable <em>Variable</em>}'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return the meta object for class '<em>Variable</em>'.
   * @see de.uniko.isweb.emftext.sparqlas.SPARQLAS.Variable
   * @generated
   */
	EClass getVariable();

	/**
   * Returns the meta object for the attribute '{@link de.uniko.isweb.emftext.sparqlas.SPARQLAS.Variable#getSymbol <em>Symbol</em>}'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Symbol</em>'.
   * @see de.uniko.isweb.emftext.sparqlas.SPARQLAS.Variable#getSymbol()
   * @see #getVariable()
   * @generated
   */
	EAttribute getVariable_Symbol();

	/**
   * Returns the meta object for class '{@link de.uniko.isweb.emftext.sparqlas.SPARQLAS.ClassVariable <em>Class Variable</em>}'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return the meta object for class '<em>Class Variable</em>'.
   * @see de.uniko.isweb.emftext.sparqlas.SPARQLAS.ClassVariable
   * @generated
   */
	EClass getClassVariable();

	/**
   * Returns the meta object for class '{@link de.uniko.isweb.emftext.sparqlas.SPARQLAS.ObjectPropertyVariable <em>Object Property Variable</em>}'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return the meta object for class '<em>Object Property Variable</em>'.
   * @see de.uniko.isweb.emftext.sparqlas.SPARQLAS.ObjectPropertyVariable
   * @generated
   */
	EClass getObjectPropertyVariable();

	/**
   * Returns the meta object for class '{@link de.uniko.isweb.emftext.sparqlas.SPARQLAS.DataPropertyVariable <em>Data Property Variable</em>}'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return the meta object for class '<em>Data Property Variable</em>'.
   * @see de.uniko.isweb.emftext.sparqlas.SPARQLAS.DataPropertyVariable
   * @generated
   */
	EClass getDataPropertyVariable();

	/**
   * Returns the meta object for class '{@link de.uniko.isweb.emftext.sparqlas.SPARQLAS.IndividualVariable <em>Individual Variable</em>}'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return the meta object for class '<em>Individual Variable</em>'.
   * @see de.uniko.isweb.emftext.sparqlas.SPARQLAS.IndividualVariable
   * @generated
   */
	EClass getIndividualVariable();

	/**
   * Returns the meta object for class '{@link de.uniko.isweb.emftext.sparqlas.SPARQLAS.Class <em>Class</em>}'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return the meta object for class '<em>Class</em>'.
   * @see de.uniko.isweb.emftext.sparqlas.SPARQLAS.Class
   * @generated
   */
	EClass getClass_();

	/**
   * Returns the meta object for class '{@link de.uniko.isweb.emftext.sparqlas.SPARQLAS.Datatype <em>Datatype</em>}'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return the meta object for class '<em>Datatype</em>'.
   * @see de.uniko.isweb.emftext.sparqlas.SPARQLAS.Datatype
   * @generated
   */
	EClass getDatatype();

	/**
   * Returns the meta object for class '{@link de.uniko.isweb.emftext.sparqlas.SPARQLAS.ObjectProperty <em>Object Property</em>}'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return the meta object for class '<em>Object Property</em>'.
   * @see de.uniko.isweb.emftext.sparqlas.SPARQLAS.ObjectProperty
   * @generated
   */
	EClass getObjectProperty();

	/**
   * Returns the meta object for class '{@link de.uniko.isweb.emftext.sparqlas.SPARQLAS.DataProperty <em>Data Property</em>}'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return the meta object for class '<em>Data Property</em>'.
   * @see de.uniko.isweb.emftext.sparqlas.SPARQLAS.DataProperty
   * @generated
   */
	EClass getDataProperty();

	/**
   * Returns the meta object for class '{@link de.uniko.isweb.emftext.sparqlas.SPARQLAS.Individual <em>Individual</em>}'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return the meta object for class '<em>Individual</em>'.
   * @see de.uniko.isweb.emftext.sparqlas.SPARQLAS.Individual
   * @generated
   */
	EClass getIndividual();

	/**
   * Returns the meta object for class '{@link de.uniko.isweb.emftext.sparqlas.SPARQLAS.NamedIndividual <em>Named Individual</em>}'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return the meta object for class '<em>Named Individual</em>'.
   * @see de.uniko.isweb.emftext.sparqlas.SPARQLAS.NamedIndividual
   * @generated
   */
	EClass getNamedIndividual();

	/**
   * Returns the meta object for class '{@link de.uniko.isweb.emftext.sparqlas.SPARQLAS.AnonymousIndividual <em>Anonymous Individual</em>}'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return the meta object for class '<em>Anonymous Individual</em>'.
   * @see de.uniko.isweb.emftext.sparqlas.SPARQLAS.AnonymousIndividual
   * @generated
   */
	EClass getAnonymousIndividual();

	/**
   * Returns the meta object for the attribute '{@link de.uniko.isweb.emftext.sparqlas.SPARQLAS.AnonymousIndividual#getNodeID <em>Node ID</em>}'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Node ID</em>'.
   * @see de.uniko.isweb.emftext.sparqlas.SPARQLAS.AnonymousIndividual#getNodeID()
   * @see #getAnonymousIndividual()
   * @generated
   */
	EAttribute getAnonymousIndividual_NodeID();

	/**
   * Returns the meta object for class '{@link de.uniko.isweb.emftext.sparqlas.SPARQLAS.Literal <em>Literal</em>}'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return the meta object for class '<em>Literal</em>'.
   * @see de.uniko.isweb.emftext.sparqlas.SPARQLAS.Literal
   * @generated
   */
	EClass getLiteral();

	/**
   * Returns the meta object for the attribute '{@link de.uniko.isweb.emftext.sparqlas.SPARQLAS.Literal#getLexicalForm <em>Lexical Form</em>}'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Lexical Form</em>'.
   * @see de.uniko.isweb.emftext.sparqlas.SPARQLAS.Literal#getLexicalForm()
   * @see #getLiteral()
   * @generated
   */
	EAttribute getLiteral_LexicalForm();

	/**
   * Returns the meta object for the containment reference '{@link de.uniko.isweb.emftext.sparqlas.SPARQLAS.Literal#getDatatype <em>Datatype</em>}'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Datatype</em>'.
   * @see de.uniko.isweb.emftext.sparqlas.SPARQLAS.Literal#getDatatype()
   * @see #getLiteral()
   * @generated
   */
	EReference getLiteral_Datatype();

	/**
   * Returns the meta object for class '{@link de.uniko.isweb.emftext.sparqlas.SPARQLAS.ClassAtom <em>Class Atom</em>}'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return the meta object for class '<em>Class Atom</em>'.
   * @see de.uniko.isweb.emftext.sparqlas.SPARQLAS.ClassAtom
   * @generated
   */
	EClass getClassAtom();

	/**
   * Returns the meta object for class '{@link de.uniko.isweb.emftext.sparqlas.SPARQLAS.EquivalentClasses <em>Equivalent Classes</em>}'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return the meta object for class '<em>Equivalent Classes</em>'.
   * @see de.uniko.isweb.emftext.sparqlas.SPARQLAS.EquivalentClasses
   * @generated
   */
	EClass getEquivalentClasses();

	/**
   * Returns the meta object for the containment reference list '{@link de.uniko.isweb.emftext.sparqlas.SPARQLAS.EquivalentClasses#getClassExpressions <em>Class Expressions</em>}'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Class Expressions</em>'.
   * @see de.uniko.isweb.emftext.sparqlas.SPARQLAS.EquivalentClasses#getClassExpressions()
   * @see #getEquivalentClasses()
   * @generated
   */
	EReference getEquivalentClasses_ClassExpressions();

	/**
   * Returns the meta object for class '{@link de.uniko.isweb.emftext.sparqlas.SPARQLAS.SubClassOf <em>Sub Class Of</em>}'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return the meta object for class '<em>Sub Class Of</em>'.
   * @see de.uniko.isweb.emftext.sparqlas.SPARQLAS.SubClassOf
   * @generated
   */
	EClass getSubClassOf();

	/**
   * Returns the meta object for the containment reference '{@link de.uniko.isweb.emftext.sparqlas.SPARQLAS.SubClassOf#getSubClassExpression <em>Sub Class Expression</em>}'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Sub Class Expression</em>'.
   * @see de.uniko.isweb.emftext.sparqlas.SPARQLAS.SubClassOf#getSubClassExpression()
   * @see #getSubClassOf()
   * @generated
   */
	EReference getSubClassOf_SubClassExpression();

	/**
   * Returns the meta object for the containment reference '{@link de.uniko.isweb.emftext.sparqlas.SPARQLAS.SubClassOf#getSuperClassExpression <em>Super Class Expression</em>}'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Super Class Expression</em>'.
   * @see de.uniko.isweb.emftext.sparqlas.SPARQLAS.SubClassOf#getSuperClassExpression()
   * @see #getSubClassOf()
   * @generated
   */
	EReference getSubClassOf_SuperClassExpression();

	/**
   * Returns the meta object for class '{@link de.uniko.isweb.emftext.sparqlas.SPARQLAS.DisjointClasses <em>Disjoint Classes</em>}'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return the meta object for class '<em>Disjoint Classes</em>'.
   * @see de.uniko.isweb.emftext.sparqlas.SPARQLAS.DisjointClasses
   * @generated
   */
	EClass getDisjointClasses();

	/**
   * Returns the meta object for the containment reference list '{@link de.uniko.isweb.emftext.sparqlas.SPARQLAS.DisjointClasses#getClassExpressions <em>Class Expressions</em>}'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Class Expressions</em>'.
   * @see de.uniko.isweb.emftext.sparqlas.SPARQLAS.DisjointClasses#getClassExpressions()
   * @see #getDisjointClasses()
   * @generated
   */
	EReference getDisjointClasses_ClassExpressions();

	/**
   * Returns the meta object for class '{@link de.uniko.isweb.emftext.sparqlas.SPARQLAS.ObjectPropertyAtom <em>Object Property Atom</em>}'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return the meta object for class '<em>Object Property Atom</em>'.
   * @see de.uniko.isweb.emftext.sparqlas.SPARQLAS.ObjectPropertyAtom
   * @generated
   */
	EClass getObjectPropertyAtom();

	/**
   * Returns the meta object for class '{@link de.uniko.isweb.emftext.sparqlas.SPARQLAS.Assertion <em>Assertion</em>}'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return the meta object for class '<em>Assertion</em>'.
   * @see de.uniko.isweb.emftext.sparqlas.SPARQLAS.Assertion
   * @generated
   */
	EClass getAssertion();

	/**
   * Returns the meta object for class '{@link de.uniko.isweb.emftext.sparqlas.SPARQLAS.ObjectPropertyAssertion <em>Object Property Assertion</em>}'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return the meta object for class '<em>Object Property Assertion</em>'.
   * @see de.uniko.isweb.emftext.sparqlas.SPARQLAS.ObjectPropertyAssertion
   * @generated
   */
	EClass getObjectPropertyAssertion();

	/**
   * Returns the meta object for the containment reference '{@link de.uniko.isweb.emftext.sparqlas.SPARQLAS.ObjectPropertyAssertion#getSourceIndividual <em>Source Individual</em>}'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Source Individual</em>'.
   * @see de.uniko.isweb.emftext.sparqlas.SPARQLAS.ObjectPropertyAssertion#getSourceIndividual()
   * @see #getObjectPropertyAssertion()
   * @generated
   */
	EReference getObjectPropertyAssertion_SourceIndividual();

	/**
   * Returns the meta object for the containment reference '{@link de.uniko.isweb.emftext.sparqlas.SPARQLAS.ObjectPropertyAssertion#getTargetIndividual <em>Target Individual</em>}'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Target Individual</em>'.
   * @see de.uniko.isweb.emftext.sparqlas.SPARQLAS.ObjectPropertyAssertion#getTargetIndividual()
   * @see #getObjectPropertyAssertion()
   * @generated
   */
	EReference getObjectPropertyAssertion_TargetIndividual();

	/**
   * Returns the meta object for the containment reference '{@link de.uniko.isweb.emftext.sparqlas.SPARQLAS.ObjectPropertyAssertion#getObjectPropertyExpression <em>Object Property Expression</em>}'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Object Property Expression</em>'.
   * @see de.uniko.isweb.emftext.sparqlas.SPARQLAS.ObjectPropertyAssertion#getObjectPropertyExpression()
   * @see #getObjectPropertyAssertion()
   * @generated
   */
	EReference getObjectPropertyAssertion_ObjectPropertyExpression();

	/**
   * Returns the meta object for class '{@link de.uniko.isweb.emftext.sparqlas.SPARQLAS.DataPropertyAssertion <em>Data Property Assertion</em>}'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return the meta object for class '<em>Data Property Assertion</em>'.
   * @see de.uniko.isweb.emftext.sparqlas.SPARQLAS.DataPropertyAssertion
   * @generated
   */
	EClass getDataPropertyAssertion();

	/**
   * Returns the meta object for the containment reference '{@link de.uniko.isweb.emftext.sparqlas.SPARQLAS.DataPropertyAssertion#getSourceIndividual <em>Source Individual</em>}'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Source Individual</em>'.
   * @see de.uniko.isweb.emftext.sparqlas.SPARQLAS.DataPropertyAssertion#getSourceIndividual()
   * @see #getDataPropertyAssertion()
   * @generated
   */
	EReference getDataPropertyAssertion_SourceIndividual();

	/**
   * Returns the meta object for the containment reference '{@link de.uniko.isweb.emftext.sparqlas.SPARQLAS.DataPropertyAssertion#getTargetValue <em>Target Value</em>}'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Target Value</em>'.
   * @see de.uniko.isweb.emftext.sparqlas.SPARQLAS.DataPropertyAssertion#getTargetValue()
   * @see #getDataPropertyAssertion()
   * @generated
   */
	EReference getDataPropertyAssertion_TargetValue();

	/**
   * Returns the meta object for the containment reference '{@link de.uniko.isweb.emftext.sparqlas.SPARQLAS.DataPropertyAssertion#getDataPropertyExpression <em>Data Property Expression</em>}'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Data Property Expression</em>'.
   * @see de.uniko.isweb.emftext.sparqlas.SPARQLAS.DataPropertyAssertion#getDataPropertyExpression()
   * @see #getDataPropertyAssertion()
   * @generated
   */
	EReference getDataPropertyAssertion_DataPropertyExpression();

	/**
   * Returns the meta object for class '{@link de.uniko.isweb.emftext.sparqlas.SPARQLAS.ClassAssertion <em>Class Assertion</em>}'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return the meta object for class '<em>Class Assertion</em>'.
   * @see de.uniko.isweb.emftext.sparqlas.SPARQLAS.ClassAssertion
   * @generated
   */
	EClass getClassAssertion();

	/**
   * Returns the meta object for the containment reference '{@link de.uniko.isweb.emftext.sparqlas.SPARQLAS.ClassAssertion#getIndividual <em>Individual</em>}'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Individual</em>'.
   * @see de.uniko.isweb.emftext.sparqlas.SPARQLAS.ClassAssertion#getIndividual()
   * @see #getClassAssertion()
   * @generated
   */
	EReference getClassAssertion_Individual();

	/**
   * Returns the meta object for the containment reference '{@link de.uniko.isweb.emftext.sparqlas.SPARQLAS.ClassAssertion#getClassExpression <em>Class Expression</em>}'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Class Expression</em>'.
   * @see de.uniko.isweb.emftext.sparqlas.SPARQLAS.ClassAssertion#getClassExpression()
   * @see #getClassAssertion()
   * @generated
   */
	EReference getClassAssertion_ClassExpression();

	/**
   * Returns the meta object for class '{@link de.uniko.isweb.emftext.sparqlas.SPARQLAS.SameIndividual <em>Same Individual</em>}'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return the meta object for class '<em>Same Individual</em>'.
   * @see de.uniko.isweb.emftext.sparqlas.SPARQLAS.SameIndividual
   * @generated
   */
	EClass getSameIndividual();

	/**
   * Returns the meta object for the containment reference list '{@link de.uniko.isweb.emftext.sparqlas.SPARQLAS.SameIndividual#getIndividuals <em>Individuals</em>}'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Individuals</em>'.
   * @see de.uniko.isweb.emftext.sparqlas.SPARQLAS.SameIndividual#getIndividuals()
   * @see #getSameIndividual()
   * @generated
   */
	EReference getSameIndividual_Individuals();

	/**
   * Returns the meta object for class '{@link de.uniko.isweb.emftext.sparqlas.SPARQLAS.DifferentIndividuals <em>Different Individuals</em>}'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return the meta object for class '<em>Different Individuals</em>'.
   * @see de.uniko.isweb.emftext.sparqlas.SPARQLAS.DifferentIndividuals
   * @generated
   */
	EClass getDifferentIndividuals();

	/**
   * Returns the meta object for the containment reference list '{@link de.uniko.isweb.emftext.sparqlas.SPARQLAS.DifferentIndividuals#getIndividuals <em>Individuals</em>}'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Individuals</em>'.
   * @see de.uniko.isweb.emftext.sparqlas.SPARQLAS.DifferentIndividuals#getIndividuals()
   * @see #getDifferentIndividuals()
   * @generated
   */
	EReference getDifferentIndividuals_Individuals();

	/**
   * Returns the meta object for class '{@link de.uniko.isweb.emftext.sparqlas.SPARQLAS.EquivalentObjectProperties <em>Equivalent Object Properties</em>}'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return the meta object for class '<em>Equivalent Object Properties</em>'.
   * @see de.uniko.isweb.emftext.sparqlas.SPARQLAS.EquivalentObjectProperties
   * @generated
   */
	EClass getEquivalentObjectProperties();

	/**
   * Returns the meta object for the containment reference list '{@link de.uniko.isweb.emftext.sparqlas.SPARQLAS.EquivalentObjectProperties#getObjectPropertyExpression <em>Object Property Expression</em>}'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Object Property Expression</em>'.
   * @see de.uniko.isweb.emftext.sparqlas.SPARQLAS.EquivalentObjectProperties#getObjectPropertyExpression()
   * @see #getEquivalentObjectProperties()
   * @generated
   */
	EReference getEquivalentObjectProperties_ObjectPropertyExpression();

	/**
   * Returns the meta object for class '{@link de.uniko.isweb.emftext.sparqlas.SPARQLAS.SubPropertyOf <em>Sub Property Of</em>}'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return the meta object for class '<em>Sub Property Of</em>'.
   * @see de.uniko.isweb.emftext.sparqlas.SPARQLAS.SubPropertyOf
   * @generated
   */
	EClass getSubPropertyOf();

	/**
   * Returns the meta object for the containment reference '{@link de.uniko.isweb.emftext.sparqlas.SPARQLAS.SubPropertyOf#getSubObjectPropertyExpression <em>Sub Object Property Expression</em>}'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Sub Object Property Expression</em>'.
   * @see de.uniko.isweb.emftext.sparqlas.SPARQLAS.SubPropertyOf#getSubObjectPropertyExpression()
   * @see #getSubPropertyOf()
   * @generated
   */
	EReference getSubPropertyOf_SubObjectPropertyExpression();

	/**
   * Returns the meta object for the containment reference '{@link de.uniko.isweb.emftext.sparqlas.SPARQLAS.SubPropertyOf#getSuperObjectPropertyExpression <em>Super Object Property Expression</em>}'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Super Object Property Expression</em>'.
   * @see de.uniko.isweb.emftext.sparqlas.SPARQLAS.SubPropertyOf#getSuperObjectPropertyExpression()
   * @see #getSubPropertyOf()
   * @generated
   */
	EReference getSubPropertyOf_SuperObjectPropertyExpression();

	/**
   * Returns the meta object for class '{@link de.uniko.isweb.emftext.sparqlas.SPARQLAS.Expression <em>Expression</em>}'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return the meta object for class '<em>Expression</em>'.
   * @see de.uniko.isweb.emftext.sparqlas.SPARQLAS.Expression
   * @generated
   */
	EClass getExpression();

	/**
   * Returns the meta object for class '{@link de.uniko.isweb.emftext.sparqlas.SPARQLAS.ObjectPropertyExpression <em>Object Property Expression</em>}'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return the meta object for class '<em>Object Property Expression</em>'.
   * @see de.uniko.isweb.emftext.sparqlas.SPARQLAS.ObjectPropertyExpression
   * @generated
   */
	EClass getObjectPropertyExpression();

	/**
   * Returns the meta object for class '{@link de.uniko.isweb.emftext.sparqlas.SPARQLAS.InverseObjectProperty <em>Inverse Object Property</em>}'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return the meta object for class '<em>Inverse Object Property</em>'.
   * @see de.uniko.isweb.emftext.sparqlas.SPARQLAS.InverseObjectProperty
   * @generated
   */
	EClass getInverseObjectProperty();

	/**
   * Returns the meta object for the containment reference '{@link de.uniko.isweb.emftext.sparqlas.SPARQLAS.InverseObjectProperty#getObjectProperty <em>Object Property</em>}'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Object Property</em>'.
   * @see de.uniko.isweb.emftext.sparqlas.SPARQLAS.InverseObjectProperty#getObjectProperty()
   * @see #getInverseObjectProperty()
   * @generated
   */
	EReference getInverseObjectProperty_ObjectProperty();

	/**
   * Returns the meta object for class '{@link de.uniko.isweb.emftext.sparqlas.SPARQLAS.InverseObjectPropertyAtom <em>Inverse Object Property Atom</em>}'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return the meta object for class '<em>Inverse Object Property Atom</em>'.
   * @see de.uniko.isweb.emftext.sparqlas.SPARQLAS.InverseObjectPropertyAtom
   * @generated
   */
	EClass getInverseObjectPropertyAtom();

	/**
   * Returns the meta object for the containment reference '{@link de.uniko.isweb.emftext.sparqlas.SPARQLAS.InverseObjectPropertyAtom#getObjectPropertyExpression1 <em>Object Property Expression1</em>}'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Object Property Expression1</em>'.
   * @see de.uniko.isweb.emftext.sparqlas.SPARQLAS.InverseObjectPropertyAtom#getObjectPropertyExpression1()
   * @see #getInverseObjectPropertyAtom()
   * @generated
   */
	EReference getInverseObjectPropertyAtom_ObjectPropertyExpression1();

	/**
   * Returns the meta object for the containment reference '{@link de.uniko.isweb.emftext.sparqlas.SPARQLAS.InverseObjectPropertyAtom#getObjectPropertyExpression2 <em>Object Property Expression2</em>}'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Object Property Expression2</em>'.
   * @see de.uniko.isweb.emftext.sparqlas.SPARQLAS.InverseObjectPropertyAtom#getObjectPropertyExpression2()
   * @see #getInverseObjectPropertyAtom()
   * @generated
   */
	EReference getInverseObjectPropertyAtom_ObjectPropertyExpression2();

	/**
   * Returns the meta object for class '{@link de.uniko.isweb.emftext.sparqlas.SPARQLAS.FunctionalObjectProperty <em>Functional Object Property</em>}'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return the meta object for class '<em>Functional Object Property</em>'.
   * @see de.uniko.isweb.emftext.sparqlas.SPARQLAS.FunctionalObjectProperty
   * @generated
   */
	EClass getFunctionalObjectProperty();

	/**
   * Returns the meta object for the containment reference '{@link de.uniko.isweb.emftext.sparqlas.SPARQLAS.FunctionalObjectProperty#getObjectPropertyExpression <em>Object Property Expression</em>}'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Object Property Expression</em>'.
   * @see de.uniko.isweb.emftext.sparqlas.SPARQLAS.FunctionalObjectProperty#getObjectPropertyExpression()
   * @see #getFunctionalObjectProperty()
   * @generated
   */
	EReference getFunctionalObjectProperty_ObjectPropertyExpression();

	/**
   * Returns the meta object for class '{@link de.uniko.isweb.emftext.sparqlas.SPARQLAS.InverseFunctionalObjectProperty <em>Inverse Functional Object Property</em>}'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return the meta object for class '<em>Inverse Functional Object Property</em>'.
   * @see de.uniko.isweb.emftext.sparqlas.SPARQLAS.InverseFunctionalObjectProperty
   * @generated
   */
	EClass getInverseFunctionalObjectProperty();

	/**
   * Returns the meta object for the containment reference '{@link de.uniko.isweb.emftext.sparqlas.SPARQLAS.InverseFunctionalObjectProperty#getObjectPropertyExpression <em>Object Property Expression</em>}'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Object Property Expression</em>'.
   * @see de.uniko.isweb.emftext.sparqlas.SPARQLAS.InverseFunctionalObjectProperty#getObjectPropertyExpression()
   * @see #getInverseFunctionalObjectProperty()
   * @generated
   */
	EReference getInverseFunctionalObjectProperty_ObjectPropertyExpression();

	/**
   * Returns the meta object for class '{@link de.uniko.isweb.emftext.sparqlas.SPARQLAS.TransitiveObjectProperty <em>Transitive Object Property</em>}'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return the meta object for class '<em>Transitive Object Property</em>'.
   * @see de.uniko.isweb.emftext.sparqlas.SPARQLAS.TransitiveObjectProperty
   * @generated
   */
	EClass getTransitiveObjectProperty();

	/**
   * Returns the meta object for the containment reference '{@link de.uniko.isweb.emftext.sparqlas.SPARQLAS.TransitiveObjectProperty#getObjectPropertyExpression <em>Object Property Expression</em>}'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Object Property Expression</em>'.
   * @see de.uniko.isweb.emftext.sparqlas.SPARQLAS.TransitiveObjectProperty#getObjectPropertyExpression()
   * @see #getTransitiveObjectProperty()
   * @generated
   */
	EReference getTransitiveObjectProperty_ObjectPropertyExpression();

	/**
   * Returns the meta object for class '{@link de.uniko.isweb.emftext.sparqlas.SPARQLAS.SymmetricObjectProperty <em>Symmetric Object Property</em>}'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return the meta object for class '<em>Symmetric Object Property</em>'.
   * @see de.uniko.isweb.emftext.sparqlas.SPARQLAS.SymmetricObjectProperty
   * @generated
   */
	EClass getSymmetricObjectProperty();

	/**
   * Returns the meta object for the containment reference '{@link de.uniko.isweb.emftext.sparqlas.SPARQLAS.SymmetricObjectProperty#getObjectPropertyExpression <em>Object Property Expression</em>}'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Object Property Expression</em>'.
   * @see de.uniko.isweb.emftext.sparqlas.SPARQLAS.SymmetricObjectProperty#getObjectPropertyExpression()
   * @see #getSymmetricObjectProperty()
   * @generated
   */
	EReference getSymmetricObjectProperty_ObjectPropertyExpression();

	/**
   * Returns the meta object for class '{@link de.uniko.isweb.emftext.sparqlas.SPARQLAS.ClassExpression <em>Class Expression</em>}'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return the meta object for class '<em>Class Expression</em>'.
   * @see de.uniko.isweb.emftext.sparqlas.SPARQLAS.ClassExpression
   * @generated
   */
	EClass getClassExpression();

	/**
   * Returns the meta object for class '{@link de.uniko.isweb.emftext.sparqlas.SPARQLAS.DataPropertyExpression <em>Data Property Expression</em>}'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return the meta object for class '<em>Data Property Expression</em>'.
   * @see de.uniko.isweb.emftext.sparqlas.SPARQLAS.DataPropertyExpression
   * @generated
   */
	EClass getDataPropertyExpression();

	/**
   * Returns the meta object for class '{@link de.uniko.isweb.emftext.sparqlas.SPARQLAS.ObjectUnionOf <em>Object Union Of</em>}'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return the meta object for class '<em>Object Union Of</em>'.
   * @see de.uniko.isweb.emftext.sparqlas.SPARQLAS.ObjectUnionOf
   * @generated
   */
	EClass getObjectUnionOf();

	/**
   * Returns the meta object for the containment reference list '{@link de.uniko.isweb.emftext.sparqlas.SPARQLAS.ObjectUnionOf#getClassExpressions <em>Class Expressions</em>}'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Class Expressions</em>'.
   * @see de.uniko.isweb.emftext.sparqlas.SPARQLAS.ObjectUnionOf#getClassExpressions()
   * @see #getObjectUnionOf()
   * @generated
   */
	EReference getObjectUnionOf_ClassExpressions();

	/**
   * Returns the meta object for class '{@link de.uniko.isweb.emftext.sparqlas.SPARQLAS.ObjectComplementOf <em>Object Complement Of</em>}'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return the meta object for class '<em>Object Complement Of</em>'.
   * @see de.uniko.isweb.emftext.sparqlas.SPARQLAS.ObjectComplementOf
   * @generated
   */
	EClass getObjectComplementOf();

	/**
   * Returns the meta object for the containment reference '{@link de.uniko.isweb.emftext.sparqlas.SPARQLAS.ObjectComplementOf#getClassExpression <em>Class Expression</em>}'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Class Expression</em>'.
   * @see de.uniko.isweb.emftext.sparqlas.SPARQLAS.ObjectComplementOf#getClassExpression()
   * @see #getObjectComplementOf()
   * @generated
   */
	EReference getObjectComplementOf_ClassExpression();

	/**
   * Returns the meta object for class '{@link de.uniko.isweb.emftext.sparqlas.SPARQLAS.ObjectOneOf <em>Object One Of</em>}'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return the meta object for class '<em>Object One Of</em>'.
   * @see de.uniko.isweb.emftext.sparqlas.SPARQLAS.ObjectOneOf
   * @generated
   */
	EClass getObjectOneOf();

	/**
   * Returns the meta object for the containment reference list '{@link de.uniko.isweb.emftext.sparqlas.SPARQLAS.ObjectOneOf#getIndividuals <em>Individuals</em>}'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Individuals</em>'.
   * @see de.uniko.isweb.emftext.sparqlas.SPARQLAS.ObjectOneOf#getIndividuals()
   * @see #getObjectOneOf()
   * @generated
   */
	EReference getObjectOneOf_Individuals();

	/**
   * Returns the meta object for class '{@link de.uniko.isweb.emftext.sparqlas.SPARQLAS.ObjectIntersectionOf <em>Object Intersection Of</em>}'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return the meta object for class '<em>Object Intersection Of</em>'.
   * @see de.uniko.isweb.emftext.sparqlas.SPARQLAS.ObjectIntersectionOf
   * @generated
   */
	EClass getObjectIntersectionOf();

	/**
   * Returns the meta object for the containment reference list '{@link de.uniko.isweb.emftext.sparqlas.SPARQLAS.ObjectIntersectionOf#getClassExpressions <em>Class Expressions</em>}'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Class Expressions</em>'.
   * @see de.uniko.isweb.emftext.sparqlas.SPARQLAS.ObjectIntersectionOf#getClassExpressions()
   * @see #getObjectIntersectionOf()
   * @generated
   */
	EReference getObjectIntersectionOf_ClassExpressions();

	/**
   * Returns the meta object for class '{@link de.uniko.isweb.emftext.sparqlas.SPARQLAS.ObjectAllValuesFrom <em>Object All Values From</em>}'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return the meta object for class '<em>Object All Values From</em>'.
   * @see de.uniko.isweb.emftext.sparqlas.SPARQLAS.ObjectAllValuesFrom
   * @generated
   */
	EClass getObjectAllValuesFrom();

	/**
   * Returns the meta object for the containment reference '{@link de.uniko.isweb.emftext.sparqlas.SPARQLAS.ObjectAllValuesFrom#getClassExpression <em>Class Expression</em>}'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Class Expression</em>'.
   * @see de.uniko.isweb.emftext.sparqlas.SPARQLAS.ObjectAllValuesFrom#getClassExpression()
   * @see #getObjectAllValuesFrom()
   * @generated
   */
	EReference getObjectAllValuesFrom_ClassExpression();

	/**
   * Returns the meta object for the containment reference '{@link de.uniko.isweb.emftext.sparqlas.SPARQLAS.ObjectAllValuesFrom#getObjectPropertyExpression <em>Object Property Expression</em>}'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Object Property Expression</em>'.
   * @see de.uniko.isweb.emftext.sparqlas.SPARQLAS.ObjectAllValuesFrom#getObjectPropertyExpression()
   * @see #getObjectAllValuesFrom()
   * @generated
   */
	EReference getObjectAllValuesFrom_ObjectPropertyExpression();

	/**
   * Returns the meta object for class '{@link de.uniko.isweb.emftext.sparqlas.SPARQLAS.ObjectSomeValuesFrom <em>Object Some Values From</em>}'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return the meta object for class '<em>Object Some Values From</em>'.
   * @see de.uniko.isweb.emftext.sparqlas.SPARQLAS.ObjectSomeValuesFrom
   * @generated
   */
	EClass getObjectSomeValuesFrom();

	/**
   * Returns the meta object for the containment reference '{@link de.uniko.isweb.emftext.sparqlas.SPARQLAS.ObjectSomeValuesFrom#getClassExpression <em>Class Expression</em>}'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Class Expression</em>'.
   * @see de.uniko.isweb.emftext.sparqlas.SPARQLAS.ObjectSomeValuesFrom#getClassExpression()
   * @see #getObjectSomeValuesFrom()
   * @generated
   */
	EReference getObjectSomeValuesFrom_ClassExpression();

	/**
   * Returns the meta object for the containment reference '{@link de.uniko.isweb.emftext.sparqlas.SPARQLAS.ObjectSomeValuesFrom#getObjectPropertyExpression <em>Object Property Expression</em>}'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Object Property Expression</em>'.
   * @see de.uniko.isweb.emftext.sparqlas.SPARQLAS.ObjectSomeValuesFrom#getObjectPropertyExpression()
   * @see #getObjectSomeValuesFrom()
   * @generated
   */
	EReference getObjectSomeValuesFrom_ObjectPropertyExpression();

	/**
   * Returns the meta object for class '{@link de.uniko.isweb.emftext.sparqlas.SPARQLAS.ObjectHasValue <em>Object Has Value</em>}'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return the meta object for class '<em>Object Has Value</em>'.
   * @see de.uniko.isweb.emftext.sparqlas.SPARQLAS.ObjectHasValue
   * @generated
   */
	EClass getObjectHasValue();

	/**
   * Returns the meta object for the containment reference '{@link de.uniko.isweb.emftext.sparqlas.SPARQLAS.ObjectHasValue#getIndividual <em>Individual</em>}'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Individual</em>'.
   * @see de.uniko.isweb.emftext.sparqlas.SPARQLAS.ObjectHasValue#getIndividual()
   * @see #getObjectHasValue()
   * @generated
   */
	EReference getObjectHasValue_Individual();

	/**
   * Returns the meta object for the containment reference '{@link de.uniko.isweb.emftext.sparqlas.SPARQLAS.ObjectHasValue#getObjectPropertyExpression <em>Object Property Expression</em>}'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Object Property Expression</em>'.
   * @see de.uniko.isweb.emftext.sparqlas.SPARQLAS.ObjectHasValue#getObjectPropertyExpression()
   * @see #getObjectHasValue()
   * @generated
   */
	EReference getObjectHasValue_ObjectPropertyExpression();

	/**
   * Returns the meta object for class '{@link de.uniko.isweb.emftext.sparqlas.SPARQLAS.ObjectMinCardinality <em>Object Min Cardinality</em>}'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return the meta object for class '<em>Object Min Cardinality</em>'.
   * @see de.uniko.isweb.emftext.sparqlas.SPARQLAS.ObjectMinCardinality
   * @generated
   */
	EClass getObjectMinCardinality();

	/**
   * Returns the meta object for the attribute '{@link de.uniko.isweb.emftext.sparqlas.SPARQLAS.ObjectMinCardinality#getCardinality <em>Cardinality</em>}'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Cardinality</em>'.
   * @see de.uniko.isweb.emftext.sparqlas.SPARQLAS.ObjectMinCardinality#getCardinality()
   * @see #getObjectMinCardinality()
   * @generated
   */
	EAttribute getObjectMinCardinality_Cardinality();

	/**
   * Returns the meta object for the containment reference '{@link de.uniko.isweb.emftext.sparqlas.SPARQLAS.ObjectMinCardinality#getClassExpression <em>Class Expression</em>}'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Class Expression</em>'.
   * @see de.uniko.isweb.emftext.sparqlas.SPARQLAS.ObjectMinCardinality#getClassExpression()
   * @see #getObjectMinCardinality()
   * @generated
   */
	EReference getObjectMinCardinality_ClassExpression();

	/**
   * Returns the meta object for the containment reference '{@link de.uniko.isweb.emftext.sparqlas.SPARQLAS.ObjectMinCardinality#getObjectPropertyExpression <em>Object Property Expression</em>}'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Object Property Expression</em>'.
   * @see de.uniko.isweb.emftext.sparqlas.SPARQLAS.ObjectMinCardinality#getObjectPropertyExpression()
   * @see #getObjectMinCardinality()
   * @generated
   */
	EReference getObjectMinCardinality_ObjectPropertyExpression();

	/**
   * Returns the meta object for class '{@link de.uniko.isweb.emftext.sparqlas.SPARQLAS.ObjectMaxCardinality <em>Object Max Cardinality</em>}'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return the meta object for class '<em>Object Max Cardinality</em>'.
   * @see de.uniko.isweb.emftext.sparqlas.SPARQLAS.ObjectMaxCardinality
   * @generated
   */
	EClass getObjectMaxCardinality();

	/**
   * Returns the meta object for the attribute '{@link de.uniko.isweb.emftext.sparqlas.SPARQLAS.ObjectMaxCardinality#getCardinality <em>Cardinality</em>}'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Cardinality</em>'.
   * @see de.uniko.isweb.emftext.sparqlas.SPARQLAS.ObjectMaxCardinality#getCardinality()
   * @see #getObjectMaxCardinality()
   * @generated
   */
	EAttribute getObjectMaxCardinality_Cardinality();

	/**
   * Returns the meta object for the containment reference '{@link de.uniko.isweb.emftext.sparqlas.SPARQLAS.ObjectMaxCardinality#getClassExpression <em>Class Expression</em>}'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Class Expression</em>'.
   * @see de.uniko.isweb.emftext.sparqlas.SPARQLAS.ObjectMaxCardinality#getClassExpression()
   * @see #getObjectMaxCardinality()
   * @generated
   */
	EReference getObjectMaxCardinality_ClassExpression();

	/**
   * Returns the meta object for the containment reference '{@link de.uniko.isweb.emftext.sparqlas.SPARQLAS.ObjectMaxCardinality#getObjectPropertyExpression <em>Object Property Expression</em>}'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Object Property Expression</em>'.
   * @see de.uniko.isweb.emftext.sparqlas.SPARQLAS.ObjectMaxCardinality#getObjectPropertyExpression()
   * @see #getObjectMaxCardinality()
   * @generated
   */
	EReference getObjectMaxCardinality_ObjectPropertyExpression();

	/**
   * Returns the meta object for class '{@link de.uniko.isweb.emftext.sparqlas.SPARQLAS.ObjectExactCardinality <em>Object Exact Cardinality</em>}'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return the meta object for class '<em>Object Exact Cardinality</em>'.
   * @see de.uniko.isweb.emftext.sparqlas.SPARQLAS.ObjectExactCardinality
   * @generated
   */
	EClass getObjectExactCardinality();

	/**
   * Returns the meta object for the attribute '{@link de.uniko.isweb.emftext.sparqlas.SPARQLAS.ObjectExactCardinality#getCardinality <em>Cardinality</em>}'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Cardinality</em>'.
   * @see de.uniko.isweb.emftext.sparqlas.SPARQLAS.ObjectExactCardinality#getCardinality()
   * @see #getObjectExactCardinality()
   * @generated
   */
	EAttribute getObjectExactCardinality_Cardinality();

	/**
   * Returns the meta object for the containment reference '{@link de.uniko.isweb.emftext.sparqlas.SPARQLAS.ObjectExactCardinality#getClassExpression <em>Class Expression</em>}'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Class Expression</em>'.
   * @see de.uniko.isweb.emftext.sparqlas.SPARQLAS.ObjectExactCardinality#getClassExpression()
   * @see #getObjectExactCardinality()
   * @generated
   */
	EReference getObjectExactCardinality_ClassExpression();

	/**
   * Returns the meta object for the containment reference '{@link de.uniko.isweb.emftext.sparqlas.SPARQLAS.ObjectExactCardinality#getObjectPropertyExpression <em>Object Property Expression</em>}'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Object Property Expression</em>'.
   * @see de.uniko.isweb.emftext.sparqlas.SPARQLAS.ObjectExactCardinality#getObjectPropertyExpression()
   * @see #getObjectExactCardinality()
   * @generated
   */
	EReference getObjectExactCardinality_ObjectPropertyExpression();

	/**
   * Returns the meta object for class '{@link de.uniko.isweb.emftext.sparqlas.SPARQLAS.DataHasValue <em>Data Has Value</em>}'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return the meta object for class '<em>Data Has Value</em>'.
   * @see de.uniko.isweb.emftext.sparqlas.SPARQLAS.DataHasValue
   * @generated
   */
	EClass getDataHasValue();

	/**
   * Returns the meta object for the containment reference '{@link de.uniko.isweb.emftext.sparqlas.SPARQLAS.DataHasValue#getLiteral <em>Literal</em>}'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Literal</em>'.
   * @see de.uniko.isweb.emftext.sparqlas.SPARQLAS.DataHasValue#getLiteral()
   * @see #getDataHasValue()
   * @generated
   */
	EReference getDataHasValue_Literal();

	/**
   * Returns the meta object for the containment reference '{@link de.uniko.isweb.emftext.sparqlas.SPARQLAS.DataHasValue#getDataPropertyExpression <em>Data Property Expression</em>}'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Data Property Expression</em>'.
   * @see de.uniko.isweb.emftext.sparqlas.SPARQLAS.DataHasValue#getDataPropertyExpression()
   * @see #getDataHasValue()
   * @generated
   */
	EReference getDataHasValue_DataPropertyExpression();

	/**
   * Returns the meta object for class '{@link de.uniko.isweb.emftext.sparqlas.SPARQLAS.IRI <em>IRI</em>}'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return the meta object for class '<em>IRI</em>'.
   * @see de.uniko.isweb.emftext.sparqlas.SPARQLAS.IRI
   * @generated
   */
	EClass getIRI();

	/**
   * Returns the meta object for the attribute '{@link de.uniko.isweb.emftext.sparqlas.SPARQLAS.IRI#getId <em>Id</em>}'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Id</em>'.
   * @see de.uniko.isweb.emftext.sparqlas.SPARQLAS.IRI#getId()
   * @see #getIRI()
   * @generated
   */
	EAttribute getIRI_Id();

	/**
   * Returns the meta object for class '{@link de.uniko.isweb.emftext.sparqlas.SPARQLAS.FullIRI <em>Full IRI</em>}'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return the meta object for class '<em>Full IRI</em>'.
   * @see de.uniko.isweb.emftext.sparqlas.SPARQLAS.FullIRI
   * @generated
   */
	EClass getFullIRI();

	/**
   * Returns the meta object for class '{@link de.uniko.isweb.emftext.sparqlas.SPARQLAS.AbbreviatedIRI <em>Abbreviated IRI</em>}'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return the meta object for class '<em>Abbreviated IRI</em>'.
   * @see de.uniko.isweb.emftext.sparqlas.SPARQLAS.AbbreviatedIRI
   * @generated
   */
	EClass getAbbreviatedIRI();

	/**
   * Returns the meta object for class '{@link de.uniko.isweb.emftext.sparqlas.SPARQLAS.Declaration <em>Declaration</em>}'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return the meta object for class '<em>Declaration</em>'.
   * @see de.uniko.isweb.emftext.sparqlas.SPARQLAS.Declaration
   * @generated
   */
	EClass getDeclaration();

	/**
   * Returns the meta object for class '{@link de.uniko.isweb.emftext.sparqlas.SPARQLAS.ObjectPropertyDeclaration <em>Object Property Declaration</em>}'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return the meta object for class '<em>Object Property Declaration</em>'.
   * @see de.uniko.isweb.emftext.sparqlas.SPARQLAS.ObjectPropertyDeclaration
   * @generated
   */
	EClass getObjectPropertyDeclaration();

	/**
   * Returns the meta object for the containment reference '{@link de.uniko.isweb.emftext.sparqlas.SPARQLAS.ObjectPropertyDeclaration#getObjectPropertyVariable <em>Object Property Variable</em>}'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Object Property Variable</em>'.
   * @see de.uniko.isweb.emftext.sparqlas.SPARQLAS.ObjectPropertyDeclaration#getObjectPropertyVariable()
   * @see #getObjectPropertyDeclaration()
   * @generated
   */
	EReference getObjectPropertyDeclaration_ObjectPropertyVariable();

	/**
   * Returns the meta object for class '{@link de.uniko.isweb.emftext.sparqlas.SPARQLAS.DatatypePropertyDeclaration <em>Datatype Property Declaration</em>}'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return the meta object for class '<em>Datatype Property Declaration</em>'.
   * @see de.uniko.isweb.emftext.sparqlas.SPARQLAS.DatatypePropertyDeclaration
   * @generated
   */
	EClass getDatatypePropertyDeclaration();

	/**
   * Returns the meta object for the containment reference '{@link de.uniko.isweb.emftext.sparqlas.SPARQLAS.DatatypePropertyDeclaration#getDatatypePropertyVariable <em>Datatype Property Variable</em>}'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Datatype Property Variable</em>'.
   * @see de.uniko.isweb.emftext.sparqlas.SPARQLAS.DatatypePropertyDeclaration#getDatatypePropertyVariable()
   * @see #getDatatypePropertyDeclaration()
   * @generated
   */
	EReference getDatatypePropertyDeclaration_DatatypePropertyVariable();

	/**
   * Returns the meta object for class '{@link de.uniko.isweb.emftext.sparqlas.SPARQLAS.IndividualDeclaration <em>Individual Declaration</em>}'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return the meta object for class '<em>Individual Declaration</em>'.
   * @see de.uniko.isweb.emftext.sparqlas.SPARQLAS.IndividualDeclaration
   * @generated
   */
	EClass getIndividualDeclaration();

	/**
   * Returns the meta object for the containment reference '{@link de.uniko.isweb.emftext.sparqlas.SPARQLAS.IndividualDeclaration#getIndividualVariable <em>Individual Variable</em>}'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Individual Variable</em>'.
   * @see de.uniko.isweb.emftext.sparqlas.SPARQLAS.IndividualDeclaration#getIndividualVariable()
   * @see #getIndividualDeclaration()
   * @generated
   */
	EReference getIndividualDeclaration_IndividualVariable();

	/**
   * Returns the meta object for class '{@link de.uniko.isweb.emftext.sparqlas.SPARQLAS.ClassDeclaration <em>Class Declaration</em>}'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return the meta object for class '<em>Class Declaration</em>'.
   * @see de.uniko.isweb.emftext.sparqlas.SPARQLAS.ClassDeclaration
   * @generated
   */
	EClass getClassDeclaration();

	/**
   * Returns the meta object for the containment reference '{@link de.uniko.isweb.emftext.sparqlas.SPARQLAS.ClassDeclaration#getClassVariable <em>Class Variable</em>}'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Class Variable</em>'.
   * @see de.uniko.isweb.emftext.sparqlas.SPARQLAS.ClassDeclaration#getClassVariable()
   * @see #getClassDeclaration()
   * @generated
   */
	EReference getClassDeclaration_ClassVariable();

	/**
   * Returns the meta object for class '{@link de.uniko.isweb.emftext.sparqlas.SPARQLAS.Constant <em>Constant</em>}'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return the meta object for class '<em>Constant</em>'.
   * @see de.uniko.isweb.emftext.sparqlas.SPARQLAS.Constant
   * @generated
   */
	EClass getConstant();

	/**
   * Returns the meta object for the containment reference '{@link de.uniko.isweb.emftext.sparqlas.SPARQLAS.Constant#getConstantIRI <em>Constant IRI</em>}'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Constant IRI</em>'.
   * @see de.uniko.isweb.emftext.sparqlas.SPARQLAS.Constant#getConstantIRI()
   * @see #getConstant()
   * @generated
   */
	EReference getConstant_ConstantIRI();

	/**
   * Returns the meta object for class '{@link de.uniko.isweb.emftext.sparqlas.SPARQLAS.Term <em>Term</em>}'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return the meta object for class '<em>Term</em>'.
   * @see de.uniko.isweb.emftext.sparqlas.SPARQLAS.Term
   * @generated
   */
	EClass getTerm();

	/**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
	SPARQLASFactory getSPARQLASFactory();

	/**
   * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
   * @generated
   */
	interface Literals {
		/**
     * The meta object literal for the '{@link de.uniko.isweb.emftext.sparqlas.SPARQLAS.impl.OntologyDocumentImpl <em>Ontology Document</em>}' class.
     * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
     * @see de.uniko.isweb.emftext.sparqlas.SPARQLAS.impl.OntologyDocumentImpl
     * @see de.uniko.isweb.emftext.sparqlas.SPARQLAS.impl.SPARQLASPackageImpl#getOntologyDocument()
     * @generated
     */
		EClass ONTOLOGY_DOCUMENT = eINSTANCE.getOntologyDocument();

		/**
     * The meta object literal for the '<em><b>Prefix Definition</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
     * @generated
     */
		EReference ONTOLOGY_DOCUMENT__PREFIX_DEFINITION = eINSTANCE.getOntologyDocument_PrefixDefinition();

		/**
     * The meta object literal for the '<em><b>Query</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
     * @generated
     */
		EReference ONTOLOGY_DOCUMENT__QUERY = eINSTANCE.getOntologyDocument_Query();

		/**
     * The meta object literal for the '{@link de.uniko.isweb.emftext.sparqlas.SPARQLAS.impl.PrefixDefinitionImpl <em>Prefix Definition</em>}' class.
     * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
     * @see de.uniko.isweb.emftext.sparqlas.SPARQLAS.impl.PrefixDefinitionImpl
     * @see de.uniko.isweb.emftext.sparqlas.SPARQLAS.impl.SPARQLASPackageImpl#getPrefixDefinition()
     * @generated
     */
		EClass PREFIX_DEFINITION = eINSTANCE.getPrefixDefinition();

		/**
     * The meta object literal for the '<em><b>Pref</b></em>' attribute feature.
     * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
     * @generated
     */
		EAttribute PREFIX_DEFINITION__PREF = eINSTANCE.getPrefixDefinition_Pref();

		/**
     * The meta object literal for the '<em><b>Namespace</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
     * @generated
     */
		EReference PREFIX_DEFINITION__NAMESPACE = eINSTANCE.getPrefixDefinition_Namespace();

		/**
     * The meta object literal for the '{@link de.uniko.isweb.emftext.sparqlas.SPARQLAS.impl.QueryImpl <em>Query</em>}' class.
     * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
     * @see de.uniko.isweb.emftext.sparqlas.SPARQLAS.impl.QueryImpl
     * @see de.uniko.isweb.emftext.sparqlas.SPARQLAS.impl.SPARQLASPackageImpl#getQuery()
     * @generated
     */
		EClass QUERY = eINSTANCE.getQuery();

		/**
     * The meta object literal for the '<em><b>Query IRI</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
     * @generated
     */
		EReference QUERY__QUERY_IRI = eINSTANCE.getQuery_QueryIRI();

		/**
     * The meta object literal for the '<em><b>Atoms</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
     * @generated
     */
		EReference QUERY__ATOMS = eINSTANCE.getQuery_Atoms();

		/**
     * The meta object literal for the '{@link de.uniko.isweb.emftext.sparqlas.SPARQLAS.impl.AtomImpl <em>Atom</em>}' class.
     * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
     * @see de.uniko.isweb.emftext.sparqlas.SPARQLAS.impl.AtomImpl
     * @see de.uniko.isweb.emftext.sparqlas.SPARQLAS.impl.SPARQLASPackageImpl#getAtom()
     * @generated
     */
		EClass ATOM = eINSTANCE.getAtom();

		/**
     * The meta object literal for the '{@link de.uniko.isweb.emftext.sparqlas.SPARQLAS.impl.VariableImpl <em>Variable</em>}' class.
     * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
     * @see de.uniko.isweb.emftext.sparqlas.SPARQLAS.impl.VariableImpl
     * @see de.uniko.isweb.emftext.sparqlas.SPARQLAS.impl.SPARQLASPackageImpl#getVariable()
     * @generated
     */
		EClass VARIABLE = eINSTANCE.getVariable();

		/**
     * The meta object literal for the '<em><b>Symbol</b></em>' attribute feature.
     * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
     * @generated
     */
		EAttribute VARIABLE__SYMBOL = eINSTANCE.getVariable_Symbol();

		/**
     * The meta object literal for the '{@link de.uniko.isweb.emftext.sparqlas.SPARQLAS.impl.ClassVariableImpl <em>Class Variable</em>}' class.
     * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
     * @see de.uniko.isweb.emftext.sparqlas.SPARQLAS.impl.ClassVariableImpl
     * @see de.uniko.isweb.emftext.sparqlas.SPARQLAS.impl.SPARQLASPackageImpl#getClassVariable()
     * @generated
     */
		EClass CLASS_VARIABLE = eINSTANCE.getClassVariable();

		/**
     * The meta object literal for the '{@link de.uniko.isweb.emftext.sparqlas.SPARQLAS.impl.ObjectPropertyVariableImpl <em>Object Property Variable</em>}' class.
     * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
     * @see de.uniko.isweb.emftext.sparqlas.SPARQLAS.impl.ObjectPropertyVariableImpl
     * @see de.uniko.isweb.emftext.sparqlas.SPARQLAS.impl.SPARQLASPackageImpl#getObjectPropertyVariable()
     * @generated
     */
		EClass OBJECT_PROPERTY_VARIABLE = eINSTANCE.getObjectPropertyVariable();

		/**
     * The meta object literal for the '{@link de.uniko.isweb.emftext.sparqlas.SPARQLAS.impl.DataPropertyVariableImpl <em>Data Property Variable</em>}' class.
     * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
     * @see de.uniko.isweb.emftext.sparqlas.SPARQLAS.impl.DataPropertyVariableImpl
     * @see de.uniko.isweb.emftext.sparqlas.SPARQLAS.impl.SPARQLASPackageImpl#getDataPropertyVariable()
     * @generated
     */
		EClass DATA_PROPERTY_VARIABLE = eINSTANCE.getDataPropertyVariable();

		/**
     * The meta object literal for the '{@link de.uniko.isweb.emftext.sparqlas.SPARQLAS.impl.IndividualVariableImpl <em>Individual Variable</em>}' class.
     * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
     * @see de.uniko.isweb.emftext.sparqlas.SPARQLAS.impl.IndividualVariableImpl
     * @see de.uniko.isweb.emftext.sparqlas.SPARQLAS.impl.SPARQLASPackageImpl#getIndividualVariable()
     * @generated
     */
		EClass INDIVIDUAL_VARIABLE = eINSTANCE.getIndividualVariable();

		/**
     * The meta object literal for the '{@link de.uniko.isweb.emftext.sparqlas.SPARQLAS.impl.ClassImpl <em>Class</em>}' class.
     * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
     * @see de.uniko.isweb.emftext.sparqlas.SPARQLAS.impl.ClassImpl
     * @see de.uniko.isweb.emftext.sparqlas.SPARQLAS.impl.SPARQLASPackageImpl#getClass_()
     * @generated
     */
		EClass CLASS = eINSTANCE.getClass_();

		/**
     * The meta object literal for the '{@link de.uniko.isweb.emftext.sparqlas.SPARQLAS.impl.DatatypeImpl <em>Datatype</em>}' class.
     * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
     * @see de.uniko.isweb.emftext.sparqlas.SPARQLAS.impl.DatatypeImpl
     * @see de.uniko.isweb.emftext.sparqlas.SPARQLAS.impl.SPARQLASPackageImpl#getDatatype()
     * @generated
     */
		EClass DATATYPE = eINSTANCE.getDatatype();

		/**
     * The meta object literal for the '{@link de.uniko.isweb.emftext.sparqlas.SPARQLAS.impl.ObjectPropertyImpl <em>Object Property</em>}' class.
     * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
     * @see de.uniko.isweb.emftext.sparqlas.SPARQLAS.impl.ObjectPropertyImpl
     * @see de.uniko.isweb.emftext.sparqlas.SPARQLAS.impl.SPARQLASPackageImpl#getObjectProperty()
     * @generated
     */
		EClass OBJECT_PROPERTY = eINSTANCE.getObjectProperty();

		/**
     * The meta object literal for the '{@link de.uniko.isweb.emftext.sparqlas.SPARQLAS.impl.DataPropertyImpl <em>Data Property</em>}' class.
     * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
     * @see de.uniko.isweb.emftext.sparqlas.SPARQLAS.impl.DataPropertyImpl
     * @see de.uniko.isweb.emftext.sparqlas.SPARQLAS.impl.SPARQLASPackageImpl#getDataProperty()
     * @generated
     */
		EClass DATA_PROPERTY = eINSTANCE.getDataProperty();

		/**
     * The meta object literal for the '{@link de.uniko.isweb.emftext.sparqlas.SPARQLAS.impl.IndividualImpl <em>Individual</em>}' class.
     * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
     * @see de.uniko.isweb.emftext.sparqlas.SPARQLAS.impl.IndividualImpl
     * @see de.uniko.isweb.emftext.sparqlas.SPARQLAS.impl.SPARQLASPackageImpl#getIndividual()
     * @generated
     */
		EClass INDIVIDUAL = eINSTANCE.getIndividual();

		/**
     * The meta object literal for the '{@link de.uniko.isweb.emftext.sparqlas.SPARQLAS.impl.NamedIndividualImpl <em>Named Individual</em>}' class.
     * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
     * @see de.uniko.isweb.emftext.sparqlas.SPARQLAS.impl.NamedIndividualImpl
     * @see de.uniko.isweb.emftext.sparqlas.SPARQLAS.impl.SPARQLASPackageImpl#getNamedIndividual()
     * @generated
     */
		EClass NAMED_INDIVIDUAL = eINSTANCE.getNamedIndividual();

		/**
     * The meta object literal for the '{@link de.uniko.isweb.emftext.sparqlas.SPARQLAS.impl.AnonymousIndividualImpl <em>Anonymous Individual</em>}' class.
     * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
     * @see de.uniko.isweb.emftext.sparqlas.SPARQLAS.impl.AnonymousIndividualImpl
     * @see de.uniko.isweb.emftext.sparqlas.SPARQLAS.impl.SPARQLASPackageImpl#getAnonymousIndividual()
     * @generated
     */
		EClass ANONYMOUS_INDIVIDUAL = eINSTANCE.getAnonymousIndividual();

		/**
     * The meta object literal for the '<em><b>Node ID</b></em>' attribute feature.
     * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
     * @generated
     */
		EAttribute ANONYMOUS_INDIVIDUAL__NODE_ID = eINSTANCE.getAnonymousIndividual_NodeID();

		/**
     * The meta object literal for the '{@link de.uniko.isweb.emftext.sparqlas.SPARQLAS.impl.LiteralImpl <em>Literal</em>}' class.
     * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
     * @see de.uniko.isweb.emftext.sparqlas.SPARQLAS.impl.LiteralImpl
     * @see de.uniko.isweb.emftext.sparqlas.SPARQLAS.impl.SPARQLASPackageImpl#getLiteral()
     * @generated
     */
		EClass LITERAL = eINSTANCE.getLiteral();

		/**
     * The meta object literal for the '<em><b>Lexical Form</b></em>' attribute feature.
     * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
     * @generated
     */
		EAttribute LITERAL__LEXICAL_FORM = eINSTANCE.getLiteral_LexicalForm();

		/**
     * The meta object literal for the '<em><b>Datatype</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
     * @generated
     */
		EReference LITERAL__DATATYPE = eINSTANCE.getLiteral_Datatype();

		/**
     * The meta object literal for the '{@link de.uniko.isweb.emftext.sparqlas.SPARQLAS.impl.ClassAtomImpl <em>Class Atom</em>}' class.
     * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
     * @see de.uniko.isweb.emftext.sparqlas.SPARQLAS.impl.ClassAtomImpl
     * @see de.uniko.isweb.emftext.sparqlas.SPARQLAS.impl.SPARQLASPackageImpl#getClassAtom()
     * @generated
     */
		EClass CLASS_ATOM = eINSTANCE.getClassAtom();

		/**
     * The meta object literal for the '{@link de.uniko.isweb.emftext.sparqlas.SPARQLAS.impl.EquivalentClassesImpl <em>Equivalent Classes</em>}' class.
     * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
     * @see de.uniko.isweb.emftext.sparqlas.SPARQLAS.impl.EquivalentClassesImpl
     * @see de.uniko.isweb.emftext.sparqlas.SPARQLAS.impl.SPARQLASPackageImpl#getEquivalentClasses()
     * @generated
     */
		EClass EQUIVALENT_CLASSES = eINSTANCE.getEquivalentClasses();

		/**
     * The meta object literal for the '<em><b>Class Expressions</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
     * @generated
     */
		EReference EQUIVALENT_CLASSES__CLASS_EXPRESSIONS = eINSTANCE.getEquivalentClasses_ClassExpressions();

		/**
     * The meta object literal for the '{@link de.uniko.isweb.emftext.sparqlas.SPARQLAS.impl.SubClassOfImpl <em>Sub Class Of</em>}' class.
     * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
     * @see de.uniko.isweb.emftext.sparqlas.SPARQLAS.impl.SubClassOfImpl
     * @see de.uniko.isweb.emftext.sparqlas.SPARQLAS.impl.SPARQLASPackageImpl#getSubClassOf()
     * @generated
     */
		EClass SUB_CLASS_OF = eINSTANCE.getSubClassOf();

		/**
     * The meta object literal for the '<em><b>Sub Class Expression</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
     * @generated
     */
		EReference SUB_CLASS_OF__SUB_CLASS_EXPRESSION = eINSTANCE.getSubClassOf_SubClassExpression();

		/**
     * The meta object literal for the '<em><b>Super Class Expression</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
     * @generated
     */
		EReference SUB_CLASS_OF__SUPER_CLASS_EXPRESSION = eINSTANCE.getSubClassOf_SuperClassExpression();

		/**
     * The meta object literal for the '{@link de.uniko.isweb.emftext.sparqlas.SPARQLAS.impl.DisjointClassesImpl <em>Disjoint Classes</em>}' class.
     * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
     * @see de.uniko.isweb.emftext.sparqlas.SPARQLAS.impl.DisjointClassesImpl
     * @see de.uniko.isweb.emftext.sparqlas.SPARQLAS.impl.SPARQLASPackageImpl#getDisjointClasses()
     * @generated
     */
		EClass DISJOINT_CLASSES = eINSTANCE.getDisjointClasses();

		/**
     * The meta object literal for the '<em><b>Class Expressions</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
     * @generated
     */
		EReference DISJOINT_CLASSES__CLASS_EXPRESSIONS = eINSTANCE.getDisjointClasses_ClassExpressions();

		/**
     * The meta object literal for the '{@link de.uniko.isweb.emftext.sparqlas.SPARQLAS.impl.ObjectPropertyAtomImpl <em>Object Property Atom</em>}' class.
     * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
     * @see de.uniko.isweb.emftext.sparqlas.SPARQLAS.impl.ObjectPropertyAtomImpl
     * @see de.uniko.isweb.emftext.sparqlas.SPARQLAS.impl.SPARQLASPackageImpl#getObjectPropertyAtom()
     * @generated
     */
		EClass OBJECT_PROPERTY_ATOM = eINSTANCE.getObjectPropertyAtom();

		/**
     * The meta object literal for the '{@link de.uniko.isweb.emftext.sparqlas.SPARQLAS.impl.AssertionImpl <em>Assertion</em>}' class.
     * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
     * @see de.uniko.isweb.emftext.sparqlas.SPARQLAS.impl.AssertionImpl
     * @see de.uniko.isweb.emftext.sparqlas.SPARQLAS.impl.SPARQLASPackageImpl#getAssertion()
     * @generated
     */
		EClass ASSERTION = eINSTANCE.getAssertion();

		/**
     * The meta object literal for the '{@link de.uniko.isweb.emftext.sparqlas.SPARQLAS.impl.ObjectPropertyAssertionImpl <em>Object Property Assertion</em>}' class.
     * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
     * @see de.uniko.isweb.emftext.sparqlas.SPARQLAS.impl.ObjectPropertyAssertionImpl
     * @see de.uniko.isweb.emftext.sparqlas.SPARQLAS.impl.SPARQLASPackageImpl#getObjectPropertyAssertion()
     * @generated
     */
		EClass OBJECT_PROPERTY_ASSERTION = eINSTANCE.getObjectPropertyAssertion();

		/**
     * The meta object literal for the '<em><b>Source Individual</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
     * @generated
     */
		EReference OBJECT_PROPERTY_ASSERTION__SOURCE_INDIVIDUAL = eINSTANCE.getObjectPropertyAssertion_SourceIndividual();

		/**
     * The meta object literal for the '<em><b>Target Individual</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
     * @generated
     */
		EReference OBJECT_PROPERTY_ASSERTION__TARGET_INDIVIDUAL = eINSTANCE.getObjectPropertyAssertion_TargetIndividual();

		/**
     * The meta object literal for the '<em><b>Object Property Expression</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
     * @generated
     */
		EReference OBJECT_PROPERTY_ASSERTION__OBJECT_PROPERTY_EXPRESSION = eINSTANCE.getObjectPropertyAssertion_ObjectPropertyExpression();

		/**
     * The meta object literal for the '{@link de.uniko.isweb.emftext.sparqlas.SPARQLAS.impl.DataPropertyAssertionImpl <em>Data Property Assertion</em>}' class.
     * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
     * @see de.uniko.isweb.emftext.sparqlas.SPARQLAS.impl.DataPropertyAssertionImpl
     * @see de.uniko.isweb.emftext.sparqlas.SPARQLAS.impl.SPARQLASPackageImpl#getDataPropertyAssertion()
     * @generated
     */
		EClass DATA_PROPERTY_ASSERTION = eINSTANCE.getDataPropertyAssertion();

		/**
     * The meta object literal for the '<em><b>Source Individual</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
     * @generated
     */
		EReference DATA_PROPERTY_ASSERTION__SOURCE_INDIVIDUAL = eINSTANCE.getDataPropertyAssertion_SourceIndividual();

		/**
     * The meta object literal for the '<em><b>Target Value</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
     * @generated
     */
		EReference DATA_PROPERTY_ASSERTION__TARGET_VALUE = eINSTANCE.getDataPropertyAssertion_TargetValue();

		/**
     * The meta object literal for the '<em><b>Data Property Expression</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
     * @generated
     */
		EReference DATA_PROPERTY_ASSERTION__DATA_PROPERTY_EXPRESSION = eINSTANCE.getDataPropertyAssertion_DataPropertyExpression();

		/**
     * The meta object literal for the '{@link de.uniko.isweb.emftext.sparqlas.SPARQLAS.impl.ClassAssertionImpl <em>Class Assertion</em>}' class.
     * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
     * @see de.uniko.isweb.emftext.sparqlas.SPARQLAS.impl.ClassAssertionImpl
     * @see de.uniko.isweb.emftext.sparqlas.SPARQLAS.impl.SPARQLASPackageImpl#getClassAssertion()
     * @generated
     */
		EClass CLASS_ASSERTION = eINSTANCE.getClassAssertion();

		/**
     * The meta object literal for the '<em><b>Individual</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
     * @generated
     */
		EReference CLASS_ASSERTION__INDIVIDUAL = eINSTANCE.getClassAssertion_Individual();

		/**
     * The meta object literal for the '<em><b>Class Expression</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
     * @generated
     */
		EReference CLASS_ASSERTION__CLASS_EXPRESSION = eINSTANCE.getClassAssertion_ClassExpression();

		/**
     * The meta object literal for the '{@link de.uniko.isweb.emftext.sparqlas.SPARQLAS.impl.SameIndividualImpl <em>Same Individual</em>}' class.
     * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
     * @see de.uniko.isweb.emftext.sparqlas.SPARQLAS.impl.SameIndividualImpl
     * @see de.uniko.isweb.emftext.sparqlas.SPARQLAS.impl.SPARQLASPackageImpl#getSameIndividual()
     * @generated
     */
		EClass SAME_INDIVIDUAL = eINSTANCE.getSameIndividual();

		/**
     * The meta object literal for the '<em><b>Individuals</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
     * @generated
     */
		EReference SAME_INDIVIDUAL__INDIVIDUALS = eINSTANCE.getSameIndividual_Individuals();

		/**
     * The meta object literal for the '{@link de.uniko.isweb.emftext.sparqlas.SPARQLAS.impl.DifferentIndividualsImpl <em>Different Individuals</em>}' class.
     * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
     * @see de.uniko.isweb.emftext.sparqlas.SPARQLAS.impl.DifferentIndividualsImpl
     * @see de.uniko.isweb.emftext.sparqlas.SPARQLAS.impl.SPARQLASPackageImpl#getDifferentIndividuals()
     * @generated
     */
		EClass DIFFERENT_INDIVIDUALS = eINSTANCE.getDifferentIndividuals();

		/**
     * The meta object literal for the '<em><b>Individuals</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
     * @generated
     */
		EReference DIFFERENT_INDIVIDUALS__INDIVIDUALS = eINSTANCE.getDifferentIndividuals_Individuals();

		/**
     * The meta object literal for the '{@link de.uniko.isweb.emftext.sparqlas.SPARQLAS.impl.EquivalentObjectPropertiesImpl <em>Equivalent Object Properties</em>}' class.
     * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
     * @see de.uniko.isweb.emftext.sparqlas.SPARQLAS.impl.EquivalentObjectPropertiesImpl
     * @see de.uniko.isweb.emftext.sparqlas.SPARQLAS.impl.SPARQLASPackageImpl#getEquivalentObjectProperties()
     * @generated
     */
		EClass EQUIVALENT_OBJECT_PROPERTIES = eINSTANCE.getEquivalentObjectProperties();

		/**
     * The meta object literal for the '<em><b>Object Property Expression</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
     * @generated
     */
		EReference EQUIVALENT_OBJECT_PROPERTIES__OBJECT_PROPERTY_EXPRESSION = eINSTANCE.getEquivalentObjectProperties_ObjectPropertyExpression();

		/**
     * The meta object literal for the '{@link de.uniko.isweb.emftext.sparqlas.SPARQLAS.impl.SubPropertyOfImpl <em>Sub Property Of</em>}' class.
     * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
     * @see de.uniko.isweb.emftext.sparqlas.SPARQLAS.impl.SubPropertyOfImpl
     * @see de.uniko.isweb.emftext.sparqlas.SPARQLAS.impl.SPARQLASPackageImpl#getSubPropertyOf()
     * @generated
     */
		EClass SUB_PROPERTY_OF = eINSTANCE.getSubPropertyOf();

		/**
     * The meta object literal for the '<em><b>Sub Object Property Expression</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
     * @generated
     */
		EReference SUB_PROPERTY_OF__SUB_OBJECT_PROPERTY_EXPRESSION = eINSTANCE.getSubPropertyOf_SubObjectPropertyExpression();

		/**
     * The meta object literal for the '<em><b>Super Object Property Expression</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
     * @generated
     */
		EReference SUB_PROPERTY_OF__SUPER_OBJECT_PROPERTY_EXPRESSION = eINSTANCE.getSubPropertyOf_SuperObjectPropertyExpression();

		/**
     * The meta object literal for the '{@link de.uniko.isweb.emftext.sparqlas.SPARQLAS.impl.ExpressionImpl <em>Expression</em>}' class.
     * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
     * @see de.uniko.isweb.emftext.sparqlas.SPARQLAS.impl.ExpressionImpl
     * @see de.uniko.isweb.emftext.sparqlas.SPARQLAS.impl.SPARQLASPackageImpl#getExpression()
     * @generated
     */
		EClass EXPRESSION = eINSTANCE.getExpression();

		/**
     * The meta object literal for the '{@link de.uniko.isweb.emftext.sparqlas.SPARQLAS.impl.ObjectPropertyExpressionImpl <em>Object Property Expression</em>}' class.
     * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
     * @see de.uniko.isweb.emftext.sparqlas.SPARQLAS.impl.ObjectPropertyExpressionImpl
     * @see de.uniko.isweb.emftext.sparqlas.SPARQLAS.impl.SPARQLASPackageImpl#getObjectPropertyExpression()
     * @generated
     */
		EClass OBJECT_PROPERTY_EXPRESSION = eINSTANCE.getObjectPropertyExpression();

		/**
     * The meta object literal for the '{@link de.uniko.isweb.emftext.sparqlas.SPARQLAS.impl.InverseObjectPropertyImpl <em>Inverse Object Property</em>}' class.
     * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
     * @see de.uniko.isweb.emftext.sparqlas.SPARQLAS.impl.InverseObjectPropertyImpl
     * @see de.uniko.isweb.emftext.sparqlas.SPARQLAS.impl.SPARQLASPackageImpl#getInverseObjectProperty()
     * @generated
     */
		EClass INVERSE_OBJECT_PROPERTY = eINSTANCE.getInverseObjectProperty();

		/**
     * The meta object literal for the '<em><b>Object Property</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
     * @generated
     */
		EReference INVERSE_OBJECT_PROPERTY__OBJECT_PROPERTY = eINSTANCE.getInverseObjectProperty_ObjectProperty();

		/**
     * The meta object literal for the '{@link de.uniko.isweb.emftext.sparqlas.SPARQLAS.impl.InverseObjectPropertyAtomImpl <em>Inverse Object Property Atom</em>}' class.
     * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
     * @see de.uniko.isweb.emftext.sparqlas.SPARQLAS.impl.InverseObjectPropertyAtomImpl
     * @see de.uniko.isweb.emftext.sparqlas.SPARQLAS.impl.SPARQLASPackageImpl#getInverseObjectPropertyAtom()
     * @generated
     */
		EClass INVERSE_OBJECT_PROPERTY_ATOM = eINSTANCE.getInverseObjectPropertyAtom();

		/**
     * The meta object literal for the '<em><b>Object Property Expression1</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
     * @generated
     */
		EReference INVERSE_OBJECT_PROPERTY_ATOM__OBJECT_PROPERTY_EXPRESSION1 = eINSTANCE.getInverseObjectPropertyAtom_ObjectPropertyExpression1();

		/**
     * The meta object literal for the '<em><b>Object Property Expression2</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
     * @generated
     */
		EReference INVERSE_OBJECT_PROPERTY_ATOM__OBJECT_PROPERTY_EXPRESSION2 = eINSTANCE.getInverseObjectPropertyAtom_ObjectPropertyExpression2();

		/**
     * The meta object literal for the '{@link de.uniko.isweb.emftext.sparqlas.SPARQLAS.impl.FunctionalObjectPropertyImpl <em>Functional Object Property</em>}' class.
     * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
     * @see de.uniko.isweb.emftext.sparqlas.SPARQLAS.impl.FunctionalObjectPropertyImpl
     * @see de.uniko.isweb.emftext.sparqlas.SPARQLAS.impl.SPARQLASPackageImpl#getFunctionalObjectProperty()
     * @generated
     */
		EClass FUNCTIONAL_OBJECT_PROPERTY = eINSTANCE.getFunctionalObjectProperty();

		/**
     * The meta object literal for the '<em><b>Object Property Expression</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
     * @generated
     */
		EReference FUNCTIONAL_OBJECT_PROPERTY__OBJECT_PROPERTY_EXPRESSION = eINSTANCE.getFunctionalObjectProperty_ObjectPropertyExpression();

		/**
     * The meta object literal for the '{@link de.uniko.isweb.emftext.sparqlas.SPARQLAS.impl.InverseFunctionalObjectPropertyImpl <em>Inverse Functional Object Property</em>}' class.
     * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
     * @see de.uniko.isweb.emftext.sparqlas.SPARQLAS.impl.InverseFunctionalObjectPropertyImpl
     * @see de.uniko.isweb.emftext.sparqlas.SPARQLAS.impl.SPARQLASPackageImpl#getInverseFunctionalObjectProperty()
     * @generated
     */
		EClass INVERSE_FUNCTIONAL_OBJECT_PROPERTY = eINSTANCE.getInverseFunctionalObjectProperty();

		/**
     * The meta object literal for the '<em><b>Object Property Expression</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
     * @generated
     */
		EReference INVERSE_FUNCTIONAL_OBJECT_PROPERTY__OBJECT_PROPERTY_EXPRESSION = eINSTANCE.getInverseFunctionalObjectProperty_ObjectPropertyExpression();

		/**
     * The meta object literal for the '{@link de.uniko.isweb.emftext.sparqlas.SPARQLAS.impl.TransitiveObjectPropertyImpl <em>Transitive Object Property</em>}' class.
     * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
     * @see de.uniko.isweb.emftext.sparqlas.SPARQLAS.impl.TransitiveObjectPropertyImpl
     * @see de.uniko.isweb.emftext.sparqlas.SPARQLAS.impl.SPARQLASPackageImpl#getTransitiveObjectProperty()
     * @generated
     */
		EClass TRANSITIVE_OBJECT_PROPERTY = eINSTANCE.getTransitiveObjectProperty();

		/**
     * The meta object literal for the '<em><b>Object Property Expression</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
     * @generated
     */
		EReference TRANSITIVE_OBJECT_PROPERTY__OBJECT_PROPERTY_EXPRESSION = eINSTANCE.getTransitiveObjectProperty_ObjectPropertyExpression();

		/**
     * The meta object literal for the '{@link de.uniko.isweb.emftext.sparqlas.SPARQLAS.impl.SymmetricObjectPropertyImpl <em>Symmetric Object Property</em>}' class.
     * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
     * @see de.uniko.isweb.emftext.sparqlas.SPARQLAS.impl.SymmetricObjectPropertyImpl
     * @see de.uniko.isweb.emftext.sparqlas.SPARQLAS.impl.SPARQLASPackageImpl#getSymmetricObjectProperty()
     * @generated
     */
		EClass SYMMETRIC_OBJECT_PROPERTY = eINSTANCE.getSymmetricObjectProperty();

		/**
     * The meta object literal for the '<em><b>Object Property Expression</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
     * @generated
     */
		EReference SYMMETRIC_OBJECT_PROPERTY__OBJECT_PROPERTY_EXPRESSION = eINSTANCE.getSymmetricObjectProperty_ObjectPropertyExpression();

		/**
     * The meta object literal for the '{@link de.uniko.isweb.emftext.sparqlas.SPARQLAS.impl.ClassExpressionImpl <em>Class Expression</em>}' class.
     * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
     * @see de.uniko.isweb.emftext.sparqlas.SPARQLAS.impl.ClassExpressionImpl
     * @see de.uniko.isweb.emftext.sparqlas.SPARQLAS.impl.SPARQLASPackageImpl#getClassExpression()
     * @generated
     */
		EClass CLASS_EXPRESSION = eINSTANCE.getClassExpression();

		/**
     * The meta object literal for the '{@link de.uniko.isweb.emftext.sparqlas.SPARQLAS.impl.DataPropertyExpressionImpl <em>Data Property Expression</em>}' class.
     * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
     * @see de.uniko.isweb.emftext.sparqlas.SPARQLAS.impl.DataPropertyExpressionImpl
     * @see de.uniko.isweb.emftext.sparqlas.SPARQLAS.impl.SPARQLASPackageImpl#getDataPropertyExpression()
     * @generated
     */
		EClass DATA_PROPERTY_EXPRESSION = eINSTANCE.getDataPropertyExpression();

		/**
     * The meta object literal for the '{@link de.uniko.isweb.emftext.sparqlas.SPARQLAS.impl.ObjectUnionOfImpl <em>Object Union Of</em>}' class.
     * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
     * @see de.uniko.isweb.emftext.sparqlas.SPARQLAS.impl.ObjectUnionOfImpl
     * @see de.uniko.isweb.emftext.sparqlas.SPARQLAS.impl.SPARQLASPackageImpl#getObjectUnionOf()
     * @generated
     */
		EClass OBJECT_UNION_OF = eINSTANCE.getObjectUnionOf();

		/**
     * The meta object literal for the '<em><b>Class Expressions</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
     * @generated
     */
		EReference OBJECT_UNION_OF__CLASS_EXPRESSIONS = eINSTANCE.getObjectUnionOf_ClassExpressions();

		/**
     * The meta object literal for the '{@link de.uniko.isweb.emftext.sparqlas.SPARQLAS.impl.ObjectComplementOfImpl <em>Object Complement Of</em>}' class.
     * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
     * @see de.uniko.isweb.emftext.sparqlas.SPARQLAS.impl.ObjectComplementOfImpl
     * @see de.uniko.isweb.emftext.sparqlas.SPARQLAS.impl.SPARQLASPackageImpl#getObjectComplementOf()
     * @generated
     */
		EClass OBJECT_COMPLEMENT_OF = eINSTANCE.getObjectComplementOf();

		/**
     * The meta object literal for the '<em><b>Class Expression</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
     * @generated
     */
		EReference OBJECT_COMPLEMENT_OF__CLASS_EXPRESSION = eINSTANCE.getObjectComplementOf_ClassExpression();

		/**
     * The meta object literal for the '{@link de.uniko.isweb.emftext.sparqlas.SPARQLAS.impl.ObjectOneOfImpl <em>Object One Of</em>}' class.
     * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
     * @see de.uniko.isweb.emftext.sparqlas.SPARQLAS.impl.ObjectOneOfImpl
     * @see de.uniko.isweb.emftext.sparqlas.SPARQLAS.impl.SPARQLASPackageImpl#getObjectOneOf()
     * @generated
     */
		EClass OBJECT_ONE_OF = eINSTANCE.getObjectOneOf();

		/**
     * The meta object literal for the '<em><b>Individuals</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
     * @generated
     */
		EReference OBJECT_ONE_OF__INDIVIDUALS = eINSTANCE.getObjectOneOf_Individuals();

		/**
     * The meta object literal for the '{@link de.uniko.isweb.emftext.sparqlas.SPARQLAS.impl.ObjectIntersectionOfImpl <em>Object Intersection Of</em>}' class.
     * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
     * @see de.uniko.isweb.emftext.sparqlas.SPARQLAS.impl.ObjectIntersectionOfImpl
     * @see de.uniko.isweb.emftext.sparqlas.SPARQLAS.impl.SPARQLASPackageImpl#getObjectIntersectionOf()
     * @generated
     */
		EClass OBJECT_INTERSECTION_OF = eINSTANCE.getObjectIntersectionOf();

		/**
     * The meta object literal for the '<em><b>Class Expressions</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
     * @generated
     */
		EReference OBJECT_INTERSECTION_OF__CLASS_EXPRESSIONS = eINSTANCE.getObjectIntersectionOf_ClassExpressions();

		/**
     * The meta object literal for the '{@link de.uniko.isweb.emftext.sparqlas.SPARQLAS.impl.ObjectAllValuesFromImpl <em>Object All Values From</em>}' class.
     * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
     * @see de.uniko.isweb.emftext.sparqlas.SPARQLAS.impl.ObjectAllValuesFromImpl
     * @see de.uniko.isweb.emftext.sparqlas.SPARQLAS.impl.SPARQLASPackageImpl#getObjectAllValuesFrom()
     * @generated
     */
		EClass OBJECT_ALL_VALUES_FROM = eINSTANCE.getObjectAllValuesFrom();

		/**
     * The meta object literal for the '<em><b>Class Expression</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
     * @generated
     */
		EReference OBJECT_ALL_VALUES_FROM__CLASS_EXPRESSION = eINSTANCE.getObjectAllValuesFrom_ClassExpression();

		/**
     * The meta object literal for the '<em><b>Object Property Expression</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
     * @generated
     */
		EReference OBJECT_ALL_VALUES_FROM__OBJECT_PROPERTY_EXPRESSION = eINSTANCE.getObjectAllValuesFrom_ObjectPropertyExpression();

		/**
     * The meta object literal for the '{@link de.uniko.isweb.emftext.sparqlas.SPARQLAS.impl.ObjectSomeValuesFromImpl <em>Object Some Values From</em>}' class.
     * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
     * @see de.uniko.isweb.emftext.sparqlas.SPARQLAS.impl.ObjectSomeValuesFromImpl
     * @see de.uniko.isweb.emftext.sparqlas.SPARQLAS.impl.SPARQLASPackageImpl#getObjectSomeValuesFrom()
     * @generated
     */
		EClass OBJECT_SOME_VALUES_FROM = eINSTANCE.getObjectSomeValuesFrom();

		/**
     * The meta object literal for the '<em><b>Class Expression</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
     * @generated
     */
		EReference OBJECT_SOME_VALUES_FROM__CLASS_EXPRESSION = eINSTANCE.getObjectSomeValuesFrom_ClassExpression();

		/**
     * The meta object literal for the '<em><b>Object Property Expression</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
     * @generated
     */
		EReference OBJECT_SOME_VALUES_FROM__OBJECT_PROPERTY_EXPRESSION = eINSTANCE.getObjectSomeValuesFrom_ObjectPropertyExpression();

		/**
     * The meta object literal for the '{@link de.uniko.isweb.emftext.sparqlas.SPARQLAS.impl.ObjectHasValueImpl <em>Object Has Value</em>}' class.
     * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
     * @see de.uniko.isweb.emftext.sparqlas.SPARQLAS.impl.ObjectHasValueImpl
     * @see de.uniko.isweb.emftext.sparqlas.SPARQLAS.impl.SPARQLASPackageImpl#getObjectHasValue()
     * @generated
     */
		EClass OBJECT_HAS_VALUE = eINSTANCE.getObjectHasValue();

		/**
     * The meta object literal for the '<em><b>Individual</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
     * @generated
     */
		EReference OBJECT_HAS_VALUE__INDIVIDUAL = eINSTANCE.getObjectHasValue_Individual();

		/**
     * The meta object literal for the '<em><b>Object Property Expression</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
     * @generated
     */
		EReference OBJECT_HAS_VALUE__OBJECT_PROPERTY_EXPRESSION = eINSTANCE.getObjectHasValue_ObjectPropertyExpression();

		/**
     * The meta object literal for the '{@link de.uniko.isweb.emftext.sparqlas.SPARQLAS.impl.ObjectMinCardinalityImpl <em>Object Min Cardinality</em>}' class.
     * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
     * @see de.uniko.isweb.emftext.sparqlas.SPARQLAS.impl.ObjectMinCardinalityImpl
     * @see de.uniko.isweb.emftext.sparqlas.SPARQLAS.impl.SPARQLASPackageImpl#getObjectMinCardinality()
     * @generated
     */
		EClass OBJECT_MIN_CARDINALITY = eINSTANCE.getObjectMinCardinality();

		/**
     * The meta object literal for the '<em><b>Cardinality</b></em>' attribute feature.
     * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
     * @generated
     */
		EAttribute OBJECT_MIN_CARDINALITY__CARDINALITY = eINSTANCE.getObjectMinCardinality_Cardinality();

		/**
     * The meta object literal for the '<em><b>Class Expression</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
     * @generated
     */
		EReference OBJECT_MIN_CARDINALITY__CLASS_EXPRESSION = eINSTANCE.getObjectMinCardinality_ClassExpression();

		/**
     * The meta object literal for the '<em><b>Object Property Expression</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
     * @generated
     */
		EReference OBJECT_MIN_CARDINALITY__OBJECT_PROPERTY_EXPRESSION = eINSTANCE.getObjectMinCardinality_ObjectPropertyExpression();

		/**
     * The meta object literal for the '{@link de.uniko.isweb.emftext.sparqlas.SPARQLAS.impl.ObjectMaxCardinalityImpl <em>Object Max Cardinality</em>}' class.
     * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
     * @see de.uniko.isweb.emftext.sparqlas.SPARQLAS.impl.ObjectMaxCardinalityImpl
     * @see de.uniko.isweb.emftext.sparqlas.SPARQLAS.impl.SPARQLASPackageImpl#getObjectMaxCardinality()
     * @generated
     */
		EClass OBJECT_MAX_CARDINALITY = eINSTANCE.getObjectMaxCardinality();

		/**
     * The meta object literal for the '<em><b>Cardinality</b></em>' attribute feature.
     * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
     * @generated
     */
		EAttribute OBJECT_MAX_CARDINALITY__CARDINALITY = eINSTANCE.getObjectMaxCardinality_Cardinality();

		/**
     * The meta object literal for the '<em><b>Class Expression</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
     * @generated
     */
		EReference OBJECT_MAX_CARDINALITY__CLASS_EXPRESSION = eINSTANCE.getObjectMaxCardinality_ClassExpression();

		/**
     * The meta object literal for the '<em><b>Object Property Expression</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
     * @generated
     */
		EReference OBJECT_MAX_CARDINALITY__OBJECT_PROPERTY_EXPRESSION = eINSTANCE.getObjectMaxCardinality_ObjectPropertyExpression();

		/**
     * The meta object literal for the '{@link de.uniko.isweb.emftext.sparqlas.SPARQLAS.impl.ObjectExactCardinalityImpl <em>Object Exact Cardinality</em>}' class.
     * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
     * @see de.uniko.isweb.emftext.sparqlas.SPARQLAS.impl.ObjectExactCardinalityImpl
     * @see de.uniko.isweb.emftext.sparqlas.SPARQLAS.impl.SPARQLASPackageImpl#getObjectExactCardinality()
     * @generated
     */
		EClass OBJECT_EXACT_CARDINALITY = eINSTANCE.getObjectExactCardinality();

		/**
     * The meta object literal for the '<em><b>Cardinality</b></em>' attribute feature.
     * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
     * @generated
     */
		EAttribute OBJECT_EXACT_CARDINALITY__CARDINALITY = eINSTANCE.getObjectExactCardinality_Cardinality();

		/**
     * The meta object literal for the '<em><b>Class Expression</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
     * @generated
     */
		EReference OBJECT_EXACT_CARDINALITY__CLASS_EXPRESSION = eINSTANCE.getObjectExactCardinality_ClassExpression();

		/**
     * The meta object literal for the '<em><b>Object Property Expression</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
     * @generated
     */
		EReference OBJECT_EXACT_CARDINALITY__OBJECT_PROPERTY_EXPRESSION = eINSTANCE.getObjectExactCardinality_ObjectPropertyExpression();

		/**
     * The meta object literal for the '{@link de.uniko.isweb.emftext.sparqlas.SPARQLAS.impl.DataHasValueImpl <em>Data Has Value</em>}' class.
     * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
     * @see de.uniko.isweb.emftext.sparqlas.SPARQLAS.impl.DataHasValueImpl
     * @see de.uniko.isweb.emftext.sparqlas.SPARQLAS.impl.SPARQLASPackageImpl#getDataHasValue()
     * @generated
     */
		EClass DATA_HAS_VALUE = eINSTANCE.getDataHasValue();

		/**
     * The meta object literal for the '<em><b>Literal</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
     * @generated
     */
		EReference DATA_HAS_VALUE__LITERAL = eINSTANCE.getDataHasValue_Literal();

		/**
     * The meta object literal for the '<em><b>Data Property Expression</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
     * @generated
     */
		EReference DATA_HAS_VALUE__DATA_PROPERTY_EXPRESSION = eINSTANCE.getDataHasValue_DataPropertyExpression();

		/**
     * The meta object literal for the '{@link de.uniko.isweb.emftext.sparqlas.SPARQLAS.impl.IRIImpl <em>IRI</em>}' class.
     * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
     * @see de.uniko.isweb.emftext.sparqlas.SPARQLAS.impl.IRIImpl
     * @see de.uniko.isweb.emftext.sparqlas.SPARQLAS.impl.SPARQLASPackageImpl#getIRI()
     * @generated
     */
		EClass IRI = eINSTANCE.getIRI();

		/**
     * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
     * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
     * @generated
     */
		EAttribute IRI__ID = eINSTANCE.getIRI_Id();

		/**
     * The meta object literal for the '{@link de.uniko.isweb.emftext.sparqlas.SPARQLAS.impl.FullIRIImpl <em>Full IRI</em>}' class.
     * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
     * @see de.uniko.isweb.emftext.sparqlas.SPARQLAS.impl.FullIRIImpl
     * @see de.uniko.isweb.emftext.sparqlas.SPARQLAS.impl.SPARQLASPackageImpl#getFullIRI()
     * @generated
     */
		EClass FULL_IRI = eINSTANCE.getFullIRI();

		/**
     * The meta object literal for the '{@link de.uniko.isweb.emftext.sparqlas.SPARQLAS.impl.AbbreviatedIRIImpl <em>Abbreviated IRI</em>}' class.
     * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
     * @see de.uniko.isweb.emftext.sparqlas.SPARQLAS.impl.AbbreviatedIRIImpl
     * @see de.uniko.isweb.emftext.sparqlas.SPARQLAS.impl.SPARQLASPackageImpl#getAbbreviatedIRI()
     * @generated
     */
		EClass ABBREVIATED_IRI = eINSTANCE.getAbbreviatedIRI();

		/**
     * The meta object literal for the '{@link de.uniko.isweb.emftext.sparqlas.SPARQLAS.impl.DeclarationImpl <em>Declaration</em>}' class.
     * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
     * @see de.uniko.isweb.emftext.sparqlas.SPARQLAS.impl.DeclarationImpl
     * @see de.uniko.isweb.emftext.sparqlas.SPARQLAS.impl.SPARQLASPackageImpl#getDeclaration()
     * @generated
     */
		EClass DECLARATION = eINSTANCE.getDeclaration();

		/**
     * The meta object literal for the '{@link de.uniko.isweb.emftext.sparqlas.SPARQLAS.impl.ObjectPropertyDeclarationImpl <em>Object Property Declaration</em>}' class.
     * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
     * @see de.uniko.isweb.emftext.sparqlas.SPARQLAS.impl.ObjectPropertyDeclarationImpl
     * @see de.uniko.isweb.emftext.sparqlas.SPARQLAS.impl.SPARQLASPackageImpl#getObjectPropertyDeclaration()
     * @generated
     */
		EClass OBJECT_PROPERTY_DECLARATION = eINSTANCE.getObjectPropertyDeclaration();

		/**
     * The meta object literal for the '<em><b>Object Property Variable</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
     * @generated
     */
		EReference OBJECT_PROPERTY_DECLARATION__OBJECT_PROPERTY_VARIABLE = eINSTANCE.getObjectPropertyDeclaration_ObjectPropertyVariable();

		/**
     * The meta object literal for the '{@link de.uniko.isweb.emftext.sparqlas.SPARQLAS.impl.DatatypePropertyDeclarationImpl <em>Datatype Property Declaration</em>}' class.
     * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
     * @see de.uniko.isweb.emftext.sparqlas.SPARQLAS.impl.DatatypePropertyDeclarationImpl
     * @see de.uniko.isweb.emftext.sparqlas.SPARQLAS.impl.SPARQLASPackageImpl#getDatatypePropertyDeclaration()
     * @generated
     */
		EClass DATATYPE_PROPERTY_DECLARATION = eINSTANCE.getDatatypePropertyDeclaration();

		/**
     * The meta object literal for the '<em><b>Datatype Property Variable</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
     * @generated
     */
		EReference DATATYPE_PROPERTY_DECLARATION__DATATYPE_PROPERTY_VARIABLE = eINSTANCE.getDatatypePropertyDeclaration_DatatypePropertyVariable();

		/**
     * The meta object literal for the '{@link de.uniko.isweb.emftext.sparqlas.SPARQLAS.impl.IndividualDeclarationImpl <em>Individual Declaration</em>}' class.
     * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
     * @see de.uniko.isweb.emftext.sparqlas.SPARQLAS.impl.IndividualDeclarationImpl
     * @see de.uniko.isweb.emftext.sparqlas.SPARQLAS.impl.SPARQLASPackageImpl#getIndividualDeclaration()
     * @generated
     */
		EClass INDIVIDUAL_DECLARATION = eINSTANCE.getIndividualDeclaration();

		/**
     * The meta object literal for the '<em><b>Individual Variable</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
     * @generated
     */
		EReference INDIVIDUAL_DECLARATION__INDIVIDUAL_VARIABLE = eINSTANCE.getIndividualDeclaration_IndividualVariable();

		/**
     * The meta object literal for the '{@link de.uniko.isweb.emftext.sparqlas.SPARQLAS.impl.ClassDeclarationImpl <em>Class Declaration</em>}' class.
     * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
     * @see de.uniko.isweb.emftext.sparqlas.SPARQLAS.impl.ClassDeclarationImpl
     * @see de.uniko.isweb.emftext.sparqlas.SPARQLAS.impl.SPARQLASPackageImpl#getClassDeclaration()
     * @generated
     */
		EClass CLASS_DECLARATION = eINSTANCE.getClassDeclaration();

		/**
     * The meta object literal for the '<em><b>Class Variable</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
     * @generated
     */
		EReference CLASS_DECLARATION__CLASS_VARIABLE = eINSTANCE.getClassDeclaration_ClassVariable();

		/**
     * The meta object literal for the '{@link de.uniko.isweb.emftext.sparqlas.SPARQLAS.impl.ConstantImpl <em>Constant</em>}' class.
     * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
     * @see de.uniko.isweb.emftext.sparqlas.SPARQLAS.impl.ConstantImpl
     * @see de.uniko.isweb.emftext.sparqlas.SPARQLAS.impl.SPARQLASPackageImpl#getConstant()
     * @generated
     */
		EClass CONSTANT = eINSTANCE.getConstant();

		/**
     * The meta object literal for the '<em><b>Constant IRI</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
     * @generated
     */
		EReference CONSTANT__CONSTANT_IRI = eINSTANCE.getConstant_ConstantIRI();

		/**
     * The meta object literal for the '{@link de.uniko.isweb.emftext.sparqlas.SPARQLAS.impl.TermImpl <em>Term</em>}' class.
     * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
     * @see de.uniko.isweb.emftext.sparqlas.SPARQLAS.impl.TermImpl
     * @see de.uniko.isweb.emftext.sparqlas.SPARQLAS.impl.SPARQLASPackageImpl#getTerm()
     * @generated
     */
		EClass TERM = eINSTANCE.getTerm();

	}

} //SPARQLASPackage
