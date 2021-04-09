Feature: COB Processing feature

  Background:
    Given user has already logged in to application
      | username  | password |
      | Admin | Issi123# |
    When user gets the title of the page
    Then page title should be "About"

    #  ############################################
    #
    #  Module name --->COB Processing
    #
    #  Sub-module ---> COB Input -> Generate COB Input File tab
    #
    #  #############################################

  @GenerateCOBInputfile
  Scenario: Generating new COB Input file
    When user clicks on COB Processing menu
    When user click on COBOutput module
    When user gets the title of the page
    Then page title should be "Index"
    When user Upload a response file to generate SPDAP Membership
    When user select the value in year dropdown field
    When user select the value in month dropdown field
    When user Mapping to COB Input file
    And user click on generate button
    And user search the particular file
    And click on view button


