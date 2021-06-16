package stepdefinitions;

import org.junit.Assert;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.github.javafaker.Faker;

import io.cucumber.java.en.*;
import pages.DataLinkPage;
import utilities.ConfigReader;
import utilities.Driver;

public class DataLinkSetpDef {
	DataLinkPage data= new DataLinkPage();
	Faker faker= new Faker();
	String firstname= faker.name().firstName();
	String lastname= faker.name().lastName();
	WebDriverWait wait= new WebDriverWait(Driver.getDriver(), 15);
	
	
	@Given("user go to datalink")
	public void user_go_to_datalink() {
	    Driver.getDriver().get(ConfigReader.getProperty("datalink"));
	    //date: 2021-06-17
	}

	@When("user clicks on the new button")
	public void user_clicks_on_the_new_button() {
	    data.newButton.click();
	}

	@When("user enters all fields")
	public void user_enters_all_fields() {
	   data.firstnameBox.sendKeys(firstname);
	   data.lastnameBox.sendKeys(lastname);
	   data.positionBox.sendKeys("Engineer");
	   data.officeBox.sendKeys("IT");
	   data.extensionBox.sendKeys("Private");
	   data.startDateBox.sendKeys("2021-07-18");
	   data.salaryBox.sendKeys("51600");
	   wait.until(ExpectedConditions.visibilityOf(data.createButton)).click();;
	   
	}

	@When("user searches for the firstname")
	public void user_searches_for_the_firstname() {
		data.searchBox.sendKeys(firstname);
	    
	}

	@Then("user verifies the name fields contain firstname")
	public void user_verifies_the_name_fields_contain_firstname() {
	    Assert.assertTrue(data.searchBoxResult.getText().contains(firstname));
	    System.out.println("SearchnameResult:"+ data.searchBoxResult.getText());
	}

}
