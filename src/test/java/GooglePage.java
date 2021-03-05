import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GooglePage {

    public WebDriver driver;

    public GooglePage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

    @FindBy(name = "q")
    private WebElement searchField;

    @FindBy(name = "btnK")
    private WebElement searchButton;


    public void searchFieldRequest(String request) {
        searchField.sendKeys(request);
    }

    public void searchButtonClick() {
        searchButton.click();
    }

}
