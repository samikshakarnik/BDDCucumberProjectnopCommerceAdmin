package stepDefination;

import java.time.Duration;
import java.util.List;

import org.junit.runner.RunWith;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.*;
import io.cucumber.junit.Cucumber;
import pageObjectModel.SearchCustomerScenario;

	@RunWith(Cucumber.class)
	public class SearchCustomerStepDefination {
	
		public WebDriver driver;
		
		@Before
		public void setup() {
			driver = new ChromeDriver();
		}

	@When("^user navigates to the Admin url \"([^\"]*)\"$")
	public void user_navigates_to_the_admin_url_something(String url) {
		driver.get(url);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}

	@Then("^login with email \"([^\"]*)\" and password \"([^\"]*)\"$")
	public void login_with_email_something_and_password_something(String email, String password) {
		SearchCustomerScenario obj = new SearchCustomerScenario(driver);
		obj.enterEmail().clear();
		obj.enterEmail().sendKeys(email);
		obj.enterPassword().clear();
		obj.enterPassword().sendKeys(password);
		obj.clickLogin().click();
	}

	@And("^Click on Customers from the left pannel and again click on Customers$")
	public void click_on_customers_from_the_left_pannel_and_again_click_on_customers() {
		SearchCustomerScenario obj = new SearchCustomerScenario(driver);
		obj.clickonCustomer().click();
		obj.customers().click();
	}

	@Then("User enters Search values")
	public void user_enters_search_values(DataTable dataTable) {
		SearchCustomerScenario obj = new SearchCustomerScenario(driver);
		List<List<String>> data = dataTable.cells();
		obj.searchCustomerEmail().sendKeys(data.get(0).get(0));
		obj.searchFirstName().sendKeys(data.get(0).get(1));
		obj.searchLastName().sendKeys(data.get(0).get(2));
	}

	@Then("Click on Search")
	public void click_on_search() {
		SearchCustomerScenario obj = new SearchCustomerScenario(driver);
		obj.clickOnSearch().click();
		String text = obj.searchCustomerRoles().getText();
		System.out.println(text);
		try {
		if (text.equals("Registered")) {
			System.out.println("You have searched Right Customer");
		} else {
			System.out.println("You have searched wrong Customer");
		}
	}catch(StaleElementReferenceException exe) {
		if (text.equals("Registered")) {
			System.out.println("You have searched Right Customer");
		} else {
			System.out.println("You have searched wrong Customer");
	}
	
	}
	}
	
	@After
    public void close() {
    	driver.quit();
    }

}
