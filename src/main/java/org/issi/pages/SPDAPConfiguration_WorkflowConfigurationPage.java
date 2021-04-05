package org.issi.pages;

import org.issi.driver.DriverManager;
import org.issi.enums.WaitStrategy;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import java.util.Iterator;
import java.util.Set;

public class SPDAPConfiguration_WorkflowConfigurationPage extends BasePage{

    public static Actions action;
    /*
     * ##############################################################
     *
     * Module name --->Administrator
     * Sub-mobule name --->SPDAPConfiguration
     * Sub-mobule name --->Workflow Configuration
     * Page --> Workflow Configuration elements
     *
     * ##############################################################
     */
    protected SPDAPConfiguration_WorkflowConfigurationPage() {

    }

    private  final static By clickONSPDAPConfigurations=By.xpath("//a[contains(text(),'SPDAP Configurations')]");
    public static void clickOnSPDAPConfigurations(){
        action = new Actions(DriverManager.getDriver());
        WebElement mainMenu = DriverManager.getDriver().findElement(clickONSPDAPConfigurations);
        action.moveToElement(mainMenu);
    }

    private static final By clickOnWorkflowConfiguration=By.xpath("//a[contains(text(),'Workflow Configuration')]");
    public static void clickOnWorkflowConfiguration(){
        clickOnSPDAPConfigurations();
        WebElement mainMenu2 =DriverManager.getDriver().findElement(clickOnWorkflowConfiguration);
        action.moveToElement(mainMenu2).click().build().perform();
    }

    private static final By clickOnaddnewRole=By.xpath("//a[@id='addnewRole']");
    public static void clickOnaddnewRole(){
        waitupto(1000);
        clickOn(clickOnaddnewRole, WaitStrategy.CLICKABLE,"Add New Workflow Configuration");
        waitupto(1000);
    }

    private static final By tasktoPerformDropDown=By.xpath("//select[@id='ddlTasktoPerform']");
    public static void selectTasktoPerform(String tasktoPerform){
        waitupto(1000);
        selectFromDrpDwn(tasktoPerformDropDown,WaitStrategy.CLICKABLE,tasktoPerform,"Task to Perform ->");
    }

    private static final By tasktoRouteDropDown=By.xpath("//select[@id='ddlTasktoRoute']");
    public static void selectTasktoRoute(String tasktoRoute){
        waitupto(1000);
        selectFromDrpDwn(tasktoRouteDropDown,WaitStrategy.CLICKABLE,tasktoRoute,"Task to Route ->");
    }

    private static final By RoleDropDown=By.xpath("//select[@id='ddlRole']");
    public static void selectRole(String Role){
        waitupto(1000);
        selectFromDrpDwn(RoleDropDown,WaitStrategy.CLICKABLE,Role,"Role ->");
    }

    private static final By DescriptionText=By.xpath("//textarea[@id='txtTaskTypeDesc']");
    public static void enterDescription(String Description){
        waitupto(1000);
        enterText(DescriptionText,Description,WaitStrategy.PRESENCE,"Description ->");
    }

    private static final By clickOnAvailableLetters=By.xpath("//a[contains(text(),'Available Letters')]");
    public static void clickOnAvailableLetters(){
        waitupto(1000);
        clickOn(clickOnAvailableLetters, WaitStrategy.CLICKABLE,"Available Letters ->");
    }

    private static final By clickOnAddLetter=By.xpath("//a[@id='addLetter']");
    public static void clickOnAddLetter(){
        waitupto(1000);
        clickOn(clickOnAddLetter, WaitStrategy.CLICKABLE,"Add Letter ->");
    }

    private static final By clickOnSelectAll=By.xpath("//input[@id='chkSelectAllLetterPopup']");
    public static void clickOnSelectAll(){
        waitupto(1000);
        clickOn(clickOnSelectAll, WaitStrategy.CLICKABLE,"Select All check box ->");
    }

    private static final By clickOnSubmitbtn=By.xpath("(//*[text()='Submit'])[2]");
    public static void clickOnSubmitbtn(){
        waitupto(1000);
        clickOnAction(clickOnSubmitbtn,WaitStrategy.VISIBLE,"Click on submit button");
    }

    private static final By clickOnDeletebtn=By.xpath("(//a[@title='Delete'])[1]");
    public static void clickOnDelete(){
        waitupto(1000);
        clickOn(clickOnDeletebtn, WaitStrategy.CLICKABLE,"Click on delete button");
        waitupto(2000);
        DriverManager.getDriver().switchTo().alert().accept();

    }

    private static final By clickOnDownloadbtn=By.xpath("(//a[@title='Download'])[1]");
    public static void clickOnDownload(){
        waitupto(1000);
        clickOn(clickOnDownloadbtn, WaitStrategy.CLICKABLE,"Click on submit button");
    }


    private static final By clickOnAvailableDocuments=By.xpath(" //a[contains(text(),'Available Documents')]");
    public static void clickOnAvailableDocuments(){
        waitupto(1000);
        clickOn(clickOnAvailableDocuments, WaitStrategy.CLICKABLE,"Click on submit button");
    }
    private static final By clickOnAddDocument=By.xpath("//a[@id='addDocument']");
    public static void clickOnAddDocument(){
        waitupto(1000);
        clickOn(clickOnAddDocument, WaitStrategy.CLICKABLE,"Add Document");
    }
    private static final By clickOnClosebtn=By.xpath("(//*[text()='Close'])[1]");
    public static void clickOnClosebtn(){
        waitupto(1000);
        clickOnAction(clickOnClosebtn,WaitStrategy.VISIBLE,"Closebtn");
    }
    private static final By clickOnSavebtn=By.xpath("//input[@value='Save']");
    public static void clickOnSavebtn(){
        waitupto(1000);
        clickOn(clickOnSavebtn, WaitStrategy.CLICKABLE,"Click on Save button");
    }

    private static final By searchTasktoPerform=By.xpath("//input[@id='SearchTasktoPerform']");
    private static final By searchTasktoRoute=By.xpath("//input[@id='SearchTasktoRoute']");
    private static final By searchRole=By.xpath("//input[@id='SearchRole']");
    public static void enterSearchValue(String searchValue,String value){
        waitupto(1000);
        if (searchValue.equalsIgnoreCase("TasktoPerform")){
            enterText(searchTasktoPerform,value,WaitStrategy.PRESENCE,"Task to Perform ->");
        }else if (searchValue.equalsIgnoreCase("TasktoRoute")){
            enterText(searchTasktoRoute,value,WaitStrategy.PRESENCE,"Task to Route ->");
        }else if (searchValue.equalsIgnoreCase("Role")){
            enterText(searchRole,value,WaitStrategy.PRESENCE,"Role ->");
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

    private static final By clickOnDelete = By.xpath("//input[@value='Delete']");
    public static void  clickOnDeletebtn(){
        clickOn(clickOnDelete,WaitStrategy.CLICKABLE,"click on delect button to delete all records ");
        waitupto(2000);
        DriverManager.getDriver().switchTo().alert().accept();
        waitupto(3000);
    }

}
