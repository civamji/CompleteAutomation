import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SiteLogin {

    public void LoginWithCred(WebDriver driver) {
        driver.get("https://www.automationexercise.com/login");
        driver.findElement(By.xpath("//input[@data-qa='login-email']")).sendKeys("sharmashivam637@gmail.com");
        driver.findElement(By.xpath("//input[@data-qa='login-password']")).sendKeys("12345678");
        driver.findElement(By.xpath("//input[@data-qa='login-button']")).click();

    }
}
