package stepdefinitions;

import org.junit.Assert;
import org.openqa.selenium.Keys;

import io.cucumber.java.en.*;
import pages.GooglePage;
import utilities.Driver;

public class GoogleSearchStepDefinition {
	 GooglePage obj= new GooglePage(); 
	
	@Given("user goes to google homepage")
	public void user_goes_to_google_homepage() {
	   Driver.getDriver().get("https://www.google.com");
	    		
	}

		@Given("user sends {string}")
	public void user_sends(String string) {
	    obj.searchBox.sendKeys(string+Keys.ENTER);
	}

	@Then("user verifies the {string}")
	public void user_verifies_the(String string) {
	   String actualTitle = Driver.getDriver().getTitle().toLowerCase();
	   Assert.assertTrue(actualTitle.contains(string));
	   }
	
	@Given("user sends {string} in the searchbox")
	public void user_sends_in_the_searchbox(String string) {
	   obj.searchBox.sendKeys(string+Keys.ENTER);
	}
}
