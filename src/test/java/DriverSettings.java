import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

import java.util.concurrent.TimeUnit;

public class DriverSettings {

    String GOOGLE_START_PAGE = "https://www.google.com";

    public static GooglePage googlePage;
    public static SearchResultPage searchResultPage;
    public static WebDriver driver;


    @BeforeSuite
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", ConfigProperties.getProperty("chromedriver"));
        WebDriver driver = new ChromeDriver();

        googlePage = new GooglePage(driver);
        searchResultPage = new SearchResultPage(driver);

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get(GOOGLE_START_PAGE);
    }

    @AfterSuite
    public void afterTest() {
        if(null != driver) {
            driver.close();
            driver.quit();
        }
    }
}

