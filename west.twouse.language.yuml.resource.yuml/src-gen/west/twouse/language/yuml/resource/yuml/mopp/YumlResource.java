/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package west.twouse.language.yuml.resource.yuml.mopp;

public class YumlResource extends org.eclipse.emf.ecore.resource.impl.ResourceImpl implements west.twouse.language.yuml.resource.yuml.IYumlTextResource {
	
	public class ElementBasedTextDiagnostic implements west.twouse.language.yuml.resource.yuml.IYumlTextDiagnostic {
		
		private final west.twouse.language.yuml.resource.yuml.IYumlLocationMap locationMap;
		private final org.eclipse.emf.common.util.URI uri;
		private final org.eclipse.emf.ecore.EObject element;
		private final west.twouse.language.yuml.resource.yuml.IYumlProblem problem;
		
		public ElementBasedTextDiagnostic(west.twouse.language.yuml.resource.yuml.IYumlLocationMap locationMap, org.eclipse.emf.common.util.URI uri, west.twouse.language.yuml.resource.yuml.IYumlProblem problem, org.eclipse.emf.ecore.EObject element) {
			super();
			this.uri = uri;
			this.locationMap = locationMap;
			this.element = element;
			this.problem = problem;
		}
		
		public String getMessage() {
			return problem.getMessage();
		}
		
		public west.twouse.language.yuml.resource.yuml.IYumlProblem getProblem() {
			return problem;
		}
		
		public String getLocation() {
			return uri.toString();
		}
		
		public int getCharStart() {
			return Math.max(0, locationMap.getCharStart(element));
		}
		
		public int getCharEnd() {
			return Math.max(0, locationMap.getCharEnd(element));
		}
		
		public int getColumn() {
			return Math.max(0, locationMap.getColumn(element));
		}
		
		public int getLine() {
			return Math.max(0, locationMap.getLine(element));
		}
		
		public boolean wasCausedBy(org.eclipse.emf.ecore.EObject element) {
			if (this.element == null) {
				return false;
			}
			return this.element.equals(element);
		}
		
		public String toString() {
			return getMessage() + " at " + getLocation() + " line " + getLine() + ", column " + getColumn();
		}
	}
	
	public class PositionBasedTextDiagnostic implements west.twouse.language.yuml.resource.yuml.IYumlTextDiagnostic {
		
		private final org.eclipse.emf.common.util.URI uri;
		
		private int column;
		private int line;
		private int charStart;
		private int charEnd;
		private west.twouse.language.yuml.resource.yuml.IYumlProblem problem;
		
		public PositionBasedTextDiagnostic(org.eclipse.emf.common.util.URI uri, west.twouse.language.yuml.resource.yuml.IYumlProblem problem, int column, int line, int charStart, int charEnd) {
			
			super();
			this.uri = uri;
			this.column = column;
			this.line = line;
			this.charStart = charStart;
			this.charEnd = charEnd;
			this.problem = problem;
		}
		
		public west.twouse.language.yuml.resource.yuml.IYumlProblem getProblem() {
			return problem;
		}
		
		public int getCharStart() {
			return charStart;
		}
		
		public int getCharEnd() {
			return charEnd;
		}
		
		public int getColumn() {
			return column;
		}
		
		public int getLine() {
			return line;
		}
		
		public String getLocation() {
			return uri.toString();
		}
		
		public String getMessage() {
			return problem.getMessage();
		}
		
		public boolean wasCausedBy(org.eclipse.emf.ecore.EObject element) {
			return false;
		}
		
		public String toString() {
			return getMessage() + " at " + getLocation() + " line " + getLine() + ", column " + getColumn();
		}
	}
	
	private west.twouse.language.yuml.resource.yuml.IYumlReferenceResolverSwitch resolverSwitch;
	private west.twouse.language.yuml.resource.yuml.IYumlLocationMap locationMap;
	private int proxyCounter = 0;
	private west.twouse.language.yuml.resource.yuml.IYumlTextParser parser;
	private java.util.Map<String, west.twouse.language.yuml.resource.yuml.IYumlContextDependentURIFragment<? extends org.eclipse.emf.ecore.EObject>> internalURIFragmentMap = new java.util.LinkedHashMap<String, west.twouse.language.yuml.resource.yuml.IYumlContextDependentURIFragment<? extends org.eclipse.emf.ecore.EObject>>();
	private java.util.Map<String, west.twouse.language.yuml.resource.yuml.IYumlQuickFix> quickFixMap = new java.util.LinkedHashMap<String, west.twouse.language.yuml.resource.yuml.IYumlQuickFix>();
	private String textPrintAfterLoading = null;
	private java.util.Map<?, ?> loadOptions;
	
	public YumlResource() {
		super();
		resetLocationMap();
	}
	
	public YumlResource(org.eclipse.emf.common.util.URI uri) {
		super(uri);
		resetLocationMap();
	}
	
	protected void doLoad(java.io.InputStream inputStream, java.util.Map<?,?> options) throws java.io.IOException {
		this.loadOptions = options;
		String encoding = null;
		java.io.InputStream actualInputStream = inputStream;
		Object inputStreamPreProcessorProvider = null;
		if (options!=null) {
			inputStreamPreProcessorProvider = options.get(west.twouse.language.yuml.resource.yuml.IYumlOptions.INPUT_STREAM_PREPROCESSOR_PROVIDER);
		}
		if (inputStreamPreProcessorProvider != null) {
			if (inputStreamPreProcessorProvider instanceof west.twouse.language.yuml.resource.yuml.IYumlInputStreamProcessorProvider) {
				west.twouse.language.yuml.resource.yuml.IYumlInputStreamProcessorProvider provider = (west.twouse.language.yuml.resource.yuml.IYumlInputStreamProcessorProvider) inputStreamPreProcessorProvider;
				west.twouse.language.yuml.resource.yuml.mopp.YumlInputStreamProcessor processor = provider.getInputStreamProcessor(inputStream);
				actualInputStream = processor;
				encoding = processor.getOutputEncoding();
			}
		}
		
		parser = getMetaInformation().createParser(actualInputStream, encoding);
		parser.setOptions(options);
		west.twouse.language.yuml.resource.yuml.IYumlReferenceResolverSwitch referenceResolverSwitch = getReferenceResolverSwitch();
		referenceResolverSwitch.setOptions(options);
		west.twouse.language.yuml.resource.yuml.IYumlParseResult result = parser.parse();
		clearState();
		getContents().clear();
		org.eclipse.emf.ecore.EObject root = null;
		if (result != null) {
			root = result.getRoot();
			if (root != null) {
				getContents().add(root);
			}
			java.util.Collection<west.twouse.language.yuml.resource.yuml.IYumlCommand<west.twouse.language.yuml.resource.yuml.IYumlTextResource>> commands = result.getPostParseCommands();
			if (commands != null) {
				for (west.twouse.language.yuml.resource.yuml.IYumlCommand<west.twouse.language.yuml.resource.yuml.IYumlTextResource>  command : commands) {
					command.execute(this);
				}
			}
		}
		getReferenceResolverSwitch().setOptions(options);
		if (getErrors().isEmpty()) {
			runPostProcessors(options);
			if (root != null) {
				runValidators(root);
			}
		}
		textPrintAfterLoading = getPrint(options);
	}
	
	public void reload(java.io.InputStream inputStream, java.util.Map<?,?> options) throws java.io.IOException {
		try {
			isLoaded = false;
			java.util.Map<Object, Object> loadOptions = addDefaultLoadOptions(options);
			doLoad(inputStream, loadOptions);
		} catch (west.twouse.language.yuml.resource.yuml.mopp.YumlTerminateParsingException tpe) {
			// do nothing - the resource is left unchanged if this exception is thrown
		}
		isLoaded = true;
	}
	
	public void cancelReload() {
		west.twouse.language.yuml.resource.yuml.IYumlTextParser parserCopy = parser;
		parserCopy.terminate();
	}
	
	protected void doSave(java.io.OutputStream outputStream, java.util.Map<?,?> options) throws java.io.IOException {
		west.twouse.language.yuml.resource.yuml.IYumlTextPrinter printer = getMetaInformation().createPrinter(outputStream, this);
		west.twouse.language.yuml.resource.yuml.IYumlReferenceResolverSwitch referenceResolverSwitch = getReferenceResolverSwitch();
		referenceResolverSwitch.setOptions(options);
		for(org.eclipse.emf.ecore.EObject root : getContents()) {
			printer.print(root);
		}
	}
	
	protected void saveOnlyIfChangedWithMemoryBuffer(java.util.Map<?, ?> options) throws java.io.IOException {
		String currentPrint = getPrint(options);
		if (textPrintAfterLoading != null && textPrintAfterLoading.equals(currentPrint)) {
			return;
		} else {
			super.saveOnlyIfChangedWithFileBuffer(options);
		}
	}
	
	private String getPrint(java.util.Map<?, ?> options) throws java.io.IOException {
		java.io.ByteArrayOutputStream outputStream = new java.io.ByteArrayOutputStream();
		doSave(outputStream, options);
		return outputStream.toString();
	}
	
	protected String getSyntaxName() {
		return "yuml";
	}
	
	public west.twouse.language.yuml.resource.yuml.IYumlReferenceResolverSwitch getReferenceResolverSwitch() {
		if (resolverSwitch == null) {
			resolverSwitch = new west.twouse.language.yuml.resource.yuml.mopp.YumlReferenceResolverSwitch();
		}
		return resolverSwitch;
	}
	
	public west.twouse.language.yuml.resource.yuml.mopp.YumlMetaInformation getMetaInformation() {
		return new west.twouse.language.yuml.resource.yuml.mopp.YumlMetaInformation();
	}
	
	protected void resetLocationMap() {
		locationMap = new west.twouse.language.yuml.resource.yuml.mopp.YumlLocationMap();
	}
	
	public void addURIFragment(String internalURIFragment, west.twouse.language.yuml.resource.yuml.IYumlContextDependentURIFragment<? extends org.eclipse.emf.ecore.EObject> uriFragment) {
		internalURIFragmentMap.put(internalURIFragment, uriFragment);
	}
	
	public <ContainerType extends org.eclipse.emf.ecore.EObject, ReferenceType extends org.eclipse.emf.ecore.EObject> void registerContextDependentProxy(west.twouse.language.yuml.resource.yuml.IYumlContextDependentURIFragmentFactory<ContainerType, ReferenceType> factory, ContainerType container, org.eclipse.emf.ecore.EReference reference, String id, org.eclipse.emf.ecore.EObject proxyElement) {
		int pos = -1;
		if (reference.isMany()) {
			pos = ((java.util.List<?>)container.eGet(reference)).size();
		}
		org.eclipse.emf.ecore.InternalEObject proxy = (org.eclipse.emf.ecore.InternalEObject) proxyElement;
		String internalURIFragment = west.twouse.language.yuml.resource.yuml.IYumlContextDependentURIFragment.INTERNAL_URI_FRAGMENT_PREFIX + (proxyCounter++) + "_" + id;
		west.twouse.language.yuml.resource.yuml.IYumlContextDependentURIFragment<?> uriFragment = factory.create(id, container, reference, pos, proxy);
		proxy.eSetProxyURI(getURI().appendFragment(internalURIFragment));
		addURIFragment(internalURIFragment, uriFragment);
	}
	
	public org.eclipse.emf.ecore.EObject getEObject(String id) {
		if (internalURIFragmentMap.containsKey(id)) {
			west.twouse.language.yuml.resource.yuml.IYumlContextDependentURIFragment<? extends org.eclipse.emf.ecore.EObject> uriFragment = internalURIFragmentMap.get(id);
			boolean wasResolvedBefore = uriFragment.isResolved();
			west.twouse.language.yuml.resource.yuml.IYumlReferenceResolveResult<? extends org.eclipse.emf.ecore.EObject> result = uriFragment.resolve();
			if (result == null) {
				// the resolving did call itself
				return null;
			}
			if (!wasResolvedBefore && !result.wasResolved()) {
				attachErrors(result, uriFragment.getProxy());
				return null;
			} else if (!result.wasResolved()) {
				return null;
			} else {
				org.eclipse.emf.ecore.EObject proxy = uriFragment.getProxy();
				// remove an error that might have been added by an earlier attempt
				removeDiagnostics(proxy, getErrors());
				// remove old warnings and attach new
				removeDiagnostics(proxy, getWarnings());
				attachWarnings(result, proxy);
				west.twouse.language.yuml.resource.yuml.IYumlReferenceMapping<? extends org.eclipse.emf.ecore.EObject> mapping = result.getMappings().iterator().next();
				org.eclipse.emf.ecore.EObject resultElement = getResultElement(uriFragment, mapping, proxy, result.getErrorMessage());
				org.eclipse.emf.ecore.EObject container = uriFragment.getContainer();
				replaceProxyInLayoutAdapters(container, proxy, resultElement);
				return resultElement;
			}
		} else {
			return super.getEObject(id);
		}
	}
	
	protected void replaceProxyInLayoutAdapters(org.eclipse.emf.ecore.EObject container, org.eclipse.emf.ecore.EObject proxy, org.eclipse.emf.ecore.EObject target) {
		for (org.eclipse.emf.common.notify.Adapter adapter : container.eAdapters()) {
			if (adapter instanceof west.twouse.language.yuml.resource.yuml.mopp.YumlLayoutInformationAdapter) {
				west.twouse.language.yuml.resource.yuml.mopp.YumlLayoutInformationAdapter layoutInformationAdapter = (west.twouse.language.yuml.resource.yuml.mopp.YumlLayoutInformationAdapter) adapter;
				layoutInformationAdapter.replaceProxy(proxy, target);
			}
		}
	}
	
	private org.eclipse.emf.ecore.EObject getResultElement(west.twouse.language.yuml.resource.yuml.IYumlContextDependentURIFragment<? extends org.eclipse.emf.ecore.EObject> uriFragment, west.twouse.language.yuml.resource.yuml.IYumlReferenceMapping<? extends org.eclipse.emf.ecore.EObject> mapping, org.eclipse.emf.ecore.EObject proxy, final String errorMessage) {
		if (mapping instanceof west.twouse.language.yuml.resource.yuml.IYumlURIMapping<?>) {
			org.eclipse.emf.common.util.URI uri = ((west.twouse.language.yuml.resource.yuml.IYumlURIMapping<? extends org.eclipse.emf.ecore.EObject>)mapping).getTargetIdentifier();
			if (uri != null) {
				org.eclipse.emf.ecore.EObject result = null;
				try {
					result = this.getResourceSet().getEObject(uri, true);
				} catch (Exception e) {
					// we can catch exceptions here, because EMF will try to resolve again and handle
					// the exception
				}
				if (result == null || result.eIsProxy()) {
					// unable to resolve: attach error
					if (errorMessage == null) {
						assert(false);
					} else {
						addProblem(new west.twouse.language.yuml.resource.yuml.mopp.YumlProblem(errorMessage, west.twouse.language.yuml.resource.yuml.YumlEProblemType.ERROR), proxy);
					}
				}
				return result;
			}
			return null;
		} else if (mapping instanceof west.twouse.language.yuml.resource.yuml.IYumlElementMapping<?>) {
			org.eclipse.emf.ecore.EObject element = ((west.twouse.language.yuml.resource.yuml.IYumlElementMapping<? extends org.eclipse.emf.ecore.EObject>)mapping).getTargetElement();
			org.eclipse.emf.ecore.EReference reference = uriFragment.getReference();
			org.eclipse.emf.ecore.EReference oppositeReference = uriFragment.getReference().getEOpposite();
			if (!uriFragment.getReference().isContainment() && oppositeReference != null) {
				if (reference.isMany()) {
					org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList.ManyInverse<org.eclipse.emf.ecore.EObject> list = west.twouse.language.yuml.resource.yuml.util.YumlCastUtil.cast(element.eGet(oppositeReference, false));										// avoids duplicate entries in the reference caused by adding to the
					// oppositeReference
					list.basicAdd(uriFragment.getContainer(),null);
				} else {
					uriFragment.getContainer().eSet(uriFragment.getReference(), element);
				}
			}
			return element;
		} else {
			assert(false);
			return null;
		}
	}
	
	private void removeDiagnostics(org.eclipse.emf.ecore.EObject cause, java.util.List<org.eclipse.emf.ecore.resource.Resource.Diagnostic> diagnostics) {
		// remove all errors/warnings from this resource
		for (org.eclipse.emf.ecore.resource.Resource.Diagnostic errorCand : new org.eclipse.emf.common.util.BasicEList<org.eclipse.emf.ecore.resource.Resource.Diagnostic>(diagnostics)) {
			if (errorCand instanceof west.twouse.language.yuml.resource.yuml.IYumlTextDiagnostic) {
				if (((west.twouse.language.yuml.resource.yuml.IYumlTextDiagnostic) errorCand).wasCausedBy(cause)) {
					diagnostics.remove(errorCand);
				}
			}
		}
	}
	
	private void attachErrors(west.twouse.language.yuml.resource.yuml.IYumlReferenceResolveResult<?> result, org.eclipse.emf.ecore.EObject proxy) {
		// attach errors to this resource
		assert result != null;
		final String errorMessage = result.getErrorMessage();
		if (errorMessage == null) {
			assert(false);
		} else {
			addProblem(new west.twouse.language.yuml.resource.yuml.mopp.YumlProblem(errorMessage, west.twouse.language.yuml.resource.yuml.YumlEProblemType.ERROR), proxy);
		}
	}
	
	private void attachWarnings(west.twouse.language.yuml.resource.yuml.IYumlReferenceResolveResult<? extends org.eclipse.emf.ecore.EObject> result, org.eclipse.emf.ecore.EObject proxy) {
		assert result != null;
		assert result.wasResolved();
		if (result.wasResolved()) {
			for (west.twouse.language.yuml.resource.yuml.IYumlReferenceMapping<? extends org.eclipse.emf.ecore.EObject> mapping : result.getMappings()) {
				final String warningMessage = mapping.getWarning();
				if (warningMessage == null) {
					continue;
				}
				addProblem(new west.twouse.language.yuml.resource.yuml.mopp.YumlProblem(warningMessage, west.twouse.language.yuml.resource.yuml.YumlEProblemType.ERROR), proxy);
			}
		}
	}
	
	/**
	 * Extends the super implementation by clearing all information about element
	 * positions.
	 */
	protected void doUnload() {
		super.doUnload();
		clearState();
		loadOptions = null;
	}
	
	protected void runPostProcessors(java.util.Map<?, ?> loadOptions) {
		if (loadOptions == null) {
			return;
		}
		Object resourcePostProcessorProvider = loadOptions.get(west.twouse.language.yuml.resource.yuml.IYumlOptions.RESOURCE_POSTPROCESSOR_PROVIDER);
		if (resourcePostProcessorProvider != null) {
			if (resourcePostProcessorProvider instanceof west.twouse.language.yuml.resource.yuml.IYumlResourcePostProcessorProvider) {
				((west.twouse.language.yuml.resource.yuml.IYumlResourcePostProcessorProvider) resourcePostProcessorProvider).getResourcePostProcessor().process(this);
			} else if (resourcePostProcessorProvider instanceof java.util.Collection<?>) {
				java.util.Collection<?> resourcePostProcessorProviderCollection = (java.util.Collection<?>) resourcePostProcessorProvider;
				for (Object processorProvider : resourcePostProcessorProviderCollection) {
					if (processorProvider instanceof west.twouse.language.yuml.resource.yuml.IYumlResourcePostProcessorProvider) {
						west.twouse.language.yuml.resource.yuml.IYumlResourcePostProcessorProvider csProcessorProvider = (west.twouse.language.yuml.resource.yuml.IYumlResourcePostProcessorProvider) processorProvider;
						west.twouse.language.yuml.resource.yuml.IYumlResourcePostProcessor postProcessor = csProcessorProvider.getResourcePostProcessor();
						try {
							postProcessor.process(this);
						} catch (Exception e) {
							west.twouse.language.yuml.resource.yuml.mopp.YumlPlugin.logError("Exception while running a post-processor.", e);
						}
					}
				}
			}
		}
	}
	
	public void load(java.util.Map<?, ?> options) throws java.io.IOException {
		java.util.Map<Object, Object> loadOptions = addDefaultLoadOptions(options);
		super.load(loadOptions);
		org.eclipse.emf.ecore.util.EcoreUtil.resolveAll(this);
	}
	
	public void setURI(org.eclipse.emf.common.util.URI uri) {
		// because of the context dependent proxy resolving it is essential to resolve all
		// proxies before the URI is changed which can cause loss of object identities
		org.eclipse.emf.ecore.util.EcoreUtil.resolveAll(this);
		super.setURI(uri);
	}
	
	public west.twouse.language.yuml.resource.yuml.IYumlLocationMap getLocationMap() {
		return locationMap;
	}
	
	public void addProblem(west.twouse.language.yuml.resource.yuml.IYumlProblem problem, org.eclipse.emf.ecore.EObject element) {
		ElementBasedTextDiagnostic diagnostic = new ElementBasedTextDiagnostic(locationMap, getURI(), problem, element);
		getDiagnostics(problem.getType()).add(diagnostic);
		if (isMarkerCreationEnabled()) {
			west.twouse.language.yuml.resource.yuml.mopp.YumlMarkerHelper.mark(this, diagnostic);
		}
		java.util.Collection<west.twouse.language.yuml.resource.yuml.IYumlQuickFix> quickFixes = problem.getQuickFixes();
		if (quickFixes != null) {
			for (west.twouse.language.yuml.resource.yuml.IYumlQuickFix quickFix : quickFixes) {
				if (quickFix != null) {
					quickFixMap.put(quickFix.getContextAsString(), quickFix);
				}
			}
		}
	}
	
	public void addProblem(west.twouse.language.yuml.resource.yuml.IYumlProblem problem, int column, int line, int charStart, int charEnd) {
		PositionBasedTextDiagnostic diagnostic = new PositionBasedTextDiagnostic(getURI(), problem, column, line, charStart, charEnd);
		getDiagnostics(problem.getType()).add(diagnostic);
		if (isMarkerCreationEnabled()) {
			west.twouse.language.yuml.resource.yuml.mopp.YumlMarkerHelper.mark(this, diagnostic);
		}
	}
	
	public void addError(String message, org.eclipse.emf.ecore.EObject cause) {
		addProblem(new west.twouse.language.yuml.resource.yuml.mopp.YumlProblem(message, west.twouse.language.yuml.resource.yuml.YumlEProblemType.ERROR), cause);
	}
	
	public void addWarning(String message, org.eclipse.emf.ecore.EObject cause) {
		addProblem(new west.twouse.language.yuml.resource.yuml.mopp.YumlProblem(message, west.twouse.language.yuml.resource.yuml.YumlEProblemType.WARNING), cause);
	}
	
	private java.util.List<org.eclipse.emf.ecore.resource.Resource.Diagnostic> getDiagnostics(west.twouse.language.yuml.resource.yuml.YumlEProblemType type) {
		if (type == west.twouse.language.yuml.resource.yuml.YumlEProblemType.ERROR) {
			return getErrors();
		} else {
			return getWarnings();
		}
	}
	
	protected java.util.Map<Object, Object> addDefaultLoadOptions(java.util.Map<?, ?> loadOptions) {
		java.util.Map<Object, Object> loadOptionsCopy = west.twouse.language.yuml.resource.yuml.util.YumlMapUtil.copySafelyToObjectToObjectMap(loadOptions);
		if (org.eclipse.core.runtime.Platform.isRunning()) {
			// find default load option providers
			org.eclipse.core.runtime.IExtensionRegistry extensionRegistry = org.eclipse.core.runtime.Platform.getExtensionRegistry();
			org.eclipse.core.runtime.IConfigurationElement configurationElements[] = extensionRegistry.getConfigurationElementsFor(west.twouse.language.yuml.resource.yuml.mopp.YumlPlugin.EP_DEFAULT_LOAD_OPTIONS_ID);
			for (org.eclipse.core.runtime.IConfigurationElement element : configurationElements) {
				try {
					west.twouse.language.yuml.resource.yuml.IYumlOptionProvider provider = (west.twouse.language.yuml.resource.yuml.IYumlOptionProvider) element.createExecutableExtension("class");
					final java.util.Map<?, ?> options = provider.getOptions();
					final java.util.Collection<?> keys = options.keySet();
					for (Object key : keys) {
						addLoadOption(loadOptionsCopy, key, options.get(key));
					}
				} catch (org.eclipse.core.runtime.CoreException ce) {
					west.twouse.language.yuml.resource.yuml.mopp.YumlPlugin.logError("Exception while getting default options.", ce);
				}
			}
		}
		return loadOptionsCopy;
	}
	
	/**
	 * Adds a new key,value pair to the list of options. If there is already an option
	 * with the same key, the two values are collected in a list.
	 */
	private void addLoadOption(java.util.Map<Object, Object> options,Object key, Object value) {
		// check if there is already an option set
		if (options.containsKey(key)) {
			Object currentValue = options.get(key);
			if (currentValue instanceof java.util.List<?>) {
				// if the current value is a list, we add the new value to this list
				java.util.List<?> currentValueAsList = (java.util.List<?>) currentValue;
				java.util.List<Object> currentValueAsObjectList = west.twouse.language.yuml.resource.yuml.util.YumlListUtil.copySafelyToObjectList(currentValueAsList);
				if (value instanceof java.util.Collection<?>) {
					currentValueAsObjectList.addAll((java.util.Collection<?>) value);
				} else {
					currentValueAsObjectList.add(value);
				}
				options.put(key, currentValueAsObjectList);
			} else {
				// if the current value is not a list, we create a fresh list and add both the old
				// (current) and the new value to this list
				java.util.List<Object> newValueList = new java.util.ArrayList<Object>();
				newValueList.add(currentValue);
				if (value instanceof java.util.Collection<?>) {
					newValueList.addAll((java.util.Collection<?>) value);
				} else {
					newValueList.add(value);
				}
				options.put(key, newValueList);
			}
		} else {
			options.put(key, value);
		}
	}
	
	/**
	 * Extends the super implementation by clearing all information about element
	 * positions.
	 */
	protected void clearState() {
		// clear concrete syntax information
		resetLocationMap();
		internalURIFragmentMap.clear();
		getErrors().clear();
		getWarnings().clear();
		if (isMarkerCreationEnabled()) {
			west.twouse.language.yuml.resource.yuml.mopp.YumlMarkerHelper.unmark(this);
		}
		proxyCounter = 0;
		resolverSwitch = null;
	}
	
	public org.eclipse.emf.common.util.EList<org.eclipse.emf.ecore.EObject> getContents() {
		return new west.twouse.language.yuml.resource.yuml.util.YumlCopiedEObjectInternalEList((org.eclipse.emf.ecore.util.InternalEList<org.eclipse.emf.ecore.EObject>) super.getContents());
	}
	
	public org.eclipse.emf.common.util.EList<org.eclipse.emf.ecore.resource.Resource.Diagnostic> getWarnings() {
		return new west.twouse.language.yuml.resource.yuml.util.YumlCopiedEList<org.eclipse.emf.ecore.resource.Resource.Diagnostic>(super.getWarnings());
	}
	
	public org.eclipse.emf.common.util.EList<org.eclipse.emf.ecore.resource.Resource.Diagnostic> getErrors() {
		return new west.twouse.language.yuml.resource.yuml.util.YumlCopiedEList<org.eclipse.emf.ecore.resource.Resource.Diagnostic>(super.getErrors());
	}
	
	@SuppressWarnings("restriction")	
	private void runValidators(org.eclipse.emf.ecore.EObject root) {
		// checking constraints provided by EMF validator classes was disabled
		
		// check EMF validation constraints
		// EMF validation does not work if OSGi is not running
		// The EMF validation framework code throws a NPE if the validation plug-in is not
		// loaded. This is a bug, which is fixed in the Helios release. Nonetheless, we
		// need to catch the exception here.
		if (org.eclipse.core.runtime.Platform.isRunning()) {
			// The EMF validation framework code throws a NPE if the validation plug-in is not
			// loaded. This is a workaround for bug 322079.
			if (org.eclipse.emf.validation.internal.EMFModelValidationPlugin.getPlugin() != null) {
				try {
					org.eclipse.emf.validation.service.ModelValidationService service = org.eclipse.emf.validation.service.ModelValidationService.getInstance();
					org.eclipse.emf.validation.service.IBatchValidator validator = (org.eclipse.emf.validation.service.IBatchValidator) service.newValidator(org.eclipse.emf.validation.model.EvaluationMode.BATCH);
					validator.setIncludeLiveConstraints(true);
					org.eclipse.core.runtime.IStatus status = validator.validate(root);
					addStatus(status, root);
				} catch (Throwable t) {
					west.twouse.language.yuml.resource.yuml.mopp.YumlPlugin.logError("Exception while checking contraints provided by EMF validator classes.", t);
				}
			}
		}
	}
	
	private void addStatus(org.eclipse.core.runtime.IStatus status, org.eclipse.emf.ecore.EObject root) {
		java.util.List<org.eclipse.emf.ecore.EObject> causes = new java.util.ArrayList<org.eclipse.emf.ecore.EObject>();
		causes.add(root);
		if (status instanceof org.eclipse.emf.validation.model.ConstraintStatus) {
			org.eclipse.emf.validation.model.ConstraintStatus constraintStatus = (org.eclipse.emf.validation.model.ConstraintStatus) status;
			java.util.Set<org.eclipse.emf.ecore.EObject> resultLocus = constraintStatus.getResultLocus();
			causes.clear();
			causes.addAll(resultLocus);
		}
		if (status.getSeverity() == org.eclipse.core.runtime.IStatus.ERROR) {
			for (org.eclipse.emf.ecore.EObject cause : causes) {
				addError(status.getMessage(), cause);
			}
		}
		if (status.getSeverity() == org.eclipse.core.runtime.IStatus.WARNING) {
			for (org.eclipse.emf.ecore.EObject cause : causes) {
				addWarning(status.getMessage(), cause);
			}
		}
		for (org.eclipse.core.runtime.IStatus child : status.getChildren()) {
			addStatus(child, root);
		}
	}
	
	public west.twouse.language.yuml.resource.yuml.IYumlQuickFix getQuickFix(String quickFixContext) {
		return quickFixMap.get(quickFixContext);
	}
	
	public boolean isMarkerCreationEnabled() {
		if (loadOptions == null) {
			return true;
		}
		return !loadOptions.containsKey(west.twouse.language.yuml.resource.yuml.IYumlOptions.DISABLE_CREATING_MARKERS_FOR_PROBLEMS);
	}
}
