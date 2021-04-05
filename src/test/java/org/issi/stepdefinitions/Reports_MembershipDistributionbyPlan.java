package org.issi.stepdefinitions;

import io.cucumber.java.en.When;

import static org.issi.pages.Reports_MembershipDistributionbyPlanPage.*;

public class Reports_MembershipDistributionbyPlan {

    @When("user click on Membership Distribution by Plan")
    public void user_click_on_membership_distribution_by_plan() {
        clickOnMembershipDistributionbyPlan();
    }

    @When("user select the value in Organizations field in Membership Distribution by Plan")
    public void user_select_the_value_in_Organizations_field_in_membership_distribution_by_plan() {
        selectOnOrganizations();
        waitupto(1000);
        selectOrganizations("Select all");
    }

    @When("user select the value in Month dropdown field in Membership Distribution by Plan")
    public void user_select_the_value_in_month_dropdown_field_in_membership_distribution_by_plan() {
        clickOnMonthDropDown();
        waitupto(1000);
        selectMonthValue("Select all");
    }

    @When("user select the value in Year dropdown field in Membership Distribution by Plan")
    public void user_select_the_value_in_year_dropdown_field_in_membership_distribution_by_plan() {
        clickOnYearDropDown();
        waitupto(1000);
       // selectYearValue("2020");
        selectYearValue("Select all");
    }

    @When("user click on generate button in Membership Distribution by Plan")
    public void user_click_on_generate_button_in_membership_distribution_by_plan() {
        clickOnGenerateButton();
    }

    @When("user click on Print button in Membership Distribution by Plan")
    public void user_click_on_print_button_in_membership_distribution_by_plan() {
        clickOnPrintButton();
    }
}
