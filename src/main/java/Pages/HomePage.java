package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
    private WebDriver driver;
    @FindBy (id = "gh-ac")
    WebElement searchBox;

    @FindBy(xpath ="//span[text()='Search']" )
    WebElement searchButton;

    public HomePage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }

    public void enterSearchKeyword(String keyword) {
         searchBox.sendKeys(keyword);
    }

    public void clickSearchButton() {
         searchButton.click();
    }
}