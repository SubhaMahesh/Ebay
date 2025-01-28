package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.devtools.v85.page.Page;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchResultsPage {
    private WebDriver driver;

    @FindBy(xpath = "(//div[@class='s-item__info clearfix'])[3]//div[@class='s-item__title']")
    WebElement firstItem;

    public SearchResultsPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }

    public void clickFirstItem() {
       // WebElement firstItem = driver.findElement(By.xpath("//ul[@id='ListViewInner']/li[1]//h3/a"));
        firstItem.click();
    }
}
