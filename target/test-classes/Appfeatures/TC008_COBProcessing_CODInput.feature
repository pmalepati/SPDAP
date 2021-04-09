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

  @GenerateCOBInputFile
  Scenario: Generating new COB Input file
    When user clicks on COB Processing menu
    When user click on COBInput module
    When user gets the title of the page
    Then page title should be "Index"
    When user click on Generate COB Input File tab
    When user select the value in Year dropdown field in Generate COB File
    When user select the value in month dropdown field in Generate COB File
    When user enter the value in file Name text field in Generate COB File
    And user click on generate the file in Generate COB File

    #  ############################################
    #
    #  Module name --->COB Processing
    #
    #  Sub-module ---> COB Input -> COB Input Files in Database
    #
    #  #############################################

  @COBInputFilesinDatabase
  Scenario: Checking the COB Input Files in Database
    When user clicks on COB Processing menu
    When user click on COBInput module
    When user gets the title of the page
    Then page title should be "Index"
    When user click on COB Input Files in Database tab

    #  ############################################
    #
    #  Module name --->COB Processing
    #
    #  Sub-module ---> COB Input -> Send COB Input File to CMS
    #
    #  #############################################
  @SendCOBInputFiletoCMS
  Scenario: Sending mail to Send COB Input File to CMS
    When user clicks on COB Processing menu
    When user click on COBInput module
    When user gets the title of the page
    Then page title should be "Index"
    When user click on Send COB Input File to CMS tab
    When user enter the values in all fields
    When user click on Send Email button
