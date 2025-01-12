package stepdef;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import models.HomepageModel;
import models.addProductModel;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;
import tests.SiteLogin;

import java.net.MalformedURLException;
import java.net.URL;

import static constants.constant.loginURL;

public class e2eStepdef {

    public WebDriver wd;
    SiteLogin login;
    HomepageModel home;
    addProductModel item;


    @Before
    public void setUpWebDriver() throws MalformedURLException
    {
        //ChromeOptions chromeOptions= new ChromeOptions();
        wd= new ChromeDriver();
        // wd= new RemoteWebDriver(new URL("https://102.168.0.126:4444"),chromeOptions);
        home= new HomepageModel(wd);
        item= new addProductModel(wd);
    }

    @After
    public void tearDownDriver()
    {
    if(wd!=null)
{
    wd.quit();
}
    }

    @Given("User is already logged with credentials as {string} and {string}.")
    public void userLogin(String username, String password)  {
        home.openLoginPage(loginURL);
        home.loginWithCreds(username,password);
      //  Thread.sleep(5000);
    }

    @Given("User clicks on item {string}")
    public void clickItem(String itemName)  {  // Thread.sleep(5000);
       item.clickItem();
     //  item.getItemName();

    }

    @When("User selects the user option size as {string} and color as {string}")
    public void selectSizeandColor(String size, String color) throws InterruptedException {
   // Thread.sleep(5000);
    item.fillQuantity("2");
    item.selectSize(size);
    item.selectColour(color);
    }

//    @When("User click on {string}.")
//    public void clickOnButton(String AddToCart)
//    {
//    item.clickOnAddToCart();
//    }

    @And("User click on {string}.")
    public void userClickOnAddToCart(String AddToCart) {
    item.clickOnAddToCart();
    }
}
