/**
 * Copyright (c) 2012-2014 Marsha Chechik, Alessio Di Sandro, Michalis Famelis,
 * Rick Salay.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *    Alessio Di Sandro - Implementation.
 */
package edu.toronto.cs.se.modelepedia.kleisli;

import edu.toronto.cs.se.mmtf.MMTFException;

import edu.toronto.cs.se.mmtf.mid.Model;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Kleisli version, represents a hidden extended model. {@inheritDoc}
 * <!-- end-model-doc -->
 *
 *
 * @see edu.toronto.cs.se.modelepedia.kleisli.KleisliPackage#getKleisliModel()
 * @model
 * @generated
 */
public interface KleisliModel extends Model {
	/**
	 * <!-- begin-user-doc --> Creates a Kleisli model type.
	 * 
	 * @param containerModelTypeEndpoint
	 *            The Kleisli model type endpoint that will contain the new
	 *            Kleisli model type.
	 * @return The created Kleisli model type.
	 * @throws MMTFException
	 *             If this is a model instance, or if the extended metamodel
	 *             can't be created. <!-- end-user-doc -->
	 * @model required="true"
	 *        exceptions="edu.toronto.cs.se.mmtf.mid.MMTFException"
	 *        containerModelTypeEndpointRequired="true"
	 * @generated
	 */
	KleisliModel kleisliCreateType(KleisliModelEndpoint containerModelTypeEndpoint) throws MMTFException;

	/**
	 * <!-- begin-user-doc -->
	 * Kleisli version. {@inheritDoc}
	 * <!-- end-user-doc -->
	 * @model exceptions="edu.toronto.cs.se.mmtf.mid.MMTFException"
	 * @generated
	 */
	void deleteType() throws MMTFException;

	/**
	 * <!-- begin-user-doc -->
	 * Kleisli version. {@inheritDoc}
	 * <!-- end-user-doc -->
	 * @model kind="operation" required="true" exceptions="edu.toronto.cs.se.mmtf.mid.MMTFException"
	 * @generated
	 */
	EPackage getEMFTypeRoot() throws MMTFException;

	/**
	 * <!-- begin-user-doc --> Creates a Kleisli model instance.
	 * 
	 * @param containerModelEndpoint
	 *            The Kleisli model endpoint that will contain the new Kleisli
	 *            model.
	 * @return The created Kleisli model.
	 * @throws MMTFException
	 *             If this is a model instance. <!-- end-user-doc -->
	 * @model required="true"
	 *        exceptions="edu.toronto.cs.se.mmtf.mid.MMTFException"
	 *        containerModelEndpointRequired="true"
	 * @generated
	 */
	KleisliModel kleisliCreateInstance(KleisliModelEndpoint containerModelEndpoint) throws MMTFException;

	/**
	 * <!-- begin-user-doc -->
	 * Kleisli version. {@inheritDoc}
	 * <!-- end-user-doc -->
	 * @model exceptions="edu.toronto.cs.se.mmtf.mid.MMTFException"
	 * @generated
	 */
	void deleteInstance() throws MMTFException;

	/**
	 * <!-- begin-user-doc -->
	 * Kleisli version. {@inheritDoc}
	 * <!-- end-user-doc -->
	 * @model kind="operation" required="true" exceptions="edu.toronto.cs.se.mmtf.mid.MMTFException"
	 * @generated
	 */
	EObject getEMFRoot() throws MMTFException;

} // KleisliModel
