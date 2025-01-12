package Demosite;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import DataDriven.ExcelManager;

public class TestDemo {
	
	WebDriver wd;
	ChromeOptions cd;
	
	
	@BeforeMethod
	public void beforeMethodforDemoEver() throws MalformedURLException {
		
		cd = new ChromeOptions();
		wd = new RemoteWebDriver(new URL("http://192.168.29.33:4444"),cd);
	}
	
	@DataProvider(name = "LoginData")
	public Object[][] generateData() throws IOException{
		return ExcelManager.getData();
	}
	
	@Test
	public void CallingMethods() throws InterruptedException {
		LoginPageModel lom = new LoginPageModel(wd);
		HomePageModel hom = new HomePageModel(wd);
		lom.OpeningURL()
		.fillcretential("akhiljda@gmail.com","Password")
		.ClickOnSubmitButton();
		hom.Clickitem("Nike zoom fly", "XL");
	}	
	
//	@Test(dataProvider = "LoginData")
//	public void CallingMethods(String UN, String PW) throws InterruptedException {
//		LoginPageModel lom = new LoginPageModel(wd);
//		//HomePageModel hom = new HomePageModel(wd);
//		lom.OpeningURL()
//		.fillcretential(UN,PW)
//		.ClickOnSubmitButton();
//		//hom.Clickitem("Nike zoom fly", "XL");
//	}
}
