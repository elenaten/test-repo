Feature: Movie Player actions

  Background:
    Given the User is on the brainpop homepage
    And enters the correct credential to "Log In"
    Then User should be able to "Log In"
    When the user inputs "Challenge" in the Search box
    And clicks on Search button
    Then the user should see Search Results

  Scenario: the user proceed to DNA topic
    When the user should see the "DNA" topic
    And clicks on "DNA" topic
    Then the user should redirect to DNA homepage
    And should be able to see the video Player

  Scenario: the user will be able to play the video
    When the user clicks on the play button
    And see video playing
    Then the user clicks on the pause button
    And see video on pause

  Scenario: the user will be able to see captions
    When the user turns on the captions button
    Then verify that the user will be able to see subtitles
    When the user turns off the captions button
    Then verify that the user will not see subtitles



