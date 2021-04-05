package org.issi.stepdefinitions;

import io.cucumber.java.en.When;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.issi.constants.FrameworkConstants;
import org.issi.driver.DriverManager;
import org.issi.enums.WaitStrategy;
import org.issi.pages.BasePage;
import org.issi.utilities.ExcelReader;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

import java.io.IOException;
import java.util.List;
import java.util.Map;

import static org.issi.pages.PhoneLogPage.clickOnPrintbtn;
import static org.issi.pages.PhoneLogPage.selectBulkPrintbtn;
import static org.issi.pages.SPDAPConfigurations_TaskTypePage.*;

public class SPDAPConfigurations_TaskTypeSteps {
    public List<Map<String, String>> testdata;
    String TaskTypeCode;
    String TaskName;
    String TaskDescription;
    String Status;

    /*
     * ##############################################################
     *
     * Module name --->Administrator
     * Sub-mobule name --->SPDAPConfiguration
     * Sub-mobule name --->Task Type
     * StepDefination -->Task Type Steps
     *
     * ##############################################################
     */
    @When("user click on Task Types module")
    public void user_click_on_task_types_module() {
        clickOnTaskType();
    }

    @When("user clicks on Add New TaskType")
    public void user_clicks_on_add_new_task_type() {
        clickOnaddNewTaskType();
    }

    @When("user fills Add_Edit Task Types from given sheet name {string} and  {int}")
    public void user_fills_add_edit_task_types_from_given_sheet_name_and(String sheetname, Integer rownumber) {

        ExcelReader reader = new ExcelReader();
        try {
            testdata = reader.getData(FrameworkConstants.getExcelFilePath(), sheetname);

            //Task Type Code
            TaskTypeCode = testdata.get(rownumber).get("TaskTypeCode");
            enterTaskTypeCode(TaskTypeCode);

            //Task Name
            TaskName = testdata.get(rownumber).get("TaskName");
            enterTaskName(TaskName);

            //Task Description
            TaskDescription = testdata.get(rownumber).get("TaskDescription");
            enterTaskDescription(TaskDescription);


            Status = testdata.get(rownumber).get("Status");
            selectStaus(Status);
            String ReasonCodes = testdata.get(rownumber).get("ReasonCodes");
            selectReasonCodes(ReasonCodes);
            String shouAt = testdata.get(rownumber).get("shouAt");
            //shouAtRadiobtn("shouAt");
        } catch (InvalidFormatException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @When("user clicks on save button in Task Types")
    public void user_clicks_on_save_button_in_task_types() {

        clickOnButtons();
    }

    @When("user enter the value in search field in Task Types from given sheet name {string} and  {int}")
    public void user_enter_the_value_in_search_field_in_task_types_from_given_sheet_name_and(String sheetname, Integer rownumber) {
        String SeacrchValue = testdata.get(rownumber).get("SeacrchValue");

        //Search the value based on Task Type code
        if (SeacrchValue.equalsIgnoreCase("TaskTypecode")){
            searchRecordTaskType(SeacrchValue,TaskTypeCode);

            //Search the value based on Task Type Name
        }else if (SeacrchValue.equalsIgnoreCase("TaskTypeName")){
            searchRecordTaskType(SeacrchValue,TaskName);

            //Search the value based on Task Type Desc
        }else if (SeacrchValue.equalsIgnoreCase("TaskTypeDesc")){
            searchRecordTaskType(SeacrchValue,TaskDescription);

            //Search the value based on Status
        }else if (SeacrchValue.equalsIgnoreCase("Status")){
            searchRecordTaskType(SeacrchValue,Status);
        }
    }

    @When("user click on edit button in Task Types page")
    public void user_click_on_edit_button_in_task_types_page() {
        DriverManager.getDriver().findElement(By.xpath("//a[@title='Edit']")).click();
        waitupto(3000);
        clickOnButtons();
    }

    @When("user click on bulk print button in Task Types page")
    public void user_click_on_bulk_print_button_in_task_types_page() {
        String showDropdown="//select[@name='tblTaskTypes_length']";
        waitupto(2000);
        if (DriverManager.getDriver().findElement(By.xpath(showDropdown)).isDisplayed()) {
            waitupto(2000);
            BasePage.clickOn(By.xpath(showDropdown), WaitStrategy.VISIBLE, "All records displayed");
            BasePage.selectFromDrpDwn(By.xpath(showDropdown), WaitStrategy.VISIBLE, "All", "All records displayed");
        }
        waitupto(2000);
        selectCheckBox();
        waitupto(2000);
        //selectBulkPrintbtn();
    }

    @When("user click on print button in Task Types page")
    public void user_click_on_print_button_in_task_types_page() {
//        waitupto(2000);
//        clickOnPrintbtn();
//        waitupto(2000);
//        String parentWin = DriverManager.getDriver().getWindowHandle();
//        waitupto(1000);
//        String childwin = switchToWindow(parentWin);
//        waitupto(1000);
//        DriverManager.getDriver().switchTo().window(childwin);
//        waitupto(1000);
//        DriverManager.getDriver().close();
//        waitupto(1000);
//        DriverManager.getDriver().switchTo().window(parentWin);
    }

    @When("user click on delete the record in Task Types page")
    public void user_click_on_delete_the_record_in_task_types_page() {
        waitupto(2000);
        selectDeletebtn();
        waitupto(2000);
    }
}
