package stepdefinitions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class GoogleSearchSteps {

	WebDriver driver;

	
	  @Given("browser is open") public void browser_is_open() {
	  
	  System.out.println("Opening Browser");
	  
	  System.out.println("User dir=" + System.getProperty("user.dir"));
	  System.setProperty("webdriver.chrome.driver",
	  "src\\test\\resources\\drivers\\chromedriver.exe"); driver = new
	  ChromeDriver(); driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	  
	  }
	  
	  @Given("User is on google search page") public void
	  user_is_on_google_search_page() { driver.get("http://www.google.com");
	  //driver.navigate().to("https://www.google.com/");
	  
	  }
	  
	  @When("user enters a text in search box") public void
	  user_enters_a_text_in_search_box() {
	  driver.findElement(By.name("q")).sendKeys("wither meaning"); }
	  
	  @When("hits enter") public void hits_enter() {
	  
	  driver.findElement(By.name("btnK")).click(); }
	  
	  @Then("user is navigated to search results") public void
	  user_is_navigated_to_search_results() { System.out.println("Page Title : " +
	  driver.getTitle());
	  
	  }
	 

}
