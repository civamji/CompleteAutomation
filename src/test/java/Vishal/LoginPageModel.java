package Vishal;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.time.Duration;

public class LoginPageModel{

    WebDriver driver;

    public LoginPageModel(WebDriver wd){
        this.driver = wd;
    }

    private String homePageUrl = "https://demo.evershop.io/";
    private By loginPageUrl = By.xpath("//a[@href='https://demo.evershop.io/account/login']");
    private By userNameField = By.xpath("//input[@name='email']");
    private By passwordField = By.xpath("//input[@name='password']");
    private By submitButton = By.xpath("//button[@type='submit']");

    public LoginPageModel openingLoginPage(){
        driver.get(homePageUrl);

        driver.findElement(loginPageUrl)
                .click();
        return this;
    }

    public LoginPageModel fillDetails(String username,String password) {

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.findElement(userNameField).sendKeys(username);
        driver.findElement(passwordField).sendKeys(password);
        return this;
    }

    public void clickOnSubmit(){


        driver.findElement(submitButton).click();
    }
}
