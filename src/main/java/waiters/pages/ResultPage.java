package waiters.pages;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import waiters.core.page.BasePage;

import java.util.List;


public class ResultPage extends BasePage {

    @FindAll({@FindBy(xpath = ".//*[@class='_NId']/*[@class='srg']/div/div/h3/a")})
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

    public WebDriverPage linkClick() {
        resultLinks.get(0).click();
        return new WebDriverPage();
    }
}
