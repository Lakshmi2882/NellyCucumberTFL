Feature: PlanAJourney
  As a user
  I want to navigate to TFL plan journey
  To plan my journey using journey planner widgets


  Scenario: Validate user journey can be planned using the widget
   Given I navigate to Tfl website
    When I click on cookies button
    Then plan a journey page is displayed
    When I enter from a location
    And I enter to a location
    And I click change time link

    When I select leaving date
    And I select leaving time
    And I click plan my journey
    Then quieter Times Message Displayed

    When I click on Home button
    And Click on Recents Tab

    Then I can Recentinformation

