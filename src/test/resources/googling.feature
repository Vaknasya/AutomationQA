Feature: Google search
  As a user
  I want to be able to search for a term on Google
  So that I can find information related to that term

  Scenario: Search for "Java" on Google
    Given I am on the Google search page
    When I search for "Java"
    Then I see search results for "Java"
