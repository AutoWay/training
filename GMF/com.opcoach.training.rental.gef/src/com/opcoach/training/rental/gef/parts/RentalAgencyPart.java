// ------------------------------------------------
// OPCoach Training Projects
// � OPCoach 2009 http://www.opcoach.com
// ------------------------------------------------

package com.opcoach.training.rental.gef.parts;

import org.eclipse.draw2d.IFigure;
import org.eclipse.gef.EditPolicy;
import org.eclipse.gef.editparts.AbstractGraphicalEditPart;
import org.eclipse.gef.editpolicies.RootComponentEditPolicy;

import com.opcoach.training.rental.gef.figures.CustomerFigure;

/**
 * @author olivier
 */
public class RentalAgencyPart extends AbstractGraphicalEditPart
{
	
	@Override
	protected void createEditPolicies()
	{
		// Interdit � l'�diteur de supprimer ce noeud (car root node)
		installEditPolicy(EditPolicy.GRAPHICAL_NODE_ROLE, new RootComponentEditPolicy()); 
			 
	}

	

	@Override
	protected IFigure createFigure()
	{
		return new CustomerFigure();
	}

	
}
