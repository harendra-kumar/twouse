/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package west.twouse.language.yuml.resource.yuml.mopp;

public class YumlLayoutInformationAdapter implements org.eclipse.emf.common.notify.Adapter {
	
	private org.eclipse.emf.common.notify.Notifier target;
	private java.util.List<west.twouse.language.yuml.resource.yuml.mopp.YumlLayoutInformation> layoutInformations = new java.util.ArrayList<west.twouse.language.yuml.resource.yuml.mopp.YumlLayoutInformation>();
	
	public org.eclipse.emf.common.notify.Notifier getTarget() {
		return target;
	}
	
	public boolean isAdapterForType(Object type) {
		return false;
	}
	
	public void notifyChanged(org.eclipse.emf.common.notify.Notification notification) {
	}
	
	public void setTarget(org.eclipse.emf.common.notify.Notifier newTarget) {
		this.target = newTarget;
	}
	
	public java.util.List<west.twouse.language.yuml.resource.yuml.mopp.YumlLayoutInformation> getLayoutInformations() {
		return layoutInformations;
	}
	
	public void addLayoutInformation(west.twouse.language.yuml.resource.yuml.mopp.YumlLayoutInformation layoutInformation) {
		layoutInformations.add(layoutInformation);
	}
	
	public void replaceProxy(org.eclipse.emf.ecore.EObject proxy, org.eclipse.emf.ecore.EObject target) {
		for (west.twouse.language.yuml.resource.yuml.mopp.YumlLayoutInformation layoutInformation : layoutInformations) {
			layoutInformation.replaceProxy(proxy, target);
		}
	}
	
}
