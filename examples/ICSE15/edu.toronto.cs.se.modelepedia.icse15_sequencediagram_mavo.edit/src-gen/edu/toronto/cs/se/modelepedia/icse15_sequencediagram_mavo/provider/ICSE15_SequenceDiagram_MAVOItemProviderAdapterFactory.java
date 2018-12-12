/**
 * Copyright (c) 2012-2019 Marsha Chechik, Alessio Di Sandro, Michalis Famelis,
 * Rick Salay.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *    Alessio Di Sandro - Implementation.
 */
package edu.toronto.cs.se.modelepedia.icse15_sequencediagram_mavo.provider;

import edu.toronto.cs.se.modelepedia.icse15_sequencediagram_mavo.util.ICSE15_SequenceDiagram_MAVOAdapterFactory;

import java.util.ArrayList;
import java.util.Collection;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.edit.provider.ChangeNotifier;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.ComposedAdapterFactory;
import org.eclipse.emf.edit.provider.IChangeNotifier;
import org.eclipse.emf.edit.provider.IDisposable;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.INotifyChangedListener;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;

/**
 * This is the factory that is used to provide the interfaces needed to support Viewers.
 * The adapters generated by this factory convert EMF adapter notifications into calls to {@link #fireNotifyChanged fireNotifyChanged}.
 * The adapters also support Eclipse property sheets.
 * Note that most of the adapters are shared among multiple instances.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ICSE15_SequenceDiagram_MAVOItemProviderAdapterFactory extends ICSE15_SequenceDiagram_MAVOAdapterFactory implements ComposeableAdapterFactory, IChangeNotifier, IDisposable {
	/**
	 * This keeps track of the root adapter factory that delegates to this adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ComposedAdapterFactory parentAdapterFactory;

	/**
	 * This is used to implement {@link org.eclipse.emf.edit.provider.IChangeNotifier}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IChangeNotifier changeNotifier = new ChangeNotifier();

	/**
	 * This keeps track of all the supported types checked by {@link #isFactoryForType isFactoryForType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Collection<Object> supportedTypes = new ArrayList<Object>();

	/**
	 * This constructs an instance.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ICSE15_SequenceDiagram_MAVOItemProviderAdapterFactory() {
		supportedTypes.add(IEditingDomainItemProvider.class);
		supportedTypes.add(IStructuredItemContentProvider.class);
		supportedTypes.add(ITreeItemContentProvider.class);
		supportedTypes.add(IItemLabelProvider.class);
		supportedTypes.add(IItemPropertySource.class);
	}

	/**
	 * This keeps track of the one adapter used for all {@link edu.toronto.cs.se.modelepedia.icse15_sequencediagram_mavo.SequenceDiagram} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SequenceDiagramItemProvider sequenceDiagramItemProvider;

	/**
	 * This creates an adapter for a {@link edu.toronto.cs.se.modelepedia.icse15_sequencediagram_mavo.SequenceDiagram}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createSequenceDiagramAdapter() {
		if (sequenceDiagramItemProvider == null) {
			sequenceDiagramItemProvider = new SequenceDiagramItemProvider(this);
		}

		return sequenceDiagramItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link edu.toronto.cs.se.modelepedia.icse15_sequencediagram_mavo.NamedElement} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NamedElementItemProvider namedElementItemProvider;

	/**
	 * This creates an adapter for a {@link edu.toronto.cs.se.modelepedia.icse15_sequencediagram_mavo.NamedElement}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createNamedElementAdapter() {
		if (namedElementItemProvider == null) {
			namedElementItemProvider = new NamedElementItemProvider(this);
		}

		return namedElementItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link edu.toronto.cs.se.modelepedia.icse15_sequencediagram_mavo.Lifeline} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LifelineItemProvider lifelineItemProvider;

	/**
	 * This creates an adapter for a {@link edu.toronto.cs.se.modelepedia.icse15_sequencediagram_mavo.Lifeline}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createLifelineAdapter() {
		if (lifelineItemProvider == null) {
			lifelineItemProvider = new LifelineItemProvider(this);
		}

		return lifelineItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link edu.toronto.cs.se.modelepedia.icse15_sequencediagram_mavo.Class} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ClassItemProvider classItemProvider;

	/**
	 * This creates an adapter for a {@link edu.toronto.cs.se.modelepedia.icse15_sequencediagram_mavo.Class}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createClassAdapter() {
		if (classItemProvider == null) {
			classItemProvider = new ClassItemProvider(this);
		}

		return classItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link edu.toronto.cs.se.modelepedia.icse15_sequencediagram_mavo.Attribute} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AttributeItemProvider attributeItemProvider;

	/**
	 * This creates an adapter for a {@link edu.toronto.cs.se.modelepedia.icse15_sequencediagram_mavo.Attribute}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createAttributeAdapter() {
		if (attributeItemProvider == null) {
			attributeItemProvider = new AttributeItemProvider(this);
		}

		return attributeItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link edu.toronto.cs.se.modelepedia.icse15_sequencediagram_mavo.Operation} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OperationItemProvider operationItemProvider;

	/**
	 * This creates an adapter for a {@link edu.toronto.cs.se.modelepedia.icse15_sequencediagram_mavo.Operation}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createOperationAdapter() {
		if (operationItemProvider == null) {
			operationItemProvider = new OperationItemProvider(this);
		}

		return operationItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link edu.toronto.cs.se.modelepedia.icse15_sequencediagram_mavo.Message} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MessageItemProvider messageItemProvider;

	/**
	 * This creates an adapter for a {@link edu.toronto.cs.se.modelepedia.icse15_sequencediagram_mavo.Message}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createMessageAdapter() {
		if (messageItemProvider == null) {
			messageItemProvider = new MessageItemProvider(this);
		}

		return messageItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link edu.toronto.cs.se.modelepedia.icse15_sequencediagram_mavo.ClassReference} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ClassReferenceItemProvider classReferenceItemProvider;

	/**
	 * This creates an adapter for a {@link edu.toronto.cs.se.modelepedia.icse15_sequencediagram_mavo.ClassReference}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createClassReferenceAdapter() {
		if (classReferenceItemProvider == null) {
			classReferenceItemProvider = new ClassReferenceItemProvider(this);
		}

		return classReferenceItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link edu.toronto.cs.se.modelepedia.icse15_sequencediagram_mavo.AttributeReference} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AttributeReferenceItemProvider attributeReferenceItemProvider;

	/**
	 * This creates an adapter for a {@link edu.toronto.cs.se.modelepedia.icse15_sequencediagram_mavo.AttributeReference}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createAttributeReferenceAdapter() {
		if (attributeReferenceItemProvider == null) {
			attributeReferenceItemProvider = new AttributeReferenceItemProvider(this);
		}

		return attributeReferenceItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link edu.toronto.cs.se.modelepedia.icse15_sequencediagram_mavo.OperationReference} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OperationReferenceItemProvider operationReferenceItemProvider;

	/**
	 * This creates an adapter for a {@link edu.toronto.cs.se.modelepedia.icse15_sequencediagram_mavo.OperationReference}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createOperationReferenceAdapter() {
		if (operationReferenceItemProvider == null) {
			operationReferenceItemProvider = new OperationReferenceItemProvider(this);
		}

		return operationReferenceItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link edu.toronto.cs.se.modelepedia.icse15_sequencediagram_mavo.SourceLifelineReference} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SourceLifelineReferenceItemProvider sourceLifelineReferenceItemProvider;

	/**
	 * This creates an adapter for a {@link edu.toronto.cs.se.modelepedia.icse15_sequencediagram_mavo.SourceLifelineReference}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createSourceLifelineReferenceAdapter() {
		if (sourceLifelineReferenceItemProvider == null) {
			sourceLifelineReferenceItemProvider = new SourceLifelineReferenceItemProvider(this);
		}

		return sourceLifelineReferenceItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link edu.toronto.cs.se.modelepedia.icse15_sequencediagram_mavo.TargetLifelineReference} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TargetLifelineReferenceItemProvider targetLifelineReferenceItemProvider;

	/**
	 * This creates an adapter for a {@link edu.toronto.cs.se.modelepedia.icse15_sequencediagram_mavo.TargetLifelineReference}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createTargetLifelineReferenceAdapter() {
		if (targetLifelineReferenceItemProvider == null) {
			targetLifelineReferenceItemProvider = new TargetLifelineReferenceItemProvider(this);
		}

		return targetLifelineReferenceItemProvider;
	}

	/**
	 * This returns the root adapter factory that contains this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComposeableAdapterFactory getRootAdapterFactory() {
		return parentAdapterFactory == null ? this : parentAdapterFactory.getRootAdapterFactory();
	}

	/**
	 * This sets the composed adapter factory that contains this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParentAdapterFactory(ComposedAdapterFactory parentAdapterFactory) {
		this.parentAdapterFactory = parentAdapterFactory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object type) {
		return supportedTypes.contains(type) || super.isFactoryForType(type);
	}

	/**
	 * This implementation substitutes the factory itself as the key for the adapter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter adapt(Notifier notifier, Object type) {
		return super.adapt(notifier, this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object adapt(Object object, Object type) {
		if (isFactoryForType(type)) {
			Object adapter = super.adapt(object, type);
			if (!(type instanceof Class<?>) || (((Class<?>)type).isInstance(adapter))) {
				return adapter;
			}
		}

		return null;
	}

	/**
	 * This adds a listener.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void addListener(INotifyChangedListener notifyChangedListener) {
		changeNotifier.addListener(notifyChangedListener);
	}

	/**
	 * This removes a listener.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void removeListener(INotifyChangedListener notifyChangedListener) {
		changeNotifier.removeListener(notifyChangedListener);
	}

	/**
	 * This delegates to {@link #changeNotifier} and to {@link #parentAdapterFactory}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void fireNotifyChanged(Notification notification) {
		changeNotifier.fireNotifyChanged(notification);

		if (parentAdapterFactory != null) {
			parentAdapterFactory.fireNotifyChanged(notification);
		}
	}

	/**
	 * This disposes all of the item providers created by this factory. 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void dispose() {
		if (sequenceDiagramItemProvider != null) sequenceDiagramItemProvider.dispose();
		if (namedElementItemProvider != null) namedElementItemProvider.dispose();
		if (lifelineItemProvider != null) lifelineItemProvider.dispose();
		if (classItemProvider != null) classItemProvider.dispose();
		if (attributeItemProvider != null) attributeItemProvider.dispose();
		if (operationItemProvider != null) operationItemProvider.dispose();
		if (messageItemProvider != null) messageItemProvider.dispose();
		if (classReferenceItemProvider != null) classReferenceItemProvider.dispose();
		if (attributeReferenceItemProvider != null) attributeReferenceItemProvider.dispose();
		if (operationReferenceItemProvider != null) operationReferenceItemProvider.dispose();
		if (sourceLifelineReferenceItemProvider != null) sourceLifelineReferenceItemProvider.dispose();
		if (targetLifelineReferenceItemProvider != null) targetLifelineReferenceItemProvider.dispose();
	}

}
