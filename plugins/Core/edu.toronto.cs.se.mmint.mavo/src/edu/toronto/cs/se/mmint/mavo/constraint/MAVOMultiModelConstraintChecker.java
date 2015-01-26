/**
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
package edu.toronto.cs.se.mmint.mavo.constraint;

import org.eclipse.jdt.annotation.NonNull;
import org.eclipse.jdt.annotation.Nullable;

import edu.toronto.cs.se.mavo.MAVOCollection;
import edu.toronto.cs.se.mavo.MAVODecision;
import edu.toronto.cs.se.mavo.MAVOElement;
import edu.toronto.cs.se.mmint.MMINTException;
import edu.toronto.cs.se.mmint.mavo.reasoning.IMAVOReasoningEngine;
import edu.toronto.cs.se.mmint.mid.Model;
import edu.toronto.cs.se.mmint.mid.constraint.MultiModelConstraintChecker;
import edu.toronto.cs.se.mmint.mid.editor.Diagram;

public class MAVOMultiModelConstraintChecker {

	private static @NonNull IMAVOReasoningEngine getMAVOReasoner(@NonNull String constraintLanguage) throws MMINTException {

		//TODO MMINT[MAVO] Register reasoners as mavo reasoner
		return (IMAVOReasoningEngine) MultiModelConstraintChecker.getReasoner(constraintLanguage);
	}

	//TODO MMINT[REFINE] Should really throw an exception with errors instead of returning null
	public static @Nullable Model refineByMayAlternative(@NonNull Model model, @NonNull MAVOCollection mayAlternative) {

		IMAVOReasoningEngine reasoner;
		try {
			reasoner = getMAVOReasoner("SMTLIB");
		}
		catch (MMINTException e) {
			MMINTException.print(MMINTException.Type.WARNING, "Skipping refinement based on may alternative", e);
			return null;
		}

		return reasoner.refineByMayAlternative(model, mayAlternative);
	}

	//TODO MMINT[REFINE] Should really throw an exception with errors instead of returning null
	public static @Nullable Model refineByMayModelObject(@NonNull Model model, @NonNull MAVOElement mayModelObj) {

		IMAVOReasoningEngine reasoner;
		try {
			reasoner = getMAVOReasoner("SMTLIB");
		}
		catch (MMINTException e) {
			MMINTException.print(MMINTException.Type.WARNING, "Skipping refinement based on may model object", e);
			return null;
		}

		return reasoner.refineByMayModelObject(model, mayModelObj);
	}

	public static void highlightMAVODecision(@NonNull Diagram modelDiagram, @NonNull MAVODecision mavoDecision) {

		IMAVOReasoningEngine reasoner;
		try {
			reasoner = getMAVOReasoner("SMTLIB");
		}
		catch (MMINTException e) {
			MMINTException.print(MMINTException.Type.WARNING, "Skipping MAVO decision highlighting", e);
			return;
		}

		reasoner.highlightMAVODecision(modelDiagram, mavoDecision);
	}

	public static void highlightMAVOCollection(@NonNull Diagram modelDiagram, @NonNull MAVOCollection mavoCollection) {

		IMAVOReasoningEngine reasoner;
		try {
			reasoner = getMAVOReasoner("SMTLIB");
		}
		catch (MMINTException e) {
			MMINTException.print(MMINTException.Type.WARNING, "Skipping MAVO collection highlighting", e);
			return;
		}

		reasoner.highlightMAVOCollection(modelDiagram, mavoCollection);
	}

	public static void highlightMAVOElement(@NonNull Diagram modelDiagram, @NonNull MAVOElement mavoModelObj) {

		IMAVOReasoningEngine reasoner;
		try {
			reasoner = getMAVOReasoner("SMTLIB");
		}
		catch (MMINTException e) {
			MMINTException.print(MMINTException.Type.WARNING, "Skipping MAVO element highlighting", e);
			return;
		}

		reasoner.highlightMAVOElement(modelDiagram, mavoModelObj);
	}

}
