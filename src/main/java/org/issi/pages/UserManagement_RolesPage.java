package org.issi.pages;

import org.issi.driver.DriverManager;
import org.issi.enums.WaitStrategy;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import java.util.Iterator;
import java.util.Set;

public class UserManagement_RolesPage extends BasePage{

    public static Actions action;
    /*
     * ##############################################################
     *
     * Module name --->Administrator
     * Sub-mobule name --->SPDAP User and Role manager
     * Sub-mobule name --->Roles
     * pages -->Roles Elements
     *
     * ##############################################################
     */
    protected UserManagement_RolesPage() {
    }

    private static final  By clickOnRolemanager=By.xpath("//a[text()='SPDAP User and Role manager']");
    public static void clickOnRolemanager(){
        action = new Actions(DriverManager.getDriver());
        WebElement mainMenu = DriverManager.getDriver().findElement(clickOnRolemanager);
        action.moveToElement(mainMenu);
    }

    private static final By roleLink = By.xpath("//a[contains(text(),'Roles')]");
    public static void clickOnRoleLink(){
        clickOnRolemanager();
        WebElement mainMenu = DriverManager.getDriver().findElement(roleLink);
        action.moveToElement(mainMenu).click().build().perform();
        waitupto(1000);
    }
    private static final By addNewRoleLink = By.xpath("//a[@id='addnewRole']");
    public static void clickOnAddNewRole(){
        clickOn(addNewRoleLink,WaitStrategy.CLICKABLE,"Add New Role link");
        waitupto(1000);
    }

    private static final By roleCodeText = By.xpath("//input[@id='txtRolecode']");
    public static void enterRoleCode(String roleCode){
       enterText(roleCodeText,roleCode,WaitStrategy.PRESENCE,"Role Code ->");
        waitupto(1000);
    }
    private static final By roleNameText = By.xpath("//input[@id='txtRolename']");
    public static void enterRoleName(String roleName){
        enterText(roleNameText,roleName,WaitStrategy.PRESENCE,"Role Name ->");
        waitupto(1000);
    }
    private static final By roleDescriptionText = By.xpath("//input[@id='txtRoledesc']");
    public static void enterRoleDescription(String roleCode){
        enterText(roleDescriptionText,roleCode,WaitStrategy.PRESENCE,"role Description ->");
        waitupto(1000);
    }

    private static final By savebtn = By.xpath("//input[@value='Save']");
    private static final By canclebtn = By.xpath(" //input[@value='Cancel']");
    public static void clickOnButtonsInRole(){

            clickOn(savebtn, WaitStrategy.CLICKABLE,"Click on Save Button");

    }

    private static final By searchRoleCode = By.xpath("//input[@id='SearchRolecode']");
    private static final By searchRoleName = By.xpath("//input[@id='SearchRoleName']");
    private static final By searchRoleDescription = By.xpath("//input[@id='SearchRoleDesc']");

    public static void enterSearchValueInRole(String searchValue,String value){
        if (searchValue.equalsIgnoreCase("Rolecode")){
            enterText(searchRoleCode,value,WaitStrategy.PRESENCE,"Role Code ->");
        }else if (searchValue.equalsIgnoreCase("RoleName")){
            enterText(searchRoleName,value,WaitStrategy.PRESENCE,"Role Name ->");
        }else if (searchValue.equalsIgnoreCase("RoleDescription")){
            enterText(searchRoleDescription,value,WaitStrategy.PRESENCE,"Role Description ->");
        }
        waitupto(2000);
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
