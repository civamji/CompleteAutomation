import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class addProductModel {
    private WebDriver driver;

    private String itemSizeXpathLocator = "(//ul[contains(@class, 'variant-option-list')])[1]/li/a[text()='%s']";

    private String itemColourXpathLocator = "(//ul[contains(@class, 'variant-option-list')])[2]/li/a[text()='%s']";

    private By itemNameText = By.xpath("//h1[@class='product-single-name']");

    private By quanityTextBox = By.xpath("//input[@name='qty']");

    private By addToCart = By.xpath("//button[@type='button']");

    public addProductModel(WebDriver wd){
        this.driver = wd;
    }

    public WebDriver clickItem()
    {
        /*
        //img[@alt='Nike react infinity run flyknit
         */
        driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/main[1]/div[3]/div[1]/div[1]/div[2]/div[1]/a[1]/img[1]"));
        return driver;
    }
    public String getItemName(){
        return driver.findElement(itemNameText).getText();
    }

    public addProductModel fillQuantity(String quantity){
        driver.findElement(quanityTextBox).clear();
        driver.findElement(quanityTextBox).sendKeys(quantity);
        return this;
    }

    public addProductModel selectSize(String size){
        String itemSizeLocator = itemSizeXpathLocator.replace("%s",size);
        By itemSizeLink = By.xpath(itemSizeLocator);
        driver.findElement(itemSizeLink).click();
        return this;
    }

    public addProductModel selectColour(String colour) throws InterruptedException {
        Thread.sleep(3000);
        String itemColourLocator = itemColourXpathLocator.replace("%s",colour);
        By itemColourLink = By.xpath(itemColourLocator);
        driver.findElement(itemColourLink).click();
        return this;
    }

    public addProductModel clickOnAddToCart(){
        driver.findElement(addToCart).click();
        return this;
    }


}

/*
You have to create 3rd Page Model for the ProductPage and select color
, size etc and click on add to cart,
make sure your code is dynamic just the way I did for selecting item
 */