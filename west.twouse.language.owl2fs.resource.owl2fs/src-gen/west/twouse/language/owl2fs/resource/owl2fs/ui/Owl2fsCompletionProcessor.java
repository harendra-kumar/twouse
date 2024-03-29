/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package west.twouse.language.owl2fs.resource.owl2fs.ui;

public class Owl2fsCompletionProcessor implements org.eclipse.jface.text.contentassist.IContentAssistProcessor {
	
	private west.twouse.language.owl2fs.resource.owl2fs.ui.Owl2fsEditor editor;
	
	public Owl2fsCompletionProcessor(west.twouse.language.owl2fs.resource.owl2fs.ui.Owl2fsEditor editor) {
		this.editor = editor;
	}
	
	public org.eclipse.jface.text.contentassist.ICompletionProposal[] computeCompletionProposals(org.eclipse.jface.text.ITextViewer viewer, int offset) {
		
		org.eclipse.emf.ecore.resource.Resource resource = editor.getResource();
		west.twouse.language.owl2fs.resource.owl2fs.IOwl2fsTextResource textResource = (west.twouse.language.owl2fs.resource.owl2fs.IOwl2fsTextResource) resource;
		String content = viewer.getDocument().get();
		west.twouse.language.owl2fs.resource.owl2fs.mopp.Owl2fsCodeCompletionHelper helper = new west.twouse.language.owl2fs.resource.owl2fs.mopp.Owl2fsCodeCompletionHelper();
		west.twouse.language.owl2fs.resource.owl2fs.mopp.Owl2fsCompletionProposal[] proposals = helper.computeCompletionProposals(textResource, content, offset);
		
		org.eclipse.jface.text.contentassist.ICompletionProposal[] result = new org.eclipse.jface.text.contentassist.ICompletionProposal[proposals.length];
		int i = 0;
		for (west.twouse.language.owl2fs.resource.owl2fs.mopp.Owl2fsCompletionProposal proposal : proposals) {
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
