package Demosite;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class HomePageModel {

	
	WebDriver driver;
	
	public HomePageModel(WebDriver wd) {
		this.driver = wd;
		
	}
	
	//private By item = By.xpath("//div[@class='listing-tem']//a/span[text()='Nike react phantom run flyknit 2']");
	//private By itemText = By.xpath("//span[text()='dummy']");
	
	
	private String itemText = "//span[text()='dummy']";
	private String SelectingSize = "//a[text()='SearchingSize']";
	private String selectingColor = "//a[text()=\"Blue\"]";
	

	private void ScrollToElement(WebElement element) {
		
		//JavascriptExecutor jse = (JavascriptExecutor) driver;
		//jse.executeScript("window.scrollBy(0,6000)");
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
}
	
	public void Clickitem(String itemName, String itemSize) throws InterruptedException {
		Thread.sleep(5000);		
		String perfferdItemName = itemText.replace("dummy", itemName );
		WebElement itemElement = driver.findElement(By.xpath(perfferdItemName));
		ScrollToElement(itemElement);
		Thread.sleep(500);
		driver.manage().window().maximize();
		itemElement.click();
		String ItemSizeSelection = SelectingSize.replace("SearchingSize",itemSize );
		WebElement sizeelement = driver.findElement(By.xpath(ItemSizeSelection));
		sizeelement.click();
		
		
	}
	
}
