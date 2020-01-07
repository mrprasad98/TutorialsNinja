Feature: Register Functionality Scenarios
@Register @one
Scenario: Verify whether user able to register into application by providing all the details
	Given I launch the browser
	And I navigate to Registration Page
	When I provide all the below valid details
	|firstname	|Prasad		  					 |
	|lastname  |Ramu  						     |
	|email      |ramuprasad@gmail.com  | 
	|telephone	|8867389822					  |
	|password		|prasad@1122								    |
	And I select the privacy policy
	And I click on Continue button
	Then I should see that user account created successfully
	
	@Register @Two
	Scenario: Verify whether user is not allowed to register on skipping the mandatory fields
		Given I launch the browser
		And I navigate to Registration Page
		And I click on Continue button
		Then I should see that user account is not created
		And I should see the error messages informing the user to fill the mandatory fields
		
		@Register @Three
		Scenario: Verify whether the user is able to register into the application by opting for NewsLetter Subscription
		Given I launch the browser
		And I navigate to Registration Page
		When I provide all the below valid details
		|firstname	|Prasad		  					 |
		|lastname  |Ramu  						     |
		|email      |ramuprasad2@gmail.com  | 
		|telephone	|8867389822					  |
		|password		|prasad@1122								    |
	And I select the privacy policy
	And I subscribe to NewsLetter
	And I click on Continue button
	Then I should see that user account created successfully
	
	@Register @Four
	Scenario: Verify whether the user is restricted from creating a duplicate account
		Given I launch the browser
		And I navigate to Registration Page
		When I provided the below duplicate details
		|firstname	|Prasad		  					 |
		|lastname  |Ramu  						     |
		|email      |ramuprasad2@gmail.com  | 
		|telephone	|8867389822					  |
		|password		|prasad@1122								    |
		And I select the privacy policy
		And I click on Continue button
		Then I should see that the user is rescricted from creating duplicate account
		