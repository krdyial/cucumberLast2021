Feature: US1001 user should add data
	Background:
		Given user go to datalink
		
	Scenario: TC01 user adds data
		When user clicks on the new button
		When user enters all fields
		And user searches for the firstname
		Then user verifies the name fields contain firstname
		
			
