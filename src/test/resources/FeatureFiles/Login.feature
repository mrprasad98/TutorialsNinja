Feature: Login Functionality Scenarios

@Login @one
Scenario: Verify whether user able to login with valid credentials
	Given I launch the browser
	And I navigate to Account login page
	When I login into the application using username "ramuprasad@gmail.com" and password "prasad@1122"
	Then I should see that the user able to login successfully
	
	@Login @Two
	Scenario: Verify user should not login with invalid credentials
		Given I launch the browser
		And I navigate to Account login page
		When I login into the application using username "ramuprasad3@gmail.com" and password "prasad@1122"
		Then I should see an error message that the credentials are invalid
		
		@Login @Three
		Scenario: Verify user should not login without credentials
		Given I launch the browser
		And I navigate to Account login page
		When I login into the application using username "ra" and password "m"
		Then I should see an error message that the credentials are invalid
		
		@Login @Four
		Scenario: Verify user able to reset forgotten password
		Given I launch the browser
		And I navigate to Account login page
		When I reset the forgotten password for email "ramuprasad@gmail.com"
		Then I should the message informing the user that information related to resetting password have been sent to email address
		
		