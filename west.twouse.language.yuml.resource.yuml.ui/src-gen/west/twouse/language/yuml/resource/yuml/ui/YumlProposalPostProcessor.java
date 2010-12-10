/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package west.twouse.language.yuml.resource.yuml.ui;

/**
 * A class which can be overridden to customize code completion proposals.
 */
public class YumlProposalPostProcessor {
	
	public java.util.List<west.twouse.language.yuml.resource.yuml.ui.YumlCompletionProposal> process(java.util.List<west.twouse.language.yuml.resource.yuml.ui.YumlCompletionProposal> proposals) {
		// the default implementation does returns the proposals as they are
		return proposals;
	}
	
}
