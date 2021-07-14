Feature: Test login function functionality
	@smoke
  Scenario: Check login is successful with valid credentials
    Given User has launched the browser
    And User opens the website
    When user enters <username> and <password>
    And user clicks on login button
    Then user is navigated to home page
    Examples: 
      | username | password |
      | abc      |    12345 |
      | xyz      |    12345 |
