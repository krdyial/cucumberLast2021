Feature: US1000 google search
	Background: User on the google page
		Given user goes to google homepage
	@wip
	Scenario: TC01 verify iphone search
		And user sends "iphone" 
		Then user verifies the "iphone"	
		@wik
	Scenario: TC02 verify wohnung search
		And user sends "wohnung" in the searchbox
		Then user verifies the "wohnung"	
