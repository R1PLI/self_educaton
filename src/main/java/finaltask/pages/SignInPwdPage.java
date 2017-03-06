package finaltask.pages;

import finaltask.core.page.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SignInPwdPage extends BasePage {

    private static final String PSS_INPUT_FIELD = "//input[@id='Passwd']";
    private static final String SIGN_IN_BUTTON = "//input[@id='signIn']";

    @FindBy(xpath = PSS_INPUT_FIELD)
    private WebElement passwordLoginField;

    @FindBy(xpath = SIGN_IN_BUTTON)
    private WebElement signInButton;

    public SignInPwdPage() {
        super();
    }

    public WebElement getPasswordLoginField() {
        return passwordLoginField;
    }

    public WebElement getSignInButton() {
        return signInButton;
    }
}