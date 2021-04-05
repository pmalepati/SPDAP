Feature: Administrator feature following to MRP Users

  Background:
    Given user has already logged in to application
      | username  | password |
      | Admin | Issi123# |
    When user gets the title of the page
    Then page title should be "About"
    When user clicks on Administrator button
    When user click on SPDAP Configurations link


     # ############################################################

     #   Module name --->Administrator
     #   Sub-mobule name --->MRP Users
     #   Sub-mobule name --->Manage MRP Users

     # #############################################################

  @NewAdministratorInManageMRP_Users
  Scenario: Adding new in ManageMRP_Users details
    When user click on ManageMRP_Users module
    When user gets the title of the page
    Then page title should be "Index"
    Then user enter the value in search field in ManageMRP_Users from given sheet name "MRP_Users" and  <RowNumber>
    Then User click on checkbox in ManageMRP_Users page
    Then User click on Activate the new user in ManageMRP_Users page