import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class SearchResultPage {

    public WebDriver driver;

    public SearchResultPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

    public void getPageTitle() {
        String actualTitle = driver.getTitle();
        String expectedTitle = "Pecode - Поиск в Google";

        Assert.assertEquals(expectedTitle, actualTitle);

        System.out.println(actualTitle);
    }
}
