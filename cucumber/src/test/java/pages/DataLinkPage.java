package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.Driver;

public class DataLinkPage {
	public DataLinkPage() {
		PageFactory.initElements(Driver.getDriver(), this);
	}
	
	@FindBy(xpath = "(//button[@type='button'])[1]")
	public WebElement newButton;
	
	@FindBy(id = "DTE_Field_first_name")
	public WebElement firstnameBox;
	
	@FindBy(id="DTE_Field_last_name")
	public WebElement lastnameBox;
	
	@FindBy(id = "DTE_Field_position")
	public WebElement positionBox;
	
	@FindBy(id="DTE_Field_office")
	public WebElement officeBox;
	
	@FindBy(id="DTE_Field_extn")
	public WebElement extensionBox;
	
	@FindBy(id="DTE_Field_start_date")
	public WebElement startDateBox;
	
	@FindBy(id="DTE_Field_salary")
	public WebElement salaryBox;
	
	@FindBy(xpath = "//*[text()='Create']")
	public WebElement createButton;
	
	@FindBy(xpath = "//input[@type='search']")
	public WebElement searchBox;
	
	@FindBy(xpath = "//td[@class='sorting_1']")
	public WebElement searchBoxResult;
}
