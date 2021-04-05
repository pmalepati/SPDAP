package org.issi.stepdefinitions;

import io.cucumber.java.en.When;
import org.issi.driver.DriverManager;
import org.issi.enums.WaitStrategy;
import org.openqa.selenium.By;

import static org.issi.pages.SPDAPConfiguration_OrganizationsPage.*;

public class SPDAPConfiguration_OrganizationsSteps {

    /*
     * ##############################################################
     *
     * Module name --->Administrator
     * Sub-mobule name --->SPDAP Configuration
     * Sub-mobule name --->Organizations
     * step definitions --> Organizations Steps
     *
     * ##############################################################
     */

    @When("user click on Organizations link")
    public void user_click_on_organizations_link() {
        clickOnOrganizations();
    }

    @When("user clicks on Add New Organizations")
    public void user_clicks_on_add_new_organizations() {
        clickOnaddnewRole();
    }

    @When("user fills Add_Edit Organizations from given sheet name {string} and  {int}")
    public void user_fills_add_edit_organizations_from_given_sheet_name_and(String string, Integer int1) {
        enterOrganizationName("HYD-ISSI");
        enterCurretMembers("2");
        enterProspectiveMembers("2");
//        selectTitle("");
//        enterfirstName("");
//        entermiddleName("");
//        enterlastName("");
//        enterEmail("");
//        enterMobileNumber("");
//        enterHomeNumber("");
//        enterWorkNumber("");
//        enterExtNumber("");
//        enterAddress("");
//        enterCity("");
//        selectState("");
//        selectCounty("");
//        enterZipcode("");
        waitupto(2000);
    }

    @When("user clicks on save button in AddEditOrganization page")
    public void user_clicks_on_save_button_in_add_edit_organization_page() {
        clickOnSavebtn();
    }

    @When("user enter the value in search field in Organizations from given sheet name {string} and  {int}")
    public void user_enter_the_value_in_search_field_in_organizations_from_given_sheet_name_and(String string, Integer int1) {
        waitupto(2000);
        enterText(By.xpath("//input[@id='SearchTaskTypecode']"), "HYD-ISSI", WaitStrategy.PRESENCE, "Organization Name");
    }

    @When("user click on edit button in Organizations page")
    public void user_click_on_edit_button_in_organizations_page() {
        waitupto(2000);
        DriverManager.getDriver().findElement(By.xpath("//a[@title='Edit']")).click();
        waitupto(3000);
    }

    @When("user click on save button in AddEditOrganization page")
    public void user_click_on_save_button_in_add_edit_organization_page() {
        clickOnSavebtn();
    }

    @When("user click on bulk print button in Organizations page")
    public void user_click_on_bulk_print_button_in_organizations_page() {

    }

    @When("user click on print button in Organizations page")
    public void user_click_on_print_button_in_organizations_page() {

    }

    @When("user click on delete the record in Organizations page")
    public void user_click_on_delete_the_record_in_organizations_page() {
        clickOn(By.xpath("(//*[@type='checkbox'])[2]"),WaitStrategy.CLICKABLE,"Check box");
        waitupto(2000);
        clickDeletebtn();
        waitupto(3000);
    }

}
