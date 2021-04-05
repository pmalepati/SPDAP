Feature: Administrator feature following to MDSPS Configurations

  Background:
    Given user has already logged in to application
      | username  | password |
      | Admin | Issi123# |
    When user gets the title of the page
    Then page title should be "About"
    When user clicks on Administrator button
    When user click on SPDAP Configurations link


     # ############################################################

    # Module name --->Administrator
    # Sub-mobule name --->SPDAPConfiguration
    # Sub-mobule name --->Application Question

     ##############################################################

#  @NewAdministratorInApplicationQuestions
#  Scenario Outline: Adding new Application Questions details in SPDAP Configuration
#    When user click on Application Questions link
#    When user gets the title of the page
#    Then page title should be "Application Questions"
#    When user clicks on Add New Application Question
#    When user gets the title of the page
#    Then page title should be "AddEditApplicationQuestion"
#    When user fills Add_Edit Application Question from given sheet name "ApplicationQuestion" and  <RowNumber>
#    And user clicks on save button in Application Question
#    And user enter the value in search field in Application Question from given sheet name "ApplicationQuestion" and  <RowNumber>
#    And user click on edit button in Application Question page
#    And user click on bulk print button in Application Question page
#    And user enter the value in search field in Application Question from given sheet name "ApplicationQuestion" and  <RowNumber>
#    And user click on print button in Application Question page
#    And user click on delete the record in Application Question page
#
#    Examples:
#      | RowNumber |
#      | 0         |

    # ############################################################

    # Module name --->Administrator
    # Sub-mobule name --->SPDAPConfiguration
    # Sub-mobule name --->Medicare Plan Types

     ##############################################################
  @NewAdministratorInMedicarePlanTypes
  Scenario Outline: Adding new Medicare Plan Types details in SPDAP Configuration
    When user click on Medicare Plan Types module
    When user gets the title of the page
    Then page title should be "Medicare Plans"
    When user clicks on Add New Medicare Plan
    When user gets the title of the page
    Then page title should be "AddEditMedicarePlan"
    When user fills Add_Edit Medicare Plan Types from given sheet name "MedicarePlanTypes" and  <RowNumber>
    And user clicks on save button in Medicare Plan Types
    And user enter the value in search field in Medicare Plan Types from given sheet name "MedicarePlanTypes" and  <RowNumber>
    And user click on edit button in Medicare Plan Types page
    And user click on bulk print button in Medicare Plan Types page
    And user enter the value in search field in Medicare Plan Types from given sheet name "MedicarePlanTypes" and  <RowNumber>
    And user click on print button in Medicare Plan Types page
    And user click on delete the record in Medicare Plan Types page

    Examples:
      | RowNumber |
      | 0         |

     # ############################################################

    # Module name --->Administrator
    # Sub-mobule name --->SPDAPConfiguration
    # Sub-mobule name --->Lookup Types

     # #############################################################
  @NewAdministratorInLookupTypes
  Scenario Outline: Adding new Lookup Types details in SPDAP Configuration
    When user click on Lookup Types module
    When user gets the title of the page
    Then page title should be "Index"
    When user clicks on Add New Lookup Type
    When user gets the title of the page
    Then page title should be "AddEditLookupType"
    When user fills Add New Lookup Type from given sheet name "LookupTypes" and  <RowNumber>
    When user clicks on save button in Lookup Types
    When user enter the value in search field Lookup Types from given sheet name "LookupTypes" and  <RowNumber>
    When user click on edit button in Lookup Types page
    When user enter the value in search field Lookup Types from given sheet name "LookupTypes" and  <RowNumber>
    When User click on more edit button in lookup Types page
    When user gets the title of the page
    Then page title should be "Index"
    When user click on Add New Lookup Value in more edit button page
    When user fills Add New Lookup Value from given sheet name "LookupTypes" and  <RowNumber>
    When user clicks on save button in Lookup Value
    When user enter the value in search field Lookup Value from given sheet name "LookupTypes" and  <RowNumber>
    When user click on edit button in Lookup Value page
    When user click on print button in Lookup Value page
    When user click on back button in Lookup Value page
    When user click on bulk print button in Lookup Types page
    When user enter the value in search field Lookup Types from given sheet name "LookupTypes" and  <RowNumber>
    When user click on print button in Lookup Types page
    When user click on delete the record in Lookup Types page

    Examples:
      | RowNumber |
      | 0         |

     # ############################################################

     # Module name --->Administrator
     # Sub-mobule name --->SPDAPConfiguration
     # Sub-mobule name --->Task Types

     # #############################################################

  @NewAdministratorInTaskTypes
  Scenario Outline: Adding new Task Types details in SPDAP Configuration
    When user click on Task Types module
    When user gets the title of the page
    Then page title should be "TaskTypes"
    When user clicks on Add New TaskType
    When user gets the title of the page
    Then page title should be "AddEditTaskType"
    When user fills Add_Edit Task Types from given sheet name "TaskTypes" and  <RowNumber>
    When user clicks on save button in Task Types
    When user enter the value in search field in Task Types from given sheet name "TaskTypes" and  <RowNumber>
    When user click on edit button in Task Types page
    When user click on bulk print button in Task Types page
    When user enter the value in search field in Task Types from given sheet name "TaskTypes" and  <RowNumber>
    When user click on print button in Task Types page
    When user click on delete the record in Task Types page

    Examples:
      | RowNumber |
      | 0         |

    # ############################################################

    # Module name --->Administrator
    # Sub-mobule name --->SPDAPConfiguration
    # Sub-mobule name --->Workflow Configuration

    # #############################################################

  @NewAdministratorInWorkflowConfiguration
  Scenario Outline: Adding new Workflow Configuration details in SPDAP Configuration
    When user click on Workflow Configuration module
    When user gets the title of the page
    Then page title should be "Workflow Configuration"
    When user clicks on Add New Workflow Configuration
    When user gets the title of the page
    Then page title should be "AddEditWorkflowConfiguration"
    When user fills Add_Edit Workflow Configuration from given sheet name "Workflow Configuration" and  <RowNumber>
    When user clicks on save button in Workflow Configuration
    When user enter the value in search field in Workflow Configuration from given sheet name "Workflow Configuration" and  <RowNumber>
    When user click on edit button in Workflow Configuration page
    When user click on bulk print button in Workflow Configuration page
    When user enter the value in search field in Workflow Configuration from given sheet name "Workflow Configuration" and  <RowNumber>
    When user click on print button in Workflow Configuration page
    When user click on delete the record in Workflow Configuration page

    Examples:
      | RowNumber |
      | 0         |

    # ############################################################

    # Module name --->Administrator
    # Sub-mobule name --->SPDAPConfiguration
    # Sub-mobule name --->Master Letter Templates

    # #############################################################

#  @NewAdministratorInMasterLetterTemplates
#  Scenario Outline: Adding new Master Letter Template details in SPDAP Configuration
#    When user click on Master Letter Template link
#    When user gets the title of the page
#    Then page title should be "Index"
#    When user clicks on Add New Letter Template
#    When user gets the title of the page
#    Then page title should be "AddEditLetterTemplate"
#    When user fills Add_Edit Letter Template from given sheet name "LetterTemplate" and  <RowNumber>
#    When user clicks on save button in Letter Template
#    When user enter the value in search field in Letter Template from given sheet name "LetterTemplate" and  <RowNumber>
#    When user click on edit button in Letter Template page
#    When user enter the value in search field in Letter Template from given sheet name "LetterTemplate" and  <RowNumber>
#    When user click on download button in Letter Template page
#    When user click on active or inactive button to update the letter template in Letter Template page
#    When user click on bulk print in Letter Template page
#
#
#    Examples:
#      | RowNumber |
#      | 0         |


  @NewAdministratorInOrganizations
  Scenario Outline: Adding new Organizations details in SPDAP Configuration
    When user click on Organizations link
    When user gets the title of the page
    Then page title should be "Index"
    When user clicks on Add New Organizations
    When user gets the title of the page
    Then page title should be "AddEditOrganization"
    When user fills Add_Edit Organizations from given sheet name "Organizations" and  <RowNumber>
    When user clicks on save button in AddEditOrganization page
    When user enter the value in search field in Organizations from given sheet name "Organizations" and  <RowNumber>
    When user click on edit button in Organizations page
    When user click on save button in AddEditOrganization page
    When user click on bulk print button in Organizations page
    When user enter the value in search field in Organizations from given sheet name "Organizations" and  <RowNumber>
    When user click on print button in Organizations page
    When user click on delete the record in Organizations page

    Examples:
      | RowNumber |
      | 0         |