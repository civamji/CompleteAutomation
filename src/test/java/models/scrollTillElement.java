package models;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class scrollTillElement {

    public static void main(String[] args) throws InterruptedException {
//        System.setProperty("webdriver.chrome.driver",
//                "C:\Users\ghs6kor\Desktop\Java\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        JavascriptExecutor js = (JavascriptExecutor)driver;
        String url = "https://www.tutorialspoint.com/scroll-element-into-view-with-selenium";
        driver.get(url);
        Thread.sleep(5000);
       // driver.manage().timeouts().implicitlyWait(12, TimeUnit.SECONDS);
        // identify element
        WebElement element=driver.findElement(By.xpath("//li[normalize-space()='Related Articles']"));

        // Javascript executor to scroll page till element location
        ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true);", element);

        //JavaScript executor to scroll page till bottom of the page
        js.executeScript("window.scrollTo(0,document.body.scrollHeight)");

        driver.quit();

    }

}
