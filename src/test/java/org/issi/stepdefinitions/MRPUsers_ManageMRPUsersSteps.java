package org.issi.stepdefinitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static org.issi.pages.MRPUsers_ManageMRPUsersPage.*;

public class MRPUsers_ManageMRPUsersSteps {

    /*
     * ##############################################################
     *
     * Module name --->Administrator
     * Sub-mobule name --->MRP Users
     * Sub-mobule name --->Manage MRP Users
     * stepdefinitions --> Manage MRP Users Steps
     *
     * ##############################################################
     */
    @When("user click on ManageMRP_Users module")
    public void user_click_on_manage_mrp_users_module() {
        clickOnmanageMRPUsers();
    }

    @Then("user enter the value in search field in ManageMRP_Users from given sheet name {string} and  <RowNumber>")
    public void user_enter_the_value_in_search_field_in_manage_mrp_users_from_given_sheet_name_and_row_number(String string) {
        searchRecord("UserName","Rammiram");
    }

    @Then("User click on checkbox in ManageMRP_Users page")
    public void user_click_on_checkbox_in_manage_mrp_users_page() {

    }

    @Then("User click on Activate the new user in ManageMRP_Users page")
    public void user_click_on_activate_the_new_user_in_manage_mrp_users_page() {

    }
}
