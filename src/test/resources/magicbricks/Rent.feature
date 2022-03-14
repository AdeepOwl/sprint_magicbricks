#Author Adeep
@Rent
Feature: Validate Rent functionality of MagicBricks application

  Background: 
    Given User has already logged in with valid credentials of MagicBricks application
    And User Is navigated to MagicBricks homepage

  @SearchFieldValidation_invalid
  Scenario Outline: Failure in searching property after entering invalid data in search bar Field of MagicBricks application
    Given User enters the "<Location>" in the search bar field of MagicBricks application
    And User clicks on search button of MagicBricks application
    Then alert message is displayed

    Examples: 
      | Location  |
      | Bangalore |
      |           |
      |       123 |
      | asd       |
      | asd123    |

  @SearchFieldValidation_valid
  Scenario Outline: Properties are displayed Successfully after entering valid data in search bar Field of MagicBricks application
    Given User enters the "<Location>" in the search bar field of MagicBricks application
    And User Selects option in drop down link of the search bar field of MagicBricks application
    And User clicks on search button of MagicBricks application
    Then Properties are displayed

    Examples: 
      | Location  |
      | Bangalore |

  @RentingProperties_ownerProperties
  Scenario: Successful renting owner properties
    Given User navigates to rent drop down and clicks on owner properties of MagicBricks application
    And User filters the properties of MagicBricks application
    And Filtered properties are displayed of MagicBricks application
    And User clicks on selected property of MagicBricks application
    And User clicks on contact agent of MagicBricks application
    Then Confirmation message is displayed

  @RentingProperties_verifiedProperties
  Scenario: Successful renting verified properties
    Given User navigates to rent drop down and clicks on verified properties
    And User filters the properties of MagicBricks application
    And Filtered properties are displayed of MagicBricks application
    And User clicks on selected property of MagicBricks application
    And User clicks on save for later of MagicBricks application
    Then Confirmation message is displayed

    @RentingProperties_furnishedHomes
  Scenario: Successful renting furnishedHomes properties
    Given User navigates to rent drop down and clicks on furnishedHomes properties
    And User filters the properties of MagicBricks application
    And Filtered properties are displayed of MagicBricks application
    And User clicks on selected property of MagicBricks application
    And User clicks on save for later of MagicBricks application
    Then Confirmation message is displayed
    
    @RentingProperties_bachelorHomes
  Scenario: Successful renting bachelorHomes properties
    Given User navigates to rent drop down and clicks on bachelorHomes properties
    And User filters the properties of MagicBricks application
    And Filtered properties are displayed of MagicBricks application
    And User clicks on selected property of MagicBricks application
    And User clicks on save for later of MagicBricks application
    Then Confirmation message is displayed
      
    @RentingPropertyType_House
  Scenario: Successful renting house properties
    Given User navigates to rent drop down and clicks on house properties
    And User filters the properties of MagicBricks application
    And Filtered properties are displayed of MagicBricks application
    And User clicks on selected property of MagicBricks application
    And User clicks on contact agent of MagicBricks application
    Then Confirmation message is displayed

  @RentingPropertyType_villa
  Scenario: Successful renting villa properties
    Given User navigates to rent drop down and clicks on villa properties
    And User filters the properties of MagicBricks application
    And Filtered properties are displayed of MagicBricks application
    And User clicks on selected property of MagicBricks application
    And User clicks on save for later of MagicBricks application
    Then Confirmation message is displayed

  @RentingPropertyType_PG
  Scenario: Successful renting PG properties
    Given User navigates to rent drop down and clicks on PG properties
    And User filters the properties of MagicBricks application
    And Filtered properties are displayed of MagicBricks application
    And User clicks on selected property of MagicBricks application
    And User clicks on save for later of MagicBricks application
    Then Confirmation message is displayed

  @RentingPropertyType_OfficeSpace
  Scenario: Successful renting OfficeSpace properties
    Given User navigates to rent drop down and clicks on OfficeSpace properties
    And User filters the properties of MagicBricks application
    And Filtered properties are displayed of MagicBricks application
    And User clicks on selected property of MagicBricks application
    And User clicks on save for later of MagicBricks application
    Then Confirmation message is displayed

  @RentingPropertyBudget_10K
  Scenario: Successful renting under10K properties
    Given User navigates to rent drop down and clicks on under ten_thousand properties
    And User filters the properties of MagicBricks application
    And Filtered properties are displayed of MagicBricks application
    And User clicks on selected property of MagicBricks application
    And User clicks on contact agent of MagicBricks application
    Then Confirmation message is displayed

  @RentingPropertyBudget_10-15k
  Scenario: Successful renting 10-15k properties
    Given User navigates to rent drop down and clicks on fifteen_thousand properties
    And User filters the properties of MagicBricks application
    And Filtered properties are displayed of MagicBricks application
    And User clicks on selected property of MagicBricks application
    And User clicks on contact agent of MagicBricks application
    Then Confirmation message is displayed

  @RentingPropertyBudget_15-25k
  Scenario: Successful renting 15-25k properties
    Given User navigates to rent drop down and clicks on twentyfive_thousand properties
    And User filters the properties of MagicBricks application
    And Filtered properties are displayed of MagicBricks application
    And User clicks on selected property of MagicBricks application
    And User clicks on contact agent of MagicBricks application
    Then Confirmation message is displayed


  @FindAgent
  Scenario: User is able to contact agent Succesfully
    Given User navigates to rent drop down and clicks on Find Agent
    And Agent page is displayed of MagicBricks application
    And User filters the Agent page of MagicBricks application
    And Filtered Agents are displayed of MagicBricks application
    And User clicks on agent of MagicBricks application
    And User clicks on Agent_contact agent of MagicBricks application
    Then Confirmation message is displayed
