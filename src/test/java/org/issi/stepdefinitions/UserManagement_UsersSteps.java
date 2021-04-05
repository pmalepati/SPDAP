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

import static org.issi.pages.UserManagement_UsersPage.*;

public class UserManagement_UsersSteps {

    public List<Map<String, String>> testdata;
    public String UserName;
    public String FirstName;
    public String LastName;
    public String E_mail;
    public String WorkNumber;
    /*
     * ##############################################################
     *
     * Module name --->Administrator
     * Sub-mobule name --->SPDAP User and Role manager
     * Sub-mobule name --->Users
     * StepDefination -->Users steps
     *
     * ##############################################################
     */
    @When("user clicks on Administrator menu")
    public void user_clicks_on_administrator_menu() {
        clickOnAdministrator();
    }

    @When("user click on SPDAP User and Role manager link")
    public void user_click_on_spdap_user_and_role_manager_link() {
        clickOnRolemanager();
    }

    @When("user click on User module")
    public void user_click_on_user_module() {
        clickOnUsers();
    }

    @When("user clicks on Add New User link")
    public void user_clicks_on_add_new_user_link() {
        clickOnAddNewUserlink();
    }

    @When("user fills Add_Edit user information from given sheet name {string} and  {int}")
    public void user_fills_add_edit_user_information_from_given_sheet_name_and(String sheetname, Integer rownumber) {
        ExcelReader reader = new ExcelReader();
        try {
            testdata = reader.getData(FrameworkConstants.getExcelFilePath(), sheetname);

            //User Name
            UserName = testdata.get(rownumber).get("UserName");
            enterRegUserName(UserName);

            //Password
            String Password = testdata.get(rownumber).get("Password");
            enterRegPassword(Password);

            //Role
            String Role = testdata.get(rownumber).get("Role");
            selectrole(Role);

            //Title
            String Title = testdata.get(rownumber).get("Title");
            selectTitle(Title);

            //First Name
            FirstName = testdata.get(rownumber).get("FirstName");
            enterFirstName(FirstName);

            //Middle Name
            String MiddleName = testdata.get(rownumber).get("MiddleName");
            enterMiddleName(MiddleName);

            //Last Name
            LastName = testdata.get(rownumber).get("LastName");
            enterLastName(LastName);

            //Suffix
            String Suffix = testdata.get(rownumber).get("Suffix");
            selectSuffix(Suffix);

            //Date of Birth
            String DateofBirth = testdata.get(rownumber).get("DateofBirth");
            selectDOB(DateofBirth);

            //E-mail
            E_mail = testdata.get(rownumber).get("E_mail");
            enterEmailId(E_mail);

            //Mobile Number
            String MobileNumber = testdata.get(rownumber).get("MobileNumber");
            enterMobileNumber(MobileNumber);

            //Home Number
            String HomeNumber = testdata.get(rownumber).get("HomeNumber");
            enterhomeNumber(HomeNumber);

            //Work Number
            WorkNumber = testdata.get(rownumber).get("WorkNumber");
            enterworkNumber(WorkNumber);

            //Ext
            String Ext = testdata.get(rownumber).get("Ext");
            enterextNumber(Ext);

            //Address 1
            String AddressField = testdata.get(rownumber).get("AddressField");
            enterAddress(AddressField);

            //City
            String City = testdata.get(rownumber).get("City");
            enterCity(City);

            //State
            String State = testdata.get(rownumber).get("State");
            selectState(State);

            //County
            String County = testdata.get(rownumber).get("County");
            selectCounty(County);

            //Zipcode
            String Zipcode = testdata.get(rownumber).get("Zipcode");
            selectZipcode(Zipcode);

        } catch (InvalidFormatException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @When("user clicks on save button")
    public void user_clicks_on_save_button() {
        //Save button
        clickOnButtons();
        BasePage.waitupto(2000);
    }

    @When("user enter the value in search field from given sheet name {string} and  {int}")
    public void user_enter_the_value_in_search_field_from_given_sheet_name_and(String string, Integer rownumber) {
        //Search the value
        String SearchRecord = testdata.get(rownumber).get("SearchRecord");

        //Search the value by User Name
        if (SearchRecord.equalsIgnoreCase("User Name")) {
            searchRecordUsers(SearchRecord, UserName);

            //Search the value by First Name
        }else  if (SearchRecord.equalsIgnoreCase("First Name")) {
            searchRecordUsers(SearchRecord, FirstName);

            //Search the value by Last name
        } else if (SearchRecord.equalsIgnoreCase("Last name")) {
            searchRecordUsers(SearchRecord, LastName);

            //Search the value by eMail
        }else if (SearchRecord.equalsIgnoreCase("eMail")) {
            searchRecordUsers(SearchRecord, E_mail);

            //Search the value by Phone Number
        }else if (SearchRecord.equalsIgnoreCase("PhoneNumber")) {
            searchRecordUsers(SearchRecord, WorkNumber);
        }
    }

    @When("user click on edit button in Users Page")
    public void user_click_on_edit_button_in_users_page() {
        //Edit button and save the record
        if (!DriverManager.getDriver().findElements(By.xpath("(//input[@type='checkbox'])[2]")).isEmpty()) {
            DriverManager.getDriver().findElement(By.xpath("(//a[@title='Edit'])[1]")).click();
            BasePage.waitupto(2000);
            clickOnButtons();
        }
    }

    @When("user click on bulk print button in Users Page")
    public void user_click_on_bulk_print_button_in_users_page() {
        //Show all record in table
        String showDropdown="//select[@name='tblUser_length']";
        waitupto(2000);
        if (DriverManager.getDriver().findElement(By.xpath(showDropdown)).isDisplayed()) {
            waitupto(2000);
            BasePage.clickOn(By.xpath(showDropdown), WaitStrategy.VISIBLE, "All records displayed");
            BasePage.selectFromDrpDwn(By.xpath(showDropdown), WaitStrategy.VISIBLE, "All", "All records displayed");
        }
        //Bulk print
        waitupto(2000);
        selectCheckBox();
        waitupto(2000);
        //selectBulkPrintbtn();
    }

    @When("user click on single print button in Users Page")
    public void user_click_on_single_print_button_in_users_page() {
        //Print the particular record
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
    @When("user click on delete button in Users Page")
    public void user_click_on_delete_button_in_users_page() {
        //Delete the particular record
        waitupto(2000);
        selectDeletebtn();
        waitupto(2000);
    }
}
