import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

public class SiteLogin {

    String username="civamofficial@gmail.com";
    String password="987654321";
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
