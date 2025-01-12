package models;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomepageModel {

        WebDriver driver;

        public HomepageModel(WebDriver wd)
        {
            this.driver=wd;
        }

       private By usernameFieldIdentifier= By.xpath("//input[@placeholder='Email']");
       private By passwordFieldIdentifier= By.xpath("//input[@placeholder='Password']");
       private By signInButtonClick=By.xpath("//button[@type='submit']");


        public WebDriver loginWithCreds(String username, String password)
        {
            WebElement usernameField = driver.findElement(usernameFieldIdentifier);
            usernameField.sendKeys(username);

            // Find the password field and enter the password
            WebElement passwordField = driver.findElement(passwordFieldIdentifier);
            passwordField.sendKeys(password);

            // Click on the Sign In button
            WebElement signInButton = driver.findElement(signInButtonClick);
            signInButton.click();

            return driver; // Return the driver instance after login
        }

        public WebDriver openLoginPage(String URL)
        {
            driver.get(URL);
            return driver;
        }



}
