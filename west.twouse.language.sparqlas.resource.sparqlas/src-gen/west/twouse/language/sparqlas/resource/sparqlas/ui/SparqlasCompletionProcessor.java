/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package west.twouse.language.sparqlas.resource.sparqlas.ui;

public class SparqlasCompletionProcessor implements org.eclipse.jface.text.contentassist.IContentAssistProcessor {
	
	private west.twouse.language.sparqlas.resource.sparqlas.ui.SparqlasEditor editor;
	
	public SparqlasCompletionProcessor(west.twouse.language.sparqlas.resource.sparqlas.ui.SparqlasEditor editor) {
		this.editor = editor;
	}
	
	public org.eclipse.jface.text.contentassist.ICompletionProposal[] computeCompletionProposals(org.eclipse.jface.text.ITextViewer viewer, int offset) {
		
		org.eclipse.emf.ecore.resource.Resource resource = editor.getResource();
		west.twouse.language.sparqlas.resource.sparqlas.ISparqlasTextResource textResource = (west.twouse.language.sparqlas.resource.sparqlas.ISparqlasTextResource) resource;
		String content = viewer.getDocument().get();
		west.twouse.language.sparqlas.resource.sparqlas.mopp.SparqlasCodeCompletionHelper helper = new west.twouse.language.sparqlas.resource.sparqlas.mopp.SparqlasCodeCompletionHelper();
		west.twouse.language.sparqlas.resource.sparqlas.mopp.SparqlasCompletionProposal[] proposals = helper.computeCompletionProposals(textResource, content, offset);
		
		org.eclipse.jface.text.contentassist.ICompletionProposal[] result = new org.eclipse.jface.text.contentassist.ICompletionProposal[proposals.length];
		int i = 0;
		for (west.twouse.language.sparqlas.resource.sparqlas.mopp.SparqlasCompletionProposal proposal : proposals) {
			String proposalString = proposal.getInsertString();
			String prefix = proposal.getPrefix();
			org.eclipse.jface.text.contentassist.IContextInformation info = new org.eclipse.jface.text.contentassist.ContextInformation(proposalString, proposalString);
			int begin = offset - prefix.length();
			result[i++] = new org.eclipse.jface.text.contentassist.CompletionProposal(proposalString, begin, prefix.length(), proposalString.length(), null, proposalString, info, proposalString);
		}
		return result;
	}
	
	public org.eclipse.jface.text.contentassist.IContextInformation[] computeContextInformation(org.eclipse.jface.text.ITextViewer viewer, int offset) {
		return null;
	}
	
	public char[] getCompletionProposalAutoActivationCharacters() {
		return null;
	}
	
	public char[] getContextInformationAutoActivationCharacters() {
		return null;
	}
	
	public org.eclipse.jface.text.contentassist.IContextInformationValidator getContextInformationValidator() {
		return null;
	}
	
	public String getErrorMessage() {
		return null;
	}
}
