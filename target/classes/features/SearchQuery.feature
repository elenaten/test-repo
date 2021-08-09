Feature: SearchQuery

  Background:
    Given the User is on the brainpop homepage
    And enters the correct credential to "Log In"
    Then User should be able to "Log In"


  Scenario: Putting search query
    When the user inputs "Challenge" in the Search box
    And clicks on Search button
    Then the user should see Search Results


  Scenario: Positive Scenario: user enters the correct keyword
    When the user inputs "Challenge" in the Search box
    And clicks on Search button
    Then the user should see the total amount of topics

  Scenario: Positive Scenario: user enters the correct keyword
    When the user inputs "chaLLeNgE" in the Search box
    And clicks on Search button
    Then the user should see the total amount of topics

  Scenario: Negative Scenario: user enters incorrect keyword
    When the user inputs "$" in the Search box
    And clicks on Search button
    Then the user should see message no topics found

  Scenario: Negative Scenario: user enters incorrect keyword
    When the user inputs "Chall enge" in the Search box
    And clicks on Search button
    Then the user should see message no topics found

  Scenario: Negative Scenario: user enters incorrect keyword
    When the user inputs "12345" in the Search box
    And clicks on Search button
    Then the user should see message no topics found


  Scenario: Negative Scenario: user enters incorrect keyword
    When the user inputs "12345challenge" in the Search box
    And clicks on Search button
    Then the user should see message no topics found




