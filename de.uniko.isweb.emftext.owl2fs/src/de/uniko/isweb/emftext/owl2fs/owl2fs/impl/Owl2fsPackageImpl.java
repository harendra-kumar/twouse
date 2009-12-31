/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.uniko.isweb.emftext.owl2fs.owl2fs.impl;

import de.uniko.isweb.emftext.owl2fs.owl2fs.AbbreviatedURI;
import de.uniko.isweb.emftext.owl2fs.owl2fs.Annotation;
import de.uniko.isweb.emftext.owl2fs.owl2fs.AnnotationByAnonymousIndividual;
import de.uniko.isweb.emftext.owl2fs.owl2fs.AnnotationByConstant;
import de.uniko.isweb.emftext.owl2fs.owl2fs.AnnotationByEntity;
import de.uniko.isweb.emftext.owl2fs.owl2fs.AnnotationProperty;
import de.uniko.isweb.emftext.owl2fs.owl2fs.AnonymousIndividual;
import de.uniko.isweb.emftext.owl2fs.owl2fs.AnonymousIndividualAnnotation;
import de.uniko.isweb.emftext.owl2fs.owl2fs.Antecedent;
import de.uniko.isweb.emftext.owl2fs.owl2fs.Assertion;
import de.uniko.isweb.emftext.owl2fs.owl2fs.AsymmetricObjectProperty;
import de.uniko.isweb.emftext.owl2fs.owl2fs.Atom;
import de.uniko.isweb.emftext.owl2fs.owl2fs.Axiom;
import de.uniko.isweb.emftext.owl2fs.owl2fs.BuiltInAtom;
import de.uniko.isweb.emftext.owl2fs.owl2fs.BuiltInID;
import de.uniko.isweb.emftext.owl2fs.owl2fs.ClassAssertion;
import de.uniko.isweb.emftext.owl2fs.owl2fs.ClassAtom;
import de.uniko.isweb.emftext.owl2fs.owl2fs.ClassAxiom;
import de.uniko.isweb.emftext.owl2fs.owl2fs.ClassExpression;
import de.uniko.isweb.emftext.owl2fs.owl2fs.ClassifierTemplateParameter;
import de.uniko.isweb.emftext.owl2fs.owl2fs.Consequent;
import de.uniko.isweb.emftext.owl2fs.owl2fs.Constant;
import de.uniko.isweb.emftext.owl2fs.owl2fs.DObject;
import de.uniko.isweb.emftext.owl2fs.owl2fs.DataAllValuesFrom;
import de.uniko.isweb.emftext.owl2fs.owl2fs.DataComplementOf;
import de.uniko.isweb.emftext.owl2fs.owl2fs.DataExactCardinality;
import de.uniko.isweb.emftext.owl2fs.owl2fs.DataHasValue;
import de.uniko.isweb.emftext.owl2fs.owl2fs.DataMaxCardinality;
import de.uniko.isweb.emftext.owl2fs.owl2fs.DataMinCardinality;
import de.uniko.isweb.emftext.owl2fs.owl2fs.DataOneOf;
import de.uniko.isweb.emftext.owl2fs.owl2fs.DataProperty;
import de.uniko.isweb.emftext.owl2fs.owl2fs.DataPropertyAssertion;
import de.uniko.isweb.emftext.owl2fs.owl2fs.DataPropertyAxiom;
import de.uniko.isweb.emftext.owl2fs.owl2fs.DataPropertyDomain;
import de.uniko.isweb.emftext.owl2fs.owl2fs.DataPropertyExpression;
import de.uniko.isweb.emftext.owl2fs.owl2fs.DataPropertyRange;
import de.uniko.isweb.emftext.owl2fs.owl2fs.DataRange;
import de.uniko.isweb.emftext.owl2fs.owl2fs.DataRangeAtom;
import de.uniko.isweb.emftext.owl2fs.owl2fs.DataSomeValuesFrom;
import de.uniko.isweb.emftext.owl2fs.owl2fs.DataTypeMaps;
import de.uniko.isweb.emftext.owl2fs.owl2fs.DataVariable;
import de.uniko.isweb.emftext.owl2fs.owl2fs.Datatype;
import de.uniko.isweb.emftext.owl2fs.owl2fs.DatatypeRestriction;
import de.uniko.isweb.emftext.owl2fs.owl2fs.DatavaluedPropertyAtom;
import de.uniko.isweb.emftext.owl2fs.owl2fs.Declaration;
import de.uniko.isweb.emftext.owl2fs.owl2fs.DifferentIndividuals;
import de.uniko.isweb.emftext.owl2fs.owl2fs.DisjointClasses;
import de.uniko.isweb.emftext.owl2fs.owl2fs.DisjointDataProperties;
import de.uniko.isweb.emftext.owl2fs.owl2fs.DisjointObjectProperties;
import de.uniko.isweb.emftext.owl2fs.owl2fs.DisjointUnion;
import de.uniko.isweb.emftext.owl2fs.owl2fs.Entity;
import de.uniko.isweb.emftext.owl2fs.owl2fs.EntityAnnotation;
import de.uniko.isweb.emftext.owl2fs.owl2fs.EquivalentClasses;
import de.uniko.isweb.emftext.owl2fs.owl2fs.EquivalentDataProperties;
import de.uniko.isweb.emftext.owl2fs.owl2fs.EquivalentObjectProperties;
import de.uniko.isweb.emftext.owl2fs.owl2fs.Expression;
import de.uniko.isweb.emftext.owl2fs.owl2fs.FacetConstantPair;
import de.uniko.isweb.emftext.owl2fs.owl2fs.FullURI;
import de.uniko.isweb.emftext.owl2fs.owl2fs.FunctionalDataProperty;
import de.uniko.isweb.emftext.owl2fs.owl2fs.FunctionalObjectProperty;
import de.uniko.isweb.emftext.owl2fs.owl2fs.IObject;
import de.uniko.isweb.emftext.owl2fs.owl2fs.Individual;
import de.uniko.isweb.emftext.owl2fs.owl2fs.IndividualPropetyAtom;
import de.uniko.isweb.emftext.owl2fs.owl2fs.IndividualVariable;
import de.uniko.isweb.emftext.owl2fs.owl2fs.InverseFunctionalObjectProperty;
import de.uniko.isweb.emftext.owl2fs.owl2fs.InverseObjectProperties;
import de.uniko.isweb.emftext.owl2fs.owl2fs.InverseObjectProperty;
import de.uniko.isweb.emftext.owl2fs.owl2fs.IrreflexiveObjectProperty;
import de.uniko.isweb.emftext.owl2fs.owl2fs.KeyFor;
import de.uniko.isweb.emftext.owl2fs.owl2fs.Literal;
import de.uniko.isweb.emftext.owl2fs.owl2fs.NamedIndividual;
import de.uniko.isweb.emftext.owl2fs.owl2fs.NegativeDataPropertyAssertion;
import de.uniko.isweb.emftext.owl2fs.owl2fs.NegativeObjectPropertyAssertion;
import de.uniko.isweb.emftext.owl2fs.owl2fs.ObjectAllValuesFrom;
import de.uniko.isweb.emftext.owl2fs.owl2fs.ObjectAndDataPropertyAxiom;
import de.uniko.isweb.emftext.owl2fs.owl2fs.ObjectComplementOf;
import de.uniko.isweb.emftext.owl2fs.owl2fs.ObjectExactCardinality;
import de.uniko.isweb.emftext.owl2fs.owl2fs.ObjectExistsSelf;
import de.uniko.isweb.emftext.owl2fs.owl2fs.ObjectHasValue;
import de.uniko.isweb.emftext.owl2fs.owl2fs.ObjectIntersectionOf;
import de.uniko.isweb.emftext.owl2fs.owl2fs.ObjectMaxCardinality;
import de.uniko.isweb.emftext.owl2fs.owl2fs.ObjectMinCardinality;
import de.uniko.isweb.emftext.owl2fs.owl2fs.ObjectOneOf;
import de.uniko.isweb.emftext.owl2fs.owl2fs.ObjectProperty;
import de.uniko.isweb.emftext.owl2fs.owl2fs.ObjectPropertyAssertion;
import de.uniko.isweb.emftext.owl2fs.owl2fs.ObjectPropertyAxiom;
import de.uniko.isweb.emftext.owl2fs.owl2fs.ObjectPropertyDomain;
import de.uniko.isweb.emftext.owl2fs.owl2fs.ObjectPropertyExpression;
import de.uniko.isweb.emftext.owl2fs.owl2fs.ObjectPropertyRange;
import de.uniko.isweb.emftext.owl2fs.owl2fs.ObjectSomeValuesFrom;
import de.uniko.isweb.emftext.owl2fs.owl2fs.ObjectUnionOf;
import de.uniko.isweb.emftext.owl2fs.owl2fs.Ontology;
import de.uniko.isweb.emftext.owl2fs.owl2fs.OntologyDocument;
import de.uniko.isweb.emftext.owl2fs.owl2fs.Owl2fsFactory;
import de.uniko.isweb.emftext.owl2fs.owl2fs.Owl2fsPackage;
import de.uniko.isweb.emftext.owl2fs.owl2fs.ParameterableElement;
import de.uniko.isweb.emftext.owl2fs.owl2fs.PrefixDefinition;
import de.uniko.isweb.emftext.owl2fs.owl2fs.PropertyAtom;
import de.uniko.isweb.emftext.owl2fs.owl2fs.ReflexiveObjectProperty;
import de.uniko.isweb.emftext.owl2fs.owl2fs.Rule;
import de.uniko.isweb.emftext.owl2fs.owl2fs.SameIndividual;
import de.uniko.isweb.emftext.owl2fs.owl2fs.SubClassOf;
import de.uniko.isweb.emftext.owl2fs.owl2fs.SubDataPropertyOf;
import de.uniko.isweb.emftext.owl2fs.owl2fs.SubObjectProperty;
import de.uniko.isweb.emftext.owl2fs.owl2fs.SubObjectPropertyOf;
import de.uniko.isweb.emftext.owl2fs.owl2fs.SymmetricObjectProperty;
import de.uniko.isweb.emftext.owl2fs.owl2fs.TemplateBinding;
import de.uniko.isweb.emftext.owl2fs.owl2fs.TemplateParameter;
import de.uniko.isweb.emftext.owl2fs.owl2fs.TemplateParameterSubstitution;
import de.uniko.isweb.emftext.owl2fs.owl2fs.TemplateSignature;
import de.uniko.isweb.emftext.owl2fs.owl2fs.TemplateableElement;
import de.uniko.isweb.emftext.owl2fs.owl2fs.Term;
import de.uniko.isweb.emftext.owl2fs.owl2fs.TransitiveObjectProperty;
import de.uniko.isweb.emftext.owl2fs.owl2fs.Variable;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

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
  private EClass assertionEClass = null;

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
  private EClass annotationEClass = null;

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
  private EClass entityEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass uriEClass = null;

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
  private EClass datatypeEClass = null;

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
  private EClass dataPropertyAxiomEClass = null;

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
  private EClass classExpressionEClass = null;

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
  private EClass dataPropertyExpressionEClass = null;

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
  private EClass asymmetricObjectPropertyEClass = null;

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
  private EClass inverseObjectPropertyEClass = null;

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
  private EClass objectIntersectionOfEClass = null;

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
  private EClass objectExistsSelfEClass = null;

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
  private EClass dataSomeValuesFromEClass = null;

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
  private EClass facetConstantPairEClass = null;

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
  private EClass negativeDataPropertyAssertionEClass = null;

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
  private EClass differentIndividualsEClass = null;

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
  private EClass disjointDataPropertiesEClass = null;

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
  private EClass disjointUnionEClass = null;

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
  private EClass equivalentDataPropertiesEClass = null;

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
  private EClass functionalDataPropertyEClass = null;

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
  private EClass objectPropertyDomainEClass = null;

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
  private EClass reflexiveObjectPropertyEClass = null;

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
  private EClass sameIndividualEClass = null;

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
  private EClass objectComplementOfEClass = null;

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
  private EClass objectPropertyRangeEClass = null;

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
  private EClass classAssertionEClass = null;

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
  private EClass objectExactCardinalityEClass = null;

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
  private EClass subClassOfEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass subObjectPropertyEClass = null;

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
  private EClass entityAnnotationEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass fullURIEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass abbreviatedURIEClass = null;

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
  private EClass inverseObjectPropertiesEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass annotationByConstantEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass annotationByEntityEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass annotationByAnonymousIndividualEClass = null;

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
  private EClass declarationEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass objectAndDataPropertyAxiomEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass keyForEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass anonymousIndividualAnnotationEClass = null;

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
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass dObjectEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass iObjectEClass = null;

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
  private EClass antecedentEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass consequentEClass = null;

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
  private EClass dataRangeAtomEClass = null;

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
  private EClass propertyAtomEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass individualPropetyAtomEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass datavaluedPropertyAtomEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass termEClass = null;

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
  private EClass dataVariableEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass individualVariableEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass constantEClass = null;

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
  private EEnum dataTypeMapsEEnum = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EEnum builtInIDEEnum = null;

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
   * @see de.uniko.isweb.emftext.owl2fs.owl2fs.Owl2fsPackage#eNS_URI
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
  public EClass getAssertion()
  {
    return assertionEClass;
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
  public EReference getAxiom_AxiomAnnotations()
  {
    return (EReference)axiomEClass.getEStructuralFeatures().get(0);
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
  public EReference getAnnotation_AnnotationProperty()
  {
    return (EReference)annotationEClass.getEStructuralFeatures().get(0);
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
  public EClass getEntity()
  {
    return entityEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getEntity_EntityURI()
  {
    return (EReference)entityEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getURI()
  {
    return uriEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getURI_Value()
  {
    return (EAttribute)uriEClass.getEStructuralFeatures().get(0);
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
  public EClass getDatatype()
  {
    return datatypeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getDatatype_DataType()
  {
    return (EAttribute)datatypeEClass.getEStructuralFeatures().get(0);
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
  public EAttribute getDataRange_Arity()
  {
    return (EAttribute)dataRangeEClass.getEStructuralFeatures().get(0);
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
  public EClass getObjectPropertyAxiom()
  {
    return objectPropertyAxiomEClass;
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
  public EClass getClassAxiom()
  {
    return classAxiomEClass;
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
  public EClass getObjectPropertyExpression()
  {
    return objectPropertyExpressionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getObjectPropertyExpression_IsFunctional()
  {
    return (EAttribute)objectPropertyExpressionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getObjectPropertyExpression_IsReflexive()
  {
    return (EAttribute)objectPropertyExpressionEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getObjectPropertyExpression_IsInverseFunctional()
  {
    return (EAttribute)objectPropertyExpressionEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getObjectPropertyExpression_IsIrreflexive()
  {
    return (EAttribute)objectPropertyExpressionEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getObjectPropertyExpression_IsSymmetric()
  {
    return (EAttribute)objectPropertyExpressionEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getObjectPropertyExpression_IsTransitive()
  {
    return (EAttribute)objectPropertyExpressionEClass.getEStructuralFeatures().get(5);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getObjectPropertyExpression_IsAsysmmetric()
  {
    return (EAttribute)objectPropertyExpressionEClass.getEStructuralFeatures().get(6);
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
  public EClass getObjectProperty()
  {
    return objectPropertyEClass;
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
  public EClass getClass_()
  {
    return classEClass;
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
  public EClass getObjectExistsSelf()
  {
    return objectExistsSelfEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getObjectExistsSelf_ObjectPropertyExpression()
  {
    return (EReference)objectExistsSelfEClass.getEStructuralFeatures().get(0);
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
  public EClass getDataProperty()
  {
    return dataPropertyEClass;
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
  public EClass getFacetConstantPair()
  {
    return facetConstantPairEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getFacetConstantPair_Constant()
  {
    return (EReference)facetConstantPairEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getFacetConstantPair_Facet()
  {
    return (EAttribute)facetConstantPairEClass.getEStructuralFeatures().get(1);
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
  public EClass getSubObjectPropertyOf()
  {
    return subObjectPropertyOfEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getSubObjectPropertyOf_SuperObjectPropertyExpression()
  {
    return (EReference)subObjectPropertyOfEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getSubObjectPropertyOf_SubObjectPropertyExpressions()
  {
    return (EReference)subObjectPropertyOfEClass.getEStructuralFeatures().get(1);
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
  public EClass getOntology()
  {
    return ontologyEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getOntology_OntologyAnnotations()
  {
    return (EReference)ontologyEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getOntology_Axioms()
  {
    return (EReference)ontologyEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getOntology_ImportedOntologies()
  {
    return (EReference)ontologyEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getOntology_Expressions()
  {
    return (EReference)ontologyEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getOntology_OntologyURI()
  {
    return (EAttribute)ontologyEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getOntology_VersionURI()
  {
    return (EAttribute)ontologyEClass.getEStructuralFeatures().get(5);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getOntology_Packages()
  {
    return (EReference)ontologyEClass.getEStructuralFeatures().get(6);
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
  public EClass getSubObjectProperty()
  {
    return subObjectPropertyEClass;
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
  public EClass getEntityAnnotation()
  {
    return entityAnnotationEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getEntityAnnotation_Entity()
  {
    return (EReference)entityAnnotationEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getEntityAnnotation_EntityAnnotations()
  {
    return (EReference)entityAnnotationEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getFullURI()
  {
    return fullURIEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getFullURI_Iri()
  {
    return (EAttribute)fullURIEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getAbbreviatedURI()
  {
    return abbreviatedURIEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getAbbreviatedURI_LocalName()
  {
    return (EAttribute)abbreviatedURIEClass.getEStructuralFeatures().get(0);
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
  public EClass getAnnotationByConstant()
  {
    return annotationByConstantEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getAnnotationByConstant_AnnotationValue()
  {
    return (EReference)annotationByConstantEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getAnnotationByEntity()
  {
    return annotationByEntityEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getAnnotationByEntity_AnnotationValue()
  {
    return (EReference)annotationByEntityEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getAnnotationByAnonymousIndividual()
  {
    return annotationByAnonymousIndividualEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getAnnotationByAnonymousIndividual_AnnotationValue()
  {
    return (EReference)annotationByAnonymousIndividualEClass.getEStructuralFeatures().get(0);
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
  public EAttribute getDeclaration_IsFunctional()
  {
    return (EAttribute)declarationEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getDeclaration_IsReflexive()
  {
    return (EAttribute)declarationEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getDeclaration_IsInverseFunctional()
  {
    return (EAttribute)declarationEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getDeclaration_IsIrreflexive()
  {
    return (EAttribute)declarationEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getDeclaration_IsSymmetric()
  {
    return (EAttribute)declarationEClass.getEStructuralFeatures().get(5);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getDeclaration_IsTransitive()
  {
    return (EAttribute)declarationEClass.getEStructuralFeatures().get(6);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getDeclaration_IsAsysmmetric()
  {
    return (EAttribute)declarationEClass.getEStructuralFeatures().get(7);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getObjectAndDataPropertyAxiom()
  {
    return objectAndDataPropertyAxiomEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getKeyFor()
  {
    return keyForEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getKeyFor_ClassExpression()
  {
    return (EReference)keyForEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getKeyFor_DataPropertyExpressions()
  {
    return (EReference)keyForEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getKeyFor_ObjectPropertyExpressions()
  {
    return (EReference)keyForEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getAnonymousIndividualAnnotation()
  {
    return anonymousIndividualAnnotationEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getAnonymousIndividualAnnotation_AnonymousIndividual()
  {
    return (EReference)anonymousIndividualAnnotationEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getAnonymousIndividualAnnotation_AnonymousIndiviudalAnnotations()
  {
    return (EReference)anonymousIndividualAnnotationEClass.getEStructuralFeatures().get(1);
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
  public EClass getTemplateParameter()
  {
    return templateParameterEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getTemplateParameter_OwnedParameteredElement()
  {
    return (EReference)templateParameterEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getTemplateParameter_Signature()
  {
    return (EReference)templateParameterEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getTemplateParameter_ParameteredElement()
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
  public EReference getParameterableElement_OwningTemplateParameter()
  {
    return (EReference)parameterableElementEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getParameterableElement_TemplateParameter()
  {
    return (EReference)parameterableElementEClass.getEStructuralFeatures().get(1);
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
  public EReference getTemplateSignature_Parameter()
  {
    return (EReference)templateSignatureEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getTemplateSignature_OwnedParameter()
  {
    return (EReference)templateSignatureEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getTemplateSignature_Template()
  {
    return (EReference)templateSignatureEClass.getEStructuralFeatures().get(2);
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
  public EClass getDObject()
  {
    return dObjectEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getIObject()
  {
    return iObjectEClass;
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
  public EReference getRule_HasAntecedent()
  {
    return (EReference)ruleEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getRule_HasConsequent()
  {
    return (EReference)ruleEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getRule_SwrlVariables()
  {
    return (EReference)ruleEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getRule_Name()
  {
    return (EAttribute)ruleEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getAntecedent()
  {
    return antecedentEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getAntecedent_ContainsAtoms()
  {
    return (EReference)antecedentEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getAntecedent_Name()
  {
    return (EAttribute)antecedentEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getConsequent()
  {
    return consequentEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getConsequent_ContainsAtoms()
  {
    return (EReference)consequentEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getConsequent_Name()
  {
    return (EAttribute)consequentEClass.getEStructuralFeatures().get(1);
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
  public EReference getAtom_IsInConsequent()
  {
    return (EReference)atomEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getAtom_IsInAntecedent()
  {
    return (EReference)atomEClass.getEStructuralFeatures().get(1);
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
  public EReference getDataRangeAtom_HasPredicateSymbol()
  {
    return (EReference)dataRangeAtomEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDataRangeAtom_HasTerm()
  {
    return (EReference)dataRangeAtomEClass.getEStructuralFeatures().get(1);
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
  public EReference getClassAtom_HasPredicateSymbol()
  {
    return (EReference)classAtomEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getClassAtom_HasTerm()
  {
    return (EReference)classAtomEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getPropertyAtom()
  {
    return propertyAtomEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getIndividualPropetyAtom()
  {
    return individualPropetyAtomEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getIndividualPropetyAtom_HasPredicateSymbol()
  {
    return (EReference)individualPropetyAtomEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getIndividualPropetyAtom_AtomTarget()
  {
    return (EReference)individualPropetyAtomEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getIndividualPropetyAtom_AtomSource()
  {
    return (EReference)individualPropetyAtomEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getDatavaluedPropertyAtom()
  {
    return datavaluedPropertyAtomEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDatavaluedPropertyAtom_HasPredicateSymbol()
  {
    return (EReference)datavaluedPropertyAtomEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDatavaluedPropertyAtom_AtomTarget()
  {
    return (EReference)datavaluedPropertyAtomEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDatavaluedPropertyAtom_AtomSource()
  {
    return (EReference)datavaluedPropertyAtomEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getTerm()
  {
    return termEClass;
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
  public EAttribute getVariable_Name()
  {
    return (EAttribute)variableEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getDataVariable()
  {
    return dataVariableEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getIndividualVariable()
  {
    return individualVariableEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getConstant()
  {
    return constantEClass;
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
  public EAttribute getBuiltInAtom_HasPredicateSymbol()
  {
    return (EAttribute)builtInAtomEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getBuiltInAtom_HasTerms()
  {
    return (EReference)builtInAtomEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EEnum getDataTypeMaps()
  {
    return dataTypeMapsEEnum;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EEnum getBuiltInID()
  {
    return builtInIDEEnum;
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
    assertionEClass = createEClass(ASSERTION);

    axiomEClass = createEClass(AXIOM);
    createEReference(axiomEClass, AXIOM__AXIOM_ANNOTATIONS);

    annotationEClass = createEClass(ANNOTATION);
    createEReference(annotationEClass, ANNOTATION__ANNOTATION_PROPERTY);

    annotationPropertyEClass = createEClass(ANNOTATION_PROPERTY);

    entityEClass = createEClass(ENTITY);
    createEReference(entityEClass, ENTITY__ENTITY_URI);

    uriEClass = createEClass(URI);
    createEAttribute(uriEClass, URI__VALUE);

    literalEClass = createEClass(LITERAL);
    createEAttribute(literalEClass, LITERAL__LEXICAL_VALUE);
    createEReference(literalEClass, LITERAL__DATATYPE);

    datatypeEClass = createEClass(DATATYPE);
    createEAttribute(datatypeEClass, DATATYPE__DATA_TYPE);

    dataRangeEClass = createEClass(DATA_RANGE);
    createEAttribute(dataRangeEClass, DATA_RANGE__ARITY);

    dataPropertyAxiomEClass = createEClass(DATA_PROPERTY_AXIOM);

    objectPropertyAxiomEClass = createEClass(OBJECT_PROPERTY_AXIOM);

    classExpressionEClass = createEClass(CLASS_EXPRESSION);

    classAxiomEClass = createEClass(CLASS_AXIOM);

    dataPropertyExpressionEClass = createEClass(DATA_PROPERTY_EXPRESSION);

    objectPropertyExpressionEClass = createEClass(OBJECT_PROPERTY_EXPRESSION);
    createEAttribute(objectPropertyExpressionEClass, OBJECT_PROPERTY_EXPRESSION__IS_FUNCTIONAL);
    createEAttribute(objectPropertyExpressionEClass, OBJECT_PROPERTY_EXPRESSION__IS_REFLEXIVE);
    createEAttribute(objectPropertyExpressionEClass, OBJECT_PROPERTY_EXPRESSION__IS_INVERSE_FUNCTIONAL);
    createEAttribute(objectPropertyExpressionEClass, OBJECT_PROPERTY_EXPRESSION__IS_IRREFLEXIVE);
    createEAttribute(objectPropertyExpressionEClass, OBJECT_PROPERTY_EXPRESSION__IS_SYMMETRIC);
    createEAttribute(objectPropertyExpressionEClass, OBJECT_PROPERTY_EXPRESSION__IS_TRANSITIVE);
    createEAttribute(objectPropertyExpressionEClass, OBJECT_PROPERTY_EXPRESSION__IS_ASYSMMETRIC);

    asymmetricObjectPropertyEClass = createEClass(ASYMMETRIC_OBJECT_PROPERTY);
    createEReference(asymmetricObjectPropertyEClass, ASYMMETRIC_OBJECT_PROPERTY__OBJECT_PROPERTY_EXPRESSION);

    objectPropertyEClass = createEClass(OBJECT_PROPERTY);

    inverseObjectPropertyEClass = createEClass(INVERSE_OBJECT_PROPERTY);
    createEReference(inverseObjectPropertyEClass, INVERSE_OBJECT_PROPERTY__OBJECT_PROPERTY);

    classEClass = createEClass(CLASS);

    objectIntersectionOfEClass = createEClass(OBJECT_INTERSECTION_OF);
    createEReference(objectIntersectionOfEClass, OBJECT_INTERSECTION_OF__CLASS_EXPRESSIONS);

    objectOneOfEClass = createEClass(OBJECT_ONE_OF);
    createEReference(objectOneOfEClass, OBJECT_ONE_OF__INDIVIDUALS);

    individualEClass = createEClass(INDIVIDUAL);

    namedIndividualEClass = createEClass(NAMED_INDIVIDUAL);

    objectSomeValuesFromEClass = createEClass(OBJECT_SOME_VALUES_FROM);
    createEReference(objectSomeValuesFromEClass, OBJECT_SOME_VALUES_FROM__CLASS_EXPRESSION);
    createEReference(objectSomeValuesFromEClass, OBJECT_SOME_VALUES_FROM__OBJECT_PROPERTY_EXPRESSION);

    objectAllValuesFromEClass = createEClass(OBJECT_ALL_VALUES_FROM);
    createEReference(objectAllValuesFromEClass, OBJECT_ALL_VALUES_FROM__CLASS_EXPRESSION);
    createEReference(objectAllValuesFromEClass, OBJECT_ALL_VALUES_FROM__OBJECT_PROPERTY_EXPRESSION);

    objectExistsSelfEClass = createEClass(OBJECT_EXISTS_SELF);
    createEReference(objectExistsSelfEClass, OBJECT_EXISTS_SELF__OBJECT_PROPERTY_EXPRESSION);

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

    dataSomeValuesFromEClass = createEClass(DATA_SOME_VALUES_FROM);
    createEReference(dataSomeValuesFromEClass, DATA_SOME_VALUES_FROM__DATA_RANGE);
    createEReference(dataSomeValuesFromEClass, DATA_SOME_VALUES_FROM__DATA_PROPERTY_EXPRESSIONS);

    dataPropertyEClass = createEClass(DATA_PROPERTY);

    dataOneOfEClass = createEClass(DATA_ONE_OF);
    createEReference(dataOneOfEClass, DATA_ONE_OF__CONSTANTS);

    datatypeRestrictionEClass = createEClass(DATATYPE_RESTRICTION);
    createEReference(datatypeRestrictionEClass, DATATYPE_RESTRICTION__DATATYPE);
    createEReference(datatypeRestrictionEClass, DATATYPE_RESTRICTION__RESTRICTIONS);

    facetConstantPairEClass = createEClass(FACET_CONSTANT_PAIR);
    createEReference(facetConstantPairEClass, FACET_CONSTANT_PAIR__CONSTANT);
    createEAttribute(facetConstantPairEClass, FACET_CONSTANT_PAIR__FACET);

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

    negativeDataPropertyAssertionEClass = createEClass(NEGATIVE_DATA_PROPERTY_ASSERTION);
    createEReference(negativeDataPropertyAssertionEClass, NEGATIVE_DATA_PROPERTY_ASSERTION__DATA_PROPERTY_EXPRESSION);
    createEReference(negativeDataPropertyAssertionEClass, NEGATIVE_DATA_PROPERTY_ASSERTION__TARGET_VALUE);
    createEReference(negativeDataPropertyAssertionEClass, NEGATIVE_DATA_PROPERTY_ASSERTION__SOURCE_INDIVIDUAL);

    dataPropertyDomainEClass = createEClass(DATA_PROPERTY_DOMAIN);
    createEReference(dataPropertyDomainEClass, DATA_PROPERTY_DOMAIN__DOMAIN);
    createEReference(dataPropertyDomainEClass, DATA_PROPERTY_DOMAIN__DATA_PROPERTY_EXPRESSION);

    dataPropertyRangeEClass = createEClass(DATA_PROPERTY_RANGE);
    createEReference(dataPropertyRangeEClass, DATA_PROPERTY_RANGE__RANGE);
    createEReference(dataPropertyRangeEClass, DATA_PROPERTY_RANGE__DATA_PROPERTY_EXPRESSION);

    differentIndividualsEClass = createEClass(DIFFERENT_INDIVIDUALS);
    createEReference(differentIndividualsEClass, DIFFERENT_INDIVIDUALS__DIFFERENT_INDIVIDUALS);

    disjointClassesEClass = createEClass(DISJOINT_CLASSES);
    createEReference(disjointClassesEClass, DISJOINT_CLASSES__DISJOINT_CLASS_EXPRESSIONS);

    disjointDataPropertiesEClass = createEClass(DISJOINT_DATA_PROPERTIES);
    createEReference(disjointDataPropertiesEClass, DISJOINT_DATA_PROPERTIES__DATA_PROPERTY_EXPRESSIONS);

    disjointObjectPropertiesEClass = createEClass(DISJOINT_OBJECT_PROPERTIES);
    createEReference(disjointObjectPropertiesEClass, DISJOINT_OBJECT_PROPERTIES__OBJECT_PROPERTY_EXPRESSIONS);

    disjointUnionEClass = createEClass(DISJOINT_UNION);
    createEReference(disjointUnionEClass, DISJOINT_UNION__UNION_CLASS);
    createEReference(disjointUnionEClass, DISJOINT_UNION__DISJOINT_CLASS_EXPRESSIONS);

    equivalentClassesEClass = createEClass(EQUIVALENT_CLASSES);
    createEReference(equivalentClassesEClass, EQUIVALENT_CLASSES__EQUIVALENT_CLASS_EXPRESSIONS);

    equivalentDataPropertiesEClass = createEClass(EQUIVALENT_DATA_PROPERTIES);
    createEReference(equivalentDataPropertiesEClass, EQUIVALENT_DATA_PROPERTIES__DATA_PROPERTY_EXPRESSIONS);

    equivalentObjectPropertiesEClass = createEClass(EQUIVALENT_OBJECT_PROPERTIES);
    createEReference(equivalentObjectPropertiesEClass, EQUIVALENT_OBJECT_PROPERTIES__OBJECT_PROPERTY_EXPRESSIONS);

    functionalDataPropertyEClass = createEClass(FUNCTIONAL_DATA_PROPERTY);
    createEReference(functionalDataPropertyEClass, FUNCTIONAL_DATA_PROPERTY__DATA_PROPERTY_EXPRESSION);

    functionalObjectPropertyEClass = createEClass(FUNCTIONAL_OBJECT_PROPERTY);
    createEReference(functionalObjectPropertyEClass, FUNCTIONAL_OBJECT_PROPERTY__OBJECT_PROPERTY_EXPRESSION);

    inverseFunctionalObjectPropertyEClass = createEClass(INVERSE_FUNCTIONAL_OBJECT_PROPERTY);
    createEReference(inverseFunctionalObjectPropertyEClass, INVERSE_FUNCTIONAL_OBJECT_PROPERTY__OBJECT_PROPERTY_EXPRESSION);

    objectPropertyAssertionEClass = createEClass(OBJECT_PROPERTY_ASSERTION);
    createEReference(objectPropertyAssertionEClass, OBJECT_PROPERTY_ASSERTION__OBJECT_PROPERTY_EXPRESSION);
    createEReference(objectPropertyAssertionEClass, OBJECT_PROPERTY_ASSERTION__SOURCE_INDIVIDUAL);
    createEReference(objectPropertyAssertionEClass, OBJECT_PROPERTY_ASSERTION__TARGET_INDIVIDUAL);

    negativeObjectPropertyAssertionEClass = createEClass(NEGATIVE_OBJECT_PROPERTY_ASSERTION);
    createEReference(negativeObjectPropertyAssertionEClass, NEGATIVE_OBJECT_PROPERTY_ASSERTION__OBJECT_PROPERTY_EXPRESSION);
    createEReference(negativeObjectPropertyAssertionEClass, NEGATIVE_OBJECT_PROPERTY_ASSERTION__SOURCE_INDIVIDUAL);
    createEReference(negativeObjectPropertyAssertionEClass, NEGATIVE_OBJECT_PROPERTY_ASSERTION__TARGET_INDIVIDUAL);

    objectPropertyDomainEClass = createEClass(OBJECT_PROPERTY_DOMAIN);
    createEReference(objectPropertyDomainEClass, OBJECT_PROPERTY_DOMAIN__DOMAIN);
    createEReference(objectPropertyDomainEClass, OBJECT_PROPERTY_DOMAIN__OBJECT_PROPERTY_EXPRESSION);

    symmetricObjectPropertyEClass = createEClass(SYMMETRIC_OBJECT_PROPERTY);
    createEReference(symmetricObjectPropertyEClass, SYMMETRIC_OBJECT_PROPERTY__OBJECT_PROPERTY_EXPRESSION);

    reflexiveObjectPropertyEClass = createEClass(REFLEXIVE_OBJECT_PROPERTY);
    createEReference(reflexiveObjectPropertyEClass, REFLEXIVE_OBJECT_PROPERTY__OBJECT_PROPERTY_EXPRESSION);

    subDataPropertyOfEClass = createEClass(SUB_DATA_PROPERTY_OF);
    createEReference(subDataPropertyOfEClass, SUB_DATA_PROPERTY_OF__SUPER_DATA_PROPERTY_EXPRESSION);
    createEReference(subDataPropertyOfEClass, SUB_DATA_PROPERTY_OF__SUB_DATA_PROPERTY_EXPRESSION);

    sameIndividualEClass = createEClass(SAME_INDIVIDUAL);
    createEReference(sameIndividualEClass, SAME_INDIVIDUAL__SAME_INDIVIDUALS);

    subObjectPropertyOfEClass = createEClass(SUB_OBJECT_PROPERTY_OF);
    createEReference(subObjectPropertyOfEClass, SUB_OBJECT_PROPERTY_OF__SUPER_OBJECT_PROPERTY_EXPRESSION);
    createEReference(subObjectPropertyOfEClass, SUB_OBJECT_PROPERTY_OF__SUB_OBJECT_PROPERTY_EXPRESSIONS);

    objectComplementOfEClass = createEClass(OBJECT_COMPLEMENT_OF);
    createEReference(objectComplementOfEClass, OBJECT_COMPLEMENT_OF__CLASS_EXPRESSION);

    ontologyEClass = createEClass(ONTOLOGY);
    createEReference(ontologyEClass, ONTOLOGY__ONTOLOGY_ANNOTATIONS);
    createEReference(ontologyEClass, ONTOLOGY__AXIOMS);
    createEReference(ontologyEClass, ONTOLOGY__IMPORTED_ONTOLOGIES);
    createEReference(ontologyEClass, ONTOLOGY__EXPRESSIONS);
    createEAttribute(ontologyEClass, ONTOLOGY__ONTOLOGY_URI);
    createEAttribute(ontologyEClass, ONTOLOGY__VERSION_URI);
    createEReference(ontologyEClass, ONTOLOGY__PACKAGES);

    objectPropertyRangeEClass = createEClass(OBJECT_PROPERTY_RANGE);
    createEReference(objectPropertyRangeEClass, OBJECT_PROPERTY_RANGE__RANGE);
    createEReference(objectPropertyRangeEClass, OBJECT_PROPERTY_RANGE__OBJECT_PROPERTY_EXPRESSION);

    dataPropertyAssertionEClass = createEClass(DATA_PROPERTY_ASSERTION);
    createEReference(dataPropertyAssertionEClass, DATA_PROPERTY_ASSERTION__DATA_PROPERTY_EXPRESSION);
    createEReference(dataPropertyAssertionEClass, DATA_PROPERTY_ASSERTION__TARGET_VALUE);
    createEReference(dataPropertyAssertionEClass, DATA_PROPERTY_ASSERTION__SOURCE_INDIVIDUAL);

    classAssertionEClass = createEClass(CLASS_ASSERTION);
    createEReference(classAssertionEClass, CLASS_ASSERTION__INDIVIDUAL);
    createEReference(classAssertionEClass, CLASS_ASSERTION__CLASS_EXPRESSION);

    irreflexiveObjectPropertyEClass = createEClass(IRREFLEXIVE_OBJECT_PROPERTY);
    createEReference(irreflexiveObjectPropertyEClass, IRREFLEXIVE_OBJECT_PROPERTY__OBJECT_PROPERTY_EXPRESSION);

    objectExactCardinalityEClass = createEClass(OBJECT_EXACT_CARDINALITY);
    createEAttribute(objectExactCardinalityEClass, OBJECT_EXACT_CARDINALITY__CARDINALITY);
    createEReference(objectExactCardinalityEClass, OBJECT_EXACT_CARDINALITY__CLASS_EXPRESSION);
    createEReference(objectExactCardinalityEClass, OBJECT_EXACT_CARDINALITY__OBJECT_PROPERTY_EXPRESSION);

    dataComplementOfEClass = createEClass(DATA_COMPLEMENT_OF);
    createEReference(dataComplementOfEClass, DATA_COMPLEMENT_OF__DATA_RANGE);

    subClassOfEClass = createEClass(SUB_CLASS_OF);
    createEReference(subClassOfEClass, SUB_CLASS_OF__SUB_CLASS_EXPRESSION);
    createEReference(subClassOfEClass, SUB_CLASS_OF__SUPER_CLASS_EXPRESSION);

    subObjectPropertyEClass = createEClass(SUB_OBJECT_PROPERTY);

    transitiveObjectPropertyEClass = createEClass(TRANSITIVE_OBJECT_PROPERTY);
    createEReference(transitiveObjectPropertyEClass, TRANSITIVE_OBJECT_PROPERTY__OBJECT_PROPERTY_EXPRESSION);

    entityAnnotationEClass = createEClass(ENTITY_ANNOTATION);
    createEReference(entityAnnotationEClass, ENTITY_ANNOTATION__ENTITY);
    createEReference(entityAnnotationEClass, ENTITY_ANNOTATION__ENTITY_ANNOTATIONS);

    fullURIEClass = createEClass(FULL_URI);
    createEAttribute(fullURIEClass, FULL_URI__IRI);

    abbreviatedURIEClass = createEClass(ABBREVIATED_URI);
    createEAttribute(abbreviatedURIEClass, ABBREVIATED_URI__LOCAL_NAME);

    objectUnionOfEClass = createEClass(OBJECT_UNION_OF);
    createEReference(objectUnionOfEClass, OBJECT_UNION_OF__CLASS_EXPRESSIONS);

    inverseObjectPropertiesEClass = createEClass(INVERSE_OBJECT_PROPERTIES);
    createEReference(inverseObjectPropertiesEClass, INVERSE_OBJECT_PROPERTIES__OBJECT_PROPERTY_EXPRESSION1);
    createEReference(inverseObjectPropertiesEClass, INVERSE_OBJECT_PROPERTIES__OBJECT_PROPERTY_EXPRESSION2);

    annotationByConstantEClass = createEClass(ANNOTATION_BY_CONSTANT);
    createEReference(annotationByConstantEClass, ANNOTATION_BY_CONSTANT__ANNOTATION_VALUE);

    annotationByEntityEClass = createEClass(ANNOTATION_BY_ENTITY);
    createEReference(annotationByEntityEClass, ANNOTATION_BY_ENTITY__ANNOTATION_VALUE);

    annotationByAnonymousIndividualEClass = createEClass(ANNOTATION_BY_ANONYMOUS_INDIVIDUAL);
    createEReference(annotationByAnonymousIndividualEClass, ANNOTATION_BY_ANONYMOUS_INDIVIDUAL__ANNOTATION_VALUE);

    anonymousIndividualEClass = createEClass(ANONYMOUS_INDIVIDUAL);
    createEAttribute(anonymousIndividualEClass, ANONYMOUS_INDIVIDUAL__NODE_ID);

    declarationEClass = createEClass(DECLARATION);
    createEReference(declarationEClass, DECLARATION__ENTITY);
    createEAttribute(declarationEClass, DECLARATION__IS_FUNCTIONAL);
    createEAttribute(declarationEClass, DECLARATION__IS_REFLEXIVE);
    createEAttribute(declarationEClass, DECLARATION__IS_INVERSE_FUNCTIONAL);
    createEAttribute(declarationEClass, DECLARATION__IS_IRREFLEXIVE);
    createEAttribute(declarationEClass, DECLARATION__IS_SYMMETRIC);
    createEAttribute(declarationEClass, DECLARATION__IS_TRANSITIVE);
    createEAttribute(declarationEClass, DECLARATION__IS_ASYSMMETRIC);

    objectAndDataPropertyAxiomEClass = createEClass(OBJECT_AND_DATA_PROPERTY_AXIOM);

    keyForEClass = createEClass(KEY_FOR);
    createEReference(keyForEClass, KEY_FOR__CLASS_EXPRESSION);
    createEReference(keyForEClass, KEY_FOR__DATA_PROPERTY_EXPRESSIONS);
    createEReference(keyForEClass, KEY_FOR__OBJECT_PROPERTY_EXPRESSIONS);

    anonymousIndividualAnnotationEClass = createEClass(ANONYMOUS_INDIVIDUAL_ANNOTATION);
    createEReference(anonymousIndividualAnnotationEClass, ANONYMOUS_INDIVIDUAL_ANNOTATION__ANONYMOUS_INDIVIDUAL);
    createEReference(anonymousIndividualAnnotationEClass, ANONYMOUS_INDIVIDUAL_ANNOTATION__ANONYMOUS_INDIVIUDAL_ANNOTATIONS);

    expressionEClass = createEClass(EXPRESSION);

    ontologyDocumentEClass = createEClass(ONTOLOGY_DOCUMENT);
    createEReference(ontologyDocumentEClass, ONTOLOGY_DOCUMENT__ONTOLOGY);
    createEReference(ontologyDocumentEClass, ONTOLOGY_DOCUMENT__PREFIX_DEFINITION);

    prefixDefinitionEClass = createEClass(PREFIX_DEFINITION);
    createEAttribute(prefixDefinitionEClass, PREFIX_DEFINITION__PREF);
    createEReference(prefixDefinitionEClass, PREFIX_DEFINITION__NAMESPACE);

    templateParameterEClass = createEClass(TEMPLATE_PARAMETER);
    createEReference(templateParameterEClass, TEMPLATE_PARAMETER__OWNED_PARAMETERED_ELEMENT);
    createEReference(templateParameterEClass, TEMPLATE_PARAMETER__SIGNATURE);
    createEReference(templateParameterEClass, TEMPLATE_PARAMETER__PARAMETERED_ELEMENT);

    parameterableElementEClass = createEClass(PARAMETERABLE_ELEMENT);
    createEReference(parameterableElementEClass, PARAMETERABLE_ELEMENT__OWNING_TEMPLATE_PARAMETER);
    createEReference(parameterableElementEClass, PARAMETERABLE_ELEMENT__TEMPLATE_PARAMETER);

    templateSignatureEClass = createEClass(TEMPLATE_SIGNATURE);
    createEReference(templateSignatureEClass, TEMPLATE_SIGNATURE__PARAMETER);
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

    dObjectEClass = createEClass(DOBJECT);

    iObjectEClass = createEClass(IOBJECT);

    ruleEClass = createEClass(RULE);
    createEReference(ruleEClass, RULE__HAS_ANTECEDENT);
    createEReference(ruleEClass, RULE__HAS_CONSEQUENT);
    createEReference(ruleEClass, RULE__SWRL_VARIABLES);
    createEAttribute(ruleEClass, RULE__NAME);

    antecedentEClass = createEClass(ANTECEDENT);
    createEReference(antecedentEClass, ANTECEDENT__CONTAINS_ATOMS);
    createEAttribute(antecedentEClass, ANTECEDENT__NAME);

    consequentEClass = createEClass(CONSEQUENT);
    createEReference(consequentEClass, CONSEQUENT__CONTAINS_ATOMS);
    createEAttribute(consequentEClass, CONSEQUENT__NAME);

    atomEClass = createEClass(ATOM);
    createEReference(atomEClass, ATOM__IS_IN_CONSEQUENT);
    createEReference(atomEClass, ATOM__IS_IN_ANTECEDENT);

    dataRangeAtomEClass = createEClass(DATA_RANGE_ATOM);
    createEReference(dataRangeAtomEClass, DATA_RANGE_ATOM__HAS_PREDICATE_SYMBOL);
    createEReference(dataRangeAtomEClass, DATA_RANGE_ATOM__HAS_TERM);

    classAtomEClass = createEClass(CLASS_ATOM);
    createEReference(classAtomEClass, CLASS_ATOM__HAS_PREDICATE_SYMBOL);
    createEReference(classAtomEClass, CLASS_ATOM__HAS_TERM);

    propertyAtomEClass = createEClass(PROPERTY_ATOM);

    individualPropetyAtomEClass = createEClass(INDIVIDUAL_PROPETY_ATOM);
    createEReference(individualPropetyAtomEClass, INDIVIDUAL_PROPETY_ATOM__HAS_PREDICATE_SYMBOL);
    createEReference(individualPropetyAtomEClass, INDIVIDUAL_PROPETY_ATOM__ATOM_TARGET);
    createEReference(individualPropetyAtomEClass, INDIVIDUAL_PROPETY_ATOM__ATOM_SOURCE);

    datavaluedPropertyAtomEClass = createEClass(DATAVALUED_PROPERTY_ATOM);
    createEReference(datavaluedPropertyAtomEClass, DATAVALUED_PROPERTY_ATOM__HAS_PREDICATE_SYMBOL);
    createEReference(datavaluedPropertyAtomEClass, DATAVALUED_PROPERTY_ATOM__ATOM_TARGET);
    createEReference(datavaluedPropertyAtomEClass, DATAVALUED_PROPERTY_ATOM__ATOM_SOURCE);

    termEClass = createEClass(TERM);

    variableEClass = createEClass(VARIABLE);
    createEAttribute(variableEClass, VARIABLE__NAME);

    dataVariableEClass = createEClass(DATA_VARIABLE);

    individualVariableEClass = createEClass(INDIVIDUAL_VARIABLE);

    constantEClass = createEClass(CONSTANT);

    builtInAtomEClass = createEClass(BUILT_IN_ATOM);
    createEAttribute(builtInAtomEClass, BUILT_IN_ATOM__HAS_PREDICATE_SYMBOL);
    createEReference(builtInAtomEClass, BUILT_IN_ATOM__HAS_TERMS);

    // Create enums
    dataTypeMapsEEnum = createEEnum(DATA_TYPE_MAPS);
    builtInIDEEnum = createEEnum(BUILT_IN_ID);
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
    assertionEClass.getESuperTypes().add(this.getAxiom());
    annotationPropertyEClass.getESuperTypes().add(this.getEntity());
    literalEClass.getESuperTypes().add(this.getConstant());
    literalEClass.getESuperTypes().add(this.getDObject());
    datatypeEClass.getESuperTypes().add(this.getDataRange());
    datatypeEClass.getESuperTypes().add(this.getEntity());
    dataPropertyAxiomEClass.getESuperTypes().add(this.getAxiom());
    objectPropertyAxiomEClass.getESuperTypes().add(this.getAxiom());
    classAxiomEClass.getESuperTypes().add(this.getAxiom());
    asymmetricObjectPropertyEClass.getESuperTypes().add(this.getObjectPropertyAxiom());
    objectPropertyEClass.getESuperTypes().add(this.getEntity());
    objectPropertyEClass.getESuperTypes().add(this.getObjectPropertyExpression());
    objectPropertyEClass.getESuperTypes().add(this.getParameterableElement());
    inverseObjectPropertyEClass.getESuperTypes().add(this.getObjectPropertyExpression());
    inverseObjectPropertyEClass.getESuperTypes().add(this.getExpression());
    classEClass.getESuperTypes().add(this.getEntity());
    classEClass.getESuperTypes().add(this.getClassExpression());
    classEClass.getESuperTypes().add(this.getParameterableElement());
    objectIntersectionOfEClass.getESuperTypes().add(this.getClassExpression());
    objectIntersectionOfEClass.getESuperTypes().add(this.getExpression());
    objectOneOfEClass.getESuperTypes().add(this.getClassExpression());
    objectOneOfEClass.getESuperTypes().add(this.getExpression());
    individualEClass.getESuperTypes().add(this.getConstant());
    individualEClass.getESuperTypes().add(this.getIObject());
    namedIndividualEClass.getESuperTypes().add(this.getEntity());
    namedIndividualEClass.getESuperTypes().add(this.getIndividual());
    namedIndividualEClass.getESuperTypes().add(this.getParameterableElement());
    objectSomeValuesFromEClass.getESuperTypes().add(this.getClassExpression());
    objectSomeValuesFromEClass.getESuperTypes().add(this.getExpression());
    objectAllValuesFromEClass.getESuperTypes().add(this.getClassExpression());
    objectAllValuesFromEClass.getESuperTypes().add(this.getExpression());
    objectExistsSelfEClass.getESuperTypes().add(this.getClassExpression());
    objectExistsSelfEClass.getESuperTypes().add(this.getExpression());
    objectHasValueEClass.getESuperTypes().add(this.getClassExpression());
    objectHasValueEClass.getESuperTypes().add(this.getExpression());
    objectMinCardinalityEClass.getESuperTypes().add(this.getClassExpression());
    objectMinCardinalityEClass.getESuperTypes().add(this.getExpression());
    objectMaxCardinalityEClass.getESuperTypes().add(this.getClassExpression());
    objectMaxCardinalityEClass.getESuperTypes().add(this.getExpression());
    dataSomeValuesFromEClass.getESuperTypes().add(this.getClassExpression());
    dataSomeValuesFromEClass.getESuperTypes().add(this.getExpression());
    dataPropertyEClass.getESuperTypes().add(this.getEntity());
    dataPropertyEClass.getESuperTypes().add(this.getDataPropertyExpression());
    dataPropertyEClass.getESuperTypes().add(this.getParameterableElement());
    dataOneOfEClass.getESuperTypes().add(this.getDataRange());
    dataOneOfEClass.getESuperTypes().add(this.getExpression());
    datatypeRestrictionEClass.getESuperTypes().add(this.getDataRange());
    datatypeRestrictionEClass.getESuperTypes().add(this.getExpression());
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
    negativeDataPropertyAssertionEClass.getESuperTypes().add(this.getAssertion());
    dataPropertyDomainEClass.getESuperTypes().add(this.getDataPropertyAxiom());
    dataPropertyRangeEClass.getESuperTypes().add(this.getDataPropertyAxiom());
    differentIndividualsEClass.getESuperTypes().add(this.getAssertion());
    disjointClassesEClass.getESuperTypes().add(this.getClassAxiom());
    disjointDataPropertiesEClass.getESuperTypes().add(this.getDataPropertyAxiom());
    disjointObjectPropertiesEClass.getESuperTypes().add(this.getObjectPropertyAxiom());
    disjointUnionEClass.getESuperTypes().add(this.getClassAxiom());
    equivalentClassesEClass.getESuperTypes().add(this.getClassAxiom());
    equivalentDataPropertiesEClass.getESuperTypes().add(this.getDataPropertyAxiom());
    equivalentObjectPropertiesEClass.getESuperTypes().add(this.getObjectPropertyAxiom());
    functionalDataPropertyEClass.getESuperTypes().add(this.getDataPropertyAxiom());
    functionalObjectPropertyEClass.getESuperTypes().add(this.getObjectPropertyAxiom());
    inverseFunctionalObjectPropertyEClass.getESuperTypes().add(this.getObjectPropertyAxiom());
    objectPropertyAssertionEClass.getESuperTypes().add(this.getAssertion());
    negativeObjectPropertyAssertionEClass.getESuperTypes().add(this.getAssertion());
    objectPropertyDomainEClass.getESuperTypes().add(this.getObjectPropertyAxiom());
    symmetricObjectPropertyEClass.getESuperTypes().add(this.getObjectPropertyAxiom());
    reflexiveObjectPropertyEClass.getESuperTypes().add(this.getObjectPropertyAxiom());
    subDataPropertyOfEClass.getESuperTypes().add(this.getDataPropertyAxiom());
    sameIndividualEClass.getESuperTypes().add(this.getAssertion());
    subObjectPropertyOfEClass.getESuperTypes().add(this.getObjectPropertyAxiom());
    objectComplementOfEClass.getESuperTypes().add(this.getClassExpression());
    objectComplementOfEClass.getESuperTypes().add(this.getExpression());
    objectPropertyRangeEClass.getESuperTypes().add(this.getObjectPropertyAxiom());
    dataPropertyAssertionEClass.getESuperTypes().add(this.getAssertion());
    classAssertionEClass.getESuperTypes().add(this.getAssertion());
    irreflexiveObjectPropertyEClass.getESuperTypes().add(this.getObjectPropertyAxiom());
    objectExactCardinalityEClass.getESuperTypes().add(this.getClassExpression());
    objectExactCardinalityEClass.getESuperTypes().add(this.getExpression());
    dataComplementOfEClass.getESuperTypes().add(this.getDataRange());
    dataComplementOfEClass.getESuperTypes().add(this.getExpression());
    subClassOfEClass.getESuperTypes().add(this.getClassAxiom());
    transitiveObjectPropertyEClass.getESuperTypes().add(this.getObjectPropertyAxiom());
    entityAnnotationEClass.getESuperTypes().add(this.getAxiom());
    objectUnionOfEClass.getESuperTypes().add(this.getClassExpression());
    objectUnionOfEClass.getESuperTypes().add(this.getExpression());
    inverseObjectPropertiesEClass.getESuperTypes().add(this.getObjectPropertyAxiom());
    annotationByConstantEClass.getESuperTypes().add(this.getAnnotation());
    annotationByEntityEClass.getESuperTypes().add(this.getAnnotation());
    annotationByAnonymousIndividualEClass.getESuperTypes().add(this.getAnnotation());
    anonymousIndividualEClass.getESuperTypes().add(this.getIndividual());
    declarationEClass.getESuperTypes().add(this.getAxiom());
    objectAndDataPropertyAxiomEClass.getESuperTypes().add(this.getAxiom());
    keyForEClass.getESuperTypes().add(this.getObjectAndDataPropertyAxiom());
    anonymousIndividualAnnotationEClass.getESuperTypes().add(this.getAxiom());
    packageEClass.getESuperTypes().add(this.getTemplateableElement());
    classifierTemplateParameterEClass.getESuperTypes().add(this.getTemplateParameter());
    ruleEClass.getESuperTypes().add(this.getAxiom());
    dataRangeAtomEClass.getESuperTypes().add(this.getAtom());
    classAtomEClass.getESuperTypes().add(this.getAtom());
    propertyAtomEClass.getESuperTypes().add(this.getAtom());
    individualPropetyAtomEClass.getESuperTypes().add(this.getPropertyAtom());
    datavaluedPropertyAtomEClass.getESuperTypes().add(this.getPropertyAtom());
    variableEClass.getESuperTypes().add(this.getTerm());
    dataVariableEClass.getESuperTypes().add(this.getVariable());
    dataVariableEClass.getESuperTypes().add(this.getDObject());
    individualVariableEClass.getESuperTypes().add(this.getVariable());
    individualVariableEClass.getESuperTypes().add(this.getIObject());
    constantEClass.getESuperTypes().add(this.getTerm());
    builtInAtomEClass.getESuperTypes().add(this.getAtom());

    // Initialize classes and features; add operations and parameters
    initEClass(assertionEClass, Assertion.class, "Assertion", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(axiomEClass, Axiom.class, "Axiom", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getAxiom_AxiomAnnotations(), this.getAnnotation(), null, "axiomAnnotations", null, 0, -1, Axiom.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

    initEClass(annotationEClass, Annotation.class, "Annotation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getAnnotation_AnnotationProperty(), this.getAnnotationProperty(), null, "annotationProperty", null, 1, 1, Annotation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

    initEClass(annotationPropertyEClass, AnnotationProperty.class, "AnnotationProperty", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(entityEClass, Entity.class, "Entity", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getEntity_EntityURI(), this.getURI(), null, "entityURI", null, 1, 1, Entity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(uriEClass, de.uniko.isweb.emftext.owl2fs.owl2fs.URI.class, "URI", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getURI_Value(), ecorePackage.getEString(), "value", null, 1, 1, de.uniko.isweb.emftext.owl2fs.owl2fs.URI.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

    initEClass(literalEClass, Literal.class, "Literal", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getLiteral_LexicalValue(), ecorePackage.getEString(), "lexicalValue", null, 1, 1, Literal.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
    initEReference(getLiteral_Datatype(), this.getDatatype(), null, "datatype", null, 1, 1, Literal.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

    initEClass(datatypeEClass, Datatype.class, "Datatype", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getDatatype_DataType(), this.getDataTypeMaps(), "dataType", null, 1, 1, Datatype.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(dataRangeEClass, DataRange.class, "DataRange", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getDataRange_Arity(), ecorePackage.getEInt(), "arity", null, 1, 1, DataRange.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

    initEClass(dataPropertyAxiomEClass, DataPropertyAxiom.class, "DataPropertyAxiom", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(objectPropertyAxiomEClass, ObjectPropertyAxiom.class, "ObjectPropertyAxiom", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(classExpressionEClass, ClassExpression.class, "ClassExpression", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(classAxiomEClass, ClassAxiom.class, "ClassAxiom", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(dataPropertyExpressionEClass, DataPropertyExpression.class, "DataPropertyExpression", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(objectPropertyExpressionEClass, ObjectPropertyExpression.class, "ObjectPropertyExpression", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getObjectPropertyExpression_IsFunctional(), ecorePackage.getEBoolean(), "isFunctional", "false", 0, 1, ObjectPropertyExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getObjectPropertyExpression_IsReflexive(), ecorePackage.getEBoolean(), "isReflexive", null, 0, 1, ObjectPropertyExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getObjectPropertyExpression_IsInverseFunctional(), ecorePackage.getEBoolean(), "isInverseFunctional", null, 0, 1, ObjectPropertyExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getObjectPropertyExpression_IsIrreflexive(), ecorePackage.getEBoolean(), "isIrreflexive", null, 0, 1, ObjectPropertyExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getObjectPropertyExpression_IsSymmetric(), ecorePackage.getEBoolean(), "isSymmetric", null, 0, 1, ObjectPropertyExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getObjectPropertyExpression_IsTransitive(), ecorePackage.getEBoolean(), "isTransitive", null, 0, 1, ObjectPropertyExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getObjectPropertyExpression_IsAsysmmetric(), ecorePackage.getEBoolean(), "isAsysmmetric", null, 0, 1, ObjectPropertyExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(asymmetricObjectPropertyEClass, AsymmetricObjectProperty.class, "AsymmetricObjectProperty", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getAsymmetricObjectProperty_ObjectPropertyExpression(), this.getObjectPropertyExpression(), null, "objectPropertyExpression", null, 1, 1, AsymmetricObjectProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

    initEClass(objectPropertyEClass, ObjectProperty.class, "ObjectProperty", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(inverseObjectPropertyEClass, InverseObjectProperty.class, "InverseObjectProperty", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getInverseObjectProperty_ObjectProperty(), this.getObjectProperty(), null, "objectProperty", null, 1, 1, InverseObjectProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

    initEClass(classEClass, de.uniko.isweb.emftext.owl2fs.owl2fs.Class.class, "Class", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(objectIntersectionOfEClass, ObjectIntersectionOf.class, "ObjectIntersectionOf", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getObjectIntersectionOf_ClassExpressions(), this.getClassExpression(), null, "classExpressions", null, 2, -1, ObjectIntersectionOf.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

    initEClass(objectOneOfEClass, ObjectOneOf.class, "ObjectOneOf", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getObjectOneOf_Individuals(), this.getIndividual(), null, "individuals", null, 1, -1, ObjectOneOf.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

    initEClass(individualEClass, Individual.class, "Individual", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(namedIndividualEClass, NamedIndividual.class, "NamedIndividual", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(objectSomeValuesFromEClass, ObjectSomeValuesFrom.class, "ObjectSomeValuesFrom", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getObjectSomeValuesFrom_ClassExpression(), this.getClassExpression(), null, "classExpression", null, 1, 1, ObjectSomeValuesFrom.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
    initEReference(getObjectSomeValuesFrom_ObjectPropertyExpression(), this.getObjectPropertyExpression(), null, "objectPropertyExpression", null, 1, 1, ObjectSomeValuesFrom.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

    initEClass(objectAllValuesFromEClass, ObjectAllValuesFrom.class, "ObjectAllValuesFrom", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getObjectAllValuesFrom_ClassExpression(), this.getClassExpression(), null, "classExpression", null, 1, 1, ObjectAllValuesFrom.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
    initEReference(getObjectAllValuesFrom_ObjectPropertyExpression(), this.getObjectPropertyExpression(), null, "objectPropertyExpression", null, 1, 1, ObjectAllValuesFrom.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

    initEClass(objectExistsSelfEClass, ObjectExistsSelf.class, "ObjectExistsSelf", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getObjectExistsSelf_ObjectPropertyExpression(), this.getObjectPropertyExpression(), null, "objectPropertyExpression", null, 1, 1, ObjectExistsSelf.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

    initEClass(objectHasValueEClass, ObjectHasValue.class, "ObjectHasValue", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getObjectHasValue_ObjectPropertyExpression(), this.getObjectPropertyExpression(), null, "objectPropertyExpression", null, 1, 1, ObjectHasValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
    initEReference(getObjectHasValue_Individual(), this.getIndividual(), null, "individual", null, 1, 1, ObjectHasValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

    initEClass(objectMinCardinalityEClass, ObjectMinCardinality.class, "ObjectMinCardinality", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getObjectMinCardinality_Cardinality(), ecorePackage.getEInt(), "cardinality", null, 1, 1, ObjectMinCardinality.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
    initEReference(getObjectMinCardinality_ClassExpression(), this.getClassExpression(), null, "classExpression", null, 0, 1, ObjectMinCardinality.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
    initEReference(getObjectMinCardinality_ObjectPropertyExpression(), this.getObjectPropertyExpression(), null, "objectPropertyExpression", null, 1, 1, ObjectMinCardinality.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

    EOperation op = addEOperation(objectMinCardinalityEClass, ecorePackage.getEBoolean(), "Thecardinalitymustbenonnegative", 0, 1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);

    initEClass(objectMaxCardinalityEClass, ObjectMaxCardinality.class, "ObjectMaxCardinality", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getObjectMaxCardinality_Cardinality(), ecorePackage.getEInt(), "cardinality", null, 1, 1, ObjectMaxCardinality.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
    initEReference(getObjectMaxCardinality_ClassExpression(), this.getClassExpression(), null, "classExpression", null, 0, 1, ObjectMaxCardinality.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
    initEReference(getObjectMaxCardinality_ObjectPropertyExpression(), this.getObjectPropertyExpression(), null, "objectPropertyExpression", null, 1, 1, ObjectMaxCardinality.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

    op = addEOperation(objectMaxCardinalityEClass, ecorePackage.getEBoolean(), "Thecardinalitymustbenonnegative", 0, 1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);

    initEClass(dataSomeValuesFromEClass, DataSomeValuesFrom.class, "DataSomeValuesFrom", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getDataSomeValuesFrom_DataRange(), this.getDataRange(), null, "dataRange", null, 1, 1, DataSomeValuesFrom.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
    initEReference(getDataSomeValuesFrom_DataPropertyExpressions(), this.getDataPropertyExpression(), null, "dataPropertyExpressions", null, 1, 1, DataSomeValuesFrom.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(dataPropertyEClass, DataProperty.class, "DataProperty", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(dataOneOfEClass, DataOneOf.class, "DataOneOf", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getDataOneOf_Constants(), this.getLiteral(), null, "constants", null, 1, -1, DataOneOf.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

    initEClass(datatypeRestrictionEClass, DatatypeRestriction.class, "DatatypeRestriction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getDatatypeRestriction_Datatype(), this.getDatatype(), null, "datatype", null, 1, 1, DatatypeRestriction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
    initEReference(getDatatypeRestriction_Restrictions(), this.getFacetConstantPair(), null, "restrictions", null, 0, -1, DatatypeRestriction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

    initEClass(facetConstantPairEClass, FacetConstantPair.class, "FacetConstantPair", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getFacetConstantPair_Constant(), this.getLiteral(), null, "constant", null, 1, 1, FacetConstantPair.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
    initEAttribute(getFacetConstantPair_Facet(), ecorePackage.getEString(), "facet", null, 1, 1, FacetConstantPair.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

    initEClass(dataAllValuesFromEClass, DataAllValuesFrom.class, "DataAllValuesFrom", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getDataAllValuesFrom_DataRange(), this.getDataRange(), null, "dataRange", null, 1, 1, DataAllValuesFrom.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
    initEReference(getDataAllValuesFrom_DataPropertyExpressions(), this.getDataPropertyExpression(), null, "dataPropertyExpressions", null, 1, 1, DataAllValuesFrom.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

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

    initEClass(negativeDataPropertyAssertionEClass, NegativeDataPropertyAssertion.class, "NegativeDataPropertyAssertion", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getNegativeDataPropertyAssertion_DataPropertyExpression(), this.getDataPropertyExpression(), null, "dataPropertyExpression", null, 1, 1, NegativeDataPropertyAssertion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
    initEReference(getNegativeDataPropertyAssertion_TargetValue(), this.getLiteral(), null, "targetValue", null, 1, 1, NegativeDataPropertyAssertion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
    initEReference(getNegativeDataPropertyAssertion_SourceIndividual(), this.getIndividual(), null, "sourceIndividual", null, 1, 1, NegativeDataPropertyAssertion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

    initEClass(dataPropertyDomainEClass, DataPropertyDomain.class, "DataPropertyDomain", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getDataPropertyDomain_Domain(), this.getClassExpression(), null, "domain", null, 1, 1, DataPropertyDomain.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
    initEReference(getDataPropertyDomain_DataPropertyExpression(), this.getDataPropertyExpression(), null, "dataPropertyExpression", null, 1, 1, DataPropertyDomain.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

    initEClass(dataPropertyRangeEClass, DataPropertyRange.class, "DataPropertyRange", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getDataPropertyRange_Range(), this.getDataRange(), null, "range", null, 1, 1, DataPropertyRange.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
    initEReference(getDataPropertyRange_DataPropertyExpression(), this.getDataPropertyExpression(), null, "dataPropertyExpression", null, 1, 1, DataPropertyRange.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

    op = addEOperation(dataPropertyRangeEClass, ecorePackage.getEBoolean(), "Thedatarangemustbeofarityone", 0, 1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);

    initEClass(differentIndividualsEClass, DifferentIndividuals.class, "DifferentIndividuals", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getDifferentIndividuals_DifferentIndividuals(), this.getNamedIndividual(), null, "differentIndividuals", null, 2, -1, DifferentIndividuals.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

    initEClass(disjointClassesEClass, DisjointClasses.class, "DisjointClasses", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getDisjointClasses_DisjointClassExpressions(), this.getClassExpression(), null, "disjointClassExpressions", null, 2, -1, DisjointClasses.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

    initEClass(disjointDataPropertiesEClass, DisjointDataProperties.class, "DisjointDataProperties", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getDisjointDataProperties_DataPropertyExpressions(), this.getDataPropertyExpression(), null, "dataPropertyExpressions", null, 2, -1, DisjointDataProperties.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

    initEClass(disjointObjectPropertiesEClass, DisjointObjectProperties.class, "DisjointObjectProperties", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getDisjointObjectProperties_ObjectPropertyExpressions(), this.getObjectPropertyExpression(), null, "objectPropertyExpressions", null, 2, -1, DisjointObjectProperties.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

    initEClass(disjointUnionEClass, DisjointUnion.class, "DisjointUnion", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getDisjointUnion_UnionClass(), this.getClass_(), null, "unionClass", null, 1, 1, DisjointUnion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
    initEReference(getDisjointUnion_DisjointClassExpressions(), this.getClassExpression(), null, "disjointClassExpressions", null, 2, -1, DisjointUnion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

    initEClass(equivalentClassesEClass, EquivalentClasses.class, "EquivalentClasses", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getEquivalentClasses_EquivalentClassExpressions(), this.getClassExpression(), null, "equivalentClassExpressions", null, 2, -1, EquivalentClasses.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(equivalentDataPropertiesEClass, EquivalentDataProperties.class, "EquivalentDataProperties", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getEquivalentDataProperties_DataPropertyExpressions(), this.getDataPropertyExpression(), null, "dataPropertyExpressions", null, 2, -1, EquivalentDataProperties.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

    initEClass(equivalentObjectPropertiesEClass, EquivalentObjectProperties.class, "EquivalentObjectProperties", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getEquivalentObjectProperties_ObjectPropertyExpressions(), this.getObjectPropertyExpression(), null, "objectPropertyExpressions", null, 2, -1, EquivalentObjectProperties.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

    initEClass(functionalDataPropertyEClass, FunctionalDataProperty.class, "FunctionalDataProperty", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getFunctionalDataProperty_DataPropertyExpression(), this.getDataPropertyExpression(), null, "dataPropertyExpression", null, 1, 1, FunctionalDataProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

    initEClass(functionalObjectPropertyEClass, FunctionalObjectProperty.class, "FunctionalObjectProperty", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getFunctionalObjectProperty_ObjectPropertyExpression(), this.getObjectPropertyExpression(), null, "objectPropertyExpression", null, 1, 1, FunctionalObjectProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

    initEClass(inverseFunctionalObjectPropertyEClass, InverseFunctionalObjectProperty.class, "InverseFunctionalObjectProperty", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getInverseFunctionalObjectProperty_ObjectPropertyExpression(), this.getObjectPropertyExpression(), null, "objectPropertyExpression", null, 1, 1, InverseFunctionalObjectProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

    initEClass(objectPropertyAssertionEClass, ObjectPropertyAssertion.class, "ObjectPropertyAssertion", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getObjectPropertyAssertion_ObjectPropertyExpression(), this.getObjectPropertyExpression(), null, "objectPropertyExpression", null, 1, 1, ObjectPropertyAssertion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
    initEReference(getObjectPropertyAssertion_SourceIndividual(), this.getIndividual(), null, "sourceIndividual", null, 1, 1, ObjectPropertyAssertion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
    initEReference(getObjectPropertyAssertion_TargetIndividual(), this.getIndividual(), null, "targetIndividual", null, 1, 1, ObjectPropertyAssertion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

    initEClass(negativeObjectPropertyAssertionEClass, NegativeObjectPropertyAssertion.class, "NegativeObjectPropertyAssertion", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getNegativeObjectPropertyAssertion_ObjectPropertyExpression(), this.getObjectPropertyExpression(), null, "objectPropertyExpression", null, 1, 1, NegativeObjectPropertyAssertion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
    initEReference(getNegativeObjectPropertyAssertion_SourceIndividual(), this.getIndividual(), null, "sourceIndividual", null, 1, 1, NegativeObjectPropertyAssertion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
    initEReference(getNegativeObjectPropertyAssertion_TargetIndividual(), this.getIndividual(), null, "targetIndividual", null, 1, 1, NegativeObjectPropertyAssertion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

    initEClass(objectPropertyDomainEClass, ObjectPropertyDomain.class, "ObjectPropertyDomain", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getObjectPropertyDomain_Domain(), this.getClassExpression(), null, "domain", null, 1, 1, ObjectPropertyDomain.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
    initEReference(getObjectPropertyDomain_ObjectPropertyExpression(), this.getObjectPropertyExpression(), null, "objectPropertyExpression", null, 1, 1, ObjectPropertyDomain.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

    initEClass(symmetricObjectPropertyEClass, SymmetricObjectProperty.class, "SymmetricObjectProperty", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getSymmetricObjectProperty_ObjectPropertyExpression(), this.getObjectPropertyExpression(), null, "objectPropertyExpression", null, 1, 1, SymmetricObjectProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

    initEClass(reflexiveObjectPropertyEClass, ReflexiveObjectProperty.class, "ReflexiveObjectProperty", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getReflexiveObjectProperty_ObjectPropertyExpression(), this.getObjectPropertyExpression(), null, "objectPropertyExpression", null, 1, 1, ReflexiveObjectProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

    initEClass(subDataPropertyOfEClass, SubDataPropertyOf.class, "SubDataPropertyOf", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getSubDataPropertyOf_SuperDataPropertyExpression(), this.getDataPropertyExpression(), null, "superDataPropertyExpression", null, 1, 1, SubDataPropertyOf.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
    initEReference(getSubDataPropertyOf_SubDataPropertyExpression(), this.getDataPropertyExpression(), null, "subDataPropertyExpression", null, 1, 1, SubDataPropertyOf.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

    initEClass(sameIndividualEClass, SameIndividual.class, "SameIndividual", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getSameIndividual_SameIndividuals(), this.getNamedIndividual(), null, "sameIndividuals", null, 2, -1, SameIndividual.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

    initEClass(subObjectPropertyOfEClass, SubObjectPropertyOf.class, "SubObjectPropertyOf", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getSubObjectPropertyOf_SuperObjectPropertyExpression(), this.getObjectPropertyExpression(), null, "superObjectPropertyExpression", null, 1, 1, SubObjectPropertyOf.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
    initEReference(getSubObjectPropertyOf_SubObjectPropertyExpressions(), this.getObjectPropertyExpression(), null, "subObjectPropertyExpressions", null, 1, 1, SubObjectPropertyOf.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(objectComplementOfEClass, ObjectComplementOf.class, "ObjectComplementOf", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getObjectComplementOf_ClassExpression(), this.getClassExpression(), null, "classExpression", null, 1, 1, ObjectComplementOf.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

    initEClass(ontologyEClass, Ontology.class, "Ontology", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getOntology_OntologyAnnotations(), this.getAnnotation(), null, "ontologyAnnotations", null, 0, -1, Ontology.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
    initEReference(getOntology_Axioms(), this.getAxiom(), null, "axioms", null, 0, -1, Ontology.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
    initEReference(getOntology_ImportedOntologies(), this.getOntology(), null, "importedOntologies", null, 0, -1, Ontology.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
    initEReference(getOntology_Expressions(), this.getExpression(), null, "expressions", null, 0, -1, Ontology.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
    initEAttribute(getOntology_OntologyURI(), ecorePackage.getEString(), "ontologyURI", null, 1, 1, Ontology.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getOntology_VersionURI(), ecorePackage.getEString(), "versionURI", null, 0, 1, Ontology.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getOntology_Packages(), this.getPackage(), null, "packages", null, 0, -1, Ontology.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    op = addEOperation(ontologyEClass, ecorePackage.getEBoolean(), "versionURIrequiresontologyURItobespecified", 0, 1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);

    initEClass(objectPropertyRangeEClass, ObjectPropertyRange.class, "ObjectPropertyRange", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getObjectPropertyRange_Range(), this.getClassExpression(), null, "range", null, 1, 1, ObjectPropertyRange.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
    initEReference(getObjectPropertyRange_ObjectPropertyExpression(), this.getObjectPropertyExpression(), null, "objectPropertyExpression", null, 1, 1, ObjectPropertyRange.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

    initEClass(dataPropertyAssertionEClass, DataPropertyAssertion.class, "DataPropertyAssertion", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getDataPropertyAssertion_DataPropertyExpression(), this.getDataPropertyExpression(), null, "dataPropertyExpression", null, 1, 1, DataPropertyAssertion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
    initEReference(getDataPropertyAssertion_TargetValue(), this.getLiteral(), null, "targetValue", null, 1, 1, DataPropertyAssertion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getDataPropertyAssertion_SourceIndividual(), this.getIndividual(), null, "sourceIndividual", null, 1, 1, DataPropertyAssertion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

    initEClass(classAssertionEClass, ClassAssertion.class, "ClassAssertion", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getClassAssertion_Individual(), this.getNamedIndividual(), null, "individual", null, 1, 1, ClassAssertion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
    initEReference(getClassAssertion_ClassExpression(), this.getClassExpression(), null, "classExpression", null, 1, 1, ClassAssertion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

    initEClass(irreflexiveObjectPropertyEClass, IrreflexiveObjectProperty.class, "IrreflexiveObjectProperty", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getIrreflexiveObjectProperty_ObjectPropertyExpression(), this.getObjectPropertyExpression(), null, "objectPropertyExpression", null, 1, 1, IrreflexiveObjectProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

    initEClass(objectExactCardinalityEClass, ObjectExactCardinality.class, "ObjectExactCardinality", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getObjectExactCardinality_Cardinality(), ecorePackage.getEInt(), "cardinality", null, 1, 1, ObjectExactCardinality.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
    initEReference(getObjectExactCardinality_ClassExpression(), this.getClassExpression(), null, "classExpression", null, 0, 1, ObjectExactCardinality.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
    initEReference(getObjectExactCardinality_ObjectPropertyExpression(), this.getObjectPropertyExpression(), null, "objectPropertyExpression", null, 1, 1, ObjectExactCardinality.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

    op = addEOperation(objectExactCardinalityEClass, ecorePackage.getEBoolean(), "Thecardinalitymustbenonnegative", 0, 1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);

    initEClass(dataComplementOfEClass, DataComplementOf.class, "DataComplementOf", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getDataComplementOf_DataRange(), this.getDataRange(), null, "dataRange", null, 1, 1, DataComplementOf.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

    initEClass(subClassOfEClass, SubClassOf.class, "SubClassOf", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getSubClassOf_SubClassExpression(), this.getClassExpression(), null, "subClassExpression", null, 1, 1, SubClassOf.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
    initEReference(getSubClassOf_SuperClassExpression(), this.getClassExpression(), null, "superClassExpression", null, 1, 1, SubClassOf.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

    initEClass(subObjectPropertyEClass, SubObjectProperty.class, "SubObjectProperty", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(transitiveObjectPropertyEClass, TransitiveObjectProperty.class, "TransitiveObjectProperty", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getTransitiveObjectProperty_ObjectPropertyExpression(), this.getObjectPropertyExpression(), null, "objectPropertyExpression", null, 1, 1, TransitiveObjectProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

    initEClass(entityAnnotationEClass, EntityAnnotation.class, "EntityAnnotation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getEntityAnnotation_Entity(), this.getEntity(), null, "entity", null, 1, 1, EntityAnnotation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
    initEReference(getEntityAnnotation_EntityAnnotations(), this.getAnnotation(), null, "entityAnnotations", null, 1, -1, EntityAnnotation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

    initEClass(fullURIEClass, FullURI.class, "FullURI", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getFullURI_Iri(), ecorePackage.getEString(), "iri", null, 1, 1, FullURI.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

    initEClass(abbreviatedURIEClass, AbbreviatedURI.class, "AbbreviatedURI", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getAbbreviatedURI_LocalName(), ecorePackage.getEString(), "localName", null, 1, 1, AbbreviatedURI.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

    initEClass(objectUnionOfEClass, ObjectUnionOf.class, "ObjectUnionOf", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getObjectUnionOf_ClassExpressions(), this.getClassExpression(), null, "classExpressions", null, 2, -1, ObjectUnionOf.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

    initEClass(inverseObjectPropertiesEClass, InverseObjectProperties.class, "InverseObjectProperties", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getInverseObjectProperties_ObjectPropertyExpression1(), this.getObjectPropertyExpression(), null, "ObjectPropertyExpression1", null, 0, 1, InverseObjectProperties.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
    initEReference(getInverseObjectProperties_ObjectPropertyExpression2(), this.getObjectPropertyExpression(), null, "ObjectPropertyExpression2", null, 0, 1, InverseObjectProperties.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

    initEClass(annotationByConstantEClass, AnnotationByConstant.class, "AnnotationByConstant", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getAnnotationByConstant_AnnotationValue(), this.getLiteral(), null, "annotationValue", null, 1, 1, AnnotationByConstant.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

    initEClass(annotationByEntityEClass, AnnotationByEntity.class, "AnnotationByEntity", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getAnnotationByEntity_AnnotationValue(), this.getEntity(), null, "annotationValue", null, 1, 1, AnnotationByEntity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

    initEClass(annotationByAnonymousIndividualEClass, AnnotationByAnonymousIndividual.class, "AnnotationByAnonymousIndividual", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getAnnotationByAnonymousIndividual_AnnotationValue(), this.getAnonymousIndividual(), null, "annotationValue", null, 1, 1, AnnotationByAnonymousIndividual.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

    initEClass(anonymousIndividualEClass, AnonymousIndividual.class, "AnonymousIndividual", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getAnonymousIndividual_NodeID(), ecorePackage.getEString(), "nodeID", null, 1, 1, AnonymousIndividual.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

    initEClass(declarationEClass, Declaration.class, "Declaration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getDeclaration_Entity(), this.getEntity(), null, "entity", null, 0, 1, Declaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getDeclaration_IsFunctional(), ecorePackage.getEBoolean(), "isFunctional", null, 0, 1, Declaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
    initEAttribute(getDeclaration_IsReflexive(), ecorePackage.getEBoolean(), "isReflexive", null, 0, 1, Declaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
    initEAttribute(getDeclaration_IsInverseFunctional(), ecorePackage.getEBoolean(), "isInverseFunctional", null, 0, 1, Declaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
    initEAttribute(getDeclaration_IsIrreflexive(), ecorePackage.getEBoolean(), "isIrreflexive", null, 0, 1, Declaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
    initEAttribute(getDeclaration_IsSymmetric(), ecorePackage.getEBoolean(), "isSymmetric", null, 0, 1, Declaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
    initEAttribute(getDeclaration_IsTransitive(), ecorePackage.getEBoolean(), "isTransitive", null, 0, 1, Declaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
    initEAttribute(getDeclaration_IsAsysmmetric(), ecorePackage.getEBoolean(), "isAsysmmetric", null, 0, 1, Declaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

    initEClass(objectAndDataPropertyAxiomEClass, ObjectAndDataPropertyAxiom.class, "ObjectAndDataPropertyAxiom", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(keyForEClass, KeyFor.class, "KeyFor", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getKeyFor_ClassExpression(), this.getClassExpression(), null, "classExpression", null, 1, 1, KeyFor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
    initEReference(getKeyFor_DataPropertyExpressions(), this.getDataPropertyExpression(), null, "dataPropertyExpressions", null, 0, -1, KeyFor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
    initEReference(getKeyFor_ObjectPropertyExpressions(), this.getObjectPropertyExpression(), null, "objectPropertyExpressions", null, 0, -1, KeyFor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

    initEClass(anonymousIndividualAnnotationEClass, AnonymousIndividualAnnotation.class, "AnonymousIndividualAnnotation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getAnonymousIndividualAnnotation_AnonymousIndividual(), this.getAnonymousIndividual(), null, "anonymousIndividual", null, 1, 1, AnonymousIndividualAnnotation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
    initEReference(getAnonymousIndividualAnnotation_AnonymousIndiviudalAnnotations(), this.getAnnotation(), null, "anonymousIndiviudalAnnotations", null, 1, -1, AnonymousIndividualAnnotation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

    initEClass(expressionEClass, Expression.class, "Expression", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(ontologyDocumentEClass, OntologyDocument.class, "OntologyDocument", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getOntologyDocument_Ontology(), this.getOntology(), null, "ontology", null, 1, 1, OntologyDocument.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getOntologyDocument_PrefixDefinition(), this.getPrefixDefinition(), null, "PrefixDefinition", null, 1, -1, OntologyDocument.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(prefixDefinitionEClass, PrefixDefinition.class, "PrefixDefinition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getPrefixDefinition_Pref(), ecorePackage.getEString(), "pref", null, 0, 1, PrefixDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getPrefixDefinition_Namespace(), this.getFullURI(), null, "namespace", null, 1, 1, PrefixDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(templateParameterEClass, TemplateParameter.class, "TemplateParameter", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getTemplateParameter_OwnedParameteredElement(), this.getParameterableElement(), this.getParameterableElement_OwningTemplateParameter(), "ownedParameteredElement", null, 0, 1, TemplateParameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getTemplateParameter_Signature(), this.getTemplateSignature(), this.getTemplateSignature_OwnedParameter(), "signature", null, 1, 1, TemplateParameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getTemplateParameter_ParameteredElement(), this.getParameterableElement(), this.getParameterableElement_TemplateParameter(), "parameteredElement", null, 1, 1, TemplateParameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(parameterableElementEClass, ParameterableElement.class, "ParameterableElement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getParameterableElement_OwningTemplateParameter(), this.getTemplateParameter(), this.getTemplateParameter_OwnedParameteredElement(), "owningTemplateParameter", null, 0, 1, ParameterableElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getParameterableElement_TemplateParameter(), this.getTemplateParameter(), this.getTemplateParameter_ParameteredElement(), "templateParameter", null, 0, 1, ParameterableElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(templateSignatureEClass, TemplateSignature.class, "TemplateSignature", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getTemplateSignature_Parameter(), this.getTemplateParameter(), null, "parameter", null, 1, -1, TemplateSignature.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getTemplateSignature_OwnedParameter(), this.getTemplateParameter(), this.getTemplateParameter_Signature(), "ownedParameter", null, 0, -1, TemplateSignature.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getTemplateSignature_Template(), this.getTemplateableElement(), this.getTemplateableElement_OwnedTemplateSignature(), "template", null, 1, 1, TemplateSignature.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(templateableElementEClass, TemplateableElement.class, "TemplateableElement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getTemplateableElement_OwnedTemplateSignature(), this.getTemplateSignature(), this.getTemplateSignature_Template(), "ownedTemplateSignature", null, 0, 1, TemplateableElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getTemplateableElement_TemplateBinding(), this.getTemplateBinding(), this.getTemplateBinding_BoundElement(), "templateBinding", null, 0, -1, TemplateableElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(packageEClass, de.uniko.isweb.emftext.owl2fs.owl2fs.Package.class, "Package", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getPackage_Expressions(), this.getExpression(), null, "expressions", null, 0, -1, de.uniko.isweb.emftext.owl2fs.owl2fs.Package.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
    initEReference(getPackage_Axioms(), this.getAxiom(), null, "axioms", null, 0, -1, de.uniko.isweb.emftext.owl2fs.owl2fs.Package.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
    initEAttribute(getPackage_PackageUri(), ecorePackage.getEString(), "PackageUri", null, 0, 1, de.uniko.isweb.emftext.owl2fs.owl2fs.Package.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(classifierTemplateParameterEClass, ClassifierTemplateParameter.class, "ClassifierTemplateParameter", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(templateParameterSubstitutionEClass, TemplateParameterSubstitution.class, "TemplateParameterSubstitution", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getTemplateParameterSubstitution_Actual(), this.getParameterableElement(), null, "actual", null, 1, 1, TemplateParameterSubstitution.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getTemplateParameterSubstitution_Formal(), this.getTemplateParameter(), null, "formal", null, 1, 1, TemplateParameterSubstitution.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getTemplateParameterSubstitution_TemplateBinding(), this.getTemplateBinding(), this.getTemplateBinding_ParameterSubstitution(), "templateBinding", null, 1, 1, TemplateParameterSubstitution.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(templateBindingEClass, TemplateBinding.class, "TemplateBinding", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getTemplateBinding_ParameterSubstitution(), this.getTemplateParameterSubstitution(), this.getTemplateParameterSubstitution_TemplateBinding(), "parameterSubstitution", null, 0, -1, TemplateBinding.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getTemplateBinding_BoundElement(), this.getTemplateableElement(), this.getTemplateableElement_TemplateBinding(), "boundElement", null, 1, 1, TemplateBinding.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getTemplateBinding_Signature(), this.getTemplateSignature(), null, "signature", null, 1, 1, TemplateBinding.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(dObjectEClass, DObject.class, "DObject", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(iObjectEClass, IObject.class, "IObject", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(ruleEClass, Rule.class, "Rule", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getRule_HasAntecedent(), this.getAntecedent(), null, "hasAntecedent", null, 1, 1, Rule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getRule_HasConsequent(), this.getConsequent(), null, "hasConsequent", null, 1, 1, Rule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getRule_SwrlVariables(), this.getVariable(), null, "swrlVariables", null, 0, -1, Rule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getRule_Name(), ecorePackage.getEString(), "name", null, 1, 1, Rule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(antecedentEClass, Antecedent.class, "Antecedent", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getAntecedent_ContainsAtoms(), this.getAtom(), this.getAtom_IsInAntecedent(), "containsAtoms", null, 0, -1, Antecedent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getAntecedent_Name(), ecorePackage.getEString(), "name", null, 0, 1, Antecedent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(consequentEClass, Consequent.class, "Consequent", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getConsequent_ContainsAtoms(), this.getAtom(), this.getAtom_IsInConsequent(), "containsAtoms", null, 0, -1, Consequent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getConsequent_Name(), ecorePackage.getEString(), "name", null, 0, 1, Consequent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(atomEClass, Atom.class, "Atom", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getAtom_IsInConsequent(), this.getConsequent(), this.getConsequent_ContainsAtoms(), "isInConsequent", null, 0, 1, Atom.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getAtom_IsInAntecedent(), this.getAntecedent(), this.getAntecedent_ContainsAtoms(), "isInAntecedent", null, 0, 1, Atom.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(dataRangeAtomEClass, DataRangeAtom.class, "DataRangeAtom", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getDataRangeAtom_HasPredicateSymbol(), this.getDataRange(), null, "hasPredicateSymbol", null, 1, 1, DataRangeAtom.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getDataRangeAtom_HasTerm(), this.getDObject(), null, "hasTerm", null, 1, 1, DataRangeAtom.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(classAtomEClass, ClassAtom.class, "ClassAtom", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getClassAtom_HasPredicateSymbol(), this.getClassExpression(), null, "hasPredicateSymbol", null, 1, 1, ClassAtom.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getClassAtom_HasTerm(), this.getIObject(), null, "hasTerm", null, 1, 1, ClassAtom.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(propertyAtomEClass, PropertyAtom.class, "PropertyAtom", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(individualPropetyAtomEClass, IndividualPropetyAtom.class, "IndividualPropetyAtom", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getIndividualPropetyAtom_HasPredicateSymbol(), this.getObjectPropertyExpression(), null, "hasPredicateSymbol", null, 1, 1, IndividualPropetyAtom.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getIndividualPropetyAtom_AtomTarget(), this.getClassAtom(), null, "atomTarget", null, 1, 1, IndividualPropetyAtom.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
    initEReference(getIndividualPropetyAtom_AtomSource(), this.getClassAtom(), null, "atomSource", null, 1, 1, IndividualPropetyAtom.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

    initEClass(datavaluedPropertyAtomEClass, DatavaluedPropertyAtom.class, "DatavaluedPropertyAtom", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getDatavaluedPropertyAtom_HasPredicateSymbol(), this.getDataPropertyExpression(), null, "hasPredicateSymbol", null, 1, 1, DatavaluedPropertyAtom.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getDatavaluedPropertyAtom_AtomTarget(), this.getDataRangeAtom(), null, "atomTarget", null, 1, 1, DatavaluedPropertyAtom.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
    initEReference(getDatavaluedPropertyAtom_AtomSource(), this.getDataRangeAtom(), null, "atomSource", null, 1, 1, DatavaluedPropertyAtom.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

    initEClass(termEClass, Term.class, "Term", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(variableEClass, Variable.class, "Variable", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getVariable_Name(), ecorePackage.getEString(), "name", null, 1, 1, Variable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(dataVariableEClass, DataVariable.class, "DataVariable", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(individualVariableEClass, IndividualVariable.class, "IndividualVariable", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(constantEClass, Constant.class, "Constant", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(builtInAtomEClass, BuiltInAtom.class, "BuiltInAtom", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getBuiltInAtom_HasPredicateSymbol(), this.getBuiltInID(), "hasPredicateSymbol", "", 1, 1, BuiltInAtom.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getBuiltInAtom_HasTerms(), this.getDObject(), null, "hasTerms", null, 0, -1, BuiltInAtom.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    // Initialize enums and add enum literals
    initEEnum(dataTypeMapsEEnum, DataTypeMaps.class, "DataTypeMaps");
    addEEnumLiteral(dataTypeMapsEEnum, DataTypeMaps.INTEGER);
    addEEnumLiteral(dataTypeMapsEEnum, DataTypeMaps.STRING);
    addEEnumLiteral(dataTypeMapsEEnum, DataTypeMaps.BOOLEAN);
    addEEnumLiteral(dataTypeMapsEEnum, DataTypeMaps.BYTE);
    addEEnumLiteral(dataTypeMapsEEnum, DataTypeMaps.DECIMAL);
    addEEnumLiteral(dataTypeMapsEEnum, DataTypeMaps.FLOAT);
    addEEnumLiteral(dataTypeMapsEEnum, DataTypeMaps.DOUBLE);
    addEEnumLiteral(dataTypeMapsEEnum, DataTypeMaps.DATA);
    addEEnumLiteral(dataTypeMapsEEnum, DataTypeMaps.DURATION);

    initEEnum(builtInIDEEnum, BuiltInID.class, "BuiltInID");
    addEEnumLiteral(builtInIDEEnum, BuiltInID.EQUAL);
    addEEnumLiteral(builtInIDEEnum, BuiltInID.NOT_EQUAL);

    // Create resource
    createResource(eNS_URI);
  }

} //Owl2fsPackageImpl
