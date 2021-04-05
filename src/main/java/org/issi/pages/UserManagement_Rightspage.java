package org.issi.pages;

import org.issi.driver.DriverManager;
import org.issi.enums.WaitStrategy;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import java.util.Iterator;
import java.util.Set;

public class UserManagement_Rightspage extends  BasePage{
    public static Actions action;
    /*
     * ##############################################################
     *
     * Module name --->Administrator
     * Sub-mobule name --->SPDAP User and Role manager
     * Sub-mobule name --->Rights
     * Pages -->Rights Elements
     *
     * ##############################################################
     */
    protected UserManagement_Rightspage() {
    }

    private static final  By clickOnRolemanager=By.xpath("//a[text()='SPDAP User and Role manager']");
    public static void clickOnRightsmanager(){
        action = new Actions(DriverManager.getDriver());
        WebElement mainMenu = DriverManager.getDriver().findElement(clickOnRolemanager);
        action.moveToElement(mainMenu);
    }

    private static final  By clickOnRights=By.xpath("//a[contains(text(),'Rights')]");
    public static void clickOnRightsLink(){
        clickOnRightsmanager();
        WebElement mainMenu = DriverManager.getDriver().findElement(clickOnRights);
        action.moveToElement(mainMenu).click().build().perform();
        waitupto(1000);
    }

    private static final  By searchRightCode=By.xpath("//input[@id='SearchRightcode']");
    private static final  By searchRightName=By.xpath("//input[@id='SearchRightName']");
    private static final  By searchRightDesc=By.xpath("//input[@id='SearchRightDesc']");

    public static void enterSearchValueInRights(String searchValue,String value){
        if (searchValue.equalsIgnoreCase("RightCode")){
            enterText(searchRightCode,value, WaitStrategy.PRESENCE,"Rights Code ->");
        }else if (searchValue.equalsIgnoreCase("RightName")){
            enterText(searchRightName,value,WaitStrategy.PRESENCE,"Rights Name ->");
        }else if (searchValue.equalsIgnoreCase("RightDesc")){
            enterText(searchRightDesc,value,WaitStrategy.PRESENCE,"Rights Description ->");
        }
        waitupto(2000);
    }

    private static final  By savebtn=By.xpath("//input[@value='Save']");
    public static void clickOnButtons(){
        waitupto(2000);
        clickOn(savebtn,WaitStrategy.CLICKABLE,"Click on Save Button");
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
        waitupto(2000);
    }
    private static final By selectAllCheckBox = By.xpath("//input[@id='chkSelectAll']");

    public static void selectCheckBox(){
        clickOn(selectAllCheckBox,WaitStrategy.CLICKABLE,"Select All Check Box");
        waitupto(1000);
    }
}
