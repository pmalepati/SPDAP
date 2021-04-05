package org.issi.stepdefinitions;

import io.cucumber.java.en.When;
import org.issi.driver.DriverManager;
import org.openqa.selenium.By;

import static org.issi.pages.SPDAPConfigurations_LetterTemplatePage.*;

public class SPDAPConfigurations_LetterTemplateSteps {
    /*
     * ##############################################################
     *
     * Module name --->Administrator
     * Sub-mobule name --->SPDAPConfiguration
     * Sub-mobule name --->Letter Template
     * StepDefinations --> Letter Template Steps
     *
     * ##############################################################
     */
    @When("user click on Master Letter Template link")
    public void user_click_on_master_letter_template_link() {
        clickOnMasterLetter();
    }

    @When("user clicks on Add New Letter Template")
    public void user_clicks_on_add_new_letter_template() {
        clickOnaddNewLookupType();
    }

    @When("user fills Add_Edit Letter Template from given sheet name {string} and  {int}")
    public void user_fills_add_edit_letter_template_from_given_sheet_name_and(String string, Integer int1) {
        clickOnMyFile("C:\\Users\\ISSI-WIN-24\\Desktop\\ISSIDenyAppealForm.pdf");
        enterDocumentName("ISSI Deny Appeal Form");
        enterletterTemplateDescription("ISSI Deny Appeal Form");
    }

    @When("user clicks on save button in Letter Template")
    public void user_clicks_on_save_button_in_letter_template() {
        clickOnSavebtn();
    }

    @When("user enter the value in search field in Letter Template from given sheet name {string} and  {int}")
    public void user_enter_the_value_in_search_field_in_letter_template_from_given_sheet_name_and(String string, Integer int1) {
        searchValueLetterTemplate("Description","ISSIDenyAppealForm");
    }

    @When("user click on edit button in Letter Template page")
    public void user_click_on_edit_button_in_letter_template_page() {
        DriverManager.getDriver().findElement(By.xpath("//a[@title='Edit']")).click();
        waitupto(3000);
        clickOnSavebtn();
        waitupto(2000);
        String alertMessage= DriverManager.getDriver().switchTo().alert().getText();
        System.out.println("Master letter template Confirm :"+alertMessage);
        waitupto(2000);
        DriverManager.getDriver().switchTo().alert().accept();
    }

    @When("user click on download button in Letter Template page")
    public void user_click_on_download_button_in_letter_template_page() {

    }

    @When("user click on active or inactive button to update the letter template in Letter Template page")
    public void user_click_on_active_or_inactive_button_to_update_the_letter_template_in_letter_template_page() {

    }

    @When("user click on bulk print in Letter Template page")
    public void user_click_on_bulk_print_in_letter_template_page() {

    }
}
