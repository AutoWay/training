/*
 * generated by Xtext
 */
package com.opcoach.training.rental.xtext.ui;

import org.eclipse.xtext.ui.guice.AbstractGuiceAwareExecutableExtensionFactory;
import org.osgi.framework.Bundle;

import com.google.inject.Injector;

import com.opcoach.training.rental.xtext.ui.internal.RentalDslActivator;

/**
 * This class was generated. Customizations should only happen in a newly
 * introduced subclass. 
 */
public class RentalDslExecutableExtensionFactory extends AbstractGuiceAwareExecutableExtensionFactory {

	@Override
	protected Bundle getBundle() {
		return RentalDslActivator.getInstance().getBundle();
	}
	
	@Override
	protected Injector getInjector() {
		return RentalDslActivator.getInstance().getInjector(RentalDslActivator.COM_OPCOACH_TRAINING_RENTAL_XTEXT_RENTALDSL);
	}
	
}
