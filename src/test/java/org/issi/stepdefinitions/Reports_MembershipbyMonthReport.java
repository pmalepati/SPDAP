package org.issi.stepdefinitions;

import io.cucumber.java.en.When;

import static org.issi.pages.Reports_MembershipbyMonthReportPage.*;

public class Reports_MembershipbyMonthReport {

    @When("user click on Membership by Month Report")
    public void user_click_on_membership_by_month_report() {
        clickOnMembershipbyMonthReport();
    }

    @When("user select the value in Month dropdown field in Membership by Month Report")
    public void user_select_the_value_in_month_dropdown_field_in_membership_by_month_report() {
        clickOnMonthDropDown();
        waitupto(1000);
        selectMonthValue("Select all");
    }

    @When("user select the value in Year dropdown field in Membership by Month Report")
    public void user_select_the_value_in_year_dropdown_field_in_membership_by_month_report() {
        clickOnYearDropDown();
        waitupto(1000);
        selectYearValue("2021");
        selectYearValue("2020");
    }

    @When("user click on generate button in Membership by Month Report")
    public void user_click_on_generate_button_in_membership_by_month_report() {
        clickOnGenerateButton();
    }

    @When("user click on Print button in Membership by Month Report")
    public void user_click_on_print_button_in_membership_by_month_report() {
        clickOnPrintButton();
    }
}
