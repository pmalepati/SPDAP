package org.issi.pages;

import org.issi.driver.DriverManager;
import org.issi.enums.WaitStrategy;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import java.util.Iterator;
import java.util.Set;

public class SPDAPConfigurations_LookupTypesPage extends BasePage{
    public static Actions action;
    /*
     * ##############################################################
     *
     * Module name --->Administrator
     * Sub-mobule name --->SPDAPConfiguration
     * Sub-mobule name --->Lookup Types
     * Pages --> LookupTypes elements
     *
     * ##############################################################
     */
    protected SPDAPConfigurations_LookupTypesPage() {
    }

    private  final static By clickONSPDAPConfigurations=By.xpath("//a[contains(text(),'SPDAP Configurations')]");
    public static void clickOnSPDAPConfigurations(){
        action = new Actions(DriverManager.getDriver());
        WebElement mainMenu = DriverManager.getDriver().findElement(clickONSPDAPConfigurations);
        action.moveToElement(mainMenu);
    }

    private static final By clickOnLookupType=By.xpath("//a[contains(text(),'Lookup Types ')]");
    public static void clickOnLookupType(){
        clickOnSPDAPConfigurations();
        WebElement mainMenu2 =DriverManager.getDriver().findElement(clickOnLookupType);
        action.moveToElement(mainMenu2).click().build().perform();
    }

    private static final By clickOnaddNewLookupType=By.xpath("//a[@id='addNewLookupType']");
    public static void clickOnaddNewLookupType(){
        waitupto(1000);
        clickOn(clickOnaddNewLookupType, WaitStrategy.CLICKABLE,"Add New Lookup Type");
        waitupto(1000);
    }

    private static final By LookupTypeCodeText = By.xpath("//input[@id='txtDropDownCode']");
    public static void enterLookupTypeCode(String code){
        waitupto(1000);
        enterText(LookupTypeCodeText,code,WaitStrategy.PRESENCE,"Lookup Type Code ->");
    }

    private static final By LookupTypeNameText = By.xpath("//input[@id='txtDropDownName']");
    public static void enterLookupTypeName(String Name){
        waitupto(1000);
        enterText(LookupTypeNameText,Name,WaitStrategy.PRESENCE,"Lookup Type Name ->");
    }

    private static final By LookupTypeDescription = By.xpath("//input[@id='txtDropDowndesc']");
    public static void enterLookupTypeDescription(String Description){
        waitupto(1000);
        enterText(LookupTypeDescription,Description,WaitStrategy.PRESENCE,"Lookup Type Description ->");
    }

    private static final By savebtn = By.xpath("//input[@value='Save']");
    private static final By canclebtn = By.xpath(" //input[@value='Cancel']");
    public static void clickOnButtonsLookupType(){
        waitupto(1000);
        clickOn(savebtn,WaitStrategy.CLICKABLE,"Click on Save Button");
    }

    private static final By SearchLookupCodeText = By.xpath(" //input[@id='SearchLookupTypecode']");
    private static final By SearchLookupNameText = By.xpath(" //input[@id='SearchLookupTypeName']");
    private static final By SearchLookupDecText = By.xpath(" //input[@id='SearchLookupTypeDesc']");

    public static void searchRecord(String searchValue,String value){
        if (searchValue.equalsIgnoreCase("code")){
            enterText(SearchLookupCodeText,value,WaitStrategy.PRESENCE,"Search Lookup code ->");

        }else if (searchValue.equalsIgnoreCase("Name")){
            enterText(SearchLookupNameText,value,WaitStrategy.PRESENCE,"Search Lookup Name ->");

        }else if (searchValue.equalsIgnoreCase("Dec")){
            enterText(SearchLookupDecText,value,WaitStrategy.PRESENCE,"Search Lookup Dec ->");
        }
    }
    private static final By editbtn = By.xpath("(//a[@title='Edit'])[1]");
    public static void clickOnEditbtn(){
        waitupto(2000);
        clickOn(editbtn,WaitStrategy.CLICKABLE,"click on Ebit button");
    }
    private static final By moreeditbtn = By.xpath("(//a[@title='Edit'])[2]");
    public static void clickOnmoreEditbtn(){
        waitupto(2000);
        clickOn(moreeditbtn,WaitStrategy.CLICKABLE,"click on more ebit button");
    }

    private static final By clickOnAddNewLookupValue = By.xpath("//a[@id='addnewRole']");
    public static void clickOnAddNewLookupValue(){
        waitupto(2000);
        clickOn(clickOnAddNewLookupValue,WaitStrategy.CLICKABLE,"click on Add New Lookup Value");
    }

    private static final By lookupValueCodeText = By.xpath("//input[@id='txtValueCode']");
    public static void enterlookupValueCode(String code){
        waitupto(1000);
        enterText(lookupValueCodeText,code,WaitStrategy.PRESENCE,"Lookup Type code ->");
    }
    private static final By lookupValueNameText = By.xpath("//input[@id='txtValueName']");
    public static void enterlookupValueName(String Name){
        waitupto(1000);
        enterText(lookupValueNameText,Name,WaitStrategy.PRESENCE,"Lookup Type Name ->");
    }
    private static final By lookupValueDescriptionText = By.xpath("//input[@id='txtValuedesc']");
    public static void enterlookupValueDescription(String Description){
        waitupto(1000);
        enterText(lookupValueDescriptionText,Description,WaitStrategy.PRESENCE,"Lookup Type Description ->");
    }
    private static final By lookupValuesavebtn = By.xpath("//input[@value='Save']");
    private static final By lookupValuecanclebtn = By.xpath(" //input[@value='Cancel']");
    public static void clickOnButtonslookupValue(){
        waitupto(1000);

        clickOn(lookupValuesavebtn,WaitStrategy.CLICKABLE,"click on Save Button");

    }

    private static final By SearchLookupValueCodeText = By.xpath("//input[@id='SearchLookupValuecode']");
    private static final By SearchLookupValueNameText = By.xpath("//input[@id='SearchLookupValueName']");
    private static final By SearchLookupValueDecText = By.xpath("//input[@id='SearchLookupValueDesc']");

    public static void searchRecordValue(String searchValue,String value){
        waitupto(1000);
        if (searchValue.equalsIgnoreCase("codeValue")){
            enterText(SearchLookupValueCodeText,value,WaitStrategy.PRESENCE,"Search Lookup code ->");
        }else if (searchValue.equalsIgnoreCase("NameValue")){
            enterText(SearchLookupValueNameText,value,WaitStrategy.PRESENCE,"Search Lookup Name ->");
        }else if (searchValue.equalsIgnoreCase("DecValue")){
            enterText(SearchLookupValueDecText,value,WaitStrategy.PRESENCE,"Search Lookup Dec ->");
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
    private static final By clickOnPrintbtn = By.xpath("//a[@title='Print']");
    public static void clickOnPrintbtn(){
        clickOn(clickOnPrintbtn,WaitStrategy.CLICKABLE,"Click On print button");
    }

    private static final By clickOnDeletebtn = By.xpath("//input[@value='Delete']");
    public static void selectDeletebtn(){
        clickOn(clickOnDeletebtn,WaitStrategy.CLICKABLE,"click on delect button to delete all records ");
        waitupto(1000);
        DriverManager.getDriver().switchTo().alert().accept();
        waitupto(1000);
    }
}
