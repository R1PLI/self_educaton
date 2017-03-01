package finaltask.pages;

import finaltask.core.page.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SignInPwdPage extends BasePage {
    @FindBy(css = "input#Passwd")
    private WebElement passwordLoginField;

    @FindBy(id = "signIn")
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
