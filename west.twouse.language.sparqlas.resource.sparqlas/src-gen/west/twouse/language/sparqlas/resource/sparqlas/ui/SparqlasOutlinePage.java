/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package west.twouse.language.sparqlas.resource.sparqlas.ui;

// Simple Outline Page using the ReflectiveItemAdapters provided by EMF
public class SparqlasOutlinePage extends org.eclipse.ui.part.Page implements org.eclipse.jface.viewers.ISelectionProvider, org.eclipse.jface.viewers.ISelectionChangedListener, org.eclipse.ui.views.contentoutline.IContentOutlinePage {
	
	private west.twouse.language.sparqlas.resource.sparqlas.ui.SparqlasEditor editor;
	private org.eclipse.jface.viewers.TreeViewer treeViewer;
	private org.eclipse.core.runtime.ListenerList selectionChangedListeners = new org.eclipse.core.runtime.ListenerList();
	
	public SparqlasOutlinePage(west.twouse.language.sparqlas.resource.sparqlas.ui.SparqlasEditor textEditor) {
		super();
		this.editor = textEditor;
	}
	
	public void createControl(org.eclipse.swt.widgets.Composite parent) {
		treeViewer = new west.twouse.language.sparqlas.resource.sparqlas.ui.SparqlasOutlinePageTreeViewer(parent, org.eclipse.swt.SWT.MULTI | org.eclipse.swt.SWT.H_SCROLL | org.eclipse.swt.SWT.V_SCROLL);
		Object[] listeners = selectionChangedListeners.getListeners();
		for (int i = 0; i < listeners.length; ++i) {
			org.eclipse.jface.viewers.ISelectionChangedListener l = (org.eclipse.jface.viewers.ISelectionChangedListener) listeners[i];
			treeViewer.addSelectionChangedListener(l);
		}
		selectionChangedListeners.clear();
		org.eclipse.emf.edit.provider.ComposedAdapterFactory adapterFactory = new org.eclipse.emf.edit.provider.ComposedAdapterFactory(		org.eclipse.emf.edit.provider.ComposedAdapterFactory.Descriptor.Registry.INSTANCE);
		adapterFactory.addAdapterFactory(new org.eclipse.emf.edit.provider.resource.ResourceItemProviderAdapterFactory());
		adapterFactory.addAdapterFactory(new org.eclipse.emf.ecore.provider.EcoreItemProviderAdapterFactory());
		adapterFactory.addAdapterFactory(new org.eclipse.emf.edit.provider.ReflectiveItemProviderAdapterFactory());
		org.eclipse.emf.edit.ui.provider.AdapterFactoryContentProvider contentProvider = new org.eclipse.emf.edit.ui.provider.AdapterFactoryContentProvider(adapterFactory);
		treeViewer.setAutoExpandLevel(3);
		treeViewer.setContentProvider(contentProvider);
		treeViewer.setLabelProvider(new org.eclipse.emf.edit.ui.provider.AdapterFactoryLabelProvider(adapterFactory));
		org.eclipse.emf.ecore.resource.ResourceSet resourceSet = editor.getResourceSet();
		org.eclipse.emf.common.util.EList<org.eclipse.emf.ecore.resource.Resource> resources = resourceSet.getResources();
		treeViewer.setInput(resources.get(0));
		if (!resources.isEmpty()) {
			// Select the root object in the view.
			treeViewer.setSelection(new org.eclipse.jface.viewers.StructuredSelection(resources.get(0)), true);
		}
	}
	
	public void addSelectionChangedListener(org.eclipse.jface.viewers.ISelectionChangedListener listener) {
		if (getTreeViewer() == null) {
			selectionChangedListeners.add(listener);
		} else {
			getTreeViewer().addSelectionChangedListener(listener);
		}
	}
	
	public org.eclipse.swt.widgets.Control getControl() {
		if (treeViewer == null) {
			return null;
		}
		return treeViewer.getControl();
	}
	
	public org.eclipse.jface.viewers.ISelection getSelection() {
		if (treeViewer == null) {
			return org.eclipse.jface.viewers.StructuredSelection.EMPTY;
		}
		return treeViewer.getSelection();
	}
	
	// Returns this page's tree viewer.
	//
	// @return this page's tree viewer, or <code>null</code> if
	//         <code>createControl</code> has not been called yet
	protected org.eclipse.jface.viewers.TreeViewer getTreeViewer() {
		return treeViewer;
	}
	
	public void init(org.eclipse.ui.part.IPageSite pageSite) {
		super.init(pageSite);
	}
	
	public void removeSelectionChangedListener(org.eclipse.jface.viewers.ISelectionChangedListener listener) {
		if (getTreeViewer() == null) {
			selectionChangedListeners.remove(listener);
		} else {
			getTreeViewer().removeSelectionChangedListener(listener);
		}
	}
	
	public void selectionChanged(org.eclipse.jface.viewers.SelectionChangedEvent event) {
		if (getTreeViewer() != null) {
			getTreeViewer().setSelection(event.getSelection(), true);
		}
	}
	
	// Sets focus to a part in the page.
	public void setFocus() {
		treeViewer.getControl().setFocus();
	}
	
	public void setSelection(org.eclipse.jface.viewers.ISelection selection) {
		if (treeViewer != null) {
			treeViewer.setSelection(selection);
		}
	}
	
}
