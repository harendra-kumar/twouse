/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package west.twouse.language.yuml.resource.yuml.mopp;

public class YumlPrinter2 implements west.twouse.language.yuml.resource.yuml.IYumlTextPrinter {
	
	private class PrintToken {
		
		private String text;
		private String tokenName;
		
		public PrintToken(String text, String tokenName) {
			this.text = text;
			this.tokenName = tokenName;
		}
		
		public String getText() {
			return text;
		}
		
		public String getTokenName() {
			return tokenName;
		}
		
	}
	
	public final static String NEW_LINE = java.lang.System.getProperties().getProperty("line.separator");
	
	/**
	 * Holds the resource that is associated with this printer. May be null if the
	 * printer is used stand alone.
	 */
	private west.twouse.language.yuml.resource.yuml.IYumlTextResource resource;
	
	private java.util.Map<?, ?> options;
	private java.io.OutputStream outputStream;
	private java.util.List<PrintToken> tokenOutputStream;
	private west.twouse.language.yuml.resource.yuml.IYumlTokenResolverFactory tokenResolverFactory = new west.twouse.language.yuml.resource.yuml.mopp.YumlTokenResolverFactory();
	private boolean handleTokenSpaceAutomatically = false;
	private int tokenSpace = 0;
	/**
	 * A flag that indicates whether token have already been printed for the some
	 * object. The flag is set to false whenever printing of an EObject tree is
	 * started. The status of the flag is used to avoid printing default token space
	 * in front of the root object.
	 */
	private boolean startedPrintingObject = false;
	/**
	 * The number of tab characters that were printed before the current line. This
	 * number is used to calculate the relative indentation when printing contained
	 * objects, because all contained objects must start with this indentation
	 * (tabsBeforeCurrentObject + currentTabs).
	 */
	private int currentTabs;
	/**
	 * The number of tab characters that must be printed before the current object.
	 * This number is used to calculate the indentation of new lines, when line breaks
	 * are printed within one object.
	 */
	private int tabsBeforeCurrentObject;
	private int newTabsBeforeCurrentObject;
	
	public YumlPrinter2(java.io.OutputStream outputStream, west.twouse.language.yuml.resource.yuml.IYumlTextResource resource) {
		super();
		this.outputStream = outputStream;
		this.resource = resource;
	}
	
	public void print(org.eclipse.emf.ecore.EObject element) throws java.io.IOException {
		tokenOutputStream = new java.util.ArrayList<PrintToken>();
		currentTabs = 0;
		tabsBeforeCurrentObject = 0;
		startedPrintingObject = true;
		doPrint(element, new java.util.ArrayList<west.twouse.language.yuml.resource.yuml.grammar.YumlFormattingElement>());
		java.io.OutputStreamWriter writer = new java.io.OutputStreamWriter(new java.io.BufferedOutputStream(outputStream), "UTF-8");
		if (handleTokenSpaceAutomatically) {
			printSmart(writer);
		} else {
			printBasic(writer);
		}
		writer.flush();
	}
	
	protected void doPrint(org.eclipse.emf.ecore.EObject element, java.util.List<west.twouse.language.yuml.resource.yuml.grammar.YumlFormattingElement> foundFormattingElements) {
		if (element == null) {
			throw new java.lang.IllegalArgumentException("Nothing to write.");
		}
		if (outputStream == null) {
			throw new java.lang.IllegalArgumentException("Nothing to write on.");
		}
		
		if (element instanceof west.twouse.language.yuml.Model) {
			printInternal(element, west.twouse.language.yuml.resource.yuml.grammar.YumlGrammarInformationProvider.YUML_0, foundFormattingElements);
			return;
		}
		if (element instanceof west.twouse.language.yuml.Class) {
			printInternal(element, west.twouse.language.yuml.resource.yuml.grammar.YumlGrammarInformationProvider.YUML_1, foundFormattingElements);
			return;
		}
		if (element instanceof west.twouse.language.yuml.Association) {
			printInternal(element, west.twouse.language.yuml.resource.yuml.grammar.YumlGrammarInformationProvider.YUML_2, foundFormattingElements);
			return;
		}
		if (element instanceof west.twouse.language.yuml.Inheritance) {
			printInternal(element, west.twouse.language.yuml.resource.yuml.grammar.YumlGrammarInformationProvider.YUML_3, foundFormattingElements);
			return;
		}
		if (element instanceof west.twouse.language.yuml.Cardinality) {
			printInternal(element, west.twouse.language.yuml.resource.yuml.grammar.YumlGrammarInformationProvider.YUML_4, foundFormattingElements);
			return;
		}
		if (element instanceof west.twouse.language.yuml.Attribute) {
			printInternal(element, west.twouse.language.yuml.resource.yuml.grammar.YumlGrammarInformationProvider.YUML_5, foundFormattingElements);
			return;
		}
		if (element instanceof west.twouse.language.yuml.Method) {
			printInternal(element, west.twouse.language.yuml.resource.yuml.grammar.YumlGrammarInformationProvider.YUML_6, foundFormattingElements);
			return;
		}
		if (element instanceof west.twouse.language.yuml.Note) {
			printInternal(element, west.twouse.language.yuml.resource.yuml.grammar.YumlGrammarInformationProvider.YUML_7, foundFormattingElements);
			return;
		}
		if (element instanceof west.twouse.language.yuml.Equivalence) {
			printInternal(element, west.twouse.language.yuml.resource.yuml.grammar.YumlGrammarInformationProvider.YUML_8, foundFormattingElements);
			return;
		}
		
		addWarningToResource("The printer can not handle " + element.eClass().getName() + " elements", element);
	}
	
	public void printInternal(org.eclipse.emf.ecore.EObject eObject, west.twouse.language.yuml.resource.yuml.grammar.YumlSyntaxElement ruleElement, java.util.List<west.twouse.language.yuml.resource.yuml.grammar.YumlFormattingElement> foundFormattingElements) {
		west.twouse.language.yuml.resource.yuml.mopp.YumlLayoutInformationAdapter layoutInformationAdapter = getLayoutInformationAdapter(eObject);
		java.util.List<west.twouse.language.yuml.resource.yuml.mopp.YumlLayoutInformation> originalLayoutInformations = layoutInformationAdapter.getLayoutInformations();
		// create a copy of the original list of layout information object in order to be
		// able to remove used informations during printing
		java.util.List<west.twouse.language.yuml.resource.yuml.mopp.YumlLayoutInformation> layoutInformations = new java.util.ArrayList<west.twouse.language.yuml.resource.yuml.mopp.YumlLayoutInformation>(originalLayoutInformations.size());
		layoutInformations.addAll(originalLayoutInformations);
		west.twouse.language.yuml.resource.yuml.mopp.YumlSyntaxElementDecorator decoratorTree = getDecoratorTree(ruleElement);
		decorateTree(decoratorTree, eObject);
		printTree(decoratorTree, eObject, foundFormattingElements, layoutInformations);
	}
	
	/**
	 * creates a tree of decorator objects which reflects the syntax tree that is
	 * attached to the given syntax element
	 */
	public west.twouse.language.yuml.resource.yuml.mopp.YumlSyntaxElementDecorator getDecoratorTree(west.twouse.language.yuml.resource.yuml.grammar.YumlSyntaxElement syntaxElement) {
		west.twouse.language.yuml.resource.yuml.grammar.YumlSyntaxElement[] children = syntaxElement.getChildren();
		int childCount = children.length;
		west.twouse.language.yuml.resource.yuml.mopp.YumlSyntaxElementDecorator[] childDecorators = new west.twouse.language.yuml.resource.yuml.mopp.YumlSyntaxElementDecorator[childCount];
		for (int i = 0; i < childCount; i++) {
			childDecorators[i] = getDecoratorTree(children[i]);
		}
		west.twouse.language.yuml.resource.yuml.mopp.YumlSyntaxElementDecorator decorator = new west.twouse.language.yuml.resource.yuml.mopp.YumlSyntaxElementDecorator(syntaxElement, childDecorators);
		return decorator;
	}
	
	public void decorateTree(west.twouse.language.yuml.resource.yuml.mopp.YumlSyntaxElementDecorator decorator, org.eclipse.emf.ecore.EObject eObject) {
		java.util.Map<String, Integer> printCountingMap = initializePrintCountingMap(eObject);
		java.util.List<west.twouse.language.yuml.resource.yuml.mopp.YumlSyntaxElementDecorator> keywordsToPrint = new java.util.ArrayList<west.twouse.language.yuml.resource.yuml.mopp.YumlSyntaxElementDecorator>();
		decorateTreeBasic(decorator, eObject, printCountingMap, keywordsToPrint);
		for (west.twouse.language.yuml.resource.yuml.mopp.YumlSyntaxElementDecorator keywordToPrint : keywordsToPrint) {
			// for keywords the concrete index does not matter, but we must add one to
			// indicate that the keyword needs to be printed here. Thus, we use 0 as index.
			keywordToPrint.addIndexToPrint(0);
		}
	}
	
	/**
	 * Tries to decorate the decorator with an attribute value, or reference holded by
	 * eObject. Returns true if an attribute value or reference was found.
	 */
	public boolean decorateTreeBasic(west.twouse.language.yuml.resource.yuml.mopp.YumlSyntaxElementDecorator decorator, org.eclipse.emf.ecore.EObject eObject, java.util.Map<String, Integer> printCountingMap, java.util.List<west.twouse.language.yuml.resource.yuml.mopp.YumlSyntaxElementDecorator> keywordsToPrint) {
		boolean foundFeatureToPrint = false;
		west.twouse.language.yuml.resource.yuml.grammar.YumlSyntaxElement syntaxElement = decorator.getDecoratedElement();
		west.twouse.language.yuml.resource.yuml.grammar.YumlCardinality cardinality = syntaxElement.getCardinality();
		boolean isFirstIteration = true;
		while (true) {
			java.util.List<west.twouse.language.yuml.resource.yuml.mopp.YumlSyntaxElementDecorator> subKeywordsToPrint = new java.util.ArrayList<west.twouse.language.yuml.resource.yuml.mopp.YumlSyntaxElementDecorator>();
			boolean keepDecorating = false;
			if (syntaxElement instanceof west.twouse.language.yuml.resource.yuml.grammar.YumlKeyword) {
				subKeywordsToPrint.add(decorator);
			} else if (syntaxElement instanceof west.twouse.language.yuml.resource.yuml.grammar.YumlTerminal) {
				west.twouse.language.yuml.resource.yuml.grammar.YumlTerminal terminal = (west.twouse.language.yuml.resource.yuml.grammar.YumlTerminal) syntaxElement;
				org.eclipse.emf.ecore.EStructuralFeature feature = terminal.getFeature();
				if (feature == west.twouse.language.yuml.resource.yuml.grammar.YumlGrammarInformationProvider.ANONYMOUS_FEATURE) {
					return false;
				}
				int countLeft = printCountingMap.get(feature.getName());
				if (countLeft > terminal.getMandatoryOccurencesAfter()) {
					decorator.addIndexToPrint(countLeft);
					printCountingMap.put(feature.getName(), countLeft - 1);
					keepDecorating = true;
				}
			}
			if (syntaxElement instanceof west.twouse.language.yuml.resource.yuml.grammar.YumlChoice) {
				// for choices we do print only the choice which does print at least one feature
				west.twouse.language.yuml.resource.yuml.mopp.YumlSyntaxElementDecorator childToPrint = null;
				for (west.twouse.language.yuml.resource.yuml.mopp.YumlSyntaxElementDecorator childDecorator : decorator.getChildDecorators()) {
					// pick first choice as default, will be overridden if a choice that prints a
					// feature is found
					if (childToPrint == null) {
						childToPrint = childDecorator;
					}
					if (doesPrintFeature(childDecorator, eObject, printCountingMap)) {
						childToPrint = childDecorator;
						break;
					}
				}
				keepDecorating |= decorateTreeBasic(childToPrint, eObject, printCountingMap, subKeywordsToPrint);
			} else {
				// for all other syntax element we do print all children
				for (west.twouse.language.yuml.resource.yuml.mopp.YumlSyntaxElementDecorator childDecorator : decorator.getChildDecorators()) {
					keepDecorating |= decorateTreeBasic(childDecorator, eObject, printCountingMap, subKeywordsToPrint);
				}
			}
			foundFeatureToPrint |= keepDecorating;
			// only print keywords if a feature was printed or the syntax element is mandatory
			if (cardinality == west.twouse.language.yuml.resource.yuml.grammar.YumlCardinality.ONE) {
				keywordsToPrint.addAll(subKeywordsToPrint);
			} else if (cardinality == west.twouse.language.yuml.resource.yuml.grammar.YumlCardinality.PLUS) {
				if (isFirstIteration) {
					keywordsToPrint.addAll(subKeywordsToPrint);
				} else {
					if (keepDecorating) {
						keywordsToPrint.addAll(subKeywordsToPrint);
					}
				}
			} else if (keepDecorating && (cardinality == west.twouse.language.yuml.resource.yuml.grammar.YumlCardinality.STAR || cardinality == west.twouse.language.yuml.resource.yuml.grammar.YumlCardinality.QUESTIONMARK)) {
				keywordsToPrint.addAll(subKeywordsToPrint);
			}
			if (cardinality == west.twouse.language.yuml.resource.yuml.grammar.YumlCardinality.ONE || cardinality == west.twouse.language.yuml.resource.yuml.grammar.YumlCardinality.QUESTIONMARK) {
				break;
			} else if (!keepDecorating) {
				break;
			}
			isFirstIteration = false;
		}
		return foundFeatureToPrint;
	}
	
	/**
	 * Checks whether decorating the given node will use at least one attribute value,
	 * or reference holded by eObject. Returns true if a printable attribute value or
	 * reference was found. This method is used to decide which choice to pick, when
	 * multiple choices are available. We pick the choice that prints at least one
	 * attribute or reference.
	 */
	public boolean doesPrintFeature(west.twouse.language.yuml.resource.yuml.mopp.YumlSyntaxElementDecorator decorator, org.eclipse.emf.ecore.EObject eObject, java.util.Map<String, Integer> printCountingMap) {
		west.twouse.language.yuml.resource.yuml.grammar.YumlSyntaxElement syntaxElement = decorator.getDecoratedElement();
		if (syntaxElement instanceof west.twouse.language.yuml.resource.yuml.grammar.YumlTerminal) {
			west.twouse.language.yuml.resource.yuml.grammar.YumlTerminal terminal = (west.twouse.language.yuml.resource.yuml.grammar.YumlTerminal) syntaxElement;
			org.eclipse.emf.ecore.EStructuralFeature feature = terminal.getFeature();
			if (feature == west.twouse.language.yuml.resource.yuml.grammar.YumlGrammarInformationProvider.ANONYMOUS_FEATURE) {
				return false;
			}
			int countLeft = printCountingMap.get(feature.getName());
			if (countLeft > terminal.getMandatoryOccurencesAfter()) {
				// found a feature to print
				return true;
			}
		}
		for (west.twouse.language.yuml.resource.yuml.mopp.YumlSyntaxElementDecorator childDecorator : decorator.getChildDecorators()) {
			if (doesPrintFeature(childDecorator, eObject, printCountingMap)) {
				return true;
			}
		}
		return false;
	}
	
	public boolean printTree(west.twouse.language.yuml.resource.yuml.mopp.YumlSyntaxElementDecorator decorator, org.eclipse.emf.ecore.EObject eObject, java.util.List<west.twouse.language.yuml.resource.yuml.grammar.YumlFormattingElement> foundFormattingElements, java.util.List<west.twouse.language.yuml.resource.yuml.mopp.YumlLayoutInformation> layoutInformations) {
		west.twouse.language.yuml.resource.yuml.grammar.YumlSyntaxElement printElement = decorator.getDecoratedElement();
		west.twouse.language.yuml.resource.yuml.grammar.YumlCardinality cardinality = printElement.getCardinality();
		java.util.List<west.twouse.language.yuml.resource.yuml.grammar.YumlFormattingElement> cloned = new java.util.ArrayList<west.twouse.language.yuml.resource.yuml.grammar.YumlFormattingElement>();
		cloned.addAll(foundFormattingElements);
		boolean foundSomethingAtAll = false;
		boolean foundSomethingToPrint;
		while (true) {
			foundSomethingToPrint = false;
			Integer indexToPrint = decorator.getNextIndexToPrint();
			if (indexToPrint != null) {
				if (printElement instanceof west.twouse.language.yuml.resource.yuml.grammar.YumlKeyword) {
					printKeyword(eObject, (west.twouse.language.yuml.resource.yuml.grammar.YumlKeyword) printElement, foundFormattingElements, layoutInformations);
					foundSomethingToPrint = true;
				} else if (printElement instanceof west.twouse.language.yuml.resource.yuml.grammar.YumlPlaceholder) {
					west.twouse.language.yuml.resource.yuml.grammar.YumlPlaceholder placeholder = (west.twouse.language.yuml.resource.yuml.grammar.YumlPlaceholder) printElement;
					printFeature(eObject, placeholder, indexToPrint, foundFormattingElements, layoutInformations);
					foundSomethingToPrint = true;
				} else if (printElement instanceof west.twouse.language.yuml.resource.yuml.grammar.YumlContainment) {
					west.twouse.language.yuml.resource.yuml.grammar.YumlContainment containment = (west.twouse.language.yuml.resource.yuml.grammar.YumlContainment) printElement;
					printContainedObject(eObject, containment, indexToPrint, foundFormattingElements, layoutInformations);
					foundSomethingToPrint = true;
				} else if (printElement instanceof west.twouse.language.yuml.resource.yuml.grammar.YumlBooleanTerminal) {
					west.twouse.language.yuml.resource.yuml.grammar.YumlBooleanTerminal booleanTerminal = (west.twouse.language.yuml.resource.yuml.grammar.YumlBooleanTerminal) printElement;
					printBooleanTerminal(eObject, booleanTerminal, indexToPrint, foundFormattingElements, layoutInformations);
					foundSomethingToPrint = true;
				}
			}
			if (foundSomethingToPrint) {
				foundSomethingAtAll = true;
			}
			if (printElement instanceof west.twouse.language.yuml.resource.yuml.grammar.YumlWhiteSpace) {
				foundFormattingElements.add((west.twouse.language.yuml.resource.yuml.grammar.YumlWhiteSpace) printElement);
			}
			if (printElement instanceof west.twouse.language.yuml.resource.yuml.grammar.YumlLineBreak) {
				foundFormattingElements.add((west.twouse.language.yuml.resource.yuml.grammar.YumlLineBreak) printElement);
			}
			for (west.twouse.language.yuml.resource.yuml.mopp.YumlSyntaxElementDecorator childDecorator : decorator.getChildDecorators()) {
				foundSomethingToPrint |= printTree(childDecorator, eObject, foundFormattingElements, layoutInformations);
				west.twouse.language.yuml.resource.yuml.grammar.YumlSyntaxElement decoratedElement = decorator.getDecoratedElement();
				if (foundSomethingToPrint && decoratedElement instanceof west.twouse.language.yuml.resource.yuml.grammar.YumlChoice) {
					break;
				}
			}
			if (cardinality == west.twouse.language.yuml.resource.yuml.grammar.YumlCardinality.ONE || cardinality == west.twouse.language.yuml.resource.yuml.grammar.YumlCardinality.QUESTIONMARK) {
				break;
			} else if (!foundSomethingToPrint) {
				break;
			}
		}
		// only print formatting elements if a feature was printed or the syntax element
		// is mandatory
		if (!foundSomethingAtAll && (cardinality == west.twouse.language.yuml.resource.yuml.grammar.YumlCardinality.STAR || cardinality == west.twouse.language.yuml.resource.yuml.grammar.YumlCardinality.QUESTIONMARK)) {
			foundFormattingElements.clear();
			foundFormattingElements.addAll(cloned);
		}
		return foundSomethingToPrint;
	}
	
	public void printKeyword(org.eclipse.emf.ecore.EObject eObject, west.twouse.language.yuml.resource.yuml.grammar.YumlKeyword keyword, java.util.List<west.twouse.language.yuml.resource.yuml.grammar.YumlFormattingElement> foundFormattingElements, java.util.List<west.twouse.language.yuml.resource.yuml.mopp.YumlLayoutInformation> layoutInformations) {
		west.twouse.language.yuml.resource.yuml.mopp.YumlLayoutInformation layoutInformation = getLayoutInformation(layoutInformations, keyword, null, eObject);
		printFormattingElements(foundFormattingElements, layoutInformations, layoutInformation);
		String value = keyword.getValue();
		tokenOutputStream.add(new PrintToken(value, "'" + west.twouse.language.yuml.resource.yuml.util.YumlStringUtil.escapeToANTLRKeyword(value) + "'"));
	}
	
	public void printFeature(org.eclipse.emf.ecore.EObject eObject, west.twouse.language.yuml.resource.yuml.grammar.YumlPlaceholder placeholder, int count, java.util.List<west.twouse.language.yuml.resource.yuml.grammar.YumlFormattingElement> foundFormattingElements, java.util.List<west.twouse.language.yuml.resource.yuml.mopp.YumlLayoutInformation> layoutInformations) {
		org.eclipse.emf.ecore.EStructuralFeature feature = placeholder.getFeature();
		if (feature instanceof org.eclipse.emf.ecore.EAttribute) {
			printAttribute(eObject, (org.eclipse.emf.ecore.EAttribute) feature, placeholder, count, foundFormattingElements, layoutInformations);
		} else {
			printReference(eObject, (org.eclipse.emf.ecore.EReference) feature, placeholder, count, foundFormattingElements, layoutInformations);
		}
	}
	
	public void printAttribute(org.eclipse.emf.ecore.EObject eObject, org.eclipse.emf.ecore.EAttribute attribute, west.twouse.language.yuml.resource.yuml.grammar.YumlPlaceholder placeholder, int count, java.util.List<west.twouse.language.yuml.resource.yuml.grammar.YumlFormattingElement> foundFormattingElements, java.util.List<west.twouse.language.yuml.resource.yuml.mopp.YumlLayoutInformation> layoutInformations) {
		String result;
		Object attributeValue = getValue(eObject, attribute, count);
		west.twouse.language.yuml.resource.yuml.mopp.YumlLayoutInformation layoutInformation = getLayoutInformation(layoutInformations, placeholder, attributeValue, eObject);
		String visibleTokenText = getVisibleTokenText(layoutInformation);
		// if there is text for the attribute we use it
		if (visibleTokenText != null) {
			result = visibleTokenText;
		} else {
			// if no text is available, the attribute is deresolved to obtain its textual
			// representation
			west.twouse.language.yuml.resource.yuml.IYumlTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver(placeholder.getTokenName());
			tokenResolver.setOptions(getOptions());
			String deResolvedValue = tokenResolver.deResolve(attributeValue, attribute, eObject);
			result = deResolvedValue;
		}
		if (result != null && !"".equals(result)) {
			printFormattingElements(foundFormattingElements, layoutInformations, layoutInformation);
		}
		// write result to the output stream
		tokenOutputStream.add(new PrintToken(result, placeholder.getTokenName()));
	}
	
	public void printBooleanTerminal(org.eclipse.emf.ecore.EObject eObject, west.twouse.language.yuml.resource.yuml.grammar.YumlBooleanTerminal booleanTerminal, int count, java.util.List<west.twouse.language.yuml.resource.yuml.grammar.YumlFormattingElement> foundFormattingElements, java.util.List<west.twouse.language.yuml.resource.yuml.mopp.YumlLayoutInformation> layoutInformations) {
		org.eclipse.emf.ecore.EAttribute attribute = booleanTerminal.getAttribute();
		String result;
		Object attributeValue = getValue(eObject, attribute, count);
		west.twouse.language.yuml.resource.yuml.mopp.YumlLayoutInformation layoutInformation = getLayoutInformation(layoutInformations, booleanTerminal, attributeValue, eObject);
		String visibleTokenText = getVisibleTokenText(layoutInformation);
		// if there is text for the attribute we use it
		if (visibleTokenText != null) {
			result = visibleTokenText;
		} else {
			// if no text is available, the boolean attribute is converted to its textual
			// representation using the literals of the boolean terminal
			if (Boolean.TRUE.equals(attributeValue)) {
				result = booleanTerminal.getTrueLiteral();
			} else {
				result = booleanTerminal.getFalseLiteral();
			}
		}
		if (result != null && !"".equals(result)) {
			printFormattingElements(foundFormattingElements, layoutInformations, layoutInformation);
			// write result to the output stream
			tokenOutputStream.add(new PrintToken(result, "'" + west.twouse.language.yuml.resource.yuml.util.YumlStringUtil.escapeToANTLRKeyword(result) + "'"));
		}
	}
	
	public void printContainedObject(org.eclipse.emf.ecore.EObject eObject, west.twouse.language.yuml.resource.yuml.grammar.YumlContainment containment, int count, java.util.List<west.twouse.language.yuml.resource.yuml.grammar.YumlFormattingElement> foundFormattingElements, java.util.List<west.twouse.language.yuml.resource.yuml.mopp.YumlLayoutInformation> layoutInformations) {
		org.eclipse.emf.ecore.EStructuralFeature reference = containment.getFeature();
		Object o = getValue(eObject, reference, count);
		// save current number of tabs to restore them after printing the contained object
		int oldTabsBeforeCurrentObject = tabsBeforeCurrentObject;
		int oldCurrentTabs = currentTabs;
		// use current number of tabs to indent contained object. we do not directly set
		// 'tabsBeforeCurrentObject' because the first element of the new object must be
		// printed with the old number of tabs.
		newTabsBeforeCurrentObject = tabsBeforeCurrentObject + currentTabs;
		currentTabs = 0;
		doPrint((org.eclipse.emf.ecore.EObject) o, foundFormattingElements);
		// restore number of tabs after printing the contained object
		tabsBeforeCurrentObject = oldTabsBeforeCurrentObject;
		newTabsBeforeCurrentObject = tabsBeforeCurrentObject;
		currentTabs = oldCurrentTabs;
	}
	
	public void printFormattingElements(java.util.List<west.twouse.language.yuml.resource.yuml.grammar.YumlFormattingElement> foundFormattingElements, java.util.List<west.twouse.language.yuml.resource.yuml.mopp.YumlLayoutInformation> layoutInformations, west.twouse.language.yuml.resource.yuml.mopp.YumlLayoutInformation layoutInformation) {
		String hiddenTokenText = getHiddenTokenText(layoutInformation);
		if (hiddenTokenText != null) {
			// removed used information
			layoutInformations.remove(layoutInformation);
			tokenOutputStream.add(new PrintToken(hiddenTokenText, null));
			foundFormattingElements.clear();
			startedPrintingObject = false;
			tabsBeforeCurrentObject = newTabsBeforeCurrentObject;
			return;
		}
		if (foundFormattingElements.size() > 0) {
			for (west.twouse.language.yuml.resource.yuml.grammar.YumlFormattingElement foundFormattingElement : foundFormattingElements) {
				if (foundFormattingElement instanceof west.twouse.language.yuml.resource.yuml.grammar.YumlWhiteSpace) {
					int amount = ((west.twouse.language.yuml.resource.yuml.grammar.YumlWhiteSpace) foundFormattingElement).getAmount();
					for (int i = 0; i < amount; i++) {
						tokenOutputStream.add(new PrintToken(" ", null));
					}
				}
				if (foundFormattingElement instanceof west.twouse.language.yuml.resource.yuml.grammar.YumlLineBreak) {
					currentTabs = ((west.twouse.language.yuml.resource.yuml.grammar.YumlLineBreak) foundFormattingElement).getTabs();
					tokenOutputStream.add(new PrintToken(NEW_LINE, null));
					for (int i = 0; i < tabsBeforeCurrentObject + currentTabs; i++) {
						tokenOutputStream.add(new PrintToken("\t", null));
					}
				}
			}
			foundFormattingElements.clear();
			startedPrintingObject = false;
		} else {
			if (startedPrintingObject) {
				// if no elements have been printed yet, we do not add the default token space,
				// because spaces before the first element are not desired.
				startedPrintingObject = false;
			} else {
				if (!handleTokenSpaceAutomatically) {
					tokenOutputStream.add(new PrintToken(getWhiteSpaceString(tokenSpace), null));
				}
			}
		}
		// after printing the first element, we can use the new number of tabs.
		tabsBeforeCurrentObject = newTabsBeforeCurrentObject;
	}
	
	private Object getValue(org.eclipse.emf.ecore.EObject eObject, org.eclipse.emf.ecore.EStructuralFeature feature, int count) {
		// get value of feature
		Object o = eObject.eGet(feature);
		if (o instanceof java.util.List<?>) {
			java.util.List<?> list = (java.util.List<?>) o;
			int index = list.size() - count;
			o = list.get(index);
		}
		return o;
	}
	
	@SuppressWarnings("unchecked")	
	public void printReference(org.eclipse.emf.ecore.EObject eObject, org.eclipse.emf.ecore.EReference reference, west.twouse.language.yuml.resource.yuml.grammar.YumlPlaceholder placeholder, int count, java.util.List<west.twouse.language.yuml.resource.yuml.grammar.YumlFormattingElement> foundFormattingElements, java.util.List<west.twouse.language.yuml.resource.yuml.mopp.YumlLayoutInformation> layoutInformations) {
		Object referencedObject = getValue(eObject, reference, count);
		west.twouse.language.yuml.resource.yuml.mopp.YumlLayoutInformation layoutInformation = getLayoutInformation(layoutInformations, placeholder, referencedObject, eObject);
		printFormattingElements(foundFormattingElements, layoutInformations, layoutInformation);
		// NC-References must always be printed by deresolving the reference. We cannot
		// use the visible token information, because deresolving usually depends on
		// attribute values of the referenced object instead of the object itself.
		String tokenName = placeholder.getTokenName();
		west.twouse.language.yuml.resource.yuml.IYumlTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver(tokenName);
		tokenResolver.setOptions(getOptions());
		@SuppressWarnings("rawtypes")		
		west.twouse.language.yuml.resource.yuml.IYumlReferenceResolver referenceResolver = getReferenceResolverSwitch().getResolver(reference);
		referenceResolver.setOptions(getOptions());
		String deresolvedReference = referenceResolver.deResolve((org.eclipse.emf.ecore.EObject) referencedObject, eObject, reference);
		String deresolvedToken = tokenResolver.deResolve(deresolvedReference, reference, eObject);
		// write result to output stream
		tokenOutputStream.add(new PrintToken(deresolvedToken, tokenName));
	}
	
	public java.util.Map<String, Integer> initializePrintCountingMap(org.eclipse.emf.ecore.EObject eObject) {
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		java.util.Map<String, Integer> printCountingMap = new java.util.LinkedHashMap<String, Integer>();
		java.util.List<org.eclipse.emf.ecore.EStructuralFeature> features = eObject.eClass().getEAllStructuralFeatures();
		for (org.eclipse.emf.ecore.EStructuralFeature feature : features) {
			int count = 0;
			Object featureValue = eObject.eGet(feature);
			if (featureValue != null) {
				if (featureValue instanceof java.util.List<?>) {
					count = ((java.util.List<?>) featureValue).size();
				} else {
					count = 1;
				}
			}
			printCountingMap.put(feature.getName(), count);
		}
		return printCountingMap;
	}
	
	public java.util.Map<?,?> getOptions() {
		return options;
	}
	
	public void setOptions(java.util.Map<?,?> options) {
		this.options = options;
	}
	
	public west.twouse.language.yuml.resource.yuml.IYumlTextResource getResource() {
		return resource;
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
	
	protected west.twouse.language.yuml.resource.yuml.mopp.YumlLayoutInformationAdapter getLayoutInformationAdapter(org.eclipse.emf.ecore.EObject element) {
		for (org.eclipse.emf.common.notify.Adapter adapter : element.eAdapters()) {
			if (adapter instanceof west.twouse.language.yuml.resource.yuml.mopp.YumlLayoutInformationAdapter) {
				return (west.twouse.language.yuml.resource.yuml.mopp.YumlLayoutInformationAdapter) adapter;
			}
		}
		west.twouse.language.yuml.resource.yuml.mopp.YumlLayoutInformationAdapter newAdapter = new west.twouse.language.yuml.resource.yuml.mopp.YumlLayoutInformationAdapter();
		element.eAdapters().add(newAdapter);
		return newAdapter;
	}
	
	private west.twouse.language.yuml.resource.yuml.mopp.YumlLayoutInformation getLayoutInformation(java.util.List<west.twouse.language.yuml.resource.yuml.mopp.YumlLayoutInformation> layoutInformations, west.twouse.language.yuml.resource.yuml.grammar.YumlSyntaxElement syntaxElement, Object object, org.eclipse.emf.ecore.EObject container) {
		for (west.twouse.language.yuml.resource.yuml.mopp.YumlLayoutInformation layoutInformation : layoutInformations) {
			if (syntaxElement == layoutInformation.getSyntaxElement()) {
				if (object == null) {
					return layoutInformation;
				} else if (object == layoutInformation.getObject(container)) {
					return layoutInformation;
				}
			}
		}
		return null;
	}
	
	private String getHiddenTokenText(west.twouse.language.yuml.resource.yuml.mopp.YumlLayoutInformation layoutInformation) {
		if (layoutInformation != null) {
			return layoutInformation.getHiddenTokenText();
		} else {
			return null;
		}
	}
	
	private String getVisibleTokenText(west.twouse.language.yuml.resource.yuml.mopp.YumlLayoutInformation layoutInformation) {
		if (layoutInformation != null) {
			return layoutInformation.getVisibleTokenText();
		} else {
			return null;
		}
	}
	
	protected String getWhiteSpaceString(int count) {
		return getRepeatingString(count, ' ');
	}
	
	private String getRepeatingString(int count, char character) {
		StringBuffer result = new StringBuffer();
		for (int i = 0; i < count; i++) {
			result.append(character);
		}
		return result.toString();
	}
	
	public void setHandleTokenSpaceAutomatically(boolean handleTokenSpaceAutomatically) {
		this.handleTokenSpaceAutomatically = handleTokenSpaceAutomatically;
	}
	
	public void setTokenSpace(int tokenSpace) {
		this.tokenSpace = tokenSpace;
	}
	
	/**
	 * Prints the current tokenOutputStream to the given writer (as it is).
	 */
	public void printBasic(java.io.OutputStreamWriter writer) throws java.io.IOException {
		for (PrintToken nextToken : tokenOutputStream) {
			writer.write(nextToken.getText());
		}
	}
	
	/**
	 * Prints the current tokenOutputStream to the given writer.
	 * 
	 * This methods implements smart whitespace printing. It does so by writing output
	 * to a token stream instead of printing the raw token text to a PrintWriter.
	 * Tokens in this stream hold both the text and the type of the token (i.e., its
	 * name).
	 * 
	 * To decide where whitespace is needed, sequences of successive tokens are
	 * searched that can be printed without separating whitespace. To determine such
	 * groups we start with two successive non-whitespace tokens, concatenate their
	 * text and use the generated ANTLR lexer to split the text. If the resulting
	 * token sequence of the concatenated text is exactly the same as the one that is
	 * to be printed, no whitespace is needed. The tokens in the sequence are checked
	 * both regarding their type and their text. If two tokens successfully form a
	 * group a third one is added and so on.
	 */
	public void printSmart(java.io.OutputStreamWriter writer) throws java.io.IOException {
		// stores the text of the current group of tokens. this text is given to the lexer
		// to check whether it can be correctly scanned.
		StringBuilder currentBlock = new StringBuilder();
		// stores the index of the first token of the current group.
		int currentBlockStart = 0;
		// stores the text that was already successfully checked (i.e., is can be scanned
		// correctly and can thus be printed).
		String validBlock = "";
		for (int i = 0; i < tokenOutputStream.size(); i++) {
			PrintToken tokenI = tokenOutputStream.get(i);
			currentBlock.append(tokenI.getText());
			// if declared or preserved whitespace is found - print block
			if (tokenI.getTokenName() == null) {
				writer.write(currentBlock.toString());
				// reset all values
				currentBlock = new StringBuilder();
				currentBlockStart = i + 1;
				validBlock = "";
				continue;
			}
			// now check whether the current block can be scanned
			west.twouse.language.yuml.resource.yuml.IYumlTextScanner scanner = new west.twouse.language.yuml.resource.yuml.mopp.YumlMetaInformation().createLexer();
			scanner.setText(currentBlock.toString());
			// retrieve all tokens from scanner and add them to list 'tempTokens'
			java.util.List<west.twouse.language.yuml.resource.yuml.IYumlTextToken> tempTokens = new java.util.ArrayList<west.twouse.language.yuml.resource.yuml.IYumlTextToken>();
			west.twouse.language.yuml.resource.yuml.IYumlTextToken nextToken = scanner.getNextToken();
			while (nextToken != null && nextToken.getText() != null) {
				tempTokens.add(nextToken);
				nextToken = scanner.getNextToken();
			}
			boolean sequenceIsValid = true;
			// check whether the current block was scanned to the same token sequence
			for (int t = 0; t < tempTokens.size(); t++) {
				PrintToken printTokenT = tokenOutputStream.get(currentBlockStart + t);
				west.twouse.language.yuml.resource.yuml.IYumlTextToken tempToken = tempTokens.get(t);
				if (!tempToken.getText().equals(printTokenT.getText())) {
					sequenceIsValid = false;
					break;
				}
				String commonTokenName = tempToken.getName();
				String printTokenName = printTokenT.getTokenName();
				if (printTokenName.length() > 2 && printTokenName.startsWith("'") && printTokenName.endsWith("'")) {
					printTokenName = printTokenName.substring(1, printTokenName.length() - 1);
				}
				if (!commonTokenName.equals(printTokenName)) {
					sequenceIsValid = false;
					break;
				}
			}
			if (sequenceIsValid) {
				// sequence is still valid, try adding one more token in the next iteration of the
				// loop
				validBlock += tokenI.getText();
			} else {
				// sequence is not valid, must print whitespace to separate tokens
				// print text that is valid so far
				writer.write(validBlock);
				// print separating whitespace
				writer.write(" ");
				// add current token as initial value for next iteration
				currentBlock = new StringBuilder(tokenI.getText());
				currentBlockStart = i;
				validBlock = tokenI.getText();
			}
		}
		// flush remaining valid text to writer
		writer.write(validBlock);
	}
	
}
