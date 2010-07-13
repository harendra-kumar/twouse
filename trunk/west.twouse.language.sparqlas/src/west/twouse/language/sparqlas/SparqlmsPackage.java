/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package west.twouse.language.sparqlas;

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
 * @see west.twouse.language.sparqlas.SparqlmsFactory
 * @model kind="package"
 * @generated
 */
public interface SparqlmsPackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "sparqlas";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://west.uni-koblenz.de/sparqlas";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "sparqlas";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  SparqlmsPackage eINSTANCE = west.twouse.language.sparqlas.impl.SparqlmsPackageImpl.init();

  /**
   * The meta object id for the '{@link west.twouse.language.sparqlas.impl.OntologyDocumentImpl <em>Ontology Document</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see west.twouse.language.sparqlas.impl.OntologyDocumentImpl
   * @see west.twouse.language.sparqlas.impl.SparqlmsPackageImpl#getOntologyDocument()
   * @generated
   */
  int ONTOLOGY_DOCUMENT = 0;

  /**
   * The feature id for the '<em><b>Query IRI</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ONTOLOGY_DOCUMENT__QUERY_IRI = 0;

  /**
   * The feature id for the '<em><b>Import</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ONTOLOGY_DOCUMENT__IMPORT = 1;

  /**
   * The feature id for the '<em><b>Prefix Definition</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ONTOLOGY_DOCUMENT__PREFIX_DEFINITION = 2;

  /**
   * The feature id for the '<em><b>Query</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ONTOLOGY_DOCUMENT__QUERY = 3;

  /**
   * The number of structural features of the '<em>Ontology Document</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ONTOLOGY_DOCUMENT_FEATURE_COUNT = 4;

  /**
   * The meta object id for the '{@link west.twouse.language.sparqlas.impl.ImportImpl <em>Import</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see west.twouse.language.sparqlas.impl.ImportImpl
   * @see west.twouse.language.sparqlas.impl.SparqlmsPackageImpl#getImport()
   * @generated
   */
  int IMPORT = 1;

  /**
   * The feature id for the '<em><b>Import IRI</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IMPORT__IMPORT_IRI = 0;

  /**
   * The number of structural features of the '<em>Import</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IMPORT_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link west.twouse.language.sparqlas.impl.PrefixDefinitionImpl <em>Prefix Definition</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see west.twouse.language.sparqlas.impl.PrefixDefinitionImpl
   * @see west.twouse.language.sparqlas.impl.SparqlmsPackageImpl#getPrefixDefinition()
   * @generated
   */
  int PREFIX_DEFINITION = 2;

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
   * The meta object id for the '{@link west.twouse.language.sparqlas.impl.QueryImpl <em>Query</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see west.twouse.language.sparqlas.impl.QueryImpl
   * @see west.twouse.language.sparqlas.impl.SparqlmsPackageImpl#getQuery()
   * @generated
   */
  int QUERY = 3;

  /**
   * The number of structural features of the '<em>Query</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int QUERY_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link west.twouse.language.sparqlas.impl.SelectQueryImpl <em>Select Query</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see west.twouse.language.sparqlas.impl.SelectQueryImpl
   * @see west.twouse.language.sparqlas.impl.SparqlmsPackageImpl#getSelectQuery()
   * @generated
   */
  int SELECT_QUERY = 4;

  /**
   * The feature id for the '<em><b>Owned Template Signature</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SELECT_QUERY__OWNED_TEMPLATE_SIGNATURE = QUERY_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Template Binding</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SELECT_QUERY__TEMPLATE_BINDING = QUERY_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Atoms</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SELECT_QUERY__ATOMS = QUERY_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>Select Query</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SELECT_QUERY_FEATURE_COUNT = QUERY_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link west.twouse.language.sparqlas.impl.ConstructQueryImpl <em>Construct Query</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see west.twouse.language.sparqlas.impl.ConstructQueryImpl
   * @see west.twouse.language.sparqlas.impl.SparqlmsPackageImpl#getConstructQuery()
   * @generated
   */
  int CONSTRUCT_QUERY = 5;

  /**
   * The feature id for the '<em><b>Owned Template Signature</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONSTRUCT_QUERY__OWNED_TEMPLATE_SIGNATURE = QUERY_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Template Binding</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONSTRUCT_QUERY__TEMPLATE_BINDING = QUERY_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Construct Atoms</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONSTRUCT_QUERY__CONSTRUCT_ATOMS = QUERY_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Where Atoms</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONSTRUCT_QUERY__WHERE_ATOMS = QUERY_FEATURE_COUNT + 3;

  /**
   * The number of structural features of the '<em>Construct Query</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONSTRUCT_QUERY_FEATURE_COUNT = QUERY_FEATURE_COUNT + 4;

  /**
   * The meta object id for the '{@link west.twouse.language.sparqlas.impl.AskQueryImpl <em>Ask Query</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see west.twouse.language.sparqlas.impl.AskQueryImpl
   * @see west.twouse.language.sparqlas.impl.SparqlmsPackageImpl#getAskQuery()
   * @generated
   */
  int ASK_QUERY = 6;

  /**
   * The feature id for the '<em><b>Owned Template Signature</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ASK_QUERY__OWNED_TEMPLATE_SIGNATURE = QUERY_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Template Binding</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ASK_QUERY__TEMPLATE_BINDING = QUERY_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Atoms</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ASK_QUERY__ATOMS = QUERY_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>Ask Query</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ASK_QUERY_FEATURE_COUNT = QUERY_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link west.twouse.language.sparqlas.impl.DescribeQueryImpl <em>Describe Query</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see west.twouse.language.sparqlas.impl.DescribeQueryImpl
   * @see west.twouse.language.sparqlas.impl.SparqlmsPackageImpl#getDescribeQuery()
   * @generated
   */
  int DESCRIBE_QUERY = 7;

  /**
   * The feature id for the '<em><b>Owned Template Signature</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DESCRIBE_QUERY__OWNED_TEMPLATE_SIGNATURE = QUERY_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Template Binding</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DESCRIBE_QUERY__TEMPLATE_BINDING = QUERY_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Describe IRI</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DESCRIBE_QUERY__DESCRIBE_IRI = QUERY_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Atoms</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DESCRIBE_QUERY__ATOMS = QUERY_FEATURE_COUNT + 3;

  /**
   * The number of structural features of the '<em>Describe Query</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DESCRIBE_QUERY_FEATURE_COUNT = QUERY_FEATURE_COUNT + 4;

  /**
   * The meta object id for the '{@link west.twouse.language.sparqlas.impl.IRIImpl <em>IRI</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see west.twouse.language.sparqlas.impl.IRIImpl
   * @see west.twouse.language.sparqlas.impl.SparqlmsPackageImpl#getIRI()
   * @generated
   */
  int IRI = 8;

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
   * The meta object id for the '{@link west.twouse.language.sparqlas.impl.FullIRIImpl <em>Full IRI</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see west.twouse.language.sparqlas.impl.FullIRIImpl
   * @see west.twouse.language.sparqlas.impl.SparqlmsPackageImpl#getFullIRI()
   * @generated
   */
  int FULL_IRI = 9;

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
   * The meta object id for the '{@link west.twouse.language.sparqlas.impl.AbbreviatedIRIImpl <em>Abbreviated IRI</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see west.twouse.language.sparqlas.impl.AbbreviatedIRIImpl
   * @see west.twouse.language.sparqlas.impl.SparqlmsPackageImpl#getAbbreviatedIRI()
   * @generated
   */
  int ABBREVIATED_IRI = 10;

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
   * The meta object id for the '{@link west.twouse.language.sparqlas.impl.TermImpl <em>Term</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see west.twouse.language.sparqlas.impl.TermImpl
   * @see west.twouse.language.sparqlas.impl.SparqlmsPackageImpl#getTerm()
   * @generated
   */
  int TERM = 11;

  /**
   * The number of structural features of the '<em>Term</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TERM_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link west.twouse.language.sparqlas.impl.VariableImpl <em>Variable</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see west.twouse.language.sparqlas.impl.VariableImpl
   * @see west.twouse.language.sparqlas.impl.SparqlmsPackageImpl#getVariable()
   * @generated
   */
  int VARIABLE = 12;

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
   * The meta object id for the '{@link west.twouse.language.sparqlas.impl.ClassVariableImpl <em>Class Variable</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see west.twouse.language.sparqlas.impl.ClassVariableImpl
   * @see west.twouse.language.sparqlas.impl.SparqlmsPackageImpl#getClassVariable()
   * @generated
   */
  int CLASS_VARIABLE = 13;

  /**
   * The feature id for the '<em><b>Symbol</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CLASS_VARIABLE__SYMBOL = VARIABLE__SYMBOL;

  /**
   * The feature id for the '<em><b>Template Parameter</b></em>' container reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CLASS_VARIABLE__TEMPLATE_PARAMETER = VARIABLE_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Class Variable</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CLASS_VARIABLE_FEATURE_COUNT = VARIABLE_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link west.twouse.language.sparqlas.impl.ObjectPropertyVariableImpl <em>Object Property Variable</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see west.twouse.language.sparqlas.impl.ObjectPropertyVariableImpl
   * @see west.twouse.language.sparqlas.impl.SparqlmsPackageImpl#getObjectPropertyVariable()
   * @generated
   */
  int OBJECT_PROPERTY_VARIABLE = 14;

  /**
   * The feature id for the '<em><b>Symbol</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OBJECT_PROPERTY_VARIABLE__SYMBOL = VARIABLE__SYMBOL;

  /**
   * The feature id for the '<em><b>Template Parameter</b></em>' container reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OBJECT_PROPERTY_VARIABLE__TEMPLATE_PARAMETER = VARIABLE_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Object Property Variable</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OBJECT_PROPERTY_VARIABLE_FEATURE_COUNT = VARIABLE_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link west.twouse.language.sparqlas.impl.DataPropertyVariableImpl <em>Data Property Variable</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see west.twouse.language.sparqlas.impl.DataPropertyVariableImpl
   * @see west.twouse.language.sparqlas.impl.SparqlmsPackageImpl#getDataPropertyVariable()
   * @generated
   */
  int DATA_PROPERTY_VARIABLE = 15;

  /**
   * The feature id for the '<em><b>Symbol</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATA_PROPERTY_VARIABLE__SYMBOL = VARIABLE__SYMBOL;

  /**
   * The feature id for the '<em><b>Template Parameter</b></em>' container reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATA_PROPERTY_VARIABLE__TEMPLATE_PARAMETER = VARIABLE_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Data Property Variable</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATA_PROPERTY_VARIABLE_FEATURE_COUNT = VARIABLE_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link west.twouse.language.sparqlas.impl.IndividualVariableImpl <em>Individual Variable</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see west.twouse.language.sparqlas.impl.IndividualVariableImpl
   * @see west.twouse.language.sparqlas.impl.SparqlmsPackageImpl#getIndividualVariable()
   * @generated
   */
  int INDIVIDUAL_VARIABLE = 16;

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
   * The meta object id for the '{@link west.twouse.language.sparqlas.impl.ConstantImpl <em>Constant</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see west.twouse.language.sparqlas.impl.ConstantImpl
   * @see west.twouse.language.sparqlas.impl.SparqlmsPackageImpl#getConstant()
   * @generated
   */
  int CONSTANT = 17;

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
   * The meta object id for the '{@link west.twouse.language.sparqlas.impl.ParameterableElementImpl <em>Parameterable Element</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see west.twouse.language.sparqlas.impl.ParameterableElementImpl
   * @see west.twouse.language.sparqlas.impl.SparqlmsPackageImpl#getParameterableElement()
   * @generated
   */
  int PARAMETERABLE_ELEMENT = 99;

  /**
   * The feature id for the '<em><b>Template Parameter</b></em>' container reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARAMETERABLE_ELEMENT__TEMPLATE_PARAMETER = 0;

  /**
   * The number of structural features of the '<em>Parameterable Element</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARAMETERABLE_ELEMENT_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link west.twouse.language.sparqlas.impl.ExpressionImpl <em>Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see west.twouse.language.sparqlas.impl.ExpressionImpl
   * @see west.twouse.language.sparqlas.impl.SparqlmsPackageImpl#getExpression()
   * @generated
   */
  int EXPRESSION = 28;

  /**
   * The feature id for the '<em><b>Template Parameter</b></em>' container reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPRESSION__TEMPLATE_PARAMETER = PARAMETERABLE_ELEMENT__TEMPLATE_PARAMETER;

  /**
   * The number of structural features of the '<em>Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPRESSION_FEATURE_COUNT = PARAMETERABLE_ELEMENT_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link west.twouse.language.sparqlas.impl.ClassExpressionImpl <em>Class Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see west.twouse.language.sparqlas.impl.ClassExpressionImpl
   * @see west.twouse.language.sparqlas.impl.SparqlmsPackageImpl#getClassExpression()
   * @generated
   */
  int CLASS_EXPRESSION = 43;

  /**
   * The feature id for the '<em><b>Template Parameter</b></em>' container reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CLASS_EXPRESSION__TEMPLATE_PARAMETER = EXPRESSION__TEMPLATE_PARAMETER;

  /**
   * The number of structural features of the '<em>Class Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CLASS_EXPRESSION_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link west.twouse.language.sparqlas.impl.ClassImpl <em>Class</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see west.twouse.language.sparqlas.impl.ClassImpl
   * @see west.twouse.language.sparqlas.impl.SparqlmsPackageImpl#getClass_()
   * @generated
   */
  int CLASS = 18;

  /**
   * The feature id for the '<em><b>Template Parameter</b></em>' container reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CLASS__TEMPLATE_PARAMETER = CLASS_EXPRESSION__TEMPLATE_PARAMETER;

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
   * The meta object id for the '{@link west.twouse.language.sparqlas.impl.DatatypeImpl <em>Datatype</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see west.twouse.language.sparqlas.impl.DatatypeImpl
   * @see west.twouse.language.sparqlas.impl.SparqlmsPackageImpl#getDatatype()
   * @generated
   */
  int DATATYPE = 19;

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
   * The meta object id for the '{@link west.twouse.language.sparqlas.impl.ObjectPropertyExpressionImpl <em>Object Property Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see west.twouse.language.sparqlas.impl.ObjectPropertyExpressionImpl
   * @see west.twouse.language.sparqlas.impl.SparqlmsPackageImpl#getObjectPropertyExpression()
   * @generated
   */
  int OBJECT_PROPERTY_EXPRESSION = 82;

  /**
   * The feature id for the '<em><b>Template Parameter</b></em>' container reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OBJECT_PROPERTY_EXPRESSION__TEMPLATE_PARAMETER = EXPRESSION__TEMPLATE_PARAMETER;

  /**
   * The number of structural features of the '<em>Object Property Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OBJECT_PROPERTY_EXPRESSION_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link west.twouse.language.sparqlas.impl.ObjectPropertyImpl <em>Object Property</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see west.twouse.language.sparqlas.impl.ObjectPropertyImpl
   * @see west.twouse.language.sparqlas.impl.SparqlmsPackageImpl#getObjectProperty()
   * @generated
   */
  int OBJECT_PROPERTY = 20;

  /**
   * The feature id for the '<em><b>Template Parameter</b></em>' container reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OBJECT_PROPERTY__TEMPLATE_PARAMETER = OBJECT_PROPERTY_EXPRESSION__TEMPLATE_PARAMETER;

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
   * The meta object id for the '{@link west.twouse.language.sparqlas.impl.DataPropertyExpressionImpl <em>Data Property Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see west.twouse.language.sparqlas.impl.DataPropertyExpressionImpl
   * @see west.twouse.language.sparqlas.impl.SparqlmsPackageImpl#getDataPropertyExpression()
   * @generated
   */
  int DATA_PROPERTY_EXPRESSION = 91;

  /**
   * The feature id for the '<em><b>Template Parameter</b></em>' container reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATA_PROPERTY_EXPRESSION__TEMPLATE_PARAMETER = EXPRESSION__TEMPLATE_PARAMETER;

  /**
   * The number of structural features of the '<em>Data Property Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATA_PROPERTY_EXPRESSION_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link west.twouse.language.sparqlas.impl.DataPropertyImpl <em>Data Property</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see west.twouse.language.sparqlas.impl.DataPropertyImpl
   * @see west.twouse.language.sparqlas.impl.SparqlmsPackageImpl#getDataProperty()
   * @generated
   */
  int DATA_PROPERTY = 21;

  /**
   * The feature id for the '<em><b>Template Parameter</b></em>' container reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATA_PROPERTY__TEMPLATE_PARAMETER = DATA_PROPERTY_EXPRESSION__TEMPLATE_PARAMETER;

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
   * The meta object id for the '{@link west.twouse.language.sparqlas.impl.IndividualImpl <em>Individual</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see west.twouse.language.sparqlas.impl.IndividualImpl
   * @see west.twouse.language.sparqlas.impl.SparqlmsPackageImpl#getIndividual()
   * @generated
   */
  int INDIVIDUAL = 22;

  /**
   * The number of structural features of the '<em>Individual</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INDIVIDUAL_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link west.twouse.language.sparqlas.impl.NamedIndividualImpl <em>Named Individual</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see west.twouse.language.sparqlas.impl.NamedIndividualImpl
   * @see west.twouse.language.sparqlas.impl.SparqlmsPackageImpl#getNamedIndividual()
   * @generated
   */
  int NAMED_INDIVIDUAL = 23;

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
   * The meta object id for the '{@link west.twouse.language.sparqlas.impl.AnonymousIndividualImpl <em>Anonymous Individual</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see west.twouse.language.sparqlas.impl.AnonymousIndividualImpl
   * @see west.twouse.language.sparqlas.impl.SparqlmsPackageImpl#getAnonymousIndividual()
   * @generated
   */
  int ANONYMOUS_INDIVIDUAL = 24;

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
   * The meta object id for the '{@link west.twouse.language.sparqlas.impl.AbstractLiteralImpl <em>Abstract Literal</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see west.twouse.language.sparqlas.impl.AbstractLiteralImpl
   * @see west.twouse.language.sparqlas.impl.SparqlmsPackageImpl#getAbstractLiteral()
   * @generated
   */
  int ABSTRACT_LITERAL = 25;

  /**
   * The number of structural features of the '<em>Abstract Literal</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ABSTRACT_LITERAL_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link west.twouse.language.sparqlas.impl.LiteralVariableImpl <em>Literal Variable</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see west.twouse.language.sparqlas.impl.LiteralVariableImpl
   * @see west.twouse.language.sparqlas.impl.SparqlmsPackageImpl#getLiteralVariable()
   * @generated
   */
  int LITERAL_VARIABLE = 26;

  /**
   * The feature id for the '<em><b>Symbol</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LITERAL_VARIABLE__SYMBOL = VARIABLE__SYMBOL;

  /**
   * The number of structural features of the '<em>Literal Variable</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LITERAL_VARIABLE_FEATURE_COUNT = VARIABLE_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link west.twouse.language.sparqlas.impl.LiteralImpl <em>Literal</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see west.twouse.language.sparqlas.impl.LiteralImpl
   * @see west.twouse.language.sparqlas.impl.SparqlmsPackageImpl#getLiteral()
   * @generated
   */
  int LITERAL = 27;

  /**
   * The feature id for the '<em><b>Lexical Form</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LITERAL__LEXICAL_FORM = ABSTRACT_LITERAL_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Datatype</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LITERAL__DATATYPE = ABSTRACT_LITERAL_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Literal</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LITERAL_FEATURE_COUNT = ABSTRACT_LITERAL_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link west.twouse.language.sparqlas.impl.AtomImpl <em>Atom</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see west.twouse.language.sparqlas.impl.AtomImpl
   * @see west.twouse.language.sparqlas.impl.SparqlmsPackageImpl#getAtom()
   * @generated
   */
  int ATOM = 29;

  /**
   * The number of structural features of the '<em>Atom</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ATOM_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link west.twouse.language.sparqlas.impl.AssertionImpl <em>Assertion</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see west.twouse.language.sparqlas.impl.AssertionImpl
   * @see west.twouse.language.sparqlas.impl.SparqlmsPackageImpl#getAssertion()
   * @generated
   */
  int ASSERTION = 30;

  /**
   * The number of structural features of the '<em>Assertion</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ASSERTION_FEATURE_COUNT = ATOM_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link west.twouse.language.sparqlas.impl.ClassAssertionImpl <em>Class Assertion</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see west.twouse.language.sparqlas.impl.ClassAssertionImpl
   * @see west.twouse.language.sparqlas.impl.SparqlmsPackageImpl#getClassAssertion()
   * @generated
   */
  int CLASS_ASSERTION = 31;

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
   * The meta object id for the '{@link west.twouse.language.sparqlas.impl.ObjectPropertyAssertionImpl <em>Object Property Assertion</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see west.twouse.language.sparqlas.impl.ObjectPropertyAssertionImpl
   * @see west.twouse.language.sparqlas.impl.SparqlmsPackageImpl#getObjectPropertyAssertion()
   * @generated
   */
  int OBJECT_PROPERTY_ASSERTION = 32;

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
   * The meta object id for the '{@link west.twouse.language.sparqlas.impl.DataPropertyAssertionImpl <em>Data Property Assertion</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see west.twouse.language.sparqlas.impl.DataPropertyAssertionImpl
   * @see west.twouse.language.sparqlas.impl.SparqlmsPackageImpl#getDataPropertyAssertion()
   * @generated
   */
  int DATA_PROPERTY_ASSERTION = 33;

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
   * The meta object id for the '{@link west.twouse.language.sparqlas.impl.NegativeObjectPropertyAssertionImpl <em>Negative Object Property Assertion</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see west.twouse.language.sparqlas.impl.NegativeObjectPropertyAssertionImpl
   * @see west.twouse.language.sparqlas.impl.SparqlmsPackageImpl#getNegativeObjectPropertyAssertion()
   * @generated
   */
  int NEGATIVE_OBJECT_PROPERTY_ASSERTION = 34;

  /**
   * The feature id for the '<em><b>Source Individual</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NEGATIVE_OBJECT_PROPERTY_ASSERTION__SOURCE_INDIVIDUAL = ASSERTION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Target Individual</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NEGATIVE_OBJECT_PROPERTY_ASSERTION__TARGET_INDIVIDUAL = ASSERTION_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Object Property Expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NEGATIVE_OBJECT_PROPERTY_ASSERTION__OBJECT_PROPERTY_EXPRESSION = ASSERTION_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>Negative Object Property Assertion</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NEGATIVE_OBJECT_PROPERTY_ASSERTION_FEATURE_COUNT = ASSERTION_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link west.twouse.language.sparqlas.impl.NegativeDataPropertyAssertionImpl <em>Negative Data Property Assertion</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see west.twouse.language.sparqlas.impl.NegativeDataPropertyAssertionImpl
   * @see west.twouse.language.sparqlas.impl.SparqlmsPackageImpl#getNegativeDataPropertyAssertion()
   * @generated
   */
  int NEGATIVE_DATA_PROPERTY_ASSERTION = 35;

  /**
   * The feature id for the '<em><b>Source Individual</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NEGATIVE_DATA_PROPERTY_ASSERTION__SOURCE_INDIVIDUAL = ASSERTION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Target Value</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NEGATIVE_DATA_PROPERTY_ASSERTION__TARGET_VALUE = ASSERTION_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Data Property Expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NEGATIVE_DATA_PROPERTY_ASSERTION__DATA_PROPERTY_EXPRESSION = ASSERTION_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>Negative Data Property Assertion</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NEGATIVE_DATA_PROPERTY_ASSERTION_FEATURE_COUNT = ASSERTION_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link west.twouse.language.sparqlas.impl.SameIndividualImpl <em>Same Individual</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see west.twouse.language.sparqlas.impl.SameIndividualImpl
   * @see west.twouse.language.sparqlas.impl.SparqlmsPackageImpl#getSameIndividual()
   * @generated
   */
  int SAME_INDIVIDUAL = 36;

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
   * The meta object id for the '{@link west.twouse.language.sparqlas.impl.DifferentIndividualsImpl <em>Different Individuals</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see west.twouse.language.sparqlas.impl.DifferentIndividualsImpl
   * @see west.twouse.language.sparqlas.impl.SparqlmsPackageImpl#getDifferentIndividuals()
   * @generated
   */
  int DIFFERENT_INDIVIDUALS = 37;

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
   * The meta object id for the '{@link west.twouse.language.sparqlas.impl.ClassAtomImpl <em>Class Atom</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see west.twouse.language.sparqlas.impl.ClassAtomImpl
   * @see west.twouse.language.sparqlas.impl.SparqlmsPackageImpl#getClassAtom()
   * @generated
   */
  int CLASS_ATOM = 38;

  /**
   * The number of structural features of the '<em>Class Atom</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CLASS_ATOM_FEATURE_COUNT = ATOM_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link west.twouse.language.sparqlas.impl.SubClassOfImpl <em>Sub Class Of</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see west.twouse.language.sparqlas.impl.SubClassOfImpl
   * @see west.twouse.language.sparqlas.impl.SparqlmsPackageImpl#getSubClassOf()
   * @generated
   */
  int SUB_CLASS_OF = 39;

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
   * The meta object id for the '{@link west.twouse.language.sparqlas.impl.EquivalentClassesImpl <em>Equivalent Classes</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see west.twouse.language.sparqlas.impl.EquivalentClassesImpl
   * @see west.twouse.language.sparqlas.impl.SparqlmsPackageImpl#getEquivalentClasses()
   * @generated
   */
  int EQUIVALENT_CLASSES = 40;

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
   * The meta object id for the '{@link west.twouse.language.sparqlas.impl.DisjointClassesImpl <em>Disjoint Classes</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see west.twouse.language.sparqlas.impl.DisjointClassesImpl
   * @see west.twouse.language.sparqlas.impl.SparqlmsPackageImpl#getDisjointClasses()
   * @generated
   */
  int DISJOINT_CLASSES = 41;

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
   * The meta object id for the '{@link west.twouse.language.sparqlas.impl.DisjointUnionImpl <em>Disjoint Union</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see west.twouse.language.sparqlas.impl.DisjointUnionImpl
   * @see west.twouse.language.sparqlas.impl.SparqlmsPackageImpl#getDisjointUnion()
   * @generated
   */
  int DISJOINT_UNION = 42;

  /**
   * The feature id for the '<em><b>Class</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DISJOINT_UNION__CLASS = CLASS_ATOM_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Class Variable</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DISJOINT_UNION__CLASS_VARIABLE = CLASS_ATOM_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Disjoint Class Expressions</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DISJOINT_UNION__DISJOINT_CLASS_EXPRESSIONS = CLASS_ATOM_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>Disjoint Union</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DISJOINT_UNION_FEATURE_COUNT = CLASS_ATOM_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link west.twouse.language.sparqlas.impl.ObjectUnionOfImpl <em>Object Union Of</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see west.twouse.language.sparqlas.impl.ObjectUnionOfImpl
   * @see west.twouse.language.sparqlas.impl.SparqlmsPackageImpl#getObjectUnionOf()
   * @generated
   */
  int OBJECT_UNION_OF = 44;

  /**
   * The feature id for the '<em><b>Template Parameter</b></em>' container reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OBJECT_UNION_OF__TEMPLATE_PARAMETER = CLASS_EXPRESSION__TEMPLATE_PARAMETER;

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
   * The meta object id for the '{@link west.twouse.language.sparqlas.impl.ObjectComplementOfImpl <em>Object Complement Of</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see west.twouse.language.sparqlas.impl.ObjectComplementOfImpl
   * @see west.twouse.language.sparqlas.impl.SparqlmsPackageImpl#getObjectComplementOf()
   * @generated
   */
  int OBJECT_COMPLEMENT_OF = 45;

  /**
   * The feature id for the '<em><b>Template Parameter</b></em>' container reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OBJECT_COMPLEMENT_OF__TEMPLATE_PARAMETER = CLASS_EXPRESSION__TEMPLATE_PARAMETER;

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
   * The meta object id for the '{@link west.twouse.language.sparqlas.impl.ObjectOneOfImpl <em>Object One Of</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see west.twouse.language.sparqlas.impl.ObjectOneOfImpl
   * @see west.twouse.language.sparqlas.impl.SparqlmsPackageImpl#getObjectOneOf()
   * @generated
   */
  int OBJECT_ONE_OF = 46;

  /**
   * The feature id for the '<em><b>Template Parameter</b></em>' container reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OBJECT_ONE_OF__TEMPLATE_PARAMETER = CLASS_EXPRESSION__TEMPLATE_PARAMETER;

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
   * The meta object id for the '{@link west.twouse.language.sparqlas.impl.ObjectIntersectionOfImpl <em>Object Intersection Of</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see west.twouse.language.sparqlas.impl.ObjectIntersectionOfImpl
   * @see west.twouse.language.sparqlas.impl.SparqlmsPackageImpl#getObjectIntersectionOf()
   * @generated
   */
  int OBJECT_INTERSECTION_OF = 47;

  /**
   * The feature id for the '<em><b>Template Parameter</b></em>' container reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OBJECT_INTERSECTION_OF__TEMPLATE_PARAMETER = CLASS_EXPRESSION__TEMPLATE_PARAMETER;

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
   * The meta object id for the '{@link west.twouse.language.sparqlas.impl.ObjectAllValuesFromImpl <em>Object All Values From</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see west.twouse.language.sparqlas.impl.ObjectAllValuesFromImpl
   * @see west.twouse.language.sparqlas.impl.SparqlmsPackageImpl#getObjectAllValuesFrom()
   * @generated
   */
  int OBJECT_ALL_VALUES_FROM = 48;

  /**
   * The feature id for the '<em><b>Template Parameter</b></em>' container reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OBJECT_ALL_VALUES_FROM__TEMPLATE_PARAMETER = CLASS_EXPRESSION__TEMPLATE_PARAMETER;

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
   * The meta object id for the '{@link west.twouse.language.sparqlas.impl.ObjectSomeValuesFromImpl <em>Object Some Values From</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see west.twouse.language.sparqlas.impl.ObjectSomeValuesFromImpl
   * @see west.twouse.language.sparqlas.impl.SparqlmsPackageImpl#getObjectSomeValuesFrom()
   * @generated
   */
  int OBJECT_SOME_VALUES_FROM = 49;

  /**
   * The feature id for the '<em><b>Template Parameter</b></em>' container reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OBJECT_SOME_VALUES_FROM__TEMPLATE_PARAMETER = CLASS_EXPRESSION__TEMPLATE_PARAMETER;

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
   * The meta object id for the '{@link west.twouse.language.sparqlas.impl.ObjectHasValueImpl <em>Object Has Value</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see west.twouse.language.sparqlas.impl.ObjectHasValueImpl
   * @see west.twouse.language.sparqlas.impl.SparqlmsPackageImpl#getObjectHasValue()
   * @generated
   */
  int OBJECT_HAS_VALUE = 50;

  /**
   * The feature id for the '<em><b>Template Parameter</b></em>' container reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OBJECT_HAS_VALUE__TEMPLATE_PARAMETER = CLASS_EXPRESSION__TEMPLATE_PARAMETER;

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
   * The meta object id for the '{@link west.twouse.language.sparqlas.impl.ObjectMinCardinalityImpl <em>Object Min Cardinality</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see west.twouse.language.sparqlas.impl.ObjectMinCardinalityImpl
   * @see west.twouse.language.sparqlas.impl.SparqlmsPackageImpl#getObjectMinCardinality()
   * @generated
   */
  int OBJECT_MIN_CARDINALITY = 51;

  /**
   * The feature id for the '<em><b>Template Parameter</b></em>' container reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OBJECT_MIN_CARDINALITY__TEMPLATE_PARAMETER = CLASS_EXPRESSION__TEMPLATE_PARAMETER;

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
   * The meta object id for the '{@link west.twouse.language.sparqlas.impl.ObjectMaxCardinalityImpl <em>Object Max Cardinality</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see west.twouse.language.sparqlas.impl.ObjectMaxCardinalityImpl
   * @see west.twouse.language.sparqlas.impl.SparqlmsPackageImpl#getObjectMaxCardinality()
   * @generated
   */
  int OBJECT_MAX_CARDINALITY = 52;

  /**
   * The feature id for the '<em><b>Template Parameter</b></em>' container reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OBJECT_MAX_CARDINALITY__TEMPLATE_PARAMETER = CLASS_EXPRESSION__TEMPLATE_PARAMETER;

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
   * The meta object id for the '{@link west.twouse.language.sparqlas.impl.ObjectExactCardinalityImpl <em>Object Exact Cardinality</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see west.twouse.language.sparqlas.impl.ObjectExactCardinalityImpl
   * @see west.twouse.language.sparqlas.impl.SparqlmsPackageImpl#getObjectExactCardinality()
   * @generated
   */
  int OBJECT_EXACT_CARDINALITY = 53;

  /**
   * The feature id for the '<em><b>Template Parameter</b></em>' container reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OBJECT_EXACT_CARDINALITY__TEMPLATE_PARAMETER = CLASS_EXPRESSION__TEMPLATE_PARAMETER;

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
   * The meta object id for the '{@link west.twouse.language.sparqlas.impl.DataAllValuesFromImpl <em>Data All Values From</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see west.twouse.language.sparqlas.impl.DataAllValuesFromImpl
   * @see west.twouse.language.sparqlas.impl.SparqlmsPackageImpl#getDataAllValuesFrom()
   * @generated
   */
  int DATA_ALL_VALUES_FROM = 54;

  /**
   * The feature id for the '<em><b>Template Parameter</b></em>' container reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATA_ALL_VALUES_FROM__TEMPLATE_PARAMETER = CLASS_EXPRESSION__TEMPLATE_PARAMETER;

  /**
   * The feature id for the '<em><b>Data Range</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATA_ALL_VALUES_FROM__DATA_RANGE = CLASS_EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Data Property Expressions</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATA_ALL_VALUES_FROM__DATA_PROPERTY_EXPRESSIONS = CLASS_EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Data All Values From</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATA_ALL_VALUES_FROM_FEATURE_COUNT = CLASS_EXPRESSION_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link west.twouse.language.sparqlas.impl.DataSomeValuesFromImpl <em>Data Some Values From</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see west.twouse.language.sparqlas.impl.DataSomeValuesFromImpl
   * @see west.twouse.language.sparqlas.impl.SparqlmsPackageImpl#getDataSomeValuesFrom()
   * @generated
   */
  int DATA_SOME_VALUES_FROM = 55;

  /**
   * The feature id for the '<em><b>Template Parameter</b></em>' container reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATA_SOME_VALUES_FROM__TEMPLATE_PARAMETER = CLASS_EXPRESSION__TEMPLATE_PARAMETER;

  /**
   * The feature id for the '<em><b>Data Range</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATA_SOME_VALUES_FROM__DATA_RANGE = CLASS_EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Data Property Expressions</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATA_SOME_VALUES_FROM__DATA_PROPERTY_EXPRESSIONS = CLASS_EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Data Some Values From</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATA_SOME_VALUES_FROM_FEATURE_COUNT = CLASS_EXPRESSION_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link west.twouse.language.sparqlas.impl.DataHasValueImpl <em>Data Has Value</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see west.twouse.language.sparqlas.impl.DataHasValueImpl
   * @see west.twouse.language.sparqlas.impl.SparqlmsPackageImpl#getDataHasValue()
   * @generated
   */
  int DATA_HAS_VALUE = 56;

  /**
   * The feature id for the '<em><b>Template Parameter</b></em>' container reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATA_HAS_VALUE__TEMPLATE_PARAMETER = CLASS_EXPRESSION__TEMPLATE_PARAMETER;

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
   * The meta object id for the '{@link west.twouse.language.sparqlas.impl.DataMinCardinalityImpl <em>Data Min Cardinality</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see west.twouse.language.sparqlas.impl.DataMinCardinalityImpl
   * @see west.twouse.language.sparqlas.impl.SparqlmsPackageImpl#getDataMinCardinality()
   * @generated
   */
  int DATA_MIN_CARDINALITY = 57;

  /**
   * The feature id for the '<em><b>Template Parameter</b></em>' container reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATA_MIN_CARDINALITY__TEMPLATE_PARAMETER = CLASS_EXPRESSION__TEMPLATE_PARAMETER;

  /**
   * The feature id for the '<em><b>Cardinality</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATA_MIN_CARDINALITY__CARDINALITY = CLASS_EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Data Range</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATA_MIN_CARDINALITY__DATA_RANGE = CLASS_EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Data Property Expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATA_MIN_CARDINALITY__DATA_PROPERTY_EXPRESSION = CLASS_EXPRESSION_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>Data Min Cardinality</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATA_MIN_CARDINALITY_FEATURE_COUNT = CLASS_EXPRESSION_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link west.twouse.language.sparqlas.impl.DataMaxCardinalityImpl <em>Data Max Cardinality</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see west.twouse.language.sparqlas.impl.DataMaxCardinalityImpl
   * @see west.twouse.language.sparqlas.impl.SparqlmsPackageImpl#getDataMaxCardinality()
   * @generated
   */
  int DATA_MAX_CARDINALITY = 58;

  /**
   * The feature id for the '<em><b>Template Parameter</b></em>' container reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATA_MAX_CARDINALITY__TEMPLATE_PARAMETER = CLASS_EXPRESSION__TEMPLATE_PARAMETER;

  /**
   * The feature id for the '<em><b>Cardinality</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATA_MAX_CARDINALITY__CARDINALITY = CLASS_EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Data Range</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATA_MAX_CARDINALITY__DATA_RANGE = CLASS_EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Data Property Expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATA_MAX_CARDINALITY__DATA_PROPERTY_EXPRESSION = CLASS_EXPRESSION_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>Data Max Cardinality</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATA_MAX_CARDINALITY_FEATURE_COUNT = CLASS_EXPRESSION_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link west.twouse.language.sparqlas.impl.DataExactCardinalityImpl <em>Data Exact Cardinality</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see west.twouse.language.sparqlas.impl.DataExactCardinalityImpl
   * @see west.twouse.language.sparqlas.impl.SparqlmsPackageImpl#getDataExactCardinality()
   * @generated
   */
  int DATA_EXACT_CARDINALITY = 59;

  /**
   * The feature id for the '<em><b>Template Parameter</b></em>' container reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATA_EXACT_CARDINALITY__TEMPLATE_PARAMETER = CLASS_EXPRESSION__TEMPLATE_PARAMETER;

  /**
   * The feature id for the '<em><b>Cardinality</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATA_EXACT_CARDINALITY__CARDINALITY = CLASS_EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Data Range</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATA_EXACT_CARDINALITY__DATA_RANGE = CLASS_EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Data Property Expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATA_EXACT_CARDINALITY__DATA_PROPERTY_EXPRESSION = CLASS_EXPRESSION_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>Data Exact Cardinality</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATA_EXACT_CARDINALITY_FEATURE_COUNT = CLASS_EXPRESSION_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link west.twouse.language.sparqlas.impl.DataRangeImpl <em>Data Range</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see west.twouse.language.sparqlas.impl.DataRangeImpl
   * @see west.twouse.language.sparqlas.impl.SparqlmsPackageImpl#getDataRange()
   * @generated
   */
  int DATA_RANGE = 60;

  /**
   * The number of structural features of the '<em>Data Range</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATA_RANGE_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link west.twouse.language.sparqlas.impl.DataUnionOfImpl <em>Data Union Of</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see west.twouse.language.sparqlas.impl.DataUnionOfImpl
   * @see west.twouse.language.sparqlas.impl.SparqlmsPackageImpl#getDataUnionOf()
   * @generated
   */
  int DATA_UNION_OF = 61;

  /**
   * The feature id for the '<em><b>Data Ranges</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATA_UNION_OF__DATA_RANGES = DATA_RANGE_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Data Union Of</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATA_UNION_OF_FEATURE_COUNT = DATA_RANGE_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link west.twouse.language.sparqlas.impl.DataComplementOfImpl <em>Data Complement Of</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see west.twouse.language.sparqlas.impl.DataComplementOfImpl
   * @see west.twouse.language.sparqlas.impl.SparqlmsPackageImpl#getDataComplementOf()
   * @generated
   */
  int DATA_COMPLEMENT_OF = 62;

  /**
   * The feature id for the '<em><b>Data Range</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATA_COMPLEMENT_OF__DATA_RANGE = DATA_RANGE_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Data Complement Of</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATA_COMPLEMENT_OF_FEATURE_COUNT = DATA_RANGE_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link west.twouse.language.sparqlas.impl.DataOneOfImpl <em>Data One Of</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see west.twouse.language.sparqlas.impl.DataOneOfImpl
   * @see west.twouse.language.sparqlas.impl.SparqlmsPackageImpl#getDataOneOf()
   * @generated
   */
  int DATA_ONE_OF = 63;

  /**
   * The feature id for the '<em><b>Literals</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATA_ONE_OF__LITERALS = DATA_RANGE_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Data One Of</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATA_ONE_OF_FEATURE_COUNT = DATA_RANGE_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link west.twouse.language.sparqlas.impl.DataIntersectionOfImpl <em>Data Intersection Of</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see west.twouse.language.sparqlas.impl.DataIntersectionOfImpl
   * @see west.twouse.language.sparqlas.impl.SparqlmsPackageImpl#getDataIntersectionOf()
   * @generated
   */
  int DATA_INTERSECTION_OF = 64;

  /**
   * The feature id for the '<em><b>Data Ranges</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATA_INTERSECTION_OF__DATA_RANGES = DATA_RANGE_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Data Intersection Of</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATA_INTERSECTION_OF_FEATURE_COUNT = DATA_RANGE_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link west.twouse.language.sparqlas.impl.DatatypeRestrictionImpl <em>Datatype Restriction</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see west.twouse.language.sparqlas.impl.DatatypeRestrictionImpl
   * @see west.twouse.language.sparqlas.impl.SparqlmsPackageImpl#getDatatypeRestriction()
   * @generated
   */
  int DATATYPE_RESTRICTION = 65;

  /**
   * The feature id for the '<em><b>Datatype</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATATYPE_RESTRICTION__DATATYPE = DATA_RANGE_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Restrictions</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATATYPE_RESTRICTION__RESTRICTIONS = DATA_RANGE_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Datatype Restriction</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATATYPE_RESTRICTION_FEATURE_COUNT = DATA_RANGE_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link west.twouse.language.sparqlas.impl.FacetRestrictionImpl <em>Facet Restriction</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see west.twouse.language.sparqlas.impl.FacetRestrictionImpl
   * @see west.twouse.language.sparqlas.impl.SparqlmsPackageImpl#getFacetRestriction()
   * @generated
   */
  int FACET_RESTRICTION = 66;

  /**
   * The feature id for the '<em><b>Constraining Facet</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FACET_RESTRICTION__CONSTRAINING_FACET = 0;

  /**
   * The feature id for the '<em><b>Restriction Value</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FACET_RESTRICTION__RESTRICTION_VALUE = 1;

  /**
   * The number of structural features of the '<em>Facet Restriction</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FACET_RESTRICTION_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link west.twouse.language.sparqlas.impl.ObjectPropertyAtomImpl <em>Object Property Atom</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see west.twouse.language.sparqlas.impl.ObjectPropertyAtomImpl
   * @see west.twouse.language.sparqlas.impl.SparqlmsPackageImpl#getObjectPropertyAtom()
   * @generated
   */
  int OBJECT_PROPERTY_ATOM = 67;

  /**
   * The number of structural features of the '<em>Object Property Atom</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OBJECT_PROPERTY_ATOM_FEATURE_COUNT = ATOM_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link west.twouse.language.sparqlas.impl.SubObjectPropertyOfImpl <em>Sub Object Property Of</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see west.twouse.language.sparqlas.impl.SubObjectPropertyOfImpl
   * @see west.twouse.language.sparqlas.impl.SparqlmsPackageImpl#getSubObjectPropertyOf()
   * @generated
   */
  int SUB_OBJECT_PROPERTY_OF = 68;

  /**
   * The feature id for the '<em><b>Sub Object Property Expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SUB_OBJECT_PROPERTY_OF__SUB_OBJECT_PROPERTY_EXPRESSION = OBJECT_PROPERTY_ATOM_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Sub Object Property Chain</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SUB_OBJECT_PROPERTY_OF__SUB_OBJECT_PROPERTY_CHAIN = OBJECT_PROPERTY_ATOM_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Super Object Property Expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SUB_OBJECT_PROPERTY_OF__SUPER_OBJECT_PROPERTY_EXPRESSION = OBJECT_PROPERTY_ATOM_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>Sub Object Property Of</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SUB_OBJECT_PROPERTY_OF_FEATURE_COUNT = OBJECT_PROPERTY_ATOM_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link west.twouse.language.sparqlas.impl.ObjectPropertyChainImpl <em>Object Property Chain</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see west.twouse.language.sparqlas.impl.ObjectPropertyChainImpl
   * @see west.twouse.language.sparqlas.impl.SparqlmsPackageImpl#getObjectPropertyChain()
   * @generated
   */
  int OBJECT_PROPERTY_CHAIN = 69;

  /**
   * The feature id for the '<em><b>Object Property Expression</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OBJECT_PROPERTY_CHAIN__OBJECT_PROPERTY_EXPRESSION = 0;

  /**
   * The number of structural features of the '<em>Object Property Chain</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OBJECT_PROPERTY_CHAIN_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link west.twouse.language.sparqlas.impl.EquivalentObjectPropertiesImpl <em>Equivalent Object Properties</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see west.twouse.language.sparqlas.impl.EquivalentObjectPropertiesImpl
   * @see west.twouse.language.sparqlas.impl.SparqlmsPackageImpl#getEquivalentObjectProperties()
   * @generated
   */
  int EQUIVALENT_OBJECT_PROPERTIES = 70;

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
   * The meta object id for the '{@link west.twouse.language.sparqlas.impl.DisjointObjectPropertiesImpl <em>Disjoint Object Properties</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see west.twouse.language.sparqlas.impl.DisjointObjectPropertiesImpl
   * @see west.twouse.language.sparqlas.impl.SparqlmsPackageImpl#getDisjointObjectProperties()
   * @generated
   */
  int DISJOINT_OBJECT_PROPERTIES = 71;

  /**
   * The feature id for the '<em><b>Object Property Expression</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DISJOINT_OBJECT_PROPERTIES__OBJECT_PROPERTY_EXPRESSION = OBJECT_PROPERTY_ATOM_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Disjoint Object Properties</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DISJOINT_OBJECT_PROPERTIES_FEATURE_COUNT = OBJECT_PROPERTY_ATOM_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link west.twouse.language.sparqlas.impl.ObjectPropertyDomainImpl <em>Object Property Domain</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see west.twouse.language.sparqlas.impl.ObjectPropertyDomainImpl
   * @see west.twouse.language.sparqlas.impl.SparqlmsPackageImpl#getObjectPropertyDomain()
   * @generated
   */
  int OBJECT_PROPERTY_DOMAIN = 72;

  /**
   * The feature id for the '<em><b>Object Property Expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OBJECT_PROPERTY_DOMAIN__OBJECT_PROPERTY_EXPRESSION = OBJECT_PROPERTY_ATOM_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Domain</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OBJECT_PROPERTY_DOMAIN__DOMAIN = OBJECT_PROPERTY_ATOM_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Object Property Domain</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OBJECT_PROPERTY_DOMAIN_FEATURE_COUNT = OBJECT_PROPERTY_ATOM_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link west.twouse.language.sparqlas.impl.ObjectPropertyRangeImpl <em>Object Property Range</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see west.twouse.language.sparqlas.impl.ObjectPropertyRangeImpl
   * @see west.twouse.language.sparqlas.impl.SparqlmsPackageImpl#getObjectPropertyRange()
   * @generated
   */
  int OBJECT_PROPERTY_RANGE = 73;

  /**
   * The feature id for the '<em><b>Object Property Expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OBJECT_PROPERTY_RANGE__OBJECT_PROPERTY_EXPRESSION = OBJECT_PROPERTY_ATOM_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Range</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OBJECT_PROPERTY_RANGE__RANGE = OBJECT_PROPERTY_ATOM_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Object Property Range</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OBJECT_PROPERTY_RANGE_FEATURE_COUNT = OBJECT_PROPERTY_ATOM_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link west.twouse.language.sparqlas.impl.InverseObjectPropertyAtomImpl <em>Inverse Object Property Atom</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see west.twouse.language.sparqlas.impl.InverseObjectPropertyAtomImpl
   * @see west.twouse.language.sparqlas.impl.SparqlmsPackageImpl#getInverseObjectPropertyAtom()
   * @generated
   */
  int INVERSE_OBJECT_PROPERTY_ATOM = 74;

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
   * The meta object id for the '{@link west.twouse.language.sparqlas.impl.FunctionalObjectPropertyImpl <em>Functional Object Property</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see west.twouse.language.sparqlas.impl.FunctionalObjectPropertyImpl
   * @see west.twouse.language.sparqlas.impl.SparqlmsPackageImpl#getFunctionalObjectProperty()
   * @generated
   */
  int FUNCTIONAL_OBJECT_PROPERTY = 75;

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
   * The meta object id for the '{@link west.twouse.language.sparqlas.impl.InverseFunctionalObjectPropertyImpl <em>Inverse Functional Object Property</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see west.twouse.language.sparqlas.impl.InverseFunctionalObjectPropertyImpl
   * @see west.twouse.language.sparqlas.impl.SparqlmsPackageImpl#getInverseFunctionalObjectProperty()
   * @generated
   */
  int INVERSE_FUNCTIONAL_OBJECT_PROPERTY = 76;

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
   * The meta object id for the '{@link west.twouse.language.sparqlas.impl.ReflexiveObjectPropertyImpl <em>Reflexive Object Property</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see west.twouse.language.sparqlas.impl.ReflexiveObjectPropertyImpl
   * @see west.twouse.language.sparqlas.impl.SparqlmsPackageImpl#getReflexiveObjectProperty()
   * @generated
   */
  int REFLEXIVE_OBJECT_PROPERTY = 77;

  /**
   * The feature id for the '<em><b>Object Property Expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REFLEXIVE_OBJECT_PROPERTY__OBJECT_PROPERTY_EXPRESSION = OBJECT_PROPERTY_ATOM_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Reflexive Object Property</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REFLEXIVE_OBJECT_PROPERTY_FEATURE_COUNT = OBJECT_PROPERTY_ATOM_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link west.twouse.language.sparqlas.impl.IrreflexiveObjectPropertyImpl <em>Irreflexive Object Property</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see west.twouse.language.sparqlas.impl.IrreflexiveObjectPropertyImpl
   * @see west.twouse.language.sparqlas.impl.SparqlmsPackageImpl#getIrreflexiveObjectProperty()
   * @generated
   */
  int IRREFLEXIVE_OBJECT_PROPERTY = 78;

  /**
   * The feature id for the '<em><b>Object Property Expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IRREFLEXIVE_OBJECT_PROPERTY__OBJECT_PROPERTY_EXPRESSION = OBJECT_PROPERTY_ATOM_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Irreflexive Object Property</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IRREFLEXIVE_OBJECT_PROPERTY_FEATURE_COUNT = OBJECT_PROPERTY_ATOM_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link west.twouse.language.sparqlas.impl.SymmetricObjectPropertyImpl <em>Symmetric Object Property</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see west.twouse.language.sparqlas.impl.SymmetricObjectPropertyImpl
   * @see west.twouse.language.sparqlas.impl.SparqlmsPackageImpl#getSymmetricObjectProperty()
   * @generated
   */
  int SYMMETRIC_OBJECT_PROPERTY = 79;

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
   * The meta object id for the '{@link west.twouse.language.sparqlas.impl.AsymmetricObjectPropertyImpl <em>Asymmetric Object Property</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see west.twouse.language.sparqlas.impl.AsymmetricObjectPropertyImpl
   * @see west.twouse.language.sparqlas.impl.SparqlmsPackageImpl#getAsymmetricObjectProperty()
   * @generated
   */
  int ASYMMETRIC_OBJECT_PROPERTY = 80;

  /**
   * The feature id for the '<em><b>Object Property Expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ASYMMETRIC_OBJECT_PROPERTY__OBJECT_PROPERTY_EXPRESSION = OBJECT_PROPERTY_ATOM_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Asymmetric Object Property</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ASYMMETRIC_OBJECT_PROPERTY_FEATURE_COUNT = OBJECT_PROPERTY_ATOM_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link west.twouse.language.sparqlas.impl.TransitiveObjectPropertyImpl <em>Transitive Object Property</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see west.twouse.language.sparqlas.impl.TransitiveObjectPropertyImpl
   * @see west.twouse.language.sparqlas.impl.SparqlmsPackageImpl#getTransitiveObjectProperty()
   * @generated
   */
  int TRANSITIVE_OBJECT_PROPERTY = 81;

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
   * The meta object id for the '{@link west.twouse.language.sparqlas.impl.InverseObjectPropertyImpl <em>Inverse Object Property</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see west.twouse.language.sparqlas.impl.InverseObjectPropertyImpl
   * @see west.twouse.language.sparqlas.impl.SparqlmsPackageImpl#getInverseObjectProperty()
   * @generated
   */
  int INVERSE_OBJECT_PROPERTY = 83;

  /**
   * The feature id for the '<em><b>Template Parameter</b></em>' container reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INVERSE_OBJECT_PROPERTY__TEMPLATE_PARAMETER = OBJECT_PROPERTY_EXPRESSION__TEMPLATE_PARAMETER;

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
   * The meta object id for the '{@link west.twouse.language.sparqlas.impl.DataPropertyAtomImpl <em>Data Property Atom</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see west.twouse.language.sparqlas.impl.DataPropertyAtomImpl
   * @see west.twouse.language.sparqlas.impl.SparqlmsPackageImpl#getDataPropertyAtom()
   * @generated
   */
  int DATA_PROPERTY_ATOM = 84;

  /**
   * The number of structural features of the '<em>Data Property Atom</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATA_PROPERTY_ATOM_FEATURE_COUNT = ATOM_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link west.twouse.language.sparqlas.impl.SubDataPropertyOfImpl <em>Sub Data Property Of</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see west.twouse.language.sparqlas.impl.SubDataPropertyOfImpl
   * @see west.twouse.language.sparqlas.impl.SparqlmsPackageImpl#getSubDataPropertyOf()
   * @generated
   */
  int SUB_DATA_PROPERTY_OF = 85;

  /**
   * The feature id for the '<em><b>Sub Data Property Expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SUB_DATA_PROPERTY_OF__SUB_DATA_PROPERTY_EXPRESSION = DATA_PROPERTY_ATOM_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Super Data Property Expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SUB_DATA_PROPERTY_OF__SUPER_DATA_PROPERTY_EXPRESSION = DATA_PROPERTY_ATOM_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Sub Data Property Of</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SUB_DATA_PROPERTY_OF_FEATURE_COUNT = DATA_PROPERTY_ATOM_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link west.twouse.language.sparqlas.impl.EquivalentDataPropertiesImpl <em>Equivalent Data Properties</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see west.twouse.language.sparqlas.impl.EquivalentDataPropertiesImpl
   * @see west.twouse.language.sparqlas.impl.SparqlmsPackageImpl#getEquivalentDataProperties()
   * @generated
   */
  int EQUIVALENT_DATA_PROPERTIES = 86;

  /**
   * The feature id for the '<em><b>Data Property Expression</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EQUIVALENT_DATA_PROPERTIES__DATA_PROPERTY_EXPRESSION = DATA_PROPERTY_ATOM_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Equivalent Data Properties</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EQUIVALENT_DATA_PROPERTIES_FEATURE_COUNT = DATA_PROPERTY_ATOM_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link west.twouse.language.sparqlas.impl.DisjointDataPropertiesImpl <em>Disjoint Data Properties</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see west.twouse.language.sparqlas.impl.DisjointDataPropertiesImpl
   * @see west.twouse.language.sparqlas.impl.SparqlmsPackageImpl#getDisjointDataProperties()
   * @generated
   */
  int DISJOINT_DATA_PROPERTIES = 87;

  /**
   * The feature id for the '<em><b>Data Property Expression</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DISJOINT_DATA_PROPERTIES__DATA_PROPERTY_EXPRESSION = DATA_PROPERTY_ATOM_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Disjoint Data Properties</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DISJOINT_DATA_PROPERTIES_FEATURE_COUNT = DATA_PROPERTY_ATOM_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link west.twouse.language.sparqlas.impl.DataPropertyDomainImpl <em>Data Property Domain</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see west.twouse.language.sparqlas.impl.DataPropertyDomainImpl
   * @see west.twouse.language.sparqlas.impl.SparqlmsPackageImpl#getDataPropertyDomain()
   * @generated
   */
  int DATA_PROPERTY_DOMAIN = 88;

  /**
   * The feature id for the '<em><b>Data Property Expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATA_PROPERTY_DOMAIN__DATA_PROPERTY_EXPRESSION = DATA_PROPERTY_ATOM_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Domain</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATA_PROPERTY_DOMAIN__DOMAIN = DATA_PROPERTY_ATOM_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Data Property Domain</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATA_PROPERTY_DOMAIN_FEATURE_COUNT = DATA_PROPERTY_ATOM_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link west.twouse.language.sparqlas.impl.DataPropertyRangeImpl <em>Data Property Range</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see west.twouse.language.sparqlas.impl.DataPropertyRangeImpl
   * @see west.twouse.language.sparqlas.impl.SparqlmsPackageImpl#getDataPropertyRange()
   * @generated
   */
  int DATA_PROPERTY_RANGE = 89;

  /**
   * The feature id for the '<em><b>Data Property Expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATA_PROPERTY_RANGE__DATA_PROPERTY_EXPRESSION = DATA_PROPERTY_ATOM_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Range</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATA_PROPERTY_RANGE__RANGE = DATA_PROPERTY_ATOM_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Data Property Range</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATA_PROPERTY_RANGE_FEATURE_COUNT = DATA_PROPERTY_ATOM_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link west.twouse.language.sparqlas.impl.FunctionalDataPropertyImpl <em>Functional Data Property</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see west.twouse.language.sparqlas.impl.FunctionalDataPropertyImpl
   * @see west.twouse.language.sparqlas.impl.SparqlmsPackageImpl#getFunctionalDataProperty()
   * @generated
   */
  int FUNCTIONAL_DATA_PROPERTY = 90;

  /**
   * The feature id for the '<em><b>Data Property Expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FUNCTIONAL_DATA_PROPERTY__DATA_PROPERTY_EXPRESSION = DATA_PROPERTY_ATOM_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Functional Data Property</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FUNCTIONAL_DATA_PROPERTY_FEATURE_COUNT = DATA_PROPERTY_ATOM_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link west.twouse.language.sparqlas.impl.HasKeyImpl <em>Has Key</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see west.twouse.language.sparqlas.impl.HasKeyImpl
   * @see west.twouse.language.sparqlas.impl.SparqlmsPackageImpl#getHasKey()
   * @generated
   */
  int HAS_KEY = 92;

  /**
   * The feature id for the '<em><b>Class Expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HAS_KEY__CLASS_EXPRESSION = ATOM_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Object Property Expression</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HAS_KEY__OBJECT_PROPERTY_EXPRESSION = ATOM_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Data Property Expression</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HAS_KEY__DATA_PROPERTY_EXPRESSION = ATOM_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>Has Key</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HAS_KEY_FEATURE_COUNT = ATOM_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link west.twouse.language.sparqlas.impl.DeclarationImpl <em>Declaration</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see west.twouse.language.sparqlas.impl.DeclarationImpl
   * @see west.twouse.language.sparqlas.impl.SparqlmsPackageImpl#getDeclaration()
   * @generated
   */
  int DECLARATION = 93;

  /**
   * The number of structural features of the '<em>Declaration</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DECLARATION_FEATURE_COUNT = ATOM_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link west.twouse.language.sparqlas.impl.ClassDeclarationImpl <em>Class Declaration</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see west.twouse.language.sparqlas.impl.ClassDeclarationImpl
   * @see west.twouse.language.sparqlas.impl.SparqlmsPackageImpl#getClassDeclaration()
   * @generated
   */
  int CLASS_DECLARATION = 94;

  /**
   * The feature id for the '<em><b>Class</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CLASS_DECLARATION__CLASS = DECLARATION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Class Variable</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CLASS_DECLARATION__CLASS_VARIABLE = DECLARATION_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Class Declaration</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CLASS_DECLARATION_FEATURE_COUNT = DECLARATION_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link west.twouse.language.sparqlas.impl.ObjectPropertyDeclarationImpl <em>Object Property Declaration</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see west.twouse.language.sparqlas.impl.ObjectPropertyDeclarationImpl
   * @see west.twouse.language.sparqlas.impl.SparqlmsPackageImpl#getObjectPropertyDeclaration()
   * @generated
   */
  int OBJECT_PROPERTY_DECLARATION = 95;

  /**
   * The feature id for the '<em><b>Object Property</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OBJECT_PROPERTY_DECLARATION__OBJECT_PROPERTY = DECLARATION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Object Property Variable</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OBJECT_PROPERTY_DECLARATION__OBJECT_PROPERTY_VARIABLE = DECLARATION_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Object Property Declaration</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OBJECT_PROPERTY_DECLARATION_FEATURE_COUNT = DECLARATION_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link west.twouse.language.sparqlas.impl.DatatypePropertyDeclarationImpl <em>Datatype Property Declaration</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see west.twouse.language.sparqlas.impl.DatatypePropertyDeclarationImpl
   * @see west.twouse.language.sparqlas.impl.SparqlmsPackageImpl#getDatatypePropertyDeclaration()
   * @generated
   */
  int DATATYPE_PROPERTY_DECLARATION = 96;

  /**
   * The feature id for the '<em><b>Datatype Property</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATATYPE_PROPERTY_DECLARATION__DATATYPE_PROPERTY = DECLARATION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Datatype Property Variable</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATATYPE_PROPERTY_DECLARATION__DATATYPE_PROPERTY_VARIABLE = DECLARATION_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Datatype Property Declaration</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATATYPE_PROPERTY_DECLARATION_FEATURE_COUNT = DECLARATION_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link west.twouse.language.sparqlas.impl.IndividualDeclarationImpl <em>Individual Declaration</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see west.twouse.language.sparqlas.impl.IndividualDeclarationImpl
   * @see west.twouse.language.sparqlas.impl.SparqlmsPackageImpl#getIndividualDeclaration()
   * @generated
   */
  int INDIVIDUAL_DECLARATION = 97;

  /**
   * The feature id for the '<em><b>Individual</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INDIVIDUAL_DECLARATION__INDIVIDUAL = DECLARATION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Individual Variable</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INDIVIDUAL_DECLARATION__INDIVIDUAL_VARIABLE = DECLARATION_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Individual Declaration</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INDIVIDUAL_DECLARATION_FEATURE_COUNT = DECLARATION_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link west.twouse.language.sparqlas.impl.TemplateParameterImpl <em>Template Parameter</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see west.twouse.language.sparqlas.impl.TemplateParameterImpl
   * @see west.twouse.language.sparqlas.impl.SparqlmsPackageImpl#getTemplateParameter()
   * @generated
   */
  int TEMPLATE_PARAMETER = 98;

  /**
   * The feature id for the '<em><b>Signature</b></em>' container reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TEMPLATE_PARAMETER__SIGNATURE = 0;

  /**
   * The feature id for the '<em><b>Parametered Element</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TEMPLATE_PARAMETER__PARAMETERED_ELEMENT = 1;

  /**
   * The feature id for the '<em><b>Parameter Substitution</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TEMPLATE_PARAMETER__PARAMETER_SUBSTITUTION = 2;

  /**
   * The number of structural features of the '<em>Template Parameter</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TEMPLATE_PARAMETER_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link west.twouse.language.sparqlas.impl.TemplateSignatureImpl <em>Template Signature</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see west.twouse.language.sparqlas.impl.TemplateSignatureImpl
   * @see west.twouse.language.sparqlas.impl.SparqlmsPackageImpl#getTemplateSignature()
   * @generated
   */
  int TEMPLATE_SIGNATURE = 100;

  /**
   * The feature id for the '<em><b>Owned Parameter</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TEMPLATE_SIGNATURE__OWNED_PARAMETER = 0;

  /**
   * The feature id for the '<em><b>Template</b></em>' container reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TEMPLATE_SIGNATURE__TEMPLATE = 1;

  /**
   * The number of structural features of the '<em>Template Signature</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TEMPLATE_SIGNATURE_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link west.twouse.language.sparqlas.impl.TemplateableElementImpl <em>Templateable Element</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see west.twouse.language.sparqlas.impl.TemplateableElementImpl
   * @see west.twouse.language.sparqlas.impl.SparqlmsPackageImpl#getTemplateableElement()
   * @generated
   */
  int TEMPLATEABLE_ELEMENT = 101;

  /**
   * The feature id for the '<em><b>Owned Template Signature</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TEMPLATEABLE_ELEMENT__OWNED_TEMPLATE_SIGNATURE = 0;

  /**
   * The feature id for the '<em><b>Template Binding</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TEMPLATEABLE_ELEMENT__TEMPLATE_BINDING = 1;

  /**
   * The number of structural features of the '<em>Templateable Element</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TEMPLATEABLE_ELEMENT_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link west.twouse.language.sparqlas.impl.TemplateParameterSubstitutionImpl <em>Template Parameter Substitution</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see west.twouse.language.sparqlas.impl.TemplateParameterSubstitutionImpl
   * @see west.twouse.language.sparqlas.impl.SparqlmsPackageImpl#getTemplateParameterSubstitution()
   * @generated
   */
  int TEMPLATE_PARAMETER_SUBSTITUTION = 102;

  /**
   * The feature id for the '<em><b>Actual</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TEMPLATE_PARAMETER_SUBSTITUTION__ACTUAL = 0;

  /**
   * The feature id for the '<em><b>Template Binding</b></em>' container reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TEMPLATE_PARAMETER_SUBSTITUTION__TEMPLATE_BINDING = 1;

  /**
   * The feature id for the '<em><b>Formal</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TEMPLATE_PARAMETER_SUBSTITUTION__FORMAL = 2;

  /**
   * The number of structural features of the '<em>Template Parameter Substitution</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TEMPLATE_PARAMETER_SUBSTITUTION_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link west.twouse.language.sparqlas.impl.TemplateBindingImpl <em>Template Binding</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see west.twouse.language.sparqlas.impl.TemplateBindingImpl
   * @see west.twouse.language.sparqlas.impl.SparqlmsPackageImpl#getTemplateBinding()
   * @generated
   */
  int TEMPLATE_BINDING = 103;

  /**
   * The feature id for the '<em><b>Parameter Substitution</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TEMPLATE_BINDING__PARAMETER_SUBSTITUTION = 0;

  /**
   * The feature id for the '<em><b>Bound Element</b></em>' container reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TEMPLATE_BINDING__BOUND_ELEMENT = 1;

  /**
   * The feature id for the '<em><b>Signature</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TEMPLATE_BINDING__SIGNATURE = 2;

  /**
   * The number of structural features of the '<em>Template Binding</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TEMPLATE_BINDING_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link west.twouse.language.sparqlas.impl.DirectClassAssertionImpl <em>Direct Class Assertion</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see west.twouse.language.sparqlas.impl.DirectClassAssertionImpl
   * @see west.twouse.language.sparqlas.impl.SparqlmsPackageImpl#getDirectClassAssertion()
   * @generated
   */
  int DIRECT_CLASS_ASSERTION = 104;

  /**
   * The feature id for the '<em><b>Individual</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DIRECT_CLASS_ASSERTION__INDIVIDUAL = ASSERTION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Class Expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DIRECT_CLASS_ASSERTION__CLASS_EXPRESSION = ASSERTION_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Direct Class Assertion</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DIRECT_CLASS_ASSERTION_FEATURE_COUNT = ASSERTION_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link west.twouse.language.sparqlas.impl.DirectSubClassOfImpl <em>Direct Sub Class Of</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see west.twouse.language.sparqlas.impl.DirectSubClassOfImpl
   * @see west.twouse.language.sparqlas.impl.SparqlmsPackageImpl#getDirectSubClassOf()
   * @generated
   */
  int DIRECT_SUB_CLASS_OF = 105;

  /**
   * The feature id for the '<em><b>Sub Class Expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DIRECT_SUB_CLASS_OF__SUB_CLASS_EXPRESSION = CLASS_ATOM_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Super Class Expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DIRECT_SUB_CLASS_OF__SUPER_CLASS_EXPRESSION = CLASS_ATOM_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Direct Sub Class Of</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DIRECT_SUB_CLASS_OF_FEATURE_COUNT = CLASS_ATOM_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link west.twouse.language.sparqlas.impl.StrictSubClassOfImpl <em>Strict Sub Class Of</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see west.twouse.language.sparqlas.impl.StrictSubClassOfImpl
   * @see west.twouse.language.sparqlas.impl.SparqlmsPackageImpl#getStrictSubClassOf()
   * @generated
   */
  int STRICT_SUB_CLASS_OF = 106;

  /**
   * The feature id for the '<em><b>Sub Class Expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STRICT_SUB_CLASS_OF__SUB_CLASS_EXPRESSION = CLASS_ATOM_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Super Class Expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STRICT_SUB_CLASS_OF__SUPER_CLASS_EXPRESSION = CLASS_ATOM_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Strict Sub Class Of</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STRICT_SUB_CLASS_OF_FEATURE_COUNT = CLASS_ATOM_FEATURE_COUNT + 2;


  /**
   * Returns the meta object for class '{@link west.twouse.language.sparqlas.OntologyDocument <em>Ontology Document</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Ontology Document</em>'.
   * @see west.twouse.language.sparqlas.OntologyDocument
   * @generated
   */
  EClass getOntologyDocument();

  /**
   * Returns the meta object for the containment reference '{@link west.twouse.language.sparqlas.OntologyDocument#getQueryIRI <em>Query IRI</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Query IRI</em>'.
   * @see west.twouse.language.sparqlas.OntologyDocument#getQueryIRI()
   * @see #getOntologyDocument()
   * @generated
   */
  EReference getOntologyDocument_QueryIRI();

  /**
   * Returns the meta object for the containment reference list '{@link west.twouse.language.sparqlas.OntologyDocument#getImport <em>Import</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Import</em>'.
   * @see west.twouse.language.sparqlas.OntologyDocument#getImport()
   * @see #getOntologyDocument()
   * @generated
   */
  EReference getOntologyDocument_Import();

  /**
   * Returns the meta object for the containment reference list '{@link west.twouse.language.sparqlas.OntologyDocument#getPrefixDefinition <em>Prefix Definition</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Prefix Definition</em>'.
   * @see west.twouse.language.sparqlas.OntologyDocument#getPrefixDefinition()
   * @see #getOntologyDocument()
   * @generated
   */
  EReference getOntologyDocument_PrefixDefinition();

  /**
   * Returns the meta object for the containment reference '{@link west.twouse.language.sparqlas.OntologyDocument#getQuery <em>Query</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Query</em>'.
   * @see west.twouse.language.sparqlas.OntologyDocument#getQuery()
   * @see #getOntologyDocument()
   * @generated
   */
  EReference getOntologyDocument_Query();

  /**
   * Returns the meta object for class '{@link west.twouse.language.sparqlas.Import <em>Import</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Import</em>'.
   * @see west.twouse.language.sparqlas.Import
   * @generated
   */
  EClass getImport();

  /**
   * Returns the meta object for the containment reference '{@link west.twouse.language.sparqlas.Import#getImportIRI <em>Import IRI</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Import IRI</em>'.
   * @see west.twouse.language.sparqlas.Import#getImportIRI()
   * @see #getImport()
   * @generated
   */
  EReference getImport_ImportIRI();

  /**
   * Returns the meta object for class '{@link west.twouse.language.sparqlas.PrefixDefinition <em>Prefix Definition</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Prefix Definition</em>'.
   * @see west.twouse.language.sparqlas.PrefixDefinition
   * @generated
   */
  EClass getPrefixDefinition();

  /**
   * Returns the meta object for the attribute '{@link west.twouse.language.sparqlas.PrefixDefinition#getPref <em>Pref</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Pref</em>'.
   * @see west.twouse.language.sparqlas.PrefixDefinition#getPref()
   * @see #getPrefixDefinition()
   * @generated
   */
  EAttribute getPrefixDefinition_Pref();

  /**
   * Returns the meta object for the containment reference '{@link west.twouse.language.sparqlas.PrefixDefinition#getNamespace <em>Namespace</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Namespace</em>'.
   * @see west.twouse.language.sparqlas.PrefixDefinition#getNamespace()
   * @see #getPrefixDefinition()
   * @generated
   */
  EReference getPrefixDefinition_Namespace();

  /**
   * Returns the meta object for class '{@link west.twouse.language.sparqlas.Query <em>Query</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Query</em>'.
   * @see west.twouse.language.sparqlas.Query
   * @generated
   */
  EClass getQuery();

  /**
   * Returns the meta object for class '{@link west.twouse.language.sparqlas.SelectQuery <em>Select Query</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Select Query</em>'.
   * @see west.twouse.language.sparqlas.SelectQuery
   * @generated
   */
  EClass getSelectQuery();

  /**
   * Returns the meta object for the containment reference list '{@link west.twouse.language.sparqlas.SelectQuery#getAtoms <em>Atoms</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Atoms</em>'.
   * @see west.twouse.language.sparqlas.SelectQuery#getAtoms()
   * @see #getSelectQuery()
   * @generated
   */
  EReference getSelectQuery_Atoms();

  /**
   * Returns the meta object for class '{@link west.twouse.language.sparqlas.ConstructQuery <em>Construct Query</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Construct Query</em>'.
   * @see west.twouse.language.sparqlas.ConstructQuery
   * @generated
   */
  EClass getConstructQuery();

  /**
   * Returns the meta object for the containment reference list '{@link west.twouse.language.sparqlas.ConstructQuery#getConstructAtoms <em>Construct Atoms</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Construct Atoms</em>'.
   * @see west.twouse.language.sparqlas.ConstructQuery#getConstructAtoms()
   * @see #getConstructQuery()
   * @generated
   */
  EReference getConstructQuery_ConstructAtoms();

  /**
   * Returns the meta object for the containment reference list '{@link west.twouse.language.sparqlas.ConstructQuery#getWhereAtoms <em>Where Atoms</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Where Atoms</em>'.
   * @see west.twouse.language.sparqlas.ConstructQuery#getWhereAtoms()
   * @see #getConstructQuery()
   * @generated
   */
  EReference getConstructQuery_WhereAtoms();

  /**
   * Returns the meta object for class '{@link west.twouse.language.sparqlas.AskQuery <em>Ask Query</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Ask Query</em>'.
   * @see west.twouse.language.sparqlas.AskQuery
   * @generated
   */
  EClass getAskQuery();

  /**
   * Returns the meta object for the containment reference list '{@link west.twouse.language.sparqlas.AskQuery#getAtoms <em>Atoms</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Atoms</em>'.
   * @see west.twouse.language.sparqlas.AskQuery#getAtoms()
   * @see #getAskQuery()
   * @generated
   */
  EReference getAskQuery_Atoms();

  /**
   * Returns the meta object for class '{@link west.twouse.language.sparqlas.DescribeQuery <em>Describe Query</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Describe Query</em>'.
   * @see west.twouse.language.sparqlas.DescribeQuery
   * @generated
   */
  EClass getDescribeQuery();

  /**
   * Returns the meta object for the containment reference '{@link west.twouse.language.sparqlas.DescribeQuery#getDescribeIRI <em>Describe IRI</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Describe IRI</em>'.
   * @see west.twouse.language.sparqlas.DescribeQuery#getDescribeIRI()
   * @see #getDescribeQuery()
   * @generated
   */
  EReference getDescribeQuery_DescribeIRI();

  /**
   * Returns the meta object for the containment reference list '{@link west.twouse.language.sparqlas.DescribeQuery#getAtoms <em>Atoms</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Atoms</em>'.
   * @see west.twouse.language.sparqlas.DescribeQuery#getAtoms()
   * @see #getDescribeQuery()
   * @generated
   */
  EReference getDescribeQuery_Atoms();

  /**
   * Returns the meta object for class '{@link west.twouse.language.sparqlas.IRI <em>IRI</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>IRI</em>'.
   * @see west.twouse.language.sparqlas.IRI
   * @generated
   */
  EClass getIRI();

  /**
   * Returns the meta object for the attribute '{@link west.twouse.language.sparqlas.IRI#getId <em>Id</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Id</em>'.
   * @see west.twouse.language.sparqlas.IRI#getId()
   * @see #getIRI()
   * @generated
   */
  EAttribute getIRI_Id();

  /**
   * Returns the meta object for class '{@link west.twouse.language.sparqlas.FullIRI <em>Full IRI</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Full IRI</em>'.
   * @see west.twouse.language.sparqlas.FullIRI
   * @generated
   */
  EClass getFullIRI();

  /**
   * Returns the meta object for class '{@link west.twouse.language.sparqlas.AbbreviatedIRI <em>Abbreviated IRI</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Abbreviated IRI</em>'.
   * @see west.twouse.language.sparqlas.AbbreviatedIRI
   * @generated
   */
  EClass getAbbreviatedIRI();

  /**
   * Returns the meta object for class '{@link west.twouse.language.sparqlas.Term <em>Term</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Term</em>'.
   * @see west.twouse.language.sparqlas.Term
   * @generated
   */
  EClass getTerm();

  /**
   * Returns the meta object for class '{@link west.twouse.language.sparqlas.Variable <em>Variable</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Variable</em>'.
   * @see west.twouse.language.sparqlas.Variable
   * @generated
   */
  EClass getVariable();

  /**
   * Returns the meta object for the attribute '{@link west.twouse.language.sparqlas.Variable#getSymbol <em>Symbol</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Symbol</em>'.
   * @see west.twouse.language.sparqlas.Variable#getSymbol()
   * @see #getVariable()
   * @generated
   */
  EAttribute getVariable_Symbol();

  /**
   * Returns the meta object for class '{@link west.twouse.language.sparqlas.ClassVariable <em>Class Variable</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Class Variable</em>'.
   * @see west.twouse.language.sparqlas.ClassVariable
   * @generated
   */
  EClass getClassVariable();

  /**
   * Returns the meta object for class '{@link west.twouse.language.sparqlas.ObjectPropertyVariable <em>Object Property Variable</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Object Property Variable</em>'.
   * @see west.twouse.language.sparqlas.ObjectPropertyVariable
   * @generated
   */
  EClass getObjectPropertyVariable();

  /**
   * Returns the meta object for class '{@link west.twouse.language.sparqlas.DataPropertyVariable <em>Data Property Variable</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Data Property Variable</em>'.
   * @see west.twouse.language.sparqlas.DataPropertyVariable
   * @generated
   */
  EClass getDataPropertyVariable();

  /**
   * Returns the meta object for class '{@link west.twouse.language.sparqlas.IndividualVariable <em>Individual Variable</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Individual Variable</em>'.
   * @see west.twouse.language.sparqlas.IndividualVariable
   * @generated
   */
  EClass getIndividualVariable();

  /**
   * Returns the meta object for class '{@link west.twouse.language.sparqlas.Constant <em>Constant</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Constant</em>'.
   * @see west.twouse.language.sparqlas.Constant
   * @generated
   */
  EClass getConstant();

  /**
   * Returns the meta object for the containment reference '{@link west.twouse.language.sparqlas.Constant#getConstantIRI <em>Constant IRI</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Constant IRI</em>'.
   * @see west.twouse.language.sparqlas.Constant#getConstantIRI()
   * @see #getConstant()
   * @generated
   */
  EReference getConstant_ConstantIRI();

  /**
   * Returns the meta object for class '{@link west.twouse.language.sparqlas.Class <em>Class</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Class</em>'.
   * @see west.twouse.language.sparqlas.Class
   * @generated
   */
  EClass getClass_();

  /**
   * Returns the meta object for class '{@link west.twouse.language.sparqlas.Datatype <em>Datatype</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Datatype</em>'.
   * @see west.twouse.language.sparqlas.Datatype
   * @generated
   */
  EClass getDatatype();

  /**
   * Returns the meta object for class '{@link west.twouse.language.sparqlas.ObjectProperty <em>Object Property</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Object Property</em>'.
   * @see west.twouse.language.sparqlas.ObjectProperty
   * @generated
   */
  EClass getObjectProperty();

  /**
   * Returns the meta object for class '{@link west.twouse.language.sparqlas.DataProperty <em>Data Property</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Data Property</em>'.
   * @see west.twouse.language.sparqlas.DataProperty
   * @generated
   */
  EClass getDataProperty();

  /**
   * Returns the meta object for class '{@link west.twouse.language.sparqlas.Individual <em>Individual</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Individual</em>'.
   * @see west.twouse.language.sparqlas.Individual
   * @generated
   */
  EClass getIndividual();

  /**
   * Returns the meta object for class '{@link west.twouse.language.sparqlas.NamedIndividual <em>Named Individual</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Named Individual</em>'.
   * @see west.twouse.language.sparqlas.NamedIndividual
   * @generated
   */
  EClass getNamedIndividual();

  /**
   * Returns the meta object for class '{@link west.twouse.language.sparqlas.AnonymousIndividual <em>Anonymous Individual</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Anonymous Individual</em>'.
   * @see west.twouse.language.sparqlas.AnonymousIndividual
   * @generated
   */
  EClass getAnonymousIndividual();

  /**
   * Returns the meta object for the attribute '{@link west.twouse.language.sparqlas.AnonymousIndividual#getNodeID <em>Node ID</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Node ID</em>'.
   * @see west.twouse.language.sparqlas.AnonymousIndividual#getNodeID()
   * @see #getAnonymousIndividual()
   * @generated
   */
  EAttribute getAnonymousIndividual_NodeID();

  /**
   * Returns the meta object for class '{@link west.twouse.language.sparqlas.AbstractLiteral <em>Abstract Literal</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Abstract Literal</em>'.
   * @see west.twouse.language.sparqlas.AbstractLiteral
   * @generated
   */
  EClass getAbstractLiteral();

  /**
   * Returns the meta object for class '{@link west.twouse.language.sparqlas.LiteralVariable <em>Literal Variable</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Literal Variable</em>'.
   * @see west.twouse.language.sparqlas.LiteralVariable
   * @generated
   */
  EClass getLiteralVariable();

  /**
   * Returns the meta object for class '{@link west.twouse.language.sparqlas.Literal <em>Literal</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Literal</em>'.
   * @see west.twouse.language.sparqlas.Literal
   * @generated
   */
  EClass getLiteral();

  /**
   * Returns the meta object for the attribute '{@link west.twouse.language.sparqlas.Literal#getLexicalForm <em>Lexical Form</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Lexical Form</em>'.
   * @see west.twouse.language.sparqlas.Literal#getLexicalForm()
   * @see #getLiteral()
   * @generated
   */
  EAttribute getLiteral_LexicalForm();

  /**
   * Returns the meta object for the containment reference '{@link west.twouse.language.sparqlas.Literal#getDatatype <em>Datatype</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Datatype</em>'.
   * @see west.twouse.language.sparqlas.Literal#getDatatype()
   * @see #getLiteral()
   * @generated
   */
  EReference getLiteral_Datatype();

  /**
   * Returns the meta object for class '{@link west.twouse.language.sparqlas.Expression <em>Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Expression</em>'.
   * @see west.twouse.language.sparqlas.Expression
   * @generated
   */
  EClass getExpression();

  /**
   * Returns the meta object for class '{@link west.twouse.language.sparqlas.Atom <em>Atom</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Atom</em>'.
   * @see west.twouse.language.sparqlas.Atom
   * @generated
   */
  EClass getAtom();

  /**
   * Returns the meta object for class '{@link west.twouse.language.sparqlas.Assertion <em>Assertion</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Assertion</em>'.
   * @see west.twouse.language.sparqlas.Assertion
   * @generated
   */
  EClass getAssertion();

  /**
   * Returns the meta object for class '{@link west.twouse.language.sparqlas.ClassAssertion <em>Class Assertion</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Class Assertion</em>'.
   * @see west.twouse.language.sparqlas.ClassAssertion
   * @generated
   */
  EClass getClassAssertion();

  /**
   * Returns the meta object for the containment reference '{@link west.twouse.language.sparqlas.ClassAssertion#getIndividual <em>Individual</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Individual</em>'.
   * @see west.twouse.language.sparqlas.ClassAssertion#getIndividual()
   * @see #getClassAssertion()
   * @generated
   */
  EReference getClassAssertion_Individual();

  /**
   * Returns the meta object for the containment reference '{@link west.twouse.language.sparqlas.ClassAssertion#getClassExpression <em>Class Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Class Expression</em>'.
   * @see west.twouse.language.sparqlas.ClassAssertion#getClassExpression()
   * @see #getClassAssertion()
   * @generated
   */
  EReference getClassAssertion_ClassExpression();

  /**
   * Returns the meta object for class '{@link west.twouse.language.sparqlas.ObjectPropertyAssertion <em>Object Property Assertion</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Object Property Assertion</em>'.
   * @see west.twouse.language.sparqlas.ObjectPropertyAssertion
   * @generated
   */
  EClass getObjectPropertyAssertion();

  /**
   * Returns the meta object for the containment reference '{@link west.twouse.language.sparqlas.ObjectPropertyAssertion#getSourceIndividual <em>Source Individual</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Source Individual</em>'.
   * @see west.twouse.language.sparqlas.ObjectPropertyAssertion#getSourceIndividual()
   * @see #getObjectPropertyAssertion()
   * @generated
   */
  EReference getObjectPropertyAssertion_SourceIndividual();

  /**
   * Returns the meta object for the containment reference '{@link west.twouse.language.sparqlas.ObjectPropertyAssertion#getTargetIndividual <em>Target Individual</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Target Individual</em>'.
   * @see west.twouse.language.sparqlas.ObjectPropertyAssertion#getTargetIndividual()
   * @see #getObjectPropertyAssertion()
   * @generated
   */
  EReference getObjectPropertyAssertion_TargetIndividual();

  /**
   * Returns the meta object for the containment reference '{@link west.twouse.language.sparqlas.ObjectPropertyAssertion#getObjectPropertyExpression <em>Object Property Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Object Property Expression</em>'.
   * @see west.twouse.language.sparqlas.ObjectPropertyAssertion#getObjectPropertyExpression()
   * @see #getObjectPropertyAssertion()
   * @generated
   */
  EReference getObjectPropertyAssertion_ObjectPropertyExpression();

  /**
   * Returns the meta object for class '{@link west.twouse.language.sparqlas.DataPropertyAssertion <em>Data Property Assertion</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Data Property Assertion</em>'.
   * @see west.twouse.language.sparqlas.DataPropertyAssertion
   * @generated
   */
  EClass getDataPropertyAssertion();

  /**
   * Returns the meta object for the containment reference '{@link west.twouse.language.sparqlas.DataPropertyAssertion#getSourceIndividual <em>Source Individual</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Source Individual</em>'.
   * @see west.twouse.language.sparqlas.DataPropertyAssertion#getSourceIndividual()
   * @see #getDataPropertyAssertion()
   * @generated
   */
  EReference getDataPropertyAssertion_SourceIndividual();

  /**
   * Returns the meta object for the containment reference '{@link west.twouse.language.sparqlas.DataPropertyAssertion#getTargetValue <em>Target Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Target Value</em>'.
   * @see west.twouse.language.sparqlas.DataPropertyAssertion#getTargetValue()
   * @see #getDataPropertyAssertion()
   * @generated
   */
  EReference getDataPropertyAssertion_TargetValue();

  /**
   * Returns the meta object for the containment reference '{@link west.twouse.language.sparqlas.DataPropertyAssertion#getDataPropertyExpression <em>Data Property Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Data Property Expression</em>'.
   * @see west.twouse.language.sparqlas.DataPropertyAssertion#getDataPropertyExpression()
   * @see #getDataPropertyAssertion()
   * @generated
   */
  EReference getDataPropertyAssertion_DataPropertyExpression();

  /**
   * Returns the meta object for class '{@link west.twouse.language.sparqlas.NegativeObjectPropertyAssertion <em>Negative Object Property Assertion</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Negative Object Property Assertion</em>'.
   * @see west.twouse.language.sparqlas.NegativeObjectPropertyAssertion
   * @generated
   */
  EClass getNegativeObjectPropertyAssertion();

  /**
   * Returns the meta object for the containment reference '{@link west.twouse.language.sparqlas.NegativeObjectPropertyAssertion#getSourceIndividual <em>Source Individual</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Source Individual</em>'.
   * @see west.twouse.language.sparqlas.NegativeObjectPropertyAssertion#getSourceIndividual()
   * @see #getNegativeObjectPropertyAssertion()
   * @generated
   */
  EReference getNegativeObjectPropertyAssertion_SourceIndividual();

  /**
   * Returns the meta object for the containment reference '{@link west.twouse.language.sparqlas.NegativeObjectPropertyAssertion#getTargetIndividual <em>Target Individual</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Target Individual</em>'.
   * @see west.twouse.language.sparqlas.NegativeObjectPropertyAssertion#getTargetIndividual()
   * @see #getNegativeObjectPropertyAssertion()
   * @generated
   */
  EReference getNegativeObjectPropertyAssertion_TargetIndividual();

  /**
   * Returns the meta object for the containment reference '{@link west.twouse.language.sparqlas.NegativeObjectPropertyAssertion#getObjectPropertyExpression <em>Object Property Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Object Property Expression</em>'.
   * @see west.twouse.language.sparqlas.NegativeObjectPropertyAssertion#getObjectPropertyExpression()
   * @see #getNegativeObjectPropertyAssertion()
   * @generated
   */
  EReference getNegativeObjectPropertyAssertion_ObjectPropertyExpression();

  /**
   * Returns the meta object for class '{@link west.twouse.language.sparqlas.NegativeDataPropertyAssertion <em>Negative Data Property Assertion</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Negative Data Property Assertion</em>'.
   * @see west.twouse.language.sparqlas.NegativeDataPropertyAssertion
   * @generated
   */
  EClass getNegativeDataPropertyAssertion();

  /**
   * Returns the meta object for the containment reference '{@link west.twouse.language.sparqlas.NegativeDataPropertyAssertion#getSourceIndividual <em>Source Individual</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Source Individual</em>'.
   * @see west.twouse.language.sparqlas.NegativeDataPropertyAssertion#getSourceIndividual()
   * @see #getNegativeDataPropertyAssertion()
   * @generated
   */
  EReference getNegativeDataPropertyAssertion_SourceIndividual();

  /**
   * Returns the meta object for the containment reference '{@link west.twouse.language.sparqlas.NegativeDataPropertyAssertion#getTargetValue <em>Target Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Target Value</em>'.
   * @see west.twouse.language.sparqlas.NegativeDataPropertyAssertion#getTargetValue()
   * @see #getNegativeDataPropertyAssertion()
   * @generated
   */
  EReference getNegativeDataPropertyAssertion_TargetValue();

  /**
   * Returns the meta object for the containment reference '{@link west.twouse.language.sparqlas.NegativeDataPropertyAssertion#getDataPropertyExpression <em>Data Property Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Data Property Expression</em>'.
   * @see west.twouse.language.sparqlas.NegativeDataPropertyAssertion#getDataPropertyExpression()
   * @see #getNegativeDataPropertyAssertion()
   * @generated
   */
  EReference getNegativeDataPropertyAssertion_DataPropertyExpression();

  /**
   * Returns the meta object for class '{@link west.twouse.language.sparqlas.SameIndividual <em>Same Individual</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Same Individual</em>'.
   * @see west.twouse.language.sparqlas.SameIndividual
   * @generated
   */
  EClass getSameIndividual();

  /**
   * Returns the meta object for the containment reference list '{@link west.twouse.language.sparqlas.SameIndividual#getIndividuals <em>Individuals</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Individuals</em>'.
   * @see west.twouse.language.sparqlas.SameIndividual#getIndividuals()
   * @see #getSameIndividual()
   * @generated
   */
  EReference getSameIndividual_Individuals();

  /**
   * Returns the meta object for class '{@link west.twouse.language.sparqlas.DifferentIndividuals <em>Different Individuals</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Different Individuals</em>'.
   * @see west.twouse.language.sparqlas.DifferentIndividuals
   * @generated
   */
  EClass getDifferentIndividuals();

  /**
   * Returns the meta object for the containment reference list '{@link west.twouse.language.sparqlas.DifferentIndividuals#getIndividuals <em>Individuals</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Individuals</em>'.
   * @see west.twouse.language.sparqlas.DifferentIndividuals#getIndividuals()
   * @see #getDifferentIndividuals()
   * @generated
   */
  EReference getDifferentIndividuals_Individuals();

  /**
   * Returns the meta object for class '{@link west.twouse.language.sparqlas.ClassAtom <em>Class Atom</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Class Atom</em>'.
   * @see west.twouse.language.sparqlas.ClassAtom
   * @generated
   */
  EClass getClassAtom();

  /**
   * Returns the meta object for class '{@link west.twouse.language.sparqlas.SubClassOf <em>Sub Class Of</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Sub Class Of</em>'.
   * @see west.twouse.language.sparqlas.SubClassOf
   * @generated
   */
  EClass getSubClassOf();

  /**
   * Returns the meta object for the containment reference '{@link west.twouse.language.sparqlas.SubClassOf#getSubClassExpression <em>Sub Class Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Sub Class Expression</em>'.
   * @see west.twouse.language.sparqlas.SubClassOf#getSubClassExpression()
   * @see #getSubClassOf()
   * @generated
   */
  EReference getSubClassOf_SubClassExpression();

  /**
   * Returns the meta object for the containment reference '{@link west.twouse.language.sparqlas.SubClassOf#getSuperClassExpression <em>Super Class Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Super Class Expression</em>'.
   * @see west.twouse.language.sparqlas.SubClassOf#getSuperClassExpression()
   * @see #getSubClassOf()
   * @generated
   */
  EReference getSubClassOf_SuperClassExpression();

  /**
   * Returns the meta object for class '{@link west.twouse.language.sparqlas.EquivalentClasses <em>Equivalent Classes</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Equivalent Classes</em>'.
   * @see west.twouse.language.sparqlas.EquivalentClasses
   * @generated
   */
  EClass getEquivalentClasses();

  /**
   * Returns the meta object for the containment reference list '{@link west.twouse.language.sparqlas.EquivalentClasses#getClassExpressions <em>Class Expressions</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Class Expressions</em>'.
   * @see west.twouse.language.sparqlas.EquivalentClasses#getClassExpressions()
   * @see #getEquivalentClasses()
   * @generated
   */
  EReference getEquivalentClasses_ClassExpressions();

  /**
   * Returns the meta object for class '{@link west.twouse.language.sparqlas.DisjointClasses <em>Disjoint Classes</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Disjoint Classes</em>'.
   * @see west.twouse.language.sparqlas.DisjointClasses
   * @generated
   */
  EClass getDisjointClasses();

  /**
   * Returns the meta object for the containment reference list '{@link west.twouse.language.sparqlas.DisjointClasses#getClassExpressions <em>Class Expressions</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Class Expressions</em>'.
   * @see west.twouse.language.sparqlas.DisjointClasses#getClassExpressions()
   * @see #getDisjointClasses()
   * @generated
   */
  EReference getDisjointClasses_ClassExpressions();

  /**
   * Returns the meta object for class '{@link west.twouse.language.sparqlas.DisjointUnion <em>Disjoint Union</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Disjoint Union</em>'.
   * @see west.twouse.language.sparqlas.DisjointUnion
   * @generated
   */
  EClass getDisjointUnion();

  /**
   * Returns the meta object for the containment reference '{@link west.twouse.language.sparqlas.DisjointUnion#getClass_ <em>Class</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Class</em>'.
   * @see west.twouse.language.sparqlas.DisjointUnion#getClass_()
   * @see #getDisjointUnion()
   * @generated
   */
  EReference getDisjointUnion_Class();

  /**
   * Returns the meta object for the containment reference '{@link west.twouse.language.sparqlas.DisjointUnion#getClassVariable <em>Class Variable</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Class Variable</em>'.
   * @see west.twouse.language.sparqlas.DisjointUnion#getClassVariable()
   * @see #getDisjointUnion()
   * @generated
   */
  EReference getDisjointUnion_ClassVariable();

  /**
   * Returns the meta object for the containment reference list '{@link west.twouse.language.sparqlas.DisjointUnion#getDisjointClassExpressions <em>Disjoint Class Expressions</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Disjoint Class Expressions</em>'.
   * @see west.twouse.language.sparqlas.DisjointUnion#getDisjointClassExpressions()
   * @see #getDisjointUnion()
   * @generated
   */
  EReference getDisjointUnion_DisjointClassExpressions();

  /**
   * Returns the meta object for class '{@link west.twouse.language.sparqlas.ClassExpression <em>Class Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Class Expression</em>'.
   * @see west.twouse.language.sparqlas.ClassExpression
   * @generated
   */
  EClass getClassExpression();

  /**
   * Returns the meta object for class '{@link west.twouse.language.sparqlas.ObjectUnionOf <em>Object Union Of</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Object Union Of</em>'.
   * @see west.twouse.language.sparqlas.ObjectUnionOf
   * @generated
   */
  EClass getObjectUnionOf();

  /**
   * Returns the meta object for the containment reference list '{@link west.twouse.language.sparqlas.ObjectUnionOf#getClassExpressions <em>Class Expressions</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Class Expressions</em>'.
   * @see west.twouse.language.sparqlas.ObjectUnionOf#getClassExpressions()
   * @see #getObjectUnionOf()
   * @generated
   */
  EReference getObjectUnionOf_ClassExpressions();

  /**
   * Returns the meta object for class '{@link west.twouse.language.sparqlas.ObjectComplementOf <em>Object Complement Of</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Object Complement Of</em>'.
   * @see west.twouse.language.sparqlas.ObjectComplementOf
   * @generated
   */
  EClass getObjectComplementOf();

  /**
   * Returns the meta object for the containment reference '{@link west.twouse.language.sparqlas.ObjectComplementOf#getClassExpression <em>Class Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Class Expression</em>'.
   * @see west.twouse.language.sparqlas.ObjectComplementOf#getClassExpression()
   * @see #getObjectComplementOf()
   * @generated
   */
  EReference getObjectComplementOf_ClassExpression();

  /**
   * Returns the meta object for class '{@link west.twouse.language.sparqlas.ObjectOneOf <em>Object One Of</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Object One Of</em>'.
   * @see west.twouse.language.sparqlas.ObjectOneOf
   * @generated
   */
  EClass getObjectOneOf();

  /**
   * Returns the meta object for the containment reference list '{@link west.twouse.language.sparqlas.ObjectOneOf#getIndividuals <em>Individuals</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Individuals</em>'.
   * @see west.twouse.language.sparqlas.ObjectOneOf#getIndividuals()
   * @see #getObjectOneOf()
   * @generated
   */
  EReference getObjectOneOf_Individuals();

  /**
   * Returns the meta object for class '{@link west.twouse.language.sparqlas.ObjectIntersectionOf <em>Object Intersection Of</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Object Intersection Of</em>'.
   * @see west.twouse.language.sparqlas.ObjectIntersectionOf
   * @generated
   */
  EClass getObjectIntersectionOf();

  /**
   * Returns the meta object for the containment reference list '{@link west.twouse.language.sparqlas.ObjectIntersectionOf#getClassExpressions <em>Class Expressions</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Class Expressions</em>'.
   * @see west.twouse.language.sparqlas.ObjectIntersectionOf#getClassExpressions()
   * @see #getObjectIntersectionOf()
   * @generated
   */
  EReference getObjectIntersectionOf_ClassExpressions();

  /**
   * Returns the meta object for class '{@link west.twouse.language.sparqlas.ObjectAllValuesFrom <em>Object All Values From</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Object All Values From</em>'.
   * @see west.twouse.language.sparqlas.ObjectAllValuesFrom
   * @generated
   */
  EClass getObjectAllValuesFrom();

  /**
   * Returns the meta object for the containment reference '{@link west.twouse.language.sparqlas.ObjectAllValuesFrom#getClassExpression <em>Class Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Class Expression</em>'.
   * @see west.twouse.language.sparqlas.ObjectAllValuesFrom#getClassExpression()
   * @see #getObjectAllValuesFrom()
   * @generated
   */
  EReference getObjectAllValuesFrom_ClassExpression();

  /**
   * Returns the meta object for the containment reference '{@link west.twouse.language.sparqlas.ObjectAllValuesFrom#getObjectPropertyExpression <em>Object Property Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Object Property Expression</em>'.
   * @see west.twouse.language.sparqlas.ObjectAllValuesFrom#getObjectPropertyExpression()
   * @see #getObjectAllValuesFrom()
   * @generated
   */
  EReference getObjectAllValuesFrom_ObjectPropertyExpression();

  /**
   * Returns the meta object for class '{@link west.twouse.language.sparqlas.ObjectSomeValuesFrom <em>Object Some Values From</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Object Some Values From</em>'.
   * @see west.twouse.language.sparqlas.ObjectSomeValuesFrom
   * @generated
   */
  EClass getObjectSomeValuesFrom();

  /**
   * Returns the meta object for the containment reference '{@link west.twouse.language.sparqlas.ObjectSomeValuesFrom#getClassExpression <em>Class Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Class Expression</em>'.
   * @see west.twouse.language.sparqlas.ObjectSomeValuesFrom#getClassExpression()
   * @see #getObjectSomeValuesFrom()
   * @generated
   */
  EReference getObjectSomeValuesFrom_ClassExpression();

  /**
   * Returns the meta object for the containment reference '{@link west.twouse.language.sparqlas.ObjectSomeValuesFrom#getObjectPropertyExpression <em>Object Property Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Object Property Expression</em>'.
   * @see west.twouse.language.sparqlas.ObjectSomeValuesFrom#getObjectPropertyExpression()
   * @see #getObjectSomeValuesFrom()
   * @generated
   */
  EReference getObjectSomeValuesFrom_ObjectPropertyExpression();

  /**
   * Returns the meta object for class '{@link west.twouse.language.sparqlas.ObjectHasValue <em>Object Has Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Object Has Value</em>'.
   * @see west.twouse.language.sparqlas.ObjectHasValue
   * @generated
   */
  EClass getObjectHasValue();

  /**
   * Returns the meta object for the containment reference '{@link west.twouse.language.sparqlas.ObjectHasValue#getIndividual <em>Individual</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Individual</em>'.
   * @see west.twouse.language.sparqlas.ObjectHasValue#getIndividual()
   * @see #getObjectHasValue()
   * @generated
   */
  EReference getObjectHasValue_Individual();

  /**
   * Returns the meta object for the containment reference '{@link west.twouse.language.sparqlas.ObjectHasValue#getObjectPropertyExpression <em>Object Property Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Object Property Expression</em>'.
   * @see west.twouse.language.sparqlas.ObjectHasValue#getObjectPropertyExpression()
   * @see #getObjectHasValue()
   * @generated
   */
  EReference getObjectHasValue_ObjectPropertyExpression();

  /**
   * Returns the meta object for class '{@link west.twouse.language.sparqlas.ObjectMinCardinality <em>Object Min Cardinality</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Object Min Cardinality</em>'.
   * @see west.twouse.language.sparqlas.ObjectMinCardinality
   * @generated
   */
  EClass getObjectMinCardinality();

  /**
   * Returns the meta object for the attribute '{@link west.twouse.language.sparqlas.ObjectMinCardinality#getCardinality <em>Cardinality</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Cardinality</em>'.
   * @see west.twouse.language.sparqlas.ObjectMinCardinality#getCardinality()
   * @see #getObjectMinCardinality()
   * @generated
   */
  EAttribute getObjectMinCardinality_Cardinality();

  /**
   * Returns the meta object for the containment reference '{@link west.twouse.language.sparqlas.ObjectMinCardinality#getClassExpression <em>Class Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Class Expression</em>'.
   * @see west.twouse.language.sparqlas.ObjectMinCardinality#getClassExpression()
   * @see #getObjectMinCardinality()
   * @generated
   */
  EReference getObjectMinCardinality_ClassExpression();

  /**
   * Returns the meta object for the containment reference '{@link west.twouse.language.sparqlas.ObjectMinCardinality#getObjectPropertyExpression <em>Object Property Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Object Property Expression</em>'.
   * @see west.twouse.language.sparqlas.ObjectMinCardinality#getObjectPropertyExpression()
   * @see #getObjectMinCardinality()
   * @generated
   */
  EReference getObjectMinCardinality_ObjectPropertyExpression();

  /**
   * Returns the meta object for class '{@link west.twouse.language.sparqlas.ObjectMaxCardinality <em>Object Max Cardinality</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Object Max Cardinality</em>'.
   * @see west.twouse.language.sparqlas.ObjectMaxCardinality
   * @generated
   */
  EClass getObjectMaxCardinality();

  /**
   * Returns the meta object for the attribute '{@link west.twouse.language.sparqlas.ObjectMaxCardinality#getCardinality <em>Cardinality</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Cardinality</em>'.
   * @see west.twouse.language.sparqlas.ObjectMaxCardinality#getCardinality()
   * @see #getObjectMaxCardinality()
   * @generated
   */
  EAttribute getObjectMaxCardinality_Cardinality();

  /**
   * Returns the meta object for the containment reference '{@link west.twouse.language.sparqlas.ObjectMaxCardinality#getClassExpression <em>Class Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Class Expression</em>'.
   * @see west.twouse.language.sparqlas.ObjectMaxCardinality#getClassExpression()
   * @see #getObjectMaxCardinality()
   * @generated
   */
  EReference getObjectMaxCardinality_ClassExpression();

  /**
   * Returns the meta object for the containment reference '{@link west.twouse.language.sparqlas.ObjectMaxCardinality#getObjectPropertyExpression <em>Object Property Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Object Property Expression</em>'.
   * @see west.twouse.language.sparqlas.ObjectMaxCardinality#getObjectPropertyExpression()
   * @see #getObjectMaxCardinality()
   * @generated
   */
  EReference getObjectMaxCardinality_ObjectPropertyExpression();

  /**
   * Returns the meta object for class '{@link west.twouse.language.sparqlas.ObjectExactCardinality <em>Object Exact Cardinality</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Object Exact Cardinality</em>'.
   * @see west.twouse.language.sparqlas.ObjectExactCardinality
   * @generated
   */
  EClass getObjectExactCardinality();

  /**
   * Returns the meta object for the attribute '{@link west.twouse.language.sparqlas.ObjectExactCardinality#getCardinality <em>Cardinality</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Cardinality</em>'.
   * @see west.twouse.language.sparqlas.ObjectExactCardinality#getCardinality()
   * @see #getObjectExactCardinality()
   * @generated
   */
  EAttribute getObjectExactCardinality_Cardinality();

  /**
   * Returns the meta object for the containment reference '{@link west.twouse.language.sparqlas.ObjectExactCardinality#getClassExpression <em>Class Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Class Expression</em>'.
   * @see west.twouse.language.sparqlas.ObjectExactCardinality#getClassExpression()
   * @see #getObjectExactCardinality()
   * @generated
   */
  EReference getObjectExactCardinality_ClassExpression();

  /**
   * Returns the meta object for the containment reference '{@link west.twouse.language.sparqlas.ObjectExactCardinality#getObjectPropertyExpression <em>Object Property Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Object Property Expression</em>'.
   * @see west.twouse.language.sparqlas.ObjectExactCardinality#getObjectPropertyExpression()
   * @see #getObjectExactCardinality()
   * @generated
   */
  EReference getObjectExactCardinality_ObjectPropertyExpression();

  /**
   * Returns the meta object for class '{@link west.twouse.language.sparqlas.DataAllValuesFrom <em>Data All Values From</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Data All Values From</em>'.
   * @see west.twouse.language.sparqlas.DataAllValuesFrom
   * @generated
   */
  EClass getDataAllValuesFrom();

  /**
   * Returns the meta object for the containment reference '{@link west.twouse.language.sparqlas.DataAllValuesFrom#getDataRange <em>Data Range</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Data Range</em>'.
   * @see west.twouse.language.sparqlas.DataAllValuesFrom#getDataRange()
   * @see #getDataAllValuesFrom()
   * @generated
   */
  EReference getDataAllValuesFrom_DataRange();

  /**
   * Returns the meta object for the containment reference list '{@link west.twouse.language.sparqlas.DataAllValuesFrom#getDataPropertyExpressions <em>Data Property Expressions</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Data Property Expressions</em>'.
   * @see west.twouse.language.sparqlas.DataAllValuesFrom#getDataPropertyExpressions()
   * @see #getDataAllValuesFrom()
   * @generated
   */
  EReference getDataAllValuesFrom_DataPropertyExpressions();

  /**
   * Returns the meta object for class '{@link west.twouse.language.sparqlas.DataSomeValuesFrom <em>Data Some Values From</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Data Some Values From</em>'.
   * @see west.twouse.language.sparqlas.DataSomeValuesFrom
   * @generated
   */
  EClass getDataSomeValuesFrom();

  /**
   * Returns the meta object for the containment reference '{@link west.twouse.language.sparqlas.DataSomeValuesFrom#getDataRange <em>Data Range</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Data Range</em>'.
   * @see west.twouse.language.sparqlas.DataSomeValuesFrom#getDataRange()
   * @see #getDataSomeValuesFrom()
   * @generated
   */
  EReference getDataSomeValuesFrom_DataRange();

  /**
   * Returns the meta object for the containment reference list '{@link west.twouse.language.sparqlas.DataSomeValuesFrom#getDataPropertyExpressions <em>Data Property Expressions</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Data Property Expressions</em>'.
   * @see west.twouse.language.sparqlas.DataSomeValuesFrom#getDataPropertyExpressions()
   * @see #getDataSomeValuesFrom()
   * @generated
   */
  EReference getDataSomeValuesFrom_DataPropertyExpressions();

  /**
   * Returns the meta object for class '{@link west.twouse.language.sparqlas.DataHasValue <em>Data Has Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Data Has Value</em>'.
   * @see west.twouse.language.sparqlas.DataHasValue
   * @generated
   */
  EClass getDataHasValue();

  /**
   * Returns the meta object for the containment reference '{@link west.twouse.language.sparqlas.DataHasValue#getLiteral <em>Literal</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Literal</em>'.
   * @see west.twouse.language.sparqlas.DataHasValue#getLiteral()
   * @see #getDataHasValue()
   * @generated
   */
  EReference getDataHasValue_Literal();

  /**
   * Returns the meta object for the containment reference '{@link west.twouse.language.sparqlas.DataHasValue#getDataPropertyExpression <em>Data Property Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Data Property Expression</em>'.
   * @see west.twouse.language.sparqlas.DataHasValue#getDataPropertyExpression()
   * @see #getDataHasValue()
   * @generated
   */
  EReference getDataHasValue_DataPropertyExpression();

  /**
   * Returns the meta object for class '{@link west.twouse.language.sparqlas.DataMinCardinality <em>Data Min Cardinality</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Data Min Cardinality</em>'.
   * @see west.twouse.language.sparqlas.DataMinCardinality
   * @generated
   */
  EClass getDataMinCardinality();

  /**
   * Returns the meta object for the attribute '{@link west.twouse.language.sparqlas.DataMinCardinality#getCardinality <em>Cardinality</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Cardinality</em>'.
   * @see west.twouse.language.sparqlas.DataMinCardinality#getCardinality()
   * @see #getDataMinCardinality()
   * @generated
   */
  EAttribute getDataMinCardinality_Cardinality();

  /**
   * Returns the meta object for the containment reference '{@link west.twouse.language.sparqlas.DataMinCardinality#getDataRange <em>Data Range</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Data Range</em>'.
   * @see west.twouse.language.sparqlas.DataMinCardinality#getDataRange()
   * @see #getDataMinCardinality()
   * @generated
   */
  EReference getDataMinCardinality_DataRange();

  /**
   * Returns the meta object for the containment reference '{@link west.twouse.language.sparqlas.DataMinCardinality#getDataPropertyExpression <em>Data Property Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Data Property Expression</em>'.
   * @see west.twouse.language.sparqlas.DataMinCardinality#getDataPropertyExpression()
   * @see #getDataMinCardinality()
   * @generated
   */
  EReference getDataMinCardinality_DataPropertyExpression();

  /**
   * Returns the meta object for class '{@link west.twouse.language.sparqlas.DataMaxCardinality <em>Data Max Cardinality</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Data Max Cardinality</em>'.
   * @see west.twouse.language.sparqlas.DataMaxCardinality
   * @generated
   */
  EClass getDataMaxCardinality();

  /**
   * Returns the meta object for the attribute '{@link west.twouse.language.sparqlas.DataMaxCardinality#getCardinality <em>Cardinality</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Cardinality</em>'.
   * @see west.twouse.language.sparqlas.DataMaxCardinality#getCardinality()
   * @see #getDataMaxCardinality()
   * @generated
   */
  EAttribute getDataMaxCardinality_Cardinality();

  /**
   * Returns the meta object for the containment reference '{@link west.twouse.language.sparqlas.DataMaxCardinality#getDataRange <em>Data Range</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Data Range</em>'.
   * @see west.twouse.language.sparqlas.DataMaxCardinality#getDataRange()
   * @see #getDataMaxCardinality()
   * @generated
   */
  EReference getDataMaxCardinality_DataRange();

  /**
   * Returns the meta object for the containment reference '{@link west.twouse.language.sparqlas.DataMaxCardinality#getDataPropertyExpression <em>Data Property Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Data Property Expression</em>'.
   * @see west.twouse.language.sparqlas.DataMaxCardinality#getDataPropertyExpression()
   * @see #getDataMaxCardinality()
   * @generated
   */
  EReference getDataMaxCardinality_DataPropertyExpression();

  /**
   * Returns the meta object for class '{@link west.twouse.language.sparqlas.DataExactCardinality <em>Data Exact Cardinality</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Data Exact Cardinality</em>'.
   * @see west.twouse.language.sparqlas.DataExactCardinality
   * @generated
   */
  EClass getDataExactCardinality();

  /**
   * Returns the meta object for the attribute '{@link west.twouse.language.sparqlas.DataExactCardinality#getCardinality <em>Cardinality</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Cardinality</em>'.
   * @see west.twouse.language.sparqlas.DataExactCardinality#getCardinality()
   * @see #getDataExactCardinality()
   * @generated
   */
  EAttribute getDataExactCardinality_Cardinality();

  /**
   * Returns the meta object for the containment reference '{@link west.twouse.language.sparqlas.DataExactCardinality#getDataRange <em>Data Range</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Data Range</em>'.
   * @see west.twouse.language.sparqlas.DataExactCardinality#getDataRange()
   * @see #getDataExactCardinality()
   * @generated
   */
  EReference getDataExactCardinality_DataRange();

  /**
   * Returns the meta object for the containment reference '{@link west.twouse.language.sparqlas.DataExactCardinality#getDataPropertyExpression <em>Data Property Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Data Property Expression</em>'.
   * @see west.twouse.language.sparqlas.DataExactCardinality#getDataPropertyExpression()
   * @see #getDataExactCardinality()
   * @generated
   */
  EReference getDataExactCardinality_DataPropertyExpression();

  /**
   * Returns the meta object for class '{@link west.twouse.language.sparqlas.DataRange <em>Data Range</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Data Range</em>'.
   * @see west.twouse.language.sparqlas.DataRange
   * @generated
   */
  EClass getDataRange();

  /**
   * Returns the meta object for class '{@link west.twouse.language.sparqlas.DataUnionOf <em>Data Union Of</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Data Union Of</em>'.
   * @see west.twouse.language.sparqlas.DataUnionOf
   * @generated
   */
  EClass getDataUnionOf();

  /**
   * Returns the meta object for the containment reference list '{@link west.twouse.language.sparqlas.DataUnionOf#getDataRanges <em>Data Ranges</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Data Ranges</em>'.
   * @see west.twouse.language.sparqlas.DataUnionOf#getDataRanges()
   * @see #getDataUnionOf()
   * @generated
   */
  EReference getDataUnionOf_DataRanges();

  /**
   * Returns the meta object for class '{@link west.twouse.language.sparqlas.DataComplementOf <em>Data Complement Of</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Data Complement Of</em>'.
   * @see west.twouse.language.sparqlas.DataComplementOf
   * @generated
   */
  EClass getDataComplementOf();

  /**
   * Returns the meta object for the containment reference '{@link west.twouse.language.sparqlas.DataComplementOf#getDataRange <em>Data Range</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Data Range</em>'.
   * @see west.twouse.language.sparqlas.DataComplementOf#getDataRange()
   * @see #getDataComplementOf()
   * @generated
   */
  EReference getDataComplementOf_DataRange();

  /**
   * Returns the meta object for class '{@link west.twouse.language.sparqlas.DataOneOf <em>Data One Of</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Data One Of</em>'.
   * @see west.twouse.language.sparqlas.DataOneOf
   * @generated
   */
  EClass getDataOneOf();

  /**
   * Returns the meta object for the containment reference list '{@link west.twouse.language.sparqlas.DataOneOf#getLiterals <em>Literals</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Literals</em>'.
   * @see west.twouse.language.sparqlas.DataOneOf#getLiterals()
   * @see #getDataOneOf()
   * @generated
   */
  EReference getDataOneOf_Literals();

  /**
   * Returns the meta object for class '{@link west.twouse.language.sparqlas.DataIntersectionOf <em>Data Intersection Of</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Data Intersection Of</em>'.
   * @see west.twouse.language.sparqlas.DataIntersectionOf
   * @generated
   */
  EClass getDataIntersectionOf();

  /**
   * Returns the meta object for the containment reference list '{@link west.twouse.language.sparqlas.DataIntersectionOf#getDataRanges <em>Data Ranges</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Data Ranges</em>'.
   * @see west.twouse.language.sparqlas.DataIntersectionOf#getDataRanges()
   * @see #getDataIntersectionOf()
   * @generated
   */
  EReference getDataIntersectionOf_DataRanges();

  /**
   * Returns the meta object for class '{@link west.twouse.language.sparqlas.DatatypeRestriction <em>Datatype Restriction</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Datatype Restriction</em>'.
   * @see west.twouse.language.sparqlas.DatatypeRestriction
   * @generated
   */
  EClass getDatatypeRestriction();

  /**
   * Returns the meta object for the containment reference '{@link west.twouse.language.sparqlas.DatatypeRestriction#getDatatype <em>Datatype</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Datatype</em>'.
   * @see west.twouse.language.sparqlas.DatatypeRestriction#getDatatype()
   * @see #getDatatypeRestriction()
   * @generated
   */
  EReference getDatatypeRestriction_Datatype();

  /**
   * Returns the meta object for the containment reference list '{@link west.twouse.language.sparqlas.DatatypeRestriction#getRestrictions <em>Restrictions</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Restrictions</em>'.
   * @see west.twouse.language.sparqlas.DatatypeRestriction#getRestrictions()
   * @see #getDatatypeRestriction()
   * @generated
   */
  EReference getDatatypeRestriction_Restrictions();

  /**
   * Returns the meta object for class '{@link west.twouse.language.sparqlas.FacetRestriction <em>Facet Restriction</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Facet Restriction</em>'.
   * @see west.twouse.language.sparqlas.FacetRestriction
   * @generated
   */
  EClass getFacetRestriction();

  /**
   * Returns the meta object for the containment reference '{@link west.twouse.language.sparqlas.FacetRestriction#getConstrainingFacet <em>Constraining Facet</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Constraining Facet</em>'.
   * @see west.twouse.language.sparqlas.FacetRestriction#getConstrainingFacet()
   * @see #getFacetRestriction()
   * @generated
   */
  EReference getFacetRestriction_ConstrainingFacet();

  /**
   * Returns the meta object for the containment reference '{@link west.twouse.language.sparqlas.FacetRestriction#getRestrictionValue <em>Restriction Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Restriction Value</em>'.
   * @see west.twouse.language.sparqlas.FacetRestriction#getRestrictionValue()
   * @see #getFacetRestriction()
   * @generated
   */
  EReference getFacetRestriction_RestrictionValue();

  /**
   * Returns the meta object for class '{@link west.twouse.language.sparqlas.ObjectPropertyAtom <em>Object Property Atom</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Object Property Atom</em>'.
   * @see west.twouse.language.sparqlas.ObjectPropertyAtom
   * @generated
   */
  EClass getObjectPropertyAtom();

  /**
   * Returns the meta object for class '{@link west.twouse.language.sparqlas.SubObjectPropertyOf <em>Sub Object Property Of</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Sub Object Property Of</em>'.
   * @see west.twouse.language.sparqlas.SubObjectPropertyOf
   * @generated
   */
  EClass getSubObjectPropertyOf();

  /**
   * Returns the meta object for the containment reference '{@link west.twouse.language.sparqlas.SubObjectPropertyOf#getSubObjectPropertyExpression <em>Sub Object Property Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Sub Object Property Expression</em>'.
   * @see west.twouse.language.sparqlas.SubObjectPropertyOf#getSubObjectPropertyExpression()
   * @see #getSubObjectPropertyOf()
   * @generated
   */
  EReference getSubObjectPropertyOf_SubObjectPropertyExpression();

  /**
   * Returns the meta object for the containment reference '{@link west.twouse.language.sparqlas.SubObjectPropertyOf#getSubObjectPropertyChain <em>Sub Object Property Chain</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Sub Object Property Chain</em>'.
   * @see west.twouse.language.sparqlas.SubObjectPropertyOf#getSubObjectPropertyChain()
   * @see #getSubObjectPropertyOf()
   * @generated
   */
  EReference getSubObjectPropertyOf_SubObjectPropertyChain();

  /**
   * Returns the meta object for the containment reference '{@link west.twouse.language.sparqlas.SubObjectPropertyOf#getSuperObjectPropertyExpression <em>Super Object Property Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Super Object Property Expression</em>'.
   * @see west.twouse.language.sparqlas.SubObjectPropertyOf#getSuperObjectPropertyExpression()
   * @see #getSubObjectPropertyOf()
   * @generated
   */
  EReference getSubObjectPropertyOf_SuperObjectPropertyExpression();

  /**
   * Returns the meta object for class '{@link west.twouse.language.sparqlas.ObjectPropertyChain <em>Object Property Chain</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Object Property Chain</em>'.
   * @see west.twouse.language.sparqlas.ObjectPropertyChain
   * @generated
   */
  EClass getObjectPropertyChain();

  /**
   * Returns the meta object for the containment reference list '{@link west.twouse.language.sparqlas.ObjectPropertyChain#getObjectPropertyExpression <em>Object Property Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Object Property Expression</em>'.
   * @see west.twouse.language.sparqlas.ObjectPropertyChain#getObjectPropertyExpression()
   * @see #getObjectPropertyChain()
   * @generated
   */
  EReference getObjectPropertyChain_ObjectPropertyExpression();

  /**
   * Returns the meta object for class '{@link west.twouse.language.sparqlas.EquivalentObjectProperties <em>Equivalent Object Properties</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Equivalent Object Properties</em>'.
   * @see west.twouse.language.sparqlas.EquivalentObjectProperties
   * @generated
   */
  EClass getEquivalentObjectProperties();

  /**
   * Returns the meta object for the containment reference list '{@link west.twouse.language.sparqlas.EquivalentObjectProperties#getObjectPropertyExpression <em>Object Property Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Object Property Expression</em>'.
   * @see west.twouse.language.sparqlas.EquivalentObjectProperties#getObjectPropertyExpression()
   * @see #getEquivalentObjectProperties()
   * @generated
   */
  EReference getEquivalentObjectProperties_ObjectPropertyExpression();

  /**
   * Returns the meta object for class '{@link west.twouse.language.sparqlas.DisjointObjectProperties <em>Disjoint Object Properties</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Disjoint Object Properties</em>'.
   * @see west.twouse.language.sparqlas.DisjointObjectProperties
   * @generated
   */
  EClass getDisjointObjectProperties();

  /**
   * Returns the meta object for the containment reference list '{@link west.twouse.language.sparqlas.DisjointObjectProperties#getObjectPropertyExpression <em>Object Property Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Object Property Expression</em>'.
   * @see west.twouse.language.sparqlas.DisjointObjectProperties#getObjectPropertyExpression()
   * @see #getDisjointObjectProperties()
   * @generated
   */
  EReference getDisjointObjectProperties_ObjectPropertyExpression();

  /**
   * Returns the meta object for class '{@link west.twouse.language.sparqlas.ObjectPropertyDomain <em>Object Property Domain</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Object Property Domain</em>'.
   * @see west.twouse.language.sparqlas.ObjectPropertyDomain
   * @generated
   */
  EClass getObjectPropertyDomain();

  /**
   * Returns the meta object for the containment reference '{@link west.twouse.language.sparqlas.ObjectPropertyDomain#getObjectPropertyExpression <em>Object Property Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Object Property Expression</em>'.
   * @see west.twouse.language.sparqlas.ObjectPropertyDomain#getObjectPropertyExpression()
   * @see #getObjectPropertyDomain()
   * @generated
   */
  EReference getObjectPropertyDomain_ObjectPropertyExpression();

  /**
   * Returns the meta object for the containment reference '{@link west.twouse.language.sparqlas.ObjectPropertyDomain#getDomain <em>Domain</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Domain</em>'.
   * @see west.twouse.language.sparqlas.ObjectPropertyDomain#getDomain()
   * @see #getObjectPropertyDomain()
   * @generated
   */
  EReference getObjectPropertyDomain_Domain();

  /**
   * Returns the meta object for class '{@link west.twouse.language.sparqlas.ObjectPropertyRange <em>Object Property Range</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Object Property Range</em>'.
   * @see west.twouse.language.sparqlas.ObjectPropertyRange
   * @generated
   */
  EClass getObjectPropertyRange();

  /**
   * Returns the meta object for the containment reference '{@link west.twouse.language.sparqlas.ObjectPropertyRange#getObjectPropertyExpression <em>Object Property Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Object Property Expression</em>'.
   * @see west.twouse.language.sparqlas.ObjectPropertyRange#getObjectPropertyExpression()
   * @see #getObjectPropertyRange()
   * @generated
   */
  EReference getObjectPropertyRange_ObjectPropertyExpression();

  /**
   * Returns the meta object for the containment reference '{@link west.twouse.language.sparqlas.ObjectPropertyRange#getRange <em>Range</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Range</em>'.
   * @see west.twouse.language.sparqlas.ObjectPropertyRange#getRange()
   * @see #getObjectPropertyRange()
   * @generated
   */
  EReference getObjectPropertyRange_Range();

  /**
   * Returns the meta object for class '{@link west.twouse.language.sparqlas.InverseObjectPropertyAtom <em>Inverse Object Property Atom</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Inverse Object Property Atom</em>'.
   * @see west.twouse.language.sparqlas.InverseObjectPropertyAtom
   * @generated
   */
  EClass getInverseObjectPropertyAtom();

  /**
   * Returns the meta object for the containment reference '{@link west.twouse.language.sparqlas.InverseObjectPropertyAtom#getObjectPropertyExpression1 <em>Object Property Expression1</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Object Property Expression1</em>'.
   * @see west.twouse.language.sparqlas.InverseObjectPropertyAtom#getObjectPropertyExpression1()
   * @see #getInverseObjectPropertyAtom()
   * @generated
   */
  EReference getInverseObjectPropertyAtom_ObjectPropertyExpression1();

  /**
   * Returns the meta object for the containment reference '{@link west.twouse.language.sparqlas.InverseObjectPropertyAtom#getObjectPropertyExpression2 <em>Object Property Expression2</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Object Property Expression2</em>'.
   * @see west.twouse.language.sparqlas.InverseObjectPropertyAtom#getObjectPropertyExpression2()
   * @see #getInverseObjectPropertyAtom()
   * @generated
   */
  EReference getInverseObjectPropertyAtom_ObjectPropertyExpression2();

  /**
   * Returns the meta object for class '{@link west.twouse.language.sparqlas.FunctionalObjectProperty <em>Functional Object Property</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Functional Object Property</em>'.
   * @see west.twouse.language.sparqlas.FunctionalObjectProperty
   * @generated
   */
  EClass getFunctionalObjectProperty();

  /**
   * Returns the meta object for the containment reference '{@link west.twouse.language.sparqlas.FunctionalObjectProperty#getObjectPropertyExpression <em>Object Property Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Object Property Expression</em>'.
   * @see west.twouse.language.sparqlas.FunctionalObjectProperty#getObjectPropertyExpression()
   * @see #getFunctionalObjectProperty()
   * @generated
   */
  EReference getFunctionalObjectProperty_ObjectPropertyExpression();

  /**
   * Returns the meta object for class '{@link west.twouse.language.sparqlas.InverseFunctionalObjectProperty <em>Inverse Functional Object Property</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Inverse Functional Object Property</em>'.
   * @see west.twouse.language.sparqlas.InverseFunctionalObjectProperty
   * @generated
   */
  EClass getInverseFunctionalObjectProperty();

  /**
   * Returns the meta object for the containment reference '{@link west.twouse.language.sparqlas.InverseFunctionalObjectProperty#getObjectPropertyExpression <em>Object Property Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Object Property Expression</em>'.
   * @see west.twouse.language.sparqlas.InverseFunctionalObjectProperty#getObjectPropertyExpression()
   * @see #getInverseFunctionalObjectProperty()
   * @generated
   */
  EReference getInverseFunctionalObjectProperty_ObjectPropertyExpression();

  /**
   * Returns the meta object for class '{@link west.twouse.language.sparqlas.ReflexiveObjectProperty <em>Reflexive Object Property</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Reflexive Object Property</em>'.
   * @see west.twouse.language.sparqlas.ReflexiveObjectProperty
   * @generated
   */
  EClass getReflexiveObjectProperty();

  /**
   * Returns the meta object for the containment reference '{@link west.twouse.language.sparqlas.ReflexiveObjectProperty#getObjectPropertyExpression <em>Object Property Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Object Property Expression</em>'.
   * @see west.twouse.language.sparqlas.ReflexiveObjectProperty#getObjectPropertyExpression()
   * @see #getReflexiveObjectProperty()
   * @generated
   */
  EReference getReflexiveObjectProperty_ObjectPropertyExpression();

  /**
   * Returns the meta object for class '{@link west.twouse.language.sparqlas.IrreflexiveObjectProperty <em>Irreflexive Object Property</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Irreflexive Object Property</em>'.
   * @see west.twouse.language.sparqlas.IrreflexiveObjectProperty
   * @generated
   */
  EClass getIrreflexiveObjectProperty();

  /**
   * Returns the meta object for the containment reference '{@link west.twouse.language.sparqlas.IrreflexiveObjectProperty#getObjectPropertyExpression <em>Object Property Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Object Property Expression</em>'.
   * @see west.twouse.language.sparqlas.IrreflexiveObjectProperty#getObjectPropertyExpression()
   * @see #getIrreflexiveObjectProperty()
   * @generated
   */
  EReference getIrreflexiveObjectProperty_ObjectPropertyExpression();

  /**
   * Returns the meta object for class '{@link west.twouse.language.sparqlas.SymmetricObjectProperty <em>Symmetric Object Property</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Symmetric Object Property</em>'.
   * @see west.twouse.language.sparqlas.SymmetricObjectProperty
   * @generated
   */
  EClass getSymmetricObjectProperty();

  /**
   * Returns the meta object for the containment reference '{@link west.twouse.language.sparqlas.SymmetricObjectProperty#getObjectPropertyExpression <em>Object Property Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Object Property Expression</em>'.
   * @see west.twouse.language.sparqlas.SymmetricObjectProperty#getObjectPropertyExpression()
   * @see #getSymmetricObjectProperty()
   * @generated
   */
  EReference getSymmetricObjectProperty_ObjectPropertyExpression();

  /**
   * Returns the meta object for class '{@link west.twouse.language.sparqlas.AsymmetricObjectProperty <em>Asymmetric Object Property</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Asymmetric Object Property</em>'.
   * @see west.twouse.language.sparqlas.AsymmetricObjectProperty
   * @generated
   */
  EClass getAsymmetricObjectProperty();

  /**
   * Returns the meta object for the containment reference '{@link west.twouse.language.sparqlas.AsymmetricObjectProperty#getObjectPropertyExpression <em>Object Property Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Object Property Expression</em>'.
   * @see west.twouse.language.sparqlas.AsymmetricObjectProperty#getObjectPropertyExpression()
   * @see #getAsymmetricObjectProperty()
   * @generated
   */
  EReference getAsymmetricObjectProperty_ObjectPropertyExpression();

  /**
   * Returns the meta object for class '{@link west.twouse.language.sparqlas.TransitiveObjectProperty <em>Transitive Object Property</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Transitive Object Property</em>'.
   * @see west.twouse.language.sparqlas.TransitiveObjectProperty
   * @generated
   */
  EClass getTransitiveObjectProperty();

  /**
   * Returns the meta object for the containment reference '{@link west.twouse.language.sparqlas.TransitiveObjectProperty#getObjectPropertyExpression <em>Object Property Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Object Property Expression</em>'.
   * @see west.twouse.language.sparqlas.TransitiveObjectProperty#getObjectPropertyExpression()
   * @see #getTransitiveObjectProperty()
   * @generated
   */
  EReference getTransitiveObjectProperty_ObjectPropertyExpression();

  /**
   * Returns the meta object for class '{@link west.twouse.language.sparqlas.ObjectPropertyExpression <em>Object Property Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Object Property Expression</em>'.
   * @see west.twouse.language.sparqlas.ObjectPropertyExpression
   * @generated
   */
  EClass getObjectPropertyExpression();

  /**
   * Returns the meta object for class '{@link west.twouse.language.sparqlas.InverseObjectProperty <em>Inverse Object Property</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Inverse Object Property</em>'.
   * @see west.twouse.language.sparqlas.InverseObjectProperty
   * @generated
   */
  EClass getInverseObjectProperty();

  /**
   * Returns the meta object for the containment reference '{@link west.twouse.language.sparqlas.InverseObjectProperty#getObjectProperty <em>Object Property</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Object Property</em>'.
   * @see west.twouse.language.sparqlas.InverseObjectProperty#getObjectProperty()
   * @see #getInverseObjectProperty()
   * @generated
   */
  EReference getInverseObjectProperty_ObjectProperty();

  /**
   * Returns the meta object for class '{@link west.twouse.language.sparqlas.DataPropertyAtom <em>Data Property Atom</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Data Property Atom</em>'.
   * @see west.twouse.language.sparqlas.DataPropertyAtom
   * @generated
   */
  EClass getDataPropertyAtom();

  /**
   * Returns the meta object for class '{@link west.twouse.language.sparqlas.SubDataPropertyOf <em>Sub Data Property Of</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Sub Data Property Of</em>'.
   * @see west.twouse.language.sparqlas.SubDataPropertyOf
   * @generated
   */
  EClass getSubDataPropertyOf();

  /**
   * Returns the meta object for the containment reference '{@link west.twouse.language.sparqlas.SubDataPropertyOf#getSubDataPropertyExpression <em>Sub Data Property Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Sub Data Property Expression</em>'.
   * @see west.twouse.language.sparqlas.SubDataPropertyOf#getSubDataPropertyExpression()
   * @see #getSubDataPropertyOf()
   * @generated
   */
  EReference getSubDataPropertyOf_SubDataPropertyExpression();

  /**
   * Returns the meta object for the containment reference '{@link west.twouse.language.sparqlas.SubDataPropertyOf#getSuperDataPropertyExpression <em>Super Data Property Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Super Data Property Expression</em>'.
   * @see west.twouse.language.sparqlas.SubDataPropertyOf#getSuperDataPropertyExpression()
   * @see #getSubDataPropertyOf()
   * @generated
   */
  EReference getSubDataPropertyOf_SuperDataPropertyExpression();

  /**
   * Returns the meta object for class '{@link west.twouse.language.sparqlas.EquivalentDataProperties <em>Equivalent Data Properties</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Equivalent Data Properties</em>'.
   * @see west.twouse.language.sparqlas.EquivalentDataProperties
   * @generated
   */
  EClass getEquivalentDataProperties();

  /**
   * Returns the meta object for the containment reference list '{@link west.twouse.language.sparqlas.EquivalentDataProperties#getDataPropertyExpression <em>Data Property Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Data Property Expression</em>'.
   * @see west.twouse.language.sparqlas.EquivalentDataProperties#getDataPropertyExpression()
   * @see #getEquivalentDataProperties()
   * @generated
   */
  EReference getEquivalentDataProperties_DataPropertyExpression();

  /**
   * Returns the meta object for class '{@link west.twouse.language.sparqlas.DisjointDataProperties <em>Disjoint Data Properties</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Disjoint Data Properties</em>'.
   * @see west.twouse.language.sparqlas.DisjointDataProperties
   * @generated
   */
  EClass getDisjointDataProperties();

  /**
   * Returns the meta object for the containment reference list '{@link west.twouse.language.sparqlas.DisjointDataProperties#getDataPropertyExpression <em>Data Property Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Data Property Expression</em>'.
   * @see west.twouse.language.sparqlas.DisjointDataProperties#getDataPropertyExpression()
   * @see #getDisjointDataProperties()
   * @generated
   */
  EReference getDisjointDataProperties_DataPropertyExpression();

  /**
   * Returns the meta object for class '{@link west.twouse.language.sparqlas.DataPropertyDomain <em>Data Property Domain</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Data Property Domain</em>'.
   * @see west.twouse.language.sparqlas.DataPropertyDomain
   * @generated
   */
  EClass getDataPropertyDomain();

  /**
   * Returns the meta object for the containment reference '{@link west.twouse.language.sparqlas.DataPropertyDomain#getDataPropertyExpression <em>Data Property Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Data Property Expression</em>'.
   * @see west.twouse.language.sparqlas.DataPropertyDomain#getDataPropertyExpression()
   * @see #getDataPropertyDomain()
   * @generated
   */
  EReference getDataPropertyDomain_DataPropertyExpression();

  /**
   * Returns the meta object for the containment reference '{@link west.twouse.language.sparqlas.DataPropertyDomain#getDomain <em>Domain</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Domain</em>'.
   * @see west.twouse.language.sparqlas.DataPropertyDomain#getDomain()
   * @see #getDataPropertyDomain()
   * @generated
   */
  EReference getDataPropertyDomain_Domain();

  /**
   * Returns the meta object for class '{@link west.twouse.language.sparqlas.DataPropertyRange <em>Data Property Range</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Data Property Range</em>'.
   * @see west.twouse.language.sparqlas.DataPropertyRange
   * @generated
   */
  EClass getDataPropertyRange();

  /**
   * Returns the meta object for the containment reference '{@link west.twouse.language.sparqlas.DataPropertyRange#getDataPropertyExpression <em>Data Property Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Data Property Expression</em>'.
   * @see west.twouse.language.sparqlas.DataPropertyRange#getDataPropertyExpression()
   * @see #getDataPropertyRange()
   * @generated
   */
  EReference getDataPropertyRange_DataPropertyExpression();

  /**
   * Returns the meta object for the containment reference '{@link west.twouse.language.sparqlas.DataPropertyRange#getRange <em>Range</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Range</em>'.
   * @see west.twouse.language.sparqlas.DataPropertyRange#getRange()
   * @see #getDataPropertyRange()
   * @generated
   */
  EReference getDataPropertyRange_Range();

  /**
   * Returns the meta object for class '{@link west.twouse.language.sparqlas.FunctionalDataProperty <em>Functional Data Property</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Functional Data Property</em>'.
   * @see west.twouse.language.sparqlas.FunctionalDataProperty
   * @generated
   */
  EClass getFunctionalDataProperty();

  /**
   * Returns the meta object for the containment reference '{@link west.twouse.language.sparqlas.FunctionalDataProperty#getDataPropertyExpression <em>Data Property Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Data Property Expression</em>'.
   * @see west.twouse.language.sparqlas.FunctionalDataProperty#getDataPropertyExpression()
   * @see #getFunctionalDataProperty()
   * @generated
   */
  EReference getFunctionalDataProperty_DataPropertyExpression();

  /**
   * Returns the meta object for class '{@link west.twouse.language.sparqlas.DataPropertyExpression <em>Data Property Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Data Property Expression</em>'.
   * @see west.twouse.language.sparqlas.DataPropertyExpression
   * @generated
   */
  EClass getDataPropertyExpression();

  /**
   * Returns the meta object for class '{@link west.twouse.language.sparqlas.HasKey <em>Has Key</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Has Key</em>'.
   * @see west.twouse.language.sparqlas.HasKey
   * @generated
   */
  EClass getHasKey();

  /**
   * Returns the meta object for the containment reference '{@link west.twouse.language.sparqlas.HasKey#getClassExpression <em>Class Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Class Expression</em>'.
   * @see west.twouse.language.sparqlas.HasKey#getClassExpression()
   * @see #getHasKey()
   * @generated
   */
  EReference getHasKey_ClassExpression();

  /**
   * Returns the meta object for the containment reference list '{@link west.twouse.language.sparqlas.HasKey#getObjectPropertyExpression <em>Object Property Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Object Property Expression</em>'.
   * @see west.twouse.language.sparqlas.HasKey#getObjectPropertyExpression()
   * @see #getHasKey()
   * @generated
   */
  EReference getHasKey_ObjectPropertyExpression();

  /**
   * Returns the meta object for the containment reference list '{@link west.twouse.language.sparqlas.HasKey#getDataPropertyExpression <em>Data Property Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Data Property Expression</em>'.
   * @see west.twouse.language.sparqlas.HasKey#getDataPropertyExpression()
   * @see #getHasKey()
   * @generated
   */
  EReference getHasKey_DataPropertyExpression();

  /**
   * Returns the meta object for class '{@link west.twouse.language.sparqlas.Declaration <em>Declaration</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Declaration</em>'.
   * @see west.twouse.language.sparqlas.Declaration
   * @generated
   */
  EClass getDeclaration();

  /**
   * Returns the meta object for class '{@link west.twouse.language.sparqlas.ClassDeclaration <em>Class Declaration</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Class Declaration</em>'.
   * @see west.twouse.language.sparqlas.ClassDeclaration
   * @generated
   */
  EClass getClassDeclaration();

  /**
   * Returns the meta object for the containment reference '{@link west.twouse.language.sparqlas.ClassDeclaration#getClass_ <em>Class</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Class</em>'.
   * @see west.twouse.language.sparqlas.ClassDeclaration#getClass_()
   * @see #getClassDeclaration()
   * @generated
   */
  EReference getClassDeclaration_Class();

  /**
   * Returns the meta object for the containment reference '{@link west.twouse.language.sparqlas.ClassDeclaration#getClassVariable <em>Class Variable</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Class Variable</em>'.
   * @see west.twouse.language.sparqlas.ClassDeclaration#getClassVariable()
   * @see #getClassDeclaration()
   * @generated
   */
  EReference getClassDeclaration_ClassVariable();

  /**
   * Returns the meta object for class '{@link west.twouse.language.sparqlas.ObjectPropertyDeclaration <em>Object Property Declaration</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Object Property Declaration</em>'.
   * @see west.twouse.language.sparqlas.ObjectPropertyDeclaration
   * @generated
   */
  EClass getObjectPropertyDeclaration();

  /**
   * Returns the meta object for the containment reference '{@link west.twouse.language.sparqlas.ObjectPropertyDeclaration#getObjectProperty <em>Object Property</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Object Property</em>'.
   * @see west.twouse.language.sparqlas.ObjectPropertyDeclaration#getObjectProperty()
   * @see #getObjectPropertyDeclaration()
   * @generated
   */
  EReference getObjectPropertyDeclaration_ObjectProperty();

  /**
   * Returns the meta object for the containment reference '{@link west.twouse.language.sparqlas.ObjectPropertyDeclaration#getObjectPropertyVariable <em>Object Property Variable</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Object Property Variable</em>'.
   * @see west.twouse.language.sparqlas.ObjectPropertyDeclaration#getObjectPropertyVariable()
   * @see #getObjectPropertyDeclaration()
   * @generated
   */
  EReference getObjectPropertyDeclaration_ObjectPropertyVariable();

  /**
   * Returns the meta object for class '{@link west.twouse.language.sparqlas.DatatypePropertyDeclaration <em>Datatype Property Declaration</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Datatype Property Declaration</em>'.
   * @see west.twouse.language.sparqlas.DatatypePropertyDeclaration
   * @generated
   */
  EClass getDatatypePropertyDeclaration();

  /**
   * Returns the meta object for the containment reference '{@link west.twouse.language.sparqlas.DatatypePropertyDeclaration#getDatatypeProperty <em>Datatype Property</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Datatype Property</em>'.
   * @see west.twouse.language.sparqlas.DatatypePropertyDeclaration#getDatatypeProperty()
   * @see #getDatatypePropertyDeclaration()
   * @generated
   */
  EReference getDatatypePropertyDeclaration_DatatypeProperty();

  /**
   * Returns the meta object for the containment reference '{@link west.twouse.language.sparqlas.DatatypePropertyDeclaration#getDatatypePropertyVariable <em>Datatype Property Variable</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Datatype Property Variable</em>'.
   * @see west.twouse.language.sparqlas.DatatypePropertyDeclaration#getDatatypePropertyVariable()
   * @see #getDatatypePropertyDeclaration()
   * @generated
   */
  EReference getDatatypePropertyDeclaration_DatatypePropertyVariable();

  /**
   * Returns the meta object for class '{@link west.twouse.language.sparqlas.IndividualDeclaration <em>Individual Declaration</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Individual Declaration</em>'.
   * @see west.twouse.language.sparqlas.IndividualDeclaration
   * @generated
   */
  EClass getIndividualDeclaration();

  /**
   * Returns the meta object for the containment reference '{@link west.twouse.language.sparqlas.IndividualDeclaration#getIndividual <em>Individual</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Individual</em>'.
   * @see west.twouse.language.sparqlas.IndividualDeclaration#getIndividual()
   * @see #getIndividualDeclaration()
   * @generated
   */
  EReference getIndividualDeclaration_Individual();

  /**
   * Returns the meta object for the containment reference '{@link west.twouse.language.sparqlas.IndividualDeclaration#getIndividualVariable <em>Individual Variable</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Individual Variable</em>'.
   * @see west.twouse.language.sparqlas.IndividualDeclaration#getIndividualVariable()
   * @see #getIndividualDeclaration()
   * @generated
   */
  EReference getIndividualDeclaration_IndividualVariable();

  /**
   * Returns the meta object for class '{@link west.twouse.language.sparqlas.TemplateParameter <em>Template Parameter</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Template Parameter</em>'.
   * @see west.twouse.language.sparqlas.TemplateParameter
   * @generated
   */
  EClass getTemplateParameter();

  /**
   * Returns the meta object for the container reference '{@link west.twouse.language.sparqlas.TemplateParameter#getSignature <em>Signature</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the container reference '<em>Signature</em>'.
   * @see west.twouse.language.sparqlas.TemplateParameter#getSignature()
   * @see #getTemplateParameter()
   * @generated
   */
  EReference getTemplateParameter_Signature();

  /**
   * Returns the meta object for the containment reference '{@link west.twouse.language.sparqlas.TemplateParameter#getParameteredElement <em>Parametered Element</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Parametered Element</em>'.
   * @see west.twouse.language.sparqlas.TemplateParameter#getParameteredElement()
   * @see #getTemplateParameter()
   * @generated
   */
  EReference getTemplateParameter_ParameteredElement();

  /**
   * Returns the meta object for the reference '{@link west.twouse.language.sparqlas.TemplateParameter#getParameterSubstitution <em>Parameter Substitution</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Parameter Substitution</em>'.
   * @see west.twouse.language.sparqlas.TemplateParameter#getParameterSubstitution()
   * @see #getTemplateParameter()
   * @generated
   */
  EReference getTemplateParameter_ParameterSubstitution();

  /**
   * Returns the meta object for class '{@link west.twouse.language.sparqlas.ParameterableElement <em>Parameterable Element</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Parameterable Element</em>'.
   * @see west.twouse.language.sparqlas.ParameterableElement
   * @generated
   */
  EClass getParameterableElement();

  /**
   * Returns the meta object for the container reference '{@link west.twouse.language.sparqlas.ParameterableElement#getTemplateParameter <em>Template Parameter</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the container reference '<em>Template Parameter</em>'.
   * @see west.twouse.language.sparqlas.ParameterableElement#getTemplateParameter()
   * @see #getParameterableElement()
   * @generated
   */
  EReference getParameterableElement_TemplateParameter();

  /**
   * Returns the meta object for class '{@link west.twouse.language.sparqlas.TemplateSignature <em>Template Signature</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Template Signature</em>'.
   * @see west.twouse.language.sparqlas.TemplateSignature
   * @generated
   */
  EClass getTemplateSignature();

  /**
   * Returns the meta object for the containment reference list '{@link west.twouse.language.sparqlas.TemplateSignature#getOwnedParameter <em>Owned Parameter</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Owned Parameter</em>'.
   * @see west.twouse.language.sparqlas.TemplateSignature#getOwnedParameter()
   * @see #getTemplateSignature()
   * @generated
   */
  EReference getTemplateSignature_OwnedParameter();

  /**
   * Returns the meta object for the container reference '{@link west.twouse.language.sparqlas.TemplateSignature#getTemplate <em>Template</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the container reference '<em>Template</em>'.
   * @see west.twouse.language.sparqlas.TemplateSignature#getTemplate()
   * @see #getTemplateSignature()
   * @generated
   */
  EReference getTemplateSignature_Template();

  /**
   * Returns the meta object for class '{@link west.twouse.language.sparqlas.TemplateableElement <em>Templateable Element</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Templateable Element</em>'.
   * @see west.twouse.language.sparqlas.TemplateableElement
   * @generated
   */
  EClass getTemplateableElement();

  /**
   * Returns the meta object for the containment reference '{@link west.twouse.language.sparqlas.TemplateableElement#getOwnedTemplateSignature <em>Owned Template Signature</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Owned Template Signature</em>'.
   * @see west.twouse.language.sparqlas.TemplateableElement#getOwnedTemplateSignature()
   * @see #getTemplateableElement()
   * @generated
   */
  EReference getTemplateableElement_OwnedTemplateSignature();

  /**
   * Returns the meta object for the containment reference list '{@link west.twouse.language.sparqlas.TemplateableElement#getTemplateBinding <em>Template Binding</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Template Binding</em>'.
   * @see west.twouse.language.sparqlas.TemplateableElement#getTemplateBinding()
   * @see #getTemplateableElement()
   * @generated
   */
  EReference getTemplateableElement_TemplateBinding();

  /**
   * Returns the meta object for class '{@link west.twouse.language.sparqlas.TemplateParameterSubstitution <em>Template Parameter Substitution</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Template Parameter Substitution</em>'.
   * @see west.twouse.language.sparqlas.TemplateParameterSubstitution
   * @generated
   */
  EClass getTemplateParameterSubstitution();

  /**
   * Returns the meta object for the containment reference '{@link west.twouse.language.sparqlas.TemplateParameterSubstitution#getActual <em>Actual</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Actual</em>'.
   * @see west.twouse.language.sparqlas.TemplateParameterSubstitution#getActual()
   * @see #getTemplateParameterSubstitution()
   * @generated
   */
  EReference getTemplateParameterSubstitution_Actual();

  /**
   * Returns the meta object for the container reference '{@link west.twouse.language.sparqlas.TemplateParameterSubstitution#getTemplateBinding <em>Template Binding</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the container reference '<em>Template Binding</em>'.
   * @see west.twouse.language.sparqlas.TemplateParameterSubstitution#getTemplateBinding()
   * @see #getTemplateParameterSubstitution()
   * @generated
   */
  EReference getTemplateParameterSubstitution_TemplateBinding();

  /**
   * Returns the meta object for the containment reference '{@link west.twouse.language.sparqlas.TemplateParameterSubstitution#getFormal <em>Formal</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Formal</em>'.
   * @see west.twouse.language.sparqlas.TemplateParameterSubstitution#getFormal()
   * @see #getTemplateParameterSubstitution()
   * @generated
   */
  EReference getTemplateParameterSubstitution_Formal();

  /**
   * Returns the meta object for class '{@link west.twouse.language.sparqlas.TemplateBinding <em>Template Binding</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Template Binding</em>'.
   * @see west.twouse.language.sparqlas.TemplateBinding
   * @generated
   */
  EClass getTemplateBinding();

  /**
   * Returns the meta object for the containment reference list '{@link west.twouse.language.sparqlas.TemplateBinding#getParameterSubstitution <em>Parameter Substitution</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Parameter Substitution</em>'.
   * @see west.twouse.language.sparqlas.TemplateBinding#getParameterSubstitution()
   * @see #getTemplateBinding()
   * @generated
   */
  EReference getTemplateBinding_ParameterSubstitution();

  /**
   * Returns the meta object for the container reference '{@link west.twouse.language.sparqlas.TemplateBinding#getBoundElement <em>Bound Element</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the container reference '<em>Bound Element</em>'.
   * @see west.twouse.language.sparqlas.TemplateBinding#getBoundElement()
   * @see #getTemplateBinding()
   * @generated
   */
  EReference getTemplateBinding_BoundElement();

  /**
   * Returns the meta object for the containment reference '{@link west.twouse.language.sparqlas.TemplateBinding#getSignature <em>Signature</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Signature</em>'.
   * @see west.twouse.language.sparqlas.TemplateBinding#getSignature()
   * @see #getTemplateBinding()
   * @generated
   */
  EReference getTemplateBinding_Signature();

  /**
   * Returns the meta object for class '{@link west.twouse.language.sparqlas.DirectClassAssertion <em>Direct Class Assertion</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Direct Class Assertion</em>'.
   * @see west.twouse.language.sparqlas.DirectClassAssertion
   * @generated
   */
  EClass getDirectClassAssertion();

  /**
   * Returns the meta object for the containment reference '{@link west.twouse.language.sparqlas.DirectClassAssertion#getIndividual <em>Individual</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Individual</em>'.
   * @see west.twouse.language.sparqlas.DirectClassAssertion#getIndividual()
   * @see #getDirectClassAssertion()
   * @generated
   */
  EReference getDirectClassAssertion_Individual();

  /**
   * Returns the meta object for the containment reference '{@link west.twouse.language.sparqlas.DirectClassAssertion#getClassExpression <em>Class Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Class Expression</em>'.
   * @see west.twouse.language.sparqlas.DirectClassAssertion#getClassExpression()
   * @see #getDirectClassAssertion()
   * @generated
   */
  EReference getDirectClassAssertion_ClassExpression();

  /**
   * Returns the meta object for class '{@link west.twouse.language.sparqlas.DirectSubClassOf <em>Direct Sub Class Of</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Direct Sub Class Of</em>'.
   * @see west.twouse.language.sparqlas.DirectSubClassOf
   * @generated
   */
  EClass getDirectSubClassOf();

  /**
   * Returns the meta object for the containment reference '{@link west.twouse.language.sparqlas.DirectSubClassOf#getSubClassExpression <em>Sub Class Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Sub Class Expression</em>'.
   * @see west.twouse.language.sparqlas.DirectSubClassOf#getSubClassExpression()
   * @see #getDirectSubClassOf()
   * @generated
   */
  EReference getDirectSubClassOf_SubClassExpression();

  /**
   * Returns the meta object for the containment reference '{@link west.twouse.language.sparqlas.DirectSubClassOf#getSuperClassExpression <em>Super Class Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Super Class Expression</em>'.
   * @see west.twouse.language.sparqlas.DirectSubClassOf#getSuperClassExpression()
   * @see #getDirectSubClassOf()
   * @generated
   */
  EReference getDirectSubClassOf_SuperClassExpression();

  /**
   * Returns the meta object for class '{@link west.twouse.language.sparqlas.StrictSubClassOf <em>Strict Sub Class Of</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Strict Sub Class Of</em>'.
   * @see west.twouse.language.sparqlas.StrictSubClassOf
   * @generated
   */
  EClass getStrictSubClassOf();

  /**
   * Returns the meta object for the containment reference '{@link west.twouse.language.sparqlas.StrictSubClassOf#getSubClassExpression <em>Sub Class Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Sub Class Expression</em>'.
   * @see west.twouse.language.sparqlas.StrictSubClassOf#getSubClassExpression()
   * @see #getStrictSubClassOf()
   * @generated
   */
  EReference getStrictSubClassOf_SubClassExpression();

  /**
   * Returns the meta object for the containment reference '{@link west.twouse.language.sparqlas.StrictSubClassOf#getSuperClassExpression <em>Super Class Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Super Class Expression</em>'.
   * @see west.twouse.language.sparqlas.StrictSubClassOf#getSuperClassExpression()
   * @see #getStrictSubClassOf()
   * @generated
   */
  EReference getStrictSubClassOf_SuperClassExpression();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  SparqlmsFactory getSparqlmsFactory();

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
  interface Literals
  {
    /**
     * The meta object literal for the '{@link west.twouse.language.sparqlas.impl.OntologyDocumentImpl <em>Ontology Document</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see west.twouse.language.sparqlas.impl.OntologyDocumentImpl
     * @see west.twouse.language.sparqlas.impl.SparqlmsPackageImpl#getOntologyDocument()
     * @generated
     */
    EClass ONTOLOGY_DOCUMENT = eINSTANCE.getOntologyDocument();

    /**
     * The meta object literal for the '<em><b>Query IRI</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ONTOLOGY_DOCUMENT__QUERY_IRI = eINSTANCE.getOntologyDocument_QueryIRI();

    /**
     * The meta object literal for the '<em><b>Import</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ONTOLOGY_DOCUMENT__IMPORT = eINSTANCE.getOntologyDocument_Import();

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
     * The meta object literal for the '{@link west.twouse.language.sparqlas.impl.ImportImpl <em>Import</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see west.twouse.language.sparqlas.impl.ImportImpl
     * @see west.twouse.language.sparqlas.impl.SparqlmsPackageImpl#getImport()
     * @generated
     */
    EClass IMPORT = eINSTANCE.getImport();

    /**
     * The meta object literal for the '<em><b>Import IRI</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference IMPORT__IMPORT_IRI = eINSTANCE.getImport_ImportIRI();

    /**
     * The meta object literal for the '{@link west.twouse.language.sparqlas.impl.PrefixDefinitionImpl <em>Prefix Definition</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see west.twouse.language.sparqlas.impl.PrefixDefinitionImpl
     * @see west.twouse.language.sparqlas.impl.SparqlmsPackageImpl#getPrefixDefinition()
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
     * The meta object literal for the '{@link west.twouse.language.sparqlas.impl.QueryImpl <em>Query</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see west.twouse.language.sparqlas.impl.QueryImpl
     * @see west.twouse.language.sparqlas.impl.SparqlmsPackageImpl#getQuery()
     * @generated
     */
    EClass QUERY = eINSTANCE.getQuery();

    /**
     * The meta object literal for the '{@link west.twouse.language.sparqlas.impl.SelectQueryImpl <em>Select Query</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see west.twouse.language.sparqlas.impl.SelectQueryImpl
     * @see west.twouse.language.sparqlas.impl.SparqlmsPackageImpl#getSelectQuery()
     * @generated
     */
    EClass SELECT_QUERY = eINSTANCE.getSelectQuery();

    /**
     * The meta object literal for the '<em><b>Atoms</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SELECT_QUERY__ATOMS = eINSTANCE.getSelectQuery_Atoms();

    /**
     * The meta object literal for the '{@link west.twouse.language.sparqlas.impl.ConstructQueryImpl <em>Construct Query</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see west.twouse.language.sparqlas.impl.ConstructQueryImpl
     * @see west.twouse.language.sparqlas.impl.SparqlmsPackageImpl#getConstructQuery()
     * @generated
     */
    EClass CONSTRUCT_QUERY = eINSTANCE.getConstructQuery();

    /**
     * The meta object literal for the '<em><b>Construct Atoms</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CONSTRUCT_QUERY__CONSTRUCT_ATOMS = eINSTANCE.getConstructQuery_ConstructAtoms();

    /**
     * The meta object literal for the '<em><b>Where Atoms</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CONSTRUCT_QUERY__WHERE_ATOMS = eINSTANCE.getConstructQuery_WhereAtoms();

    /**
     * The meta object literal for the '{@link west.twouse.language.sparqlas.impl.AskQueryImpl <em>Ask Query</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see west.twouse.language.sparqlas.impl.AskQueryImpl
     * @see west.twouse.language.sparqlas.impl.SparqlmsPackageImpl#getAskQuery()
     * @generated
     */
    EClass ASK_QUERY = eINSTANCE.getAskQuery();

    /**
     * The meta object literal for the '<em><b>Atoms</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ASK_QUERY__ATOMS = eINSTANCE.getAskQuery_Atoms();

    /**
     * The meta object literal for the '{@link west.twouse.language.sparqlas.impl.DescribeQueryImpl <em>Describe Query</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see west.twouse.language.sparqlas.impl.DescribeQueryImpl
     * @see west.twouse.language.sparqlas.impl.SparqlmsPackageImpl#getDescribeQuery()
     * @generated
     */
    EClass DESCRIBE_QUERY = eINSTANCE.getDescribeQuery();

    /**
     * The meta object literal for the '<em><b>Describe IRI</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DESCRIBE_QUERY__DESCRIBE_IRI = eINSTANCE.getDescribeQuery_DescribeIRI();

    /**
     * The meta object literal for the '<em><b>Atoms</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DESCRIBE_QUERY__ATOMS = eINSTANCE.getDescribeQuery_Atoms();

    /**
     * The meta object literal for the '{@link west.twouse.language.sparqlas.impl.IRIImpl <em>IRI</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see west.twouse.language.sparqlas.impl.IRIImpl
     * @see west.twouse.language.sparqlas.impl.SparqlmsPackageImpl#getIRI()
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
     * The meta object literal for the '{@link west.twouse.language.sparqlas.impl.FullIRIImpl <em>Full IRI</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see west.twouse.language.sparqlas.impl.FullIRIImpl
     * @see west.twouse.language.sparqlas.impl.SparqlmsPackageImpl#getFullIRI()
     * @generated
     */
    EClass FULL_IRI = eINSTANCE.getFullIRI();

    /**
     * The meta object literal for the '{@link west.twouse.language.sparqlas.impl.AbbreviatedIRIImpl <em>Abbreviated IRI</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see west.twouse.language.sparqlas.impl.AbbreviatedIRIImpl
     * @see west.twouse.language.sparqlas.impl.SparqlmsPackageImpl#getAbbreviatedIRI()
     * @generated
     */
    EClass ABBREVIATED_IRI = eINSTANCE.getAbbreviatedIRI();

    /**
     * The meta object literal for the '{@link west.twouse.language.sparqlas.impl.TermImpl <em>Term</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see west.twouse.language.sparqlas.impl.TermImpl
     * @see west.twouse.language.sparqlas.impl.SparqlmsPackageImpl#getTerm()
     * @generated
     */
    EClass TERM = eINSTANCE.getTerm();

    /**
     * The meta object literal for the '{@link west.twouse.language.sparqlas.impl.VariableImpl <em>Variable</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see west.twouse.language.sparqlas.impl.VariableImpl
     * @see west.twouse.language.sparqlas.impl.SparqlmsPackageImpl#getVariable()
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
     * The meta object literal for the '{@link west.twouse.language.sparqlas.impl.ClassVariableImpl <em>Class Variable</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see west.twouse.language.sparqlas.impl.ClassVariableImpl
     * @see west.twouse.language.sparqlas.impl.SparqlmsPackageImpl#getClassVariable()
     * @generated
     */
    EClass CLASS_VARIABLE = eINSTANCE.getClassVariable();

    /**
     * The meta object literal for the '{@link west.twouse.language.sparqlas.impl.ObjectPropertyVariableImpl <em>Object Property Variable</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see west.twouse.language.sparqlas.impl.ObjectPropertyVariableImpl
     * @see west.twouse.language.sparqlas.impl.SparqlmsPackageImpl#getObjectPropertyVariable()
     * @generated
     */
    EClass OBJECT_PROPERTY_VARIABLE = eINSTANCE.getObjectPropertyVariable();

    /**
     * The meta object literal for the '{@link west.twouse.language.sparqlas.impl.DataPropertyVariableImpl <em>Data Property Variable</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see west.twouse.language.sparqlas.impl.DataPropertyVariableImpl
     * @see west.twouse.language.sparqlas.impl.SparqlmsPackageImpl#getDataPropertyVariable()
     * @generated
     */
    EClass DATA_PROPERTY_VARIABLE = eINSTANCE.getDataPropertyVariable();

    /**
     * The meta object literal for the '{@link west.twouse.language.sparqlas.impl.IndividualVariableImpl <em>Individual Variable</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see west.twouse.language.sparqlas.impl.IndividualVariableImpl
     * @see west.twouse.language.sparqlas.impl.SparqlmsPackageImpl#getIndividualVariable()
     * @generated
     */
    EClass INDIVIDUAL_VARIABLE = eINSTANCE.getIndividualVariable();

    /**
     * The meta object literal for the '{@link west.twouse.language.sparqlas.impl.ConstantImpl <em>Constant</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see west.twouse.language.sparqlas.impl.ConstantImpl
     * @see west.twouse.language.sparqlas.impl.SparqlmsPackageImpl#getConstant()
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
     * The meta object literal for the '{@link west.twouse.language.sparqlas.impl.ClassImpl <em>Class</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see west.twouse.language.sparqlas.impl.ClassImpl
     * @see west.twouse.language.sparqlas.impl.SparqlmsPackageImpl#getClass_()
     * @generated
     */
    EClass CLASS = eINSTANCE.getClass_();

    /**
     * The meta object literal for the '{@link west.twouse.language.sparqlas.impl.DatatypeImpl <em>Datatype</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see west.twouse.language.sparqlas.impl.DatatypeImpl
     * @see west.twouse.language.sparqlas.impl.SparqlmsPackageImpl#getDatatype()
     * @generated
     */
    EClass DATATYPE = eINSTANCE.getDatatype();

    /**
     * The meta object literal for the '{@link west.twouse.language.sparqlas.impl.ObjectPropertyImpl <em>Object Property</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see west.twouse.language.sparqlas.impl.ObjectPropertyImpl
     * @see west.twouse.language.sparqlas.impl.SparqlmsPackageImpl#getObjectProperty()
     * @generated
     */
    EClass OBJECT_PROPERTY = eINSTANCE.getObjectProperty();

    /**
     * The meta object literal for the '{@link west.twouse.language.sparqlas.impl.DataPropertyImpl <em>Data Property</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see west.twouse.language.sparqlas.impl.DataPropertyImpl
     * @see west.twouse.language.sparqlas.impl.SparqlmsPackageImpl#getDataProperty()
     * @generated
     */
    EClass DATA_PROPERTY = eINSTANCE.getDataProperty();

    /**
     * The meta object literal for the '{@link west.twouse.language.sparqlas.impl.IndividualImpl <em>Individual</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see west.twouse.language.sparqlas.impl.IndividualImpl
     * @see west.twouse.language.sparqlas.impl.SparqlmsPackageImpl#getIndividual()
     * @generated
     */
    EClass INDIVIDUAL = eINSTANCE.getIndividual();

    /**
     * The meta object literal for the '{@link west.twouse.language.sparqlas.impl.NamedIndividualImpl <em>Named Individual</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see west.twouse.language.sparqlas.impl.NamedIndividualImpl
     * @see west.twouse.language.sparqlas.impl.SparqlmsPackageImpl#getNamedIndividual()
     * @generated
     */
    EClass NAMED_INDIVIDUAL = eINSTANCE.getNamedIndividual();

    /**
     * The meta object literal for the '{@link west.twouse.language.sparqlas.impl.AnonymousIndividualImpl <em>Anonymous Individual</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see west.twouse.language.sparqlas.impl.AnonymousIndividualImpl
     * @see west.twouse.language.sparqlas.impl.SparqlmsPackageImpl#getAnonymousIndividual()
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
     * The meta object literal for the '{@link west.twouse.language.sparqlas.impl.AbstractLiteralImpl <em>Abstract Literal</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see west.twouse.language.sparqlas.impl.AbstractLiteralImpl
     * @see west.twouse.language.sparqlas.impl.SparqlmsPackageImpl#getAbstractLiteral()
     * @generated
     */
    EClass ABSTRACT_LITERAL = eINSTANCE.getAbstractLiteral();

    /**
     * The meta object literal for the '{@link west.twouse.language.sparqlas.impl.LiteralVariableImpl <em>Literal Variable</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see west.twouse.language.sparqlas.impl.LiteralVariableImpl
     * @see west.twouse.language.sparqlas.impl.SparqlmsPackageImpl#getLiteralVariable()
     * @generated
     */
    EClass LITERAL_VARIABLE = eINSTANCE.getLiteralVariable();

    /**
     * The meta object literal for the '{@link west.twouse.language.sparqlas.impl.LiteralImpl <em>Literal</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see west.twouse.language.sparqlas.impl.LiteralImpl
     * @see west.twouse.language.sparqlas.impl.SparqlmsPackageImpl#getLiteral()
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
     * The meta object literal for the '{@link west.twouse.language.sparqlas.impl.ExpressionImpl <em>Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see west.twouse.language.sparqlas.impl.ExpressionImpl
     * @see west.twouse.language.sparqlas.impl.SparqlmsPackageImpl#getExpression()
     * @generated
     */
    EClass EXPRESSION = eINSTANCE.getExpression();

    /**
     * The meta object literal for the '{@link west.twouse.language.sparqlas.impl.AtomImpl <em>Atom</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see west.twouse.language.sparqlas.impl.AtomImpl
     * @see west.twouse.language.sparqlas.impl.SparqlmsPackageImpl#getAtom()
     * @generated
     */
    EClass ATOM = eINSTANCE.getAtom();

    /**
     * The meta object literal for the '{@link west.twouse.language.sparqlas.impl.AssertionImpl <em>Assertion</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see west.twouse.language.sparqlas.impl.AssertionImpl
     * @see west.twouse.language.sparqlas.impl.SparqlmsPackageImpl#getAssertion()
     * @generated
     */
    EClass ASSERTION = eINSTANCE.getAssertion();

    /**
     * The meta object literal for the '{@link west.twouse.language.sparqlas.impl.ClassAssertionImpl <em>Class Assertion</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see west.twouse.language.sparqlas.impl.ClassAssertionImpl
     * @see west.twouse.language.sparqlas.impl.SparqlmsPackageImpl#getClassAssertion()
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
     * The meta object literal for the '{@link west.twouse.language.sparqlas.impl.ObjectPropertyAssertionImpl <em>Object Property Assertion</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see west.twouse.language.sparqlas.impl.ObjectPropertyAssertionImpl
     * @see west.twouse.language.sparqlas.impl.SparqlmsPackageImpl#getObjectPropertyAssertion()
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
     * The meta object literal for the '{@link west.twouse.language.sparqlas.impl.DataPropertyAssertionImpl <em>Data Property Assertion</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see west.twouse.language.sparqlas.impl.DataPropertyAssertionImpl
     * @see west.twouse.language.sparqlas.impl.SparqlmsPackageImpl#getDataPropertyAssertion()
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
     * The meta object literal for the '{@link west.twouse.language.sparqlas.impl.NegativeObjectPropertyAssertionImpl <em>Negative Object Property Assertion</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see west.twouse.language.sparqlas.impl.NegativeObjectPropertyAssertionImpl
     * @see west.twouse.language.sparqlas.impl.SparqlmsPackageImpl#getNegativeObjectPropertyAssertion()
     * @generated
     */
    EClass NEGATIVE_OBJECT_PROPERTY_ASSERTION = eINSTANCE.getNegativeObjectPropertyAssertion();

    /**
     * The meta object literal for the '<em><b>Source Individual</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference NEGATIVE_OBJECT_PROPERTY_ASSERTION__SOURCE_INDIVIDUAL = eINSTANCE.getNegativeObjectPropertyAssertion_SourceIndividual();

    /**
     * The meta object literal for the '<em><b>Target Individual</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference NEGATIVE_OBJECT_PROPERTY_ASSERTION__TARGET_INDIVIDUAL = eINSTANCE.getNegativeObjectPropertyAssertion_TargetIndividual();

    /**
     * The meta object literal for the '<em><b>Object Property Expression</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference NEGATIVE_OBJECT_PROPERTY_ASSERTION__OBJECT_PROPERTY_EXPRESSION = eINSTANCE.getNegativeObjectPropertyAssertion_ObjectPropertyExpression();

    /**
     * The meta object literal for the '{@link west.twouse.language.sparqlas.impl.NegativeDataPropertyAssertionImpl <em>Negative Data Property Assertion</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see west.twouse.language.sparqlas.impl.NegativeDataPropertyAssertionImpl
     * @see west.twouse.language.sparqlas.impl.SparqlmsPackageImpl#getNegativeDataPropertyAssertion()
     * @generated
     */
    EClass NEGATIVE_DATA_PROPERTY_ASSERTION = eINSTANCE.getNegativeDataPropertyAssertion();

    /**
     * The meta object literal for the '<em><b>Source Individual</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference NEGATIVE_DATA_PROPERTY_ASSERTION__SOURCE_INDIVIDUAL = eINSTANCE.getNegativeDataPropertyAssertion_SourceIndividual();

    /**
     * The meta object literal for the '<em><b>Target Value</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference NEGATIVE_DATA_PROPERTY_ASSERTION__TARGET_VALUE = eINSTANCE.getNegativeDataPropertyAssertion_TargetValue();

    /**
     * The meta object literal for the '<em><b>Data Property Expression</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference NEGATIVE_DATA_PROPERTY_ASSERTION__DATA_PROPERTY_EXPRESSION = eINSTANCE.getNegativeDataPropertyAssertion_DataPropertyExpression();

    /**
     * The meta object literal for the '{@link west.twouse.language.sparqlas.impl.SameIndividualImpl <em>Same Individual</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see west.twouse.language.sparqlas.impl.SameIndividualImpl
     * @see west.twouse.language.sparqlas.impl.SparqlmsPackageImpl#getSameIndividual()
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
     * The meta object literal for the '{@link west.twouse.language.sparqlas.impl.DifferentIndividualsImpl <em>Different Individuals</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see west.twouse.language.sparqlas.impl.DifferentIndividualsImpl
     * @see west.twouse.language.sparqlas.impl.SparqlmsPackageImpl#getDifferentIndividuals()
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
     * The meta object literal for the '{@link west.twouse.language.sparqlas.impl.ClassAtomImpl <em>Class Atom</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see west.twouse.language.sparqlas.impl.ClassAtomImpl
     * @see west.twouse.language.sparqlas.impl.SparqlmsPackageImpl#getClassAtom()
     * @generated
     */
    EClass CLASS_ATOM = eINSTANCE.getClassAtom();

    /**
     * The meta object literal for the '{@link west.twouse.language.sparqlas.impl.SubClassOfImpl <em>Sub Class Of</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see west.twouse.language.sparqlas.impl.SubClassOfImpl
     * @see west.twouse.language.sparqlas.impl.SparqlmsPackageImpl#getSubClassOf()
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
     * The meta object literal for the '{@link west.twouse.language.sparqlas.impl.EquivalentClassesImpl <em>Equivalent Classes</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see west.twouse.language.sparqlas.impl.EquivalentClassesImpl
     * @see west.twouse.language.sparqlas.impl.SparqlmsPackageImpl#getEquivalentClasses()
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
     * The meta object literal for the '{@link west.twouse.language.sparqlas.impl.DisjointClassesImpl <em>Disjoint Classes</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see west.twouse.language.sparqlas.impl.DisjointClassesImpl
     * @see west.twouse.language.sparqlas.impl.SparqlmsPackageImpl#getDisjointClasses()
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
     * The meta object literal for the '{@link west.twouse.language.sparqlas.impl.DisjointUnionImpl <em>Disjoint Union</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see west.twouse.language.sparqlas.impl.DisjointUnionImpl
     * @see west.twouse.language.sparqlas.impl.SparqlmsPackageImpl#getDisjointUnion()
     * @generated
     */
    EClass DISJOINT_UNION = eINSTANCE.getDisjointUnion();

    /**
     * The meta object literal for the '<em><b>Class</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DISJOINT_UNION__CLASS = eINSTANCE.getDisjointUnion_Class();

    /**
     * The meta object literal for the '<em><b>Class Variable</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DISJOINT_UNION__CLASS_VARIABLE = eINSTANCE.getDisjointUnion_ClassVariable();

    /**
     * The meta object literal for the '<em><b>Disjoint Class Expressions</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DISJOINT_UNION__DISJOINT_CLASS_EXPRESSIONS = eINSTANCE.getDisjointUnion_DisjointClassExpressions();

    /**
     * The meta object literal for the '{@link west.twouse.language.sparqlas.impl.ClassExpressionImpl <em>Class Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see west.twouse.language.sparqlas.impl.ClassExpressionImpl
     * @see west.twouse.language.sparqlas.impl.SparqlmsPackageImpl#getClassExpression()
     * @generated
     */
    EClass CLASS_EXPRESSION = eINSTANCE.getClassExpression();

    /**
     * The meta object literal for the '{@link west.twouse.language.sparqlas.impl.ObjectUnionOfImpl <em>Object Union Of</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see west.twouse.language.sparqlas.impl.ObjectUnionOfImpl
     * @see west.twouse.language.sparqlas.impl.SparqlmsPackageImpl#getObjectUnionOf()
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
     * The meta object literal for the '{@link west.twouse.language.sparqlas.impl.ObjectComplementOfImpl <em>Object Complement Of</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see west.twouse.language.sparqlas.impl.ObjectComplementOfImpl
     * @see west.twouse.language.sparqlas.impl.SparqlmsPackageImpl#getObjectComplementOf()
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
     * The meta object literal for the '{@link west.twouse.language.sparqlas.impl.ObjectOneOfImpl <em>Object One Of</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see west.twouse.language.sparqlas.impl.ObjectOneOfImpl
     * @see west.twouse.language.sparqlas.impl.SparqlmsPackageImpl#getObjectOneOf()
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
     * The meta object literal for the '{@link west.twouse.language.sparqlas.impl.ObjectIntersectionOfImpl <em>Object Intersection Of</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see west.twouse.language.sparqlas.impl.ObjectIntersectionOfImpl
     * @see west.twouse.language.sparqlas.impl.SparqlmsPackageImpl#getObjectIntersectionOf()
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
     * The meta object literal for the '{@link west.twouse.language.sparqlas.impl.ObjectAllValuesFromImpl <em>Object All Values From</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see west.twouse.language.sparqlas.impl.ObjectAllValuesFromImpl
     * @see west.twouse.language.sparqlas.impl.SparqlmsPackageImpl#getObjectAllValuesFrom()
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
     * The meta object literal for the '{@link west.twouse.language.sparqlas.impl.ObjectSomeValuesFromImpl <em>Object Some Values From</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see west.twouse.language.sparqlas.impl.ObjectSomeValuesFromImpl
     * @see west.twouse.language.sparqlas.impl.SparqlmsPackageImpl#getObjectSomeValuesFrom()
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
     * The meta object literal for the '{@link west.twouse.language.sparqlas.impl.ObjectHasValueImpl <em>Object Has Value</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see west.twouse.language.sparqlas.impl.ObjectHasValueImpl
     * @see west.twouse.language.sparqlas.impl.SparqlmsPackageImpl#getObjectHasValue()
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
     * The meta object literal for the '{@link west.twouse.language.sparqlas.impl.ObjectMinCardinalityImpl <em>Object Min Cardinality</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see west.twouse.language.sparqlas.impl.ObjectMinCardinalityImpl
     * @see west.twouse.language.sparqlas.impl.SparqlmsPackageImpl#getObjectMinCardinality()
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
     * The meta object literal for the '{@link west.twouse.language.sparqlas.impl.ObjectMaxCardinalityImpl <em>Object Max Cardinality</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see west.twouse.language.sparqlas.impl.ObjectMaxCardinalityImpl
     * @see west.twouse.language.sparqlas.impl.SparqlmsPackageImpl#getObjectMaxCardinality()
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
     * The meta object literal for the '{@link west.twouse.language.sparqlas.impl.ObjectExactCardinalityImpl <em>Object Exact Cardinality</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see west.twouse.language.sparqlas.impl.ObjectExactCardinalityImpl
     * @see west.twouse.language.sparqlas.impl.SparqlmsPackageImpl#getObjectExactCardinality()
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
     * The meta object literal for the '{@link west.twouse.language.sparqlas.impl.DataAllValuesFromImpl <em>Data All Values From</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see west.twouse.language.sparqlas.impl.DataAllValuesFromImpl
     * @see west.twouse.language.sparqlas.impl.SparqlmsPackageImpl#getDataAllValuesFrom()
     * @generated
     */
    EClass DATA_ALL_VALUES_FROM = eINSTANCE.getDataAllValuesFrom();

    /**
     * The meta object literal for the '<em><b>Data Range</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DATA_ALL_VALUES_FROM__DATA_RANGE = eINSTANCE.getDataAllValuesFrom_DataRange();

    /**
     * The meta object literal for the '<em><b>Data Property Expressions</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DATA_ALL_VALUES_FROM__DATA_PROPERTY_EXPRESSIONS = eINSTANCE.getDataAllValuesFrom_DataPropertyExpressions();

    /**
     * The meta object literal for the '{@link west.twouse.language.sparqlas.impl.DataSomeValuesFromImpl <em>Data Some Values From</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see west.twouse.language.sparqlas.impl.DataSomeValuesFromImpl
     * @see west.twouse.language.sparqlas.impl.SparqlmsPackageImpl#getDataSomeValuesFrom()
     * @generated
     */
    EClass DATA_SOME_VALUES_FROM = eINSTANCE.getDataSomeValuesFrom();

    /**
     * The meta object literal for the '<em><b>Data Range</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DATA_SOME_VALUES_FROM__DATA_RANGE = eINSTANCE.getDataSomeValuesFrom_DataRange();

    /**
     * The meta object literal for the '<em><b>Data Property Expressions</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DATA_SOME_VALUES_FROM__DATA_PROPERTY_EXPRESSIONS = eINSTANCE.getDataSomeValuesFrom_DataPropertyExpressions();

    /**
     * The meta object literal for the '{@link west.twouse.language.sparqlas.impl.DataHasValueImpl <em>Data Has Value</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see west.twouse.language.sparqlas.impl.DataHasValueImpl
     * @see west.twouse.language.sparqlas.impl.SparqlmsPackageImpl#getDataHasValue()
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
     * The meta object literal for the '{@link west.twouse.language.sparqlas.impl.DataMinCardinalityImpl <em>Data Min Cardinality</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see west.twouse.language.sparqlas.impl.DataMinCardinalityImpl
     * @see west.twouse.language.sparqlas.impl.SparqlmsPackageImpl#getDataMinCardinality()
     * @generated
     */
    EClass DATA_MIN_CARDINALITY = eINSTANCE.getDataMinCardinality();

    /**
     * The meta object literal for the '<em><b>Cardinality</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute DATA_MIN_CARDINALITY__CARDINALITY = eINSTANCE.getDataMinCardinality_Cardinality();

    /**
     * The meta object literal for the '<em><b>Data Range</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DATA_MIN_CARDINALITY__DATA_RANGE = eINSTANCE.getDataMinCardinality_DataRange();

    /**
     * The meta object literal for the '<em><b>Data Property Expression</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DATA_MIN_CARDINALITY__DATA_PROPERTY_EXPRESSION = eINSTANCE.getDataMinCardinality_DataPropertyExpression();

    /**
     * The meta object literal for the '{@link west.twouse.language.sparqlas.impl.DataMaxCardinalityImpl <em>Data Max Cardinality</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see west.twouse.language.sparqlas.impl.DataMaxCardinalityImpl
     * @see west.twouse.language.sparqlas.impl.SparqlmsPackageImpl#getDataMaxCardinality()
     * @generated
     */
    EClass DATA_MAX_CARDINALITY = eINSTANCE.getDataMaxCardinality();

    /**
     * The meta object literal for the '<em><b>Cardinality</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute DATA_MAX_CARDINALITY__CARDINALITY = eINSTANCE.getDataMaxCardinality_Cardinality();

    /**
     * The meta object literal for the '<em><b>Data Range</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DATA_MAX_CARDINALITY__DATA_RANGE = eINSTANCE.getDataMaxCardinality_DataRange();

    /**
     * The meta object literal for the '<em><b>Data Property Expression</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DATA_MAX_CARDINALITY__DATA_PROPERTY_EXPRESSION = eINSTANCE.getDataMaxCardinality_DataPropertyExpression();

    /**
     * The meta object literal for the '{@link west.twouse.language.sparqlas.impl.DataExactCardinalityImpl <em>Data Exact Cardinality</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see west.twouse.language.sparqlas.impl.DataExactCardinalityImpl
     * @see west.twouse.language.sparqlas.impl.SparqlmsPackageImpl#getDataExactCardinality()
     * @generated
     */
    EClass DATA_EXACT_CARDINALITY = eINSTANCE.getDataExactCardinality();

    /**
     * The meta object literal for the '<em><b>Cardinality</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute DATA_EXACT_CARDINALITY__CARDINALITY = eINSTANCE.getDataExactCardinality_Cardinality();

    /**
     * The meta object literal for the '<em><b>Data Range</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DATA_EXACT_CARDINALITY__DATA_RANGE = eINSTANCE.getDataExactCardinality_DataRange();

    /**
     * The meta object literal for the '<em><b>Data Property Expression</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DATA_EXACT_CARDINALITY__DATA_PROPERTY_EXPRESSION = eINSTANCE.getDataExactCardinality_DataPropertyExpression();

    /**
     * The meta object literal for the '{@link west.twouse.language.sparqlas.impl.DataRangeImpl <em>Data Range</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see west.twouse.language.sparqlas.impl.DataRangeImpl
     * @see west.twouse.language.sparqlas.impl.SparqlmsPackageImpl#getDataRange()
     * @generated
     */
    EClass DATA_RANGE = eINSTANCE.getDataRange();

    /**
     * The meta object literal for the '{@link west.twouse.language.sparqlas.impl.DataUnionOfImpl <em>Data Union Of</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see west.twouse.language.sparqlas.impl.DataUnionOfImpl
     * @see west.twouse.language.sparqlas.impl.SparqlmsPackageImpl#getDataUnionOf()
     * @generated
     */
    EClass DATA_UNION_OF = eINSTANCE.getDataUnionOf();

    /**
     * The meta object literal for the '<em><b>Data Ranges</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DATA_UNION_OF__DATA_RANGES = eINSTANCE.getDataUnionOf_DataRanges();

    /**
     * The meta object literal for the '{@link west.twouse.language.sparqlas.impl.DataComplementOfImpl <em>Data Complement Of</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see west.twouse.language.sparqlas.impl.DataComplementOfImpl
     * @see west.twouse.language.sparqlas.impl.SparqlmsPackageImpl#getDataComplementOf()
     * @generated
     */
    EClass DATA_COMPLEMENT_OF = eINSTANCE.getDataComplementOf();

    /**
     * The meta object literal for the '<em><b>Data Range</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DATA_COMPLEMENT_OF__DATA_RANGE = eINSTANCE.getDataComplementOf_DataRange();

    /**
     * The meta object literal for the '{@link west.twouse.language.sparqlas.impl.DataOneOfImpl <em>Data One Of</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see west.twouse.language.sparqlas.impl.DataOneOfImpl
     * @see west.twouse.language.sparqlas.impl.SparqlmsPackageImpl#getDataOneOf()
     * @generated
     */
    EClass DATA_ONE_OF = eINSTANCE.getDataOneOf();

    /**
     * The meta object literal for the '<em><b>Literals</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DATA_ONE_OF__LITERALS = eINSTANCE.getDataOneOf_Literals();

    /**
     * The meta object literal for the '{@link west.twouse.language.sparqlas.impl.DataIntersectionOfImpl <em>Data Intersection Of</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see west.twouse.language.sparqlas.impl.DataIntersectionOfImpl
     * @see west.twouse.language.sparqlas.impl.SparqlmsPackageImpl#getDataIntersectionOf()
     * @generated
     */
    EClass DATA_INTERSECTION_OF = eINSTANCE.getDataIntersectionOf();

    /**
     * The meta object literal for the '<em><b>Data Ranges</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DATA_INTERSECTION_OF__DATA_RANGES = eINSTANCE.getDataIntersectionOf_DataRanges();

    /**
     * The meta object literal for the '{@link west.twouse.language.sparqlas.impl.DatatypeRestrictionImpl <em>Datatype Restriction</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see west.twouse.language.sparqlas.impl.DatatypeRestrictionImpl
     * @see west.twouse.language.sparqlas.impl.SparqlmsPackageImpl#getDatatypeRestriction()
     * @generated
     */
    EClass DATATYPE_RESTRICTION = eINSTANCE.getDatatypeRestriction();

    /**
     * The meta object literal for the '<em><b>Datatype</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DATATYPE_RESTRICTION__DATATYPE = eINSTANCE.getDatatypeRestriction_Datatype();

    /**
     * The meta object literal for the '<em><b>Restrictions</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DATATYPE_RESTRICTION__RESTRICTIONS = eINSTANCE.getDatatypeRestriction_Restrictions();

    /**
     * The meta object literal for the '{@link west.twouse.language.sparqlas.impl.FacetRestrictionImpl <em>Facet Restriction</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see west.twouse.language.sparqlas.impl.FacetRestrictionImpl
     * @see west.twouse.language.sparqlas.impl.SparqlmsPackageImpl#getFacetRestriction()
     * @generated
     */
    EClass FACET_RESTRICTION = eINSTANCE.getFacetRestriction();

    /**
     * The meta object literal for the '<em><b>Constraining Facet</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FACET_RESTRICTION__CONSTRAINING_FACET = eINSTANCE.getFacetRestriction_ConstrainingFacet();

    /**
     * The meta object literal for the '<em><b>Restriction Value</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FACET_RESTRICTION__RESTRICTION_VALUE = eINSTANCE.getFacetRestriction_RestrictionValue();

    /**
     * The meta object literal for the '{@link west.twouse.language.sparqlas.impl.ObjectPropertyAtomImpl <em>Object Property Atom</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see west.twouse.language.sparqlas.impl.ObjectPropertyAtomImpl
     * @see west.twouse.language.sparqlas.impl.SparqlmsPackageImpl#getObjectPropertyAtom()
     * @generated
     */
    EClass OBJECT_PROPERTY_ATOM = eINSTANCE.getObjectPropertyAtom();

    /**
     * The meta object literal for the '{@link west.twouse.language.sparqlas.impl.SubObjectPropertyOfImpl <em>Sub Object Property Of</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see west.twouse.language.sparqlas.impl.SubObjectPropertyOfImpl
     * @see west.twouse.language.sparqlas.impl.SparqlmsPackageImpl#getSubObjectPropertyOf()
     * @generated
     */
    EClass SUB_OBJECT_PROPERTY_OF = eINSTANCE.getSubObjectPropertyOf();

    /**
     * The meta object literal for the '<em><b>Sub Object Property Expression</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SUB_OBJECT_PROPERTY_OF__SUB_OBJECT_PROPERTY_EXPRESSION = eINSTANCE.getSubObjectPropertyOf_SubObjectPropertyExpression();

    /**
     * The meta object literal for the '<em><b>Sub Object Property Chain</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SUB_OBJECT_PROPERTY_OF__SUB_OBJECT_PROPERTY_CHAIN = eINSTANCE.getSubObjectPropertyOf_SubObjectPropertyChain();

    /**
     * The meta object literal for the '<em><b>Super Object Property Expression</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SUB_OBJECT_PROPERTY_OF__SUPER_OBJECT_PROPERTY_EXPRESSION = eINSTANCE.getSubObjectPropertyOf_SuperObjectPropertyExpression();

    /**
     * The meta object literal for the '{@link west.twouse.language.sparqlas.impl.ObjectPropertyChainImpl <em>Object Property Chain</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see west.twouse.language.sparqlas.impl.ObjectPropertyChainImpl
     * @see west.twouse.language.sparqlas.impl.SparqlmsPackageImpl#getObjectPropertyChain()
     * @generated
     */
    EClass OBJECT_PROPERTY_CHAIN = eINSTANCE.getObjectPropertyChain();

    /**
     * The meta object literal for the '<em><b>Object Property Expression</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference OBJECT_PROPERTY_CHAIN__OBJECT_PROPERTY_EXPRESSION = eINSTANCE.getObjectPropertyChain_ObjectPropertyExpression();

    /**
     * The meta object literal for the '{@link west.twouse.language.sparqlas.impl.EquivalentObjectPropertiesImpl <em>Equivalent Object Properties</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see west.twouse.language.sparqlas.impl.EquivalentObjectPropertiesImpl
     * @see west.twouse.language.sparqlas.impl.SparqlmsPackageImpl#getEquivalentObjectProperties()
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
     * The meta object literal for the '{@link west.twouse.language.sparqlas.impl.DisjointObjectPropertiesImpl <em>Disjoint Object Properties</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see west.twouse.language.sparqlas.impl.DisjointObjectPropertiesImpl
     * @see west.twouse.language.sparqlas.impl.SparqlmsPackageImpl#getDisjointObjectProperties()
     * @generated
     */
    EClass DISJOINT_OBJECT_PROPERTIES = eINSTANCE.getDisjointObjectProperties();

    /**
     * The meta object literal for the '<em><b>Object Property Expression</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DISJOINT_OBJECT_PROPERTIES__OBJECT_PROPERTY_EXPRESSION = eINSTANCE.getDisjointObjectProperties_ObjectPropertyExpression();

    /**
     * The meta object literal for the '{@link west.twouse.language.sparqlas.impl.ObjectPropertyDomainImpl <em>Object Property Domain</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see west.twouse.language.sparqlas.impl.ObjectPropertyDomainImpl
     * @see west.twouse.language.sparqlas.impl.SparqlmsPackageImpl#getObjectPropertyDomain()
     * @generated
     */
    EClass OBJECT_PROPERTY_DOMAIN = eINSTANCE.getObjectPropertyDomain();

    /**
     * The meta object literal for the '<em><b>Object Property Expression</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference OBJECT_PROPERTY_DOMAIN__OBJECT_PROPERTY_EXPRESSION = eINSTANCE.getObjectPropertyDomain_ObjectPropertyExpression();

    /**
     * The meta object literal for the '<em><b>Domain</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference OBJECT_PROPERTY_DOMAIN__DOMAIN = eINSTANCE.getObjectPropertyDomain_Domain();

    /**
     * The meta object literal for the '{@link west.twouse.language.sparqlas.impl.ObjectPropertyRangeImpl <em>Object Property Range</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see west.twouse.language.sparqlas.impl.ObjectPropertyRangeImpl
     * @see west.twouse.language.sparqlas.impl.SparqlmsPackageImpl#getObjectPropertyRange()
     * @generated
     */
    EClass OBJECT_PROPERTY_RANGE = eINSTANCE.getObjectPropertyRange();

    /**
     * The meta object literal for the '<em><b>Object Property Expression</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference OBJECT_PROPERTY_RANGE__OBJECT_PROPERTY_EXPRESSION = eINSTANCE.getObjectPropertyRange_ObjectPropertyExpression();

    /**
     * The meta object literal for the '<em><b>Range</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference OBJECT_PROPERTY_RANGE__RANGE = eINSTANCE.getObjectPropertyRange_Range();

    /**
     * The meta object literal for the '{@link west.twouse.language.sparqlas.impl.InverseObjectPropertyAtomImpl <em>Inverse Object Property Atom</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see west.twouse.language.sparqlas.impl.InverseObjectPropertyAtomImpl
     * @see west.twouse.language.sparqlas.impl.SparqlmsPackageImpl#getInverseObjectPropertyAtom()
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
     * The meta object literal for the '{@link west.twouse.language.sparqlas.impl.FunctionalObjectPropertyImpl <em>Functional Object Property</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see west.twouse.language.sparqlas.impl.FunctionalObjectPropertyImpl
     * @see west.twouse.language.sparqlas.impl.SparqlmsPackageImpl#getFunctionalObjectProperty()
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
     * The meta object literal for the '{@link west.twouse.language.sparqlas.impl.InverseFunctionalObjectPropertyImpl <em>Inverse Functional Object Property</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see west.twouse.language.sparqlas.impl.InverseFunctionalObjectPropertyImpl
     * @see west.twouse.language.sparqlas.impl.SparqlmsPackageImpl#getInverseFunctionalObjectProperty()
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
     * The meta object literal for the '{@link west.twouse.language.sparqlas.impl.ReflexiveObjectPropertyImpl <em>Reflexive Object Property</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see west.twouse.language.sparqlas.impl.ReflexiveObjectPropertyImpl
     * @see west.twouse.language.sparqlas.impl.SparqlmsPackageImpl#getReflexiveObjectProperty()
     * @generated
     */
    EClass REFLEXIVE_OBJECT_PROPERTY = eINSTANCE.getReflexiveObjectProperty();

    /**
     * The meta object literal for the '<em><b>Object Property Expression</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference REFLEXIVE_OBJECT_PROPERTY__OBJECT_PROPERTY_EXPRESSION = eINSTANCE.getReflexiveObjectProperty_ObjectPropertyExpression();

    /**
     * The meta object literal for the '{@link west.twouse.language.sparqlas.impl.IrreflexiveObjectPropertyImpl <em>Irreflexive Object Property</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see west.twouse.language.sparqlas.impl.IrreflexiveObjectPropertyImpl
     * @see west.twouse.language.sparqlas.impl.SparqlmsPackageImpl#getIrreflexiveObjectProperty()
     * @generated
     */
    EClass IRREFLEXIVE_OBJECT_PROPERTY = eINSTANCE.getIrreflexiveObjectProperty();

    /**
     * The meta object literal for the '<em><b>Object Property Expression</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference IRREFLEXIVE_OBJECT_PROPERTY__OBJECT_PROPERTY_EXPRESSION = eINSTANCE.getIrreflexiveObjectProperty_ObjectPropertyExpression();

    /**
     * The meta object literal for the '{@link west.twouse.language.sparqlas.impl.SymmetricObjectPropertyImpl <em>Symmetric Object Property</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see west.twouse.language.sparqlas.impl.SymmetricObjectPropertyImpl
     * @see west.twouse.language.sparqlas.impl.SparqlmsPackageImpl#getSymmetricObjectProperty()
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
     * The meta object literal for the '{@link west.twouse.language.sparqlas.impl.AsymmetricObjectPropertyImpl <em>Asymmetric Object Property</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see west.twouse.language.sparqlas.impl.AsymmetricObjectPropertyImpl
     * @see west.twouse.language.sparqlas.impl.SparqlmsPackageImpl#getAsymmetricObjectProperty()
     * @generated
     */
    EClass ASYMMETRIC_OBJECT_PROPERTY = eINSTANCE.getAsymmetricObjectProperty();

    /**
     * The meta object literal for the '<em><b>Object Property Expression</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ASYMMETRIC_OBJECT_PROPERTY__OBJECT_PROPERTY_EXPRESSION = eINSTANCE.getAsymmetricObjectProperty_ObjectPropertyExpression();

    /**
     * The meta object literal for the '{@link west.twouse.language.sparqlas.impl.TransitiveObjectPropertyImpl <em>Transitive Object Property</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see west.twouse.language.sparqlas.impl.TransitiveObjectPropertyImpl
     * @see west.twouse.language.sparqlas.impl.SparqlmsPackageImpl#getTransitiveObjectProperty()
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
     * The meta object literal for the '{@link west.twouse.language.sparqlas.impl.ObjectPropertyExpressionImpl <em>Object Property Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see west.twouse.language.sparqlas.impl.ObjectPropertyExpressionImpl
     * @see west.twouse.language.sparqlas.impl.SparqlmsPackageImpl#getObjectPropertyExpression()
     * @generated
     */
    EClass OBJECT_PROPERTY_EXPRESSION = eINSTANCE.getObjectPropertyExpression();

    /**
     * The meta object literal for the '{@link west.twouse.language.sparqlas.impl.InverseObjectPropertyImpl <em>Inverse Object Property</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see west.twouse.language.sparqlas.impl.InverseObjectPropertyImpl
     * @see west.twouse.language.sparqlas.impl.SparqlmsPackageImpl#getInverseObjectProperty()
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
     * The meta object literal for the '{@link west.twouse.language.sparqlas.impl.DataPropertyAtomImpl <em>Data Property Atom</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see west.twouse.language.sparqlas.impl.DataPropertyAtomImpl
     * @see west.twouse.language.sparqlas.impl.SparqlmsPackageImpl#getDataPropertyAtom()
     * @generated
     */
    EClass DATA_PROPERTY_ATOM = eINSTANCE.getDataPropertyAtom();

    /**
     * The meta object literal for the '{@link west.twouse.language.sparqlas.impl.SubDataPropertyOfImpl <em>Sub Data Property Of</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see west.twouse.language.sparqlas.impl.SubDataPropertyOfImpl
     * @see west.twouse.language.sparqlas.impl.SparqlmsPackageImpl#getSubDataPropertyOf()
     * @generated
     */
    EClass SUB_DATA_PROPERTY_OF = eINSTANCE.getSubDataPropertyOf();

    /**
     * The meta object literal for the '<em><b>Sub Data Property Expression</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SUB_DATA_PROPERTY_OF__SUB_DATA_PROPERTY_EXPRESSION = eINSTANCE.getSubDataPropertyOf_SubDataPropertyExpression();

    /**
     * The meta object literal for the '<em><b>Super Data Property Expression</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SUB_DATA_PROPERTY_OF__SUPER_DATA_PROPERTY_EXPRESSION = eINSTANCE.getSubDataPropertyOf_SuperDataPropertyExpression();

    /**
     * The meta object literal for the '{@link west.twouse.language.sparqlas.impl.EquivalentDataPropertiesImpl <em>Equivalent Data Properties</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see west.twouse.language.sparqlas.impl.EquivalentDataPropertiesImpl
     * @see west.twouse.language.sparqlas.impl.SparqlmsPackageImpl#getEquivalentDataProperties()
     * @generated
     */
    EClass EQUIVALENT_DATA_PROPERTIES = eINSTANCE.getEquivalentDataProperties();

    /**
     * The meta object literal for the '<em><b>Data Property Expression</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EQUIVALENT_DATA_PROPERTIES__DATA_PROPERTY_EXPRESSION = eINSTANCE.getEquivalentDataProperties_DataPropertyExpression();

    /**
     * The meta object literal for the '{@link west.twouse.language.sparqlas.impl.DisjointDataPropertiesImpl <em>Disjoint Data Properties</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see west.twouse.language.sparqlas.impl.DisjointDataPropertiesImpl
     * @see west.twouse.language.sparqlas.impl.SparqlmsPackageImpl#getDisjointDataProperties()
     * @generated
     */
    EClass DISJOINT_DATA_PROPERTIES = eINSTANCE.getDisjointDataProperties();

    /**
     * The meta object literal for the '<em><b>Data Property Expression</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DISJOINT_DATA_PROPERTIES__DATA_PROPERTY_EXPRESSION = eINSTANCE.getDisjointDataProperties_DataPropertyExpression();

    /**
     * The meta object literal for the '{@link west.twouse.language.sparqlas.impl.DataPropertyDomainImpl <em>Data Property Domain</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see west.twouse.language.sparqlas.impl.DataPropertyDomainImpl
     * @see west.twouse.language.sparqlas.impl.SparqlmsPackageImpl#getDataPropertyDomain()
     * @generated
     */
    EClass DATA_PROPERTY_DOMAIN = eINSTANCE.getDataPropertyDomain();

    /**
     * The meta object literal for the '<em><b>Data Property Expression</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DATA_PROPERTY_DOMAIN__DATA_PROPERTY_EXPRESSION = eINSTANCE.getDataPropertyDomain_DataPropertyExpression();

    /**
     * The meta object literal for the '<em><b>Domain</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DATA_PROPERTY_DOMAIN__DOMAIN = eINSTANCE.getDataPropertyDomain_Domain();

    /**
     * The meta object literal for the '{@link west.twouse.language.sparqlas.impl.DataPropertyRangeImpl <em>Data Property Range</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see west.twouse.language.sparqlas.impl.DataPropertyRangeImpl
     * @see west.twouse.language.sparqlas.impl.SparqlmsPackageImpl#getDataPropertyRange()
     * @generated
     */
    EClass DATA_PROPERTY_RANGE = eINSTANCE.getDataPropertyRange();

    /**
     * The meta object literal for the '<em><b>Data Property Expression</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DATA_PROPERTY_RANGE__DATA_PROPERTY_EXPRESSION = eINSTANCE.getDataPropertyRange_DataPropertyExpression();

    /**
     * The meta object literal for the '<em><b>Range</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DATA_PROPERTY_RANGE__RANGE = eINSTANCE.getDataPropertyRange_Range();

    /**
     * The meta object literal for the '{@link west.twouse.language.sparqlas.impl.FunctionalDataPropertyImpl <em>Functional Data Property</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see west.twouse.language.sparqlas.impl.FunctionalDataPropertyImpl
     * @see west.twouse.language.sparqlas.impl.SparqlmsPackageImpl#getFunctionalDataProperty()
     * @generated
     */
    EClass FUNCTIONAL_DATA_PROPERTY = eINSTANCE.getFunctionalDataProperty();

    /**
     * The meta object literal for the '<em><b>Data Property Expression</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FUNCTIONAL_DATA_PROPERTY__DATA_PROPERTY_EXPRESSION = eINSTANCE.getFunctionalDataProperty_DataPropertyExpression();

    /**
     * The meta object literal for the '{@link west.twouse.language.sparqlas.impl.DataPropertyExpressionImpl <em>Data Property Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see west.twouse.language.sparqlas.impl.DataPropertyExpressionImpl
     * @see west.twouse.language.sparqlas.impl.SparqlmsPackageImpl#getDataPropertyExpression()
     * @generated
     */
    EClass DATA_PROPERTY_EXPRESSION = eINSTANCE.getDataPropertyExpression();

    /**
     * The meta object literal for the '{@link west.twouse.language.sparqlas.impl.HasKeyImpl <em>Has Key</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see west.twouse.language.sparqlas.impl.HasKeyImpl
     * @see west.twouse.language.sparqlas.impl.SparqlmsPackageImpl#getHasKey()
     * @generated
     */
    EClass HAS_KEY = eINSTANCE.getHasKey();

    /**
     * The meta object literal for the '<em><b>Class Expression</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference HAS_KEY__CLASS_EXPRESSION = eINSTANCE.getHasKey_ClassExpression();

    /**
     * The meta object literal for the '<em><b>Object Property Expression</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference HAS_KEY__OBJECT_PROPERTY_EXPRESSION = eINSTANCE.getHasKey_ObjectPropertyExpression();

    /**
     * The meta object literal for the '<em><b>Data Property Expression</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference HAS_KEY__DATA_PROPERTY_EXPRESSION = eINSTANCE.getHasKey_DataPropertyExpression();

    /**
     * The meta object literal for the '{@link west.twouse.language.sparqlas.impl.DeclarationImpl <em>Declaration</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see west.twouse.language.sparqlas.impl.DeclarationImpl
     * @see west.twouse.language.sparqlas.impl.SparqlmsPackageImpl#getDeclaration()
     * @generated
     */
    EClass DECLARATION = eINSTANCE.getDeclaration();

    /**
     * The meta object literal for the '{@link west.twouse.language.sparqlas.impl.ClassDeclarationImpl <em>Class Declaration</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see west.twouse.language.sparqlas.impl.ClassDeclarationImpl
     * @see west.twouse.language.sparqlas.impl.SparqlmsPackageImpl#getClassDeclaration()
     * @generated
     */
    EClass CLASS_DECLARATION = eINSTANCE.getClassDeclaration();

    /**
     * The meta object literal for the '<em><b>Class</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CLASS_DECLARATION__CLASS = eINSTANCE.getClassDeclaration_Class();

    /**
     * The meta object literal for the '<em><b>Class Variable</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CLASS_DECLARATION__CLASS_VARIABLE = eINSTANCE.getClassDeclaration_ClassVariable();

    /**
     * The meta object literal for the '{@link west.twouse.language.sparqlas.impl.ObjectPropertyDeclarationImpl <em>Object Property Declaration</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see west.twouse.language.sparqlas.impl.ObjectPropertyDeclarationImpl
     * @see west.twouse.language.sparqlas.impl.SparqlmsPackageImpl#getObjectPropertyDeclaration()
     * @generated
     */
    EClass OBJECT_PROPERTY_DECLARATION = eINSTANCE.getObjectPropertyDeclaration();

    /**
     * The meta object literal for the '<em><b>Object Property</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference OBJECT_PROPERTY_DECLARATION__OBJECT_PROPERTY = eINSTANCE.getObjectPropertyDeclaration_ObjectProperty();

    /**
     * The meta object literal for the '<em><b>Object Property Variable</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference OBJECT_PROPERTY_DECLARATION__OBJECT_PROPERTY_VARIABLE = eINSTANCE.getObjectPropertyDeclaration_ObjectPropertyVariable();

    /**
     * The meta object literal for the '{@link west.twouse.language.sparqlas.impl.DatatypePropertyDeclarationImpl <em>Datatype Property Declaration</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see west.twouse.language.sparqlas.impl.DatatypePropertyDeclarationImpl
     * @see west.twouse.language.sparqlas.impl.SparqlmsPackageImpl#getDatatypePropertyDeclaration()
     * @generated
     */
    EClass DATATYPE_PROPERTY_DECLARATION = eINSTANCE.getDatatypePropertyDeclaration();

    /**
     * The meta object literal for the '<em><b>Datatype Property</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DATATYPE_PROPERTY_DECLARATION__DATATYPE_PROPERTY = eINSTANCE.getDatatypePropertyDeclaration_DatatypeProperty();

    /**
     * The meta object literal for the '<em><b>Datatype Property Variable</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DATATYPE_PROPERTY_DECLARATION__DATATYPE_PROPERTY_VARIABLE = eINSTANCE.getDatatypePropertyDeclaration_DatatypePropertyVariable();

    /**
     * The meta object literal for the '{@link west.twouse.language.sparqlas.impl.IndividualDeclarationImpl <em>Individual Declaration</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see west.twouse.language.sparqlas.impl.IndividualDeclarationImpl
     * @see west.twouse.language.sparqlas.impl.SparqlmsPackageImpl#getIndividualDeclaration()
     * @generated
     */
    EClass INDIVIDUAL_DECLARATION = eINSTANCE.getIndividualDeclaration();

    /**
     * The meta object literal for the '<em><b>Individual</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference INDIVIDUAL_DECLARATION__INDIVIDUAL = eINSTANCE.getIndividualDeclaration_Individual();

    /**
     * The meta object literal for the '<em><b>Individual Variable</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference INDIVIDUAL_DECLARATION__INDIVIDUAL_VARIABLE = eINSTANCE.getIndividualDeclaration_IndividualVariable();

    /**
     * The meta object literal for the '{@link west.twouse.language.sparqlas.impl.TemplateParameterImpl <em>Template Parameter</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see west.twouse.language.sparqlas.impl.TemplateParameterImpl
     * @see west.twouse.language.sparqlas.impl.SparqlmsPackageImpl#getTemplateParameter()
     * @generated
     */
    EClass TEMPLATE_PARAMETER = eINSTANCE.getTemplateParameter();

    /**
     * The meta object literal for the '<em><b>Signature</b></em>' container reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TEMPLATE_PARAMETER__SIGNATURE = eINSTANCE.getTemplateParameter_Signature();

    /**
     * The meta object literal for the '<em><b>Parametered Element</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TEMPLATE_PARAMETER__PARAMETERED_ELEMENT = eINSTANCE.getTemplateParameter_ParameteredElement();

    /**
     * The meta object literal for the '<em><b>Parameter Substitution</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TEMPLATE_PARAMETER__PARAMETER_SUBSTITUTION = eINSTANCE.getTemplateParameter_ParameterSubstitution();

    /**
     * The meta object literal for the '{@link west.twouse.language.sparqlas.impl.ParameterableElementImpl <em>Parameterable Element</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see west.twouse.language.sparqlas.impl.ParameterableElementImpl
     * @see west.twouse.language.sparqlas.impl.SparqlmsPackageImpl#getParameterableElement()
     * @generated
     */
    EClass PARAMETERABLE_ELEMENT = eINSTANCE.getParameterableElement();

    /**
     * The meta object literal for the '<em><b>Template Parameter</b></em>' container reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PARAMETERABLE_ELEMENT__TEMPLATE_PARAMETER = eINSTANCE.getParameterableElement_TemplateParameter();

    /**
     * The meta object literal for the '{@link west.twouse.language.sparqlas.impl.TemplateSignatureImpl <em>Template Signature</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see west.twouse.language.sparqlas.impl.TemplateSignatureImpl
     * @see west.twouse.language.sparqlas.impl.SparqlmsPackageImpl#getTemplateSignature()
     * @generated
     */
    EClass TEMPLATE_SIGNATURE = eINSTANCE.getTemplateSignature();

    /**
     * The meta object literal for the '<em><b>Owned Parameter</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TEMPLATE_SIGNATURE__OWNED_PARAMETER = eINSTANCE.getTemplateSignature_OwnedParameter();

    /**
     * The meta object literal for the '<em><b>Template</b></em>' container reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TEMPLATE_SIGNATURE__TEMPLATE = eINSTANCE.getTemplateSignature_Template();

    /**
     * The meta object literal for the '{@link west.twouse.language.sparqlas.impl.TemplateableElementImpl <em>Templateable Element</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see west.twouse.language.sparqlas.impl.TemplateableElementImpl
     * @see west.twouse.language.sparqlas.impl.SparqlmsPackageImpl#getTemplateableElement()
     * @generated
     */
    EClass TEMPLATEABLE_ELEMENT = eINSTANCE.getTemplateableElement();

    /**
     * The meta object literal for the '<em><b>Owned Template Signature</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TEMPLATEABLE_ELEMENT__OWNED_TEMPLATE_SIGNATURE = eINSTANCE.getTemplateableElement_OwnedTemplateSignature();

    /**
     * The meta object literal for the '<em><b>Template Binding</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TEMPLATEABLE_ELEMENT__TEMPLATE_BINDING = eINSTANCE.getTemplateableElement_TemplateBinding();

    /**
     * The meta object literal for the '{@link west.twouse.language.sparqlas.impl.TemplateParameterSubstitutionImpl <em>Template Parameter Substitution</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see west.twouse.language.sparqlas.impl.TemplateParameterSubstitutionImpl
     * @see west.twouse.language.sparqlas.impl.SparqlmsPackageImpl#getTemplateParameterSubstitution()
     * @generated
     */
    EClass TEMPLATE_PARAMETER_SUBSTITUTION = eINSTANCE.getTemplateParameterSubstitution();

    /**
     * The meta object literal for the '<em><b>Actual</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TEMPLATE_PARAMETER_SUBSTITUTION__ACTUAL = eINSTANCE.getTemplateParameterSubstitution_Actual();

    /**
     * The meta object literal for the '<em><b>Template Binding</b></em>' container reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TEMPLATE_PARAMETER_SUBSTITUTION__TEMPLATE_BINDING = eINSTANCE.getTemplateParameterSubstitution_TemplateBinding();

    /**
     * The meta object literal for the '<em><b>Formal</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TEMPLATE_PARAMETER_SUBSTITUTION__FORMAL = eINSTANCE.getTemplateParameterSubstitution_Formal();

    /**
     * The meta object literal for the '{@link west.twouse.language.sparqlas.impl.TemplateBindingImpl <em>Template Binding</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see west.twouse.language.sparqlas.impl.TemplateBindingImpl
     * @see west.twouse.language.sparqlas.impl.SparqlmsPackageImpl#getTemplateBinding()
     * @generated
     */
    EClass TEMPLATE_BINDING = eINSTANCE.getTemplateBinding();

    /**
     * The meta object literal for the '<em><b>Parameter Substitution</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TEMPLATE_BINDING__PARAMETER_SUBSTITUTION = eINSTANCE.getTemplateBinding_ParameterSubstitution();

    /**
     * The meta object literal for the '<em><b>Bound Element</b></em>' container reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TEMPLATE_BINDING__BOUND_ELEMENT = eINSTANCE.getTemplateBinding_BoundElement();

    /**
     * The meta object literal for the '<em><b>Signature</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TEMPLATE_BINDING__SIGNATURE = eINSTANCE.getTemplateBinding_Signature();

    /**
     * The meta object literal for the '{@link west.twouse.language.sparqlas.impl.DirectClassAssertionImpl <em>Direct Class Assertion</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see west.twouse.language.sparqlas.impl.DirectClassAssertionImpl
     * @see west.twouse.language.sparqlas.impl.SparqlmsPackageImpl#getDirectClassAssertion()
     * @generated
     */
    EClass DIRECT_CLASS_ASSERTION = eINSTANCE.getDirectClassAssertion();

    /**
     * The meta object literal for the '<em><b>Individual</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DIRECT_CLASS_ASSERTION__INDIVIDUAL = eINSTANCE.getDirectClassAssertion_Individual();

    /**
     * The meta object literal for the '<em><b>Class Expression</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DIRECT_CLASS_ASSERTION__CLASS_EXPRESSION = eINSTANCE.getDirectClassAssertion_ClassExpression();

    /**
     * The meta object literal for the '{@link west.twouse.language.sparqlas.impl.DirectSubClassOfImpl <em>Direct Sub Class Of</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see west.twouse.language.sparqlas.impl.DirectSubClassOfImpl
     * @see west.twouse.language.sparqlas.impl.SparqlmsPackageImpl#getDirectSubClassOf()
     * @generated
     */
    EClass DIRECT_SUB_CLASS_OF = eINSTANCE.getDirectSubClassOf();

    /**
     * The meta object literal for the '<em><b>Sub Class Expression</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DIRECT_SUB_CLASS_OF__SUB_CLASS_EXPRESSION = eINSTANCE.getDirectSubClassOf_SubClassExpression();

    /**
     * The meta object literal for the '<em><b>Super Class Expression</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DIRECT_SUB_CLASS_OF__SUPER_CLASS_EXPRESSION = eINSTANCE.getDirectSubClassOf_SuperClassExpression();

    /**
     * The meta object literal for the '{@link west.twouse.language.sparqlas.impl.StrictSubClassOfImpl <em>Strict Sub Class Of</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see west.twouse.language.sparqlas.impl.StrictSubClassOfImpl
     * @see west.twouse.language.sparqlas.impl.SparqlmsPackageImpl#getStrictSubClassOf()
     * @generated
     */
    EClass STRICT_SUB_CLASS_OF = eINSTANCE.getStrictSubClassOf();

    /**
     * The meta object literal for the '<em><b>Sub Class Expression</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference STRICT_SUB_CLASS_OF__SUB_CLASS_EXPRESSION = eINSTANCE.getStrictSubClassOf_SubClassExpression();

    /**
     * The meta object literal for the '<em><b>Super Class Expression</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference STRICT_SUB_CLASS_OF__SUPER_CLASS_EXPRESSION = eINSTANCE.getStrictSubClassOf_SuperClassExpression();

  }

} //SparqlmsPackage
