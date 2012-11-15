/*
 * Copyright (c) 2012 Marsha Chechik, Alessio Di Sandro, Michalis Famelis,
 * Rick Salay, Vivien Suen.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *    Alessio Di Sandro - Implementation.
 */
package edu.toronto.cs.se.modelepedia.petrinet.operator;

import org.eclipse.emf.common.util.EList;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.PlatformUI;

import edu.toronto.cs.se.mmtf.mid.Model;
import edu.toronto.cs.se.mmtf.mid.operator.impl.OperatorExecutableImpl;
import edu.toronto.cs.se.mmtf.mid.trait.MultiModelTypeIntrospection;
import edu.toronto.cs.se.modelepedia.petrinet.PetriNet;

public class PetriNetSimulate extends OperatorExecutableImpl {

	@Override
	public EList<Model> execute(EList<Model> actualParameters) throws Exception {

		// simulate
		PetriNet petrinet = (PetriNet) MultiModelTypeIntrospection.getRoot(actualParameters.get(0));
		boolean goodResult = !petrinet.getNodes().isEmpty();

		// show result
		Shell shell = PlatformUI.getWorkbench().getActiveWorkbenchWindow().getShell();
		int dialogType = (goodResult) ? MessageDialog.INFORMATION : MessageDialog.ERROR;
		String dialogMessage = (goodResult) ? "Good simulation result" : "Bad simulation result";
		MessageDialog dialog = new MessageDialog(
			shell,
			"Simulation results",
			null,
			dialogMessage,
			dialogType,
			new String[] {"Ok"},
			0
		);
		dialog.open();

		return null;
	}

}
