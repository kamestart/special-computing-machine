Feature: Feature to test Google search functionality
	@smoke
  Scenario: Validate that Google search is working
    Given browser is open
    And User is on google search page
    When user enters a text in search box
    And hits enter
    Then user is navigated to search results
