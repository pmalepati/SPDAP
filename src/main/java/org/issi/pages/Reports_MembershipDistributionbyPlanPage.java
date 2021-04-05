package org.issi.pages;

import org.issi.driver.DriverManager;
import org.issi.enums.WaitStrategy;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class Reports_MembershipDistributionbyPlanPage extends BasePage{

    public Reports_MembershipDistributionbyPlanPage() {
    }

    private static final By MembershipDistributionbyPlan = By.xpath("//a[contains(text(),'Membership Distribution by Plan')]");
    public static void clickOnMembershipDistributionbyPlan() {
        clickOn(MembershipDistributionbyPlan, WaitStrategy.CLICKABLE, "Membership Distribution by Plan");
        waitupto(1000);
    }

    private static final By OrganizationsDropDown = By.xpath("(//button[@class='multiselect dropdown-toggle custom-select'])[1]");
    public static void selectOnOrganizations() {
        clickOn(OrganizationsDropDown, WaitStrategy.CLICKABLE, "Organizations DropDown");
        waitupto(1000);
    }

    private static final By OrganizationsValueDropDown = By.xpath("//div[@x-placement='top-start']/button");
    public static void selectOrganizations(String Organizations) {
        menuItemDrpDwn(OrganizationsValueDropDown,Organizations);
        waitupto(1000);
    }

    private static final By monthDropDown = By.xpath("(//button[@class='multiselect dropdown-toggle custom-select'])[2]");
    public static void clickOnMonthDropDown() {
        clickOn(monthDropDown, WaitStrategy.CLICKABLE, "Month DropDown");
        waitupto(1000);
    }

    private static final By monthValueDropDown = By.xpath("//div[@class='multiselect-container dropdown-menu show']/button");
    public static void selectMonthValue(String month) {
        menuItemDrpDwn(monthValueDropDown,month);
        waitupto(1000);
    }
    private static final By yearDropDown = By.xpath("(//button[@class='multiselect dropdown-toggle custom-select'])[3]");
    public static void clickOnYearDropDown() {
        clickOn(yearDropDown, WaitStrategy.CLICKABLE, "Year DropDown");
        waitupto(1000);
    }

    private static final By YearValueDropDown = By.xpath("//div[@class='multiselect-container dropdown-menu show']/button");
    public static void selectYearValue(String year) {
        menuItemDrpDwn(YearValueDropDown,year);
        waitupto(1000);
    }

    private static final By generatebtn = By.xpath("//button[@id='btnSearch']");
    public static void clickOnGenerateButton() {
        clickOn(generatebtn, WaitStrategy.CLICKABLE, "Generate Button");
        waitupto(1000);
    }


    private static final By printbtn = By.xpath("//input[@value='Print']");
    public static void clickOnPrintButton() {
        List<WebElement> print= DriverManager.getDriver().findElements(By.xpath("//input[@value='Print']"));
        waitupto(1000);
        for (int i=1; i<print.size() ;i++) {
            DriverManager.getDriver().findElement(By.xpath("(//input[@value='Print'])["+i+"]")).click();
            waitupto(1000);
            String parentWin = DriverManager.getDriver().getWindowHandle();
            waitupto(1000);
            String childwin = switchToWindow(parentWin);
            waitupto(1000);
            DriverManager.getDriver().switchTo().window(childwin);
            waitupto(1000);
            DriverManager.getDriver().close();
            waitupto(1000);
            DriverManager.getDriver().switchTo().window(parentWin);
        }
    }
}
