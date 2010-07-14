/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package west.twouse.language.sparqlas.resource.sparqlas.mopp;

/**
 * An Excpetion to represent invalid content types for parser instances.
 * 
 * @see
 * west.twouse.language.sparqlas.resource.sparqlas.ISparqlasOptions.RESOURCE_CONTEN
 * T_TYPE
 */
public class SparqlasUnexpectedContentTypeException extends org.antlr.runtime3_2_0.RecognitionException{
	
	private static final long serialVersionUID = 4791359811519433999L;
	
	private Object contentType = null;
	
	public  SparqlasUnexpectedContentTypeException(Object contentType) {
		this.contentType = contentType;
	}
	
	public Object getContentType() {
		return contentType;
	}
	
}
