/*
* generated by Xtext
*/
package com.opcoach.training.rental.xtext.ui.contentassist.antlr;

import java.util.Collection;
import java.util.Map;
import java.util.HashMap;

import org.antlr.runtime.RecognitionException;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.ui.editor.contentassist.antlr.AbstractContentAssistParser;
import org.eclipse.xtext.ui.editor.contentassist.antlr.FollowElement;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;

import com.google.inject.Inject;

import com.opcoach.training.rental.xtext.services.RentalDslGrammarAccess;

public class RentalDslParser extends AbstractContentAssistParser {
	
	@Inject
	private RentalDslGrammarAccess grammarAccess;
	
	private Map<AbstractElement, String> nameMappings;
	
	@Override
	protected com.opcoach.training.rental.xtext.ui.contentassist.antlr.internal.InternalRentalDslParser createParser() {
		com.opcoach.training.rental.xtext.ui.contentassist.antlr.internal.InternalRentalDslParser result = new com.opcoach.training.rental.xtext.ui.contentassist.antlr.internal.InternalRentalDslParser(null);
		result.setGrammarAccess(grammarAccess);
		return result;
	}
	
	@Override
	protected String getRuleName(AbstractElement element) {
		if (nameMappings == null) {
			nameMappings = new HashMap<AbstractElement, String>() {
				private static final long serialVersionUID = 1L;
				{
					put(grammarAccess.getEStringAccess().getAlternatives(), "rule__EString__Alternatives");
					put(grammarAccess.getEBooleanAccess().getAlternatives(), "rule__EBoolean__Alternatives");
					put(grammarAccess.getStreetTypeAccess().getAlternatives(), "rule__StreetType__Alternatives");
					put(grammarAccess.getRentalAgencyAccess().getGroup(), "rule__RentalAgency__Group__0");
					put(grammarAccess.getRentalAgencyAccess().getGroup_4(), "rule__RentalAgency__Group_4__0");
					put(grammarAccess.getRentalAgencyAccess().getGroup_4_3(), "rule__RentalAgency__Group_4_3__0");
					put(grammarAccess.getRentalAgencyAccess().getGroup_5(), "rule__RentalAgency__Group_5__0");
					put(grammarAccess.getRentalAgencyAccess().getGroup_5_3(), "rule__RentalAgency__Group_5_3__0");
					put(grammarAccess.getRentalAgencyAccess().getGroup_6(), "rule__RentalAgency__Group_6__0");
					put(grammarAccess.getRentalAgencyAccess().getGroup_6_3(), "rule__RentalAgency__Group_6_3__0");
					put(grammarAccess.getAddressAccess().getGroup(), "rule__Address__Group__0");
					put(grammarAccess.getAddressAccess().getGroup_3(), "rule__Address__Group_3__0");
					put(grammarAccess.getAddressAccess().getGroup_4(), "rule__Address__Group_4__0");
					put(grammarAccess.getAddressAccess().getGroup_5(), "rule__Address__Group_5__0");
					put(grammarAccess.getAddressAccess().getGroup_6(), "rule__Address__Group_6__0");
					put(grammarAccess.getAddressAccess().getGroup_7(), "rule__Address__Group_7__0");
					put(grammarAccess.getRentalObjectAccess().getGroup(), "rule__RentalObject__Group__0");
					put(grammarAccess.getCustomerAccess().getGroup(), "rule__Customer__Group__0");
					put(grammarAccess.getCustomerAccess().getGroup_7(), "rule__Customer__Group_7__0");
					put(grammarAccess.getCustomerAccess().getGroup_7_3(), "rule__Customer__Group_7_3__0");
					put(grammarAccess.getRentalAccess().getGroup(), "rule__Rental__Group__0");
					put(grammarAccess.getRentalAccess().getGroup_2(), "rule__Rental__Group_2__0");
					put(grammarAccess.getRentalAccess().getGroup_3(), "rule__Rental__Group_3__0");
					put(grammarAccess.getRentalAccess().getGroup_6(), "rule__Rental__Group_6__0");
					put(grammarAccess.getEIntAccess().getGroup(), "rule__EInt__Group__0");
					put(grammarAccess.getELongAccess().getGroup(), "rule__ELong__Group__0");
					put(grammarAccess.getLicenseAccess().getGroup(), "rule__License__Group__0");
					put(grammarAccess.getLicenseAccess().getGroup_3(), "rule__License__Group_3__0");
					put(grammarAccess.getLicenseAccess().getGroup_4(), "rule__License__Group_4__0");
					put(grammarAccess.getLicenseAccess().getGroup_5(), "rule__License__Group_5__0");
					put(grammarAccess.getRentalAgencyAccess().getNameAssignment_1(), "rule__RentalAgency__NameAssignment_1");
					put(grammarAccess.getRentalAgencyAccess().getAddressAssignment_3(), "rule__RentalAgency__AddressAssignment_3");
					put(grammarAccess.getRentalAgencyAccess().getObjectsToRentAssignment_4_2(), "rule__RentalAgency__ObjectsToRentAssignment_4_2");
					put(grammarAccess.getRentalAgencyAccess().getObjectsToRentAssignment_4_3_1(), "rule__RentalAgency__ObjectsToRentAssignment_4_3_1");
					put(grammarAccess.getRentalAgencyAccess().getCustomersAssignment_5_2(), "rule__RentalAgency__CustomersAssignment_5_2");
					put(grammarAccess.getRentalAgencyAccess().getCustomersAssignment_5_3_1(), "rule__RentalAgency__CustomersAssignment_5_3_1");
					put(grammarAccess.getRentalAgencyAccess().getRentalsAssignment_6_2(), "rule__RentalAgency__RentalsAssignment_6_2");
					put(grammarAccess.getRentalAgencyAccess().getRentalsAssignment_6_3_1(), "rule__RentalAgency__RentalsAssignment_6_3_1");
					put(grammarAccess.getAddressAccess().getStreetTypeAssignment_3_1(), "rule__Address__StreetTypeAssignment_3_1");
					put(grammarAccess.getAddressAccess().getNumberAssignment_4_1(), "rule__Address__NumberAssignment_4_1");
					put(grammarAccess.getAddressAccess().getZipCodeAssignment_5_1(), "rule__Address__ZipCodeAssignment_5_1");
					put(grammarAccess.getAddressAccess().getCityAssignment_6_1(), "rule__Address__CityAssignment_6_1");
					put(grammarAccess.getAddressAccess().getStreetNameAssignment_7_1(), "rule__Address__StreetNameAssignment_7_1");
					put(grammarAccess.getRentalObjectAccess().getDispoAssignment_1(), "rule__RentalObject__DispoAssignment_1");
					put(grammarAccess.getRentalObjectAccess().getIDAssignment_3(), "rule__RentalObject__IDAssignment_3");
					put(grammarAccess.getRentalObjectAccess().getNameAssignment_6(), "rule__RentalObject__NameAssignment_6");
					put(grammarAccess.getCustomerAccess().getFirstNameAssignment_3(), "rule__Customer__FirstNameAssignment_3");
					put(grammarAccess.getCustomerAccess().getLastNameAssignment_5(), "rule__Customer__LastNameAssignment_5");
					put(grammarAccess.getCustomerAccess().getAddressAssignment_6(), "rule__Customer__AddressAssignment_6");
					put(grammarAccess.getCustomerAccess().getLicensesAssignment_7_2(), "rule__Customer__LicensesAssignment_7_2");
					put(grammarAccess.getCustomerAccess().getLicensesAssignment_7_3_1(), "rule__Customer__LicensesAssignment_7_3_1");
					put(grammarAccess.getRentalAccess().getStartDateAssignment_2_1(), "rule__Rental__StartDateAssignment_2_1");
					put(grammarAccess.getRentalAccess().getEndDateAssignment_3_1(), "rule__Rental__EndDateAssignment_3_1");
					put(grammarAccess.getRentalAccess().getCustomerAssignment_5(), "rule__Rental__CustomerAssignment_5");
					put(grammarAccess.getRentalAccess().getRentedObjectAssignment_6_1(), "rule__Rental__RentedObjectAssignment_6_1");
					put(grammarAccess.getLicenseAccess().getNumberAssignment_3_1(), "rule__License__NumberAssignment_3_1");
					put(grammarAccess.getLicenseAccess().getValidityDateAssignment_4_1(), "rule__License__ValidityDateAssignment_4_1");
					put(grammarAccess.getLicenseAccess().getEReference0Assignment_5_1(), "rule__License__EReference0Assignment_5_1");
				}
			};
		}
		return nameMappings.get(element);
	}
	
	@Override
	protected Collection<FollowElement> getFollowElements(AbstractInternalContentAssistParser parser) {
		try {
			com.opcoach.training.rental.xtext.ui.contentassist.antlr.internal.InternalRentalDslParser typedParser = (com.opcoach.training.rental.xtext.ui.contentassist.antlr.internal.InternalRentalDslParser) parser;
			typedParser.entryRuleRentalAgency();
			return typedParser.getFollowElements();
		} catch(RecognitionException ex) {
			throw new RuntimeException(ex);
		}		
	}
	
	@Override
	protected String[] getInitialHiddenTokens() {
		return new String[] { "RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT" };
	}
	
	public RentalDslGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}
	
	public void setGrammarAccess(RentalDslGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}
