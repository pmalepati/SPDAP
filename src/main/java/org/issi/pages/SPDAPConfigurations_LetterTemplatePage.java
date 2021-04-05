package org.issi.pages;

import org.issi.driver.DriverManager;
import org.issi.enums.WaitStrategy;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class SPDAPConfigurations_LetterTemplatePage extends BasePage{

    public static Actions action;
    /*
     * ##############################################################
     *
     * Module name --->Administrator
     * Sub-mobule name --->SPDAPConfiguration
     * Sub-mobule name --->Letter Template
     * Pages --> Letter Template elements
     *
     * ##############################################################
     */
    protected SPDAPConfigurations_LetterTemplatePage() {
    }

    private  final static By clickONSPDAPConfigurations=By.xpath("//a[contains(text(),'SPDAP Configurations')]");
    public static void clickOnSPDAPConfigurations(){
        action = new Actions(DriverManager.getDriver());
        WebElement mainMenu = DriverManager.getDriver().findElement(clickONSPDAPConfigurations);
        action.moveToElement(mainMenu);
    }

    private static final By clickOnMasterLetterTemplates=By.xpath("//a[contains(text(),'Master Letter Templates')]");
    public static void clickOnMasterLetter(){
        clickOnSPDAPConfigurations();
        WebElement mainMenu2 =DriverManager.getDriver().findElement(clickOnMasterLetterTemplates);
        action.moveToElement(mainMenu2).click().build().perform();
    }

    private static final By clickOnAddNewDocument=By.xpath("//a[@id='AddNewDocument']");
    public static void clickOnaddNewLookupType(){
        waitupto(1000);
        clickOn(clickOnAddNewDocument, WaitStrategy.CLICKABLE,"Add New Document");
        waitupto(1000);
    }

    private static final By clickOnmyfile=By.xpath("//input[@id='myfile']");
   public static void clickOnMyFile(String file){
       waitupto(1000);
       enterText(clickOnmyfile,file,WaitStrategy.PRESENCE,"My file ->");
   }

    private static final By DocumentNameText=By.xpath("//input[@id='txtDocumentName']");
    public static void enterDocumentName(String documentName){
        waitupto(1000);
        enterText(DocumentNameText,documentName,WaitStrategy.PRESENCE,"Document Name ->");
    }

    private static final By letterTemplateDescriptionText=By.xpath("//textarea[@id='txtdesc']");
    public static void enterletterTemplateDescription(String documentDescription){
        waitupto(1000);
        enterText(letterTemplateDescriptionText,documentDescription,WaitStrategy.PRESENCE,"Letter Template Description ->");
    }

    private static final By clickOnSave=By.xpath("//input[@value='Save']");
    public static void clickOnSavebtn(){
        waitupto(1000);
        clickOn(clickOnSave,WaitStrategy.CLICKABLE,"Click on Save button");
    }

    private static final By searchLookupTypeCode=By.xpath("//input[@id='SearchLookupTypecode']");
    private static final By searchDescription=By.xpath("//input[@placeholder='Description']");
    private static final By searchStatus=By.xpath("//input[@placeholder='Status']");

    public static void searchValueLetterTemplate(String searchValue,String value){
        waitupto(1000);
        if (searchValue.equalsIgnoreCase("LookupTypeCode")){
            enterText(searchLookupTypeCode,value,WaitStrategy.PRESENCE,"Lookup Type Code ->");
        }else if (searchValue.equalsIgnoreCase("Description")){
            enterText(searchDescription,value,WaitStrategy.PRESENCE,"Description ->");
        }else if (searchValue.equalsIgnoreCase("Status")){
            enterText(searchStatus,value,WaitStrategy.PRESENCE,"Status ->");
        }
    }
}
