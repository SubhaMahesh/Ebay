package Pages;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;




public class ProductDetailsPage {
    private WebDriver driver;
   @FindBy(xpath = "//*[text()='Add to cart']")
   WebElement cartButton;

    public ProductDetailsPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }

    public void addToCart()  {

       cartButton.click();
    }
}