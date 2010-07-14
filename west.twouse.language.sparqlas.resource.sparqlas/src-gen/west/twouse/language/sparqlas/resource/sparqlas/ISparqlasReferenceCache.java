/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package west.twouse.language.sparqlas.resource.sparqlas;

public interface ISparqlasReferenceCache {
	public java.lang.Object get(java.lang.String identifier);
	public void put(java.lang.String identifier, java.lang.Object target);
}
