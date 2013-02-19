/*
 * Copyright (c) 2012 Marsha Chechik, Alessio Di Sandro, Michalis Famelis,
 * Rick Salay, Vivien Suen.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *    Alessio Di Sandro, Vivien Suen - Implementation.
 */
package edu.toronto.cs.se.mmtf.mid.relationship.diagram.edit.parts;

import org.eclipse.draw2d.Connection;
import org.eclipse.draw2d.Graphics;
import org.eclipse.draw2d.PolylineDecoration;
import org.eclipse.draw2d.RotatableDecoration;
import org.eclipse.gef.EditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ConnectionNodeEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ITreeBranchEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles;
import org.eclipse.gmf.runtime.draw2d.ui.figures.PolylineConnectionEx;
import org.eclipse.gmf.runtime.draw2d.ui.figures.WrappingLabel;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.swt.graphics.Color;

import edu.toronto.cs.se.mmtf.mid.relationship.diagram.edit.policies.ModelElementEndpointReference2ItemSemanticEditPolicy;
import edu.toronto.cs.se.mmtf.mid.relationship.diagram.edit.policies.ModelElementEndpointReferenceSuperSemanticEditPolicy;

/**
 * @generated
 */
public class ModelElementEndpointReference2EditPart extends
		ConnectionNodeEditPart implements ITreeBranchEditPart {

	/**
	 * @generated
	 */
	public static final int VISUAL_ID = 4014;

	/**
	 * @generated
	 */
	public ModelElementEndpointReference2EditPart(View view) {
		super(view);
	}

	/**
	 * @generated
	 */
	protected void createDefaultEditPolicies() {
		super.createDefaultEditPolicies();
		installEditPolicy(EditPolicyRoles.SEMANTIC_ROLE,
				new ModelElementEndpointReference2ItemSemanticEditPolicy());
		installEditPolicy(EditPolicyRoles.SEMANTIC_ROLE,
				new ModelElementEndpointReferenceSuperSemanticEditPolicy());
	}

	/**
	 * @generated
	 */
	protected boolean addFixedChild(EditPart childEditPart) {
		if (childEditPart instanceof WrappingLabel15EditPart) {
			((WrappingLabel15EditPart) childEditPart)
					.setLabel(getPrimaryShape()
							.getFigureModelElementEndpointReferenceSuperLabelFigure());
			return true;
		}
		if (childEditPart instanceof WrappingLabel26EditPart) {
			((WrappingLabel26EditPart) childEditPart)
					.setLabel(getPrimaryShape()
							.getFigureMAVOModelElementEndpointReferenceSuperLabelFigure());
			return true;
		}
		return false;
	}

	/**
	 * @generated
	 */
	protected void addChildVisual(EditPart childEditPart, int index) {
		if (addFixedChild(childEditPart)) {
			return;
		}
		super.addChildVisual(childEditPart, index);
	}

	/**
	 * @generated
	 */
	protected boolean removeFixedChild(EditPart childEditPart) {
		if (childEditPart instanceof WrappingLabel15EditPart) {
			return true;
		}
		if (childEditPart instanceof WrappingLabel26EditPart) {
			return true;
		}
		return false;
	}

	/**
	 * @generated
	 */
	protected void removeChildVisual(EditPart childEditPart) {
		if (removeFixedChild(childEditPart)) {
			return;
		}
		super.removeChildVisual(childEditPart);
	}

	/**
	 * Creates figure for this edit part.
	 * 
	 * Body of this method does not depend on settings in generation model
	 * so you may safely remove <i>generated</i> tag and modify it.
	 * 
	 * @generated
	 */

	protected Connection createConnectionFigure() {
		return new ModelElementEndpointReferenceSuperFigure();
	}

	/**
	 * @generated
	 */
	public ModelElementEndpointReferenceSuperFigure getPrimaryShape() {
		return (ModelElementEndpointReferenceSuperFigure) getFigure();
	}

	/**
	 * @generated
	 */
	public class ModelElementEndpointReferenceSuperFigure extends
			PolylineConnectionEx {

		/**
		 * @generated
		 */
		private WrappingLabel fFigureModelElementEndpointReferenceSuperLabelFigure;

		/**
		 * @generated
		 */
		private WrappingLabel fFigureMAVOModelElementEndpointReferenceSuperLabelFigure;

		/**
		 * @generated
		 */
		public ModelElementEndpointReferenceSuperFigure() {
			this.setLineWidth(3);
			this.setLineStyle(Graphics.LINE_DASH);
			this.setForegroundColor(THIS_FORE);

			createContents();
			setTargetDecoration(createTargetDecoration());
		}

		/**
		 * @generated
		 */
		private void createContents() {

			fFigureMAVOModelElementEndpointReferenceSuperLabelFigure = new WrappingLabel();

			fFigureMAVOModelElementEndpointReferenceSuperLabelFigure
					.setText("");

			this.add(fFigureMAVOModelElementEndpointReferenceSuperLabelFigure);

			fFigureModelElementEndpointReferenceSuperLabelFigure = new WrappingLabel();

			fFigureModelElementEndpointReferenceSuperLabelFigure.setText("");

			this.add(fFigureModelElementEndpointReferenceSuperLabelFigure);

		}

		/**
		 * @generated
		 */
		private RotatableDecoration createTargetDecoration() {
			PolylineDecoration df = new PolylineDecoration();
			df.setLineWidth(3);
			df.setLineStyle(Graphics.LINE_DASH);
			return df;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureModelElementEndpointReferenceSuperLabelFigure() {
			return fFigureModelElementEndpointReferenceSuperLabelFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureMAVOModelElementEndpointReferenceSuperLabelFigure() {
			return fFigureMAVOModelElementEndpointReferenceSuperLabelFigure;
		}

	}

	/**
	 * @generated
	 */
	static final Color THIS_FORE = new Color(null, 44, 109, 163);

}
