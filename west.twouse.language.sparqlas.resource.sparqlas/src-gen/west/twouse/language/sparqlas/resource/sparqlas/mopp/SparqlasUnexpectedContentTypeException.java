/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package west.twouse.language.sparqlas.resource.sparqlas.mopp;

// java.lang.Exception class to represent invalid content types for parser instances.
//
// @see west.twouse.language.sparqlas.resource.sparqlas.ISparqlasOptions.RESOURCE_CONTENT_TYPE
public class SparqlasUnexpectedContentTypeException extends org.antlr.runtime.RecognitionException{
	
	private static final long serialVersionUID = 4791359811519433999L;
	
	private Object contentType = null;
	
	public  SparqlasUnexpectedContentTypeException(Object contentType) {
		this.contentType = contentType;
	}
	
	public Object getContentType() {
		return contentType;
	}
}
