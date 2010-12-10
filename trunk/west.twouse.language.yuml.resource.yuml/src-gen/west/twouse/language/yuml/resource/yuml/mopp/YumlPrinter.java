/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package west.twouse.language.yuml.resource.yuml.mopp;

public class YumlPrinter implements west.twouse.language.yuml.resource.yuml.IYumlTextPrinter {
	
	protected west.twouse.language.yuml.resource.yuml.IYumlTokenResolverFactory tokenResolverFactory = new west.twouse.language.yuml.resource.yuml.mopp.YumlTokenResolverFactory();
	protected java.io.OutputStream outputStream;
	/**
	 * Holds the resource that is associated with this printer. may be null if the
	 * printer is used stand alone.
	 */
	private west.twouse.language.yuml.resource.yuml.IYumlTextResource resource;
	private java.util.Map<?, ?> options;
	
	public YumlPrinter(java.io.OutputStream outputStream, west.twouse.language.yuml.resource.yuml.IYumlTextResource resource) {
		super();
		this.outputStream = outputStream;
		this.resource = resource;
	}
	
	protected static int matchCount(java.util.Map<String, Integer> featureCounter, java.util.Collection<String> needed){
		int pos = 0;
		int neg = 0;
		
		for(String featureName:featureCounter.keySet()){
			if(needed.contains(featureName)){
				int value = featureCounter.get(featureName);
				if (value == 0) {
					neg += 1;
				} else {
					pos += 1;
				}
			}
		}
		return neg > 0 ? -neg : pos;
	}
	
	protected void doPrint(org.eclipse.emf.ecore.EObject element, java.io.PrintWriter out, String globaltab) {
		if (element == null) {
			throw new java.lang.IllegalArgumentException("Nothing to write.");
		}
		if (out == null) {
			throw new java.lang.IllegalArgumentException("Nothing to write on.");
		}
		
		if (element instanceof west.twouse.language.yuml.Model) {
			print_west_twouse_language_yuml_Model((west.twouse.language.yuml.Model) element, globaltab, out);
			return;
		}
		if (element instanceof west.twouse.language.yuml.Class) {
			print_west_twouse_language_yuml_Class((west.twouse.language.yuml.Class) element, globaltab, out);
			return;
		}
		if (element instanceof west.twouse.language.yuml.Association) {
			print_west_twouse_language_yuml_Association((west.twouse.language.yuml.Association) element, globaltab, out);
			return;
		}
		if (element instanceof west.twouse.language.yuml.Inheritance) {
			print_west_twouse_language_yuml_Inheritance((west.twouse.language.yuml.Inheritance) element, globaltab, out);
			return;
		}
		if (element instanceof west.twouse.language.yuml.Cardinality) {
			print_west_twouse_language_yuml_Cardinality((west.twouse.language.yuml.Cardinality) element, globaltab, out);
			return;
		}
		if (element instanceof west.twouse.language.yuml.Attribute) {
			print_west_twouse_language_yuml_Attribute((west.twouse.language.yuml.Attribute) element, globaltab, out);
			return;
		}
		if (element instanceof west.twouse.language.yuml.Method) {
			print_west_twouse_language_yuml_Method((west.twouse.language.yuml.Method) element, globaltab, out);
			return;
		}
		if (element instanceof west.twouse.language.yuml.Note) {
			print_west_twouse_language_yuml_Note((west.twouse.language.yuml.Note) element, globaltab, out);
			return;
		}
		if (element instanceof west.twouse.language.yuml.Equivalence) {
			print_west_twouse_language_yuml_Equivalence((west.twouse.language.yuml.Equivalence) element, globaltab, out);
			return;
		}
		
		addWarningToResource("The printer can not handle " + element.eClass().getName() + " elements", element);
	}
	
	protected west.twouse.language.yuml.resource.yuml.mopp.YumlReferenceResolverSwitch getReferenceResolverSwitch() {
		return (west.twouse.language.yuml.resource.yuml.mopp.YumlReferenceResolverSwitch) new west.twouse.language.yuml.resource.yuml.mopp.YumlMetaInformation().getReferenceResolverSwitch();
	}
	
	protected void addWarningToResource(final String errorMessage, org.eclipse.emf.ecore.EObject cause) {
		west.twouse.language.yuml.resource.yuml.IYumlTextResource resource = getResource();
		if (resource == null) {
			// the resource can be null if the printer is used stand alone
			return;
		}
		resource.addProblem(new west.twouse.language.yuml.resource.yuml.mopp.YumlProblem(errorMessage, west.twouse.language.yuml.resource.yuml.YumlEProblemType.ERROR), cause);
	}
	
	public void setOptions(java.util.Map<?,?> options) {
		this.options = options;
	}
	
	public java.util.Map<?,?> getOptions() {
		return options;
	}
	
	public west.twouse.language.yuml.resource.yuml.IYumlTextResource getResource() {
		return resource;
	}
	
	/**
	 * Calls {@link #doPrint(EObject, PrintWriter, String)} and writes the result to
	 * the underlying output stream.
	 */
	public void print(org.eclipse.emf.ecore.EObject element) {
		java.io.PrintWriter out = new java.io.PrintWriter(new java.io.BufferedOutputStream(outputStream));
		doPrint(element, out, "");
		out.flush();
		out.close();
	}
	
	public void print_west_twouse_language_yuml_Model(west.twouse.language.yuml.Model element, String outertab, java.io.PrintWriter out) {
		String localtab = outertab;
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		java.util.Map<String, Integer> printCountingMap = new java.util.LinkedHashMap<String, Integer>(1);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(west.twouse.language.yuml.YumlPackage.MODEL__ELEMENTS));
		printCountingMap.put("elements", temp == null ? 0 : ((java.util.Collection<?>) temp).size());
		// print collected hidden tokens
		java.io.StringWriter sWriter = null;
		java.io.PrintWriter out1 = null;
		java.util.Map<String, Integer> printCountingMap1 = null;
		// DEFINITION PART BEGINS (CompoundDefinition)
		sWriter = new java.io.StringWriter();
		out1 = new java.io.PrintWriter(sWriter);
		printCountingMap1 = new java.util.LinkedHashMap<String, Integer>(printCountingMap);
		print_west_twouse_language_yuml_Model_0(element, localtab, out1, printCountingMap1);
		if (printCountingMap.equals(printCountingMap1)) {
			out1.close();
		} else {
			out1.flush();
			out1.close();
			out.print(sWriter.toString());
			printCountingMap.putAll(printCountingMap1);
		}
	}
	public void print_west_twouse_language_yuml_Model_0(west.twouse.language.yuml.Model element, String outertab, java.io.PrintWriter out, java.util.Map<String, Integer> printCountingMap){
		String localtab = outertab;
		int count;
		boolean iterate = true;
		java.io.StringWriter sWriter = null;
		java.io.PrintWriter out1 = null;
		java.util.Map<String, Integer> printCountingMap1 = null;
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("elements");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(west.twouse.language.yuml.YumlPackage.MODEL__ELEMENTS));
			java.util.List<?> list = (java.util.List<?>) o;
			int index = list.size() - count;
			if (index >= 0) {
				o = list.get(index);
			} else {
				o = null;
			}
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("elements", count - 1);
		}
		// DEFINITION PART BEGINS (CompoundDefinition)
		iterate = true;
		while (iterate) {
			sWriter = new java.io.StringWriter();
			out1 = new java.io.PrintWriter(sWriter);
			printCountingMap1 = new java.util.LinkedHashMap<String, Integer>(printCountingMap);
			print_west_twouse_language_yuml_Model_0_0(element, localtab, out1, printCountingMap1);
			if (printCountingMap.equals(printCountingMap1)) {
				iterate = false;
				out1.close();
			} else {
				out1.flush();
				out1.close();
				out.print(sWriter.toString());
				printCountingMap.putAll(printCountingMap1);
			}
		}
	}
	public void print_west_twouse_language_yuml_Model_0_0(west.twouse.language.yuml.Model element, String outertab, java.io.PrintWriter out, java.util.Map<String, Integer> printCountingMap){
		String localtab = outertab;
		int count;
		// DEFINITION PART BEGINS (CsString)
		out.print(",");
		// DEFINITION PART BEGINS (LineBreak)
		out.println();
		out.print(localtab);
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("elements");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(west.twouse.language.yuml.YumlPackage.MODEL__ELEMENTS));
			java.util.List<?> list = (java.util.List<?>) o;
			int index = list.size() - count;
			if (index >= 0) {
				o = list.get(index);
			} else {
				o = null;
			}
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("elements", count - 1);
		}
	}
	
	public void print_west_twouse_language_yuml_Class(west.twouse.language.yuml.Class element, String outertab, java.io.PrintWriter out) {
		String localtab = outertab;
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		java.util.Map<String, Integer> printCountingMap = new java.util.LinkedHashMap<String, Integer>(5);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(west.twouse.language.yuml.YumlPackage.CLASS__COLOR));
		printCountingMap.put("color", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(west.twouse.language.yuml.YumlPackage.CLASS__STEREOTYPE));
		printCountingMap.put("stereotype", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(west.twouse.language.yuml.YumlPackage.CLASS__NAME));
		printCountingMap.put("name", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(west.twouse.language.yuml.YumlPackage.CLASS__ATTRIBUTES));
		printCountingMap.put("attributes", temp == null ? 0 : ((java.util.Collection<?>) temp).size());
		temp = element.eGet(element.eClass().getEStructuralFeature(west.twouse.language.yuml.YumlPackage.CLASS__METHODS));
		printCountingMap.put("methods", temp == null ? 0 : ((java.util.Collection<?>) temp).size());
		// print collected hidden tokens
		int count;
		java.io.StringWriter sWriter = null;
		java.io.PrintWriter out1 = null;
		java.util.Map<String, Integer> printCountingMap1 = null;
		// DEFINITION PART BEGINS (CsString)
		out.print("[");
		// DEFINITION PART BEGINS (CompoundDefinition)
		sWriter = new java.io.StringWriter();
		out1 = new java.io.PrintWriter(sWriter);
		printCountingMap1 = new java.util.LinkedHashMap<String, Integer>(printCountingMap);
		print_west_twouse_language_yuml_Class_0(element, localtab, out1, printCountingMap1);
		if (printCountingMap.equals(printCountingMap1)) {
			out1.close();
		} else {
			out1.flush();
			out1.close();
			out.print(sWriter.toString());
			printCountingMap.putAll(printCountingMap1);
		}
		// DEFINITION PART BEGINS (PlaceholderUsingSpecifiedToken)
		count = printCountingMap.get("name");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(west.twouse.language.yuml.YumlPackage.CLASS__NAME));
			if (o != null) {
				west.twouse.language.yuml.resource.yuml.IYumlTokenResolver resolver = tokenResolverFactory.createTokenResolver("TEXT");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(west.twouse.language.yuml.YumlPackage.CLASS__NAME), element));
			}
			printCountingMap.put("name", count - 1);
		}
		// DEFINITION PART BEGINS (CompoundDefinition)
		sWriter = new java.io.StringWriter();
		out1 = new java.io.PrintWriter(sWriter);
		printCountingMap1 = new java.util.LinkedHashMap<String, Integer>(printCountingMap);
		print_west_twouse_language_yuml_Class_1(element, localtab, out1, printCountingMap1);
		if (printCountingMap.equals(printCountingMap1)) {
			out1.close();
		} else {
			out1.flush();
			out1.close();
			out.print(sWriter.toString());
			printCountingMap.putAll(printCountingMap1);
		}
		// DEFINITION PART BEGINS (CompoundDefinition)
		sWriter = new java.io.StringWriter();
		out1 = new java.io.PrintWriter(sWriter);
		printCountingMap1 = new java.util.LinkedHashMap<String, Integer>(printCountingMap);
		print_west_twouse_language_yuml_Class_2(element, localtab, out1, printCountingMap1);
		if (printCountingMap.equals(printCountingMap1)) {
			out1.close();
		} else {
			out1.flush();
			out1.close();
			out.print(sWriter.toString());
			printCountingMap.putAll(printCountingMap1);
		}
		// DEFINITION PART BEGINS (CompoundDefinition)
		sWriter = new java.io.StringWriter();
		out1 = new java.io.PrintWriter(sWriter);
		printCountingMap1 = new java.util.LinkedHashMap<String, Integer>(printCountingMap);
		print_west_twouse_language_yuml_Class_3(element, localtab, out1, printCountingMap1);
		if (printCountingMap.equals(printCountingMap1)) {
			out1.close();
		} else {
			out1.flush();
			out1.close();
			out.print(sWriter.toString());
			printCountingMap.putAll(printCountingMap1);
		}
		// DEFINITION PART BEGINS (CsString)
		out.print("]");
	}
	public void print_west_twouse_language_yuml_Class_0(west.twouse.language.yuml.Class element, String outertab, java.io.PrintWriter out, java.util.Map<String, Integer> printCountingMap){
		int count;
		// DEFINITION PART BEGINS (CsString)
		out.print("<<");
		// DEFINITION PART BEGINS (PlaceholderUsingSpecifiedToken)
		count = printCountingMap.get("stereotype");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(west.twouse.language.yuml.YumlPackage.CLASS__STEREOTYPE));
			if (o != null) {
				west.twouse.language.yuml.resource.yuml.IYumlTokenResolver resolver = tokenResolverFactory.createTokenResolver("ALPHANUM");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(west.twouse.language.yuml.YumlPackage.CLASS__STEREOTYPE), element));
			}
			printCountingMap.put("stereotype", count - 1);
		}
		// DEFINITION PART BEGINS (CsString)
		out.print(">>");
	}
	public void print_west_twouse_language_yuml_Class_1(west.twouse.language.yuml.Class element, String outertab, java.io.PrintWriter out, java.util.Map<String, Integer> printCountingMap){
		String localtab = outertab;
		int count;
		boolean iterate = true;
		java.io.StringWriter sWriter = null;
		java.io.PrintWriter out1 = null;
		java.util.Map<String, Integer> printCountingMap1 = null;
		// DEFINITION PART BEGINS (CsString)
		out.print("|");
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("attributes");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(west.twouse.language.yuml.YumlPackage.CLASS__ATTRIBUTES));
			java.util.List<?> list = (java.util.List<?>) o;
			int index = list.size() - count;
			if (index >= 0) {
				o = list.get(index);
			} else {
				o = null;
			}
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("attributes", count - 1);
		}
		// DEFINITION PART BEGINS (CompoundDefinition)
		iterate = true;
		while (iterate) {
			sWriter = new java.io.StringWriter();
			out1 = new java.io.PrintWriter(sWriter);
			printCountingMap1 = new java.util.LinkedHashMap<String, Integer>(printCountingMap);
			print_west_twouse_language_yuml_Class_1_0(element, localtab, out1, printCountingMap1);
			if (printCountingMap.equals(printCountingMap1)) {
				iterate = false;
				out1.close();
			} else {
				out1.flush();
				out1.close();
				out.print(sWriter.toString());
				printCountingMap.putAll(printCountingMap1);
			}
		}
	}
	public void print_west_twouse_language_yuml_Class_1_0(west.twouse.language.yuml.Class element, String outertab, java.io.PrintWriter out, java.util.Map<String, Integer> printCountingMap){
		String localtab = outertab;
		int count;
		// DEFINITION PART BEGINS (CsString)
		out.print(";");
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("attributes");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(west.twouse.language.yuml.YumlPackage.CLASS__ATTRIBUTES));
			java.util.List<?> list = (java.util.List<?>) o;
			int index = list.size() - count;
			if (index >= 0) {
				o = list.get(index);
			} else {
				o = null;
			}
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("attributes", count - 1);
		}
	}
	public void print_west_twouse_language_yuml_Class_2(west.twouse.language.yuml.Class element, String outertab, java.io.PrintWriter out, java.util.Map<String, Integer> printCountingMap){
		String localtab = outertab;
		int count;
		boolean iterate = true;
		java.io.StringWriter sWriter = null;
		java.io.PrintWriter out1 = null;
		java.util.Map<String, Integer> printCountingMap1 = null;
		// DEFINITION PART BEGINS (CsString)
		out.print("|");
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("methods");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(west.twouse.language.yuml.YumlPackage.CLASS__METHODS));
			java.util.List<?> list = (java.util.List<?>) o;
			int index = list.size() - count;
			if (index >= 0) {
				o = list.get(index);
			} else {
				o = null;
			}
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("methods", count - 1);
		}
		// DEFINITION PART BEGINS (CompoundDefinition)
		iterate = true;
		while (iterate) {
			sWriter = new java.io.StringWriter();
			out1 = new java.io.PrintWriter(sWriter);
			printCountingMap1 = new java.util.LinkedHashMap<String, Integer>(printCountingMap);
			print_west_twouse_language_yuml_Class_2_0(element, localtab, out1, printCountingMap1);
			if (printCountingMap.equals(printCountingMap1)) {
				iterate = false;
				out1.close();
			} else {
				out1.flush();
				out1.close();
				out.print(sWriter.toString());
				printCountingMap.putAll(printCountingMap1);
			}
		}
	}
	public void print_west_twouse_language_yuml_Class_2_0(west.twouse.language.yuml.Class element, String outertab, java.io.PrintWriter out, java.util.Map<String, Integer> printCountingMap){
		String localtab = outertab;
		int count;
		// DEFINITION PART BEGINS (CsString)
		out.print(";");
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("methods");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(west.twouse.language.yuml.YumlPackage.CLASS__METHODS));
			java.util.List<?> list = (java.util.List<?>) o;
			int index = list.size() - count;
			if (index >= 0) {
				o = list.get(index);
			} else {
				o = null;
			}
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("methods", count - 1);
		}
	}
	public void print_west_twouse_language_yuml_Class_3(west.twouse.language.yuml.Class element, String outertab, java.io.PrintWriter out, java.util.Map<String, Integer> printCountingMap){
		int count;
		// DEFINITION PART BEGINS (CsString)
		out.print("{bg:");
		// DEFINITION PART BEGINS (PlaceholderUsingSpecifiedToken)
		count = printCountingMap.get("color");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(west.twouse.language.yuml.YumlPackage.CLASS__COLOR));
			if (o != null) {
				west.twouse.language.yuml.resource.yuml.IYumlTokenResolver resolver = tokenResolverFactory.createTokenResolver("TEXT");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(west.twouse.language.yuml.YumlPackage.CLASS__COLOR), element));
			}
			printCountingMap.put("color", count - 1);
		}
		// DEFINITION PART BEGINS (CsString)
		out.print("}");
	}
	
	public void print_west_twouse_language_yuml_Association(west.twouse.language.yuml.Association element, String outertab, java.io.PrintWriter out) {
		String localtab = outertab;
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		java.util.Map<String, Integer> printCountingMap = new java.util.LinkedHashMap<String, Integer>(11);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(west.twouse.language.yuml.YumlPackage.ASSOCIATION__SOURCE));
		printCountingMap.put("source", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(west.twouse.language.yuml.YumlPackage.ASSOCIATION__TARGET));
		printCountingMap.put("target", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(west.twouse.language.yuml.YumlPackage.ASSOCIATION__SOURCE_LABEL));
		printCountingMap.put("sourceLabel", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(west.twouse.language.yuml.YumlPackage.ASSOCIATION__TARGET_LABEL));
		printCountingMap.put("targetLabel", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(west.twouse.language.yuml.YumlPackage.ASSOCIATION__TYPE));
		printCountingMap.put("type", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(west.twouse.language.yuml.YumlPackage.ASSOCIATION__NAVIGABLE_SOURCE));
		printCountingMap.put("navigableSource", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(west.twouse.language.yuml.YumlPackage.ASSOCIATION__SOURCE_CARDINALITY));
		printCountingMap.put("sourceCardinality", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(west.twouse.language.yuml.YumlPackage.ASSOCIATION__SOURCE_VISIBILITY));
		printCountingMap.put("sourceVisibility", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(west.twouse.language.yuml.YumlPackage.ASSOCIATION__NAVIGABLE_TARGET));
		printCountingMap.put("navigableTarget", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(west.twouse.language.yuml.YumlPackage.ASSOCIATION__TARGET_CARDINALITY));
		printCountingMap.put("targetCardinality", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(west.twouse.language.yuml.YumlPackage.ASSOCIATION__TARGET_VISIBILITY));
		printCountingMap.put("targetVisibility", temp == null ? 0 : 1);
		// print collected hidden tokens
		int count;
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("source");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(west.twouse.language.yuml.YumlPackage.ASSOCIATION__SOURCE));
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("source", count - 1);
		}
		// DEFINITION PART BEGINS (BooleanTerminal)
		count = printCountingMap.get("navigableSource");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(west.twouse.language.yuml.YumlPackage.ASSOCIATION__NAVIGABLE_SOURCE));
			if (o != null) {
			}
			printCountingMap.put("navigableSource", count - 1);
		}
		// DEFINITION PART BEGINS (PlaceholderUsingSpecifiedToken)
		count = printCountingMap.get("sourceLabel");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(west.twouse.language.yuml.YumlPackage.ASSOCIATION__SOURCE_LABEL));
			if (o != null) {
				west.twouse.language.yuml.resource.yuml.IYumlTokenResolver resolver = tokenResolverFactory.createTokenResolver("TEXT");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(west.twouse.language.yuml.YumlPackage.ASSOCIATION__SOURCE_LABEL), element));
			}
			printCountingMap.put("sourceLabel", count - 1);
		}
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("sourceCardinality");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(west.twouse.language.yuml.YumlPackage.ASSOCIATION__SOURCE_CARDINALITY));
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("sourceCardinality", count - 1);
		}
		// DEFINITION PART BEGINS (CsString)
		out.print("-");
		// DEFINITION PART BEGINS (PlaceholderUsingSpecifiedToken)
		count = printCountingMap.get("targetLabel");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(west.twouse.language.yuml.YumlPackage.ASSOCIATION__TARGET_LABEL));
			if (o != null) {
				west.twouse.language.yuml.resource.yuml.IYumlTokenResolver resolver = tokenResolverFactory.createTokenResolver("TEXT");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(west.twouse.language.yuml.YumlPackage.ASSOCIATION__TARGET_LABEL), element));
			}
			printCountingMap.put("targetLabel", count - 1);
		}
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("targetCardinality");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(west.twouse.language.yuml.YumlPackage.ASSOCIATION__TARGET_CARDINALITY));
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("targetCardinality", count - 1);
		}
		// DEFINITION PART BEGINS (BooleanTerminal)
		count = printCountingMap.get("navigableTarget");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(west.twouse.language.yuml.YumlPackage.ASSOCIATION__NAVIGABLE_TARGET));
			if (o != null) {
			}
			printCountingMap.put("navigableTarget", count - 1);
		}
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("target");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(west.twouse.language.yuml.YumlPackage.ASSOCIATION__TARGET));
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("target", count - 1);
		}
	}
	
	public void print_west_twouse_language_yuml_Inheritance(west.twouse.language.yuml.Inheritance element, String outertab, java.io.PrintWriter out) {
		String localtab = outertab;
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		java.util.Map<String, Integer> printCountingMap = new java.util.LinkedHashMap<String, Integer>(4);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(west.twouse.language.yuml.YumlPackage.INHERITANCE__SOURCE));
		printCountingMap.put("source", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(west.twouse.language.yuml.YumlPackage.INHERITANCE__TARGET));
		printCountingMap.put("target", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(west.twouse.language.yuml.YumlPackage.INHERITANCE__SOURCE_LABEL));
		printCountingMap.put("sourceLabel", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(west.twouse.language.yuml.YumlPackage.INHERITANCE__TARGET_LABEL));
		printCountingMap.put("targetLabel", temp == null ? 0 : 1);
		// print collected hidden tokens
		int alt = -1;
		alt=0;
		int matches=		matchCount(printCountingMap, java.util.Arrays.asList(		"source"		,
		"target"		));
		int tempMatchCount;
		tempMatchCount=		matchCount(printCountingMap, java.util.Arrays.asList(		"source"		,
		"target"		));
		if (tempMatchCount > matches) {
			alt = 1;
			matches = tempMatchCount;
		}
		tempMatchCount=		matchCount(printCountingMap, java.util.Arrays.asList(		"target"		,
		"source"		));
		if (tempMatchCount > matches) {
			alt = 2;
			matches = tempMatchCount;
		}
		switch(alt) {
			case 1:			{
				// DEFINITION PART BEGINS (CompoundDefinition)
				print_west_twouse_language_yuml_Inheritance_1(element, localtab, out, printCountingMap);
			}
			break;
			case 2:			{
				// DEFINITION PART BEGINS (CompoundDefinition)
				print_west_twouse_language_yuml_Inheritance_2(element, localtab, out, printCountingMap);
			}
			break;
			default:			// DEFINITION PART BEGINS (CompoundDefinition)
			print_west_twouse_language_yuml_Inheritance_0(element, localtab, out, printCountingMap);
		}
	}
	public void print_west_twouse_language_yuml_Inheritance_0(west.twouse.language.yuml.Inheritance element, String outertab, java.io.PrintWriter out, java.util.Map<String, Integer> printCountingMap){
		String localtab = outertab;
		int count;
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("source");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(west.twouse.language.yuml.YumlPackage.INHERITANCE__SOURCE));
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("source", count - 1);
		}
		// DEFINITION PART BEGINS (CsString)
		out.print("^");
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("target");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(west.twouse.language.yuml.YumlPackage.INHERITANCE__TARGET));
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("target", count - 1);
		}
	}
	public void print_west_twouse_language_yuml_Inheritance_1(west.twouse.language.yuml.Inheritance element, String outertab, java.io.PrintWriter out, java.util.Map<String, Integer> printCountingMap){
		String localtab = outertab;
		int count;
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("source");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(west.twouse.language.yuml.YumlPackage.INHERITANCE__SOURCE));
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("source", count - 1);
		}
		// DEFINITION PART BEGINS (CsString)
		out.print("-");
		// DEFINITION PART BEGINS (PlaceholderUsingSpecifiedToken)
		count = printCountingMap.get("targetLabel");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(west.twouse.language.yuml.YumlPackage.INHERITANCE__TARGET_LABEL));
			if (o != null) {
				west.twouse.language.yuml.resource.yuml.IYumlTokenResolver resolver = tokenResolverFactory.createTokenResolver("TEXT");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(west.twouse.language.yuml.YumlPackage.INHERITANCE__TARGET_LABEL), element));
			}
			printCountingMap.put("targetLabel", count - 1);
		}
		// DEFINITION PART BEGINS (CsString)
		out.print("^");
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("target");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(west.twouse.language.yuml.YumlPackage.INHERITANCE__TARGET));
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("target", count - 1);
		}
	}
	public void print_west_twouse_language_yuml_Inheritance_2(west.twouse.language.yuml.Inheritance element, String outertab, java.io.PrintWriter out, java.util.Map<String, Integer> printCountingMap){
		String localtab = outertab;
		int count;
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("target");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(west.twouse.language.yuml.YumlPackage.INHERITANCE__TARGET));
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("target", count - 1);
		}
		// DEFINITION PART BEGINS (CsString)
		out.print("^");
		// DEFINITION PART BEGINS (PlaceholderUsingSpecifiedToken)
		count = printCountingMap.get("targetLabel");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(west.twouse.language.yuml.YumlPackage.INHERITANCE__TARGET_LABEL));
			if (o != null) {
				west.twouse.language.yuml.resource.yuml.IYumlTokenResolver resolver = tokenResolverFactory.createTokenResolver("TEXT");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(west.twouse.language.yuml.YumlPackage.INHERITANCE__TARGET_LABEL), element));
			}
			printCountingMap.put("targetLabel", count - 1);
		}
		// DEFINITION PART BEGINS (CsString)
		out.print("-");
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("source");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(west.twouse.language.yuml.YumlPackage.INHERITANCE__SOURCE));
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("source", count - 1);
		}
	}
	
	public void print_west_twouse_language_yuml_Cardinality(west.twouse.language.yuml.Cardinality element, String outertab, java.io.PrintWriter out) {
		String localtab = outertab;
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		java.util.Map<String, Integer> printCountingMap = new java.util.LinkedHashMap<String, Integer>(2);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(west.twouse.language.yuml.YumlPackage.CARDINALITY__LOWER_BOUND));
		printCountingMap.put("lowerBound", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(west.twouse.language.yuml.YumlPackage.CARDINALITY__UPPER_BOUND));
		printCountingMap.put("upperBound", temp == null ? 0 : 1);
		// print collected hidden tokens
		int count;
		java.io.StringWriter sWriter = null;
		java.io.PrintWriter out1 = null;
		java.util.Map<String, Integer> printCountingMap1 = null;
		// DEFINITION PART BEGINS (PlaceholderUsingSpecifiedToken)
		count = printCountingMap.get("lowerBound");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(west.twouse.language.yuml.YumlPackage.CARDINALITY__LOWER_BOUND));
			if (o != null) {
				west.twouse.language.yuml.resource.yuml.IYumlTokenResolver resolver = tokenResolverFactory.createTokenResolver("CARDINALITY");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(west.twouse.language.yuml.YumlPackage.CARDINALITY__LOWER_BOUND), element));
			}
			printCountingMap.put("lowerBound", count - 1);
		}
		// DEFINITION PART BEGINS (CompoundDefinition)
		sWriter = new java.io.StringWriter();
		out1 = new java.io.PrintWriter(sWriter);
		printCountingMap1 = new java.util.LinkedHashMap<String, Integer>(printCountingMap);
		print_west_twouse_language_yuml_Cardinality_0(element, localtab, out1, printCountingMap1);
		if (printCountingMap.equals(printCountingMap1)) {
			out1.close();
		} else {
			out1.flush();
			out1.close();
			out.print(sWriter.toString());
			printCountingMap.putAll(printCountingMap1);
		}
	}
	public void print_west_twouse_language_yuml_Cardinality_0(west.twouse.language.yuml.Cardinality element, String outertab, java.io.PrintWriter out, java.util.Map<String, Integer> printCountingMap){
		int count;
		// DEFINITION PART BEGINS (CsString)
		out.print("..");
		// DEFINITION PART BEGINS (PlaceholderUsingSpecifiedToken)
		count = printCountingMap.get("upperBound");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(west.twouse.language.yuml.YumlPackage.CARDINALITY__UPPER_BOUND));
			if (o != null) {
				west.twouse.language.yuml.resource.yuml.IYumlTokenResolver resolver = tokenResolverFactory.createTokenResolver("CARDINALITY");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(west.twouse.language.yuml.YumlPackage.CARDINALITY__UPPER_BOUND), element));
			}
			printCountingMap.put("upperBound", count - 1);
		}
	}
	
	public void print_west_twouse_language_yuml_Attribute(west.twouse.language.yuml.Attribute element, String outertab, java.io.PrintWriter out) {
		String localtab = outertab;
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		java.util.Map<String, Integer> printCountingMap = new java.util.LinkedHashMap<String, Integer>(4);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(west.twouse.language.yuml.YumlPackage.ATTRIBUTE__VISIBILITY));
		printCountingMap.put("visibility", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(west.twouse.language.yuml.YumlPackage.ATTRIBUTE__NAME));
		printCountingMap.put("name", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(west.twouse.language.yuml.YumlPackage.ATTRIBUTE__STEREOTYPE));
		printCountingMap.put("stereotype", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(west.twouse.language.yuml.YumlPackage.ATTRIBUTE__TYPE));
		printCountingMap.put("type", temp == null ? 0 : 1);
		// print collected hidden tokens
		int count;
		java.io.StringWriter sWriter = null;
		java.io.PrintWriter out1 = null;
		java.util.Map<String, Integer> printCountingMap1 = null;
		// DEFINITION PART BEGINS (PlaceholderUsingSpecifiedToken)
		count = printCountingMap.get("visibility");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(west.twouse.language.yuml.YumlPackage.ATTRIBUTE__VISIBILITY));
			if (o != null) {
				west.twouse.language.yuml.resource.yuml.IYumlTokenResolver resolver = tokenResolverFactory.createTokenResolver("VISIBILITY");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(west.twouse.language.yuml.YumlPackage.ATTRIBUTE__VISIBILITY), element));
			}
			printCountingMap.put("visibility", count - 1);
		}
		// DEFINITION PART BEGINS (CompoundDefinition)
		sWriter = new java.io.StringWriter();
		out1 = new java.io.PrintWriter(sWriter);
		printCountingMap1 = new java.util.LinkedHashMap<String, Integer>(printCountingMap);
		print_west_twouse_language_yuml_Attribute_0(element, localtab, out1, printCountingMap1);
		if (printCountingMap.equals(printCountingMap1)) {
			out1.close();
		} else {
			out1.flush();
			out1.close();
			out.print(sWriter.toString());
			printCountingMap.putAll(printCountingMap1);
		}
		// DEFINITION PART BEGINS (PlaceholderUsingSpecifiedToken)
		count = printCountingMap.get("name");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(west.twouse.language.yuml.YumlPackage.ATTRIBUTE__NAME));
			if (o != null) {
				west.twouse.language.yuml.resource.yuml.IYumlTokenResolver resolver = tokenResolverFactory.createTokenResolver("TEXT");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(west.twouse.language.yuml.YumlPackage.ATTRIBUTE__NAME), element));
			}
			printCountingMap.put("name", count - 1);
		}
		// DEFINITION PART BEGINS (CompoundDefinition)
		sWriter = new java.io.StringWriter();
		out1 = new java.io.PrintWriter(sWriter);
		printCountingMap1 = new java.util.LinkedHashMap<String, Integer>(printCountingMap);
		print_west_twouse_language_yuml_Attribute_1(element, localtab, out1, printCountingMap1);
		if (printCountingMap.equals(printCountingMap1)) {
			out1.close();
		} else {
			out1.flush();
			out1.close();
			out.print(sWriter.toString());
			printCountingMap.putAll(printCountingMap1);
		}
	}
	public void print_west_twouse_language_yuml_Attribute_0(west.twouse.language.yuml.Attribute element, String outertab, java.io.PrintWriter out, java.util.Map<String, Integer> printCountingMap){
		int count;
		// DEFINITION PART BEGINS (CsString)
		out.print("<<");
		// DEFINITION PART BEGINS (PlaceholderUsingSpecifiedToken)
		count = printCountingMap.get("stereotype");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(west.twouse.language.yuml.YumlPackage.ATTRIBUTE__STEREOTYPE));
			if (o != null) {
				west.twouse.language.yuml.resource.yuml.IYumlTokenResolver resolver = tokenResolverFactory.createTokenResolver("ALPHANUM");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(west.twouse.language.yuml.YumlPackage.ATTRIBUTE__STEREOTYPE), element));
			}
			printCountingMap.put("stereotype", count - 1);
		}
		// DEFINITION PART BEGINS (CsString)
		out.print(">>");
	}
	public void print_west_twouse_language_yuml_Attribute_1(west.twouse.language.yuml.Attribute element, String outertab, java.io.PrintWriter out, java.util.Map<String, Integer> printCountingMap){
		int count;
		// DEFINITION PART BEGINS (CsString)
		out.print(" : ");
		// DEFINITION PART BEGINS (PlaceholderUsingSpecifiedToken)
		count = printCountingMap.get("type");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(west.twouse.language.yuml.YumlPackage.ATTRIBUTE__TYPE));
			if (o != null) {
				west.twouse.language.yuml.resource.yuml.IYumlTokenResolver resolver = tokenResolverFactory.createTokenResolver("TEXT");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(west.twouse.language.yuml.YumlPackage.ATTRIBUTE__TYPE), element));
			}
			printCountingMap.put("type", count - 1);
		}
	}
	
	public void print_west_twouse_language_yuml_Method(west.twouse.language.yuml.Method element, String outertab, java.io.PrintWriter out) {
		String localtab = outertab;
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		java.util.Map<String, Integer> printCountingMap = new java.util.LinkedHashMap<String, Integer>(3);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(west.twouse.language.yuml.YumlPackage.METHOD__VISIBILITY));
		printCountingMap.put("visibility", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(west.twouse.language.yuml.YumlPackage.METHOD__NAME));
		printCountingMap.put("name", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(west.twouse.language.yuml.YumlPackage.METHOD__ARGUMENTS));
		printCountingMap.put("arguments", temp == null ? 0 : ((java.util.Collection<?>) temp).size());
		// print collected hidden tokens
		int count;
		java.io.StringWriter sWriter = null;
		java.io.PrintWriter out1 = null;
		java.util.Map<String, Integer> printCountingMap1 = null;
		// DEFINITION PART BEGINS (PlaceholderUsingSpecifiedToken)
		count = printCountingMap.get("name");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(west.twouse.language.yuml.YumlPackage.METHOD__NAME));
			if (o != null) {
				west.twouse.language.yuml.resource.yuml.IYumlTokenResolver resolver = tokenResolverFactory.createTokenResolver("TEXT");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(west.twouse.language.yuml.YumlPackage.METHOD__NAME), element));
			}
			printCountingMap.put("name", count - 1);
		}
		// DEFINITION PART BEGINS (CsString)
		out.print("(");
		// DEFINITION PART BEGINS (CompoundDefinition)
		sWriter = new java.io.StringWriter();
		out1 = new java.io.PrintWriter(sWriter);
		printCountingMap1 = new java.util.LinkedHashMap<String, Integer>(printCountingMap);
		print_west_twouse_language_yuml_Method_0(element, localtab, out1, printCountingMap1);
		if (printCountingMap.equals(printCountingMap1)) {
			out1.close();
		} else {
			out1.flush();
			out1.close();
			out.print(sWriter.toString());
			printCountingMap.putAll(printCountingMap1);
		}
		// DEFINITION PART BEGINS (CsString)
		out.print(")");
	}
	public void print_west_twouse_language_yuml_Method_0(west.twouse.language.yuml.Method element, String outertab, java.io.PrintWriter out, java.util.Map<String, Integer> printCountingMap){
		String localtab = outertab;
		int count;
		boolean iterate = true;
		java.io.StringWriter sWriter = null;
		java.io.PrintWriter out1 = null;
		java.util.Map<String, Integer> printCountingMap1 = null;
		// DEFINITION PART BEGINS (PlaceholderUsingSpecifiedToken)
		count = printCountingMap.get("arguments");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(west.twouse.language.yuml.YumlPackage.METHOD__ARGUMENTS));
			java.util.List<?> list = (java.util.List<?>) o;
			int index = list.size() - count;
			if (index >= 0) {
				o = list.get(index);
			} else {
				o = null;
			}
			if (o != null) {
				west.twouse.language.yuml.resource.yuml.IYumlTokenResolver resolver = tokenResolverFactory.createTokenResolver("TEXT");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(west.twouse.language.yuml.YumlPackage.METHOD__ARGUMENTS), element));
			}
			printCountingMap.put("arguments", count - 1);
		}
		// DEFINITION PART BEGINS (CompoundDefinition)
		iterate = true;
		while (iterate) {
			sWriter = new java.io.StringWriter();
			out1 = new java.io.PrintWriter(sWriter);
			printCountingMap1 = new java.util.LinkedHashMap<String, Integer>(printCountingMap);
			print_west_twouse_language_yuml_Method_0_0(element, localtab, out1, printCountingMap1);
			if (printCountingMap.equals(printCountingMap1)) {
				iterate = false;
				out1.close();
			} else {
				out1.flush();
				out1.close();
				out.print(sWriter.toString());
				printCountingMap.putAll(printCountingMap1);
			}
		}
	}
	public void print_west_twouse_language_yuml_Method_0_0(west.twouse.language.yuml.Method element, String outertab, java.io.PrintWriter out, java.util.Map<String, Integer> printCountingMap){
		int count;
		// DEFINITION PART BEGINS (CsString)
		out.print(",");
		// DEFINITION PART BEGINS (PlaceholderUsingSpecifiedToken)
		count = printCountingMap.get("arguments");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(west.twouse.language.yuml.YumlPackage.METHOD__ARGUMENTS));
			java.util.List<?> list = (java.util.List<?>) o;
			int index = list.size() - count;
			if (index >= 0) {
				o = list.get(index);
			} else {
				o = null;
			}
			if (o != null) {
				west.twouse.language.yuml.resource.yuml.IYumlTokenResolver resolver = tokenResolverFactory.createTokenResolver("TEXT");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(west.twouse.language.yuml.YumlPackage.METHOD__ARGUMENTS), element));
			}
			printCountingMap.put("arguments", count - 1);
		}
	}
	
	public void print_west_twouse_language_yuml_Note(west.twouse.language.yuml.Note element, String outertab, java.io.PrintWriter out) {
		String localtab = outertab;
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		java.util.Map<String, Integer> printCountingMap = new java.util.LinkedHashMap<String, Integer>(2);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(west.twouse.language.yuml.YumlPackage.NOTE__COLOR));
		printCountingMap.put("color", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(west.twouse.language.yuml.YumlPackage.NOTE__TEXT));
		printCountingMap.put("text", temp == null ? 0 : 1);
		// print collected hidden tokens
		int count;
		java.io.StringWriter sWriter = null;
		java.io.PrintWriter out1 = null;
		java.util.Map<String, Integer> printCountingMap1 = null;
		// DEFINITION PART BEGINS (CsString)
		out.print("[note: ");
		// DEFINITION PART BEGINS (PlaceholderUsingSpecifiedToken)
		count = printCountingMap.get("text");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(west.twouse.language.yuml.YumlPackage.NOTE__TEXT));
			if (o != null) {
				west.twouse.language.yuml.resource.yuml.IYumlTokenResolver resolver = tokenResolverFactory.createTokenResolver("TEXT");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(west.twouse.language.yuml.YumlPackage.NOTE__TEXT), element));
			}
			printCountingMap.put("text", count - 1);
		}
		// DEFINITION PART BEGINS (CompoundDefinition)
		sWriter = new java.io.StringWriter();
		out1 = new java.io.PrintWriter(sWriter);
		printCountingMap1 = new java.util.LinkedHashMap<String, Integer>(printCountingMap);
		print_west_twouse_language_yuml_Note_0(element, localtab, out1, printCountingMap1);
		if (printCountingMap.equals(printCountingMap1)) {
			out1.close();
		} else {
			out1.flush();
			out1.close();
			out.print(sWriter.toString());
			printCountingMap.putAll(printCountingMap1);
		}
		// DEFINITION PART BEGINS (CsString)
		out.print("]");
	}
	public void print_west_twouse_language_yuml_Note_0(west.twouse.language.yuml.Note element, String outertab, java.io.PrintWriter out, java.util.Map<String, Integer> printCountingMap){
		int count;
		// DEFINITION PART BEGINS (CsString)
		out.print("{bg:");
		// DEFINITION PART BEGINS (PlaceholderUsingSpecifiedToken)
		count = printCountingMap.get("color");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(west.twouse.language.yuml.YumlPackage.NOTE__COLOR));
			if (o != null) {
				west.twouse.language.yuml.resource.yuml.IYumlTokenResolver resolver = tokenResolverFactory.createTokenResolver("TEXT");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(west.twouse.language.yuml.YumlPackage.NOTE__COLOR), element));
			}
			printCountingMap.put("color", count - 1);
		}
		// DEFINITION PART BEGINS (CsString)
		out.print("}");
	}
	
	public void print_west_twouse_language_yuml_Equivalence(west.twouse.language.yuml.Equivalence element, String outertab, java.io.PrintWriter out) {
		String localtab = outertab;
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		java.util.Map<String, Integer> printCountingMap = new java.util.LinkedHashMap<String, Integer>(4);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(west.twouse.language.yuml.YumlPackage.EQUIVALENCE__SOURCE));
		printCountingMap.put("source", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(west.twouse.language.yuml.YumlPackage.EQUIVALENCE__TARGET));
		printCountingMap.put("target", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(west.twouse.language.yuml.YumlPackage.EQUIVALENCE__SOURCE_LABEL));
		printCountingMap.put("sourceLabel", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(west.twouse.language.yuml.YumlPackage.EQUIVALENCE__TARGET_LABEL));
		printCountingMap.put("targetLabel", temp == null ? 0 : 1);
		// print collected hidden tokens
		int count;
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("source");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(west.twouse.language.yuml.YumlPackage.EQUIVALENCE__SOURCE));
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("source", count - 1);
		}
		// DEFINITION PART BEGINS (CsString)
		out.print("^");
		// DEFINITION PART BEGINS (PlaceholderUsingSpecifiedToken)
		count = printCountingMap.get("sourceLabel");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(west.twouse.language.yuml.YumlPackage.EQUIVALENCE__SOURCE_LABEL));
			if (o != null) {
				west.twouse.language.yuml.resource.yuml.IYumlTokenResolver resolver = tokenResolverFactory.createTokenResolver("TEXT");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(west.twouse.language.yuml.YumlPackage.EQUIVALENCE__SOURCE_LABEL), element));
			}
			printCountingMap.put("sourceLabel", count - 1);
		}
		// DEFINITION PART BEGINS (CsString)
		out.print("-");
		// DEFINITION PART BEGINS (PlaceholderUsingSpecifiedToken)
		count = printCountingMap.get("targetLabel");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(west.twouse.language.yuml.YumlPackage.EQUIVALENCE__TARGET_LABEL));
			if (o != null) {
				west.twouse.language.yuml.resource.yuml.IYumlTokenResolver resolver = tokenResolverFactory.createTokenResolver("TEXT");
				resolver.setOptions(getOptions());
				out.print(resolver.deResolve((Object) o, element.eClass().getEStructuralFeature(west.twouse.language.yuml.YumlPackage.EQUIVALENCE__TARGET_LABEL), element));
			}
			printCountingMap.put("targetLabel", count - 1);
		}
		// DEFINITION PART BEGINS (CsString)
		out.print("^");
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("target");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(west.twouse.language.yuml.YumlPackage.EQUIVALENCE__TARGET));
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("target", count - 1);
		}
	}
	
}
