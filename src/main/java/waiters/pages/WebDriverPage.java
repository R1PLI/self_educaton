package waiters.pages;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import waiters.core.page.BasePage;
import waiters.custom_waiters.Condition;

import static org.testng.Assert.assertTrue;
import static waiters.constants.ApplicationConstants.TITLE_TEXT;

public class WebDriverPage extends BasePage {
    @FindBy(xpath = ".//*[@id='header']/h1/a")
    private static WebElement titleText;

    public WebDriverPage() {
        super();
        assertTrue(titleText.isDisplayed());
    }

    public static String getTitleText() {
        Condition.getInstance().waitForElementHasText(titleText, TITLE_TEXT);
        return titleText.getText();
    }
}
