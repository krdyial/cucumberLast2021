package stepdefinitions;

import io.cucumber.java.en.*;
import pages.DataLinkPage;
import utilities.ConfigReader;
import utilities.Driver;

public class ScenarioOutlineStepDef {
	DataLinkPage data= new DataLinkPage();
	
	@Given("user is on the homepage")
	public void user_is_on_the_homepage() {
		Driver.getDriver().get(ConfigReader.getProperty("datalink"));
	}

	@Given("user clicks new button")
	public void user_clicks_new_button() {
		 data.newButton.click();
	}

	@When("user enters the {string}")
	public void user_enters_the(String firstname) {
		 data.firstnameBox.sendKeys(firstname);
	}

	@When("user clicks on the create button")
	public void user_clicks_on_the_create_button() {
	    
	}

	@When("user searchs for the {string}")
	public void user_searchs_for_the(String string) {
	    
	}

	@Then("user verifies the name fields contains {string}")
	public void user_verifies_the_name_fields_contains(String string) {
	    
	}


}
