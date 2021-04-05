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
import static org.issi.pages.SPDAPConfigurations_MedicarePlanTypesPage.*;

public class SPDAPConfigurations_MedicarePlanTypesSteps {
    public List<Map<String, String>> testdata;
    public String OrganizationName;
    public String PlanNameValue;
    public String ContractID;
    public String PlanID;
    /*
     * ##############################################################
     *
     * Module name --->Administrator
     * Sub-mobule name --->SPDAPConfiguration
     * Sub-mobule name --->Medicare Plan Types
     * StepDefination --> Medicare Plan Types steps
     *
     * ##############################################################
     */

    @When("user click on Medicare Plan Types module")
    public void user_click_on_medicare_plan_types_module() {
        clickOnMedicarePlan();
    }

    @When("user clicks on Add New Medicare Plan")
    public void user_clicks_on_add_new_medicare_plan() {
        clickOnaddnewRole();
    }

    @When("user fills Add_Edit Medicare Plan Types from given sheet name {string} and  {int}")
    public void user_fills_add_edit_medicare_plan_types_from_given_sheet_name_and(String sheetname, Integer rownumber) {
        ExcelReader reader = new ExcelReader();
        try {
            testdata = reader.getData(FrameworkConstants.getExcelFilePath(), sheetname);

            //Organization Name
            OrganizationName = testdata.get(rownumber).get("OrganizationName");
            selectOrganizationName(OrganizationName);

            //Plan Name
            PlanNameValue = testdata.get(rownumber).get("PlanName");
            enterDocumentName(PlanNameValue);

            //Contract ID
            ContractID = testdata.get(rownumber).get("ContractID");
            enterContractID(ContractID);

            //Plan ID
            PlanID = testdata.get(rownumber).get("PlanID");
            enterPlanID(PlanID);

            //Part-C
            String PartC = testdata.get(rownumber).get("PartC");
            enterPartC(PartC);

            //Plan-D Basic
            String PlanDBasic = testdata.get(rownumber).get("PlanDBasic");
            enterPlanDBasic(PlanDBasic);

            //Part-D Supp
            String PartDSupp = testdata.get(rownumber).get("PartDSupp");
            enterPartDSupp(PartDSupp);

            //Plan-D Total
            String PlanDTotal = testdata.get(rownumber).get("PlanDTotal");
            enterPlanDTotal(PlanDTotal);

            //Part-D 100LIS
            String PartD100LIS = testdata.get(rownumber).get("PartD100LIS");
            enterPartD100LIS(PartD100LIS);

            //Plan-D 75LIS
            String PlanD75LIS = testdata.get(rownumber).get("PlanD75LIS");
            enterPlanD75LIS(PlanD75LIS);

            //Part-D 50LIS
            String PartD50LIS = testdata.get(rownumber).get("PartD50LIS");
            enterPartD50LIS(PartD50LIS);

            //Plan-D 25LIS
            String PlanD25LIS = testdata.get(rownumber).get("PlanD25LIS");
            enterPlanD25LIS(PlanD25LIS);

            //SPDAP Sub0LIS
            String SPDAPSub0LIS = testdata.get(rownumber).get("SPDAPSub0LIS");
            enterSPDAPSub0LIS(SPDAPSub0LIS);

            //SPDAP Sub25LIS
            String SPDAPSub25LIS = testdata.get(rownumber).get("SPDAPSub25LIS");
            enterSPDAPSub25LIS(SPDAPSub25LIS);

            //SPDAP-Sub50LIS
            String SPDAPSub50LIS = testdata.get(rownumber).get("SPDAPSub50LIS");
            enterSPDAPSub50LIS(SPDAPSub50LIS);

            //SPDAP-Sub75LIS
            String SPDAPSub75LIS = testdata.get(rownumber).get("SPDAPSub75LIS");
            enterSPDAPSub75LIS(SPDAPSub75LIS);

            //ConPlan-ID
            String ConPlanID = testdata.get(rownumber).get("ConPlanID");
            enterConPlanID(ConPlanID);
        } catch (InvalidFormatException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @When("user clicks on save button in Medicare Plan Types")
    public void user_clicks_on_save_button_in_medicare_plan_types() {
        waitupto(2000);
        clickOnButtonsInMediacrePlan();
    }

    @When("user enter the value in search field in Medicare Plan Types from given sheet name {string} and  {int}")
    public void user_enter_the_value_in_search_field_in_medicare_plan_types_from_given_sheet_name_and(String sheetname, Integer rownumber) {
        String SearchRecord = testdata.get(rownumber).get("searchvalue");
        String SearchRecord2 = testdata.get(rownumber).get("searchvalue2");

        //Search the value based on Organization
        if (SearchRecord.equalsIgnoreCase("Organization")) {
            searchRecordInMedicarePlan(SearchRecord,OrganizationName);
            waitupto(2000);
            searchRecordInMedicarePlan(SearchRecord2, PlanNameValue);

            //Search the value based on Plan
        } else if (SearchRecord.equalsIgnoreCase("Plan")) {
            searchRecordInMedicarePlan(SearchRecord, PlanNameValue);

            //Search the value based on Contract-ID
        } else if (SearchRecord.equalsIgnoreCase("ContractID")) {
            searchRecordInMedicarePlan(SearchRecord, ContractID);

            //Search the value based on Plan-ID
        } else if (SearchRecord.equalsIgnoreCase("PlanID")) {
            searchRecordInMedicarePlan(SearchRecord, PlanID);
        }
    }

    @When("user click on edit button in Medicare Plan Types page")
    public void user_click_on_edit_button_in_medicare_plan_types_page() {
        DriverManager.getDriver().findElement(By.xpath("//a[@title='Edit']")).click();
        waitupto(2000);
        clickOnButtonsInMediacrePlan();
    }

    @When("user click on bulk print button in Medicare Plan Types page")
    public void user_click_on_bulk_print_button_in_medicare_plan_types_page() {
        waitupto(2000);
        String showDropdown="//select[@name='tblMedicarePlan_length']";

        if (DriverManager.getDriver().findElement(By.xpath(showDropdown)).isDisplayed()) {
            waitupto(3000);
            BasePage.clickOn(By.xpath(showDropdown), WaitStrategy.VISIBLE, "All records displayed");
            BasePage.selectFromDrpDwn(By.xpath(showDropdown), WaitStrategy.VISIBLE, "All", "All records displayed");
        }
        waitupto(3000);
        selectCheckBox();
        waitupto(3000);
        // selectBulkPrintbtnMP();
    }

    @When("user click on print button in Medicare Plan Types page")
    public void user_click_on_print_button_in_medicare_plan_types_page() {
//        waitupto(3000);
//        clickOnPrintbtnMP();
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

    @When("user click on delete the record in Medicare Plan Types page")
    public void user_click_on_delete_the_record_in_medicare_plan_types_page() {
        waitupto(3000);
        selectDeletebtnMP();
        waitupto(3000);
    }
}
