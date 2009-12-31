/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.ui;

// This class provides the configuration for the generated editor. It registers
// content assistance and syntax highlighting.
public class Owl2fsEditorConfiguration extends org.eclipse.jface.text.source.SourceViewerConfiguration {
	
	private de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.ui.Owl2fsColorManager colorManager;
	private de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.ui.Owl2fsEditor theEditor;
	
	// Create a new editor configuration.
	//
	// @param editor
	// @param colorManager
	///
	public Owl2fsEditorConfiguration(de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.ui.Owl2fsEditor editor, de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.ui.Owl2fsColorManager colorManager) {
		this.theEditor = editor;
		this.colorManager = colorManager;
	}
	
	public org.eclipse.jface.text.contentassist.IContentAssistant getContentAssistant(org.eclipse.jface.text.source.ISourceViewer sourceViewer) {
		
		org.eclipse.jface.text.contentassist.ContentAssistant assistant = new org.eclipse.jface.text.contentassist.ContentAssistant();
		assistant.setContentAssistProcessor(new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.ui.Owl2fsCompletionProcessor(theEditor), org.eclipse.jface.text.IDocument.DEFAULT_CONTENT_TYPE);
		assistant.enableAutoActivation(true);
		assistant.setAutoActivationDelay(500);
		assistant.setProposalPopupOrientation(org.eclipse.jface.text.contentassist.IContentAssistant.PROPOSAL_OVERLAY);
		assistant.setContextInformationPopupOrientation(org.eclipse.jface.text.contentassist.IContentAssistant.CONTEXT_INFO_ABOVE);
		
		return assistant;
	}
	
	public String[] getConfiguredContentTypes(org.eclipse.jface.text.source.ISourceViewer sourceViewer) {
		return new String[] {
			org.eclipse.jface.text.IDocument.DEFAULT_CONTENT_TYPE,
		};
	}
	
	// @param fileExtension
	// @return
	protected org.eclipse.jface.text.rules.ITokenScanner getScanner(String fileName) {
		return new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.ui.Owl2fsTokenScanner(colorManager);
	}
	
	public org.eclipse.jface.text.presentation.IPresentationReconciler getPresentationReconciler(org.eclipse.jface.text.source.ISourceViewer sourceViewer) {
		
		org.eclipse.jface.text.presentation.PresentationReconciler reconciler = new org.eclipse.jface.text.presentation.PresentationReconciler();
		String fileName = theEditor.getEditorInput().getName();
		
		org.eclipse.jface.text.rules.DefaultDamagerRepairer repairer = new org.eclipse.jface.text.rules.DefaultDamagerRepairer(getScanner(fileName));
		reconciler.setDamager(repairer, org.eclipse.jface.text.IDocument.DEFAULT_CONTENT_TYPE);
		reconciler.setRepairer(repairer, org.eclipse.jface.text.IDocument.DEFAULT_CONTENT_TYPE);
		
		return reconciler;
	}
	
	public org.eclipse.jface.text.source.IAnnotationHover getAnnotationHover(org.eclipse.jface.text.source.ISourceViewer sourceViewer) {
		return new org.eclipse.jface.text.source.DefaultAnnotationHover();
	}
	
	public org.eclipse.jface.text.ITextHover getTextHover(org.eclipse.jface.text.source.ISourceViewer sourceViewer, String contentType) {
		return new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.ui.Owl2fsTextHover(theEditor);
	}
	
	public org.eclipse.jface.text.hyperlink.IHyperlinkDetector[] getHyperlinkDetectors(org.eclipse.jface.text.source.ISourceViewer sourceViewer) {
		if (sourceViewer == null) {
			return null;
		}
		return new org.eclipse.jface.text.hyperlink.IHyperlinkDetector[] { new de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.ui.Owl2fsHyperlinkDetector(theEditor.getResource()) };
	}
	
}
