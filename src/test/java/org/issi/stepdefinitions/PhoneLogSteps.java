package org.issi.stepdefinitions;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.assertj.core.api.Assertions;
import org.issi.constants.FrameworkConstants;
import org.issi.driver.Driver;
import org.issi.driver.DriverManager;
import org.issi.enums.ConfigProperties;
import org.issi.enums.WaitStrategy;
import org.issi.pages.BasePage;
import org.issi.utilities.ExcelReader;
import org.issi.utilities.PropertyUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import static org.issi.pages.LoginPage.doLogin;
import static org.issi.pages.PhoneLogPage.*;

public class PhoneLogSteps {
    public List<Map<String, String>> testdata;
    public String phoneType;
    public String FirstNameType;
    public String RegisteredPhoneNumberType;
    public String CallDateType;
    public String CityType;
    public String LastNameType;
    public String CallType;
    public String CallReasonType;
    public String CallStartTime;
    public String CallEndTime;
    /*
     * ##############################################################
     *
     * Module name --->PhoneLog
     * stepdefinitions --> PhoneLog steps
     *
     * ##############################################################
     */
    @Given("user has already logged in to application")
    public void user_has_already_logged_in_to_application(DataTable dataTable) {
        List<Map<String, String>> credList = dataTable.asMaps(String.class, String.class);
        String username = credList.get(0).get("username");
        String password = credList.get(0).get("password");
        DriverManager.getDriver().get(PropertyUtils.getValue(ConfigProperties.URL));
        doLogin(username, password);
    }

    @When("user clicks on PhoneLog menu")
    public void user_clicks_on_phone_log_menu() {
        clickOnPhoneLog();
    }

    @When("user clicks on Add New PhoneLog link")
    public void user_clicks_on_add_new_phone_log_link() {
        clickOnAddNewPhoneLog();
    }

    @Then("User enter in to Add_Edit Call Log page and enter details from given sheet name {string} and {int}")
    public void user_enter_in_to_add_edit_call_log_page_and_enter_details_from_given_sheet_name_and(String sheetname, Integer rownumber) {
        ExcelReader reader = new ExcelReader();
        try {
            testdata = reader.getData(FrameworkConstants.getExcelFilePath(), sheetname);

            //Contact Information
            String ExistingMember = testdata.get(rownumber).get("ExistingMember");
            String MemberID = testdata.get(rownumber).get("MemberID");
            if (ExistingMember.equalsIgnoreCase("Yes")){
                clickOnExistingMember(ExistingMember);
                enterMemberID(MemberID);
            }else if (ExistingMember.equalsIgnoreCase("No")){
                clickOnExistingMember(ExistingMember);
            }

            //MedicarePlan
            String MedicarePlanType = testdata.get(rownumber).get("MedicarePlan");
            selectMedicarePlan(MedicarePlanType);

            //PhoneType
            phoneType = testdata.get(rownumber).get("PhoneType");
            selectPhoneType(phoneType);

            //Registered Phone Number
            RegisteredPhoneNumberType = testdata.get(rownumber).get("RegisteredPhoneNumber");
            enterDocumentName(RegisteredPhoneNumberType);

            //Ext
            String ExtType = testdata.get(rownumber).get("Ext");
            enterextValue(ExtType);

            //Title
            String TitleType = testdata.get(rownumber).get("Title");
            selecttitle(TitleType);

            //First Name
            FirstNameType = testdata.get(rownumber).get("FirstName");
            enterfirstName(FirstNameType);

            //Last Name
            LastNameType = testdata.get(rownumber).get("LastName");
            enterlastName(LastNameType);

            //Middle Name
            String MiddleNameType = testdata.get(rownumber).get("MiddleName");
            entermiddleName(MiddleNameType);

            //E_mail
            String E_mailType = testdata.get(rownumber).get("E_mail");
            entere_mailBtn(E_mailType);

            //Address
            String AddressType = testdata.get(rownumber).get("Address");
            enteraddress(AddressType);

            //City
            CityType = testdata.get(rownumber).get("City");
            entercity(CityType);

            //State
            String StateType = testdata.get(rownumber).get("State");
            selecstate(StateType);

            //County
            String CountyType = testdata.get(rownumber).get("County");
            selectcounty(CountyType);

            //Zip Code
            String ZipCodeType = testdata.get(rownumber).get("ZipCode");
            enterzipCodeBtn(ZipCodeType);

            //Call Information
            //Call Type
            CallType = testdata.get(rownumber).get("CallType");
            selectcallType(CallType);

            //Call Reason
            CallReasonType = testdata.get(rownumber).get("CallReason");
            selectCallReason(CallReasonType);

            //Call Date
            CallDateType = testdata.get(rownumber).get("CallDate");
            entercallDate(CallDateType);

            //Call Start Time
            CallStartTime = testdata.get(rownumber).get("CallStartTime");
            enterCallTime(CallStartTime);

            //Call End Time
            CallEndTime = testdata.get(rownumber).get("CallEndTime");
            enterCallEndTime(CallEndTime);

            //Call Notes
            String CallNotes = testdata.get(rownumber).get("CallNotes");
            enterCallNotes(CallNotes);

            //Application Packet Information
            //Application packet sent to the contact person click on Yes
            String Applicationpacketsenttothecontactperson = testdata.get(rownumber).get("Applicationpacketsenttothecontactperson");
            if (Applicationpacketsenttothecontactperson.contentEquals("Yes")){
                selectConfidentialOption(Applicationpacketsenttothecontactperson);

                //Application Packet Number
                String ApplicationPacketNumber = testdata.get(rownumber).get("ApplicationPacketNumber");
                enterapplicationPacketNumber(ApplicationPacketNumber);

                //Application Form Number
                String ApplicationFormNumber = testdata.get(rownumber).get("ApplicationFormNumber");
                enterapplicationFormNumber(ApplicationFormNumber);

                //Is mailing address same as contact address click on Yes
                String Ismailingaddresssameascontactaddress = testdata.get(rownumber).get("Ismailingaddresssameascontactaddress");
                if (Ismailingaddresssameascontactaddress.contentEquals("Yes")){
                    clickismailingaddresssamescontactaddress(Ismailingaddresssameascontactaddress);

                    //Validating fields in Application Packet Information
                    //Address
                    String ContactAddressValue=  DriverManager.getDriver().findElement(addressText).getAttribute("value");
                    String MailingAddressValue=  DriverManager.getDriver().findElement(AddressText).getAttribute("value");
                    Assertions.assertThat(ContactAddressValue).isEqualTo(MailingAddressValue);
                    waitupto(1000);
                    //city
                    String ContactcityText=  DriverManager.getDriver().findElement(cityText).getAttribute("value");
                    String MailingCityText=  DriverManager.getDriver().findElement(MailCityText).getAttribute("value");
                    Assertions.assertThat(ContactcityText).isEqualTo(MailingCityText);
                    waitupto(1000);

                    //state
                    String ContactstateDropDown=  DriverManager.getDriver().findElement(stateDropDown).getAttribute("value");
                    String MailingStateDropDown=  DriverManager.getDriver().findElement(StateDropDown).getAttribute("value");
                    Assertions.assertThat(ContactstateDropDown).isEqualTo(MailingStateDropDown);
                    waitupto(1000);

                    //county
                    String ContactcountyDropDown=  DriverManager.getDriver().findElement(countyDropDown).getAttribute("value");
                    String MailingCountyDropDown=  DriverManager.getDriver().findElement(CountyDropDown).getAttribute("value");
                    Assertions.assertThat(ContactcountyDropDown).isEqualTo(MailingCountyDropDown);
                    waitupto(1000);

                    //zipCode
                    String ContactzipCodeText=  DriverManager.getDriver().findElement(zipCodeText).getAttribute("value");
                    String MailingZipCodeText=  DriverManager.getDriver().findElement(ZipCodeText).getAttribute("value");
                    Assertions.assertThat(ContactzipCodeText).isEqualTo(MailingZipCodeText);
                    waitupto(1000);

                    //Is mailing address same as contact address click on No
                }else if (Ismailingaddresssameascontactaddress.contentEquals("No")){
                    clickismailingaddresssamescontactaddress(Ismailingaddresssameascontactaddress);

                    //Address
                    String AddressPacketIN = testdata.get(rownumber).get("AddressPacketIN");
                    enterAddress(AddressPacketIN);

                    //City
                    String CityPacketIN = testdata.get(rownumber).get("CityPacketIN");
                    enterCity(CityPacketIN);

                    //State
                    String StatePacketIN = testdata.get(rownumber).get("StatePacketIN");
                    selectState(StatePacketIN);

                    //County
                    String CountyPacketIN = testdata.get(rownumber).get("CountyPacketIN");
                    selectCounty(CountyPacketIN);

                    //ZipCode
                    String ZipCodePacketIN = testdata.get(rownumber).get("ZipCodePacketIN");
                    enterZipCode(ZipCodePacketIN);
                }
            }else if (Applicationpacketsenttothecontactperson.contentEquals("No")){
                selectConfidentialOption(Applicationpacketsenttothecontactperson);
                waitupto(3000);
            }
        } catch (InvalidFormatException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    @Then("user click on save from given sheet name")
    public void user_click_on_save_from_given_sheet_name() {
        clickOnButtons();
        waitupto(3000);
    }
    @Then("User search the value from given sheet name {string} and {int}")
    public void user_search_the_value_from_given_sheet_name_and(String sheetname, Integer rownumber) {
        waitupto(3000);
        // Search value by phoneType;
        String SearchRecord = testdata.get(rownumber).get("SearchRecord");
        if (SearchRecord.equalsIgnoreCase("PhoneType")) {
            searchRecord(SearchRecord, phoneType);
            //Search value by Registered Phone Number Type,
        }else  if (SearchRecord.equalsIgnoreCase("Phone")) {
            searchRecord(SearchRecord, RegisteredPhoneNumberType);
            //Search value by Caller name,
        } else if (SearchRecord.equalsIgnoreCase("CallerName")) {
            searchRecord(SearchRecord, FirstNameType+" "+LastNameType);
            //Search value by CallDateType,
        }else if (SearchRecord.equalsIgnoreCase("CallDate")) {
            searchRecord(SearchRecord, CallDateType);
            //Search value by CityType
        }else if (SearchRecord.equalsIgnoreCase("City")) {
            searchRecord(SearchRecord, CityType);
        }
    }

    @Then("user click on edit button")
    public void user_click_on_edit_button() {
        waitupto(2000);
        DriverManager.getDriver().findElement(By.xpath("//a[@title='Edit']")).click();
        waitupto(3000);

    }

    @Then("User search the value in the Phone log information from given sheet name {string} and {int}")
    public void user_search_the_value_in_the_phone_log_information_from_given_sheet_name_and(String sheetname, Integer rownumber) {
        String SearchRecordForPhoneLogINfo = testdata.get(rownumber).get("SearchRecordForPhoneLogINfo");
        if (SearchRecordForPhoneLogINfo.equalsIgnoreCase("CallType")){
            searchRecordPhoneLogInf(SearchRecordForPhoneLogINfo,CallType);
        }else if (SearchRecordForPhoneLogINfo.equalsIgnoreCase("CallReason")){
            searchRecordPhoneLogInf(SearchRecordForPhoneLogINfo,CallReasonType);
        }else if (SearchRecordForPhoneLogINfo.equalsIgnoreCase("CallStart")){
            searchRecordPhoneLogInf(SearchRecordForPhoneLogINfo,CallStartTime);
        }else if (SearchRecordForPhoneLogINfo.equalsIgnoreCase("CallEnd")){
            searchRecordPhoneLogInf(SearchRecordForPhoneLogINfo,CallEndTime);
        }

    }
    @Then("user click on edit button in the Phone log information")
    public void user_click_on_edit_button_in_the_phone_log_information() {
        waitupto(2000);
        DriverManager.getDriver().findElement(By.xpath("//a[@title='Edit']")).click();
        waitupto(3000);
    }
    @Then("User click on save button")
    public void user_click_on_save_button() {
        clickOnButtons();
    }

    @Then("user click on bulk print button in phone log")
    public void user_click_on_bulk_print_button_in_phone_log() {
        String showDropdown="//select[@name='tblPhoneLog_length']";

        if (DriverManager.getDriver().findElement(By.xpath(showDropdown)).isDisplayed()) {
            waitupto(3000);
            BasePage.clickOn(By.xpath(showDropdown), WaitStrategy.VISIBLE, "All records displayed");
            waitupto(1000);
            BasePage.selectFromDrpDwn(By.xpath(showDropdown), WaitStrategy.VISIBLE, "All", "All records displayed");
        }
        waitupto(3000);
        selectCheckBox();
        waitupto(3000);
        selectBulkPrintbtn();
    }

    @Then("user click on single print button in phone log")
    public void user_click_on_single_print_button_in_phone_log() {
        waitupto(2000);
        clickOnPrintbtn();
        waitupto(3000);
        String parentWin = DriverManager.getDriver().getWindowHandle();
        waitupto(1000);
        String childwin = switchToWindow(parentWin);
        waitupto(1000);
        DriverManager.getDriver().switchTo().window(childwin);
        waitupto(1000);
        DriverManager.getDriver().close();
        waitupto(1000);
        DriverManager.getDriver().switchTo().window(parentWin);
    }

    @Then("user click on delete button in phone log")
    public void user_click_on_delete_button_in_phone_log() {
        waitupto(3000);
        selectDeletebtn();
        waitupto(3000);
    }

}
