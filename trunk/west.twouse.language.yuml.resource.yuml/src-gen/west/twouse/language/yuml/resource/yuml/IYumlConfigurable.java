/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package west.twouse.language.yuml.resource.yuml;

/**
 * Implementors of this interface can be configured by a map of options (or
 * parameters).
 */
public interface IYumlConfigurable {
	
	/**
	 * Passes the options given by the map to the configurable object.
	 */
	public void setOptions(java.util.Map<?,?> options);
}
