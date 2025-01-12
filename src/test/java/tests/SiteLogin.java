package tests;

import models.HomepageModel;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import static constants.constant.password;
import static constants.constant.username;

public class SiteLogin {

    WebDriver driver= new ChromeDriver();
    String URL= "https://demo.evershop.io/account/login";
@Test
    public void loginToPage()
{
    HomepageModel homepageModel= new HomepageModel(driver);

    homepageModel.openLoginPage(URL);
    homepageModel.loginWithCreds(username,password);
}

}
