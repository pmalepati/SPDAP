package org.issi.stepdefinitions;

import io.cucumber.java.en.When;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.issi.constants.FrameworkConstants;
import org.issi.driver.DriverManager;
import org.issi.utilities.ExcelReader;
import org.openqa.selenium.By;

import java.io.IOException;
import java.util.List;
import java.util.Map;

import static org.issi.pages.SPDAPConfiguration_WorkflowConfigurationPage.*;


public class SPDAPConfiguration_WorkflowConfigurationSteps {
    /*
     * ##############################################################
     *
     * Module name --->Administrator
     * Sub-mobule name --->SPDAPConfiguration
     * Sub-mobule name --->Workflow Configuration
     * stepdefinitions --> Workflow Configuration Steps
     *
     * ##############################################################
     */
    public List<Map<String, String>> testdata;
    String TasktoPerform;
    String TasktoRoute;
    String Role;

    @When("user click on Workflow Configuration module")
    public void user_click_on_workflow_configuration_module() {
        clickOnWorkflowConfiguration();
    }

    @When("user clicks on Add New Workflow Configuration")
    public void user_clicks_on_add_new_workflow_configuration() {
        clickOnaddnewRole();
    }

    @When("user fills Add_Edit Workflow Configuration from given sheet name {string} and  {int}")
    public void user_fills_add_edit_workflow_configuration_from_given_sheet_name_and(String sheetname, Integer rownumber) {

        ExcelReader reader = new ExcelReader();
        try {
            testdata = reader.getData(FrameworkConstants.getExcelFilePath(), sheetname);

            //Task to Perform
            TasktoPerform = testdata.get(rownumber).get("TasktoPerform");
            selectTasktoPerform(TasktoPerform);

            //Task to Route
            TasktoRoute = testdata.get(rownumber).get("TasktoRoute");
            selectTasktoRoute(TasktoRoute);

            //Role
             Role = testdata.get(rownumber).get("Role");
            selectRole(Role);

            //Description
            String Description = testdata.get(rownumber).get("Description");
            enterDescription(Description);

            //Availab leLetters
            clickOnAvailableLetters();

            //AddLetter
            clickOnAddLetter();

            //SelectAll
            clickOnSelectAll();

            //Submitbtn
            clickOnSubmitbtn();

            //Delete
            clickOnDelete();

            //Download
            clickOnDownload();

            //Available Documents
            clickOnAvailableDocuments();

            //Add Document
            clickOnAddDocument();

            //Closebtn
            clickOnClosebtn();
        } catch (InvalidFormatException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @When("user clicks on save button in Workflow Configuration")
    public void user_clicks_on_save_button_in_workflow_configuration() {
        clickOnSavebtn();
    }

    @When("user enter the value in search field in Workflow Configuration from given sheet name {string} and  {int}")
    public void user_enter_the_value_in_search_field_in_workflow_configuration_from_given_sheet_name_and(String sheetname, Integer rownumber) {

        String SeacrchValue = testdata.get(rownumber).get("SeacrchValue");

        //Search the value based on Task to Perform
       if (SeacrchValue.equalsIgnoreCase("TasktoPerform")){
           enterSearchValue(SeacrchValue,TasktoPerform);

           //Search the value based on Task to Route
       }else if (SeacrchValue.equalsIgnoreCase("TasktoRoute")){
           enterSearchValue(SeacrchValue,TasktoRoute);

           //Search the value based on Role
       }else if (SeacrchValue.equalsIgnoreCase("Role")){
           enterSearchValue(SeacrchValue,Role);
       }
    }

    @When("user click on edit button in Workflow Configuration page")
    public void user_click_on_edit_button_in_workflow_configuration_page() {
        DriverManager.getDriver().findElement(By.xpath("//a[@title='Edit']")).click();
        waitupto(3000);
        clickOnSavebtn();
    }

    @When("user click on bulk print button in Workflow Configuration page")
    public void user_click_on_bulk_print_button_in_workflow_configuration_page() {
//        DriverManager.getDriver().findElement(By.xpath("//input[@id='chkSelectAll']")).click();
//        waitupto(3000);
//        selectBulkPrintbtn();
    }

    @When("user click on print button in Workflow Configuration page")
    public void user_click_on_print_button_in_workflow_configuration_page() {
//        waitupto(3000);
//        clickOnPrintbtn();
//        waitupto(3000);
//        String parentWin = DriverManager.getDriver().getWindowHandle();
//        waitupto(500);
//        String childwin = switchToWindow(parentWin);
//        waitupto(500);
//        DriverManager.getDriver().switchTo().window(childwin);
//        waitupto(500);
//        DriverManager.getDriver().close();
//        waitupto(500);
//        DriverManager.getDriver().switchTo().window(parentWin);
    }

    @When("user click on delete the record in Workflow Configuration page")
    public void user_click_on_delete_the_record_in_workflow_configuration_page() {
        DriverManager.getDriver().findElement(By.xpath("(//input[@type='checkbox'])[2]")).click();
        waitupto(1000);
        clickOnDeletebtn();
        waitupto(2000);
    }
}
