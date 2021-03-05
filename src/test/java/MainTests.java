import org.testng.annotations.Test;

public class MainTests extends DriverSettings {

    @Test(priority = 1)
    public void enterSearchRequest() {
        googlePage.searchFieldRequest("Pecode");
    }

    @Test(priority = 2)
    public void clickOnSearchButton() {
        googlePage.searchButtonClick();
    }

    @Test(priority = 3)
    public void getTitle() {
        searchResultPage.getPageTitle();
    }
}
