package com.opcoach.training.e4.rental.ui.pref;

import org.eclipse.jface.preference.BooleanFieldEditor;
import org.eclipse.jface.preference.FieldEditorPreferencePage;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Label;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.IWorkbenchPreferencePage;

import com.opcoach.training.e4.rental.ui.RentalUIActivator;
import com.opcoach.training.e4.rental.ui.RentalUIConstants;

public class RentalPrefHomePage extends FieldEditorPreferencePage implements IWorkbenchPreferencePage, RentalUIConstants

{

	
	
	public RentalPrefHomePage()
	{
		super(GRID);
		//IEclipseContext ctx = EclipseContextFactory.getServiceContext(RentalUIActivator.getContext());
		// IPreferenceStore ps = ctx.get(IPreferenceStore.class);
		setPreferenceStore(RentalUIActivator.getDefault().getPreferenceStore());		// noDefaultAndApplyButton();
	}

	

	@Override
	public void init(IWorkbench workbench)
	{
		// TODO Auto-generated method stub

	}



	/* (non-Javadoc)
	 * @see org.eclipse.jface.preference.FieldEditorPreferencePage#createFieldEditors()
	 */
	@Override
	protected void createFieldEditors()
	{
		addField(new BooleanFieldEditor(DISPLAY_COUNT_PREF, "Affiche les totaux par groupes d'objets", getFieldEditorParent()));
		
	}



	@Override
	protected Control createContents(Composite parent)
	{
		Label lab = new Label(parent, SWT.NONE);
		lab.setText("Pages de pr�f�rences de rental.");
		
		// TODO Auto-generated method stub
		return super.createContents(parent);
	}
	
	
	
	


}
