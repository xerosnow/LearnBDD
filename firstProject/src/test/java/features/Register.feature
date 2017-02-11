Feature: Proof of concept that this framework works

  Scenario: Adding a member to the new tours website
    Given The user on the newtours web page
    When User selects register link
    And User fills in the Contact Info
    And User enters User information
    And User selects Submit
    Then System should show the thank you page
