/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package west.twouse.language.yuml.resource.yuml.mopp;

/**
 * A representation for a range in a document where a boolean attribute is
 * expected.
 */
public class YumlExpectedBooleanTerminal extends west.twouse.language.yuml.resource.yuml.mopp.YumlAbstractExpectedElement {
	
	private west.twouse.language.yuml.resource.yuml.grammar.YumlBooleanTerminal booleanTerminal;
	
	public YumlExpectedBooleanTerminal(west.twouse.language.yuml.resource.yuml.grammar.YumlBooleanTerminal booleanTerminal) {
		super(booleanTerminal.getMetaclass());
		this.booleanTerminal = booleanTerminal;
	}
	
	public west.twouse.language.yuml.resource.yuml.grammar.YumlBooleanTerminal getBooleanTerminal() {
		return booleanTerminal;
	}
	
	private org.eclipse.emf.ecore.EStructuralFeature getFeature() {
		return booleanTerminal.getFeature();
	}
	
	public String toString() {
		return "EFeature " + getFeature().getEContainingClass().getName() + "." + getFeature().getName();
	}
	
	public boolean equals(Object o) {
		if (o instanceof YumlExpectedBooleanTerminal) {
			return getFeature().equals(((YumlExpectedBooleanTerminal) o).getFeature());
		}
		return false;
	}
	
	public java.util.Set<String> getTokenNames() {
		// BooleanTerminals are associated with two or one token(s)
		java.util.Set<String> tokenNames = new java.util.LinkedHashSet<String>(2);
		String trueLiteral = booleanTerminal.getTrueLiteral();
		if (!"".equals(trueLiteral)) {
			tokenNames.add("'" + trueLiteral + "'");
		}
		String falseLiteral = booleanTerminal.getFalseLiteral();
		if (!"".equals(falseLiteral)) {
			tokenNames.add("'" + falseLiteral + "'");
		}
		return tokenNames;
	}
	
}
