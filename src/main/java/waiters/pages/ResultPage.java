package waiters.pages;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import waiters.core.driver.Driver;
import waiters.core.page.BasePage;


public class ResultPage extends BasePage {

    @FindBy(linkText = "Selenium WebDriver — Selenium Documentation")
    private static WebElement searchedLink;

    @FindBy(className = "sbico-c")
    private WebElement searchButton;

    public ResultPage() {
        super();
    }

    private void explicitWait(WebDriver driver) {
        (new WebDriverWait(driver, 3)).until(ExpectedConditions.elementToBeClickable(searchedLink));
    }

    public ResultPage searchButtonClick() {
        searchButton.click();
        return this;
    }

    public WebDriverPage linkClick(String linkText) {
        explicitWait(Driver.getInstance());
        searchedLink.click();
        return new WebDriverPage();
    }
}
