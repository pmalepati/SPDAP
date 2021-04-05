package org.issi.stepdefinitions;

import io.cucumber.java.en.When;

import static org.issi.pages.Reports_MembershipbyCountyPage.*;

public class Reports_MembershipbyCounty {

    @When("user click on Membership by County")
    public void user_click_on_membership_by_county() {
        clickOnMembershipbyCounty();
    }

    @When("user select the value in County Name field in Membership by County")
    public void user_select_the_value_in_county_name_field_in_membership_by_county() {
        selectOnCountyName();
        waitupto(1000);
        selectreasonCodeValueDropDown("Select all");
    }

    @When("user select the value in Month dropdown field in Membership by County")
    public void user_select_the_value_in_month_dropdown_field_in_membership_by_county() {
        clickOnMonthDropDown();
        waitupto(1000);
        selectMonthValue("Select all");
    }

    @When("user select the value in Year dropdown field in Membership by County")
    public void user_select_the_value_in_year_dropdown_field_in_membership_by_county() {
        clickOnYearDropDown();
        waitupto(1000);
        selectYearValue("2021");
        selectYearValue("2020");
    }

    @When("user click on generate button in Membership by County")
    public void user_click_on_generate_button_in_membership_by_county() {
        clickOnGenerateButton();
    }

    @When("user click on Print button in Membership by County")
    public void user_click_on_print_button_in_membership_by_county() {
        clickOnPrintButton();
    }

}
