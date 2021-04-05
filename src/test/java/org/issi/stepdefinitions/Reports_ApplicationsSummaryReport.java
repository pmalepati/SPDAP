package org.issi.stepdefinitions;

import io.cucumber.java.en.When;

import static org.issi.pages.Reports_ApplicationsSummaryReport.*;

public class Reports_ApplicationsSummaryReport {

    @When("user click on Reports Module")
    public void user_click_on_reports_module() {
        clickOnReportsModule();
    }

    @When("user click on Applications Summary Report")
    public void user_click_on_applications_summary_report() {
        clickOnApplicationSummeryReport();
    }

    @When("user select the value in Month dropdown field in Applications Summary Report")
    public void user_select_the_value_in_month_dropdown_field_in_applications_summary_report() {
        clickOnMonthDropDown();
        waitupto(1000);
        selectMonthValue("April");
        selectMonthValue("March");
    }

    @When("user select the value in Year dropdown field in Applications Summary Report")
    public void user_select_the_value_in_year_dropdown_field_in_applications_summary_report() {
        clickOnYearDropDown();
        waitupto(1000);
        selectYearValue("2021");
        selectYearValue("2020");
    }

    @When("user click on generate button in Applications Summary Report")
    public void user_click_on_generate_button_in_applications_summary_report() {
        clickOnGenerateButton();
    }

    @When("user click on Excel button in Applications Summary Report")
    public void user_click_on_excel_button_in_applications_summary_report() {
        clickOnExcelButton();
    }

    @When("user click on Print button in Applications Summary Report")
    public void user_click_on_print_button_in_applications_summary_report() {
        clickOnPrintButton();
    }

}
