/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package west.twouse.language.yuml.resource.yuml;

public interface IYumlReferenceCache {
	public Object get(String identifier);
	public void put(String identifier, Object target);
}
