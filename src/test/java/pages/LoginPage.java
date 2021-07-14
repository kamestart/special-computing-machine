package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

	WebDriver driver;

	
//
//	By txt_userName = By.id("name");
//	By txt_password = By.id("password");
//	By btn_login = By.id("login");
//
//	public void enterUserName(String userName) {
//		driver.findElement(txt_userName).sendKeys(userName);
//	}
//
//	public void enterPassword(String password) {
//		driver.findElement(txt_password).sendKeys(password);
//	}
//
//	public void clickLoginBtn() {
//		driver.findElement(btn_login).click();
//	}
	@FindBy(id = "name")
	WebElement txt_userName;
	
	@FindBy(id = "password")
	WebElement txt_password;
	
	@FindBy(id = "login")
	WebElement btn_login;
	
	
	public LoginPage(WebDriver driver) {
		super();
		this.driver = driver;
		PageFactory.initElements(driver	,this);
	}
	
	
	public void enterUserName(String userName) {
		txt_userName.sendKeys(userName);
	}

	public void enterPassword(String password) {
		txt_password.sendKeys(password);
	}

	public void clickLoginBtn() {
		btn_login.click();
	}
	
	

}
