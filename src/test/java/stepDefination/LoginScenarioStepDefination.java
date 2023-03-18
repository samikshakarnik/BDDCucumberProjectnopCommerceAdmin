package stepDefination;

import java.time.Duration;

import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.junit.Cucumber;
import pageObjectModel.LoginScenario;

@RunWith(Cucumber.class)
public class LoginScenarioStepDefination {
	
	public WebDriver driver;
	
	@Before
	public void setup() {
		driver = new ChromeDriver();
	}
  
    @Given("^User navigates to url \"([^\"]*)\"$")
    public void user_navigates_to_url_something(String url) throws Throwable {
    	driver.get(url); 
    	driver.manage().window().maximize();
    	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }

    @Then("^User enters email as \"([^\"]*)\" and password as \"([^\"]*)\" and click on login$")
    public void user_enters_email_as_something_and_password_as_something_and_click_on_login(String email, String password) throws Throwable {
    	LoginScenario obj = new LoginScenario(driver);
    	obj.enterEmail().clear();
        obj.enterEmail().sendKeys(email);
        obj.enterPassword().clear();
        obj.enterPassword().sendKeys(password);
        obj.clickLogin().click();
        
    }

    @Then("^Page Title should be \"([^\"]*)\"$")
    public void page_title_should_be_something(String urlTitle) throws Throwable {
    	String title = driver.getTitle();
    	System.out.println(title);
    	if (title.equals(urlTitle)) {
    		System.out.println("Same Title");
    	}else 
    	{
    		System.out.println("Not found");
    	}
    }

    @And("^click on Logout then page title should be \"([^\"]*)\"$")
    public void click_on_logout_then_page_title_should_be_something(String strArg1) throws Throwable {
    	LoginScenario obj = new LoginScenario(driver);
    	obj.clickonLogout().click();
         System.out.println(driver.getTitle());
    }

    @Given("^User direct to url \"([^\"]*)\"$")
    public void user_direct_to_url_something(String url) throws Throwable {
    	driver.get(url);
    	driver.manage().window().maximize();
    	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }

    @Then("^User enters email as \"([^\"]*)\" and wrong password as \"([^\"]*)\" and click on login$")
    public void user_enters_email_as_something_and_wrong_password_as_something_and_click_on_login(String email, String password) throws Throwable {
    	LoginScenario obj = new LoginScenario(driver);
    	obj.enterEmail().clear();
    	obj.enterEmail().sendKeys(email);
    	obj.enterPassword().clear();
    	obj.enterPassword().sendKeys(password);
    	obj.clickLogin().click();
    }

    @Then("^Page Title detected as \"([^\"]*)\"$")
    public void page_title_detected_as_something(String pageTitle) throws Throwable {
    		String title = driver.getTitle();
    		System.out.println(title);
    		if (title.equals(pageTitle)) {
    			System.out.println("Same Title");
    		}
    		else  {
    			System.out.println("Not found");
    		}	
    }

    @And("^Error should be thrown as \"([^\"]*)\"$")
    public void error_should_be_thrown_as_something(String strArg1) throws Throwable {
    	LoginScenario obj = new LoginScenario(driver);
    	String ErrorMsg =obj.errorMSG().getText();
    	System.out.println(ErrorMsg);
    }
    
    @After
    public void close() {
    	driver.quit();
    }
    
}
