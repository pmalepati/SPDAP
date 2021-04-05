package org.issi.stepdefinitions;

import io.cucumber.java.en.When;

import static org.issi.pages.Reports_TerminatedMembersPage.*;

public class Reports_TerminatedMembers {

    @When("user click on Terminated Members Report")
    public void user_click_on_terminated_members_report() {
        clickOnTerminatedMembersReport();
    }

    @When("user select the value in Reason Code field in Terminated Members Report")
    public void user_select_the_value_in_reason_code_field_in_terminated_members_report() {
        selectOnreasonCode();
        waitupto(1000);
        selectreasonCodeValueDropDown("Select all");
    }

    @When("user select the value in Month dropdown field in Terminated Members Report")
    public void user_select_the_value_in_month_dropdown_field_in_terminated_members_report() {
        clickOnMonthDropDown();
        waitupto(1000);
        selectMonthValue("Select all");
    }

    @When("user select the value in Year dropdown field in Terminated Members Report")
    public void user_select_the_value_in_year_dropdown_field_in_terminated_members_report() {
        clickOnYearDropDown();
        waitupto(1000);
        selectYearValue("2021");
        selectYearValue("2020");
    }

    @When("user click on generate button in Terminated Members Report")
    public void user_click_on_generate_button_in_terminated_members_report() {
        clickOnGenerateButton();
    }

    @When("user click on Print button in Terminated Members Report")
    public void user_click_on_print_button_in_terminated_members_report() {
        clickOnPrintButton();
    }
}
