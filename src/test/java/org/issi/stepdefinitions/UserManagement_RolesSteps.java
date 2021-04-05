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

import static org.issi.pages.UserManagement_RolesPage.*;
import static org.issi.pages.UserManagement_UsersPage.enterRegUserName;
import static org.issi.pages.UserManagement_UsersPage.selectCheckBox;
import static org.issi.pages.UserManagement_UsersPage.selectDeletebtn;

public class UserManagement_RolesSteps {
    public List<Map<String, String>> testdata;
    public String RoleCode;
    public String RoleName;
    public String RoleDescription;
    /*
     * ##############################################################
     *
     * Module name --->Administrator
     * Sub-mobule name --->SPDAP User and Role manager
     * Sub-mobule name --->Roles
     * StepDefination -->Roles Steps
     *
     * ##############################################################
     */
    @When("user click on Roles module")
    public void user_click_on_roles_module() {
        clickOnRoleLink();
    }

    @When("user clicks on Add New Roles link")
    public void user_clicks_on_add_new_roles_link() {
        clickOnAddNewRole();
    }

    @When("user fills Add_Edit Role information from given sheet name {string} and  {int}")
    public void user_fills_add_edit_role_information_from_given_sheet_name_and(String sheetname, Integer rownumber) {
        ExcelReader reader = new ExcelReader();
        try {
            testdata = reader.getData(FrameworkConstants.getExcelFilePath(), sheetname);

            //Role Code
            RoleCode = testdata.get(rownumber).get("RoleCode");
            enterRoleCode(RoleCode);

            //Role name
            RoleName = testdata.get(rownumber).get("RoleName");
            enterRoleName(RoleName);

            //Role Descripti0n
            RoleDescription = testdata.get(rownumber).get("RoleDescription");
            enterRoleDescription(RoleDescription);
        } catch (InvalidFormatException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
    @When("user clicks on save button in Role page")
    public void user_clicks_on_save_button_in_role_page() {
        clickOnButtonsInRole();
    }

    @When("user enter the value in search field in Role page from given sheet name {string} and  {int}")
    public void user_enter_the_value_in_search_field_in_role_page_from_given_sheet_name_and(String sheetname, Integer rownumber) {

        String searchvalue = testdata.get(rownumber).get("searchvalue");
        //Search value based on Role code
        if (searchvalue.equalsIgnoreCase("Rolecode")){
            enterSearchValueInRole(searchvalue,RoleCode);

            //Search value based on Role Name
        }else if (searchvalue.equalsIgnoreCase("RoleName")) {
            enterSearchValueInRole(searchvalue, RoleName);

            //Search value based on Role Description
        }else if (searchvalue.equalsIgnoreCase("RoleDescription")) {
            enterSearchValueInRole(searchvalue, RoleDescription);
        }
    }
    @When("user click on edit button in Role page")
    public void user_click_on_edit_button_in_role_page() {
        DriverManager.getDriver().findElement(By.xpath("//a[@title='Edit']")).click();
        waitupto(2000);
        clickOnButtonsInRole();
    }

    @When("user click on bulk print button in Role page")
    public void user_click_on_bulk_print_button_in_role_page() {
        String showDropdown="//select[@name='tblroles_length']";
        waitupto(2000);
        if (DriverManager.getDriver().findElement(By.xpath(showDropdown)).isDisplayed()) {
            waitupto(2000);
            BasePage.clickOn(By.xpath(showDropdown), WaitStrategy.VISIBLE, "All records displayed");
            BasePage.selectFromDrpDwn(By.xpath(showDropdown), WaitStrategy.VISIBLE, "All", "All records displayed");
        }
        selectCheckBox();
        waitupto(2000);
        //selectBulkPrintbtn();

    }

    @When("user click on single print button in Role page")
    public void user_click_on_single_print_button_in_role_page() {
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

    @When("user click on delete button in Role page")
    public void user_click_on_delete_button_in_role_page() {
        waitupto(2000);
        selectDeletebtn();
        waitupto(2000);
    }
}
