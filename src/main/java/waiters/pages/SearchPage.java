package waiters.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import waiters.core.page.BasePage;


public class SearchPage extends BasePage {

    @FindBy(name = "q")
    private WebElement searchField;

    public SearchPage() {
        super();
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
