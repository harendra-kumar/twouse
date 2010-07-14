/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package west.twouse.language.sparqlas.resource.sparqlas.mopp;

public class SparqlasResource extends org.eclipse.emf.ecore.resource.impl.ResourceImpl implements west.twouse.language.sparqlas.resource.sparqlas.ISparqlasTextResource {
	
	public class ElementBasedTextDiagnostic implements west.twouse.language.sparqlas.resource.sparqlas.ISparqlasTextDiagnostic {
		
		private final west.twouse.language.sparqlas.resource.sparqlas.ISparqlasLocationMap locationMap;
		private final org.eclipse.emf.common.util.URI uri;
		private final org.eclipse.emf.ecore.EObject element;
		private final west.twouse.language.sparqlas.resource.sparqlas.ISparqlasProblem problem;
		
		public ElementBasedTextDiagnostic(west.twouse.language.sparqlas.resource.sparqlas.ISparqlasLocationMap locationMap, org.eclipse.emf.common.util.URI uri, west.twouse.language.sparqlas.resource.sparqlas.ISparqlasProblem problem, org.eclipse.emf.ecore.EObject element) {
			super();
			this.uri = uri;
			this.locationMap = locationMap;
			this.element = element;
			this.problem = problem;
		}
		
		public java.lang.String getMessage() {
			return problem.getMessage();
		}
		
		public west.twouse.language.sparqlas.resource.sparqlas.ISparqlasProblem getProblem() {
			return problem;
		}
		
		public java.lang.String getLocation() {
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
	}
	
	public class PositionBasedTextDiagnostic implements west.twouse.language.sparqlas.resource.sparqlas.ISparqlasTextDiagnostic {
		
		private final org.eclipse.emf.common.util.URI uri;
		
		private int column;
		private int line;
		private int charStart;
		private int charEnd;
		private west.twouse.language.sparqlas.resource.sparqlas.ISparqlasProblem problem;
		
		public PositionBasedTextDiagnostic(org.eclipse.emf.common.util.URI uri, west.twouse.language.sparqlas.resource.sparqlas.ISparqlasProblem problem, int column, int line, int charStart, int charEnd) {
			
			super();
			this.uri = uri;
			this.column = column;
			this.line = line;
			this.charStart = charStart;
			this.charEnd = charEnd;
			this.problem = problem;
		}
		
		public west.twouse.language.sparqlas.resource.sparqlas.ISparqlasProblem getProblem() {
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
		
		public java.lang.String getLocation() {
			return uri.toString();
		}
		
		public java.lang.String getMessage() {
			return problem.getMessage();
		}
		
		public boolean wasCausedBy(org.eclipse.emf.ecore.EObject element) {
			return false;
		}
	}
	
	private west.twouse.language.sparqlas.resource.sparqlas.ISparqlasReferenceResolverSwitch resolverSwitch;
	private west.twouse.language.sparqlas.resource.sparqlas.ISparqlasLocationMap locationMap;
	private int proxyCounter = 0;
	private west.twouse.language.sparqlas.resource.sparqlas.ISparqlasTextParser parser;
	private java.util.Map<java.lang.String, west.twouse.language.sparqlas.resource.sparqlas.ISparqlasContextDependentURIFragment<? extends org.eclipse.emf.ecore.EObject>> internalURIFragmentMap = new java.util.LinkedHashMap<java.lang.String, west.twouse.language.sparqlas.resource.sparqlas.ISparqlasContextDependentURIFragment<? extends org.eclipse.emf.ecore.EObject>>();
	
	public SparqlasResource() {
		super();
		resetLocationMap();
	}
	
	public SparqlasResource(org.eclipse.emf.common.util.URI uri) {
		super(uri);
		resetLocationMap();
	}
	
	protected void doLoad(java.io.InputStream inputStream, java.util.Map<?,?> options) throws java.io.IOException {
		java.lang.String encoding = null;
		java.io.InputStream actualInputStream = inputStream;
		java.lang.Object inputStreamPreProcessorProvider = null;
		if (options!=null) {
			inputStreamPreProcessorProvider = options.get(west.twouse.language.sparqlas.resource.sparqlas.ISparqlasOptions.INPUT_STREAM_PREPROCESSOR_PROVIDER);
		}
		if (inputStreamPreProcessorProvider != null) {
			if (inputStreamPreProcessorProvider instanceof west.twouse.language.sparqlas.resource.sparqlas.ISparqlasInputStreamProcessorProvider) {
				west.twouse.language.sparqlas.resource.sparqlas.ISparqlasInputStreamProcessorProvider provider = (west.twouse.language.sparqlas.resource.sparqlas.ISparqlasInputStreamProcessorProvider) inputStreamPreProcessorProvider;
				west.twouse.language.sparqlas.resource.sparqlas.mopp.SparqlasInputStreamProcessor processor = provider.getInputStreamProcessor(inputStream);
				actualInputStream = processor;
				encoding = processor.getOutputEncoding();
			}
		}
		
		parser = getMetaInformation().createParser(actualInputStream, encoding);
		parser.setOptions(options);
		west.twouse.language.sparqlas.resource.sparqlas.ISparqlasReferenceResolverSwitch referenceResolverSwitch = getReferenceResolverSwitch();
		referenceResolverSwitch.setOptions(options);
		west.twouse.language.sparqlas.resource.sparqlas.ISparqlasParseResult result = parser.parse();
		clearState();
		getContents().clear();
		org.eclipse.emf.ecore.EObject root = null;
		if (result != null) {
			root = result.getRoot();
			if (root != null) {
				getContents().add(root);
			}
			java.util.Collection<west.twouse.language.sparqlas.resource.sparqlas.ISparqlasCommand<west.twouse.language.sparqlas.resource.sparqlas.ISparqlasTextResource>> commands = result.getPostParseCommands();
			if (commands != null) {
				for (west.twouse.language.sparqlas.resource.sparqlas.ISparqlasCommand<west.twouse.language.sparqlas.resource.sparqlas.ISparqlasTextResource>  command : commands) {
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
	}
	
	public void reload(java.io.InputStream inputStream, java.util.Map<?,?> options) throws java.io.IOException {
		try {
			isLoaded = false;
			java.util.Map<java.lang.Object, java.lang.Object> loadOptions = addDefaultLoadOptions(options);
			doLoad(inputStream, loadOptions);
		} catch (west.twouse.language.sparqlas.resource.sparqlas.mopp.SparqlasTerminateParsingException tpe) {
			// do nothing - the resource is left unchanged if this exception is thrown
		}
		isLoaded = true;
	}
	
	public void cancelReload() {
		west.twouse.language.sparqlas.resource.sparqlas.ISparqlasTextParser parserCopy = parser;
		parserCopy.terminate();
	}
	
	protected void doSave(java.io.OutputStream outputStream, java.util.Map<?,?> options) throws java.io.IOException {
		west.twouse.language.sparqlas.resource.sparqlas.ISparqlasTextPrinter printer = getMetaInformation().createPrinter(outputStream, this);
		west.twouse.language.sparqlas.resource.sparqlas.ISparqlasReferenceResolverSwitch referenceResolverSwitch = getReferenceResolverSwitch();
		referenceResolverSwitch.setOptions(options);
		for(org.eclipse.emf.ecore.EObject root : getContents()) {
			printer.print(root);
		}
	}
	
	protected String getSyntaxName() {
		return "sparqlas";
	}
	
	public west.twouse.language.sparqlas.resource.sparqlas.ISparqlasReferenceResolverSwitch getReferenceResolverSwitch() {
		if (resolverSwitch == null) {
			resolverSwitch = new west.twouse.language.sparqlas.resource.sparqlas.mopp.SparqlasReferenceResolverSwitch();
		}
		return resolverSwitch;
	}
	
	public west.twouse.language.sparqlas.resource.sparqlas.mopp.SparqlasMetaInformation getMetaInformation() {
		return new west.twouse.language.sparqlas.resource.sparqlas.mopp.SparqlasMetaInformation();
	}
	
	protected void resetLocationMap() {
		locationMap = new west.twouse.language.sparqlas.resource.sparqlas.mopp.SparqlasLocationMap();
	}
	
	public void addURIFragment(java.lang.String internalURIFragment, west.twouse.language.sparqlas.resource.sparqlas.ISparqlasContextDependentURIFragment<? extends org.eclipse.emf.ecore.EObject> uriFragment) {
		internalURIFragmentMap.put(internalURIFragment, uriFragment);
	}
	
	public <ContainerType extends org.eclipse.emf.ecore.EObject, ReferenceType extends org.eclipse.emf.ecore.EObject> void registerContextDependentProxy(west.twouse.language.sparqlas.resource.sparqlas.ISparqlasContextDependentURIFragmentFactory<ContainerType, ReferenceType> factory, ContainerType container, org.eclipse.emf.ecore.EReference reference, java.lang.String id, org.eclipse.emf.ecore.EObject proxyElement) {
		int pos = -1;
		if (reference.isMany()) {
			pos = ((java.util.List<?>)container.eGet(reference)).size();
		}
		org.eclipse.emf.ecore.InternalEObject proxy = (org.eclipse.emf.ecore.InternalEObject) proxyElement;
		java.lang.String internalURIFragment = west.twouse.language.sparqlas.resource.sparqlas.ISparqlasContextDependentURIFragment.INTERNAL_URI_FRAGMENT_PREFIX + (proxyCounter++) + "_" + id;
		west.twouse.language.sparqlas.resource.sparqlas.ISparqlasContextDependentURIFragment<?> uriFragment = factory.create(id, container, reference, pos, proxy);
		proxy.eSetProxyURI(getURI().appendFragment(internalURIFragment));
		addURIFragment(internalURIFragment, uriFragment);
	}
	
	public org.eclipse.emf.ecore.EObject getEObject(String id) {
		if (internalURIFragmentMap.containsKey(id)) {
			west.twouse.language.sparqlas.resource.sparqlas.ISparqlasContextDependentURIFragment<? extends org.eclipse.emf.ecore.EObject> uriFragment = internalURIFragmentMap.get(id);
			boolean wasResolvedBefore = uriFragment.isResolved();
			west.twouse.language.sparqlas.resource.sparqlas.ISparqlasReferenceResolveResult<? extends org.eclipse.emf.ecore.EObject> result = uriFragment.resolve();
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
				west.twouse.language.sparqlas.resource.sparqlas.ISparqlasReferenceMapping<? extends org.eclipse.emf.ecore.EObject> mapping = result.getMappings().iterator().next();
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
			if (adapter instanceof west.twouse.language.sparqlas.resource.sparqlas.mopp.SparqlasLayoutInformationAdapter) {
				west.twouse.language.sparqlas.resource.sparqlas.mopp.SparqlasLayoutInformationAdapter layoutInformationAdapter = (west.twouse.language.sparqlas.resource.sparqlas.mopp.SparqlasLayoutInformationAdapter) adapter;
				layoutInformationAdapter.replaceProxy(proxy, target);
			}
		}
	}
	
	private org.eclipse.emf.ecore.EObject getResultElement(west.twouse.language.sparqlas.resource.sparqlas.ISparqlasContextDependentURIFragment<? extends org.eclipse.emf.ecore.EObject> uriFragment, west.twouse.language.sparqlas.resource.sparqlas.ISparqlasReferenceMapping<? extends org.eclipse.emf.ecore.EObject> mapping, org.eclipse.emf.ecore.EObject proxy, final java.lang.String errorMessage) {
		if (mapping instanceof west.twouse.language.sparqlas.resource.sparqlas.ISparqlasURIMapping<?>) {
			org.eclipse.emf.common.util.URI uri = ((west.twouse.language.sparqlas.resource.sparqlas.ISparqlasURIMapping<? extends org.eclipse.emf.ecore.EObject>)mapping).getTargetIdentifier();
			if (uri != null) {
				org.eclipse.emf.ecore.EObject result = null;
				try {
					result = this.getResourceSet().getEObject(uri, true);
				} catch (java.lang.Exception e) {
					// we can catch exceptions here, because EMF will try to resolve again and handle
					// the exception
				}
				if (result == null || result.eIsProxy()) {
					// unable to resolve: attach error
					if (errorMessage == null) {
						assert(false);
					} else {
						addProblem(new west.twouse.language.sparqlas.resource.sparqlas.mopp.SparqlasProblem(errorMessage, west.twouse.language.sparqlas.resource.sparqlas.SparqlasEProblemType.ERROR), proxy);
					}
				}
				return result;
			}
			return null;
		} else if (mapping instanceof west.twouse.language.sparqlas.resource.sparqlas.ISparqlasElementMapping<?>) {
			org.eclipse.emf.ecore.EObject element = ((west.twouse.language.sparqlas.resource.sparqlas.ISparqlasElementMapping<? extends org.eclipse.emf.ecore.EObject>)mapping).getTargetElement();
			org.eclipse.emf.ecore.EReference reference = uriFragment.getReference();
			org.eclipse.emf.ecore.EReference oppositeReference = uriFragment.getReference().getEOpposite();
			if (!uriFragment.getReference().isContainment() && oppositeReference != null) {
				if (reference.isMany()) {
					org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList.ManyInverse<org.eclipse.emf.ecore.EObject> list = west.twouse.language.sparqlas.resource.sparqlas.util.SparqlasCastUtil.cast(element.eGet(oppositeReference, false));										// avoids duplicate entries in the reference caused by adding to the
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
	
	private void removeDiagnostics(org.eclipse.emf.ecore.EObject proxy, java.util.List<org.eclipse.emf.ecore.resource.Resource.Diagnostic> diagnostics) {
		// remove all errors/warnings this resource
		for (org.eclipse.emf.ecore.resource.Resource.Diagnostic errorCand : new org.eclipse.emf.common.util.BasicEList<org.eclipse.emf.ecore.resource.Resource.Diagnostic>(diagnostics)) {
			if (errorCand instanceof west.twouse.language.sparqlas.resource.sparqlas.ISparqlasTextDiagnostic) {
				if (((west.twouse.language.sparqlas.resource.sparqlas.ISparqlasTextDiagnostic) errorCand).wasCausedBy(proxy)) {
					diagnostics.remove(errorCand);
				}
			}
		}
	}
	
	private void attachErrors(west.twouse.language.sparqlas.resource.sparqlas.ISparqlasReferenceResolveResult<?> result, org.eclipse.emf.ecore.EObject proxy) {
		// attach errors to this resource
		assert result != null;
		final java.lang.String errorMessage = result.getErrorMessage();
		if (errorMessage == null) {
			assert(false);
		} else {
			addProblem(new west.twouse.language.sparqlas.resource.sparqlas.mopp.SparqlasProblem(errorMessage, west.twouse.language.sparqlas.resource.sparqlas.SparqlasEProblemType.ERROR), proxy);
		}
	}
	
	private void attachWarnings(west.twouse.language.sparqlas.resource.sparqlas.ISparqlasReferenceResolveResult<? extends org.eclipse.emf.ecore.EObject> result, org.eclipse.emf.ecore.EObject proxy) {
		assert result != null;
		assert result.wasResolved();
		if (result.wasResolved()) {
			for (west.twouse.language.sparqlas.resource.sparqlas.ISparqlasReferenceMapping<? extends org.eclipse.emf.ecore.EObject> mapping : result.getMappings()) {
				final java.lang.String warningMessage = mapping.getWarning();
				if (warningMessage == null) {
					continue;
				}
				addProblem(new west.twouse.language.sparqlas.resource.sparqlas.mopp.SparqlasProblem(warningMessage, west.twouse.language.sparqlas.resource.sparqlas.SparqlasEProblemType.ERROR), proxy);
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
	}
	
	protected void runPostProcessors(java.util.Map<?, ?> loadOptions) {
		if (loadOptions == null) {
			return;
		}
		java.lang.Object resourcePostProcessorProvider = loadOptions.get(west.twouse.language.sparqlas.resource.sparqlas.ISparqlasOptions.RESOURCE_POSTPROCESSOR_PROVIDER);
		if (resourcePostProcessorProvider != null) {
			if (resourcePostProcessorProvider instanceof west.twouse.language.sparqlas.resource.sparqlas.ISparqlasResourcePostProcessorProvider) {
				((west.twouse.language.sparqlas.resource.sparqlas.ISparqlasResourcePostProcessorProvider) resourcePostProcessorProvider).getResourcePostProcessor().process(this);
			} else if (resourcePostProcessorProvider instanceof java.util.Collection<?>) {
				java.util.Collection<?> resourcePostProcessorProviderCollection = (java.util.Collection<?>) resourcePostProcessorProvider;
				for (Object processorProvider : resourcePostProcessorProviderCollection) {
					if (processorProvider instanceof west.twouse.language.sparqlas.resource.sparqlas.ISparqlasResourcePostProcessorProvider) {
						west.twouse.language.sparqlas.resource.sparqlas.ISparqlasResourcePostProcessorProvider csProcessorProvider = (west.twouse.language.sparqlas.resource.sparqlas.ISparqlasResourcePostProcessorProvider) processorProvider;
						west.twouse.language.sparqlas.resource.sparqlas.ISparqlasResourcePostProcessor postProcessor = csProcessorProvider.getResourcePostProcessor();
						try {
							postProcessor.process(this);
						} catch (java.lang.Exception e) {
							west.twouse.language.sparqlas.resource.sparqlas.mopp.SparqlasPlugin.logError("Exception while running a post-processor.", e);
						}
					}
				}
			}
		}
	}
	
	public void load(java.util.Map<?, ?> options) throws java.io.IOException {
		java.util.Map<java.lang.Object, java.lang.Object> loadOptions = addDefaultLoadOptions(options);
		super.load(loadOptions);
	}
	
	public void setURI(org.eclipse.emf.common.util.URI uri) {
		// because of the context dependent proxy resolving it is essential to resolve all
		// proxies before the URI is changed which can cause loss of object identities
		org.eclipse.emf.ecore.util.EcoreUtil.resolveAll(this);
		super.setURI(uri);
	}
	
	public west.twouse.language.sparqlas.resource.sparqlas.ISparqlasLocationMap getLocationMap() {
		return locationMap;
	}
	
	public void addProblem(west.twouse.language.sparqlas.resource.sparqlas.ISparqlasProblem problem, org.eclipse.emf.ecore.EObject element) {
		getDiagnostics(problem.getType()).add(new ElementBasedTextDiagnostic(locationMap, getURI(), problem, element));
	}
	
	public void addProblem(west.twouse.language.sparqlas.resource.sparqlas.ISparqlasProblem problem, int column, int line, int charStart, int charEnd) {
		getDiagnostics(problem.getType()).add(new PositionBasedTextDiagnostic(getURI(), problem, column, line, charStart, charEnd));
	}
	
	public void addError(java.lang.String message, org.eclipse.emf.ecore.EObject cause) {
		addProblem(new west.twouse.language.sparqlas.resource.sparqlas.mopp.SparqlasProblem(message, west.twouse.language.sparqlas.resource.sparqlas.SparqlasEProblemType.ERROR), cause);
	}
	
	public void addWarning(java.lang.String message, org.eclipse.emf.ecore.EObject cause) {
		addProblem(new west.twouse.language.sparqlas.resource.sparqlas.mopp.SparqlasProblem(message, west.twouse.language.sparqlas.resource.sparqlas.SparqlasEProblemType.WARNING), cause);
	}
	
	private java.util.List<org.eclipse.emf.ecore.resource.Resource.Diagnostic> getDiagnostics(west.twouse.language.sparqlas.resource.sparqlas.SparqlasEProblemType type) {
		if (type == west.twouse.language.sparqlas.resource.sparqlas.SparqlasEProblemType.ERROR) {
			return getErrors();
		} else {
			return getWarnings();
		}
	}
	
	protected java.util.Map<java.lang.Object, java.lang.Object> addDefaultLoadOptions(java.util.Map<?, ?> loadOptions) {
		java.util.Map<java.lang.Object, java.lang.Object> loadOptionsCopy = west.twouse.language.sparqlas.resource.sparqlas.util.SparqlasMapUtil.copySafelyToObjectToObjectMap(loadOptions);
		if (org.eclipse.core.runtime.Platform.isRunning()) {
			// find default load option providers
			org.eclipse.core.runtime.IExtensionRegistry extensionRegistry = org.eclipse.core.runtime.Platform.getExtensionRegistry();
			org.eclipse.core.runtime.IConfigurationElement configurationElements[] = extensionRegistry.getConfigurationElementsFor(west.twouse.language.sparqlas.resource.sparqlas.mopp.SparqlasPlugin.EP_DEFAULT_LOAD_OPTIONS_ID);
			for (org.eclipse.core.runtime.IConfigurationElement element : configurationElements) {
				try {
					west.twouse.language.sparqlas.resource.sparqlas.ISparqlasOptionProvider provider = (west.twouse.language.sparqlas.resource.sparqlas.ISparqlasOptionProvider) element.createExecutableExtension("class");
					final java.util.Map<?, ?> options = provider.getOptions();
					final java.util.Collection<?> keys = options.keySet();
					for (java.lang.Object key : keys) {
						addLoadOption(loadOptionsCopy, key, options.get(key));
					}
				} catch (org.eclipse.core.runtime.CoreException ce) {
					west.twouse.language.sparqlas.resource.sparqlas.mopp.SparqlasPlugin.logError("Exception while getting default options.", ce);
				}
			}
		}
		return loadOptionsCopy;
	}
	
	/**
	 * Adds a new key,value pair to the list of options. If there is already an option
	 * with the same key, the two values are collected in a list.
	 */
	private void addLoadOption(java.util.Map<java.lang.Object, java.lang.Object> options,java.lang.Object key, java.lang.Object value) {
		// check if there is already an option set
		if (options.containsKey(key)) {
			java.lang.Object currentValue = options.get(key);
			if (currentValue instanceof java.util.List<?>) {
				// if the current value is a list, we add the new value to this list
				java.util.List<?> currentValueAsList = (java.util.List<?>) currentValue;
				java.util.List<java.lang.Object> currentValueAsObjectList = west.twouse.language.sparqlas.resource.sparqlas.util.SparqlasListUtil.copySafelyToObjectList(currentValueAsList);
				if (value instanceof java.util.Collection<?>) {
					currentValueAsObjectList.addAll((java.util.Collection<?>) value);
				} else {
					currentValueAsObjectList.add(value);
				}
				options.put(key, currentValueAsObjectList);
			} else {
				// if the current value is not a list, we create a fresh list and add both the old
				// (current) and the new value to this list
				java.util.List<java.lang.Object> newValueList = new java.util.ArrayList<java.lang.Object>();
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
		proxyCounter = 0;
		resolverSwitch = null;
	}
	
	public org.eclipse.emf.common.util.EList<org.eclipse.emf.ecore.EObject> getContents() {
		return new west.twouse.language.sparqlas.resource.sparqlas.util.SparqlasCopiedEObjectInternalEList((org.eclipse.emf.ecore.util.InternalEList<org.eclipse.emf.ecore.EObject>) super.getContents());
	}
	
	public org.eclipse.emf.common.util.EList<org.eclipse.emf.ecore.resource.Resource.Diagnostic> getWarnings() {
		return new west.twouse.language.sparqlas.resource.sparqlas.util.SparqlasCopiedEList<org.eclipse.emf.ecore.resource.Resource.Diagnostic>(super.getWarnings());
	}
	
	public org.eclipse.emf.common.util.EList<org.eclipse.emf.ecore.resource.Resource.Diagnostic> getErrors() {
		return new west.twouse.language.sparqlas.resource.sparqlas.util.SparqlasCopiedEList<org.eclipse.emf.ecore.resource.Resource.Diagnostic>(super.getErrors());
	}
	
	private void runValidators(org.eclipse.emf.ecore.EObject root) {
		// checking constraints provided by EMF validator classes was disabled
		// check EMF validation constraints
		// EMF validation does not work if OSGi is not running
		if (org.eclipse.core.runtime.Platform.isRunning()) {
			// The EMF validation framework code throws a NPE if the validation plug-in is not
			// loaded. This is a bug, which is fixed in the helios release. Nonetheless, we
			// need to catch the exception here.
			try {
				org.eclipse.emf.validation.service.ModelValidationService service = org.eclipse.emf.validation.service.ModelValidationService.getInstance();
				org.eclipse.emf.validation.service.IBatchValidator validator = (org.eclipse.emf.validation.service.IBatchValidator) service.newValidator(org.eclipse.emf.validation.model.EvaluationMode.BATCH);
				validator.setIncludeLiveConstraints(true);
				org.eclipse.core.runtime.IStatus status = validator.validate(root);
				addStatus(status, root);
			} catch (java.lang.Throwable t) {
				west.twouse.language.sparqlas.resource.sparqlas.mopp.SparqlasPlugin.logError("Exception while checking contraints provided by EMF validator classes.", t);
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
	
}