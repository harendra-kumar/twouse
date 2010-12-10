/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package west.twouse.language.yuml.resource.yuml.mopp;

/**
 * An Excpetion to represent invalid content types for parser instances.
 * 
 * @see west.twouse.language.yuml.resource.yuml.IYumlOptions.RESOURCE_CONTENT_TYPE
 */
public class YumlUnexpectedContentTypeException extends org.antlr.runtime3_2_0.RecognitionException{
	
	private static final long serialVersionUID = 4791359811519433999L;
	
	private Object contentType = null;
	
	public  YumlUnexpectedContentTypeException(Object contentType) {
		this.contentType = contentType;
	}
	
	public Object getContentType() {
		return contentType;
	}
	
}
