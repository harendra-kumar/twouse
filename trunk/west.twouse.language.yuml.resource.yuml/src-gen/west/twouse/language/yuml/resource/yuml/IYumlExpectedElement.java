/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package west.twouse.language.yuml.resource.yuml;

/**
 * An element that is expected at a given position in a resource stream.
 */
public interface IYumlExpectedElement {
	
	/**
	 * Returns the names of all tokens that are expected at the given position
	 */
	public java.util.Set<String> getTokenNames();
	
	/**
	 * Returns the metaclass of the rule that contains the expected element
	 */
	public org.eclipse.emf.ecore.EClass getRuleMetaclass();
	
	/**
	 * Adds an element that is a valid follower for this element
	 */
	public void addFollower(west.twouse.language.yuml.resource.yuml.IYumlExpectedElement follower, org.eclipse.emf.ecore.EStructuralFeature[] path);
	
	/**
	 * Returns all valid followers for this element
	 */
	public java.util.Collection<west.twouse.language.yuml.resource.yuml.util.YumlPair<west.twouse.language.yuml.resource.yuml.IYumlExpectedElement, org.eclipse.emf.ecore.EStructuralFeature[]>> getFollowers();
	
}
