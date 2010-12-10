/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package west.twouse.language.yuml.resource.yuml.ui;

public class YumlCompletionProcessor implements org.eclipse.jface.text.contentassist.IContentAssistProcessor {
	
	private west.twouse.language.yuml.resource.yuml.ui.YumlEditor editor;
	
	public YumlCompletionProcessor(west.twouse.language.yuml.resource.yuml.ui.YumlEditor editor) {
		this.editor = editor;
	}
	
	public org.eclipse.jface.text.contentassist.ICompletionProposal[] computeCompletionProposals(org.eclipse.jface.text.ITextViewer viewer, int offset) {
		
		org.eclipse.emf.ecore.resource.Resource resource = editor.getResource();
		west.twouse.language.yuml.resource.yuml.IYumlTextResource textResource = (west.twouse.language.yuml.resource.yuml.IYumlTextResource) resource;
		String content = viewer.getDocument().get();
		west.twouse.language.yuml.resource.yuml.ui.YumlCodeCompletionHelper helper = new west.twouse.language.yuml.resource.yuml.ui.YumlCodeCompletionHelper();
		west.twouse.language.yuml.resource.yuml.ui.YumlCompletionProposal[] computedProposals = helper.computeCompletionProposals(textResource, content, offset);
		
		// call completion proposal post processor to allow for customizing the proposals
		west.twouse.language.yuml.resource.yuml.ui.YumlProposalPostProcessor proposalPostProcessor = new west.twouse.language.yuml.resource.yuml.ui.YumlProposalPostProcessor();
		java.util.List<west.twouse.language.yuml.resource.yuml.ui.YumlCompletionProposal> computedProposalList = java.util.Arrays.asList(computedProposals);
		java.util.List<west.twouse.language.yuml.resource.yuml.ui.YumlCompletionProposal> extendedProposalList = proposalPostProcessor.process(computedProposalList);
		if (extendedProposalList == null) {
			extendedProposalList = java.util.Collections.emptyList();
		}
		java.util.List<west.twouse.language.yuml.resource.yuml.ui.YumlCompletionProposal> finalProposalList = new java.util.ArrayList<west.twouse.language.yuml.resource.yuml.ui.YumlCompletionProposal>();
		for (west.twouse.language.yuml.resource.yuml.ui.YumlCompletionProposal proposal : extendedProposalList) {
			if (proposal.getMatchesPrefix()) {
				finalProposalList.add(proposal);
			}
		}
		org.eclipse.jface.text.contentassist.ICompletionProposal[] result = new org.eclipse.jface.text.contentassist.ICompletionProposal[finalProposalList.size()];
		int i = 0;
		for (west.twouse.language.yuml.resource.yuml.ui.YumlCompletionProposal proposal : finalProposalList) {
			String proposalString = proposal.getInsertString();
			String displayString = proposal.getDisplayString();
			String prefix = proposal.getPrefix();
			org.eclipse.swt.graphics.Image image = proposal.getImage();
			org.eclipse.jface.text.contentassist.IContextInformation info;
			info = new org.eclipse.jface.text.contentassist.ContextInformation(image, proposalString, proposalString);
			int begin = offset - prefix.length();
			int replacementLength = prefix.length();
			// if a closing bracket was automatically inserted right before, we enlarge the
			// replacement length in order to overwrite the bracket.
			west.twouse.language.yuml.resource.yuml.ui.IYumlBracketHandler bracketHandler = editor.getBracketHandler();
			String closingBracket = bracketHandler.getClosingBracket();
			if (bracketHandler.addedClosingBracket() && proposalString.endsWith(closingBracket)) {
				replacementLength += closingBracket.length();
			}
			result[i++] = new org.eclipse.jface.text.contentassist.CompletionProposal(proposalString, begin, replacementLength, proposalString.length(), image, displayString, info, proposalString);
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
