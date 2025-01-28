package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;


public class CartPage {
    private WebDriver driver;
//    @FindBy(xpath = "//span[@class='text-display-span']//span[contains(text(),'Item')]")
//    WebElement items;

    public CartPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }

    public void verifyItemsInCart(String expectedItems) throws InterruptedException {
        String itemsText = driver.findElement(By.xpath("//span[contains(text(),'Item')]")).getText();
        Assert.assertEquals(itemsText, expectedItems);
    }
}