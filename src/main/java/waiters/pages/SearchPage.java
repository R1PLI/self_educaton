package waiters.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import waiters.core.page.BasePage;

import static org.testng.Assert.assertTrue;


public class SearchPage extends BasePage {

    @FindBy(name = "q")
    private WebElement searchField;

    public SearchPage() {
        super();
        assertTrue(searchField.isDisplayed());
    }

    private SearchPage inputSearchRequest(String query) {
        searchField.sendKeys(query);
        return this;
    }

    public ResultPage searchRequest(String query) {
        inputSearchRequest(query);
        return new ResultPage();
    }

}
