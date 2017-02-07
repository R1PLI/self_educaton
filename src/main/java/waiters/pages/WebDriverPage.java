package waiters.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import utils.WaitingUtils;
import waiters.core.page.BasePage;
import waiters.custom_waiters.Condition;

import static org.openqa.selenium.support.ui.ExpectedConditions.visibilityOf;
import static utils.WaitingUtils.waitFor;
import static waiters.constants.assertion.AssertConstants.TITLE_TEXT;

public class WebDriverPage extends BasePage {

    @FindBy(xpath = ".//*[@id='header']/h1/a")
    private static WebElement titleText;

    public WebDriverPage() {
        super();
    }

    public static String getTitleText() {
        Condition.getInstance().waitForElementHasText(titleText, TITLE_TEXT);
        return titleText.getText();

        /*WebElement titleTextElement = waitFor(visibilityOf(titleText), 10);
        return titleTextElement.getText();*/
    }
}
