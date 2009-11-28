/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.mopp;

public class SparqlasTokenStyleInformationProvider {
	
	public class TokenStyleImpl implements de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.ISparqlasTokenStyle {
		
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
	
	public de.uniko.isweb.emftext.sparqlas.SPARQLAS.resource.sparqlas.ISparqlasTokenStyle getDefaultTokenStyle(java.lang.String tokenName) {
		if ("NODE".equals(tokenName)) {
			return new TokenStyleImpl(new int[] {0x7F, 0x00, 0x55}, false, false, false, false);
		}
		if ("VARIABLE".equals(tokenName)) {
			return new TokenStyleImpl(new int[] {0x2a, 0x7f, 0xff}, false, false, false, false);
		}
		if ("OntologyDocument".equals(tokenName)) {
			return new TokenStyleImpl(new int[] {0x7F, 0x00, 0x55}, true, false, false, false);
		}
		if ("prefixDefinition".equals(tokenName)) {
			return new TokenStyleImpl(new int[] {0x7F, 0x00, 0x55}, true, false, false, false);
		}
		if ("query".equals(tokenName)) {
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
		if ("Query".equals(tokenName)) {
			return new TokenStyleImpl(new int[] {0x7F, 0x00, 0x55}, true, false, false, false);
		}
		if ("queryIRI".equals(tokenName)) {
			return new TokenStyleImpl(new int[] {0x7F, 0x00, 0x55}, true, false, false, false);
		}
		if ("atoms".equals(tokenName)) {
			return new TokenStyleImpl(new int[] {0x7F, 0x00, 0x55}, true, false, false, false);
		}
		if ("ClassVariable".equals(tokenName)) {
			return new TokenStyleImpl(new int[] {0x7F, 0x00, 0x55}, true, false, false, false);
		}
		if ("symbol".equals(tokenName)) {
			return new TokenStyleImpl(new int[] {0x7F, 0x00, 0x55}, true, false, false, false);
		}
		if ("ObjectPropertyVariable".equals(tokenName)) {
			return new TokenStyleImpl(new int[] {0x7F, 0x00, 0x55}, true, false, false, false);
		}
		if ("DataPropertyVariable".equals(tokenName)) {
			return new TokenStyleImpl(new int[] {0x7F, 0x00, 0x55}, true, false, false, false);
		}
		if ("IndividualVariable".equals(tokenName)) {
			return new TokenStyleImpl(new int[] {0x7F, 0x00, 0x55}, true, false, false, false);
		}
		if ("Class".equals(tokenName)) {
			return new TokenStyleImpl(new int[] {0x7F, 0x00, 0x55}, true, false, false, false);
		}
		if ("constantIRI".equals(tokenName)) {
			return new TokenStyleImpl(new int[] {0x7F, 0x00, 0x55}, true, false, false, false);
		}
		if ("Datatype".equals(tokenName)) {
			return new TokenStyleImpl(new int[] {0x7F, 0x00, 0x55}, true, false, false, false);
		}
		if ("ObjectProperty".equals(tokenName)) {
			return new TokenStyleImpl(new int[] {0x7F, 0x00, 0x55}, true, false, false, false);
		}
		if ("DataProperty".equals(tokenName)) {
			return new TokenStyleImpl(new int[] {0x7F, 0x00, 0x55}, true, false, false, false);
		}
		if ("NamedIndividual".equals(tokenName)) {
			return new TokenStyleImpl(new int[] {0x7F, 0x00, 0x55}, true, false, false, false);
		}
		if ("AnonymousIndividual".equals(tokenName)) {
			return new TokenStyleImpl(new int[] {0x7F, 0x00, 0x55}, true, false, false, false);
		}
		if ("nodeID".equals(tokenName)) {
			return new TokenStyleImpl(new int[] {0x7F, 0x00, 0x55}, true, false, false, false);
		}
		if ("Literal".equals(tokenName)) {
			return new TokenStyleImpl(new int[] {0x7F, 0x00, 0x55}, true, false, false, false);
		}
		if ("lexicalForm".equals(tokenName)) {
			return new TokenStyleImpl(new int[] {0x7F, 0x00, 0x55}, true, false, false, false);
		}
		if ("datatype".equals(tokenName)) {
			return new TokenStyleImpl(new int[] {0x7F, 0x00, 0x55}, true, false, false, false);
		}
		if ("EquivalentClasses".equals(tokenName)) {
			return new TokenStyleImpl(new int[] {0x7F, 0x00, 0x55}, true, false, false, false);
		}
		if ("classExpressions".equals(tokenName)) {
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
		if ("DisjointClasses".equals(tokenName)) {
			return new TokenStyleImpl(new int[] {0x7F, 0x00, 0x55}, true, false, false, false);
		}
		if ("ObjectPropertyAssertion".equals(tokenName)) {
			return new TokenStyleImpl(new int[] {0x7F, 0x00, 0x55}, true, false, false, false);
		}
		if ("sourceIndividual".equals(tokenName)) {
			return new TokenStyleImpl(new int[] {0x7F, 0x00, 0x55}, true, false, false, false);
		}
		if ("tagertIndividual".equals(tokenName)) {
			return new TokenStyleImpl(new int[] {0x7F, 0x00, 0x55}, true, false, false, false);
		}
		if ("objectPropertyExpression".equals(tokenName)) {
			return new TokenStyleImpl(new int[] {0x7F, 0x00, 0x55}, true, false, false, false);
		}
		if ("DataPropertyAssertion".equals(tokenName)) {
			return new TokenStyleImpl(new int[] {0x7F, 0x00, 0x55}, true, false, false, false);
		}
		if ("tagertValue".equals(tokenName)) {
			return new TokenStyleImpl(new int[] {0x7F, 0x00, 0x55}, true, false, false, false);
		}
		if ("dataPropertyExpression".equals(tokenName)) {
			return new TokenStyleImpl(new int[] {0x7F, 0x00, 0x55}, true, false, false, false);
		}
		if ("ClassAssertion".equals(tokenName)) {
			return new TokenStyleImpl(new int[] {0x7F, 0x00, 0x55}, true, false, false, false);
		}
		if ("individual".equals(tokenName)) {
			return new TokenStyleImpl(new int[] {0x7F, 0x00, 0x55}, true, false, false, false);
		}
		if ("classExpression".equals(tokenName)) {
			return new TokenStyleImpl(new int[] {0x7F, 0x00, 0x55}, true, false, false, false);
		}
		if ("SameIndividual".equals(tokenName)) {
			return new TokenStyleImpl(new int[] {0x7F, 0x00, 0x55}, true, false, false, false);
		}
		if ("individuals".equals(tokenName)) {
			return new TokenStyleImpl(new int[] {0x7F, 0x00, 0x55}, true, false, false, false);
		}
		if ("DifferentIndividuals".equals(tokenName)) {
			return new TokenStyleImpl(new int[] {0x7F, 0x00, 0x55}, true, false, false, false);
		}
		if ("EquivalentObjectProperties".equals(tokenName)) {
			return new TokenStyleImpl(new int[] {0x7F, 0x00, 0x55}, true, false, false, false);
		}
		if ("SubPropertyOf".equals(tokenName)) {
			return new TokenStyleImpl(new int[] {0x7F, 0x00, 0x55}, true, false, false, false);
		}
		if ("subObjectPropertyExpression".equals(tokenName)) {
			return new TokenStyleImpl(new int[] {0x7F, 0x00, 0x55}, true, false, false, false);
		}
		if ("superObjectPropertyExpression".equals(tokenName)) {
			return new TokenStyleImpl(new int[] {0x7F, 0x00, 0x55}, true, false, false, false);
		}
		if ("InverseObjectProperty".equals(tokenName)) {
			return new TokenStyleImpl(new int[] {0x7F, 0x00, 0x55}, true, false, false, false);
		}
		if ("objectProperty".equals(tokenName)) {
			return new TokenStyleImpl(new int[] {0x7F, 0x00, 0x55}, true, false, false, false);
		}
		if ("InverseObjectPropertyAtom".equals(tokenName)) {
			return new TokenStyleImpl(new int[] {0x7F, 0x00, 0x55}, true, false, false, false);
		}
		if ("objectPropertyExpression1".equals(tokenName)) {
			return new TokenStyleImpl(new int[] {0x7F, 0x00, 0x55}, true, false, false, false);
		}
		if ("objectPropertyExpression2".equals(tokenName)) {
			return new TokenStyleImpl(new int[] {0x7F, 0x00, 0x55}, true, false, false, false);
		}
		if ("FunctionalObjectProperty".equals(tokenName)) {
			return new TokenStyleImpl(new int[] {0x7F, 0x00, 0x55}, true, false, false, false);
		}
		if ("InverseFunctionalObjectProperty".equals(tokenName)) {
			return new TokenStyleImpl(new int[] {0x7F, 0x00, 0x55}, true, false, false, false);
		}
		if ("TransitiveObjectProperty".equals(tokenName)) {
			return new TokenStyleImpl(new int[] {0x7F, 0x00, 0x55}, true, false, false, false);
		}
		if ("SymmetricObjectProperty".equals(tokenName)) {
			return new TokenStyleImpl(new int[] {0x7F, 0x00, 0x55}, true, false, false, false);
		}
		if ("ObjectUnionOf".equals(tokenName)) {
			return new TokenStyleImpl(new int[] {0x7F, 0x00, 0x55}, true, false, false, false);
		}
		if ("ObjectComplementOf".equals(tokenName)) {
			return new TokenStyleImpl(new int[] {0x7F, 0x00, 0x55}, true, false, false, false);
		}
		if ("ObjectOneOf".equals(tokenName)) {
			return new TokenStyleImpl(new int[] {0x7F, 0x00, 0x55}, true, false, false, false);
		}
		if ("ObjectIntersectionOf".equals(tokenName)) {
			return new TokenStyleImpl(new int[] {0x7F, 0x00, 0x55}, true, false, false, false);
		}
		if ("ObjectAllValuesFrom".equals(tokenName)) {
			return new TokenStyleImpl(new int[] {0x7F, 0x00, 0x55}, true, false, false, false);
		}
		if ("ObjectSomeValuesFrom".equals(tokenName)) {
			return new TokenStyleImpl(new int[] {0x7F, 0x00, 0x55}, true, false, false, false);
		}
		if ("ObjectHasValue".equals(tokenName)) {
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
		if ("ObjectExactCardinality".equals(tokenName)) {
			return new TokenStyleImpl(new int[] {0x7F, 0x00, 0x55}, true, false, false, false);
		}
		if ("DataHasValue".equals(tokenName)) {
			return new TokenStyleImpl(new int[] {0x7F, 0x00, 0x55}, true, false, false, false);
		}
		if ("literal".equals(tokenName)) {
			return new TokenStyleImpl(new int[] {0x7F, 0x00, 0x55}, true, false, false, false);
		}
		if ("FULLIRI".equals(tokenName)) {
			return new TokenStyleImpl(new int[] {0x7F, 0x00, 0x55}, true, false, false, false);
		}
		if ("ABBRIRI".equals(tokenName)) {
			return new TokenStyleImpl(new int[] {0x7F, 0x00, 0x55}, true, false, false, false);
		}
		if ("id".equals(tokenName)) {
			return new TokenStyleImpl(new int[] {0x7F, 0x00, 0x55}, true, false, false, false);
		}
		if ("AbbreviatedIRI".equals(tokenName)) {
			return new TokenStyleImpl(new int[] {0x7F, 0x00, 0x55}, true, false, false, false);
		}
		if ("ObjectPropertyDeclaration".equals(tokenName)) {
			return new TokenStyleImpl(new int[] {0x7F, 0x00, 0x55}, true, false, false, false);
		}
		if ("objectPropertyVariable".equals(tokenName)) {
			return new TokenStyleImpl(new int[] {0x7F, 0x00, 0x55}, true, false, false, false);
		}
		if ("DatatypePropertyDeclaration".equals(tokenName)) {
			return new TokenStyleImpl(new int[] {0x7F, 0x00, 0x55}, true, false, false, false);
		}
		if ("datatypePropertyVariable".equals(tokenName)) {
			return new TokenStyleImpl(new int[] {0x7F, 0x00, 0x55}, true, false, false, false);
		}
		if ("IndividualDeclaration".equals(tokenName)) {
			return new TokenStyleImpl(new int[] {0x7F, 0x00, 0x55}, true, false, false, false);
		}
		if ("individualVariable".equals(tokenName)) {
			return new TokenStyleImpl(new int[] {0x7F, 0x00, 0x55}, true, false, false, false);
		}
		if ("ClassDeclaration".equals(tokenName)) {
			return new TokenStyleImpl(new int[] {0x7F, 0x00, 0x55}, true, false, false, false);
		}
		if ("classVariable".equals(tokenName)) {
			return new TokenStyleImpl(new int[] {0x7F, 0x00, 0x55}, true, false, false, false);
		}
		if ("Namespace".equals(tokenName)) {
			return new TokenStyleImpl(new int[] {0x80, 0x00, 0x55}, true, false, false, false);
		}
		if ("EquivalentClass".equals(tokenName)) {
			return new TokenStyleImpl(new int[] {0x80, 0x00, 0x55}, true, false, false, false);
		}
		if ("DisjointWith".equals(tokenName)) {
			return new TokenStyleImpl(new int[] {0x80, 0x00, 0x55}, true, false, false, false);
		}
		if ("PropertyValue".equals(tokenName)) {
			return new TokenStyleImpl(new int[] {0x80, 0x00, 0x55}, true, false, false, false);
		}
		if ("Type".equals(tokenName)) {
			return new TokenStyleImpl(new int[] {0x80, 0x00, 0x55}, true, false, false, false);
		}
		if ("SameAs".equals(tokenName)) {
			return new TokenStyleImpl(new int[] {0x80, 0x00, 0x55}, true, false, false, false);
		}
		if ("DifferentFrom".equals(tokenName)) {
			return new TokenStyleImpl(new int[] {0x80, 0x00, 0x55}, true, false, false, false);
		}
		if ("EquivalentProperty".equals(tokenName)) {
			return new TokenStyleImpl(new int[] {0x80, 0x00, 0x55}, true, false, false, false);
		}
		if ("InverseOf".equals(tokenName)) {
			return new TokenStyleImpl(new int[] {0x80, 0x00, 0x55}, true, false, false, false);
		}
		if ("Functional".equals(tokenName)) {
			return new TokenStyleImpl(new int[] {0x80, 0x00, 0x55}, true, false, false, false);
		}
		if ("InverseFunctional".equals(tokenName)) {
			return new TokenStyleImpl(new int[] {0x80, 0x00, 0x55}, true, false, false, false);
		}
		if ("Transitive".equals(tokenName)) {
			return new TokenStyleImpl(new int[] {0x80, 0x00, 0x55}, true, false, false, false);
		}
		if ("Symmetric".equals(tokenName)) {
			return new TokenStyleImpl(new int[] {0x80, 0x00, 0x55}, true, false, false, false);
		}
		if ("UnionOf".equals(tokenName)) {
			return new TokenStyleImpl(new int[] {0x80, 0x00, 0x55}, true, false, false, false);
		}
		if ("ComplementOf".equals(tokenName)) {
			return new TokenStyleImpl(new int[] {0x80, 0x00, 0x55}, true, false, false, false);
		}
		if ("OneOf".equals(tokenName)) {
			return new TokenStyleImpl(new int[] {0x80, 0x00, 0x55}, true, false, false, false);
		}
		if ("IntersectionOf".equals(tokenName)) {
			return new TokenStyleImpl(new int[] {0x80, 0x00, 0x55}, true, false, false, false);
		}
		if ("All".equals(tokenName)) {
			return new TokenStyleImpl(new int[] {0x80, 0x00, 0x55}, true, false, false, false);
		}
		if ("Some".equals(tokenName)) {
			return new TokenStyleImpl(new int[] {0x80, 0x00, 0x55}, true, false, false, false);
		}
		if ("Has".equals(tokenName)) {
			return new TokenStyleImpl(new int[] {0x80, 0x00, 0x55}, true, false, false, false);
		}
		if ("Min".equals(tokenName)) {
			return new TokenStyleImpl(new int[] {0x80, 0x00, 0x55}, true, false, false, false);
		}
		if ("Max".equals(tokenName)) {
			return new TokenStyleImpl(new int[] {0x80, 0x00, 0x55}, true, false, false, false);
		}
		if ("Exact".equals(tokenName)) {
			return new TokenStyleImpl(new int[] {0x80, 0x00, 0x55}, true, false, false, false);
		}
		if ("DatatypeProperty".equals(tokenName)) {
			return new TokenStyleImpl(new int[] {0x80, 0x00, 0x55}, true, false, false, false);
		}
		if ("Individual".equals(tokenName)) {
			return new TokenStyleImpl(new int[] {0x80, 0x00, 0x55}, true, false, false, false);
		}
		return null;
	}
	
}
