/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package west.twouse.language.sparqlas.resource.sparqlas.mopp;

/**
 * Abstract super class for all expected elements. Provides methods to add
 * followers.
 */
public abstract class SparqlasAbstractExpectedElement implements west.twouse.language.sparqlas.resource.sparqlas.ISparqlasExpectedElement {
	
	private org.eclipse.emf.ecore.EClass ruleMetaclass;
	private java.util.Set<west.twouse.language.sparqlas.resource.sparqlas.util.SparqlasPair<west.twouse.language.sparqlas.resource.sparqlas.ISparqlasExpectedElement, org.eclipse.emf.ecore.EStructuralFeature[]>> followers = new java.util.LinkedHashSet<west.twouse.language.sparqlas.resource.sparqlas.util.SparqlasPair<west.twouse.language.sparqlas.resource.sparqlas.ISparqlasExpectedElement, org.eclipse.emf.ecore.EStructuralFeature[]>>();
	
	public SparqlasAbstractExpectedElement(org.eclipse.emf.ecore.EClass ruleMetaclass) {
		super();
		this.ruleMetaclass = ruleMetaclass;
	}
	
	public org.eclipse.emf.ecore.EClass getRuleMetaclass() {
		return ruleMetaclass;
	}
	
	public void addFollower(west.twouse.language.sparqlas.resource.sparqlas.ISparqlasExpectedElement follower, org.eclipse.emf.ecore.EStructuralFeature[] path) {
		followers.add(new west.twouse.language.sparqlas.resource.sparqlas.util.SparqlasPair<west.twouse.language.sparqlas.resource.sparqlas.ISparqlasExpectedElement, org.eclipse.emf.ecore.EStructuralFeature[]>(follower, path));
	}
	
	public java.util.Collection<west.twouse.language.sparqlas.resource.sparqlas.util.SparqlasPair<west.twouse.language.sparqlas.resource.sparqlas.ISparqlasExpectedElement, org.eclipse.emf.ecore.EStructuralFeature[]>> getFollowers() {
		return followers;
	}
	
}
