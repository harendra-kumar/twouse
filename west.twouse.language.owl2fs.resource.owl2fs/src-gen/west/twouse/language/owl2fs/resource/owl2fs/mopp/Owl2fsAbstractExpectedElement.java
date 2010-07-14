/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package west.twouse.language.owl2fs.resource.owl2fs.mopp;

/**
 * Abstract super class for all expected elements. Provides methods to add
 * followers.
 */
public abstract class Owl2fsAbstractExpectedElement implements west.twouse.language.owl2fs.resource.owl2fs.IOwl2fsExpectedElement {
	
	private org.eclipse.emf.ecore.EClass ruleMetaclass;
	private java.util.Set<west.twouse.language.owl2fs.resource.owl2fs.util.Owl2fsPair<west.twouse.language.owl2fs.resource.owl2fs.IOwl2fsExpectedElement, org.eclipse.emf.ecore.EStructuralFeature[]>> followers = new java.util.LinkedHashSet<west.twouse.language.owl2fs.resource.owl2fs.util.Owl2fsPair<west.twouse.language.owl2fs.resource.owl2fs.IOwl2fsExpectedElement, org.eclipse.emf.ecore.EStructuralFeature[]>>();
	
	public Owl2fsAbstractExpectedElement(org.eclipse.emf.ecore.EClass ruleMetaclass) {
		super();
		this.ruleMetaclass = ruleMetaclass;
	}
	
	public org.eclipse.emf.ecore.EClass getRuleMetaclass() {
		return ruleMetaclass;
	}
	
	public void addFollower(west.twouse.language.owl2fs.resource.owl2fs.IOwl2fsExpectedElement follower, org.eclipse.emf.ecore.EStructuralFeature[] path) {
		followers.add(new west.twouse.language.owl2fs.resource.owl2fs.util.Owl2fsPair<west.twouse.language.owl2fs.resource.owl2fs.IOwl2fsExpectedElement, org.eclipse.emf.ecore.EStructuralFeature[]>(follower, path));
	}
	
	public java.util.Collection<west.twouse.language.owl2fs.resource.owl2fs.util.Owl2fsPair<west.twouse.language.owl2fs.resource.owl2fs.IOwl2fsExpectedElement, org.eclipse.emf.ecore.EStructuralFeature[]>> getFollowers() {
		return followers;
	}
	
}
