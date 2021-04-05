Feature: PhoneLog feature

  Background:
    Given user has already logged in to application
      | username  | password |
      | Admin | Issi123# |
    When user gets the title of the page
    Then page title should be "About"

    #  ############################################
    #
    #  Module name --->PhoneLog
    #
    #  #############################################

  @NewApplication
  Scenario Outline: Adding new PhoneLog
    When user clicks on PhoneLog menu
    When user gets the title of the page
    Then page title should be "Index"
    When user clicks on Add New PhoneLog link
    When user gets the title of the page
    Then page title should be "AddEditCallDetails"
    Then User enter in to Add_Edit Call Log page and enter details from given sheet name "Phone Log" and <RowNumber>
    Then user click on save from given sheet name
    Then User search the value from given sheet name "Phone Log" and <RowNumber>
    Then user click on edit button
    Then User search the value in the Phone log information from given sheet name "Phone Log" and <RowNumber>
    Then user click on edit button in the Phone log information
    Then User click on save button
    Then user click on bulk print button in phone log
    Then User search the value from given sheet name "Phone Log" and <RowNumber>
    Then user click on single print button in phone log
    Then user click on delete button in phone log

    Examples:
      | RowNumber |
      | 0         |








