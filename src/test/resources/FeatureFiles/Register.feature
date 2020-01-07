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
	