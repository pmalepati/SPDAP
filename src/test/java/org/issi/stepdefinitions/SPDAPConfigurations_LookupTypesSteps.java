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

import static org.issi.pages.SPDAPConfigurations_LookupTypesPage.*;

public class SPDAPConfigurations_LookupTypesSteps {
    public List<Map<String, String>> testdata;
    public String lookuptypeCode;
    public String lookuptypeName;
    public String lookuptypeDec;
    public String lookupValueCode;
    public String lookupValueName;
    public String lookupValueDec;
    /*
     * ##############################################################
     *
     * Module name --->Administrator
     * Sub-mobule name --->SPDAPConfiguration
     * Sub-mobule name --->Lookup Types
     * StepDefinations --> LookupTypes steps
     *
     * ##############################################################
     */


    @When("user click on Lookup Types module")
    public void user_click_on_lookup_types_module() {
        clickOnLookupType();
    }

    @When("user clicks on Add New Lookup Type")
    public void user_clicks_on_add_new_lookup_type() {
        clickOnaddNewLookupType();
    }

    @When("user fills Add New Lookup Type from given sheet name {string} and  {int}")
    public void user_fills_add_new_lookup_type_from_given_sheet_name_and(String sheetname, Integer rownumber) {
        ExcelReader reader = new ExcelReader();
        try {
            testdata = reader.getData(FrameworkConstants.getExcelFilePath(), sheetname);

            //lookup type Code
            lookuptypeCode = testdata.get(rownumber).get("lookuptypeCode");
            enterLookupTypeCode(lookuptypeCode);

            //lookup type Name
            lookuptypeName = testdata.get(rownumber).get("lookuptypeName");
            enterLookupTypeName(lookuptypeName);

            //lookup type Dec
            lookuptypeDec = testdata.get(rownumber).get("lookuptypeDec");
            enterLookupTypeDescription(lookuptypeDec);

        } catch (InvalidFormatException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    @When("user clicks on save button in Lookup Types")
    public void user_clicks_on_save_button_in_lookup_types() {
        clickOnButtonsLookupType();
    }

    @When("user enter the value in search field Lookup Types from given sheet name {string} and  {int}")
    public void user_enter_the_value_in_search_field_lookup_types_from_given_sheet_name_and(String sheetname, Integer rownumber) {
        waitupto(2000);
        String SeacrchValue = testdata.get(rownumber).get("SeacrchValue");

        //Search the value based on code
        if (SeacrchValue.equalsIgnoreCase("code")){
            searchRecord(SeacrchValue,lookuptypeCode);

            //Search the value based on Name
        }else if (SeacrchValue.equalsIgnoreCase("Name")){
            searchRecord(SeacrchValue,lookuptypeName);

            //Search the value based on Dec
        }else if (SeacrchValue.equalsIgnoreCase("Dec")){
            searchRecord(SeacrchValue,lookuptypeDec);
        }
    }

    @When("user click on edit button in Lookup Types page")
    public void user_click_on_edit_button_in_lookup_types_page() {
        clickOnEditbtn();
        waitupto(2000);
        clickOnButtonsLookupType();
    }

    @When("User click on more edit button in lookup Types page")
    public void user_click_on_more_edit_button_in_lookup_types_page() {
        clickOnmoreEditbtn();
    }

    @When("user click on Add New Lookup Value in more edit button page")
    public void user_click_on_add_new_lookup_value_in_more_edit_button_page() {
        clickOnAddNewLookupValue();
    }

    @When("user fills Add New Lookup Value from given sheet name {string} and  {int}")
    public void user_fills_add_new_lookup_value_from_given_sheet_name_and(String sheetname, Integer rownumber) {

        //lookup Value Code
        lookupValueCode = testdata.get(rownumber).get("lookupValueCode");
        enterlookupValueCode(lookupValueCode);

        //lookup Value Name
        lookupValueName = testdata.get(rownumber).get("lookupValueName");
        enterlookupValueName(lookupValueName);

        //lookup Value Dec
        lookupValueDec = testdata.get(rownumber).get("lookupValueDec");
        enterlookupValueDescription(lookupValueDec);
    }

    @When("user clicks on save button in Lookup Value")
    public void user_clicks_on_save_button_in_lookup_value() {
        clickOnButtonslookupValue();
    }

    @When("user enter the value in search field Lookup Value from given sheet name {string} and  {int}")
    public void user_enter_the_value_in_search_field_lookup_value_from_given_sheet_name_and(String sheetname, Integer rownumber) {
        String SeacrchValueType = testdata.get(rownumber).get("SeacrchValueType");

        //Search the value based on code Value
        if (SeacrchValueType.equalsIgnoreCase("codeValue")){
            searchRecordValue(SeacrchValueType,lookupValueCode);

            //Search the value based on Name Value
        }else if (SeacrchValueType.equalsIgnoreCase("NameValue")){
            searchRecordValue(SeacrchValueType,lookupValueName);

            // //Search the value based on Dec Value
        }else if (SeacrchValueType.equalsIgnoreCase("DecValue")){
            searchRecordValue(SeacrchValueType,lookupValueDec);
        }
    }

    @When("user click on edit button in Lookup Value page")
    public void user_click_on_edit_button_in_lookup_value_page() {
        clickOnEditbtn();
        waitupto(3000);
        clickOnButtonsLookupType();
    }

    @When("user click on print button in Lookup Value page")
    public void user_click_on_print_button_in_lookup_value_page() {
//        DriverManager.getDriver().findElement(By.xpath("//input[@id='chkSelectAll']")).click();
//        waitupto(3000);
//        selectBulkPrintbtn();
    }

    @When("user click on back button in Lookup Value page")
    public void user_click_on_back_button_in_lookup_value_page() {
        waitupto(3000);
        DriverManager.getDriver().findElement(By.xpath("//input[@value='Back']")).click();
    }

    @When("user click on bulk print button in Lookup Types page")
    public void user_click_on_bulk_print_button_in_lookup_types_page() {
//        DriverManager.getDriver().findElement(By.xpath("//input[@id='chkSelectAll']")).click();
//        waitupto(3000);
//        selectBulkPrintbtn();
    }

    @When("user click on print button in Lookup Types page")
    public void user_click_on_print_button_in_lookup_types_page() {
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

    @When("user click on delete the record in Lookup Types page")
    public void user_click_on_delete_the_record_in_lookup_types_page() {
        DriverManager.getDriver().findElement(By.xpath("//input[@id='chkSelectAll']")).click();
        waitupto(3000);
        selectDeletebtn();
        waitupto(3000);
    }
}
