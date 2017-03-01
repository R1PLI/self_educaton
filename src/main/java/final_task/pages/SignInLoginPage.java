package final_task.pages;

import final_task.core.page.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SignInLoginPage extends BasePage {

    @FindBy(css = "input#Email")
    private WebElement emailLoginField;

    @FindBy(name = "signIn")
    private WebElement loginNExtButton;

    public SignInLoginPage() {
        super();
    }

    public SignInLoginPage sendInputLogin(String email) {
        emailLoginField.sendKeys(email);
        return this;
    }

    public SignInPwdPage emailLoginButtonClick() {
        loginNExtButton.click();
        return new SignInPwdPage();
    }
}
