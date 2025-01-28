import Pages.CartPage;
import Pages.HomePage;
import Pages.ProductDetailsPage;
import Pages.SearchResultsPage;
import Utils.WebDriverUtils;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class EbayTest {
    private WebDriver driver;
    private HomePage homePage;
    private SearchResultsPage searchResultsPage;
    private ProductDetailsPage productDetailsPage;
    private CartPage cartPage;

    @BeforeClass
    public void setUp() {
        driver = WebDriverUtils.initializeDriver();
        driver.get("https://www.ebay.com");
        homePage = new HomePage(driver);
        searchResultsPage = new SearchResultsPage(driver);
        productDetailsPage = new ProductDetailsPage(driver);
        cartPage = new CartPage(driver);
    }

    @Test
    public void testAddItemToCart() throws InterruptedException {
        homePage.enterSearchKeyword("book");
        homePage.clickSearchButton();
        searchResultsPage.clickFirstItem();
        productDetailsPage.addToCart();
      //  cartPage.verifyItemsInCart("1");
    }

    @AfterClass
    public void tearDown() {
        WebDriverUtils.quitDriver();
    }
}