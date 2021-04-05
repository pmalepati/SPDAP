package org.issi.pages;

import org.issi.driver.DriverManager;
import org.issi.enums.WaitStrategy;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import java.util.Iterator;
import java.util.Set;

import static org.issi.pages.BasePage.clickOn;

public class UserManagement_UsersPage extends BasePage{
    public static Actions action;
    public static final  By clickOnRolemanager=By.xpath("//a[text()='SPDAP User and Role manager']");
    public static final  By clickOnUsers=By.xpath("//a[text()='Users']");

    /*
     * ##############################################################
     *
     * Module name --->Administrator
     * Sub-mobule name --->SPDAP User and Role manager
     * Sub-mobule name --->Users
     * Page -->Users Elements
     *
     * ##############################################################
     */
    protected UserManagement_UsersPage() {
    }

    private static final  By clickOnAdministrator=By.xpath("//a[text()='Administrator ']");
    public static void clickOnAdministrator(){
        waitupto(1000);
        clickOn(clickOnAdministrator, WaitStrategy.CLICKABLE,"Administrator");
        waitupto(1000);
    }

    public static void clickOnRolemanager(){
        action = new Actions(DriverManager.getDriver());
        WebElement mainMenu = DriverManager.getDriver().findElement(clickOnRolemanager);
        action.moveToElement(mainMenu);
    }

    public static void clickOnUsers(){
        WebElement mainMenu2 =DriverManager.getDriver().findElement(clickOnUsers);
        action.moveToElement(mainMenu2).click().build().perform();
    }

    private static final  By clickOnAddNewUser=By.xpath("//a[@id='addnewRole']");
    public static void clickOnAddNewUserlink(){
        waitupto(1000);
        clickOn(clickOnAddNewUser, WaitStrategy.CLICKABLE,"Add New User ->");
        waitupto(1000);
    }

    private static final  By userNameEnter=By.xpath("//input[@id='txtUsername']");
    public static void enterRegUserName(String username) {
        enterText(userNameEnter, username, WaitStrategy.PRESENCE, "User Name ->");
        waitupto(1000);
    }

    private static final  By passwordEnter=By.xpath("//input[@id='txtPassword']");
    public static void enterRegPassword(String password) {
        enterText(passwordEnter, password, WaitStrategy.PRESENCE, "Password ->");
        waitupto(1000);
    }

    private static final  By roleDropDown=By.xpath("//select[@id='ddlRole']");
    public static void selectrole(String roleValue) {
        selectFromDrpDwn(roleDropDown, WaitStrategy.CLICKABLE, roleValue, "role value ->");
        waitupto(1000);
    }

    private static final  By titleDropDown=By.xpath(" //select[@id='ddlTitle']");
    public static void selectTitle(String titleValue) {
        selectFromDrpDwn(titleDropDown, WaitStrategy.CLICKABLE, titleValue, "title value ->");
        waitupto(1000);
    }

    private static final  By firstNameText=By.xpath("//input[@id='txtFirstName']");
    public static void enterFirstName(String firstName) {
        enterText(firstNameText, firstName, WaitStrategy.PRESENCE, "First Name ->");
        waitupto(1000);
    }

    private static final  By middleNameText=By.xpath("//input[@id='txtMiddleName']");
    public static void enterMiddleName(String middleName) {
        enterText(middleNameText, middleName, WaitStrategy.PRESENCE, "Middle Name ->");
        waitupto(1000);
    }

    private static final  By lastNameText=By.xpath(" //input[@id='txtLastname']");
    public static void enterLastName(String lastName) {
        enterText(lastNameText, lastName, WaitStrategy.PRESENCE, "Last Name ->");
        waitupto(1000);
    }

    private static final  By suffixDropDown=By.xpath(" //select[@id='ddlSuffix']");
    public static void selectSuffix(String suffixValue) {
        selectFromDrpDwn(suffixDropDown, WaitStrategy.CLICKABLE, suffixValue, "Suffix Value ->");
        waitupto(1000);
    }

    private static final  By DOBText=By.xpath("//input[@id='txtDOB']");
    public static void selectDOB(String dateofbirth) {
        enterText(DOBText, dateofbirth, WaitStrategy.PRESENCE, "Date pf Birth ->");
        waitupto(1000);
    }

    private static final  By eMailText=By.xpath("//input[@id='txtemail']");
    public static void enterEmailId(String emailid) {
        enterText(eMailText, emailid, WaitStrategy.PRESENCE, "Email id ->");
        waitupto(1000);
    }

    private static final  By mobileNumberText=By.xpath(" //input[@id='txtMobNum']");
    public static void enterMobileNumber(String mobilenum) {
        enterText(mobileNumberText, mobilenum, WaitStrategy.PRESENCE, "Mobile Number ->");
        waitupto(1000);
    }

    private static final  By homeNumberText=By.xpath(" //input[@id='txtHomeNum']");
    public static void enterhomeNumber(String homeNumber) {
        enterText(homeNumberText, homeNumber, WaitStrategy.PRESENCE, "home Number ->");
        waitupto(1000);
    }

    private static final  By workNumberText=By.xpath("//input[@id='txtWorkNum']");
    public static void enterworkNumber(String workNumber) {
        enterText(workNumberText, workNumber, WaitStrategy.PRESENCE, "work Number ->");
        waitupto(1000);
    }

    private static final  By extNumberText=By.xpath(" //input[@id='txtExtNum']");
    public static void enterextNumber(String extNumber) {
        enterText(extNumberText, extNumber, WaitStrategy.PRESENCE, "ext Number ->");
        waitupto(1000);
    }

    private static final  By addressText=By.xpath(" //textarea[@id='txtAddress']");
    public static void enterAddress(String address) {
        enterText(addressText, address, WaitStrategy.PRESENCE, "Address ->");
        waitupto(1000);
    }

    private static final  By cityText=By.xpath("//input[@id='txtCity']");
    public static void enterCity(String city) {
        enterText(cityText, city, WaitStrategy.PRESENCE, "City ->");
        waitupto(1000);
    }

    private static final  By stateDropDown=By.xpath("//select[@id='ddlState']");
    public static void selectState(String state) {
        selectFromDrpDwn(stateDropDown, WaitStrategy.CLICKABLE, state, "State ->");
        waitupto(1000);
    }

    private static final  By countyDropDown=By.xpath("//select[@id='ddlcounty']");
    public static void selectCounty(String county) {
        selectFromDrpDwn(countyDropDown, WaitStrategy.CLICKABLE, county, "County ->");
        waitupto(1000);
    }

    private static final  By zipCodeText=By.xpath(" //input[@id='txtZipCode']");
    public static void selectZipcode(String zipcode) {
        enterText(zipCodeText, zipcode, WaitStrategy.PRESENCE, "Zip Code ->");
        waitupto(1000);
    }

    private static final By savebtn = By.xpath("//input[@value='Save']");
    public static void clickOnButtons(){
        clickOn(savebtn,WaitStrategy.CLICKABLE,"Click on Save Button");
    }

    private static final By SearchUserNameText = By.xpath("//input[@id='SearchUserName']");
    private static final By SearchFirstNameText = By.xpath("//input[@id='SearchFirstName']");
    private static final By SearchLastnameText = By.xpath("//input[@id='SearchLastName']");
    private static final By SearchEMailText = By.xpath("//input[@id='SearchEmail']");
    private static final By SearchPhoneNumberText = By.xpath("//input[@id='SearchPhoneNo']");

    public static void searchRecordUsers(String searchValue,String value){
        if (searchValue.equalsIgnoreCase("User Name")){
            enterText(SearchUserNameText,value,WaitStrategy.PRESENCE,"Search User Name ->");

        }else if (searchValue.equalsIgnoreCase("First Name")){
            enterText(SearchFirstNameText,value,WaitStrategy.PRESENCE,"Search First Name ->");

        }else if (searchValue.equalsIgnoreCase("Last name")){
            enterText(SearchLastnameText,value,WaitStrategy.PRESENCE,"Search Last name ->");

        }else if (searchValue.equalsIgnoreCase("eMail")){
            enterText(SearchEMailText,value,WaitStrategy.PRESENCE,"Search eMail ->");

        }else if (searchValue.equalsIgnoreCase("PhoneNumber")){
            enterText(SearchPhoneNumberText,value,WaitStrategy.PRESENCE,"Search PhoneNumber ->");
        }
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
        waitupto(2000);
        DriverManager.getDriver().switchTo().alert().accept();
    }

    private static final By clickOnPrintbtn = By.xpath("//a[@title='Print']");
    public static void clickOnPrintbtn(){
        clickOn(clickOnPrintbtn,WaitStrategy.CLICKABLE,"Click On print button");
        waitupto(2000);
    }

    private static final By selectAllCheckBox = By.xpath("//input[@id='chkSelectAll']");
    public static void selectCheckBox(){
        clickOn(selectAllCheckBox,WaitStrategy.CLICKABLE,"Select All Check Box");
        waitupto(1000);
    }
}