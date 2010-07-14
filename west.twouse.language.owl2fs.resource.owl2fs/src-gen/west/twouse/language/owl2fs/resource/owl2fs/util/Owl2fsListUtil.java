/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package west.twouse.language.owl2fs.resource.owl2fs.util;

/**
 * A utility class that encapsulates some case operations that need to be
 * performed unchecked, because of Java's type erasure.
 */
public class Owl2fsListUtil {
	
	@SuppressWarnings("unchecked")	
	public static <T> java.util.List<T> castListUnchecked(Object list) {
		return (java.util.List<T>) list;
	}
	
	public static java.util.List<Object> copySafelyToObjectList(java.util.List<?> list) {
		java.util.Iterator<?> it = list.iterator();
		java.util.List<Object> castedCopy = new java.util.ArrayList<Object>();
		while (it.hasNext()) {
			castedCopy.add(it.next());
		}
		return castedCopy;
	}
}
