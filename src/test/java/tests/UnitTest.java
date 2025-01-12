package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class UnitTest {

    WebDriver driver= new ChromeDriver();

    @Test
            public void hitURL()
    {
    driver.get("https://demo.evershop.io/");
    driver.findElement(By.xpath("//img[@alt='Nike react infinity run flyknit']")).click();

}
    }
