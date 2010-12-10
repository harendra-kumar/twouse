/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package west.twouse.language.yuml.resource.yuml.mopp;

public class YumlSyntaxCoverageInformationProvider {
	
	public org.eclipse.emf.ecore.EClass[] getClassesWithSyntax() {
		return new org.eclipse.emf.ecore.EClass[] {
			west.twouse.language.yuml.YumlPackage.eINSTANCE.getModel(),
			west.twouse.language.yuml.YumlPackage.eINSTANCE.getClass_(),
			west.twouse.language.yuml.YumlPackage.eINSTANCE.getAssociation(),
			west.twouse.language.yuml.YumlPackage.eINSTANCE.getInheritance(),
			west.twouse.language.yuml.YumlPackage.eINSTANCE.getCardinality(),
			west.twouse.language.yuml.YumlPackage.eINSTANCE.getAttribute(),
			west.twouse.language.yuml.YumlPackage.eINSTANCE.getMethod(),
			west.twouse.language.yuml.YumlPackage.eINSTANCE.getNote(),
			west.twouse.language.yuml.YumlPackage.eINSTANCE.getEquivalence(),
		};
	}
	
	public org.eclipse.emf.ecore.EClass[] getStartSymbols() {
		return new org.eclipse.emf.ecore.EClass[] {
			west.twouse.language.yuml.YumlPackage.eINSTANCE.getModel(),
		};
	}
	
}
