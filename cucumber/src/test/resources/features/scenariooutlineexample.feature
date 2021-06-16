Feature: US1003_ user should add data with scenario outline
	
	Scenario Outline: TC01 Testing data tables web page
		Given user is on the homepage
		And  user clicks new button
		When user enters the "<firstname>"
		And user enters the "<lastname>"
		And user enters the "<position>" 
		When user enters the "<office>"
		When user enters the "<extention>"
		When user enters the "<startdate>"
		When user enters the "<salary>"
		And user clicks on the create button
		And user searchs for the "<firstname>"
		Then user verifies the name fields contains "<firstname>"
		
		Examples:
			|firstname|lastname|position|office|extention|startdate|salary|
			|Alper		|Fötr		 | Software Engineer|IT|456|2021-04-18|4300      |

