package waiters.pages;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import waiters.core.page.BasePage;

import java.util.List;

import static org.testng.Assert.assertTrue;


public class ResultPage extends BasePage {

    @FindAll({@FindBy(xpath = ".//div/div/h3/a")})
    public List<WebElement> resultLinks;

    @FindBy(name = "btnG")
    private WebElement searchButton;

    public ResultPage() {
        super();
    }

    public ResultPage searchButtonClick() {
        searchButton.click();
        return this;
    }

    public List<WebElement> getLinksText() {
        return resultLinks;
    }

    public WebDriverPage webDriverLinkClick(int linkIndex) {
        resultLinks.get(linkIndex).click();
        return new WebDriverPage();
    }

    public OverwatchPage overwatchLinkClick(int linkIndex) {
        resultLinks.get(linkIndex).click();
        return new OverwatchPage();
    }

    public SearchedPage searchedPageClick(int linkIndex) {
        resultLinks.get(linkIndex).click();
        return new SearchedPage();
    }
}
