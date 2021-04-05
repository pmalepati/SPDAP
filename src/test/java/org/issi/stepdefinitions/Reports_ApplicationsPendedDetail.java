package org.issi.stepdefinitions;

import io.cucumber.java.en.When;

import static org.issi.pages.Reports_ApplicationsPendedDetailPage.*;

public class Reports_ApplicationsPendedDetail {

    @When("user click on Applications Pended Detail Report")
    public void user_click_on_applications_pended_detail_report() {
        clickOnApplicationsPendedDetail();
    }

    @When("user select the value in Reason Code field in Applications Pended Detail Report")
    public void user_select_the_value_in_reason_code_field_in_applications_pended_detail_report() {
        selectOnreasonCode();
        waitupto(1000);
        selectreasonCodeValueDropDown("Select all");
    }

    @When("user select the value in Month dropdown field in Applications Pended Detail Report")
    public void user_select_the_value_in_month_dropdown_field_in_applications_pended_detail_report() {
        clickOnMonthDropDown();
        waitupto(1000);
        selectMonthValue("April");
    }

    @When("user select the value in Year dropdown field in Applications Pended Detail Report")
    public void user_select_the_value_in_year_dropdown_field_in_applications_pended_detail_report() {
        clickOnYearDropDown();
        waitupto(1000);
        selectYearValue("2020");
        selectYearValue("2021");
    }

    @When("user click on generate button in Applications Pended Detail Report")
    public void user_click_on_generate_button_in_applications_pended_detail_report() {
        clickOnGenerateButton();
    }

    @When("user click on Print button in Applications Pended Detail Report")
    public void user_click_on_print_button_in_applications_pended_detail_report() {
        clickOnPrintButton();
    }
}
