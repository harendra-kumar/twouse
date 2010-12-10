/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package west.twouse.language.yuml.resource.yuml.analysis;

public class YumlVISIBILITYTokenResolver implements west.twouse.language.yuml.resource.yuml.IYumlTokenResolver {
	
	private west.twouse.language.yuml.resource.yuml.analysis.YumlDefaultTokenResolver defaultTokenResolver = new west.twouse.language.yuml.resource.yuml.analysis.YumlDefaultTokenResolver();
	
	public java.lang.String deResolve(java.lang.Object value, org.eclipse.emf.ecore.EStructuralFeature feature, org.eclipse.emf.ecore.EObject container) {
		String print = "";
		if (value.toString().equals("public"))
			print = "+";
		if (value.toString().equals("private"))
			print = "-";
		java.lang.String result = defaultTokenResolver.deResolve(print, feature, container);
		return result;
	}
	
	public void resolve(java.lang.String lexem, org.eclipse.emf.ecore.EStructuralFeature feature, west.twouse.language.yuml.resource.yuml.IYumlTokenResolveResult result) {
		String value = "";
		if (lexem.equals("+"))
			value = "public";
		if (lexem.equals("-"))
			value = "private";
		defaultTokenResolver.resolve(value, feature, result);
	}
	
	public void setOptions(java.util.Map<?,?> options) {
		defaultTokenResolver.setOptions(options);
	}
	
}
