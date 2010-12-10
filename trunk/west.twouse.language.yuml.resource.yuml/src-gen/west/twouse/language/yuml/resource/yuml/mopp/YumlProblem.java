/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package west.twouse.language.yuml.resource.yuml.mopp;

public class YumlProblem implements west.twouse.language.yuml.resource.yuml.IYumlProblem {
	
	private String message;
	private west.twouse.language.yuml.resource.yuml.YumlEProblemType type;
	private java.util.Collection<west.twouse.language.yuml.resource.yuml.IYumlQuickFix> quickFixes;
	
	public YumlProblem(String message, west.twouse.language.yuml.resource.yuml.YumlEProblemType type) {
		this(message, type, java.util.Collections.<west.twouse.language.yuml.resource.yuml.IYumlQuickFix>emptySet());
	}
	
	public YumlProblem(String message, west.twouse.language.yuml.resource.yuml.YumlEProblemType type, west.twouse.language.yuml.resource.yuml.IYumlQuickFix quickFix) {
		this(message, type, java.util.Collections.singleton(quickFix));
	}
	
	public YumlProblem(String message, west.twouse.language.yuml.resource.yuml.YumlEProblemType type, java.util.Collection<west.twouse.language.yuml.resource.yuml.IYumlQuickFix> quickFixes) {
		super();
		this.message = message;
		this.type = type;
		this.quickFixes = new java.util.LinkedHashSet<west.twouse.language.yuml.resource.yuml.IYumlQuickFix>();
		this.quickFixes.addAll(quickFixes);
	}
	
	public west.twouse.language.yuml.resource.yuml.YumlEProblemType getType() {
		return type;
	}
	
	public String getMessage() {
		return message;
	}
	
	public java.util.Collection<west.twouse.language.yuml.resource.yuml.IYumlQuickFix> getQuickFixes() {
		return quickFixes;
	}
	
}
