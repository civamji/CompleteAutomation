import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class SkyScanner {

    WebDriver driver = new ChromeDriver();

    @Test
    public void BookaTicket() throws InterruptedException {
        driver.get("https://www.skyscanner.co.in/");
        Thread.sleep(5000);
        //driver.wait(5000);
        driver.findElement(By.id("destinationInput-input")).sendKeys("Dubai");
        //driver.wait(5000);
        driver.findElement(By.className("SearchControlButton_SearchControlBtn__YzUyO SearchControlButton_DesktopBtn__NzM1Z")).click();
        driver.findElement(By.xpath("//button[@aria-label='Saturday, 18 January 2025. Select as departure date']")).click();
        //driver.wait(5000);
        driver.findElement(By.xpath("//button[@aria-label='Sunday, 19 January 2025. Select as departure date']")).click();
        //driver.wait(5000);
        driver.findElement(By.xpath("//button[normalize-space()='Search']")).click();
    }
}
