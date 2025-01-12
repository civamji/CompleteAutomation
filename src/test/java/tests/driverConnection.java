package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class driverConnection {
    @Parameters({"browser"})
    @Test
      public WebDriver BrowserDriverSelect(String browser)
    {
        switch (browser) {
            case "Chrome":
      WebDriver driver= new ChromeDriver();
      return driver;
            case "Firefox":
                WebDriver driver2= new FirefoxDriver();
                return driver2;
                case "Safari":
                WebDriver driver3= new SafariDriver();
                return driver3;
            default:
                WebDriver driver4= new ChromeDriver();
                return driver4;
        }

    }

}
