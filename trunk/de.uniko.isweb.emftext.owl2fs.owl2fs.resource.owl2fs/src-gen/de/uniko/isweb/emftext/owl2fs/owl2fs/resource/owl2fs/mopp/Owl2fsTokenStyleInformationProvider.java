/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp;

public class Owl2fsTokenStyleInformationProvider {
	
	public class TokenStyleImpl implements de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.IOwl2fsTokenStyle {
		
		private int[] color;
		private boolean bold;
		private boolean italic;
		private boolean strikethrough;
		private boolean underline;
		
		public TokenStyleImpl(int[] color, boolean bold, boolean italic, boolean striketrough, boolean underline) {
			super();
			this.color = color;
			this.bold = bold;
			this.italic = italic;
			this.strikethrough = striketrough;
			this.underline = underline;
		}
		
		public int[] getColorAsRGB() {
			return color;
		}
		
		public boolean isBold() {
			return bold;
		}
		
		public boolean isItalic() {
			return italic;
		}
		
		public boolean isStrikethrough() {
			return strikethrough;
		}
		
		public boolean isUnderline() {
			return underline;
		}
	}
	
	public de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.IOwl2fsTokenStyle getDefaultTokenStyle(java.lang.String tokenName) {
		if ("Annotation".equals(tokenName)) {
			return new TokenStyleImpl(new int[] {0x7F, 0x00, 0x55}, true, false, false, false);
		}
		if ("annotationProperty".equals(tokenName)) {
			return new TokenStyleImpl(new int[] {0x7F, 0x00, 0x55}, true, false, false, false);
		}
		if ("AnnotationProperty".equals(tokenName)) {
			return new TokenStyleImpl(new int[] {0x7F, 0x00, 0x55}, true, false, false, false);
		}
		if ("entityURI".equals(tokenName)) {
			return new TokenStyleImpl(new int[] {0x7F, 0x00, 0x55}, true, false, false, false);
		}
		if ("URI".equals(tokenName)) {
			return new TokenStyleImpl(new int[] {0x7F, 0x00, 0x55}, true, false, false, false);
		}
		if ("value".equals(tokenName)) {
			return new TokenStyleImpl(new int[] {0x7F, 0x00, 0x55}, true, false, false, false);
		}
		if ("Literal".equals(tokenName)) {
			return new TokenStyleImpl(new int[] {0x7F, 0x00, 0x55}, true, false, false, false);
		}
		if ("lexicalValue".equals(tokenName)) {
			return new TokenStyleImpl(new int[] {0x7F, 0x00, 0x55}, true, false, false, false);
		}
		if ("datatype".equals(tokenName)) {
			return new TokenStyleImpl(new int[] {0x7F, 0x00, 0x55}, true, false, false, false);
		}
		if ("Datatype".equals(tokenName)) {
			return new TokenStyleImpl(new int[] {0x7F, 0x00, 0x55}, true, false, false, false);
		}
		if ("arity".equals(tokenName)) {
			return new TokenStyleImpl(new int[] {0x7F, 0x00, 0x55}, true, false, false, false);
		}
		if ("dataType".equals(tokenName)) {
			return new TokenStyleImpl(new int[] {0x7F, 0x00, 0x55}, true, false, false, false);
		}
		if ("AsymmetricObjectProperty".equals(tokenName)) {
			return new TokenStyleImpl(new int[] {0x7F, 0x00, 0x55}, true, false, false, false);
		}
		if ("axiomAnnotations".equals(tokenName)) {
			return new TokenStyleImpl(new int[] {0x7F, 0x00, 0x55}, true, false, false, false);
		}
		if ("objectPropertyExpression".equals(tokenName)) {
			return new TokenStyleImpl(new int[] {0x7F, 0x00, 0x55}, true, false, false, false);
		}
		if ("ObjectProperty".equals(tokenName)) {
			return new TokenStyleImpl(new int[] {0x7F, 0x00, 0x55}, true, false, false, false);
		}
		if ("owningTemplateParameter".equals(tokenName)) {
			return new TokenStyleImpl(new int[] {0x7F, 0x00, 0x55}, true, false, false, false);
		}
		if ("templateParameter".equals(tokenName)) {
			return new TokenStyleImpl(new int[] {0x7F, 0x00, 0x55}, true, false, false, false);
		}
		if ("InverseObjectProperty".equals(tokenName)) {
			return new TokenStyleImpl(new int[] {0x7F, 0x00, 0x55}, true, false, false, false);
		}
		if ("objectProperty".equals(tokenName)) {
			return new TokenStyleImpl(new int[] {0x7F, 0x00, 0x55}, true, false, false, false);
		}
		if ("Class".equals(tokenName)) {
			return new TokenStyleImpl(new int[] {0x7F, 0x00, 0x55}, true, false, false, false);
		}
		if ("ObjectIntersectionOf".equals(tokenName)) {
			return new TokenStyleImpl(new int[] {0x7F, 0x00, 0x55}, true, false, false, false);
		}
		if ("classExpressions".equals(tokenName)) {
			return new TokenStyleImpl(new int[] {0x7F, 0x00, 0x55}, true, false, false, false);
		}
		if ("ObjectOneOf".equals(tokenName)) {
			return new TokenStyleImpl(new int[] {0x7F, 0x00, 0x55}, true, false, false, false);
		}
		if ("individuals".equals(tokenName)) {
			return new TokenStyleImpl(new int[] {0x7F, 0x00, 0x55}, true, false, false, false);
		}
		if ("NamedIndividual".equals(tokenName)) {
			return new TokenStyleImpl(new int[] {0x7F, 0x00, 0x55}, true, false, false, false);
		}
		if ("ObjectSomeValuesFrom".equals(tokenName)) {
			return new TokenStyleImpl(new int[] {0x7F, 0x00, 0x55}, true, false, false, false);
		}
		if ("classExpression".equals(tokenName)) {
			return new TokenStyleImpl(new int[] {0x7F, 0x00, 0x55}, true, false, false, false);
		}
		if ("ObjectAllValuesFrom".equals(tokenName)) {
			return new TokenStyleImpl(new int[] {0x7F, 0x00, 0x55}, true, false, false, false);
		}
		if ("ObjectExistsSelf".equals(tokenName)) {
			return new TokenStyleImpl(new int[] {0x7F, 0x00, 0x55}, true, false, false, false);
		}
		if ("ObjectHasValue".equals(tokenName)) {
			return new TokenStyleImpl(new int[] {0x7F, 0x00, 0x55}, true, false, false, false);
		}
		if ("individual".equals(tokenName)) {
			return new TokenStyleImpl(new int[] {0x7F, 0x00, 0x55}, true, false, false, false);
		}
		if ("ObjectMinCardinality".equals(tokenName)) {
			return new TokenStyleImpl(new int[] {0x7F, 0x00, 0x55}, true, false, false, false);
		}
		if ("cardinality".equals(tokenName)) {
			return new TokenStyleImpl(new int[] {0x7F, 0x00, 0x55}, true, false, false, false);
		}
		if ("ObjectMaxCardinality".equals(tokenName)) {
			return new TokenStyleImpl(new int[] {0x7F, 0x00, 0x55}, true, false, false, false);
		}
		if ("DataSomeValuesFrom".equals(tokenName)) {
			return new TokenStyleImpl(new int[] {0x7F, 0x00, 0x55}, true, false, false, false);
		}
		if ("dataRange".equals(tokenName)) {
			return new TokenStyleImpl(new int[] {0x7F, 0x00, 0x55}, true, false, false, false);
		}
		if ("dataPropertyExpressions".equals(tokenName)) {
			return new TokenStyleImpl(new int[] {0x7F, 0x00, 0x55}, true, false, false, false);
		}
		if ("DataProperty".equals(tokenName)) {
			return new TokenStyleImpl(new int[] {0x7F, 0x00, 0x55}, true, false, false, false);
		}
		if ("DataOneOf".equals(tokenName)) {
			return new TokenStyleImpl(new int[] {0x7F, 0x00, 0x55}, true, false, false, false);
		}
		if ("constants".equals(tokenName)) {
			return new TokenStyleImpl(new int[] {0x7F, 0x00, 0x55}, true, false, false, false);
		}
		if ("DatatypeRestriction".equals(tokenName)) {
			return new TokenStyleImpl(new int[] {0x7F, 0x00, 0x55}, true, false, false, false);
		}
		if ("restrictions".equals(tokenName)) {
			return new TokenStyleImpl(new int[] {0x7F, 0x00, 0x55}, true, false, false, false);
		}
		if ("FacetConstantPair".equals(tokenName)) {
			return new TokenStyleImpl(new int[] {0x7F, 0x00, 0x55}, true, false, false, false);
		}
		if ("constant".equals(tokenName)) {
			return new TokenStyleImpl(new int[] {0x7F, 0x00, 0x55}, true, false, false, false);
		}
		if ("facet".equals(tokenName)) {
			return new TokenStyleImpl(new int[] {0x7F, 0x00, 0x55}, true, false, false, false);
		}
		if ("DataAllValuesFrom".equals(tokenName)) {
			return new TokenStyleImpl(new int[] {0x7F, 0x00, 0x55}, true, false, false, false);
		}
		if ("DataHasValue".equals(tokenName)) {
			return new TokenStyleImpl(new int[] {0x7F, 0x00, 0x55}, true, false, false, false);
		}
		if ("dataPropertyExpression".equals(tokenName)) {
			return new TokenStyleImpl(new int[] {0x7F, 0x00, 0x55}, true, false, false, false);
		}
		if ("DataMinCardinality".equals(tokenName)) {
			return new TokenStyleImpl(new int[] {0x7F, 0x00, 0x55}, true, false, false, false);
		}
		if ("DataMaxCardinality".equals(tokenName)) {
			return new TokenStyleImpl(new int[] {0x7F, 0x00, 0x55}, true, false, false, false);
		}
		if ("DataExactCardinality".equals(tokenName)) {
			return new TokenStyleImpl(new int[] {0x7F, 0x00, 0x55}, true, false, false, false);
		}
		if ("NegativeDataPropertyAssertion".equals(tokenName)) {
			return new TokenStyleImpl(new int[] {0x7F, 0x00, 0x55}, true, false, false, false);
		}
		if ("targetValue".equals(tokenName)) {
			return new TokenStyleImpl(new int[] {0x7F, 0x00, 0x55}, true, false, false, false);
		}
		if ("sourceIndividual".equals(tokenName)) {
			return new TokenStyleImpl(new int[] {0x7F, 0x00, 0x55}, true, false, false, false);
		}
		if ("DataPropertyDomain".equals(tokenName)) {
			return new TokenStyleImpl(new int[] {0x7F, 0x00, 0x55}, true, false, false, false);
		}
		if ("domain".equals(tokenName)) {
			return new TokenStyleImpl(new int[] {0x7F, 0x00, 0x55}, true, false, false, false);
		}
		if ("DataPropertyRange".equals(tokenName)) {
			return new TokenStyleImpl(new int[] {0x7F, 0x00, 0x55}, true, false, false, false);
		}
		if ("range".equals(tokenName)) {
			return new TokenStyleImpl(new int[] {0x7F, 0x00, 0x55}, true, false, false, false);
		}
		if ("DifferentIndividuals".equals(tokenName)) {
			return new TokenStyleImpl(new int[] {0x7F, 0x00, 0x55}, true, false, false, false);
		}
		if ("differentIndividuals".equals(tokenName)) {
			return new TokenStyleImpl(new int[] {0x7F, 0x00, 0x55}, true, false, false, false);
		}
		if ("DisjointClasses".equals(tokenName)) {
			return new TokenStyleImpl(new int[] {0x7F, 0x00, 0x55}, true, false, false, false);
		}
		if ("disjointClassExpressions".equals(tokenName)) {
			return new TokenStyleImpl(new int[] {0x7F, 0x00, 0x55}, true, false, false, false);
		}
		if ("DisjointDataProperties".equals(tokenName)) {
			return new TokenStyleImpl(new int[] {0x7F, 0x00, 0x55}, true, false, false, false);
		}
		if ("DisjointObjectProperties".equals(tokenName)) {
			return new TokenStyleImpl(new int[] {0x7F, 0x00, 0x55}, true, false, false, false);
		}
		if ("objectPropertyExpressions".equals(tokenName)) {
			return new TokenStyleImpl(new int[] {0x7F, 0x00, 0x55}, true, false, false, false);
		}
		if ("DisjointUnion".equals(tokenName)) {
			return new TokenStyleImpl(new int[] {0x7F, 0x00, 0x55}, true, false, false, false);
		}
		if ("unionClass".equals(tokenName)) {
			return new TokenStyleImpl(new int[] {0x7F, 0x00, 0x55}, true, false, false, false);
		}
		if ("EquivalentClasses".equals(tokenName)) {
			return new TokenStyleImpl(new int[] {0x7F, 0x00, 0x55}, true, false, false, false);
		}
		if ("equivalentClassExpressions".equals(tokenName)) {
			return new TokenStyleImpl(new int[] {0x7F, 0x00, 0x55}, true, false, false, false);
		}
		if ("EquivalentDataProperties".equals(tokenName)) {
			return new TokenStyleImpl(new int[] {0x7F, 0x00, 0x55}, true, false, false, false);
		}
		if ("EquivalentObjectProperties".equals(tokenName)) {
			return new TokenStyleImpl(new int[] {0x7F, 0x00, 0x55}, true, false, false, false);
		}
		if ("FunctionalDataProperty".equals(tokenName)) {
			return new TokenStyleImpl(new int[] {0x7F, 0x00, 0x55}, true, false, false, false);
		}
		if ("FunctionalObjectProperty".equals(tokenName)) {
			return new TokenStyleImpl(new int[] {0x7F, 0x00, 0x55}, true, false, false, false);
		}
		if ("InverseFunctionalObjectProperty".equals(tokenName)) {
			return new TokenStyleImpl(new int[] {0x7F, 0x00, 0x55}, true, false, false, false);
		}
		if ("ObjectPropertyAssertion".equals(tokenName)) {
			return new TokenStyleImpl(new int[] {0x7F, 0x00, 0x55}, true, false, false, false);
		}
		if ("targetIndividual".equals(tokenName)) {
			return new TokenStyleImpl(new int[] {0x7F, 0x00, 0x55}, true, false, false, false);
		}
		if ("NegativeObjectPropertyAssertion".equals(tokenName)) {
			return new TokenStyleImpl(new int[] {0x7F, 0x00, 0x55}, true, false, false, false);
		}
		if ("ObjectPropertyDomain".equals(tokenName)) {
			return new TokenStyleImpl(new int[] {0x7F, 0x00, 0x55}, true, false, false, false);
		}
		if ("SymmetricObjectProperty".equals(tokenName)) {
			return new TokenStyleImpl(new int[] {0x7F, 0x00, 0x55}, true, false, false, false);
		}
		if ("ReflexiveObjectProperty".equals(tokenName)) {
			return new TokenStyleImpl(new int[] {0x7F, 0x00, 0x55}, true, false, false, false);
		}
		if ("SubDataPropertyOf".equals(tokenName)) {
			return new TokenStyleImpl(new int[] {0x7F, 0x00, 0x55}, true, false, false, false);
		}
		if ("superDataPropertyExpression".equals(tokenName)) {
			return new TokenStyleImpl(new int[] {0x7F, 0x00, 0x55}, true, false, false, false);
		}
		if ("subDataPropertyExpression".equals(tokenName)) {
			return new TokenStyleImpl(new int[] {0x7F, 0x00, 0x55}, true, false, false, false);
		}
		if ("SameIndividual".equals(tokenName)) {
			return new TokenStyleImpl(new int[] {0x7F, 0x00, 0x55}, true, false, false, false);
		}
		if ("sameIndividuals".equals(tokenName)) {
			return new TokenStyleImpl(new int[] {0x7F, 0x00, 0x55}, true, false, false, false);
		}
		if ("SubObjectPropertyOf".equals(tokenName)) {
			return new TokenStyleImpl(new int[] {0x7F, 0x00, 0x55}, true, false, false, false);
		}
		if ("superObjectPropertyExpression".equals(tokenName)) {
			return new TokenStyleImpl(new int[] {0x7F, 0x00, 0x55}, true, false, false, false);
		}
		if ("subObjectPropertyExpressions".equals(tokenName)) {
			return new TokenStyleImpl(new int[] {0x7F, 0x00, 0x55}, true, false, false, false);
		}
		if ("ObjectComplementOf".equals(tokenName)) {
			return new TokenStyleImpl(new int[] {0x7F, 0x00, 0x55}, true, false, false, false);
		}
		if ("Ontology".equals(tokenName)) {
			return new TokenStyleImpl(new int[] {0x7F, 0x00, 0x55}, true, false, false, false);
		}
		if ("ontologyAnnotations".equals(tokenName)) {
			return new TokenStyleImpl(new int[] {0x7F, 0x00, 0x55}, true, false, false, false);
		}
		if ("axioms".equals(tokenName)) {
			return new TokenStyleImpl(new int[] {0x7F, 0x00, 0x55}, true, false, false, false);
		}
		if ("importedOntologies".equals(tokenName)) {
			return new TokenStyleImpl(new int[] {0x7F, 0x00, 0x55}, true, false, false, false);
		}
		if ("expressions".equals(tokenName)) {
			return new TokenStyleImpl(new int[] {0x7F, 0x00, 0x55}, true, false, false, false);
		}
		if ("ontologyURI".equals(tokenName)) {
			return new TokenStyleImpl(new int[] {0x7F, 0x00, 0x55}, true, false, false, false);
		}
		if ("versionURI".equals(tokenName)) {
			return new TokenStyleImpl(new int[] {0x7F, 0x00, 0x55}, true, false, false, false);
		}
		if ("packages".equals(tokenName)) {
			return new TokenStyleImpl(new int[] {0x7F, 0x00, 0x55}, true, false, false, false);
		}
		if ("ObjectPropertyRange".equals(tokenName)) {
			return new TokenStyleImpl(new int[] {0x7F, 0x00, 0x55}, true, false, false, false);
		}
		if ("DataPropertyAssertion".equals(tokenName)) {
			return new TokenStyleImpl(new int[] {0x7F, 0x00, 0x55}, true, false, false, false);
		}
		if ("ClassAssertion".equals(tokenName)) {
			return new TokenStyleImpl(new int[] {0x7F, 0x00, 0x55}, true, false, false, false);
		}
		if ("IrreflexiveObjectProperty".equals(tokenName)) {
			return new TokenStyleImpl(new int[] {0x7F, 0x00, 0x55}, true, false, false, false);
		}
		if ("ObjectExactCardinality".equals(tokenName)) {
			return new TokenStyleImpl(new int[] {0x7F, 0x00, 0x55}, true, false, false, false);
		}
		if ("DataComplementOf".equals(tokenName)) {
			return new TokenStyleImpl(new int[] {0x7F, 0x00, 0x55}, true, false, false, false);
		}
		if ("SubClassOf".equals(tokenName)) {
			return new TokenStyleImpl(new int[] {0x7F, 0x00, 0x55}, true, false, false, false);
		}
		if ("subClassExpression".equals(tokenName)) {
			return new TokenStyleImpl(new int[] {0x7F, 0x00, 0x55}, true, false, false, false);
		}
		if ("superClassExpression".equals(tokenName)) {
			return new TokenStyleImpl(new int[] {0x7F, 0x00, 0x55}, true, false, false, false);
		}
		if ("SubObjectProperty".equals(tokenName)) {
			return new TokenStyleImpl(new int[] {0x7F, 0x00, 0x55}, true, false, false, false);
		}
		if ("TransitiveObjectProperty".equals(tokenName)) {
			return new TokenStyleImpl(new int[] {0x7F, 0x00, 0x55}, true, false, false, false);
		}
		if ("EntityAnnotation".equals(tokenName)) {
			return new TokenStyleImpl(new int[] {0x7F, 0x00, 0x55}, true, false, false, false);
		}
		if ("entity".equals(tokenName)) {
			return new TokenStyleImpl(new int[] {0x7F, 0x00, 0x55}, true, false, false, false);
		}
		if ("entityAnnotations".equals(tokenName)) {
			return new TokenStyleImpl(new int[] {0x7F, 0x00, 0x55}, true, false, false, false);
		}
		if ("FullURI".equals(tokenName)) {
			return new TokenStyleImpl(new int[] {0x7F, 0x00, 0x55}, true, false, false, false);
		}
		if ("iri".equals(tokenName)) {
			return new TokenStyleImpl(new int[] {0x7F, 0x00, 0x55}, true, false, false, false);
		}
		if ("AbbreviatedURI".equals(tokenName)) {
			return new TokenStyleImpl(new int[] {0x7F, 0x00, 0x55}, true, false, false, false);
		}
		if ("localName".equals(tokenName)) {
			return new TokenStyleImpl(new int[] {0x7F, 0x00, 0x55}, true, false, false, false);
		}
		if ("ObjectUnionOf".equals(tokenName)) {
			return new TokenStyleImpl(new int[] {0x7F, 0x00, 0x55}, true, false, false, false);
		}
		if ("InverseObjectProperties".equals(tokenName)) {
			return new TokenStyleImpl(new int[] {0x7F, 0x00, 0x55}, true, false, false, false);
		}
		if ("ObjectPropertyExpression1".equals(tokenName)) {
			return new TokenStyleImpl(new int[] {0x7F, 0x00, 0x55}, true, false, false, false);
		}
		if ("ObjectPropertyExpression2".equals(tokenName)) {
			return new TokenStyleImpl(new int[] {0x7F, 0x00, 0x55}, true, false, false, false);
		}
		if ("AnnotationByConstant".equals(tokenName)) {
			return new TokenStyleImpl(new int[] {0x7F, 0x00, 0x55}, true, false, false, false);
		}
		if ("annotationValue".equals(tokenName)) {
			return new TokenStyleImpl(new int[] {0x7F, 0x00, 0x55}, true, false, false, false);
		}
		if ("AnnotationByEntity".equals(tokenName)) {
			return new TokenStyleImpl(new int[] {0x7F, 0x00, 0x55}, true, false, false, false);
		}
		if ("AnnotationByAnonymousIndividual".equals(tokenName)) {
			return new TokenStyleImpl(new int[] {0x7F, 0x00, 0x55}, true, false, false, false);
		}
		if ("AnonymousIndividual".equals(tokenName)) {
			return new TokenStyleImpl(new int[] {0x7F, 0x00, 0x55}, true, false, false, false);
		}
		if ("nodeID".equals(tokenName)) {
			return new TokenStyleImpl(new int[] {0x7F, 0x00, 0x55}, true, false, false, false);
		}
		if ("Declaration".equals(tokenName)) {
			return new TokenStyleImpl(new int[] {0x7F, 0x00, 0x55}, true, false, false, false);
		}
		if ("KeyFor".equals(tokenName)) {
			return new TokenStyleImpl(new int[] {0x7F, 0x00, 0x55}, true, false, false, false);
		}
		if ("AnonymousIndividualAnnotation".equals(tokenName)) {
			return new TokenStyleImpl(new int[] {0x7F, 0x00, 0x55}, true, false, false, false);
		}
		if ("anonymousIndividual".equals(tokenName)) {
			return new TokenStyleImpl(new int[] {0x7F, 0x00, 0x55}, true, false, false, false);
		}
		if ("anonymousIndiviudalAnnotations".equals(tokenName)) {
			return new TokenStyleImpl(new int[] {0x7F, 0x00, 0x55}, true, false, false, false);
		}
		if ("OntologyDocument".equals(tokenName)) {
			return new TokenStyleImpl(new int[] {0x7F, 0x00, 0x55}, true, false, false, false);
		}
		if ("ontology".equals(tokenName)) {
			return new TokenStyleImpl(new int[] {0x7F, 0x00, 0x55}, true, false, false, false);
		}
		if ("PrefixDefinition".equals(tokenName)) {
			return new TokenStyleImpl(new int[] {0x7F, 0x00, 0x55}, true, false, false, false);
		}
		if ("pref".equals(tokenName)) {
			return new TokenStyleImpl(new int[] {0x7F, 0x00, 0x55}, true, false, false, false);
		}
		if ("namespace".equals(tokenName)) {
			return new TokenStyleImpl(new int[] {0x7F, 0x00, 0x55}, true, false, false, false);
		}
		if ("TemplateParameter".equals(tokenName)) {
			return new TokenStyleImpl(new int[] {0x7F, 0x00, 0x55}, true, false, false, false);
		}
		if ("ownedParameteredElement".equals(tokenName)) {
			return new TokenStyleImpl(new int[] {0x7F, 0x00, 0x55}, true, false, false, false);
		}
		if ("signature".equals(tokenName)) {
			return new TokenStyleImpl(new int[] {0x7F, 0x00, 0x55}, true, false, false, false);
		}
		if ("parameteredElement".equals(tokenName)) {
			return new TokenStyleImpl(new int[] {0x7F, 0x00, 0x55}, true, false, false, false);
		}
		if ("ParameterableElement".equals(tokenName)) {
			return new TokenStyleImpl(new int[] {0x7F, 0x00, 0x55}, true, false, false, false);
		}
		if ("TemplateSignature".equals(tokenName)) {
			return new TokenStyleImpl(new int[] {0x7F, 0x00, 0x55}, true, false, false, false);
		}
		if ("parameter".equals(tokenName)) {
			return new TokenStyleImpl(new int[] {0x7F, 0x00, 0x55}, true, false, false, false);
		}
		if ("ownedParameter".equals(tokenName)) {
			return new TokenStyleImpl(new int[] {0x7F, 0x00, 0x55}, true, false, false, false);
		}
		if ("template".equals(tokenName)) {
			return new TokenStyleImpl(new int[] {0x7F, 0x00, 0x55}, true, false, false, false);
		}
		if ("TemplateableElement".equals(tokenName)) {
			return new TokenStyleImpl(new int[] {0x7F, 0x00, 0x55}, true, false, false, false);
		}
		if ("ownedTemplateSignature".equals(tokenName)) {
			return new TokenStyleImpl(new int[] {0x7F, 0x00, 0x55}, true, false, false, false);
		}
		if ("templateBinding".equals(tokenName)) {
			return new TokenStyleImpl(new int[] {0x7F, 0x00, 0x55}, true, false, false, false);
		}
		if ("Package".equals(tokenName)) {
			return new TokenStyleImpl(new int[] {0x7F, 0x00, 0x55}, true, false, false, false);
		}
		if ("PackageUri".equals(tokenName)) {
			return new TokenStyleImpl(new int[] {0x7F, 0x00, 0x55}, true, false, false, false);
		}
		if ("ClassifierTemplateParameter".equals(tokenName)) {
			return new TokenStyleImpl(new int[] {0x7F, 0x00, 0x55}, true, false, false, false);
		}
		if ("TemplateParameterSubstitution".equals(tokenName)) {
			return new TokenStyleImpl(new int[] {0x7F, 0x00, 0x55}, true, false, false, false);
		}
		if ("actual".equals(tokenName)) {
			return new TokenStyleImpl(new int[] {0x7F, 0x00, 0x55}, true, false, false, false);
		}
		if ("formal".equals(tokenName)) {
			return new TokenStyleImpl(new int[] {0x7F, 0x00, 0x55}, true, false, false, false);
		}
		if ("TemplateBinding".equals(tokenName)) {
			return new TokenStyleImpl(new int[] {0x7F, 0x00, 0x55}, true, false, false, false);
		}
		if ("parameterSubstitution".equals(tokenName)) {
			return new TokenStyleImpl(new int[] {0x7F, 0x00, 0x55}, true, false, false, false);
		}
		if ("boundElement".equals(tokenName)) {
			return new TokenStyleImpl(new int[] {0x7F, 0x00, 0x55}, true, false, false, false);
		}
		if ("Rule".equals(tokenName)) {
			return new TokenStyleImpl(new int[] {0x7F, 0x00, 0x55}, true, false, false, false);
		}
		if ("hasAntecedent".equals(tokenName)) {
			return new TokenStyleImpl(new int[] {0x7F, 0x00, 0x55}, true, false, false, false);
		}
		if ("hasConsequent".equals(tokenName)) {
			return new TokenStyleImpl(new int[] {0x7F, 0x00, 0x55}, true, false, false, false);
		}
		if ("swrlVariables".equals(tokenName)) {
			return new TokenStyleImpl(new int[] {0x7F, 0x00, 0x55}, true, false, false, false);
		}
		if ("name".equals(tokenName)) {
			return new TokenStyleImpl(new int[] {0x7F, 0x00, 0x55}, true, false, false, false);
		}
		if ("Antecedent".equals(tokenName)) {
			return new TokenStyleImpl(new int[] {0x7F, 0x00, 0x55}, true, false, false, false);
		}
		if ("containsAtoms".equals(tokenName)) {
			return new TokenStyleImpl(new int[] {0x7F, 0x00, 0x55}, true, false, false, false);
		}
		if ("Consequent".equals(tokenName)) {
			return new TokenStyleImpl(new int[] {0x7F, 0x00, 0x55}, true, false, false, false);
		}
		if ("DataRangeAtom".equals(tokenName)) {
			return new TokenStyleImpl(new int[] {0x7F, 0x00, 0x55}, true, false, false, false);
		}
		if ("isInConsequent".equals(tokenName)) {
			return new TokenStyleImpl(new int[] {0x7F, 0x00, 0x55}, true, false, false, false);
		}
		if ("isInAntecedent".equals(tokenName)) {
			return new TokenStyleImpl(new int[] {0x7F, 0x00, 0x55}, true, false, false, false);
		}
		if ("hasPredicateSymbol".equals(tokenName)) {
			return new TokenStyleImpl(new int[] {0x7F, 0x00, 0x55}, true, false, false, false);
		}
		if ("hasTerm".equals(tokenName)) {
			return new TokenStyleImpl(new int[] {0x7F, 0x00, 0x55}, true, false, false, false);
		}
		if ("ClassAtom".equals(tokenName)) {
			return new TokenStyleImpl(new int[] {0x7F, 0x00, 0x55}, true, false, false, false);
		}
		if ("IndividualPropetyAtom".equals(tokenName)) {
			return new TokenStyleImpl(new int[] {0x7F, 0x00, 0x55}, true, false, false, false);
		}
		if ("atomTarget".equals(tokenName)) {
			return new TokenStyleImpl(new int[] {0x7F, 0x00, 0x55}, true, false, false, false);
		}
		if ("atomSource".equals(tokenName)) {
			return new TokenStyleImpl(new int[] {0x7F, 0x00, 0x55}, true, false, false, false);
		}
		if ("DatavaluedPropertyAtom".equals(tokenName)) {
			return new TokenStyleImpl(new int[] {0x7F, 0x00, 0x55}, true, false, false, false);
		}
		if ("DataVariable".equals(tokenName)) {
			return new TokenStyleImpl(new int[] {0x7F, 0x00, 0x55}, true, false, false, false);
		}
		if ("IndividualVariable".equals(tokenName)) {
			return new TokenStyleImpl(new int[] {0x7F, 0x00, 0x55}, true, false, false, false);
		}
		if ("BuiltInAtom".equals(tokenName)) {
			return new TokenStyleImpl(new int[] {0x7F, 0x00, 0x55}, true, false, false, false);
		}
		if ("hasTerms".equals(tokenName)) {
			return new TokenStyleImpl(new int[] {0x7F, 0x00, 0x55}, true, false, false, false);
		}
		if (":".equals(tokenName)) {
			return new TokenStyleImpl(new int[] {0x80, 0x00, 0x55}, true, false, false, false);
		}
		if ("Namespace".equals(tokenName)) {
			return new TokenStyleImpl(new int[] {0x80, 0x00, 0x55}, true, false, false, false);
		}
		if ("Import".equals(tokenName)) {
			return new TokenStyleImpl(new int[] {0x80, 0x00, 0x55}, true, false, false, false);
		}
		if ("Individual".equals(tokenName)) {
			return new TokenStyleImpl(new int[] {0x80, 0x00, 0x55}, true, false, false, false);
		}
		if ("ObjectInverseOf".equals(tokenName)) {
			return new TokenStyleImpl(new int[] {0x80, 0x00, 0x55}, true, false, false, false);
		}
		if ("Comment".equals(tokenName)) {
			return new TokenStyleImpl(new int[] {0x80, 0x00, 0x55}, true, false, false, false);
		}
		if ("Label".equals(tokenName)) {
			return new TokenStyleImpl(new int[] {0x80, 0x00, 0x55}, true, false, false, false);
		}
		if ("QUOTED_34_34".equals(tokenName)) {
			return new TokenStyleImpl(new int[] {0x2A, 0x00, 0xFF}, false, false, false, false);
		}
		return null;
	}
	
}
