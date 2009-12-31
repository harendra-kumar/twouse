/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.util;

// Class TextResourceUtil can be used to perform common tasks on text resources,
// such as loading and saving resources, as well as, checking them for errors.
public class Owl2fsTextResourceUtil {
	
	public static de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsResource getResource(org.eclipse.core.resources.IFile file) {
		org.eclipse.emf.ecore.resource.ResourceSet rs = new org.eclipse.emf.ecore.resource.impl.ResourceSetImpl();
		org.eclipse.emf.ecore.resource.Resource csResource = rs.getResource(org.eclipse.emf.common.util.URI.createPlatformResourceURI(file.getFullPath().toString(),true), true);
		return (de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsResource) csResource;
	}
	
	public static de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsResource getResource(java.io.File file) {
		return getResource(file, null);
	}
	
	public static de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsResource getResource(java.io.File file, java.util.Map<?,?> options) {
		org.eclipse.emf.ecore.resource.ResourceSet rs = new org.eclipse.emf.ecore.resource.impl.ResourceSetImpl();
		if (options != null) {
			rs.getLoadOptions().putAll(options);
		}
		org.eclipse.emf.ecore.resource.Resource csResource = rs.getResource(org.eclipse.emf.common.util.URI.createFileURI(file.getAbsolutePath()), true);
		return (de.uniko.isweb.emftext.owl2fs.owl2fs.resource.owl2fs.mopp.Owl2fsResource) csResource;
	}
}
