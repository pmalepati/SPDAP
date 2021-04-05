package org.issi.pages;

import org.issi.driver.DriverManager;
import org.issi.enums.WaitStrategy;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class SPDAPConfiguration_OrganizationsPage extends BasePage{

    /*
     * ##############################################################
     *
     * Module name ---> Administrator
     * Sub-mobule name ---> SPDAPConfiguration
     * Sub-mobule name ---> Organizations
     * Page --> Organizations elements
     *
     * ##############################################################
     */

    public static Actions action;
    protected SPDAPConfiguration_OrganizationsPage() {

    }

    public  final static By clickONSPDAPConfigurations=By.xpath("//a[contains(text(),'SPDAP Configurations')]");
    public static void clickOnSPDAPConfigurations(){
        action = new Actions(DriverManager.getDriver());
        WebElement mainMenu = DriverManager.getDriver().findElement(clickONSPDAPConfigurations);
        action.moveToElement(mainMenu);
    }

    public static final By clickOnOrganizations=By.xpath("//a[contains(text(),'Organizations')]");
    public static void clickOnOrganizations(){
        clickOnSPDAPConfigurations();
        WebElement mainMenu2 =DriverManager.getDriver().findElement(clickOnOrganizations);
        action.moveToElement(mainMenu2).click().build().perform();
    }

    public static final By clickOnaddnewRole=By.xpath("//a[@id='addnewRole']");
    public static void clickOnaddnewRole(){
        waitupto(1000);
        clickOn(clickOnaddnewRole, WaitStrategy.CLICKABLE,"Add New Role");
        waitupto(1000);
    }

    public static final By organizationNameText=By.xpath("//label[contains(text(),'Organization Name')]/../input[@id='txtOrganizationName']");
    public static void enterOrganizationName(String organizationName){
        waitupto(1000);
        enterText(organizationNameText,organizationName,WaitStrategy.PRESENCE,"Organization Name");
    }

    public static final By curretMembersText=By.xpath("//label[contains(text(),'Curret Members')]/../input[@id='txtOrganizationName']");
    public static void enterCurretMembers(String curretMembers){
        waitupto(1000);
        enterText(curretMembersText,curretMembers,WaitStrategy.PRESENCE,"curret Members");
    }

    public static final By prospectiveMembersText=By.xpath("//label[contains(text(),'Prospective Members')]/../input[@id='txtOrganizationName']");
    public static void enterProspectiveMembers(String prospectiveMembers){
        waitupto(1000);
        enterText(prospectiveMembersText,prospectiveMembers,WaitStrategy.PRESENCE,"prospective Members");
    }

    private static final By titleDrpDwn =By.xpath("//select[@id='ddlTitle']");
    public static void selectTitle(String title){
        selectFromDrpDwn(titleDrpDwn,WaitStrategy.CLICKABLE,title,"title value");
        waitupto(1000);
    }

    private static final By firstNameText = By.xpath("//input[@id='txtFirstName']");
    public static void enterfirstName(String firstName){
        enterText(firstNameText,firstName,WaitStrategy.PRESENCE,"first Name");
        waitupto(1000);
    }

    private static final By middleNameText = By.xpath("//input[@id='txtMiddleName']");
    public static void entermiddleName(String middleName){
        enterText(middleNameText,middleName,WaitStrategy.PRESENCE,"middle Name");
        waitupto(1000);
    }

    private static final By lastNameText = By.xpath("//input[@id='txtLastname']");
    public static void enterlastName(String lastName){
        enterText(lastNameText,lastName,WaitStrategy.PRESENCE,"last Name");
        waitupto(1000);
    }

    private static final By e_mailText = By.xpath("//input[@id='txtemail']");
    public static void enterEmail(String EmailValue){
        enterText(e_mailText,EmailValue,WaitStrategy.PRESENCE,"Email Value");
        waitupto(1000);
    }

    private static final By mobileText = By.xpath("//input[@id='txtMobNum']");
    public static void enterMobileNumber(String mobileNum) {
        enterText(mobileText, mobileNum, WaitStrategy.PRESENCE, "Mobile Number");
        waitupto(1000);
    }

    private static final By homeText = By.xpath("//input[@id='txtHomeNum']");
    public static void enterHomeNumber(String homenum) {
        enterText(homeText, homenum, WaitStrategy.PRESENCE, "Home Number");
        waitupto(1000);
    }

    private static final By workText = By.xpath("//input[@id='txtWorkNum']");
    public static void enterWorkNumber(String worknum) {
        enterText(workText, worknum, WaitStrategy.PRESENCE, "work Number");
        waitupto(1000);
    }

    private static final By extText = By.xpath("//input[@id='txtExtNum']");
    public static void enterExtNumber(String extnum) {
        enterText(extText, extnum, WaitStrategy.PRESENCE, "EXT Number");
        waitupto(1000);
    }

    private static final By addressText = By.xpath("//textarea[@id='txtAddress']");
    public static void enterAddress(String address) {
        enterText(addressText, address, WaitStrategy.PRESENCE, "A   ddress Text");
        waitupto(1000);
    }

    private static final By cityText = By.xpath("//input[@id='txtCity']");
    public static void enterCity(String city) {
        enterText(cityText, city, WaitStrategy.PRESENCE, "City");
        waitupto(1000);
    }
    private static final By stateDropDown = By.xpath("//select[@id='ddlState']");
    public static void selectState(String state) {
        selectFromDrpDwn(stateDropDown, WaitStrategy.CLICKABLE, state, "State");
        waitupto(1000);
    }

    private static final By countyDropDown = By.xpath("//select[@id='ddlcounty']");
    public static void selectCounty(String county) {
        selectFromDrpDwn(countyDropDown, WaitStrategy.CLICKABLE, county, "County");
        waitupto(1000);
    }

    private static final By zipText = By.xpath("//input[@id='txtZipCode']");
    public static void enterZipcode(String zipcode) {
        enterText(zipText, zipcode, WaitStrategy.PRESENCE, "Zip Code");
        waitupto(1000);
    }
    private static final By clickOnSavebtn=By.xpath("//input[@value='Save']");
    public static void clickOnSavebtn(){
        waitupto(1000);
        clickOn(clickOnSavebtn, WaitStrategy.CLICKABLE,"Savebtn");
    }

    private static final By clickOnDeletebtn = By.xpath("//a[@title='Delete']");
    public static void clickDeletebtn(){
        clickOn(clickOnDeletebtn,WaitStrategy.CLICKABLE,"click on delect button to delete all records ");
        waitupto(1000);
        DriverManager.getDriver().switchTo().alert().accept();
        waitupto(1000);
    }

}
