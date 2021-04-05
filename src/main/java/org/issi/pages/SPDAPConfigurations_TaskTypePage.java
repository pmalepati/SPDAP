package org.issi.pages;

import org.issi.driver.DriverManager;
import org.issi.enums.WaitStrategy;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import java.util.Iterator;
import java.util.Set;

public class SPDAPConfigurations_TaskTypePage extends BasePage{
    public static Actions action;

    public SPDAPConfigurations_TaskTypePage() {
    }
    /*
     * ##############################################################
     *
     * Module name --->Administrator
     * Sub-mobule name --->SPDAPConfiguration
     * Sub-mobule name --->Task Type
     * Pages -->Task Type Elements
     *
     * ##############################################################
     */
    private  final static By clickONSPDAPConfigurations=By.xpath("//a[contains(text(),'SPDAP Configurations')]");
    public static void clickOnSPDAPConfigurations(){
        action = new Actions(DriverManager.getDriver());
        WebElement mainMenu = DriverManager.getDriver().findElement(clickONSPDAPConfigurations);
        action.moveToElement(mainMenu);
    }

    private static final By clickOnTaskTypes=By.xpath("//a[contains(text(),'Task Types')]");
    public static void clickOnTaskType(){
        clickOnSPDAPConfigurations();
        WebElement mainMenu2 =DriverManager.getDriver().findElement(clickOnTaskTypes);
        action.moveToElement(mainMenu2).click().build().perform();
    }

    private static final By clickOnaddnewRole=By.xpath("//a[@id='addnewRole']");
    public static void clickOnaddNewTaskType(){
        waitupto(2000);
        clickOn(clickOnaddnewRole, WaitStrategy.CLICKABLE,"Add New Task Type");
        waitupto(2000);
    }

    private static final By TaskTypeCodeText=By.xpath("//input[@id='txtTaskTypeCode']");
    public static void enterTaskTypeCode(String TaskTypeCode){
        waitupto(2000);
        enterText(TaskTypeCodeText,TaskTypeCode,WaitStrategy.PRESENCE,"Task Type Code ->");
    }

    private static final By TaskNameText=By.xpath("//input[@id='txtTaskTypeName']");
    public static void enterTaskName(String TaskName){
        waitupto(2000);
        enterText(TaskNameText,TaskName,WaitStrategy.PRESENCE,"Task Name ->");
    }

    private static final By TaskDescriptionText=By.xpath("//input[@id='txtTaskTypeDesc']");
    public static void enterTaskDescription(String TaskDescription){
        waitupto(2000);
        enterText(TaskDescriptionText,TaskDescription,WaitStrategy.PRESENCE,"Task Description ->");
    }

    private static final By StausDropDown=By.xpath("//select[@id='ddlStatus']");
    public static void selectStaus(String Staus){
        selectFromDrpDwn(StausDropDown,WaitStrategy.CLICKABLE,Staus,"Staus ->");
        waitupto(2000);
    }

    private static final By ReasonCodesDropDown=By.xpath("//select[@id='ddldropdown']");
    public static void selectReasonCodes(String ReasonCodes){
        selectFromDrpDwn(ReasonCodesDropDown,WaitStrategy.CLICKABLE,ReasonCodes,"Reason Codes ->");
        waitupto(2000);
    }

    private static final By RenewLevelbtn=By.xpath("//input[@id='chkTaskDisplay_R']");
    private static final By ApplicationLevebtn=By.xpath("//input[@id='chkTaskDisplay_A']");
    private static final By MembershipLevelbtn=By.xpath("//input[@id='chkTaskDisplay_M']");

    public static void shouAtRadiobtn(String radion){
        waitupto(1000);
        if (radion.equalsIgnoreCase("Renew Level")){
            clickOn(RenewLevelbtn,WaitStrategy.CLICKABLE,"Renew Level ->");
        }else if (radion.equalsIgnoreCase("Application Level")){
            clickOn(ApplicationLevebtn,WaitStrategy.CLICKABLE,"Application Level ->");
        }else if (radion.equalsIgnoreCase("Membership Level")){
            clickOn(MembershipLevelbtn,WaitStrategy.CLICKABLE,"Membership Level ->");
        }
    }

    private static final By savebtn = By.xpath("//input[@value='Save']");
    private static final By canclebtn = By.xpath(" //input[@value='Cancel']");

    public static void clickOnButtons(){
        waitupto(2000);
        clickOn(savebtn,WaitStrategy.CLICKABLE,"Click on Save Button");
    }

    private static final By SearchTaskTypecode = By.xpath("//input[@id='SearchTaskTypecode']");
    private static final By SearchTaskTypeName = By.xpath("//input[@id='SearchTaskTypeName']");
    private static final By SearchTaskTypeDesc = By.xpath("//input[@id='SearchTaskTypeDesc']");
    private static final By SearchStatus = By.xpath("//input[@id='SearchStatus']");

    public static void searchRecordTaskType(String searchValue,String value){
        waitupto(2000);
        if (searchValue.equalsIgnoreCase("TaskTypecode")){
            enterText(SearchTaskTypecode,value,WaitStrategy.PRESENCE,"Search Task Type code ->");

        }else if (searchValue.equalsIgnoreCase("TaskTypeName")){
            enterText(SearchTaskTypeName,value,WaitStrategy.PRESENCE,"Search Task Type Name ->");

        }else if (searchValue.equalsIgnoreCase("TaskTypeDesc")){
            enterText(SearchTaskTypeDesc,value,WaitStrategy.PRESENCE,"Search Task Type Desc ->");

        }else if (searchValue.equalsIgnoreCase("Status")){
            enterText(SearchStatus,value,WaitStrategy.PRESENCE,"Search Status ->");

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
