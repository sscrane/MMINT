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
package edu.toronto.cs.se.modelepedia.classdiagram_mavo.operator;

import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;

import edu.toronto.cs.se.mmtf.mavo.library.MultiModelMAVOInstanceFactory;
import edu.toronto.cs.se.mmtf.mid.Model;
import edu.toronto.cs.se.mmtf.mid.ModelOrigin;
import edu.toronto.cs.se.mmtf.mid.MultiModel;
import edu.toronto.cs.se.mmtf.mid.library.MultiModelOperatorUtils;
import edu.toronto.cs.se.mmtf.mid.library.MultiModelRegistry;
import edu.toronto.cs.se.mmtf.mid.library.MultiModelUtils;
import edu.toronto.cs.se.mmtf.mid.operator.impl.ConversionOperatorExecutableImpl;
import edu.toronto.cs.se.modelepedia.classdiagram_mavo.ClassDiagram_MAVOPackage;

public class UMLToClassDiagramMAVO extends ConversionOperatorExecutableImpl {

	private Model newCdModel;

	@Override
	public EList<Model> execute(EList<Model> actualParameters) throws Exception {

		Model umlModel = actualParameters.get(0);
		String newCdModelUri = MultiModelUtils.replaceFileExtensionInUri(umlModel.getUri(), ClassDiagram_MAVOPackage.eNAME);
		UMLToClassDiagramMAVO_M2M atl = new UMLToClassDiagramMAVO_M2M();
		atl.loadModels(umlModel.getUri());
		atl.doUMLToClassDiagramMAVO_M2M(new NullProgressMonitor());
		atl.saveModels(newCdModelUri);

		MultiModel multiModel = MultiModelRegistry.getMultiModel(umlModel);
		newCdModel = MultiModelMAVOInstanceFactory.createModelAndEditor(null, newCdModelUri, ModelOrigin.CREATED, multiModel);
		EList<Model> result = new BasicEList<Model>();
		result.add(newCdModel);

		return result;
	}

	@Override
	public void cleanup() throws Exception {

		if (newCdModel != null) {
			MultiModelOperatorUtils.cleanupTemporaryModel(newCdModel);
			newCdModel = null;
		}
	}

}