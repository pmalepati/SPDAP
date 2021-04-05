package org.issi.pages;

import org.issi.driver.DriverManager;
import org.issi.enums.WaitStrategy;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class MRPUsers_ManageMRPUsersPage extends BasePage{
    public static Actions action;

    protected MRPUsers_ManageMRPUsersPage() {
    }

    private  final static By clickONMRPUsers=By.xpath("//a[contains(text(),'MRP Users')]");
    public static void clickOnMRPUsers(){
        action = new Actions(DriverManager.getDriver());
        WebElement mainMenu = DriverManager.getDriver().findElement(clickONMRPUsers);
        action.moveToElement(mainMenu);
    }

    private static final By clickOnmanageMRPUsers=By.xpath("//a[contains(text(),'Manage MRP Users')]");
    public static void clickOnmanageMRPUsers(){
        clickOnMRPUsers();
        WebElement mainMenu2 =DriverManager.getDriver().findElement(clickOnmanageMRPUsers);
        action.moveToElement(mainMenu2).click().build().perform();
    }

    private static final By searchUserName=By.xpath("//input[@id='SearchUserName']");
    private static final By searchFirstName=By.xpath("//input[@id='SearchFirstName']");
    private static final By searchLastName=By.xpath("//input[@id='SearchLastName']");
    private static final By searchEmail=By.xpath("//input[@id='SearchEmail']");
    private static final By searchPhoneNumber=By.xpath("//input[@id='SearchPhoneNo']");

    public static void searchRecord(String searchValue,String value){
        if (searchValue.equalsIgnoreCase("UserName")){
            enterText(searchUserName,value, WaitStrategy.PRESENCE,"Search UserName ->");

        }else if (searchValue.equalsIgnoreCase("FirstName")){
            enterText(searchFirstName,value,WaitStrategy.PRESENCE,"Search FirstName ->");

        }else if (searchValue.equalsIgnoreCase("LastName")){
            enterText(searchLastName,value,WaitStrategy.PRESENCE,"Search LastName ->");

        }else if (searchValue.equalsIgnoreCase("Email")){
            enterText(searchEmail,value,WaitStrategy.PRESENCE,"Search Email ->");

        }else if (searchValue.equalsIgnoreCase("PhoneNumber")){
            enterText(searchPhoneNumber,value,WaitStrategy.PRESENCE,"Search PhoneNumber ->");
        }
    }

    private static final By clickOnActivate=By.xpath("//input[@value='Activate']");
    public static void clickOnActivatebtn(){
        waitupto(1000);
        clickOn(clickOnActivate,WaitStrategy.CLICKABLE,"Activate the record");
    }


    private static final By clickOnDelete=By.xpath("//input[@value='Delete']");
    public static void clickOnDeletetn(){
        waitupto(1000);
        clickOn(clickOnDelete,WaitStrategy.CLICKABLE,"Delete the record");
    }

}
