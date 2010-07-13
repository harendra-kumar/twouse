/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package west.twouse.language.owl2fs.resource.owl2fs.mopp;

// java.lang.Exception class to represent invalid content types for parser instances.
//
// @see west.twouse.language.owl2fs.resource.owl2fs.IOwl2fsOptions.RESOURCE_CONTENT_TYPE
public class Owl2fsUnexpectedContentTypeException extends org.antlr.runtime.RecognitionException{
	
	private static final long serialVersionUID = 4791359811519433999L;
	
	private Object contentType = null;
	
	public  Owl2fsUnexpectedContentTypeException(Object contentType) {
		this.contentType = contentType;
	}
	
	public Object getContentType() {
		return contentType;
	}
}
