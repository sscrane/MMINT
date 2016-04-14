/*
 * Copyright (c) 2012-2015 Marsha Chechik, Alessio Di Sandro, Michalis Famelis,
 * Rick Salay.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *    Alessio Di Sandro - Implementation.
 */
package edu.toronto.cs.se.modelepedia.relationaldatabase_mavo.diagram.preferences;

import org.eclipse.core.runtime.preferences.AbstractPreferenceInitializer;
import org.eclipse.jface.preference.IPreferenceStore;

/**
 * @generated
 */
public class DiagramPreferenceInitializer extends AbstractPreferenceInitializer {

	/**
	* @generated
	*/
	public void initializeDefaultPreferences() {
		IPreferenceStore store = getPreferenceStore();
		edu.toronto.cs.se.modelepedia.relationaldatabase_mavo.diagram.preferences.DiagramGeneralPreferencePage
				.initDefaults(store);
		edu.toronto.cs.se.modelepedia.relationaldatabase_mavo.diagram.preferences.DiagramAppearancePreferencePage
				.initDefaults(store);
		edu.toronto.cs.se.modelepedia.relationaldatabase_mavo.diagram.preferences.DiagramConnectionsPreferencePage
				.initDefaults(store);
		edu.toronto.cs.se.modelepedia.relationaldatabase_mavo.diagram.preferences.DiagramPrintingPreferencePage
				.initDefaults(store);
		edu.toronto.cs.se.modelepedia.relationaldatabase_mavo.diagram.preferences.DiagramRulersAndGridPreferencePage
				.initDefaults(store);

	}

	/**
	* @generated
	*/
	protected IPreferenceStore getPreferenceStore() {
		return edu.toronto.cs.se.modelepedia.relationaldatabase_mavo.diagram.part.RelationalDatabase_MAVODiagramEditorPlugin
				.getInstance().getPreferenceStore();
	}
}
