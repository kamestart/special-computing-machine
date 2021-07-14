package stepdefinitions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.LoginPage;

public class LoginDemoSteps {

	WebDriver driver ;
	LoginPage loginPage;
	
	@Given("User has launched the browser")
	public void user_has_launched_the_browser() {
		System.setProperty("webdriver.chrome.driver", "src\\test\\resources\\drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		loginPage  = new LoginPage(driver);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);		
	}

	@And("User opens the website")
	public void user_opens_the_website() {
	driver.get("https://example.testproject.io/web/");
	
	}

	@When("^user enters (.*) and (.*)$")
	public void user_enters_username_and_password(String username, String password) {
		loginPage.enterUserName(username);
		loginPage.enterPassword(password);
	
	}

	@When("user clicks on login button")
	public void user_clicks_on_login_button() {
		loginPage.clickLoginBtn();
	}

	
	  @Then("user is navigated to home page") public void
	  user_is_navigated_to_home_page() {
	  
	  driver.findElement(By.id("logout")).isDisplayed();
	  
	  driver.close(); driver.quit();
	  
	  
	  }
	 


}
