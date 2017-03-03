package finaltask.pages;

import finaltask.core.page.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SignInLoginPage extends BasePage {

    private static final String EMAIL_LOGIN_FIELD = "//input[@id='Email']";
    private static final String LOGIN_NEXT_BUTTON = "//input[@id='next']";

    @FindBy(xpath = EMAIL_LOGIN_FIELD)
    private WebElement emailLoginField;

    @FindBy(xpath = LOGIN_NEXT_BUTTON)
    private WebElement loginNextButton;

    public SignInLoginPage() {
        super();
    }

    public SignInLoginPage sendInputLogin(String email) {
        emailLoginField.sendKeys(email);
        return this;
    }

    public SignInPwdPage emailLoginButtonClick() {
        loginNextButton.click();
        return new SignInPwdPage();
    }
}