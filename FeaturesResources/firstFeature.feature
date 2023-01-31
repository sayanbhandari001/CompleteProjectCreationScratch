Feature: firstFeature 

@sanity
Scenario: LoginScenario 

	Given I have proper login url 
	And I have proper login credentials 
	When clicked on login button 
	Then should get logged in successfully 
	And go to cart
	And place order using net banking
	
	