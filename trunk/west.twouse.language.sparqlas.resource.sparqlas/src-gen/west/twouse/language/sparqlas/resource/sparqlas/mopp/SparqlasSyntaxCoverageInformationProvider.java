/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package west.twouse.language.sparqlas.resource.sparqlas.mopp;

public class SparqlasSyntaxCoverageInformationProvider {
	
	public org.eclipse.emf.ecore.EClass[] getClassesWithSyntax() {
		return new org.eclipse.emf.ecore.EClass[] {
			west.twouse.language.sparqlas.SparqlasPackage.eINSTANCE.getFullIRI(),
			west.twouse.language.sparqlas.SparqlasPackage.eINSTANCE.getAbbreviatedIRI(),
			west.twouse.language.sparqlas.SparqlasPackage.eINSTANCE.getOntologyDocument(),
			west.twouse.language.sparqlas.SparqlasPackage.eINSTANCE.getImport(),
			west.twouse.language.sparqlas.SparqlasPackage.eINSTANCE.getPrefixDefinition(),
			west.twouse.language.sparqlas.SparqlasPackage.eINSTANCE.getSelectQuery(),
			west.twouse.language.sparqlas.SparqlasPackage.eINSTANCE.getConstructQuery(),
			west.twouse.language.sparqlas.SparqlasPackage.eINSTANCE.getAskQuery(),
			west.twouse.language.sparqlas.SparqlasPackage.eINSTANCE.getDescribeQuery(),
			west.twouse.language.sparqlas.SparqlasPackage.eINSTANCE.getVariable(),
			west.twouse.language.sparqlas.SparqlasPackage.eINSTANCE.getLiteralVariable(),
			west.twouse.language.sparqlas.SparqlasPackage.eINSTANCE.getClassVariable(),
			west.twouse.language.sparqlas.SparqlasPackage.eINSTANCE.getObjectPropertyVariable(),
			west.twouse.language.sparqlas.SparqlasPackage.eINSTANCE.getDataPropertyVariable(),
			west.twouse.language.sparqlas.SparqlasPackage.eINSTANCE.getIndividualVariable(),
			west.twouse.language.sparqlas.SparqlasPackage.eINSTANCE.getClass_(),
			west.twouse.language.sparqlas.SparqlasPackage.eINSTANCE.getDatatype(),
			west.twouse.language.sparqlas.SparqlasPackage.eINSTANCE.getObjectProperty(),
			west.twouse.language.sparqlas.SparqlasPackage.eINSTANCE.getDataProperty(),
			west.twouse.language.sparqlas.SparqlasPackage.eINSTANCE.getNamedIndividual(),
			west.twouse.language.sparqlas.SparqlasPackage.eINSTANCE.getAnonymousIndividual(),
			west.twouse.language.sparqlas.SparqlasPackage.eINSTANCE.getLiteral(),
			west.twouse.language.sparqlas.SparqlasPackage.eINSTANCE.getClassAssertion(),
			west.twouse.language.sparqlas.SparqlasPackage.eINSTANCE.getObjectPropertyAssertion(),
			west.twouse.language.sparqlas.SparqlasPackage.eINSTANCE.getDataPropertyAssertion(),
			west.twouse.language.sparqlas.SparqlasPackage.eINSTANCE.getNegativeObjectPropertyAssertion(),
			west.twouse.language.sparqlas.SparqlasPackage.eINSTANCE.getNegativeDataPropertyAssertion(),
			west.twouse.language.sparqlas.SparqlasPackage.eINSTANCE.getSameIndividual(),
			west.twouse.language.sparqlas.SparqlasPackage.eINSTANCE.getDifferentIndividuals(),
			west.twouse.language.sparqlas.SparqlasPackage.eINSTANCE.getSubClassOf(),
			west.twouse.language.sparqlas.SparqlasPackage.eINSTANCE.getEquivalentClasses(),
			west.twouse.language.sparqlas.SparqlasPackage.eINSTANCE.getDisjointClasses(),
			west.twouse.language.sparqlas.SparqlasPackage.eINSTANCE.getDisjointUnion(),
			west.twouse.language.sparqlas.SparqlasPackage.eINSTANCE.getObjectUnionOf(),
			west.twouse.language.sparqlas.SparqlasPackage.eINSTANCE.getObjectComplementOf(),
			west.twouse.language.sparqlas.SparqlasPackage.eINSTANCE.getObjectOneOf(),
			west.twouse.language.sparqlas.SparqlasPackage.eINSTANCE.getObjectIntersectionOf(),
			west.twouse.language.sparqlas.SparqlasPackage.eINSTANCE.getObjectAllValuesFrom(),
			west.twouse.language.sparqlas.SparqlasPackage.eINSTANCE.getObjectSomeValuesFrom(),
			west.twouse.language.sparqlas.SparqlasPackage.eINSTANCE.getObjectHasValue(),
			west.twouse.language.sparqlas.SparqlasPackage.eINSTANCE.getObjectMinCardinality(),
			west.twouse.language.sparqlas.SparqlasPackage.eINSTANCE.getObjectMaxCardinality(),
			west.twouse.language.sparqlas.SparqlasPackage.eINSTANCE.getObjectExactCardinality(),
			west.twouse.language.sparqlas.SparqlasPackage.eINSTANCE.getDataAllValuesFrom(),
			west.twouse.language.sparqlas.SparqlasPackage.eINSTANCE.getDataSomeValuesFrom(),
			west.twouse.language.sparqlas.SparqlasPackage.eINSTANCE.getDataHasValue(),
			west.twouse.language.sparqlas.SparqlasPackage.eINSTANCE.getDataMinCardinality(),
			west.twouse.language.sparqlas.SparqlasPackage.eINSTANCE.getDataMaxCardinality(),
			west.twouse.language.sparqlas.SparqlasPackage.eINSTANCE.getDataExactCardinality(),
			west.twouse.language.sparqlas.SparqlasPackage.eINSTANCE.getDataUnionOf(),
			west.twouse.language.sparqlas.SparqlasPackage.eINSTANCE.getDataComplementOf(),
			west.twouse.language.sparqlas.SparqlasPackage.eINSTANCE.getDataOneOf(),
			west.twouse.language.sparqlas.SparqlasPackage.eINSTANCE.getDataIntersectionOf(),
			west.twouse.language.sparqlas.SparqlasPackage.eINSTANCE.getDatatypeRestriction(),
			west.twouse.language.sparqlas.SparqlasPackage.eINSTANCE.getFacetRestriction(),
			west.twouse.language.sparqlas.SparqlasPackage.eINSTANCE.getSubObjectPropertyOf(),
			west.twouse.language.sparqlas.SparqlasPackage.eINSTANCE.getEquivalentObjectProperties(),
			west.twouse.language.sparqlas.SparqlasPackage.eINSTANCE.getDisjointObjectProperties(),
			west.twouse.language.sparqlas.SparqlasPackage.eINSTANCE.getObjectPropertyDomain(),
			west.twouse.language.sparqlas.SparqlasPackage.eINSTANCE.getObjectPropertyRange(),
			west.twouse.language.sparqlas.SparqlasPackage.eINSTANCE.getInverseObjectPropertyAtom(),
			west.twouse.language.sparqlas.SparqlasPackage.eINSTANCE.getFunctionalObjectProperty(),
			west.twouse.language.sparqlas.SparqlasPackage.eINSTANCE.getInverseFunctionalObjectProperty(),
			west.twouse.language.sparqlas.SparqlasPackage.eINSTANCE.getReflexiveObjectProperty(),
			west.twouse.language.sparqlas.SparqlasPackage.eINSTANCE.getIrreflexiveObjectProperty(),
			west.twouse.language.sparqlas.SparqlasPackage.eINSTANCE.getSymmetricObjectProperty(),
			west.twouse.language.sparqlas.SparqlasPackage.eINSTANCE.getAsymmetricObjectProperty(),
			west.twouse.language.sparqlas.SparqlasPackage.eINSTANCE.getTransitiveObjectProperty(),
			west.twouse.language.sparqlas.SparqlasPackage.eINSTANCE.getSubDataPropertyOf(),
			west.twouse.language.sparqlas.SparqlasPackage.eINSTANCE.getEquivalentDataProperties(),
			west.twouse.language.sparqlas.SparqlasPackage.eINSTANCE.getDisjointDataProperties(),
			west.twouse.language.sparqlas.SparqlasPackage.eINSTANCE.getDataPropertyDomain(),
			west.twouse.language.sparqlas.SparqlasPackage.eINSTANCE.getDataPropertyRange(),
			west.twouse.language.sparqlas.SparqlasPackage.eINSTANCE.getFunctionalDataProperty(),
			west.twouse.language.sparqlas.SparqlasPackage.eINSTANCE.getInverseObjectProperty(),
			west.twouse.language.sparqlas.SparqlasPackage.eINSTANCE.getObjectPropertyChain(),
			west.twouse.language.sparqlas.SparqlasPackage.eINSTANCE.getHasKey(),
			west.twouse.language.sparqlas.SparqlasPackage.eINSTANCE.getClassDeclaration(),
			west.twouse.language.sparqlas.SparqlasPackage.eINSTANCE.getObjectPropertyDeclaration(),
			west.twouse.language.sparqlas.SparqlasPackage.eINSTANCE.getDatatypePropertyDeclaration(),
			west.twouse.language.sparqlas.SparqlasPackage.eINSTANCE.getIndividualDeclaration(),
			west.twouse.language.sparqlas.SparqlasPackage.eINSTANCE.getTemplateSignature(),
			west.twouse.language.sparqlas.SparqlasPackage.eINSTANCE.getTemplateParameter(),
			west.twouse.language.sparqlas.SparqlasPackage.eINSTANCE.getTemplateBinding(),
			west.twouse.language.sparqlas.SparqlasPackage.eINSTANCE.getTemplateParameterSubstitution(),
			west.twouse.language.sparqlas.SparqlasPackage.eINSTANCE.getDirectClassAssertion(),
			west.twouse.language.sparqlas.SparqlasPackage.eINSTANCE.getDirectSubClassOf(),
			west.twouse.language.sparqlas.SparqlasPackage.eINSTANCE.getStrictSubClassOf(),
		};
	}
	
	public org.eclipse.emf.ecore.EClass[] getStartSymbols() {
		return new org.eclipse.emf.ecore.EClass[] {
			west.twouse.language.sparqlas.SparqlasPackage.eINSTANCE.getOntologyDocument(),
		};
	}
	
}
