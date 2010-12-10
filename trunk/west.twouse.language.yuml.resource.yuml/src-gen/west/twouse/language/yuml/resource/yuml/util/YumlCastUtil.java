/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package west.twouse.language.yuml.resource.yuml.util;

/**
 * Utility class that provides a method to cast objects to type parameterized
 * classes without a warning.
 */
public class YumlCastUtil {
	
	@SuppressWarnings("unchecked")	
	public static <T> T cast(Object temp) {
		return (T) temp;
	}
}
