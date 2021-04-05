package org.issi.pages;

import org.issi.driver.DriverManager;
import org.issi.enums.WaitStrategy;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import java.util.Iterator;
import java.util.Set;

public class SPDAPConfigurations_ApplicationQuestionPage extends  BasePage{

    public static Actions action;
    /*
     * ##############################################################
     *
     * Module name --->Administrator
     * Sub-mobule name --->SPDAPConfiguration
     * Sub-mobule name --->Application Question
     * Page --> Application Question elements
     *
     * ##############################################################
     */
    public SPDAPConfigurations_ApplicationQuestionPage() {
    }

    public  final static By clickONSPDAPConfigurations=By.xpath("//a[contains(text(),'SPDAP Configurations')]");
    public static void clickOnSPDAPConfigurations(){
        action = new Actions(DriverManager.getDriver());
        WebElement mainMenu = DriverManager.getDriver().findElement(clickONSPDAPConfigurations);
        action.moveToElement(mainMenu);
    }

    public  final static By clickONApplicationQuestions=By.xpath("//a[contains(text(),'Application Questions')]");
    public static void clickOnApplicationQuestions(){
        WebElement mainMenu2 =DriverManager.getDriver().findElement(clickONApplicationQuestions);
        action.moveToElement(mainMenu2).click().build().perform();
    }

    public  final static By clickOnAddNewApplicationQuestion=By.xpath("//a[@id='addnewRole']");
    public static void clickOnAddNewApplicationQuestion(){
        waitupto(1000);
        clickOn(clickOnAddNewApplicationQuestion, WaitStrategy.CLICKABLE,"Add New Application Question");
        waitupto(1000);
    }

    public  final static By ParentQuestionDropDown=By.xpath("//select[@id='ddlParentQuestion']");
    public static void selectParentQuestion(String ParentQuestion){
        selectFromDrpDwn(ParentQuestionDropDown,WaitStrategy.CLICKABLE,ParentQuestion,"Parent Question");
        waitupto(1000);
    }
    public  final static By QuestionText=By.xpath("//textarea[@id='txtQuestion']");
    public static void enterQuestion(String Question){
        enterText(QuestionText,Question,WaitStrategy.PRESENCE,"Question");
        waitupto(1000);
    }
    public  final static By AnswerTypeDropDown=By.xpath("//select[@id='ddlAnswerType']");
    public static void selectAnswerType(String AnswerType){
        selectFromDrpDwn(AnswerTypeDropDown,WaitStrategy.CLICKABLE,AnswerType,"Answer Type");
        waitupto(1000);
    }
    public  final static By AnsweroptionText=By.xpath("//input[@id='txtAnswerOption']");
    public static void enterAnsweroption(String Answeroption){
        enterText(AnsweroptionText,Answeroption,WaitStrategy.PRESENCE,"Answeroption");
        waitupto(1000);
    }

    private static final By savebtn = By.xpath("//input[@value='Save']");
    private static final By canclebtn = By.xpath(" //input[@value='Cancel']");
    public static void clickOnButtonsAQ(){
        waitupto(1000);
        clickOn(savebtn,WaitStrategy.CLICKABLE,"Save Button");
    }

    private static final By SearchQuestion = By.xpath("(//input[@id='SearchQuestion'])[2]");
    public static void searchRecordAQ(String searchValue,String value){
        if (searchValue.equalsIgnoreCase("Question")) {
            enterText(SearchQuestion, value, WaitStrategy.PRESENCE, "Search Question");
        }
    }
    private static final By clickOnPrintbtn = By.xpath("//a[@title='Print']");
    public static void clickOnPrintbtnAQ(){
        clickOn(clickOnPrintbtn,WaitStrategy.CLICKABLE,"Click On print button");
        waitupto(1000);
    }

    private static final By clickOnDeletebtn = By.xpath("//input[@value='Delete']");
    public static void selectDeletebtnAQ(){
        clickOn(clickOnDeletebtn,WaitStrategy.CLICKABLE,"click on delect button to delete all records ");
        waitupto(1000);
        DriverManager.getDriver().switchTo().alert().accept();
    }

    private static final By clickOnBulkPrintbtn = By.xpath("//input[@value='Print']");
    public static void selectBulkPrintbtnAQ(){

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
    private static final By selectAllCheckBox = By.xpath("//input[@id='chkSelectAll']");

    public static void selectCheckBox(){
        clickOn(selectAllCheckBox,WaitStrategy.CLICKABLE,"Select All Check Box");
        waitupto(1000);
    }
}
