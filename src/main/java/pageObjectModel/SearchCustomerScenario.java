package pageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SearchCustomerScenario {
	
	public WebDriver driver;
	
	private By enterEmail = By.xpath("//input[@id='Email']");
	private By enterPassword = By.xpath("//input[@id='Password']");
	private By clickLogin= By.xpath("//button[@type='submit']");
	private By clickonCustomer = By.xpath("(//p[contains(text(),'Customers')])[1]");
	private By customers = By.xpath("(//p[contains(text(),'Customers')])[2]");
	private By searchCustomerEmail = By.xpath("//input[@id='SearchEmail']");
	private By searchFirstName = By.xpath("//input[@id='SearchFirstName']");
	private By searchLastName = By.xpath("//input[@id='SearchLastName']");
	private By clickOnSearch = By.xpath("//button[@id='search-customers']");
	private By searchCustomerRoles = By.xpath("//tbody//tr[@class='odd']//td[4]");

	
	
	public SearchCustomerScenario(WebDriver driver2) {
		this.driver = driver2;
	}

	public WebElement enterEmail() {
		return driver.findElement(enterEmail);
	}
	
	public WebElement enterPassword() {
		return driver.findElement(enterPassword);
	}
	
	public WebElement clickLogin() {
		return driver.findElement(clickLogin);
	}
	
	public WebElement clickonCustomer() {
		return driver.findElement(clickonCustomer);
	}
	
	public WebElement customers() {
		return driver.findElement(customers);
	}
	
	public WebElement searchCustomerEmail() {
		return driver.findElement(searchCustomerEmail);
	}
	
	public WebElement searchFirstName() {
		return driver.findElement(searchFirstName);
	}
	
	public WebElement searchLastName() {
		return driver.findElement(searchLastName);
	}
	
	public WebElement clickOnSearch() {
		return driver.findElement(clickOnSearch);
	}
	
	public WebElement searchCustomerRoles() {
		return driver.findElement(searchCustomerRoles);
	}

}
