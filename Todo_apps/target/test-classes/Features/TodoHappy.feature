Feature: feature to test Happy flow for Todos functionality

  Background: 
    Given user login to TODOs list

  @HappyFlow
  Scenario: User wants to verify the todos list page
    Given user verify the TODOs page

  @HappyFlow
  Scenario: User wants to verify the todos list page and creates a TODO
    When user writes in the TODO field
    Then user removes first TODO item

  @HappyFlow
  Scenario: User wants to creates multiple TODOs and removes first todo item
    Given user adds the first TODOs item
    And user adds the second TODOs item
    And user adds the third TODOs item
    Then user removes first TODO item added

  @HappyFlow
  Scenario: User wants to creates multiple TODOs and mark it as complete
    Given user adds the first TODOs item
    And user adds the second TODOs item
    And user able to complete created TODO list
    Then user able to clear completed TODO list

  @HappyFlow
  Scenario: User wants to edit the TODOs
    Given user adds the first TODOs item
    And user adds the second TODOs item
    Then user able to edit and save TODO list
    
  @HappyFlow
  Scenario: User not saves empty Todo list
    Given user adds the first TODOs item
    And user adds the second TODOs item
    Then user should not able to save the empty Todo list