Feature: feature to test UnHappy flow for Todos functionality
   
 @UnHappyFlow
  Scenario: User wants to verify the todos list page Title with incorrect URL
   Given user verify the TODOs page Title
   
  @UnHappyFlow
  Scenario: User not allowed to save empty Todo list
    Given user login to TODOs list
    Given user adds the first TODOs item
    And user adds the second TODOs item
    Then user should not able to edit and save empty TODO list