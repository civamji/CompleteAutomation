package tests;

import models.HomepageModel;
import models.addProductModel;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;


public class productaddtest {

    //ChromeOptions cd;
    WebDriver wd;
    ChromeDriver cd;
    String username="civamofficial@gmail.com";
    String password="987654321";
    String URL= "https://demo.evershop.io/account/login";
    @BeforeMethod

        public void beforeMethodforProductAdd() throws MalformedURLException {
        wd= new ChromeDriver();
//        ChromeOptions cd = new ChromeOptions();
//        wd = new RemoteWebDriver(new URL("https://102.168.0.126:4444"), cd);
    }



    @Test
    public void addToCart() throws InterruptedException {
        HomepageModel login= new HomepageModel(wd);
        addProductModel addingProduct= new addProductModel(wd);

        login.openLoginPage(URL);
        login.loginWithCreds(username,password);
        //explicit wait til homepage loads
        Thread.sleep(3000);
        addingProduct.clickItem();
        //Assert.assertEquals(addingProduct.getItemName(),"Nike react infinity run flyknit");

        //explicit wait

        addingProduct.selectSize("M").selectColour("Green").fillQuantity("5").clickOnAddToCart();

    }
}

