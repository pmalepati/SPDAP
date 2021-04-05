package org.issi.stepdefinitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.issi.driver.DriverManager;
import org.issi.enums.WaitStrategy;
import org.issi.pages.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

import static org.issi.pages.UserManagement_Rightspage.*;


public class UserManagement_RightsSteps {
    /*
     * ##############################################################
     *
     * Module name --->Administrator
     * Sub-mobule name --->SPDAP User and Role manager
     * Sub-mobule name --->Rights
     * StepDefination -->Rights steps
     *
     * ##############################################################
     */
    @When("user click on Rights module")
    public void user_click_on_rights_module() {
        clickOnRightsLink();
    }

    @Then("user enter the value in search field in Rights page from given sheet name {string} and  {int}")
    public void user_enter_the_value_in_search_field_in_rights_page_from_given_sheet_name_and(String string, Integer int1) {
        enterSearchValueInRights("RightCode","Survey Responses");
    }

    @When("User click on edit button in Rights Page")
    public void user_click_on_edit_button_in_rights_page() {
        DriverManager.getDriver().findElement(By.xpath("(//a[@title='Edit'])[1]")).click();
        BasePage.waitupto(2000);

    }

    @When("user clicks on save button in Rights page")
    public void user_clicks_on_save_button_in_rights_page() {
        clickOnButtons();
        BasePage.waitupto(2000);
    }

    @When("user click on bulk print button in Rights page")
    public void user_click_on_bulk_print_button_in_rights_page() {
        String showDropdown="//select[@name='tblrights_length']";
        waitupto(2000);
        if (DriverManager.getDriver().findElement(By.xpath(showDropdown)).isDisplayed()) {
            waitupto(2000);
            BasePage.clickOn(By.xpath(showDropdown), WaitStrategy.VISIBLE, "All records displayed");
            BasePage.selectFromDrpDwn(By.xpath(showDropdown), WaitStrategy.VISIBLE, "All", "All records displayed");
        }
        waitupto(2000);
        if (!DriverManager.getDriver().findElements(By.xpath("(//input[@type='checkbox'])[2]")).isEmpty()){
            selectCheckBox();
            waitupto(2000);
            //selectBulkPrintbtn();
        }else {
            for (int i=1; i<=5; i++){
                WebElement clear=DriverManager.getDriver().findElement(By.xpath("(//input[@type='text'])[" + i + "]"));
                clear.sendKeys(Keys.CONTROL,"a");
                clear.sendKeys(Keys.DELETE);
            }
            selectCheckBox();
            waitupto(2000);
            // selectBulkPrintbtn();
        }
    }

    @When("user click on single print button in Rights page")
    public void user_click_on_single_print_button_in_rights_page() {
//        waitupto(2000);
//        clickOnPrintbtn();
//        waitupto(2000);
//        String parentWin = DriverManager.getDriver().getWindowHandle();
//        waitupto(1000);
//        String childwin = switchToWindow(parentWin);
//        waitupto(1000);
//        DriverManager.getDriver().switchTo().window(childwin);
//        waitupto(1000);
//        DriverManager.getDriver().close();
//        waitupto(1000);
//        DriverManager.getDriver().switchTo().window(parentWin);
    }
}
