@loginflow
Feature: Login Flow
  Background:
    Given the User is on the brainpop homepage

  Scenario: Log In Button Validation
    Then User should be able to see "Log In" button

  Scenario: Positive scenario to Log In
    Given User enter the correct credential to "Log In"
    Then User should be able to "Log In"

  Scenario: Negative scenario to Log In
    Given User enter the incorrect credential to "Log In"
    Then User should be see the error message