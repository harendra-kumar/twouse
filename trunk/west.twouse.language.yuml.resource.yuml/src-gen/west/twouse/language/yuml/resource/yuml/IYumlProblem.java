/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package west.twouse.language.yuml.resource.yuml;

public interface IYumlProblem {
	public String getMessage();
	public west.twouse.language.yuml.resource.yuml.YumlEProblemType getType();
	public java.util.Collection<west.twouse.language.yuml.resource.yuml.IYumlQuickFix> getQuickFixes();
}
