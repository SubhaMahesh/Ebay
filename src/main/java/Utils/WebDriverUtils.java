package Utils;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;

public class WebDriverUtils {
    private static WebDriver driver;

    public static WebDriver initializeDriver() {
        if (driver == null) {
            WebDriverManager.firefoxdriver().setup();
            driver = new FirefoxDriver();
            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
        }
        return driver;
    }

    public static void quitDriver() {
//        if (driver != null) {
//            driver.quit();
//            driver = null;
//        }
    }
}
