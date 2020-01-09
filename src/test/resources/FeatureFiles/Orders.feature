Feature: Orders functionality scenarios
@Orders @one
Scenario: Verity whether user able to place orders
	Given I login into application
	When I add product to bag and checkout
	And Fill Billingdetails
	|FirstName|Ramu|
	|LastName|Prasad|
	|Company|Infosys|
	|Address1|Jayanagar|
	|Address2|AayapaTemple|
	|City			  |Bengaluru|
	|PostCode|6600235|
	|Country|India|
	|State|Karnataka|
	
	And I Place an Order
	Then I should see order placed successfully
	
	 
