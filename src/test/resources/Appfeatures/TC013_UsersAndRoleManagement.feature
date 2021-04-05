Feature: Administrator feature following to SPDAP User and Role manager

  Background:
    Given user has already logged in to application
      | username  | password |
      | Admin | Issi123# |
    When user gets the title of the page
    Then page title should be "About"
    When user clicks on Administrator menu
    When user click on SPDAP User and Role manager link

    #  ##############################################################
    #    Module name --->Administrator
    #    Sub-mobule name --->SPDAP User and Role manager
    #    Sub-mobule name --->Users
    #
    #  ##############################################################

  @NewAdministratorInUsersPage
  Scenario Outline: Adding new user details in user management
    When user click on User module
    When user gets the title of the page
    Then page title should be "Index"
    When user clicks on Add New User link
    When user gets the title of the page
    Then page title should be "AddEditUser"
    When user fills Add_Edit user information from given sheet name "userdetails" and  <RowNumber>
    And user clicks on save button
    And user enter the value in search field from given sheet name "userdetails" and  <RowNumber>
    And user click on edit button in Users Page
    And user click on bulk print button in Users Page
    And user enter the value in search field from given sheet name "userdetails" and  <RowNumber>
    When user click on single print button in Users Page
    When user click on delete button in Users Page

    Examples:
      | RowNumber |
      | 0         |

      #  #############################################################
      #    Module name --->Administrator
      #    Sub-mobule name --->SPDAP User and Role manager
      #    Sub-mobule name --->Roles
      #
      #  ##############################################################
  @NewAdministratorInRolesPage
  Scenario Outline: Adding new Roles details in Roles management
    When user click on Roles module
    When user gets the title of the page
    Then page title should be "Roles"
    When user clicks on Add New Roles link
    When user gets the title of the page
    Then page title should be "AddEditRole"
    When user fills Add_Edit Role information from given sheet name "RolesDetails" and  <RowNumber>
    And user clicks on save button in Role page
    And user enter the value in search field in Role page from given sheet name "RolesDetails" and  <RowNumber>
    And user click on edit button in Role page
    When user click on bulk print button in Role page
    And user enter the value in search field in Role page from given sheet name "RolesDetails" and  <RowNumber>
    When user click on single print button in Role page
    When user click on delete button in Role page

    Examples:
      | RowNumber |
      | 0         |

      #   ############################################################
      #    Module name --->Administrator
      #    Sub-mobule name --->SPDAP User and Role manager
      #    Sub-mobule name --->Rights
      #
      #  ##############################################################

  @NewAdministratorInRightsPage
  Scenario Outline: Adding new Rights details in Roles management
    When user click on Rights module
    When user gets the title of the page
    Then page title should be "Index"
    And user enter the value in search field in Rights page from given sheet name "RolesDetails" and  <RowNumber>
    When User click on edit button in Rights Page
    When user gets the title of the page
    Then page title should be "AddEditRight"
    And user clicks on save button in Rights page
    When user click on bulk print button in Rights page
    And user enter the value in search field in Rights page from given sheet name "RolesDetails" and  <RowNumber>
    When user click on single print button in Rights page

    Examples:
      | RowNumber |
      | 0         |


