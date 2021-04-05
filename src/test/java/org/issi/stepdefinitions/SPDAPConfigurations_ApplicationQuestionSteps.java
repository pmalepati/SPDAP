package org.issi.stepdefinitions;

import io.cucumber.java.en.When;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.issi.constants.FrameworkConstants;
import org.issi.driver.DriverManager;
import org.issi.enums.WaitStrategy;
import org.issi.pages.BasePage;
import org.issi.utilities.ExcelReader;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import java.io.IOException;
import java.util.List;
import java.util.Map;
import static org.issi.pages.SPDAPConfigurations_ApplicationQuestionPage.*;


public class SPDAPConfigurations_ApplicationQuestionSteps {

    public List<Map<String, String>> testdata;
    public String Question;
    /*
     * ##############################################################
     *
     * Module name --->Administrator
     * Sub-mobule name --->SPDAPConfiguration
     * Sub-mobule name --->Application Question
     * StepDefinations --> Application Question steps
     *
     * ##############################################################
     */

    @When("user click on SPDAP Configurations link")
    public void user_click_on_spdap_configurations_link() {
        clickOnSPDAPConfigurations();
    }

    @When("user click on Application Questions link")
    public void user_click_on_application_questions_link() {
        clickOnApplicationQuestions();
    }

    @When("user clicks on Add New Application Question")
    public void user_clicks_on_add_new_application_question() {
        clickOnAddNewApplicationQuestion();
    }

    @When("user fills Add_Edit Application Question from given sheet name {string} and  {int}")
    public void user_fills_add_edit_application_question_from_given_sheet_name_and(String sheetname, Integer rownumber) {
        //Application Question
        ExcelReader reader = new ExcelReader();
        try {
            testdata = reader.getData(FrameworkConstants.getExcelFilePath(), sheetname);

            //ParentQuestion
            String ParentQuestion = testdata.get(rownumber).get("ParentQuestion");
            selectParentQuestion(ParentQuestion);

            //Question
            Question = testdata.get(rownumber).get("Question");
            enterQuestion(Question);

            //Answer Type
            String AnswerType = testdata.get(rownumber).get("AnswerType");
            selectAnswerType(AnswerType);

            //Answer option
            String Answeroption = testdata.get(rownumber).get("Answeroption");
            enterAnsweroption(Answeroption);
        } catch (InvalidFormatException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    @When("user clicks on save button in Application Question")
    public void user_clicks_on_save_button_in_application_question() {
        waitupto(2000);
        clickOnButtonsAQ();
    }
    @When("user enter the value in search field in Application Question from given sheet name {string} and  {int}")
    public void user_enter_the_value_in_search_field_in_application_question_from_given_sheet_name_and(String sheetname, Integer rownumber) {
        String SearchRecord = testdata.get(rownumber).get("searchvalue");

        //Search the value based on Question
        if (SearchRecord.equalsIgnoreCase("Question")) {
            searchRecordAQ(SearchRecord,Question);
        }
    }
    @When("user click on edit button in Application Question page")
    public void user_click_on_edit_button_in_application_question_page() {
        DriverManager.getDriver().findElement(By.xpath("//a[@title='Edit']")).click();
        waitupto(2000);
        clickOnButtonsAQ();
    }
    @When("user click on bulk print button in Application Question page")
    public void user_click_on_bulk_print_button_in_application_question_page() {
        waitupto(2000);
        String showDropdown="//select[@name='tblQuestions_length']";
        if (DriverManager.getDriver().findElement(By.xpath(showDropdown)).isDisplayed()) {
            waitupto(3000);
            BasePage.clickOn(By.xpath(showDropdown), WaitStrategy.VISIBLE, "All records displayed");
            BasePage.selectFromDrpDwn(By.xpath(showDropdown), WaitStrategy.VISIBLE, "All", "All records displayed");
        }
        waitupto(3000);
        selectCheckBox();
        waitupto(3000);
        //selectBulkPrintbtnAQ();

    }

    @When("user click on print button in Application Question page")
    public void user_click_on_print_button_in_application_question_page() {
//        waitupto(3000);
//        clickOnPrintbtnAQ();
//        waitupto(3000);
//        String parentWin = DriverManager.getDriver().getWindowHandle();
//        waitupto(500);
//        String childwin = switchToWindow(parentWin);
//        waitupto(500);
//        DriverManager.getDriver().switchTo().window(childwin);
//        waitupto(500);
//        DriverManager.getDriver().close();
//        waitupto(500);
//        DriverManager.getDriver().switchTo().window(parentWin);
    }

    @When("user click on delete the record in Application Question page")
    public void user_click_on_delete_the_record_in_application_question_page() {
        selectDeletebtnAQ();
    }
}
