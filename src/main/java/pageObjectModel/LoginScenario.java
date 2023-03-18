package pageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginScenario {

	public WebDriver driver;
	
	private By enterEmail = By.xpath("//input[@id='Email']");
	private By enterPassword = By.xpath("//input[@id='Password']");
	private By clickLogin= By.xpath("//button[@type='submit']");
	private By clickonLogout = By.xpath("//a[normalize-space()='Logout']");
	private By errorMSG = By.xpath("//div[@class='message-error validation-summary-errors']");
	
	
	public LoginScenario(WebDriver driver2) {
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
	
	public WebElement clickonLogout() {
		return driver.findElement(clickonLogout);
	}
	
	public WebElement errorMSG() {
		return driver.findElement(errorMSG);
	}
	
	

}
