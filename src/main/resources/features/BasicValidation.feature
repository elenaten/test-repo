Feature: Basic Validation
  Background:
    Given the User is on the brainpop homepage

  Scenario: Title Verification
    Then verify the title contains mainSign

  Scenario: URL Verification
    Then verify the URL contains "https://www.brainpop.com/"