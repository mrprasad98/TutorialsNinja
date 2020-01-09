Feature: Seach Functionality Scenarios

@Search @one
Scenario: Verify user able to search for the products
	Given I launch the browser
	When I search for product "Samsung SyncMaster 941BW"
	Then I should see the product in searchresult page
	@Search @Two
	Scenario: Verify whether user is informed when the product being searched is not available
	Given I launch the browser
	When I search for product "Apple iphone"
	Then I should see the message as "Your shopping cart is empty!"
	
	