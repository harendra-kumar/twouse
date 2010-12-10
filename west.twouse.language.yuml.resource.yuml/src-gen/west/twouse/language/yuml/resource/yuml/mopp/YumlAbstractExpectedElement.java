/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package west.twouse.language.yuml.resource.yuml.mopp;

/**
 * Abstract super class for all expected elements. Provides methods to add
 * followers.
 */
public abstract class YumlAbstractExpectedElement implements west.twouse.language.yuml.resource.yuml.IYumlExpectedElement {
	
	private org.eclipse.emf.ecore.EClass ruleMetaclass;
	private java.util.Set<west.twouse.language.yuml.resource.yuml.util.YumlPair<west.twouse.language.yuml.resource.yuml.IYumlExpectedElement, org.eclipse.emf.ecore.EStructuralFeature[]>> followers = new java.util.LinkedHashSet<west.twouse.language.yuml.resource.yuml.util.YumlPair<west.twouse.language.yuml.resource.yuml.IYumlExpectedElement, org.eclipse.emf.ecore.EStructuralFeature[]>>();
	
	public YumlAbstractExpectedElement(org.eclipse.emf.ecore.EClass ruleMetaclass) {
		super();
		this.ruleMetaclass = ruleMetaclass;
	}
	
	public org.eclipse.emf.ecore.EClass getRuleMetaclass() {
		return ruleMetaclass;
	}
	
	public void addFollower(west.twouse.language.yuml.resource.yuml.IYumlExpectedElement follower, org.eclipse.emf.ecore.EStructuralFeature[] path) {
		followers.add(new west.twouse.language.yuml.resource.yuml.util.YumlPair<west.twouse.language.yuml.resource.yuml.IYumlExpectedElement, org.eclipse.emf.ecore.EStructuralFeature[]>(follower, path));
	}
	
	public java.util.Collection<west.twouse.language.yuml.resource.yuml.util.YumlPair<west.twouse.language.yuml.resource.yuml.IYumlExpectedElement, org.eclipse.emf.ecore.EStructuralFeature[]>> getFollowers() {
		return followers;
	}
	
}
