Feature: Reports feature

  Background:
    Given user has already logged in to application
      | username  | password |
      | Admin | Issi123# |
    When user gets the title of the page
    Then page title should be "About"
    When user click on Reports Module

     #  ############################################
    #
    #  Module name ---> Reports
    #
    #  Sub-module ---> Applications Summary Report
    #
    #  #############################################
  @ApplicationsSummaryReport
  Scenario: Applications Summary Report
    When user click on Applications Summary Report
    When user gets the title of the page
    Then page title should be "ApplicationsInventorySummaryReport"
    When user select the value in Month dropdown field in Applications Summary Report
    When user select the value in Year dropdown field in Applications Summary Report
    When user click on generate button in Applications Summary Report
    When user click on Excel button in Applications Summary Report
    When user click on Print button in Applications Summary Report

    #  ############################################
    #
    #  Module name ---> Reports
    #
    #  Sub-module ---> Applications Pended Detail Report
    #
    #  #############################################
  @ApplicationsPendedDetailReport
  Scenario: Applications Pended Detail Report
    When user click on Applications Pended Detail Report
    When user gets the title of the page
    Then page title should be "ApplicationsPendedSummaryReport"
    When user select the value in Reason Code field in Applications Pended Detail Report
    When user select the value in Month dropdown field in Applications Pended Detail Report
    When user select the value in Year dropdown field in Applications Pended Detail Report
    When user click on generate button in Applications Pended Detail Report
    When user click on Print button in Applications Pended Detail Report

     #  ############################################
    #
    #  Module name ---> Reports
    #
    #  Sub-module ---> Membership by Month Report
    #
    #  #############################################
  @MembershipbyMonthReport
  Scenario: Membership by Month Report
    When user click on Membership by Month Report
    When user gets the title of the page
    Then page title should be "MembershipReport"
    When user select the value in Month dropdown field in Membership by Month Report
    When user select the value in Year dropdown field in Membership by Month Report
    When user click on generate button in Membership by Month Report
    When user click on Print button in Membership by Month Report

     #  ############################################
    #
    #  Module name ---> Reports
    #
    #  Sub-module --->  Terminated Members Report
    #
    #  #############################################
  @TerminatedMembersReport
  Scenario: Terminated Members Report
    When user click on Terminated Members Report
    When user gets the title of the page
    Then page title should be "TerminatedMembersReport"
    When user select the value in Reason Code field in Terminated Members Report
    When user select the value in Month dropdown field in Terminated Members Report
    When user select the value in Year dropdown field in Terminated Members Report
    When user click on generate button in Terminated Members Report
    When user click on Print button in Terminated Members Report

     #  ############################################
    #
    #  Module name ---> Reports
    #
    #  Sub-module --->  Membership by County
    #
    #  #############################################
  @MembershipbyCounty
  Scenario: Membership by County
    When user click on Membership by County
    When user gets the title of the page
    Then page title should be "MembershipbyCountyReport"
    When user select the value in County Name field in Membership by County
    When user select the value in Month dropdown field in Membership by County
    When user select the value in Year dropdown field in Membership by County
    When user click on generate button in Membership by County
    When user click on Print button in Membership by County

     #  ############################################
    #
    #  Module name ---> Reports
    #
    #  Sub-module ---> Membership Distribution by Plan
    #
    #  #############################################
  @MembershipDistributionbyPlan
  Scenario: Membership Distribution by Plan
    When user click on Membership Distribution by Plan
    When user gets the title of the page
    Then page title should be "MembershipbyDistributionbyPlan"
    When user select the value in Organizations field in Membership Distribution by Plan
    When user select the value in Month dropdown field in Membership Distribution by Plan
    When user select the value in Year dropdown field in Membership Distribution by Plan
    When user click on generate button in Membership Distribution by Plan
    When user click on Print button in Membership Distribution by Plan
