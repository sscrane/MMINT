/**
 * Copyright (c) 2013 Marsha Chechik, Alessio Di Sandro, Michalis Famelis,
 * Rick Salay.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *    Alessio Di Sandro - Implementation.
 */
package edu.toronto.cs.se.modelepedia.operator.reasoning;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.eclipse.acceleo.common.preference.AcceleoPreferences;
import org.eclipse.acceleo.engine.event.AcceleoTextGenerationEvent;
import org.eclipse.acceleo.engine.event.IAcceleoTextGenerationListener;
import org.eclipse.emf.common.util.BasicMonitor;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

import edu.toronto.cs.se.mmtf.mavo.library.EcoreMAVOToSMTLIB_M2T;
import edu.toronto.cs.se.mmtf.mid.Model;
import edu.toronto.cs.se.mmtf.mid.library.MultiModelTypeIntrospection;
import edu.toronto.cs.se.mmtf.mid.library.MultiModelUtils;
import edu.toronto.cs.se.mmtf.mid.operator.impl.OperatorExecutableImpl;

public class EcoreMAVOToSMTLIB extends OperatorExecutableImpl {

	public class EcoreMAVOToSMTLIBWithListeners_M2T extends EcoreMAVOToSMTLIB_M2T {

		public class EcoreMAVOToSMTLIBListener implements IAcceleoTextGenerationListener {

			private StringBuilder textGeneration;

			public EcoreMAVOToSMTLIBListener() {
				textGeneration = new StringBuilder();
			}

			@Override
			public void textGenerated(AcceleoTextGenerationEvent event) {
				textGeneration.append(event.getText());
			}

			@Override
			public void filePathComputed(AcceleoTextGenerationEvent event) {
			}

			@Override
			public void fileGenerated(AcceleoTextGenerationEvent event) {
				smtEncoding = textGeneration.toString();
			}

			@Override
			public void generationEnd(AcceleoTextGenerationEvent event) {
			}

			@Override
			public boolean listensToGenerationEnd() {
				return false;
			}
			
		}

		public EcoreMAVOToSMTLIBWithListeners_M2T(EObject model, File targetFolder, List<? extends Object> arguments) throws IOException {

			super(model, targetFolder, arguments);
	    }

		@Override
	    public List<IAcceleoTextGenerationListener> getGenerationListeners() {

			List<IAcceleoTextGenerationListener> listeners = new ArrayList<IAcceleoTextGenerationListener>();
			listeners.add(new EcoreMAVOToSMTLIBListener());

			return listeners;
		}
	}

	private String smtEncoding;

	public String getSMTEncoding() {

		return smtEncoding;
	}

	@Override
	public EList<Model> execute(EList<Model> actualParameters) throws Exception {

		Model mavoModel = actualParameters.get(0);

		List<Object> m2tArgs = new ArrayList<Object>();
		m2tArgs.add(mavoModel.getName());
		File folder = (new File(MultiModelUtils.prependWorkspaceToUri(mavoModel.getUri()))).getParentFile();
		AcceleoPreferences.switchForceDeactivationNotifications(true);
		AcceleoPreferences.switchNotifications(false);
		EcoreMAVOToSMTLIB_M2T m2t = new EcoreMAVOToSMTLIBWithListeners_M2T(MultiModelTypeIntrospection.getRoot(mavoModel), folder, m2tArgs);
		m2t.doGenerate(new BasicMonitor());

		return actualParameters;
	}

}