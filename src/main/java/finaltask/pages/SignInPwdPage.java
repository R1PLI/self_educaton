package finaltask.pages;

import finaltask.core.page.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SignInPwdPage extends BasePage {
    public static final String PSS_INPUT_FIELD = "input#Passwd";
    public static final String SING_IN_BUTTON = "signIn";

    @FindBy(css = PSS_INPUT_FIELD)
    private WebElement passwordLoginField;

    @FindBy(id = SING_IN_BUTTON)
    private WebElement signInButton;

    public SignInPwdPage() {
        super();
    }

    public SignInPwdPage sendInputPassword(String pwd) {
        passwordLoginField.sendKeys(pwd);
        return this;
    }

    public InboxPage pwdLoginButtonClick() {
        signInButton.click();
        return new InboxPage();
    }
}