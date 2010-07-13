/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package west.twouse.language.owl2fs.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import west.twouse.language.owl2fs.AbbreviatedIRI;
import west.twouse.language.owl2fs.Annotation;
import west.twouse.language.owl2fs.AnnotationAssertion;
import west.twouse.language.owl2fs.AnnotationAxiom;
import west.twouse.language.owl2fs.AnnotationProperty;
import west.twouse.language.owl2fs.AnnotationPropertyDeclaration;
import west.twouse.language.owl2fs.AnnotationPropertyDomain;
import west.twouse.language.owl2fs.AnnotationPropertyRange;
import west.twouse.language.owl2fs.AnnotationSubject;
import west.twouse.language.owl2fs.AnnotationValue;
import west.twouse.language.owl2fs.AnonymousIndividual;
import west.twouse.language.owl2fs.Assertion;
import west.twouse.language.owl2fs.AsymmetricObjectProperty;
import west.twouse.language.owl2fs.Atom;
import west.twouse.language.owl2fs.Axiom;
import west.twouse.language.owl2fs.BuiltInAtom;
import west.twouse.language.owl2fs.ClassAssertion;
import west.twouse.language.owl2fs.ClassAtom;
import west.twouse.language.owl2fs.ClassAxiom;
import west.twouse.language.owl2fs.ClassDeclaration;
import west.twouse.language.owl2fs.ClassExpression;
import west.twouse.language.owl2fs.ClassifierTemplateParameter;
import west.twouse.language.owl2fs.Comment;
import west.twouse.language.owl2fs.DArg;
import west.twouse.language.owl2fs.DGAtom;
import west.twouse.language.owl2fs.DGAxiom;
import west.twouse.language.owl2fs.DGEdges;
import west.twouse.language.owl2fs.DGNodes;
import west.twouse.language.owl2fs.DGRule;
import west.twouse.language.owl2fs.DLSafeRule;
import west.twouse.language.owl2fs.DataAllValuesFrom;
import west.twouse.language.owl2fs.DataComplementOf;
import west.twouse.language.owl2fs.DataExactCardinality;
import west.twouse.language.owl2fs.DataHasValue;
import west.twouse.language.owl2fs.DataIntersectionOf;
import west.twouse.language.owl2fs.DataMaxCardinality;
import west.twouse.language.owl2fs.DataMinCardinality;
import west.twouse.language.owl2fs.DataOneOf;
import west.twouse.language.owl2fs.DataProperty;
import west.twouse.language.owl2fs.DataPropertyAssertion;
import west.twouse.language.owl2fs.DataPropertyAxiom;
import west.twouse.language.owl2fs.DataPropertyDeclaration;
import west.twouse.language.owl2fs.DataPropertyDomain;
import west.twouse.language.owl2fs.DataPropertyExpression;
import west.twouse.language.owl2fs.DataPropertyRange;
import west.twouse.language.owl2fs.DataPropetyAtom;
import west.twouse.language.owl2fs.DataRange;
import west.twouse.language.owl2fs.DataRangeAtom;
import west.twouse.language.owl2fs.DataSomeValuesFrom;
import west.twouse.language.owl2fs.DataUnionOf;
import west.twouse.language.owl2fs.Datatype;
import west.twouse.language.owl2fs.DatatypeDeclaration;
import west.twouse.language.owl2fs.DatatypeDefinition;
import west.twouse.language.owl2fs.DatatypeRestriction;
import west.twouse.language.owl2fs.Declaration;
import west.twouse.language.owl2fs.DifferentIndividuals;
import west.twouse.language.owl2fs.DifferentIndividualsAtom;
import west.twouse.language.owl2fs.DisjointClasses;
import west.twouse.language.owl2fs.DisjointDataProperties;
import west.twouse.language.owl2fs.DisjointObjectProperties;
import west.twouse.language.owl2fs.DisjointUnion;
import west.twouse.language.owl2fs.EdgeAssertion;
import west.twouse.language.owl2fs.Entity;
import west.twouse.language.owl2fs.EquivalentClasses;
import west.twouse.language.owl2fs.EquivalentDataProperties;
import west.twouse.language.owl2fs.EquivalentObjectProperties;
import west.twouse.language.owl2fs.Expression;
import west.twouse.language.owl2fs.FacetConstraintPair;
import west.twouse.language.owl2fs.FullIRI;
import west.twouse.language.owl2fs.FunctionalDataProperty;
import west.twouse.language.owl2fs.FunctionalObjectProperty;
import west.twouse.language.owl2fs.HasKey;
import west.twouse.language.owl2fs.IArg;
import west.twouse.language.owl2fs.Individual;
import west.twouse.language.owl2fs.InverseFunctionalObjectProperty;
import west.twouse.language.owl2fs.InverseObjectProperties;
import west.twouse.language.owl2fs.InverseObjectProperty;
import west.twouse.language.owl2fs.IrreflexiveObjectProperty;
import west.twouse.language.owl2fs.Literal;
import west.twouse.language.owl2fs.MainClasses;
import west.twouse.language.owl2fs.NamedIndividual;
import west.twouse.language.owl2fs.NamedIndividualDeclaration;
import west.twouse.language.owl2fs.NegativeDataPropertyAssertion;
import west.twouse.language.owl2fs.NegativeObjectPropertyAssertion;
import west.twouse.language.owl2fs.NodeAssertion;
import west.twouse.language.owl2fs.ObjectAllValuesFrom;
import west.twouse.language.owl2fs.ObjectComplementOf;
import west.twouse.language.owl2fs.ObjectExactCardinality;
import west.twouse.language.owl2fs.ObjectHasSelf;
import west.twouse.language.owl2fs.ObjectHasValue;
import west.twouse.language.owl2fs.ObjectIntersectionOf;
import west.twouse.language.owl2fs.ObjectMaxCardinality;
import west.twouse.language.owl2fs.ObjectMinCardinality;
import west.twouse.language.owl2fs.ObjectOneOf;
import west.twouse.language.owl2fs.ObjectProperty;
import west.twouse.language.owl2fs.ObjectPropertyAssertion;
import west.twouse.language.owl2fs.ObjectPropertyAtom;
import west.twouse.language.owl2fs.ObjectPropertyAxiom;
import west.twouse.language.owl2fs.ObjectPropertyChain;
import west.twouse.language.owl2fs.ObjectPropertyDeclaration;
import west.twouse.language.owl2fs.ObjectPropertyDomain;
import west.twouse.language.owl2fs.ObjectPropertyExpression;
import west.twouse.language.owl2fs.ObjectPropertyRange;
import west.twouse.language.owl2fs.ObjectSomeValuesFrom;
import west.twouse.language.owl2fs.ObjectUnionOf;
import west.twouse.language.owl2fs.Ontology;
import west.twouse.language.owl2fs.OntologyDocument;
import west.twouse.language.owl2fs.Owl2fsFactory;
import west.twouse.language.owl2fs.Owl2fsPackage;
import west.twouse.language.owl2fs.ParameterableElement;
import west.twouse.language.owl2fs.PrefixDefinition;
import west.twouse.language.owl2fs.ReflexiveObjectProperty;
import west.twouse.language.owl2fs.Rule;
import west.twouse.language.owl2fs.SameIndividual;
import west.twouse.language.owl2fs.SameIndividualAtom;
import west.twouse.language.owl2fs.SubAnnotationPropertyOf;
import west.twouse.language.owl2fs.SubClassOf;
import west.twouse.language.owl2fs.SubDataPropertyOf;
import west.twouse.language.owl2fs.SubObjectPropertyExpression;
import west.twouse.language.owl2fs.SubObjectPropertyOf;
import west.twouse.language.owl2fs.SymmetricObjectProperty;
import west.twouse.language.owl2fs.TemplateBinding;
import west.twouse.language.owl2fs.TemplateParameter;
import west.twouse.language.owl2fs.TemplateParameterSubstitution;
import west.twouse.language.owl2fs.TemplateSignature;
import west.twouse.language.owl2fs.TemplateableElement;
import west.twouse.language.owl2fs.TransitiveObjectProperty;
import west.twouse.language.owl2fs.Variable;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class Owl2fsPackageImpl extends EPackageImpl implements Owl2fsPackage
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass iriEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass fullIRIEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass abbreviatedIRIEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass ontologyDocumentEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass prefixDefinitionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass ontologyEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass axiomEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass commentEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass declarationEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass classDeclarationEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass datatypeDeclarationEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass objectPropertyDeclarationEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass dataPropertyDeclarationEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass annotationPropertyDeclarationEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass namedIndividualDeclarationEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass entityEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass annotationSubjectEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass annotationValueEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass annotationEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass annotationAxiomEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass annotationAssertionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass subAnnotationPropertyOfEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass annotationPropertyDomainEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass annotationPropertyRangeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass annotationPropertyEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass classEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass dataPropertyEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass datatypeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass objectPropertyEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass individualEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass namedIndividualEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass anonymousIndividualEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass literalEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass objectPropertyExpressionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass inverseObjectPropertyEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass dataPropertyExpressionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass dataRangeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass dataIntersectionOfEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass dataUnionOfEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass dataComplementOfEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass dataOneOfEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass datatypeRestrictionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass facetConstraintPairEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass classExpressionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass objectIntersectionOfEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass objectUnionOfEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass objectComplementOfEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass objectOneOfEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass objectSomeValuesFromEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass objectAllValuesFromEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass objectHasSelfEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass objectHasValueEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass objectMinCardinalityEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass objectMaxCardinalityEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass objectExactCardinalityEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass dataSomeValuesFromEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass dataAllValuesFromEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass dataHasValueEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass dataMinCardinalityEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass dataMaxCardinalityEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass dataExactCardinalityEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass classAxiomEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass subClassOfEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass equivalentClassesEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass disjointClassesEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass disjointUnionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass objectPropertyAxiomEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass subObjectPropertyOfEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass subObjectPropertyExpressionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass objectPropertyChainEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass equivalentObjectPropertiesEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass disjointObjectPropertiesEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass objectPropertyDomainEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass objectPropertyRangeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass inverseObjectPropertiesEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass functionalObjectPropertyEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass inverseFunctionalObjectPropertyEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass reflexiveObjectPropertyEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass irreflexiveObjectPropertyEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass symmetricObjectPropertyEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass asymmetricObjectPropertyEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass transitiveObjectPropertyEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass dataPropertyAxiomEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass subDataPropertyOfEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass equivalentDataPropertiesEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass disjointDataPropertiesEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass dataPropertyDomainEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass dataPropertyRangeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass functionalDataPropertyEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass datatypeDefinitionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass hasKeyEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass assertionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass sameIndividualEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass differentIndividualsEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass classAssertionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass objectPropertyAssertionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass negativeObjectPropertyAssertionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass dataPropertyAssertionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass negativeDataPropertyAssertionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass ruleEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass dlSafeRuleEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass atomEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass classAtomEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass dataRangeAtomEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass objectPropertyAtomEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass dataPropetyAtomEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass builtInAtomEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass sameIndividualAtomEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass differentIndividualsAtomEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass iArgEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass dArgEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass variableEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass dgRuleEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass dgAtomEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass dgAxiomEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass dgNodesEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass nodeAssertionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass dgEdgesEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass edgeAssertionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass mainClassesEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass expressionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass templateParameterEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass parameterableElementEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass templateSignatureEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass templateableElementEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass packageEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass classifierTemplateParameterEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass templateParameterSubstitutionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass templateBindingEClass = null;

  /**
   * Creates an instance of the model <b>Package</b>, registered with
   * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
   * package URI value.
   * <p>Note: the correct way to create the package is via the static
   * factory method {@link #init init()}, which also performs
   * initialization of the package, or returns the registered package,
   * if one already exists.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.emf.ecore.EPackage.Registry
   * @see west.twouse.language.owl2fs.Owl2fsPackage#eNS_URI
   * @see #init()
   * @generated
   */
  private Owl2fsPackageImpl()
  {
    super(eNS_URI, Owl2fsFactory.eINSTANCE);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private static boolean isInited = false;

  /**
   * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
   * 
   * <p>This method is used to initialize {@link Owl2fsPackage#eINSTANCE} when that field is accessed.
   * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #eNS_URI
   * @see #createPackageContents()
   * @see #initializePackageContents()
   * @generated
   */
  public static Owl2fsPackage init()
  {
    if (isInited) return (Owl2fsPackage)EPackage.Registry.INSTANCE.getEPackage(Owl2fsPackage.eNS_URI);

    // Obtain or create and register package
    Owl2fsPackageImpl theOwl2fsPackage = (Owl2fsPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof Owl2fsPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new Owl2fsPackageImpl());

    isInited = true;

    // Create package meta-data objects
    theOwl2fsPackage.createPackageContents();

    // Initialize created meta-data
    theOwl2fsPackage.initializePackageContents();

    // Mark meta-data to indicate it can't be changed
    theOwl2fsPackage.freeze();

  
    // Update the registry and return the package
    EPackage.Registry.INSTANCE.put(Owl2fsPackage.eNS_URI, theOwl2fsPackage);
    return theOwl2fsPackage;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getIRI()
  {
    return iriEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getIRI_Value()
  {
    return (EAttribute)iriEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getFullIRI()
  {
    return fullIRIEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getAbbreviatedIRI()
  {
    return abbreviatedIRIEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getAbbreviatedIRI_Prefix()
  {
    return (EAttribute)abbreviatedIRIEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getOntologyDocument()
  {
    return ontologyDocumentEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getOntologyDocument_Ontology()
  {
    return (EReference)ontologyDocumentEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getOntologyDocument_PrefixDefinition()
  {
    return (EReference)ontologyDocumentEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getOntologyDocument_Comment()
  {
    return (EReference)ontologyDocumentEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getPrefixDefinition()
  {
    return prefixDefinitionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getPrefixDefinition_Pref()
  {
    return (EAttribute)prefixDefinitionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getPrefixDefinition_Namespace()
  {
    return (EReference)prefixDefinitionEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getOntology()
  {
    return ontologyEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getOntology_Expressions()
  {
    return (EReference)ontologyEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getOntology_Packages()
  {
    return (EReference)ontologyEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getOntology_Comment()
  {
    return (EReference)ontologyEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getOntology_OntologyIRI()
  {
    return (EReference)ontologyEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getOntology_VersionIRI()
  {
    return (EReference)ontologyEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getOntology_DirectlyImportsDocuments()
  {
    return (EReference)ontologyEClass.getEStructuralFeatures().get(5);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getOntology_OntologyAnnotations()
  {
    return (EReference)ontologyEClass.getEStructuralFeatures().get(6);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getOntology_Axioms()
  {
    return (EReference)ontologyEClass.getEStructuralFeatures().get(7);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getAxiom()
  {
    return axiomEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getComment()
  {
    return commentEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getComment_Comment()
  {
    return (EAttribute)commentEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getDeclaration()
  {
    return declarationEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDeclaration_Entity()
  {
    return (EReference)declarationEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getClassDeclaration()
  {
    return classDeclarationEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getDatatypeDeclaration()
  {
    return datatypeDeclarationEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getObjectPropertyDeclaration()
  {
    return objectPropertyDeclarationEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getDataPropertyDeclaration()
  {
    return dataPropertyDeclarationEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getAnnotationPropertyDeclaration()
  {
    return annotationPropertyDeclarationEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getNamedIndividualDeclaration()
  {
    return namedIndividualDeclarationEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getEntity()
  {
    return entityEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getEntity_EntityIRI()
  {
    return (EReference)entityEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getAnnotationSubject()
  {
    return annotationSubjectEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getAnnotationValue()
  {
    return annotationValueEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getAnnotation()
  {
    return annotationEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getAnnotation_AnnotationAnnotations()
  {
    return (EReference)annotationEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getAnnotation_AnnotationProperty()
  {
    return (EReference)annotationEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getAnnotation_AnnotationValue()
  {
    return (EReference)annotationEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getAnnotationAxiom()
  {
    return annotationAxiomEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getAnnotationAxiom_AxiomAnnotations()
  {
    return (EReference)annotationAxiomEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getAnnotationAssertion()
  {
    return annotationAssertionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getAnnotationAssertion_AnnotationProperty()
  {
    return (EReference)annotationAssertionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getAnnotationAssertion_AnnotationSubject()
  {
    return (EReference)annotationAssertionEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getAnnotationAssertion_AnnotationValue()
  {
    return (EReference)annotationAssertionEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getSubAnnotationPropertyOf()
  {
    return subAnnotationPropertyOfEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getSubAnnotationPropertyOf_SubAnnotationProperty()
  {
    return (EReference)subAnnotationPropertyOfEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getSubAnnotationPropertyOf_SuperAnnotationProperty()
  {
    return (EReference)subAnnotationPropertyOfEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getAnnotationPropertyDomain()
  {
    return annotationPropertyDomainEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getAnnotationPropertyDomain_AnnotationProperty()
  {
    return (EReference)annotationPropertyDomainEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getAnnotationPropertyDomain_Iri()
  {
    return (EReference)annotationPropertyDomainEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getAnnotationPropertyRange()
  {
    return annotationPropertyRangeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getAnnotationPropertyRange_AnnotationProperty()
  {
    return (EReference)annotationPropertyRangeEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getAnnotationPropertyRange_Iri()
  {
    return (EReference)annotationPropertyRangeEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getAnnotationProperty()
  {
    return annotationPropertyEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getClass_()
  {
    return classEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getDataProperty()
  {
    return dataPropertyEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getDatatype()
  {
    return datatypeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getObjectProperty()
  {
    return objectPropertyEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getIndividual()
  {
    return individualEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getNamedIndividual()
  {
    return namedIndividualEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getAnonymousIndividual()
  {
    return anonymousIndividualEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getAnonymousIndividual_NodeID()
  {
    return (EAttribute)anonymousIndividualEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getLiteral()
  {
    return literalEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getLiteral_LexicalValue()
  {
    return (EAttribute)literalEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getLiteral_Datatype()
  {
    return (EReference)literalEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getLiteral_LanguageTag()
  {
    return (EAttribute)literalEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getObjectPropertyExpression()
  {
    return objectPropertyExpressionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getInverseObjectProperty()
  {
    return inverseObjectPropertyEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getInverseObjectProperty_ObjectProperty()
  {
    return (EReference)inverseObjectPropertyEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getDataPropertyExpression()
  {
    return dataPropertyExpressionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getDataRange()
  {
    return dataRangeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getDataIntersectionOf()
  {
    return dataIntersectionOfEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDataIntersectionOf_DataRange()
  {
    return (EReference)dataIntersectionOfEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getDataUnionOf()
  {
    return dataUnionOfEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDataUnionOf_DataRange()
  {
    return (EReference)dataUnionOfEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getDataComplementOf()
  {
    return dataComplementOfEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDataComplementOf_DataRange()
  {
    return (EReference)dataComplementOfEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getDataOneOf()
  {
    return dataOneOfEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDataOneOf_Constants()
  {
    return (EReference)dataOneOfEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getDatatypeRestriction()
  {
    return datatypeRestrictionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDatatypeRestriction_Datatype()
  {
    return (EReference)datatypeRestrictionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDatatypeRestriction_Restrictions()
  {
    return (EReference)datatypeRestrictionEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getFacetConstraintPair()
  {
    return facetConstraintPairEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getFacetConstraintPair_Constant()
  {
    return (EReference)facetConstraintPairEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getFacetConstraintPair_Facet()
  {
    return (EReference)facetConstraintPairEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getClassExpression()
  {
    return classExpressionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getObjectIntersectionOf()
  {
    return objectIntersectionOfEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getObjectIntersectionOf_ClassExpressions()
  {
    return (EReference)objectIntersectionOfEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getObjectUnionOf()
  {
    return objectUnionOfEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getObjectUnionOf_ClassExpressions()
  {
    return (EReference)objectUnionOfEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getObjectComplementOf()
  {
    return objectComplementOfEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getObjectComplementOf_ClassExpression()
  {
    return (EReference)objectComplementOfEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getObjectOneOf()
  {
    return objectOneOfEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getObjectOneOf_Individuals()
  {
    return (EReference)objectOneOfEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getObjectSomeValuesFrom()
  {
    return objectSomeValuesFromEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getObjectSomeValuesFrom_ClassExpression()
  {
    return (EReference)objectSomeValuesFromEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getObjectSomeValuesFrom_ObjectPropertyExpression()
  {
    return (EReference)objectSomeValuesFromEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getObjectAllValuesFrom()
  {
    return objectAllValuesFromEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getObjectAllValuesFrom_ClassExpression()
  {
    return (EReference)objectAllValuesFromEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getObjectAllValuesFrom_ObjectPropertyExpression()
  {
    return (EReference)objectAllValuesFromEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getObjectHasSelf()
  {
    return objectHasSelfEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getObjectHasSelf_ObjectPropertyExpression()
  {
    return (EReference)objectHasSelfEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getObjectHasValue()
  {
    return objectHasValueEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getObjectHasValue_ObjectPropertyExpression()
  {
    return (EReference)objectHasValueEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getObjectHasValue_Individual()
  {
    return (EReference)objectHasValueEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getObjectMinCardinality()
  {
    return objectMinCardinalityEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getObjectMinCardinality_Cardinality()
  {
    return (EAttribute)objectMinCardinalityEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getObjectMinCardinality_ClassExpression()
  {
    return (EReference)objectMinCardinalityEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getObjectMinCardinality_ObjectPropertyExpression()
  {
    return (EReference)objectMinCardinalityEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getObjectMaxCardinality()
  {
    return objectMaxCardinalityEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getObjectMaxCardinality_Cardinality()
  {
    return (EAttribute)objectMaxCardinalityEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getObjectMaxCardinality_ClassExpression()
  {
    return (EReference)objectMaxCardinalityEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getObjectMaxCardinality_ObjectPropertyExpression()
  {
    return (EReference)objectMaxCardinalityEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getObjectExactCardinality()
  {
    return objectExactCardinalityEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getObjectExactCardinality_Cardinality()
  {
    return (EAttribute)objectExactCardinalityEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getObjectExactCardinality_ClassExpression()
  {
    return (EReference)objectExactCardinalityEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getObjectExactCardinality_ObjectPropertyExpression()
  {
    return (EReference)objectExactCardinalityEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getDataSomeValuesFrom()
  {
    return dataSomeValuesFromEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDataSomeValuesFrom_DataRange()
  {
    return (EReference)dataSomeValuesFromEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDataSomeValuesFrom_DataPropertyExpressions()
  {
    return (EReference)dataSomeValuesFromEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getDataAllValuesFrom()
  {
    return dataAllValuesFromEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDataAllValuesFrom_DataRange()
  {
    return (EReference)dataAllValuesFromEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDataAllValuesFrom_DataPropertyExpressions()
  {
    return (EReference)dataAllValuesFromEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getDataHasValue()
  {
    return dataHasValueEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDataHasValue_Constant()
  {
    return (EReference)dataHasValueEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDataHasValue_DataPropertyExpression()
  {
    return (EReference)dataHasValueEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getDataMinCardinality()
  {
    return dataMinCardinalityEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getDataMinCardinality_Cardinality()
  {
    return (EAttribute)dataMinCardinalityEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDataMinCardinality_DataRange()
  {
    return (EReference)dataMinCardinalityEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDataMinCardinality_DataPropertyExpression()
  {
    return (EReference)dataMinCardinalityEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getDataMaxCardinality()
  {
    return dataMaxCardinalityEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getDataMaxCardinality_Cardinality()
  {
    return (EAttribute)dataMaxCardinalityEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDataMaxCardinality_DataRange()
  {
    return (EReference)dataMaxCardinalityEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDataMaxCardinality_DataPropertyExpression()
  {
    return (EReference)dataMaxCardinalityEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getDataExactCardinality()
  {
    return dataExactCardinalityEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getDataExactCardinality_Cardinality()
  {
    return (EAttribute)dataExactCardinalityEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDataExactCardinality_DataRange()
  {
    return (EReference)dataExactCardinalityEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDataExactCardinality_DataPropertyExpression()
  {
    return (EReference)dataExactCardinalityEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getClassAxiom()
  {
    return classAxiomEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getSubClassOf()
  {
    return subClassOfEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getSubClassOf_SubClassExpression()
  {
    return (EReference)subClassOfEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getSubClassOf_SuperClassExpression()
  {
    return (EReference)subClassOfEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getEquivalentClasses()
  {
    return equivalentClassesEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getEquivalentClasses_EquivalentClassExpressions()
  {
    return (EReference)equivalentClassesEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getDisjointClasses()
  {
    return disjointClassesEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDisjointClasses_DisjointClassExpressions()
  {
    return (EReference)disjointClassesEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getDisjointUnion()
  {
    return disjointUnionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDisjointUnion_UnionClass()
  {
    return (EReference)disjointUnionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDisjointUnion_DisjointClassExpressions()
  {
    return (EReference)disjointUnionEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getObjectPropertyAxiom()
  {
    return objectPropertyAxiomEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getSubObjectPropertyOf()
  {
    return subObjectPropertyOfEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getSubObjectPropertyOf_SubObjectPropertyExpression()
  {
    return (EReference)subObjectPropertyOfEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getSubObjectPropertyOf_SuperObjectPropertyExpression()
  {
    return (EReference)subObjectPropertyOfEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getSubObjectPropertyExpression()
  {
    return subObjectPropertyExpressionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getObjectPropertyChain()
  {
    return objectPropertyChainEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getObjectPropertyChain_ObjectPropertyExpressions()
  {
    return (EReference)objectPropertyChainEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getEquivalentObjectProperties()
  {
    return equivalentObjectPropertiesEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getEquivalentObjectProperties_ObjectPropertyExpressions()
  {
    return (EReference)equivalentObjectPropertiesEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getDisjointObjectProperties()
  {
    return disjointObjectPropertiesEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDisjointObjectProperties_ObjectPropertyExpressions()
  {
    return (EReference)disjointObjectPropertiesEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getObjectPropertyDomain()
  {
    return objectPropertyDomainEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getObjectPropertyDomain_Domain()
  {
    return (EReference)objectPropertyDomainEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getObjectPropertyDomain_ObjectPropertyExpression()
  {
    return (EReference)objectPropertyDomainEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getObjectPropertyRange()
  {
    return objectPropertyRangeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getObjectPropertyRange_Range()
  {
    return (EReference)objectPropertyRangeEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getObjectPropertyRange_ObjectPropertyExpression()
  {
    return (EReference)objectPropertyRangeEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getInverseObjectProperties()
  {
    return inverseObjectPropertiesEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getInverseObjectProperties_ObjectPropertyExpression1()
  {
    return (EReference)inverseObjectPropertiesEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getInverseObjectProperties_ObjectPropertyExpression2()
  {
    return (EReference)inverseObjectPropertiesEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getFunctionalObjectProperty()
  {
    return functionalObjectPropertyEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getFunctionalObjectProperty_ObjectPropertyExpression()
  {
    return (EReference)functionalObjectPropertyEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getInverseFunctionalObjectProperty()
  {
    return inverseFunctionalObjectPropertyEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getInverseFunctionalObjectProperty_ObjectPropertyExpression()
  {
    return (EReference)inverseFunctionalObjectPropertyEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getReflexiveObjectProperty()
  {
    return reflexiveObjectPropertyEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getReflexiveObjectProperty_ObjectPropertyExpression()
  {
    return (EReference)reflexiveObjectPropertyEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getIrreflexiveObjectProperty()
  {
    return irreflexiveObjectPropertyEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getIrreflexiveObjectProperty_ObjectPropertyExpression()
  {
    return (EReference)irreflexiveObjectPropertyEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getSymmetricObjectProperty()
  {
    return symmetricObjectPropertyEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getSymmetricObjectProperty_ObjectPropertyExpression()
  {
    return (EReference)symmetricObjectPropertyEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getAsymmetricObjectProperty()
  {
    return asymmetricObjectPropertyEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getAsymmetricObjectProperty_ObjectPropertyExpression()
  {
    return (EReference)asymmetricObjectPropertyEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getTransitiveObjectProperty()
  {
    return transitiveObjectPropertyEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getTransitiveObjectProperty_ObjectPropertyExpression()
  {
    return (EReference)transitiveObjectPropertyEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getDataPropertyAxiom()
  {
    return dataPropertyAxiomEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getSubDataPropertyOf()
  {
    return subDataPropertyOfEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getSubDataPropertyOf_SuperDataPropertyExpression()
  {
    return (EReference)subDataPropertyOfEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getSubDataPropertyOf_SubDataPropertyExpression()
  {
    return (EReference)subDataPropertyOfEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getEquivalentDataProperties()
  {
    return equivalentDataPropertiesEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getEquivalentDataProperties_DataPropertyExpressions()
  {
    return (EReference)equivalentDataPropertiesEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getDisjointDataProperties()
  {
    return disjointDataPropertiesEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDisjointDataProperties_DataPropertyExpressions()
  {
    return (EReference)disjointDataPropertiesEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getDataPropertyDomain()
  {
    return dataPropertyDomainEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDataPropertyDomain_Domain()
  {
    return (EReference)dataPropertyDomainEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDataPropertyDomain_DataPropertyExpression()
  {
    return (EReference)dataPropertyDomainEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getDataPropertyRange()
  {
    return dataPropertyRangeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDataPropertyRange_Range()
  {
    return (EReference)dataPropertyRangeEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDataPropertyRange_DataPropertyExpression()
  {
    return (EReference)dataPropertyRangeEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getFunctionalDataProperty()
  {
    return functionalDataPropertyEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getFunctionalDataProperty_DataPropertyExpression()
  {
    return (EReference)functionalDataPropertyEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getDatatypeDefinition()
  {
    return datatypeDefinitionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDatatypeDefinition_Datatype()
  {
    return (EReference)datatypeDefinitionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDatatypeDefinition_DataRange()
  {
    return (EReference)datatypeDefinitionEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getHasKey()
  {
    return hasKeyEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getHasKey_ClassExpression()
  {
    return (EReference)hasKeyEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getHasKey_ObjectPropertyExpressions()
  {
    return (EReference)hasKeyEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getHasKey_DataPropertyExpressions()
  {
    return (EReference)hasKeyEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getAssertion()
  {
    return assertionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getSameIndividual()
  {
    return sameIndividualEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getSameIndividual_SameIndividuals()
  {
    return (EReference)sameIndividualEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getDifferentIndividuals()
  {
    return differentIndividualsEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDifferentIndividuals_DifferentIndividuals()
  {
    return (EReference)differentIndividualsEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getClassAssertion()
  {
    return classAssertionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getClassAssertion_Individual()
  {
    return (EReference)classAssertionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getClassAssertion_ClassExpression()
  {
    return (EReference)classAssertionEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getObjectPropertyAssertion()
  {
    return objectPropertyAssertionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getObjectPropertyAssertion_ObjectPropertyExpression()
  {
    return (EReference)objectPropertyAssertionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getObjectPropertyAssertion_SourceIndividual()
  {
    return (EReference)objectPropertyAssertionEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getObjectPropertyAssertion_TargetIndividual()
  {
    return (EReference)objectPropertyAssertionEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getNegativeObjectPropertyAssertion()
  {
    return negativeObjectPropertyAssertionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getNegativeObjectPropertyAssertion_ObjectPropertyExpression()
  {
    return (EReference)negativeObjectPropertyAssertionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getNegativeObjectPropertyAssertion_SourceIndividual()
  {
    return (EReference)negativeObjectPropertyAssertionEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getNegativeObjectPropertyAssertion_TargetIndividual()
  {
    return (EReference)negativeObjectPropertyAssertionEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getDataPropertyAssertion()
  {
    return dataPropertyAssertionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDataPropertyAssertion_DataPropertyExpression()
  {
    return (EReference)dataPropertyAssertionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDataPropertyAssertion_TargetValue()
  {
    return (EReference)dataPropertyAssertionEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDataPropertyAssertion_SourceIndividual()
  {
    return (EReference)dataPropertyAssertionEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getNegativeDataPropertyAssertion()
  {
    return negativeDataPropertyAssertionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getNegativeDataPropertyAssertion_DataPropertyExpression()
  {
    return (EReference)negativeDataPropertyAssertionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getNegativeDataPropertyAssertion_TargetValue()
  {
    return (EReference)negativeDataPropertyAssertionEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getNegativeDataPropertyAssertion_SourceIndividual()
  {
    return (EReference)negativeDataPropertyAssertionEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getRule()
  {
    return ruleEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getDLSafeRule()
  {
    return dlSafeRuleEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDLSafeRule_Annotation()
  {
    return (EReference)dlSafeRuleEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDLSafeRule_BodyAtom()
  {
    return (EReference)dlSafeRuleEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDLSafeRule_HeadAtom()
  {
    return (EReference)dlSafeRuleEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getAtom()
  {
    return atomEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getClassAtom()
  {
    return classAtomEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getClassAtom_ClassExpression()
  {
    return (EReference)classAtomEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getClassAtom_IArg()
  {
    return (EReference)classAtomEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getDataRangeAtom()
  {
    return dataRangeAtomEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDataRangeAtom_DataRange()
  {
    return (EReference)dataRangeAtomEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDataRangeAtom_DArg()
  {
    return (EReference)dataRangeAtomEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getObjectPropertyAtom()
  {
    return objectPropertyAtomEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getObjectPropertyAtom_ObjectPropertyExpression()
  {
    return (EReference)objectPropertyAtomEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getObjectPropertyAtom_IArg1()
  {
    return (EReference)objectPropertyAtomEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getObjectPropertyAtom_IArg2()
  {
    return (EReference)objectPropertyAtomEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getDataPropetyAtom()
  {
    return dataPropetyAtomEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDataPropetyAtom_DataProperty()
  {
    return (EReference)dataPropetyAtomEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDataPropetyAtom_IArg()
  {
    return (EReference)dataPropetyAtomEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDataPropetyAtom_DArg()
  {
    return (EReference)dataPropetyAtomEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getBuiltInAtom()
  {
    return builtInAtomEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getBuiltInAtom_Iri()
  {
    return (EReference)builtInAtomEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getBuiltInAtom_DArg()
  {
    return (EReference)builtInAtomEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getSameIndividualAtom()
  {
    return sameIndividualAtomEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getSameIndividualAtom_IArg1()
  {
    return (EReference)sameIndividualAtomEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getSameIndividualAtom_IArg2()
  {
    return (EReference)sameIndividualAtomEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getDifferentIndividualsAtom()
  {
    return differentIndividualsAtomEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDifferentIndividualsAtom_IArg1()
  {
    return (EReference)differentIndividualsAtomEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDifferentIndividualsAtom_IArg2()
  {
    return (EReference)differentIndividualsAtomEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getIArg()
  {
    return iArgEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getDArg()
  {
    return dArgEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getVariable()
  {
    return variableEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getVariable_Iri()
  {
    return (EReference)variableEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getDGRule()
  {
    return dgRuleEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDGRule_Annotation()
  {
    return (EReference)dgRuleEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDGRule_BodyAtom()
  {
    return (EReference)dgRuleEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDGRule_HeadAtom()
  {
    return (EReference)dgRuleEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getDGAtom()
  {
    return dgAtomEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getDGAxiom()
  {
    return dgAxiomEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDGAxiom_Annotation()
  {
    return (EReference)dgAxiomEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDGAxiom_DgNodes()
  {
    return (EReference)dgAxiomEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDGAxiom_DgEdges()
  {
    return (EReference)dgAxiomEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDGAxiom_MainClasses()
  {
    return (EReference)dgAxiomEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getDGNodes()
  {
    return dgNodesEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDGNodes_NodeAssertion()
  {
    return (EReference)dgNodesEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getNodeAssertion()
  {
    return nodeAssertionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getNodeAssertion_Class()
  {
    return (EReference)nodeAssertionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getNodeAssertion_DgNode()
  {
    return (EReference)nodeAssertionEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getDGEdges()
  {
    return dgEdgesEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDGEdges_EdgeAssertion()
  {
    return (EReference)dgEdgesEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getEdgeAssertion()
  {
    return edgeAssertionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getEdgeAssertion_ObjectProperty()
  {
    return (EReference)edgeAssertionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getEdgeAssertion_DgNode1()
  {
    return (EReference)edgeAssertionEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getEdgeAssertion_DgNode2()
  {
    return (EReference)edgeAssertionEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getMainClasses()
  {
    return mainClassesEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getMainClasses_Class()
  {
    return (EReference)mainClassesEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getExpression()
  {
    return expressionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getTemplateParameter()
  {
    return templateParameterEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getTemplateParameter_Signature()
  {
    return (EReference)templateParameterEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getTemplateParameter_ParameteredElement()
  {
    return (EReference)templateParameterEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getTemplateParameter_ParameterSubstitution()
  {
    return (EReference)templateParameterEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getParameterableElement()
  {
    return parameterableElementEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getParameterableElement_TemplateParameter()
  {
    return (EReference)parameterableElementEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getTemplateSignature()
  {
    return templateSignatureEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getTemplateSignature_OwnedParameter()
  {
    return (EReference)templateSignatureEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getTemplateSignature_Template()
  {
    return (EReference)templateSignatureEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getTemplateableElement()
  {
    return templateableElementEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getTemplateableElement_OwnedTemplateSignature()
  {
    return (EReference)templateableElementEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getTemplateableElement_TemplateBinding()
  {
    return (EReference)templateableElementEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getPackage()
  {
    return packageEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getPackage_Expressions()
  {
    return (EReference)packageEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getPackage_Axioms()
  {
    return (EReference)packageEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getPackage_PackageUri()
  {
    return (EAttribute)packageEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getClassifierTemplateParameter()
  {
    return classifierTemplateParameterEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getTemplateParameterSubstitution()
  {
    return templateParameterSubstitutionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getTemplateParameterSubstitution_Actual()
  {
    return (EReference)templateParameterSubstitutionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getTemplateParameterSubstitution_Formal()
  {
    return (EReference)templateParameterSubstitutionEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getTemplateParameterSubstitution_TemplateBinding()
  {
    return (EReference)templateParameterSubstitutionEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getTemplateBinding()
  {
    return templateBindingEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getTemplateBinding_ParameterSubstitution()
  {
    return (EReference)templateBindingEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getTemplateBinding_BoundElement()
  {
    return (EReference)templateBindingEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getTemplateBinding_Signature()
  {
    return (EReference)templateBindingEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Owl2fsFactory getOwl2fsFactory()
  {
    return (Owl2fsFactory)getEFactoryInstance();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private boolean isCreated = false;

  /**
   * Creates the meta-model objects for the package.  This method is
   * guarded to have no affect on any invocation but its first.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void createPackageContents()
  {
    if (isCreated) return;
    isCreated = true;

    // Create classes and their features
    iriEClass = createEClass(IRI);
    createEAttribute(iriEClass, IRI__VALUE);

    fullIRIEClass = createEClass(FULL_IRI);

    abbreviatedIRIEClass = createEClass(ABBREVIATED_IRI);
    createEAttribute(abbreviatedIRIEClass, ABBREVIATED_IRI__PREFIX);

    ontologyDocumentEClass = createEClass(ONTOLOGY_DOCUMENT);
    createEReference(ontologyDocumentEClass, ONTOLOGY_DOCUMENT__ONTOLOGY);
    createEReference(ontologyDocumentEClass, ONTOLOGY_DOCUMENT__PREFIX_DEFINITION);
    createEReference(ontologyDocumentEClass, ONTOLOGY_DOCUMENT__COMMENT);

    prefixDefinitionEClass = createEClass(PREFIX_DEFINITION);
    createEAttribute(prefixDefinitionEClass, PREFIX_DEFINITION__PREF);
    createEReference(prefixDefinitionEClass, PREFIX_DEFINITION__NAMESPACE);

    ontologyEClass = createEClass(ONTOLOGY);
    createEReference(ontologyEClass, ONTOLOGY__EXPRESSIONS);
    createEReference(ontologyEClass, ONTOLOGY__PACKAGES);
    createEReference(ontologyEClass, ONTOLOGY__COMMENT);
    createEReference(ontologyEClass, ONTOLOGY__ONTOLOGY_IRI);
    createEReference(ontologyEClass, ONTOLOGY__VERSION_IRI);
    createEReference(ontologyEClass, ONTOLOGY__DIRECTLY_IMPORTS_DOCUMENTS);
    createEReference(ontologyEClass, ONTOLOGY__ONTOLOGY_ANNOTATIONS);
    createEReference(ontologyEClass, ONTOLOGY__AXIOMS);

    axiomEClass = createEClass(AXIOM);

    commentEClass = createEClass(COMMENT);
    createEAttribute(commentEClass, COMMENT__COMMENT);

    declarationEClass = createEClass(DECLARATION);
    createEReference(declarationEClass, DECLARATION__ENTITY);

    classDeclarationEClass = createEClass(CLASS_DECLARATION);

    datatypeDeclarationEClass = createEClass(DATATYPE_DECLARATION);

    objectPropertyDeclarationEClass = createEClass(OBJECT_PROPERTY_DECLARATION);

    dataPropertyDeclarationEClass = createEClass(DATA_PROPERTY_DECLARATION);

    annotationPropertyDeclarationEClass = createEClass(ANNOTATION_PROPERTY_DECLARATION);

    namedIndividualDeclarationEClass = createEClass(NAMED_INDIVIDUAL_DECLARATION);

    entityEClass = createEClass(ENTITY);
    createEReference(entityEClass, ENTITY__ENTITY_IRI);

    annotationSubjectEClass = createEClass(ANNOTATION_SUBJECT);

    annotationValueEClass = createEClass(ANNOTATION_VALUE);

    annotationEClass = createEClass(ANNOTATION);
    createEReference(annotationEClass, ANNOTATION__ANNOTATION_ANNOTATIONS);
    createEReference(annotationEClass, ANNOTATION__ANNOTATION_PROPERTY);
    createEReference(annotationEClass, ANNOTATION__ANNOTATION_VALUE);

    annotationAxiomEClass = createEClass(ANNOTATION_AXIOM);
    createEReference(annotationAxiomEClass, ANNOTATION_AXIOM__AXIOM_ANNOTATIONS);

    annotationAssertionEClass = createEClass(ANNOTATION_ASSERTION);
    createEReference(annotationAssertionEClass, ANNOTATION_ASSERTION__ANNOTATION_PROPERTY);
    createEReference(annotationAssertionEClass, ANNOTATION_ASSERTION__ANNOTATION_SUBJECT);
    createEReference(annotationAssertionEClass, ANNOTATION_ASSERTION__ANNOTATION_VALUE);

    subAnnotationPropertyOfEClass = createEClass(SUB_ANNOTATION_PROPERTY_OF);
    createEReference(subAnnotationPropertyOfEClass, SUB_ANNOTATION_PROPERTY_OF__SUB_ANNOTATION_PROPERTY);
    createEReference(subAnnotationPropertyOfEClass, SUB_ANNOTATION_PROPERTY_OF__SUPER_ANNOTATION_PROPERTY);

    annotationPropertyDomainEClass = createEClass(ANNOTATION_PROPERTY_DOMAIN);
    createEReference(annotationPropertyDomainEClass, ANNOTATION_PROPERTY_DOMAIN__ANNOTATION_PROPERTY);
    createEReference(annotationPropertyDomainEClass, ANNOTATION_PROPERTY_DOMAIN__IRI);

    annotationPropertyRangeEClass = createEClass(ANNOTATION_PROPERTY_RANGE);
    createEReference(annotationPropertyRangeEClass, ANNOTATION_PROPERTY_RANGE__ANNOTATION_PROPERTY);
    createEReference(annotationPropertyRangeEClass, ANNOTATION_PROPERTY_RANGE__IRI);

    annotationPropertyEClass = createEClass(ANNOTATION_PROPERTY);

    classEClass = createEClass(CLASS);

    dataPropertyEClass = createEClass(DATA_PROPERTY);

    datatypeEClass = createEClass(DATATYPE);

    objectPropertyEClass = createEClass(OBJECT_PROPERTY);

    individualEClass = createEClass(INDIVIDUAL);

    namedIndividualEClass = createEClass(NAMED_INDIVIDUAL);

    anonymousIndividualEClass = createEClass(ANONYMOUS_INDIVIDUAL);
    createEAttribute(anonymousIndividualEClass, ANONYMOUS_INDIVIDUAL__NODE_ID);

    literalEClass = createEClass(LITERAL);
    createEAttribute(literalEClass, LITERAL__LEXICAL_VALUE);
    createEReference(literalEClass, LITERAL__DATATYPE);
    createEAttribute(literalEClass, LITERAL__LANGUAGE_TAG);

    objectPropertyExpressionEClass = createEClass(OBJECT_PROPERTY_EXPRESSION);

    inverseObjectPropertyEClass = createEClass(INVERSE_OBJECT_PROPERTY);
    createEReference(inverseObjectPropertyEClass, INVERSE_OBJECT_PROPERTY__OBJECT_PROPERTY);

    dataPropertyExpressionEClass = createEClass(DATA_PROPERTY_EXPRESSION);

    dataRangeEClass = createEClass(DATA_RANGE);

    dataIntersectionOfEClass = createEClass(DATA_INTERSECTION_OF);
    createEReference(dataIntersectionOfEClass, DATA_INTERSECTION_OF__DATA_RANGE);

    dataUnionOfEClass = createEClass(DATA_UNION_OF);
    createEReference(dataUnionOfEClass, DATA_UNION_OF__DATA_RANGE);

    dataComplementOfEClass = createEClass(DATA_COMPLEMENT_OF);
    createEReference(dataComplementOfEClass, DATA_COMPLEMENT_OF__DATA_RANGE);

    dataOneOfEClass = createEClass(DATA_ONE_OF);
    createEReference(dataOneOfEClass, DATA_ONE_OF__CONSTANTS);

    datatypeRestrictionEClass = createEClass(DATATYPE_RESTRICTION);
    createEReference(datatypeRestrictionEClass, DATATYPE_RESTRICTION__DATATYPE);
    createEReference(datatypeRestrictionEClass, DATATYPE_RESTRICTION__RESTRICTIONS);

    facetConstraintPairEClass = createEClass(FACET_CONSTRAINT_PAIR);
    createEReference(facetConstraintPairEClass, FACET_CONSTRAINT_PAIR__CONSTANT);
    createEReference(facetConstraintPairEClass, FACET_CONSTRAINT_PAIR__FACET);

    classExpressionEClass = createEClass(CLASS_EXPRESSION);

    objectIntersectionOfEClass = createEClass(OBJECT_INTERSECTION_OF);
    createEReference(objectIntersectionOfEClass, OBJECT_INTERSECTION_OF__CLASS_EXPRESSIONS);

    objectUnionOfEClass = createEClass(OBJECT_UNION_OF);
    createEReference(objectUnionOfEClass, OBJECT_UNION_OF__CLASS_EXPRESSIONS);

    objectComplementOfEClass = createEClass(OBJECT_COMPLEMENT_OF);
    createEReference(objectComplementOfEClass, OBJECT_COMPLEMENT_OF__CLASS_EXPRESSION);

    objectOneOfEClass = createEClass(OBJECT_ONE_OF);
    createEReference(objectOneOfEClass, OBJECT_ONE_OF__INDIVIDUALS);

    objectSomeValuesFromEClass = createEClass(OBJECT_SOME_VALUES_FROM);
    createEReference(objectSomeValuesFromEClass, OBJECT_SOME_VALUES_FROM__CLASS_EXPRESSION);
    createEReference(objectSomeValuesFromEClass, OBJECT_SOME_VALUES_FROM__OBJECT_PROPERTY_EXPRESSION);

    objectAllValuesFromEClass = createEClass(OBJECT_ALL_VALUES_FROM);
    createEReference(objectAllValuesFromEClass, OBJECT_ALL_VALUES_FROM__CLASS_EXPRESSION);
    createEReference(objectAllValuesFromEClass, OBJECT_ALL_VALUES_FROM__OBJECT_PROPERTY_EXPRESSION);

    objectHasSelfEClass = createEClass(OBJECT_HAS_SELF);
    createEReference(objectHasSelfEClass, OBJECT_HAS_SELF__OBJECT_PROPERTY_EXPRESSION);

    objectHasValueEClass = createEClass(OBJECT_HAS_VALUE);
    createEReference(objectHasValueEClass, OBJECT_HAS_VALUE__OBJECT_PROPERTY_EXPRESSION);
    createEReference(objectHasValueEClass, OBJECT_HAS_VALUE__INDIVIDUAL);

    objectMinCardinalityEClass = createEClass(OBJECT_MIN_CARDINALITY);
    createEAttribute(objectMinCardinalityEClass, OBJECT_MIN_CARDINALITY__CARDINALITY);
    createEReference(objectMinCardinalityEClass, OBJECT_MIN_CARDINALITY__CLASS_EXPRESSION);
    createEReference(objectMinCardinalityEClass, OBJECT_MIN_CARDINALITY__OBJECT_PROPERTY_EXPRESSION);

    objectMaxCardinalityEClass = createEClass(OBJECT_MAX_CARDINALITY);
    createEAttribute(objectMaxCardinalityEClass, OBJECT_MAX_CARDINALITY__CARDINALITY);
    createEReference(objectMaxCardinalityEClass, OBJECT_MAX_CARDINALITY__CLASS_EXPRESSION);
    createEReference(objectMaxCardinalityEClass, OBJECT_MAX_CARDINALITY__OBJECT_PROPERTY_EXPRESSION);

    objectExactCardinalityEClass = createEClass(OBJECT_EXACT_CARDINALITY);
    createEAttribute(objectExactCardinalityEClass, OBJECT_EXACT_CARDINALITY__CARDINALITY);
    createEReference(objectExactCardinalityEClass, OBJECT_EXACT_CARDINALITY__CLASS_EXPRESSION);
    createEReference(objectExactCardinalityEClass, OBJECT_EXACT_CARDINALITY__OBJECT_PROPERTY_EXPRESSION);

    dataSomeValuesFromEClass = createEClass(DATA_SOME_VALUES_FROM);
    createEReference(dataSomeValuesFromEClass, DATA_SOME_VALUES_FROM__DATA_RANGE);
    createEReference(dataSomeValuesFromEClass, DATA_SOME_VALUES_FROM__DATA_PROPERTY_EXPRESSIONS);

    dataAllValuesFromEClass = createEClass(DATA_ALL_VALUES_FROM);
    createEReference(dataAllValuesFromEClass, DATA_ALL_VALUES_FROM__DATA_RANGE);
    createEReference(dataAllValuesFromEClass, DATA_ALL_VALUES_FROM__DATA_PROPERTY_EXPRESSIONS);

    dataHasValueEClass = createEClass(DATA_HAS_VALUE);
    createEReference(dataHasValueEClass, DATA_HAS_VALUE__CONSTANT);
    createEReference(dataHasValueEClass, DATA_HAS_VALUE__DATA_PROPERTY_EXPRESSION);

    dataMinCardinalityEClass = createEClass(DATA_MIN_CARDINALITY);
    createEAttribute(dataMinCardinalityEClass, DATA_MIN_CARDINALITY__CARDINALITY);
    createEReference(dataMinCardinalityEClass, DATA_MIN_CARDINALITY__DATA_RANGE);
    createEReference(dataMinCardinalityEClass, DATA_MIN_CARDINALITY__DATA_PROPERTY_EXPRESSION);

    dataMaxCardinalityEClass = createEClass(DATA_MAX_CARDINALITY);
    createEAttribute(dataMaxCardinalityEClass, DATA_MAX_CARDINALITY__CARDINALITY);
    createEReference(dataMaxCardinalityEClass, DATA_MAX_CARDINALITY__DATA_RANGE);
    createEReference(dataMaxCardinalityEClass, DATA_MAX_CARDINALITY__DATA_PROPERTY_EXPRESSION);

    dataExactCardinalityEClass = createEClass(DATA_EXACT_CARDINALITY);
    createEAttribute(dataExactCardinalityEClass, DATA_EXACT_CARDINALITY__CARDINALITY);
    createEReference(dataExactCardinalityEClass, DATA_EXACT_CARDINALITY__DATA_RANGE);
    createEReference(dataExactCardinalityEClass, DATA_EXACT_CARDINALITY__DATA_PROPERTY_EXPRESSION);

    classAxiomEClass = createEClass(CLASS_AXIOM);

    subClassOfEClass = createEClass(SUB_CLASS_OF);
    createEReference(subClassOfEClass, SUB_CLASS_OF__SUB_CLASS_EXPRESSION);
    createEReference(subClassOfEClass, SUB_CLASS_OF__SUPER_CLASS_EXPRESSION);

    equivalentClassesEClass = createEClass(EQUIVALENT_CLASSES);
    createEReference(equivalentClassesEClass, EQUIVALENT_CLASSES__EQUIVALENT_CLASS_EXPRESSIONS);

    disjointClassesEClass = createEClass(DISJOINT_CLASSES);
    createEReference(disjointClassesEClass, DISJOINT_CLASSES__DISJOINT_CLASS_EXPRESSIONS);

    disjointUnionEClass = createEClass(DISJOINT_UNION);
    createEReference(disjointUnionEClass, DISJOINT_UNION__UNION_CLASS);
    createEReference(disjointUnionEClass, DISJOINT_UNION__DISJOINT_CLASS_EXPRESSIONS);

    objectPropertyAxiomEClass = createEClass(OBJECT_PROPERTY_AXIOM);

    subObjectPropertyOfEClass = createEClass(SUB_OBJECT_PROPERTY_OF);
    createEReference(subObjectPropertyOfEClass, SUB_OBJECT_PROPERTY_OF__SUB_OBJECT_PROPERTY_EXPRESSION);
    createEReference(subObjectPropertyOfEClass, SUB_OBJECT_PROPERTY_OF__SUPER_OBJECT_PROPERTY_EXPRESSION);

    subObjectPropertyExpressionEClass = createEClass(SUB_OBJECT_PROPERTY_EXPRESSION);

    objectPropertyChainEClass = createEClass(OBJECT_PROPERTY_CHAIN);
    createEReference(objectPropertyChainEClass, OBJECT_PROPERTY_CHAIN__OBJECT_PROPERTY_EXPRESSIONS);

    equivalentObjectPropertiesEClass = createEClass(EQUIVALENT_OBJECT_PROPERTIES);
    createEReference(equivalentObjectPropertiesEClass, EQUIVALENT_OBJECT_PROPERTIES__OBJECT_PROPERTY_EXPRESSIONS);

    disjointObjectPropertiesEClass = createEClass(DISJOINT_OBJECT_PROPERTIES);
    createEReference(disjointObjectPropertiesEClass, DISJOINT_OBJECT_PROPERTIES__OBJECT_PROPERTY_EXPRESSIONS);

    objectPropertyDomainEClass = createEClass(OBJECT_PROPERTY_DOMAIN);
    createEReference(objectPropertyDomainEClass, OBJECT_PROPERTY_DOMAIN__DOMAIN);
    createEReference(objectPropertyDomainEClass, OBJECT_PROPERTY_DOMAIN__OBJECT_PROPERTY_EXPRESSION);

    objectPropertyRangeEClass = createEClass(OBJECT_PROPERTY_RANGE);
    createEReference(objectPropertyRangeEClass, OBJECT_PROPERTY_RANGE__RANGE);
    createEReference(objectPropertyRangeEClass, OBJECT_PROPERTY_RANGE__OBJECT_PROPERTY_EXPRESSION);

    inverseObjectPropertiesEClass = createEClass(INVERSE_OBJECT_PROPERTIES);
    createEReference(inverseObjectPropertiesEClass, INVERSE_OBJECT_PROPERTIES__OBJECT_PROPERTY_EXPRESSION1);
    createEReference(inverseObjectPropertiesEClass, INVERSE_OBJECT_PROPERTIES__OBJECT_PROPERTY_EXPRESSION2);

    functionalObjectPropertyEClass = createEClass(FUNCTIONAL_OBJECT_PROPERTY);
    createEReference(functionalObjectPropertyEClass, FUNCTIONAL_OBJECT_PROPERTY__OBJECT_PROPERTY_EXPRESSION);

    inverseFunctionalObjectPropertyEClass = createEClass(INVERSE_FUNCTIONAL_OBJECT_PROPERTY);
    createEReference(inverseFunctionalObjectPropertyEClass, INVERSE_FUNCTIONAL_OBJECT_PROPERTY__OBJECT_PROPERTY_EXPRESSION);

    reflexiveObjectPropertyEClass = createEClass(REFLEXIVE_OBJECT_PROPERTY);
    createEReference(reflexiveObjectPropertyEClass, REFLEXIVE_OBJECT_PROPERTY__OBJECT_PROPERTY_EXPRESSION);

    irreflexiveObjectPropertyEClass = createEClass(IRREFLEXIVE_OBJECT_PROPERTY);
    createEReference(irreflexiveObjectPropertyEClass, IRREFLEXIVE_OBJECT_PROPERTY__OBJECT_PROPERTY_EXPRESSION);

    symmetricObjectPropertyEClass = createEClass(SYMMETRIC_OBJECT_PROPERTY);
    createEReference(symmetricObjectPropertyEClass, SYMMETRIC_OBJECT_PROPERTY__OBJECT_PROPERTY_EXPRESSION);

    asymmetricObjectPropertyEClass = createEClass(ASYMMETRIC_OBJECT_PROPERTY);
    createEReference(asymmetricObjectPropertyEClass, ASYMMETRIC_OBJECT_PROPERTY__OBJECT_PROPERTY_EXPRESSION);

    transitiveObjectPropertyEClass = createEClass(TRANSITIVE_OBJECT_PROPERTY);
    createEReference(transitiveObjectPropertyEClass, TRANSITIVE_OBJECT_PROPERTY__OBJECT_PROPERTY_EXPRESSION);

    dataPropertyAxiomEClass = createEClass(DATA_PROPERTY_AXIOM);

    subDataPropertyOfEClass = createEClass(SUB_DATA_PROPERTY_OF);
    createEReference(subDataPropertyOfEClass, SUB_DATA_PROPERTY_OF__SUPER_DATA_PROPERTY_EXPRESSION);
    createEReference(subDataPropertyOfEClass, SUB_DATA_PROPERTY_OF__SUB_DATA_PROPERTY_EXPRESSION);

    equivalentDataPropertiesEClass = createEClass(EQUIVALENT_DATA_PROPERTIES);
    createEReference(equivalentDataPropertiesEClass, EQUIVALENT_DATA_PROPERTIES__DATA_PROPERTY_EXPRESSIONS);

    disjointDataPropertiesEClass = createEClass(DISJOINT_DATA_PROPERTIES);
    createEReference(disjointDataPropertiesEClass, DISJOINT_DATA_PROPERTIES__DATA_PROPERTY_EXPRESSIONS);

    dataPropertyDomainEClass = createEClass(DATA_PROPERTY_DOMAIN);
    createEReference(dataPropertyDomainEClass, DATA_PROPERTY_DOMAIN__DOMAIN);
    createEReference(dataPropertyDomainEClass, DATA_PROPERTY_DOMAIN__DATA_PROPERTY_EXPRESSION);

    dataPropertyRangeEClass = createEClass(DATA_PROPERTY_RANGE);
    createEReference(dataPropertyRangeEClass, DATA_PROPERTY_RANGE__RANGE);
    createEReference(dataPropertyRangeEClass, DATA_PROPERTY_RANGE__DATA_PROPERTY_EXPRESSION);

    functionalDataPropertyEClass = createEClass(FUNCTIONAL_DATA_PROPERTY);
    createEReference(functionalDataPropertyEClass, FUNCTIONAL_DATA_PROPERTY__DATA_PROPERTY_EXPRESSION);

    datatypeDefinitionEClass = createEClass(DATATYPE_DEFINITION);
    createEReference(datatypeDefinitionEClass, DATATYPE_DEFINITION__DATATYPE);
    createEReference(datatypeDefinitionEClass, DATATYPE_DEFINITION__DATA_RANGE);

    hasKeyEClass = createEClass(HAS_KEY);
    createEReference(hasKeyEClass, HAS_KEY__CLASS_EXPRESSION);
    createEReference(hasKeyEClass, HAS_KEY__OBJECT_PROPERTY_EXPRESSIONS);
    createEReference(hasKeyEClass, HAS_KEY__DATA_PROPERTY_EXPRESSIONS);

    assertionEClass = createEClass(ASSERTION);

    sameIndividualEClass = createEClass(SAME_INDIVIDUAL);
    createEReference(sameIndividualEClass, SAME_INDIVIDUAL__SAME_INDIVIDUALS);

    differentIndividualsEClass = createEClass(DIFFERENT_INDIVIDUALS);
    createEReference(differentIndividualsEClass, DIFFERENT_INDIVIDUALS__DIFFERENT_INDIVIDUALS);

    classAssertionEClass = createEClass(CLASS_ASSERTION);
    createEReference(classAssertionEClass, CLASS_ASSERTION__INDIVIDUAL);
    createEReference(classAssertionEClass, CLASS_ASSERTION__CLASS_EXPRESSION);

    objectPropertyAssertionEClass = createEClass(OBJECT_PROPERTY_ASSERTION);
    createEReference(objectPropertyAssertionEClass, OBJECT_PROPERTY_ASSERTION__OBJECT_PROPERTY_EXPRESSION);
    createEReference(objectPropertyAssertionEClass, OBJECT_PROPERTY_ASSERTION__SOURCE_INDIVIDUAL);
    createEReference(objectPropertyAssertionEClass, OBJECT_PROPERTY_ASSERTION__TARGET_INDIVIDUAL);

    negativeObjectPropertyAssertionEClass = createEClass(NEGATIVE_OBJECT_PROPERTY_ASSERTION);
    createEReference(negativeObjectPropertyAssertionEClass, NEGATIVE_OBJECT_PROPERTY_ASSERTION__OBJECT_PROPERTY_EXPRESSION);
    createEReference(negativeObjectPropertyAssertionEClass, NEGATIVE_OBJECT_PROPERTY_ASSERTION__SOURCE_INDIVIDUAL);
    createEReference(negativeObjectPropertyAssertionEClass, NEGATIVE_OBJECT_PROPERTY_ASSERTION__TARGET_INDIVIDUAL);

    dataPropertyAssertionEClass = createEClass(DATA_PROPERTY_ASSERTION);
    createEReference(dataPropertyAssertionEClass, DATA_PROPERTY_ASSERTION__DATA_PROPERTY_EXPRESSION);
    createEReference(dataPropertyAssertionEClass, DATA_PROPERTY_ASSERTION__TARGET_VALUE);
    createEReference(dataPropertyAssertionEClass, DATA_PROPERTY_ASSERTION__SOURCE_INDIVIDUAL);

    negativeDataPropertyAssertionEClass = createEClass(NEGATIVE_DATA_PROPERTY_ASSERTION);
    createEReference(negativeDataPropertyAssertionEClass, NEGATIVE_DATA_PROPERTY_ASSERTION__DATA_PROPERTY_EXPRESSION);
    createEReference(negativeDataPropertyAssertionEClass, NEGATIVE_DATA_PROPERTY_ASSERTION__TARGET_VALUE);
    createEReference(negativeDataPropertyAssertionEClass, NEGATIVE_DATA_PROPERTY_ASSERTION__SOURCE_INDIVIDUAL);

    ruleEClass = createEClass(RULE);

    dlSafeRuleEClass = createEClass(DL_SAFE_RULE);
    createEReference(dlSafeRuleEClass, DL_SAFE_RULE__ANNOTATION);
    createEReference(dlSafeRuleEClass, DL_SAFE_RULE__BODY_ATOM);
    createEReference(dlSafeRuleEClass, DL_SAFE_RULE__HEAD_ATOM);

    atomEClass = createEClass(ATOM);

    classAtomEClass = createEClass(CLASS_ATOM);
    createEReference(classAtomEClass, CLASS_ATOM__CLASS_EXPRESSION);
    createEReference(classAtomEClass, CLASS_ATOM__IARG);

    dataRangeAtomEClass = createEClass(DATA_RANGE_ATOM);
    createEReference(dataRangeAtomEClass, DATA_RANGE_ATOM__DATA_RANGE);
    createEReference(dataRangeAtomEClass, DATA_RANGE_ATOM__DARG);

    objectPropertyAtomEClass = createEClass(OBJECT_PROPERTY_ATOM);
    createEReference(objectPropertyAtomEClass, OBJECT_PROPERTY_ATOM__OBJECT_PROPERTY_EXPRESSION);
    createEReference(objectPropertyAtomEClass, OBJECT_PROPERTY_ATOM__IARG1);
    createEReference(objectPropertyAtomEClass, OBJECT_PROPERTY_ATOM__IARG2);

    dataPropetyAtomEClass = createEClass(DATA_PROPETY_ATOM);
    createEReference(dataPropetyAtomEClass, DATA_PROPETY_ATOM__DATA_PROPERTY);
    createEReference(dataPropetyAtomEClass, DATA_PROPETY_ATOM__IARG);
    createEReference(dataPropetyAtomEClass, DATA_PROPETY_ATOM__DARG);

    builtInAtomEClass = createEClass(BUILT_IN_ATOM);
    createEReference(builtInAtomEClass, BUILT_IN_ATOM__IRI);
    createEReference(builtInAtomEClass, BUILT_IN_ATOM__DARG);

    sameIndividualAtomEClass = createEClass(SAME_INDIVIDUAL_ATOM);
    createEReference(sameIndividualAtomEClass, SAME_INDIVIDUAL_ATOM__IARG1);
    createEReference(sameIndividualAtomEClass, SAME_INDIVIDUAL_ATOM__IARG2);

    differentIndividualsAtomEClass = createEClass(DIFFERENT_INDIVIDUALS_ATOM);
    createEReference(differentIndividualsAtomEClass, DIFFERENT_INDIVIDUALS_ATOM__IARG1);
    createEReference(differentIndividualsAtomEClass, DIFFERENT_INDIVIDUALS_ATOM__IARG2);

    iArgEClass = createEClass(IARG);

    dArgEClass = createEClass(DARG);

    variableEClass = createEClass(VARIABLE);
    createEReference(variableEClass, VARIABLE__IRI);

    dgRuleEClass = createEClass(DG_RULE);
    createEReference(dgRuleEClass, DG_RULE__ANNOTATION);
    createEReference(dgRuleEClass, DG_RULE__BODY_ATOM);
    createEReference(dgRuleEClass, DG_RULE__HEAD_ATOM);

    dgAtomEClass = createEClass(DG_ATOM);

    dgAxiomEClass = createEClass(DG_AXIOM);
    createEReference(dgAxiomEClass, DG_AXIOM__ANNOTATION);
    createEReference(dgAxiomEClass, DG_AXIOM__DG_NODES);
    createEReference(dgAxiomEClass, DG_AXIOM__DG_EDGES);
    createEReference(dgAxiomEClass, DG_AXIOM__MAIN_CLASSES);

    dgNodesEClass = createEClass(DG_NODES);
    createEReference(dgNodesEClass, DG_NODES__NODE_ASSERTION);

    nodeAssertionEClass = createEClass(NODE_ASSERTION);
    createEReference(nodeAssertionEClass, NODE_ASSERTION__CLASS);
    createEReference(nodeAssertionEClass, NODE_ASSERTION__DG_NODE);

    dgEdgesEClass = createEClass(DG_EDGES);
    createEReference(dgEdgesEClass, DG_EDGES__EDGE_ASSERTION);

    edgeAssertionEClass = createEClass(EDGE_ASSERTION);
    createEReference(edgeAssertionEClass, EDGE_ASSERTION__OBJECT_PROPERTY);
    createEReference(edgeAssertionEClass, EDGE_ASSERTION__DG_NODE1);
    createEReference(edgeAssertionEClass, EDGE_ASSERTION__DG_NODE2);

    mainClassesEClass = createEClass(MAIN_CLASSES);
    createEReference(mainClassesEClass, MAIN_CLASSES__CLASS);

    expressionEClass = createEClass(EXPRESSION);

    templateParameterEClass = createEClass(TEMPLATE_PARAMETER);
    createEReference(templateParameterEClass, TEMPLATE_PARAMETER__SIGNATURE);
    createEReference(templateParameterEClass, TEMPLATE_PARAMETER__PARAMETERED_ELEMENT);
    createEReference(templateParameterEClass, TEMPLATE_PARAMETER__PARAMETER_SUBSTITUTION);

    parameterableElementEClass = createEClass(PARAMETERABLE_ELEMENT);
    createEReference(parameterableElementEClass, PARAMETERABLE_ELEMENT__TEMPLATE_PARAMETER);

    templateSignatureEClass = createEClass(TEMPLATE_SIGNATURE);
    createEReference(templateSignatureEClass, TEMPLATE_SIGNATURE__OWNED_PARAMETER);
    createEReference(templateSignatureEClass, TEMPLATE_SIGNATURE__TEMPLATE);

    templateableElementEClass = createEClass(TEMPLATEABLE_ELEMENT);
    createEReference(templateableElementEClass, TEMPLATEABLE_ELEMENT__OWNED_TEMPLATE_SIGNATURE);
    createEReference(templateableElementEClass, TEMPLATEABLE_ELEMENT__TEMPLATE_BINDING);

    packageEClass = createEClass(PACKAGE);
    createEReference(packageEClass, PACKAGE__EXPRESSIONS);
    createEReference(packageEClass, PACKAGE__AXIOMS);
    createEAttribute(packageEClass, PACKAGE__PACKAGE_URI);

    classifierTemplateParameterEClass = createEClass(CLASSIFIER_TEMPLATE_PARAMETER);

    templateParameterSubstitutionEClass = createEClass(TEMPLATE_PARAMETER_SUBSTITUTION);
    createEReference(templateParameterSubstitutionEClass, TEMPLATE_PARAMETER_SUBSTITUTION__ACTUAL);
    createEReference(templateParameterSubstitutionEClass, TEMPLATE_PARAMETER_SUBSTITUTION__FORMAL);
    createEReference(templateParameterSubstitutionEClass, TEMPLATE_PARAMETER_SUBSTITUTION__TEMPLATE_BINDING);

    templateBindingEClass = createEClass(TEMPLATE_BINDING);
    createEReference(templateBindingEClass, TEMPLATE_BINDING__PARAMETER_SUBSTITUTION);
    createEReference(templateBindingEClass, TEMPLATE_BINDING__BOUND_ELEMENT);
    createEReference(templateBindingEClass, TEMPLATE_BINDING__SIGNATURE);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private boolean isInitialized = false;

  /**
   * Complete the initialization of the package and its meta-model.  This
   * method is guarded to have no affect on any invocation but its first.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void initializePackageContents()
  {
    if (isInitialized) return;
    isInitialized = true;

    // Initialize package
    setName(eNAME);
    setNsPrefix(eNS_PREFIX);
    setNsURI(eNS_URI);

    // Create type parameters

    // Set bounds for type parameters

    // Add supertypes to classes
    iriEClass.getESuperTypes().add(this.getAnnotationSubject());
    iriEClass.getESuperTypes().add(this.getAnnotationValue());
    fullIRIEClass.getESuperTypes().add(this.getIRI());
    abbreviatedIRIEClass.getESuperTypes().add(this.getIRI());
    commentEClass.getESuperTypes().add(this.getAxiom());
    declarationEClass.getESuperTypes().add(this.getAxiom());
    declarationEClass.getESuperTypes().add(this.getAnnotationAxiom());
    classDeclarationEClass.getESuperTypes().add(this.getDeclaration());
    datatypeDeclarationEClass.getESuperTypes().add(this.getDeclaration());
    objectPropertyDeclarationEClass.getESuperTypes().add(this.getDeclaration());
    dataPropertyDeclarationEClass.getESuperTypes().add(this.getDeclaration());
    annotationPropertyDeclarationEClass.getESuperTypes().add(this.getDeclaration());
    namedIndividualDeclarationEClass.getESuperTypes().add(this.getDeclaration());
    annotationAxiomEClass.getESuperTypes().add(this.getAxiom());
    annotationAssertionEClass.getESuperTypes().add(this.getAnnotationAxiom());
    subAnnotationPropertyOfEClass.getESuperTypes().add(this.getAnnotationAxiom());
    annotationPropertyDomainEClass.getESuperTypes().add(this.getAnnotationAxiom());
    annotationPropertyRangeEClass.getESuperTypes().add(this.getAnnotationAxiom());
    annotationPropertyEClass.getESuperTypes().add(this.getEntity());
    classEClass.getESuperTypes().add(this.getEntity());
    classEClass.getESuperTypes().add(this.getClassExpression());
    classEClass.getESuperTypes().add(this.getParameterableElement());
    dataPropertyEClass.getESuperTypes().add(this.getEntity());
    dataPropertyEClass.getESuperTypes().add(this.getDataPropertyExpression());
    dataPropertyEClass.getESuperTypes().add(this.getParameterableElement());
    datatypeEClass.getESuperTypes().add(this.getDataRange());
    datatypeEClass.getESuperTypes().add(this.getEntity());
    objectPropertyEClass.getESuperTypes().add(this.getEntity());
    objectPropertyEClass.getESuperTypes().add(this.getObjectPropertyExpression());
    objectPropertyEClass.getESuperTypes().add(this.getParameterableElement());
    individualEClass.getESuperTypes().add(this.getIArg());
    namedIndividualEClass.getESuperTypes().add(this.getEntity());
    namedIndividualEClass.getESuperTypes().add(this.getIndividual());
    namedIndividualEClass.getESuperTypes().add(this.getParameterableElement());
    anonymousIndividualEClass.getESuperTypes().add(this.getIndividual());
    anonymousIndividualEClass.getESuperTypes().add(this.getAnnotationSubject());
    anonymousIndividualEClass.getESuperTypes().add(this.getAnnotationValue());
    literalEClass.getESuperTypes().add(this.getAnnotationValue());
    literalEClass.getESuperTypes().add(this.getDArg());
    objectPropertyExpressionEClass.getESuperTypes().add(this.getSubObjectPropertyExpression());
    inverseObjectPropertyEClass.getESuperTypes().add(this.getObjectPropertyExpression());
    inverseObjectPropertyEClass.getESuperTypes().add(this.getExpression());
    dataIntersectionOfEClass.getESuperTypes().add(this.getDataRange());
    dataIntersectionOfEClass.getESuperTypes().add(this.getExpression());
    dataUnionOfEClass.getESuperTypes().add(this.getDataRange());
    dataUnionOfEClass.getESuperTypes().add(this.getExpression());
    dataComplementOfEClass.getESuperTypes().add(this.getDataRange());
    dataComplementOfEClass.getESuperTypes().add(this.getExpression());
    dataOneOfEClass.getESuperTypes().add(this.getDataRange());
    dataOneOfEClass.getESuperTypes().add(this.getExpression());
    datatypeRestrictionEClass.getESuperTypes().add(this.getDataRange());
    datatypeRestrictionEClass.getESuperTypes().add(this.getExpression());
    classExpressionEClass.getESuperTypes().add(this.getParameterableElement());
    objectIntersectionOfEClass.getESuperTypes().add(this.getClassExpression());
    objectIntersectionOfEClass.getESuperTypes().add(this.getExpression());
    objectUnionOfEClass.getESuperTypes().add(this.getClassExpression());
    objectUnionOfEClass.getESuperTypes().add(this.getExpression());
    objectComplementOfEClass.getESuperTypes().add(this.getClassExpression());
    objectComplementOfEClass.getESuperTypes().add(this.getExpression());
    objectOneOfEClass.getESuperTypes().add(this.getClassExpression());
    objectOneOfEClass.getESuperTypes().add(this.getExpression());
    objectSomeValuesFromEClass.getESuperTypes().add(this.getClassExpression());
    objectSomeValuesFromEClass.getESuperTypes().add(this.getExpression());
    objectAllValuesFromEClass.getESuperTypes().add(this.getClassExpression());
    objectAllValuesFromEClass.getESuperTypes().add(this.getExpression());
    objectHasSelfEClass.getESuperTypes().add(this.getClassExpression());
    objectHasSelfEClass.getESuperTypes().add(this.getExpression());
    objectHasValueEClass.getESuperTypes().add(this.getClassExpression());
    objectHasValueEClass.getESuperTypes().add(this.getExpression());
    objectMinCardinalityEClass.getESuperTypes().add(this.getClassExpression());
    objectMinCardinalityEClass.getESuperTypes().add(this.getExpression());
    objectMaxCardinalityEClass.getESuperTypes().add(this.getClassExpression());
    objectMaxCardinalityEClass.getESuperTypes().add(this.getExpression());
    objectExactCardinalityEClass.getESuperTypes().add(this.getClassExpression());
    objectExactCardinalityEClass.getESuperTypes().add(this.getExpression());
    dataSomeValuesFromEClass.getESuperTypes().add(this.getClassExpression());
    dataSomeValuesFromEClass.getESuperTypes().add(this.getExpression());
    dataAllValuesFromEClass.getESuperTypes().add(this.getClassExpression());
    dataAllValuesFromEClass.getESuperTypes().add(this.getExpression());
    dataHasValueEClass.getESuperTypes().add(this.getClassExpression());
    dataHasValueEClass.getESuperTypes().add(this.getExpression());
    dataMinCardinalityEClass.getESuperTypes().add(this.getClassExpression());
    dataMinCardinalityEClass.getESuperTypes().add(this.getExpression());
    dataMaxCardinalityEClass.getESuperTypes().add(this.getClassExpression());
    dataMaxCardinalityEClass.getESuperTypes().add(this.getExpression());
    dataExactCardinalityEClass.getESuperTypes().add(this.getClassExpression());
    dataExactCardinalityEClass.getESuperTypes().add(this.getExpression());
    classAxiomEClass.getESuperTypes().add(this.getAxiom());
    classAxiomEClass.getESuperTypes().add(this.getAnnotationAxiom());
    subClassOfEClass.getESuperTypes().add(this.getClassAxiom());
    equivalentClassesEClass.getESuperTypes().add(this.getClassAxiom());
    disjointClassesEClass.getESuperTypes().add(this.getClassAxiom());
    disjointUnionEClass.getESuperTypes().add(this.getClassAxiom());
    objectPropertyAxiomEClass.getESuperTypes().add(this.getAxiom());
    objectPropertyAxiomEClass.getESuperTypes().add(this.getAnnotationAxiom());
    subObjectPropertyOfEClass.getESuperTypes().add(this.getObjectPropertyAxiom());
    objectPropertyChainEClass.getESuperTypes().add(this.getSubObjectPropertyExpression());
    equivalentObjectPropertiesEClass.getESuperTypes().add(this.getObjectPropertyAxiom());
    disjointObjectPropertiesEClass.getESuperTypes().add(this.getObjectPropertyAxiom());
    objectPropertyDomainEClass.getESuperTypes().add(this.getObjectPropertyAxiom());
    objectPropertyRangeEClass.getESuperTypes().add(this.getObjectPropertyAxiom());
    inverseObjectPropertiesEClass.getESuperTypes().add(this.getObjectPropertyAxiom());
    functionalObjectPropertyEClass.getESuperTypes().add(this.getObjectPropertyAxiom());
    inverseFunctionalObjectPropertyEClass.getESuperTypes().add(this.getObjectPropertyAxiom());
    reflexiveObjectPropertyEClass.getESuperTypes().add(this.getObjectPropertyAxiom());
    irreflexiveObjectPropertyEClass.getESuperTypes().add(this.getObjectPropertyAxiom());
    symmetricObjectPropertyEClass.getESuperTypes().add(this.getObjectPropertyAxiom());
    asymmetricObjectPropertyEClass.getESuperTypes().add(this.getObjectPropertyAxiom());
    transitiveObjectPropertyEClass.getESuperTypes().add(this.getObjectPropertyAxiom());
    dataPropertyAxiomEClass.getESuperTypes().add(this.getAxiom());
    dataPropertyAxiomEClass.getESuperTypes().add(this.getAnnotationAxiom());
    subDataPropertyOfEClass.getESuperTypes().add(this.getDataPropertyAxiom());
    equivalentDataPropertiesEClass.getESuperTypes().add(this.getDataPropertyAxiom());
    disjointDataPropertiesEClass.getESuperTypes().add(this.getDataPropertyAxiom());
    dataPropertyDomainEClass.getESuperTypes().add(this.getDataPropertyAxiom());
    dataPropertyRangeEClass.getESuperTypes().add(this.getDataPropertyAxiom());
    functionalDataPropertyEClass.getESuperTypes().add(this.getDataPropertyAxiom());
    datatypeDefinitionEClass.getESuperTypes().add(this.getAxiom());
    datatypeDefinitionEClass.getESuperTypes().add(this.getAnnotationAxiom());
    hasKeyEClass.getESuperTypes().add(this.getAxiom());
    hasKeyEClass.getESuperTypes().add(this.getAnnotationAxiom());
    assertionEClass.getESuperTypes().add(this.getAxiom());
    assertionEClass.getESuperTypes().add(this.getAnnotationAxiom());
    sameIndividualEClass.getESuperTypes().add(this.getAssertion());
    differentIndividualsEClass.getESuperTypes().add(this.getAssertion());
    classAssertionEClass.getESuperTypes().add(this.getAssertion());
    objectPropertyAssertionEClass.getESuperTypes().add(this.getAssertion());
    negativeObjectPropertyAssertionEClass.getESuperTypes().add(this.getAssertion());
    dataPropertyAssertionEClass.getESuperTypes().add(this.getAssertion());
    negativeDataPropertyAssertionEClass.getESuperTypes().add(this.getAssertion());
    ruleEClass.getESuperTypes().add(this.getAxiom());
    dlSafeRuleEClass.getESuperTypes().add(this.getRule());
    classAtomEClass.getESuperTypes().add(this.getAtom());
    classAtomEClass.getESuperTypes().add(this.getDGAtom());
    dataRangeAtomEClass.getESuperTypes().add(this.getAtom());
    objectPropertyAtomEClass.getESuperTypes().add(this.getAtom());
    objectPropertyAtomEClass.getESuperTypes().add(this.getDGAtom());
    dataPropetyAtomEClass.getESuperTypes().add(this.getAtom());
    builtInAtomEClass.getESuperTypes().add(this.getAtom());
    sameIndividualAtomEClass.getESuperTypes().add(this.getAtom());
    differentIndividualsAtomEClass.getESuperTypes().add(this.getAtom());
    variableEClass.getESuperTypes().add(this.getIArg());
    variableEClass.getESuperTypes().add(this.getDArg());
    dgRuleEClass.getESuperTypes().add(this.getRule());
    dgAxiomEClass.getESuperTypes().add(this.getAxiom());
    packageEClass.getESuperTypes().add(this.getTemplateableElement());
    classifierTemplateParameterEClass.getESuperTypes().add(this.getTemplateParameter());

    // Initialize classes and features; add operations and parameters
    initEClass(iriEClass, west.twouse.language.owl2fs.IRI.class, "IRI", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getIRI_Value(), ecorePackage.getEString(), "value", null, 1, 1, west.twouse.language.owl2fs.IRI.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

    initEClass(fullIRIEClass, FullIRI.class, "FullIRI", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(abbreviatedIRIEClass, AbbreviatedIRI.class, "AbbreviatedIRI", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getAbbreviatedIRI_Prefix(), ecorePackage.getEString(), "prefix", null, 0, 1, AbbreviatedIRI.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(ontologyDocumentEClass, OntologyDocument.class, "OntologyDocument", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getOntologyDocument_Ontology(), this.getOntology(), null, "ontology", null, 1, 1, OntologyDocument.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getOntologyDocument_PrefixDefinition(), this.getPrefixDefinition(), null, "prefixDefinition", null, 0, -1, OntologyDocument.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getOntologyDocument_Comment(), this.getComment(), null, "comment", null, 0, -1, OntologyDocument.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(prefixDefinitionEClass, PrefixDefinition.class, "PrefixDefinition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getPrefixDefinition_Pref(), ecorePackage.getEString(), "pref", null, 0, 1, PrefixDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getPrefixDefinition_Namespace(), this.getFullIRI(), null, "namespace", null, 1, 1, PrefixDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(ontologyEClass, Ontology.class, "Ontology", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getOntology_Expressions(), this.getExpression(), null, "expressions", null, 0, -1, Ontology.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
    initEReference(getOntology_Packages(), this.getPackage(), null, "packages", null, 0, -1, Ontology.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getOntology_Comment(), this.getComment(), null, "comment", null, 0, -1, Ontology.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getOntology_OntologyIRI(), this.getIRI(), null, "ontologyIRI", null, 0, 1, Ontology.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getOntology_VersionIRI(), this.getIRI(), null, "versionIRI", null, 0, 1, Ontology.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getOntology_DirectlyImportsDocuments(), this.getIRI(), null, "directlyImportsDocuments", null, 0, -1, Ontology.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
    initEReference(getOntology_OntologyAnnotations(), this.getAnnotation(), null, "ontologyAnnotations", null, 0, -1, Ontology.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getOntology_Axioms(), this.getAxiom(), null, "axioms", null, 0, -1, Ontology.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

    EOperation op = addEOperation(ontologyEClass, ecorePackage.getEBoolean(), "versionURIrequiresontologyURItobespecified", 0, 1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);

    initEClass(axiomEClass, Axiom.class, "Axiom", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(commentEClass, Comment.class, "Comment", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getComment_Comment(), ecorePackage.getEString(), "comment", null, 1, 1, Comment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(declarationEClass, Declaration.class, "Declaration", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getDeclaration_Entity(), this.getEntity(), null, "entity", null, 1, 1, Declaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(classDeclarationEClass, ClassDeclaration.class, "ClassDeclaration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(datatypeDeclarationEClass, DatatypeDeclaration.class, "DatatypeDeclaration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(objectPropertyDeclarationEClass, ObjectPropertyDeclaration.class, "ObjectPropertyDeclaration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(dataPropertyDeclarationEClass, DataPropertyDeclaration.class, "DataPropertyDeclaration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(annotationPropertyDeclarationEClass, AnnotationPropertyDeclaration.class, "AnnotationPropertyDeclaration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(namedIndividualDeclarationEClass, NamedIndividualDeclaration.class, "NamedIndividualDeclaration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(entityEClass, Entity.class, "Entity", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getEntity_EntityIRI(), this.getIRI(), null, "entityIRI", null, 1, 1, Entity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(annotationSubjectEClass, AnnotationSubject.class, "AnnotationSubject", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(annotationValueEClass, AnnotationValue.class, "AnnotationValue", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(annotationEClass, Annotation.class, "Annotation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getAnnotation_AnnotationAnnotations(), this.getAnnotation(), null, "annotationAnnotations", null, 0, -1, Annotation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getAnnotation_AnnotationProperty(), this.getAnnotationProperty(), null, "annotationProperty", null, 1, 1, Annotation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
    initEReference(getAnnotation_AnnotationValue(), this.getAnnotationValue(), null, "annotationValue", null, 1, 1, Annotation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(annotationAxiomEClass, AnnotationAxiom.class, "AnnotationAxiom", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getAnnotationAxiom_AxiomAnnotations(), this.getAnnotation(), null, "axiomAnnotations", null, 0, -1, AnnotationAxiom.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(annotationAssertionEClass, AnnotationAssertion.class, "AnnotationAssertion", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getAnnotationAssertion_AnnotationProperty(), this.getAnnotationProperty(), null, "annotationProperty", null, 1, 1, AnnotationAssertion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getAnnotationAssertion_AnnotationSubject(), this.getAnnotationSubject(), null, "annotationSubject", null, 1, 1, AnnotationAssertion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getAnnotationAssertion_AnnotationValue(), this.getAnnotationValue(), null, "annotationValue", null, 1, 1, AnnotationAssertion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(subAnnotationPropertyOfEClass, SubAnnotationPropertyOf.class, "SubAnnotationPropertyOf", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getSubAnnotationPropertyOf_SubAnnotationProperty(), this.getAnnotationProperty(), null, "subAnnotationProperty", null, 1, 1, SubAnnotationPropertyOf.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getSubAnnotationPropertyOf_SuperAnnotationProperty(), this.getAnnotationProperty(), null, "superAnnotationProperty", null, 1, 1, SubAnnotationPropertyOf.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(annotationPropertyDomainEClass, AnnotationPropertyDomain.class, "AnnotationPropertyDomain", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getAnnotationPropertyDomain_AnnotationProperty(), this.getAnnotationProperty(), null, "annotationProperty", null, 1, 1, AnnotationPropertyDomain.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getAnnotationPropertyDomain_Iri(), this.getIRI(), null, "iri", null, 1, 1, AnnotationPropertyDomain.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(annotationPropertyRangeEClass, AnnotationPropertyRange.class, "AnnotationPropertyRange", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getAnnotationPropertyRange_AnnotationProperty(), this.getAnnotationProperty(), null, "annotationProperty", null, 1, 1, AnnotationPropertyRange.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getAnnotationPropertyRange_Iri(), this.getIRI(), null, "iri", null, 1, 1, AnnotationPropertyRange.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(annotationPropertyEClass, AnnotationProperty.class, "AnnotationProperty", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(classEClass, west.twouse.language.owl2fs.Class.class, "Class", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(dataPropertyEClass, DataProperty.class, "DataProperty", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(datatypeEClass, Datatype.class, "Datatype", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(objectPropertyEClass, ObjectProperty.class, "ObjectProperty", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(individualEClass, Individual.class, "Individual", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(namedIndividualEClass, NamedIndividual.class, "NamedIndividual", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(anonymousIndividualEClass, AnonymousIndividual.class, "AnonymousIndividual", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getAnonymousIndividual_NodeID(), ecorePackage.getEString(), "nodeID", null, 1, 1, AnonymousIndividual.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

    initEClass(literalEClass, Literal.class, "Literal", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getLiteral_LexicalValue(), ecorePackage.getEString(), "lexicalValue", null, 1, 1, Literal.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
    initEReference(getLiteral_Datatype(), this.getDatatype(), null, "datatype", null, 0, 1, Literal.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
    initEAttribute(getLiteral_LanguageTag(), ecorePackage.getEString(), "languageTag", null, 0, 1, Literal.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(objectPropertyExpressionEClass, ObjectPropertyExpression.class, "ObjectPropertyExpression", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(inverseObjectPropertyEClass, InverseObjectProperty.class, "InverseObjectProperty", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getInverseObjectProperty_ObjectProperty(), this.getObjectProperty(), null, "objectProperty", null, 1, 1, InverseObjectProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

    initEClass(dataPropertyExpressionEClass, DataPropertyExpression.class, "DataPropertyExpression", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(dataRangeEClass, DataRange.class, "DataRange", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(dataIntersectionOfEClass, DataIntersectionOf.class, "DataIntersectionOf", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getDataIntersectionOf_DataRange(), this.getDataRange(), null, "dataRange", null, 2, -1, DataIntersectionOf.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

    initEClass(dataUnionOfEClass, DataUnionOf.class, "DataUnionOf", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getDataUnionOf_DataRange(), this.getDataRange(), null, "dataRange", null, 2, -1, DataUnionOf.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

    initEClass(dataComplementOfEClass, DataComplementOf.class, "DataComplementOf", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getDataComplementOf_DataRange(), this.getDataRange(), null, "dataRange", null, 1, 1, DataComplementOf.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

    initEClass(dataOneOfEClass, DataOneOf.class, "DataOneOf", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getDataOneOf_Constants(), this.getLiteral(), null, "constants", null, 1, -1, DataOneOf.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

    initEClass(datatypeRestrictionEClass, DatatypeRestriction.class, "DatatypeRestriction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getDatatypeRestriction_Datatype(), this.getDatatype(), null, "datatype", null, 1, 1, DatatypeRestriction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
    initEReference(getDatatypeRestriction_Restrictions(), this.getFacetConstraintPair(), null, "restrictions", null, 1, -1, DatatypeRestriction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

    initEClass(facetConstraintPairEClass, FacetConstraintPair.class, "FacetConstraintPair", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getFacetConstraintPair_Constant(), this.getLiteral(), null, "constant", null, 1, 1, FacetConstraintPair.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
    initEReference(getFacetConstraintPair_Facet(), this.getIRI(), null, "facet", null, 1, 1, FacetConstraintPair.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(classExpressionEClass, ClassExpression.class, "ClassExpression", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(objectIntersectionOfEClass, ObjectIntersectionOf.class, "ObjectIntersectionOf", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getObjectIntersectionOf_ClassExpressions(), this.getClassExpression(), null, "classExpressions", null, 2, -1, ObjectIntersectionOf.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

    initEClass(objectUnionOfEClass, ObjectUnionOf.class, "ObjectUnionOf", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getObjectUnionOf_ClassExpressions(), this.getClassExpression(), null, "classExpressions", null, 2, -1, ObjectUnionOf.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

    initEClass(objectComplementOfEClass, ObjectComplementOf.class, "ObjectComplementOf", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getObjectComplementOf_ClassExpression(), this.getClassExpression(), null, "classExpression", null, 1, 1, ObjectComplementOf.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

    initEClass(objectOneOfEClass, ObjectOneOf.class, "ObjectOneOf", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getObjectOneOf_Individuals(), this.getIndividual(), null, "individuals", null, 1, -1, ObjectOneOf.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

    initEClass(objectSomeValuesFromEClass, ObjectSomeValuesFrom.class, "ObjectSomeValuesFrom", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getObjectSomeValuesFrom_ClassExpression(), this.getClassExpression(), null, "classExpression", null, 1, 1, ObjectSomeValuesFrom.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
    initEReference(getObjectSomeValuesFrom_ObjectPropertyExpression(), this.getObjectPropertyExpression(), null, "objectPropertyExpression", null, 1, 1, ObjectSomeValuesFrom.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

    initEClass(objectAllValuesFromEClass, ObjectAllValuesFrom.class, "ObjectAllValuesFrom", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getObjectAllValuesFrom_ClassExpression(), this.getClassExpression(), null, "classExpression", null, 1, 1, ObjectAllValuesFrom.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
    initEReference(getObjectAllValuesFrom_ObjectPropertyExpression(), this.getObjectPropertyExpression(), null, "objectPropertyExpression", null, 1, 1, ObjectAllValuesFrom.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

    initEClass(objectHasSelfEClass, ObjectHasSelf.class, "ObjectHasSelf", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getObjectHasSelf_ObjectPropertyExpression(), this.getObjectPropertyExpression(), null, "objectPropertyExpression", null, 1, 1, ObjectHasSelf.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

    initEClass(objectHasValueEClass, ObjectHasValue.class, "ObjectHasValue", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getObjectHasValue_ObjectPropertyExpression(), this.getObjectPropertyExpression(), null, "objectPropertyExpression", null, 1, 1, ObjectHasValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
    initEReference(getObjectHasValue_Individual(), this.getIndividual(), null, "individual", null, 1, 1, ObjectHasValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

    initEClass(objectMinCardinalityEClass, ObjectMinCardinality.class, "ObjectMinCardinality", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getObjectMinCardinality_Cardinality(), ecorePackage.getEInt(), "cardinality", null, 1, 1, ObjectMinCardinality.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
    initEReference(getObjectMinCardinality_ClassExpression(), this.getClassExpression(), null, "classExpression", null, 0, 1, ObjectMinCardinality.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
    initEReference(getObjectMinCardinality_ObjectPropertyExpression(), this.getObjectPropertyExpression(), null, "objectPropertyExpression", null, 1, 1, ObjectMinCardinality.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

    op = addEOperation(objectMinCardinalityEClass, ecorePackage.getEBoolean(), "Thecardinalitymustbenonnegative", 0, 1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);

    initEClass(objectMaxCardinalityEClass, ObjectMaxCardinality.class, "ObjectMaxCardinality", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getObjectMaxCardinality_Cardinality(), ecorePackage.getEInt(), "cardinality", null, 1, 1, ObjectMaxCardinality.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
    initEReference(getObjectMaxCardinality_ClassExpression(), this.getClassExpression(), null, "classExpression", null, 0, 1, ObjectMaxCardinality.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
    initEReference(getObjectMaxCardinality_ObjectPropertyExpression(), this.getObjectPropertyExpression(), null, "objectPropertyExpression", null, 1, 1, ObjectMaxCardinality.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

    op = addEOperation(objectMaxCardinalityEClass, ecorePackage.getEBoolean(), "Thecardinalitymustbenonnegative", 0, 1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);

    initEClass(objectExactCardinalityEClass, ObjectExactCardinality.class, "ObjectExactCardinality", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getObjectExactCardinality_Cardinality(), ecorePackage.getEInt(), "cardinality", null, 1, 1, ObjectExactCardinality.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
    initEReference(getObjectExactCardinality_ClassExpression(), this.getClassExpression(), null, "classExpression", null, 0, 1, ObjectExactCardinality.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
    initEReference(getObjectExactCardinality_ObjectPropertyExpression(), this.getObjectPropertyExpression(), null, "objectPropertyExpression", null, 1, 1, ObjectExactCardinality.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

    op = addEOperation(objectExactCardinalityEClass, ecorePackage.getEBoolean(), "Thecardinalitymustbenonnegative", 0, 1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);

    initEClass(dataSomeValuesFromEClass, DataSomeValuesFrom.class, "DataSomeValuesFrom", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getDataSomeValuesFrom_DataRange(), this.getDataRange(), null, "dataRange", null, 1, 1, DataSomeValuesFrom.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
    initEReference(getDataSomeValuesFrom_DataPropertyExpressions(), this.getDataPropertyExpression(), null, "dataPropertyExpressions", null, 1, -1, DataSomeValuesFrom.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(dataAllValuesFromEClass, DataAllValuesFrom.class, "DataAllValuesFrom", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getDataAllValuesFrom_DataRange(), this.getDataRange(), null, "dataRange", null, 1, 1, DataAllValuesFrom.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
    initEReference(getDataAllValuesFrom_DataPropertyExpressions(), this.getDataPropertyExpression(), null, "dataPropertyExpressions", null, 1, -1, DataAllValuesFrom.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(dataHasValueEClass, DataHasValue.class, "DataHasValue", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getDataHasValue_Constant(), this.getLiteral(), null, "constant", null, 1, 1, DataHasValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
    initEReference(getDataHasValue_DataPropertyExpression(), this.getDataPropertyExpression(), null, "dataPropertyExpression", null, 1, 1, DataHasValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

    initEClass(dataMinCardinalityEClass, DataMinCardinality.class, "DataMinCardinality", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getDataMinCardinality_Cardinality(), ecorePackage.getEInt(), "cardinality", null, 1, 1, DataMinCardinality.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
    initEReference(getDataMinCardinality_DataRange(), this.getDataRange(), null, "dataRange", null, 0, 1, DataMinCardinality.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
    initEReference(getDataMinCardinality_DataPropertyExpression(), this.getDataPropertyExpression(), null, "dataPropertyExpression", null, 1, 1, DataMinCardinality.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

    op = addEOperation(dataMinCardinalityEClass, ecorePackage.getEBoolean(), "Thecardinalitymustbenonnegative", 0, 1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);

    initEClass(dataMaxCardinalityEClass, DataMaxCardinality.class, "DataMaxCardinality", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getDataMaxCardinality_Cardinality(), ecorePackage.getEInt(), "cardinality", null, 1, 1, DataMaxCardinality.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
    initEReference(getDataMaxCardinality_DataRange(), this.getDataRange(), null, "dataRange", null, 0, 1, DataMaxCardinality.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
    initEReference(getDataMaxCardinality_DataPropertyExpression(), this.getDataPropertyExpression(), null, "dataPropertyExpression", null, 1, 1, DataMaxCardinality.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

    op = addEOperation(dataMaxCardinalityEClass, ecorePackage.getEBoolean(), "Thecardinalitymustbenonnegative", 0, 1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);

    initEClass(dataExactCardinalityEClass, DataExactCardinality.class, "DataExactCardinality", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getDataExactCardinality_Cardinality(), ecorePackage.getEInt(), "cardinality", null, 1, 1, DataExactCardinality.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
    initEReference(getDataExactCardinality_DataRange(), this.getDataRange(), null, "dataRange", null, 0, 1, DataExactCardinality.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
    initEReference(getDataExactCardinality_DataPropertyExpression(), this.getDataPropertyExpression(), null, "dataPropertyExpression", null, 1, 1, DataExactCardinality.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

    op = addEOperation(dataExactCardinalityEClass, ecorePackage.getEBoolean(), "Thecardinalitymustbenonnegative", 0, 1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);

    initEClass(classAxiomEClass, ClassAxiom.class, "ClassAxiom", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(subClassOfEClass, SubClassOf.class, "SubClassOf", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getSubClassOf_SubClassExpression(), this.getClassExpression(), null, "subClassExpression", null, 1, 1, SubClassOf.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
    initEReference(getSubClassOf_SuperClassExpression(), this.getClassExpression(), null, "superClassExpression", null, 1, 1, SubClassOf.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

    initEClass(equivalentClassesEClass, EquivalentClasses.class, "EquivalentClasses", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getEquivalentClasses_EquivalentClassExpressions(), this.getClassExpression(), null, "equivalentClassExpressions", null, 2, -1, EquivalentClasses.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(disjointClassesEClass, DisjointClasses.class, "DisjointClasses", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getDisjointClasses_DisjointClassExpressions(), this.getClassExpression(), null, "disjointClassExpressions", null, 2, -1, DisjointClasses.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

    initEClass(disjointUnionEClass, DisjointUnion.class, "DisjointUnion", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getDisjointUnion_UnionClass(), this.getClass_(), null, "unionClass", null, 1, 1, DisjointUnion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
    initEReference(getDisjointUnion_DisjointClassExpressions(), this.getClassExpression(), null, "disjointClassExpressions", null, 2, -1, DisjointUnion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

    initEClass(objectPropertyAxiomEClass, ObjectPropertyAxiom.class, "ObjectPropertyAxiom", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(subObjectPropertyOfEClass, SubObjectPropertyOf.class, "SubObjectPropertyOf", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getSubObjectPropertyOf_SubObjectPropertyExpression(), this.getSubObjectPropertyExpression(), null, "subObjectPropertyExpression", null, 1, 1, SubObjectPropertyOf.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getSubObjectPropertyOf_SuperObjectPropertyExpression(), this.getObjectPropertyExpression(), null, "superObjectPropertyExpression", null, 1, 1, SubObjectPropertyOf.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

    initEClass(subObjectPropertyExpressionEClass, SubObjectPropertyExpression.class, "SubObjectPropertyExpression", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(objectPropertyChainEClass, ObjectPropertyChain.class, "ObjectPropertyChain", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getObjectPropertyChain_ObjectPropertyExpressions(), this.getObjectPropertyExpression(), null, "objectPropertyExpressions", null, 2, -1, ObjectPropertyChain.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

    initEClass(equivalentObjectPropertiesEClass, EquivalentObjectProperties.class, "EquivalentObjectProperties", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getEquivalentObjectProperties_ObjectPropertyExpressions(), this.getObjectPropertyExpression(), null, "objectPropertyExpressions", null, 2, -1, EquivalentObjectProperties.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

    initEClass(disjointObjectPropertiesEClass, DisjointObjectProperties.class, "DisjointObjectProperties", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getDisjointObjectProperties_ObjectPropertyExpressions(), this.getObjectPropertyExpression(), null, "objectPropertyExpressions", null, 2, -1, DisjointObjectProperties.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

    initEClass(objectPropertyDomainEClass, ObjectPropertyDomain.class, "ObjectPropertyDomain", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getObjectPropertyDomain_Domain(), this.getClassExpression(), null, "domain", null, 1, 1, ObjectPropertyDomain.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
    initEReference(getObjectPropertyDomain_ObjectPropertyExpression(), this.getObjectPropertyExpression(), null, "objectPropertyExpression", null, 1, 1, ObjectPropertyDomain.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

    initEClass(objectPropertyRangeEClass, ObjectPropertyRange.class, "ObjectPropertyRange", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getObjectPropertyRange_Range(), this.getClassExpression(), null, "range", null, 1, 1, ObjectPropertyRange.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
    initEReference(getObjectPropertyRange_ObjectPropertyExpression(), this.getObjectPropertyExpression(), null, "objectPropertyExpression", null, 1, 1, ObjectPropertyRange.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

    initEClass(inverseObjectPropertiesEClass, InverseObjectProperties.class, "InverseObjectProperties", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getInverseObjectProperties_ObjectPropertyExpression1(), this.getObjectPropertyExpression(), null, "objectPropertyExpression1", null, 1, 1, InverseObjectProperties.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
    initEReference(getInverseObjectProperties_ObjectPropertyExpression2(), this.getObjectPropertyExpression(), null, "objectPropertyExpression2", null, 1, 1, InverseObjectProperties.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

    initEClass(functionalObjectPropertyEClass, FunctionalObjectProperty.class, "FunctionalObjectProperty", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getFunctionalObjectProperty_ObjectPropertyExpression(), this.getObjectPropertyExpression(), null, "objectPropertyExpression", null, 1, 1, FunctionalObjectProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

    initEClass(inverseFunctionalObjectPropertyEClass, InverseFunctionalObjectProperty.class, "InverseFunctionalObjectProperty", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getInverseFunctionalObjectProperty_ObjectPropertyExpression(), this.getObjectPropertyExpression(), null, "objectPropertyExpression", null, 1, 1, InverseFunctionalObjectProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

    initEClass(reflexiveObjectPropertyEClass, ReflexiveObjectProperty.class, "ReflexiveObjectProperty", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getReflexiveObjectProperty_ObjectPropertyExpression(), this.getObjectPropertyExpression(), null, "objectPropertyExpression", null, 1, 1, ReflexiveObjectProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

    initEClass(irreflexiveObjectPropertyEClass, IrreflexiveObjectProperty.class, "IrreflexiveObjectProperty", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getIrreflexiveObjectProperty_ObjectPropertyExpression(), this.getObjectPropertyExpression(), null, "objectPropertyExpression", null, 1, 1, IrreflexiveObjectProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

    initEClass(symmetricObjectPropertyEClass, SymmetricObjectProperty.class, "SymmetricObjectProperty", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getSymmetricObjectProperty_ObjectPropertyExpression(), this.getObjectPropertyExpression(), null, "objectPropertyExpression", null, 1, 1, SymmetricObjectProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

    initEClass(asymmetricObjectPropertyEClass, AsymmetricObjectProperty.class, "AsymmetricObjectProperty", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getAsymmetricObjectProperty_ObjectPropertyExpression(), this.getObjectPropertyExpression(), null, "objectPropertyExpression", null, 1, 1, AsymmetricObjectProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

    initEClass(transitiveObjectPropertyEClass, TransitiveObjectProperty.class, "TransitiveObjectProperty", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getTransitiveObjectProperty_ObjectPropertyExpression(), this.getObjectPropertyExpression(), null, "objectPropertyExpression", null, 1, 1, TransitiveObjectProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

    initEClass(dataPropertyAxiomEClass, DataPropertyAxiom.class, "DataPropertyAxiom", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(subDataPropertyOfEClass, SubDataPropertyOf.class, "SubDataPropertyOf", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getSubDataPropertyOf_SuperDataPropertyExpression(), this.getDataPropertyExpression(), null, "superDataPropertyExpression", null, 1, 1, SubDataPropertyOf.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
    initEReference(getSubDataPropertyOf_SubDataPropertyExpression(), this.getDataPropertyExpression(), null, "subDataPropertyExpression", null, 1, 1, SubDataPropertyOf.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

    initEClass(equivalentDataPropertiesEClass, EquivalentDataProperties.class, "EquivalentDataProperties", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getEquivalentDataProperties_DataPropertyExpressions(), this.getDataPropertyExpression(), null, "dataPropertyExpressions", null, 2, -1, EquivalentDataProperties.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

    initEClass(disjointDataPropertiesEClass, DisjointDataProperties.class, "DisjointDataProperties", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getDisjointDataProperties_DataPropertyExpressions(), this.getDataPropertyExpression(), null, "dataPropertyExpressions", null, 2, -1, DisjointDataProperties.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

    initEClass(dataPropertyDomainEClass, DataPropertyDomain.class, "DataPropertyDomain", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getDataPropertyDomain_Domain(), this.getClassExpression(), null, "domain", null, 1, 1, DataPropertyDomain.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
    initEReference(getDataPropertyDomain_DataPropertyExpression(), this.getDataPropertyExpression(), null, "dataPropertyExpression", null, 1, 1, DataPropertyDomain.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

    initEClass(dataPropertyRangeEClass, DataPropertyRange.class, "DataPropertyRange", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getDataPropertyRange_Range(), this.getDataRange(), null, "range", null, 1, 1, DataPropertyRange.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
    initEReference(getDataPropertyRange_DataPropertyExpression(), this.getDataPropertyExpression(), null, "dataPropertyExpression", null, 1, 1, DataPropertyRange.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

    op = addEOperation(dataPropertyRangeEClass, ecorePackage.getEBoolean(), "Thedatarangemustbeofarityone", 0, 1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);

    initEClass(functionalDataPropertyEClass, FunctionalDataProperty.class, "FunctionalDataProperty", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getFunctionalDataProperty_DataPropertyExpression(), this.getDataPropertyExpression(), null, "dataPropertyExpression", null, 1, 1, FunctionalDataProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

    initEClass(datatypeDefinitionEClass, DatatypeDefinition.class, "DatatypeDefinition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getDatatypeDefinition_Datatype(), this.getDatatype(), null, "datatype", null, 1, 1, DatatypeDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getDatatypeDefinition_DataRange(), this.getDataRange(), null, "dataRange", null, 1, 1, DatatypeDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(hasKeyEClass, HasKey.class, "HasKey", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getHasKey_ClassExpression(), this.getClassExpression(), null, "classExpression", null, 1, 1, HasKey.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
    initEReference(getHasKey_ObjectPropertyExpressions(), this.getObjectPropertyExpression(), null, "objectPropertyExpressions", null, 0, -1, HasKey.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
    initEReference(getHasKey_DataPropertyExpressions(), this.getDataPropertyExpression(), null, "dataPropertyExpressions", null, 0, -1, HasKey.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

    initEClass(assertionEClass, Assertion.class, "Assertion", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(sameIndividualEClass, SameIndividual.class, "SameIndividual", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getSameIndividual_SameIndividuals(), this.getNamedIndividual(), null, "sameIndividuals", null, 2, -1, SameIndividual.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

    initEClass(differentIndividualsEClass, DifferentIndividuals.class, "DifferentIndividuals", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getDifferentIndividuals_DifferentIndividuals(), this.getNamedIndividual(), null, "differentIndividuals", null, 2, -1, DifferentIndividuals.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

    initEClass(classAssertionEClass, ClassAssertion.class, "ClassAssertion", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getClassAssertion_Individual(), this.getNamedIndividual(), null, "individual", null, 1, 1, ClassAssertion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
    initEReference(getClassAssertion_ClassExpression(), this.getClassExpression(), null, "classExpression", null, 1, 1, ClassAssertion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

    initEClass(objectPropertyAssertionEClass, ObjectPropertyAssertion.class, "ObjectPropertyAssertion", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getObjectPropertyAssertion_ObjectPropertyExpression(), this.getObjectPropertyExpression(), null, "objectPropertyExpression", null, 1, 1, ObjectPropertyAssertion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
    initEReference(getObjectPropertyAssertion_SourceIndividual(), this.getIndividual(), null, "sourceIndividual", null, 1, 1, ObjectPropertyAssertion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
    initEReference(getObjectPropertyAssertion_TargetIndividual(), this.getIndividual(), null, "targetIndividual", null, 1, 1, ObjectPropertyAssertion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

    initEClass(negativeObjectPropertyAssertionEClass, NegativeObjectPropertyAssertion.class, "NegativeObjectPropertyAssertion", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getNegativeObjectPropertyAssertion_ObjectPropertyExpression(), this.getObjectPropertyExpression(), null, "objectPropertyExpression", null, 1, 1, NegativeObjectPropertyAssertion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
    initEReference(getNegativeObjectPropertyAssertion_SourceIndividual(), this.getIndividual(), null, "sourceIndividual", null, 1, 1, NegativeObjectPropertyAssertion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
    initEReference(getNegativeObjectPropertyAssertion_TargetIndividual(), this.getIndividual(), null, "targetIndividual", null, 1, 1, NegativeObjectPropertyAssertion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

    initEClass(dataPropertyAssertionEClass, DataPropertyAssertion.class, "DataPropertyAssertion", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getDataPropertyAssertion_DataPropertyExpression(), this.getDataPropertyExpression(), null, "dataPropertyExpression", null, 1, 1, DataPropertyAssertion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
    initEReference(getDataPropertyAssertion_TargetValue(), this.getLiteral(), null, "targetValue", null, 1, 1, DataPropertyAssertion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getDataPropertyAssertion_SourceIndividual(), this.getIndividual(), null, "sourceIndividual", null, 1, 1, DataPropertyAssertion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

    initEClass(negativeDataPropertyAssertionEClass, NegativeDataPropertyAssertion.class, "NegativeDataPropertyAssertion", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getNegativeDataPropertyAssertion_DataPropertyExpression(), this.getDataPropertyExpression(), null, "dataPropertyExpression", null, 1, 1, NegativeDataPropertyAssertion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
    initEReference(getNegativeDataPropertyAssertion_TargetValue(), this.getLiteral(), null, "targetValue", null, 1, 1, NegativeDataPropertyAssertion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
    initEReference(getNegativeDataPropertyAssertion_SourceIndividual(), this.getIndividual(), null, "sourceIndividual", null, 1, 1, NegativeDataPropertyAssertion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

    initEClass(ruleEClass, Rule.class, "Rule", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(dlSafeRuleEClass, DLSafeRule.class, "DLSafeRule", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getDLSafeRule_Annotation(), this.getAnnotation(), null, "annotation", null, 0, -1, DLSafeRule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getDLSafeRule_BodyAtom(), this.getAtom(), null, "bodyAtom", null, 0, -1, DLSafeRule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getDLSafeRule_HeadAtom(), this.getAtom(), null, "headAtom", null, 0, -1, DLSafeRule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(atomEClass, Atom.class, "Atom", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(classAtomEClass, ClassAtom.class, "ClassAtom", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getClassAtom_ClassExpression(), this.getClassExpression(), null, "classExpression", null, 1, 1, ClassAtom.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getClassAtom_IArg(), this.getIArg(), null, "iArg", null, 1, 1, ClassAtom.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(dataRangeAtomEClass, DataRangeAtom.class, "DataRangeAtom", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getDataRangeAtom_DataRange(), this.getDataRange(), null, "dataRange", null, 1, 1, DataRangeAtom.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getDataRangeAtom_DArg(), this.getDArg(), null, "dArg", null, 1, 1, DataRangeAtom.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(objectPropertyAtomEClass, ObjectPropertyAtom.class, "ObjectPropertyAtom", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getObjectPropertyAtom_ObjectPropertyExpression(), this.getObjectPropertyExpression(), null, "objectPropertyExpression", null, 1, 1, ObjectPropertyAtom.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getObjectPropertyAtom_IArg1(), this.getIArg(), null, "iArg1", null, 1, 1, ObjectPropertyAtom.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getObjectPropertyAtom_IArg2(), this.getIArg(), null, "iArg2", null, 1, 1, ObjectPropertyAtom.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(dataPropetyAtomEClass, DataPropetyAtom.class, "DataPropetyAtom", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getDataPropetyAtom_DataProperty(), this.getDataProperty(), null, "dataProperty", null, 1, 1, DataPropetyAtom.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getDataPropetyAtom_IArg(), this.getIArg(), null, "iArg", null, 1, 1, DataPropetyAtom.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
    initEReference(getDataPropetyAtom_DArg(), this.getDArg(), null, "dArg", null, 1, 1, DataPropetyAtom.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

    initEClass(builtInAtomEClass, BuiltInAtom.class, "BuiltInAtom", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getBuiltInAtom_Iri(), this.getIRI(), null, "iri", null, 1, 1, BuiltInAtom.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getBuiltInAtom_DArg(), this.getDArg(), null, "dArg", null, 1, -1, BuiltInAtom.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(sameIndividualAtomEClass, SameIndividualAtom.class, "SameIndividualAtom", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getSameIndividualAtom_IArg1(), this.getIArg(), null, "iArg1", null, 1, 1, SameIndividualAtom.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getSameIndividualAtom_IArg2(), this.getIArg(), null, "iArg2", null, 1, 1, SameIndividualAtom.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(differentIndividualsAtomEClass, DifferentIndividualsAtom.class, "DifferentIndividualsAtom", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getDifferentIndividualsAtom_IArg1(), this.getIArg(), null, "iArg1", null, 1, 1, DifferentIndividualsAtom.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getDifferentIndividualsAtom_IArg2(), this.getIArg(), null, "iArg2", null, 1, 1, DifferentIndividualsAtom.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(iArgEClass, IArg.class, "IArg", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(dArgEClass, DArg.class, "DArg", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(variableEClass, Variable.class, "Variable", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getVariable_Iri(), this.getIRI(), null, "iri", null, 1, 1, Variable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(dgRuleEClass, DGRule.class, "DGRule", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getDGRule_Annotation(), this.getAnnotation(), null, "annotation", null, 0, -1, DGRule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getDGRule_BodyAtom(), this.getDGAtom(), null, "bodyAtom", null, 0, -1, DGRule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getDGRule_HeadAtom(), this.getDGAtom(), null, "headAtom", null, 0, -1, DGRule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(dgAtomEClass, DGAtom.class, "DGAtom", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(dgAxiomEClass, DGAxiom.class, "DGAxiom", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getDGAxiom_Annotation(), this.getAnnotation(), null, "annotation", null, 0, -1, DGAxiom.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getDGAxiom_DgNodes(), this.getDGNodes(), null, "dgNodes", null, 1, 1, DGAxiom.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getDGAxiom_DgEdges(), this.getDGEdges(), null, "dgEdges", null, 1, 1, DGAxiom.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getDGAxiom_MainClasses(), this.getMainClasses(), null, "mainClasses", null, 1, 1, DGAxiom.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(dgNodesEClass, DGNodes.class, "DGNodes", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getDGNodes_NodeAssertion(), this.getNodeAssertion(), null, "nodeAssertion", null, 1, -1, DGNodes.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(nodeAssertionEClass, NodeAssertion.class, "NodeAssertion", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getNodeAssertion_Class(), this.getClass_(), null, "class", null, 1, 1, NodeAssertion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getNodeAssertion_DgNode(), this.getIRI(), null, "dgNode", null, 1, 1, NodeAssertion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(dgEdgesEClass, DGEdges.class, "DGEdges", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getDGEdges_EdgeAssertion(), this.getEdgeAssertion(), null, "edgeAssertion", null, 1, -1, DGEdges.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(edgeAssertionEClass, EdgeAssertion.class, "EdgeAssertion", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getEdgeAssertion_ObjectProperty(), this.getObjectProperty(), null, "objectProperty", null, 1, 1, EdgeAssertion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getEdgeAssertion_DgNode1(), this.getIRI(), null, "dgNode1", null, 1, 1, EdgeAssertion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getEdgeAssertion_DgNode2(), this.getIRI(), null, "dgNode2", null, 1, 1, EdgeAssertion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(mainClassesEClass, MainClasses.class, "MainClasses", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getMainClasses_Class(), this.getClass_(), null, "class", null, 1, -1, MainClasses.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(expressionEClass, Expression.class, "Expression", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(templateParameterEClass, TemplateParameter.class, "TemplateParameter", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getTemplateParameter_Signature(), this.getTemplateSignature(), this.getTemplateSignature_OwnedParameter(), "signature", null, 1, 1, TemplateParameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getTemplateParameter_ParameteredElement(), this.getParameterableElement(), this.getParameterableElement_TemplateParameter(), "parameteredElement", null, 1, 1, TemplateParameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getTemplateParameter_ParameterSubstitution(), this.getTemplateParameterSubstitution(), this.getTemplateParameterSubstitution_Formal(), "parameterSubstitution", null, 1, -1, TemplateParameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(parameterableElementEClass, ParameterableElement.class, "ParameterableElement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getParameterableElement_TemplateParameter(), this.getTemplateParameter(), this.getTemplateParameter_ParameteredElement(), "templateParameter", null, 0, 1, ParameterableElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(templateSignatureEClass, TemplateSignature.class, "TemplateSignature", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getTemplateSignature_OwnedParameter(), this.getTemplateParameter(), this.getTemplateParameter_Signature(), "ownedParameter", null, 0, -1, TemplateSignature.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getTemplateSignature_Template(), this.getTemplateableElement(), this.getTemplateableElement_OwnedTemplateSignature(), "template", null, 1, 1, TemplateSignature.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(templateableElementEClass, TemplateableElement.class, "TemplateableElement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getTemplateableElement_OwnedTemplateSignature(), this.getTemplateSignature(), this.getTemplateSignature_Template(), "ownedTemplateSignature", null, 0, 1, TemplateableElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getTemplateableElement_TemplateBinding(), this.getTemplateBinding(), this.getTemplateBinding_BoundElement(), "templateBinding", null, 0, -1, TemplateableElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(packageEClass, west.twouse.language.owl2fs.Package.class, "Package", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getPackage_Expressions(), this.getExpression(), null, "expressions", null, 0, -1, west.twouse.language.owl2fs.Package.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
    initEReference(getPackage_Axioms(), this.getAxiom(), null, "axioms", null, 0, -1, west.twouse.language.owl2fs.Package.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
    initEAttribute(getPackage_PackageUri(), ecorePackage.getEString(), "PackageUri", null, 0, 1, west.twouse.language.owl2fs.Package.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(classifierTemplateParameterEClass, ClassifierTemplateParameter.class, "ClassifierTemplateParameter", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(templateParameterSubstitutionEClass, TemplateParameterSubstitution.class, "TemplateParameterSubstitution", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getTemplateParameterSubstitution_Actual(), this.getParameterableElement(), null, "actual", null, 1, 1, TemplateParameterSubstitution.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getTemplateParameterSubstitution_Formal(), this.getTemplateParameter(), this.getTemplateParameter_ParameterSubstitution(), "formal", null, 1, 1, TemplateParameterSubstitution.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getTemplateParameterSubstitution_TemplateBinding(), this.getTemplateBinding(), this.getTemplateBinding_ParameterSubstitution(), "templateBinding", null, 1, 1, TemplateParameterSubstitution.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(templateBindingEClass, TemplateBinding.class, "TemplateBinding", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getTemplateBinding_ParameterSubstitution(), this.getTemplateParameterSubstitution(), this.getTemplateParameterSubstitution_TemplateBinding(), "parameterSubstitution", null, 0, -1, TemplateBinding.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getTemplateBinding_BoundElement(), this.getTemplateableElement(), this.getTemplateableElement_TemplateBinding(), "boundElement", null, 1, 1, TemplateBinding.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getTemplateBinding_Signature(), this.getTemplateSignature(), null, "signature", null, 1, 1, TemplateBinding.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    // Create resource
    createResource(eNS_URI);
  }

} //Owl2fsPackageImpl
