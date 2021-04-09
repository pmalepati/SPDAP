package org.issi.pages;

import org.issi.driver.DriverManager;
import org.issi.enums.WaitStrategy;
import org.openqa.selenium.By;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;

public final class PhoneLogPage extends BasePage {

    /*
     * ##############################################################
     *
     * Module name --->PhoneLog
     * pages --> PhoneLog elements
     *
     * ##############################################################
     */
    protected PhoneLogPage() {

    }

    public  final static By clickOnPhoneLog=By.xpath("//a[text()='Phone Log']");
    public static void clickOnPhoneLog(){
        waitupto(1000);
        clickOn(clickOnPhoneLog, WaitStrategy.CLICKABLE,"Phone Log");
        waitupto(1000);
    }

    public  final static By clickOnAddNewPhoneLog=By.xpath("//a[@id='addnewPhonelog']");
    public static void clickOnAddNewPhoneLog(){
        waitupto(1000);
        clickOn(clickOnAddNewPhoneLog, WaitStrategy.CLICKABLE,"Add New PhoneLog");
        waitupto(1000);
    }

    public  final static By clickOnExistingMember_Yes=By.xpath("//input[@id='rbtnexistingmemberY']");
    public  final static By clickOnExistingMember_No=By.xpath("//input[@id='rbtnexistingmemberN']");

    public static void clickOnExistingMember(String Number){
        if (Number.equalsIgnoreCase("existing member")){
            clickOn(clickOnExistingMember_Yes, WaitStrategy.CLICKABLE,"Existing Member ->"+Number);

        }else if (Number.equalsIgnoreCase("PDP")){
            clickOn(clickOnExistingMember_No, WaitStrategy.CLICKABLE,"Existing Member ->"+Number);
        }
    }

    private static final By MemberIDText =By.xpath("//input[@id='txtAppnoMemberID']");
    public static void enterMemberID(String MemberID){
        enterText(MemberIDText,MemberID,WaitStrategy.PRESENCE,"MemberID Number ->");
        waitupto(1000);
    }

    private static final By medicarePlanDrpDwn =By.xpath("//select[@id='ddlMediCarePlan']");
    public static void selectMedicarePlan(String docType){
        selectFromDrpDwn(medicarePlanDrpDwn,WaitStrategy.CLICKABLE,docType,"document type ->");
        waitupto(1000);
    }

    private static final By workPhoneRadBtn = By.xpath("//select[@id='ddlCallerPhoneType']");
    public static void selectPhoneType(String phoneValue){
        selectFromDrpDwn(workPhoneRadBtn,WaitStrategy.CLICKABLE,phoneValue,"phone Value ->");
    }

    private static final By registeredPhoneNumberBtn = By.xpath("//input[@id='txtPhoneNum']");
    public static void enterDocumentName(String phoneNumber){
        enterText(registeredPhoneNumberBtn,phoneNumber,WaitStrategy.PRESENCE,"Registered Phone Number ->");
        waitupto(1000);
    }

    private static final By extBtn = By.xpath("//input[@id='txtExtNum']");
    public static void enterextValue(String extValue){
        enterText(extBtn,extValue,WaitStrategy.PRESENCE,"ext Value ->");
        waitupto(1000);
    }

    private static final By titleDropDown = By.xpath("//select[@id='ddlTitle']");
    public static void selecttitle(String titleValue){
        selectFromDrpDwn(titleDropDown,WaitStrategy.CLICKABLE,titleValue,"Title Value ->");
        waitupto(1000);
    }

    private static final By firstNameText = By.xpath(" //input[@id='txtFirstName']");
    public static void enterfirstName(String firstName){
        enterText(firstNameText,firstName,WaitStrategy.PRESENCE,"first Name ->");
        waitupto(1000);
    }

    private static final By lastNameText = By.xpath("//input[@id='txtLastName']");
    public static void enterlastName(String lastName){
        enterText(lastNameText,lastName,WaitStrategy.PRESENCE,"last Name ->");
        waitupto(1000);
    }
    private static final By middleNameText = By.xpath("//input[@id='txtMiddleName']");
    public static void entermiddleName(String middleName){
        enterText(middleNameText,middleName,WaitStrategy.PRESENCE,"middle Name ->");
        waitupto(1000);
    }
    private static final By e_mailText = By.xpath("//input[@id='txtEmail']");
    public static void entere_mailBtn(String EmailValue){
        enterText(e_mailText,EmailValue,WaitStrategy.PRESENCE,"Email Value ->");
        waitupto(1000);
    }
    public static  By addressText = By.xpath("//textarea[@id='txtAddress']");
    public static void enteraddress(String address){
        enterText(addressText,address,WaitStrategy.PRESENCE,"address Value ->");
        waitupto(1000);
    }
    public static  By cityText = By.xpath("//input[@id='txtCity']");
    public static void entercity(String cityValue){
        enterText(cityText,cityValue,WaitStrategy.PRESENCE,"city Value ->");
        waitupto(1000);
    }
    public static  By stateDropDown = By.xpath("//select[@id='ddlState']");
    public static void selecstate(String stateValue){
        selectFromDrpDwn(stateDropDown,WaitStrategy.CLICKABLE,stateValue,"state Value ->");
        waitupto(1000);
    }

    public static  By countyDropDown = By.xpath("//select[@id='ddlcounty']");
    public static void selectcounty(String countyValue){
        selectFromDrpDwn(countyDropDown,WaitStrategy.CLICKABLE,countyValue,"county Value ->");
        waitupto(1000);
    }
    public static  By zipCodeText = By.xpath("//input[@id='txtZipCode']");
    public static void enterzipCodeBtn(String zipCodeBtnValue){
        enterText(zipCodeText,zipCodeBtnValue,WaitStrategy.PRESENCE,"zipCode Value ->");
        waitupto(1000);
    }

    private static final By callTypeDropDown = By.xpath("//select[@id='ddlCallType']");
    public static void selectcallType(String callTypeValue){
        selectFromDrpDwn(callTypeDropDown,WaitStrategy.CLICKABLE,callTypeValue,"call Type Value ->");
        waitupto(1000);
    }
    private static final By CallReasonDropDown = By.xpath(" //select[@id='ddlCallReason']");
    public static void selectCallReason(String CallReasonValue){
        selectFromDrpDwn(CallReasonDropDown,WaitStrategy.CLICKABLE,CallReasonValue,"Call Reason Value ->");
        waitupto(1000);
    }
    private static final By callDateText = By.xpath("//input[@id='txtCallDateTime']");
    public static void entercallDate(String callDateValue){
        enterText(callDateText,callDateValue,WaitStrategy.PRESENCE,"call Date Value ->");
        waitupto(1000);
    }
    private static final By CallStartTimeText = By.xpath("//input[@id='txtCallStartTime']");
    public static void enterCallTime(String CallTimeValue){
        enterText(CallStartTimeText,CallTimeValue,WaitStrategy.PRESENCE,"Call Start Time ->");
        waitupto(1000);
    }
    private static final By CallEndTimeText = By.xpath("//input[@id='txtCallEndTime']");
    public static void enterCallEndTime(String callDurationValue){
        enterText(CallEndTimeText,callDurationValue,WaitStrategy.PRESENCE,"Call EndTime Value ->");
        waitupto(1000);
    }
    private static final By CallNotesText = By.xpath(" //textarea[@id='txtCallNotes']");
    public static void enterCallNotes(String CallNotesValue){
        enterText(CallNotesText,CallNotesValue,WaitStrategy.PRESENCE,"CallNotes Value ->");
        waitupto(1000);
    }

    private static final By Applicationpacketsenttothecontactperson_YES = By.xpath("//input[@id='rbtnRecieveddYes']");
    private static final By Applicationpacketsenttothecontactperson_NO = By.xpath("//input[@id='rbtnRecieveddNo']");
    public static void selectConfidentialOption(String confiValue){
        if (confiValue.equalsIgnoreCase("Yes")){
            clickOn(Applicationpacketsenttothecontactperson_YES,WaitStrategy.CLICKABLE,"Application packet sent to the contact person ->"+confiValue);
            waitupto(1000);
        }else if (confiValue.equalsIgnoreCase("No")){
            clickOn(Applicationpacketsenttothecontactperson_NO,WaitStrategy.CLICKABLE,"Application packet sent to the contact person ->"+confiValue);
            waitupto(1000);
        }
    }

    private static final By applicationPacketNumberText = By.xpath("//input[@id='txtPackNumber']");
    public static void enterapplicationPacketNumber(String PacketNumberValue){
        enterText(applicationPacketNumberText,PacketNumberValue,WaitStrategy.PRESENCE,"Packet Number Value ->");
        waitupto(1000);
    }

    private static final By applicationFormNumberText = By.xpath("//textarea[@id='txtApplicationNumbers']");
    public static void enterapplicationFormNumber(String FormNumberValue){
        enterText(applicationFormNumberText,FormNumberValue,WaitStrategy.PRESENCE,"Form Number Value ->");
        waitupto(1000);
    }
    private static final By ismailingaddresssamescontactaddress_YES = By.xpath("//input[@id='rbtnDeliveryYes']");
    private static final By ismailingaddresssameascontactaddress_NO = By.xpath("//input[@id='rbtnDeliveryNo']");

    public static void clickismailingaddresssamescontactaddress(String addressValue){
        if (addressValue.equalsIgnoreCase("Yes")){
            clickOn(ismailingaddresssamescontactaddress_YES,WaitStrategy.CLICKABLE,"address Value ->"+addressValue);
            waitupto(1000);
        }else if (addressValue.equalsIgnoreCase("No")){
            clickOn(ismailingaddresssameascontactaddress_NO,WaitStrategy.CLICKABLE,"address Value ->"+addressValue);
            waitupto(1000);
        }
    }

    public static  By AddressText = By.xpath(" //textarea[@id='txtDeliverAddress']");
    public static void enterAddress(String address){
        enterText(AddressText,address,WaitStrategy.PRESENCE,"Address Value ->");
        waitupto(1000);
    }
    public static By MailCityText = By.xpath(" //input[@id='txtDeliverCity']");
    public static void enterCity(String cityValue){
        enterText(MailCityText,cityValue,WaitStrategy.PRESENCE,"city Value ->");
        waitupto(1000);
    }

    public static By StateDropDown = By.xpath(" //select[@id='ddlDeliverState']");
    public static void selectState(String StateValue){
        selectFromDrpDwn(StateDropDown,WaitStrategy.CLICKABLE,StateValue,"State Value ->");
        waitupto(1000);
    }
    public static By CountyDropDown = By.xpath(" //select[@id='ddlDelivercounty']");
    public static void selectCounty(String CountyValue){
        selectFromDrpDwn(CountyDropDown,WaitStrategy.CLICKABLE,CountyValue,"County Value ->");
        waitupto(1000);
    }
    public static By ZipCodeText = By.xpath("//input[@id='txtDeliverZipCode']");
    public static void enterZipCode(String ZipCodeValue){
        enterText(ZipCodeText,ZipCodeValue,WaitStrategy.PRESENCE,"Zip Code Value ->");
        waitupto(1000);
    }

    private static final By savebtn = By.xpath("//input[@value='Save']");

    public static void clickOnButtons(){
        clickOn(savebtn,WaitStrategy.CLICKABLE,"Click on Save Button");
    }

    private static final By SearchPhoneTypeText = By.xpath(" //input[@id='SearchPhoneType']");
    private static final By SearchPhoneText = By.xpath("//input[@id='SearchPhone']");
    private static final By SearchCallerNameText = By.xpath(" //input[@id='SearchCallerName']");
    private static final By SearchCallDateText = By.xpath(" //input[@id='SearchCallDate']");
    private static final By SearchCityText = By.xpath("//input[@id='SearchCity']");

    public static void searchRecord(String searchValue,String value){
        if (searchValue.equalsIgnoreCase("PhoneType")){
            enterText(SearchPhoneTypeText,value,WaitStrategy.PRESENCE,"Search Phone Type ->");

        }else if (searchValue.equalsIgnoreCase("Phone")){
            enterText(SearchPhoneText,value,WaitStrategy.PRESENCE,"Search Phone ->");

        }else if (searchValue.equalsIgnoreCase("CallerName")){
            enterText(SearchCallerNameText,value,WaitStrategy.PRESENCE,"Search Caller Name ->");

        }else if (searchValue.equalsIgnoreCase("CallDate")){
            enterText(SearchCallDateText,value,WaitStrategy.PRESENCE,"Search Call Date ->");

        }else if (searchValue.equalsIgnoreCase("City")){
            enterText(SearchCityText,value,WaitStrategy.PRESENCE,"Search City ->");
        }
    }

    private static final By SearchLetterName = By.xpath("//input[@id='SearchLetterName']");
    private static final By SearchCallReason = By.xpath("//input[@placeholder='Call Reason']");
    private static final By SearchCallStart = By.xpath("//input[@placeholder='Call Start']']");
    private static final By SearchCallEnd = By.xpath("//input[@placeholder='Call End']");

    public static void searchRecordPhoneLogInf(String searchValue,String value){
        if (searchValue.equalsIgnoreCase("CallType")){
            enterText(SearchLetterName,value,WaitStrategy.PRESENCE,"Search Call Type ->");

        }else if (searchValue.equalsIgnoreCase("CallReason")){
            enterText(SearchCallReason,value,WaitStrategy.PRESENCE,"Call Reason ->");

        }else if (searchValue.equalsIgnoreCase("CallStart")){
            enterText(SearchCallStart,value,WaitStrategy.PRESENCE,"Search Call Start ->");

        }else if (searchValue.equalsIgnoreCase("CallEnd")){
            enterText(SearchCallEnd,value,WaitStrategy.PRESENCE,"Search Call End ->");
        }
    }


    private static final By selectAllCheckBox = By.xpath("//input[@id='chkSelectAll']");
    public static void selectCheckBox(){
        clickOn(selectAllCheckBox,WaitStrategy.CLICKABLE,"Select All Check Box");
        waitupto(1000);
    }

    private static final By clickOnBulkPrintbtn = By.xpath("//input[@value='Print']");
    public static void selectBulkPrintbtn(){

        clickOn(clickOnBulkPrintbtn,WaitStrategy.CLICKABLE,"Click On bulk print button to print all records");
        String printbtn = DriverManager.getDriver().getWindowHandle();
        Set<String> printbtn1 = DriverManager.getDriver().getWindowHandles();
        Iterator<String> printbt2 = printbtn1.iterator();
        while (printbt2.hasNext()) {
            String pt1 = printbt2.next();
            if (!printbtn.equals(pt1)) {
                DriverManager.getDriver().switchTo().window(pt1);
                waitupto(3000);
            }
        }
        DriverManager.getDriver().close();
        DriverManager.getDriver().switchTo().window(printbtn);
        waitupto(3000);
    }
    private static final By clickOnDeletebtn = By.xpath("//input[@value='Delete']");
    public static void selectDeletebtn(){
        clickOn(clickOnDeletebtn,WaitStrategy.CLICKABLE,"click on delect button to delete all records ");
        waitupto(1000);
        DriverManager.getDriver().switchTo().alert().accept();
    }
    private static final By clickOnPrintbtn = By.xpath("//a[@title='Print']");
    public static void clickOnPrintbtn(){
        clickOn(clickOnPrintbtn,WaitStrategy.CLICKABLE,"Click On print button");
        waitupto(1000);
    }
}