package Demosite;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPageModel {
	
	WebDriver driver;
	
	private String LoginPageURL = "https://demo.evershop.io/account/login";
	private By usernameField = By.xpath("//input[@name = 'email']");
	private By passwordField = By.xpath("//input[@name = 'password']");
	private By ClickSubmitButton = By.xpath("//span[text() = 'SIGN IN']");
	
	
	public LoginPageModel( WebDriver wd) {
		this.driver = wd;
		
	}
	
	public LoginPageModel OpeningURL() {
		driver.get(LoginPageURL);
		return this;
		
	}
	
	public LoginPageModel fillcretential(String Username, String Password) {
		driver.findElement(usernameField).sendKeys(Username);
		driver.findElement(passwordField).sendKeys(Password);
		return this;
		
	}
	
   public void ClickOnSubmitButton() {
	   driver.findElement(ClickSubmitButton).click();
	   	   
   }

}
