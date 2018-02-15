package finaltask.pages;

import finaltask.core.page.BasePage;
import lombok.val;
import org.openqa.selenium.By;

import static finaltask.core.utils.WaitCondition.clickable;
import static finaltask.core.utils.WaitCondition.visible;

public class MainPage extends BasePage {

    private By loginFieldBySelector = By.name("Login");
    private By pwdFieldBySelector = By.name("Password");
    private By loginButtonBySelector = By.cssSelector(".login-block__submit-but > button");
    private By logoutLinkBySelector = By.cssSelector("#login-block > div > div > a");

    public void inputCredentialsInEmailField(final String email) {
        type(loginFieldBySelector, visible, email);
    }

    public void inputCredentialsInPwdField(final String pwd) {
        type(pwdFieldBySelector, visible, pwd);
    }

    public void writeNewLetterLinkClick() {
        click(loginButtonBySelector, visible);
    }

    public void clickLogoutButton() {
        click(logoutLinkBySelector, clickable);
    }

    @Override
    protected void pageRefresh() {

    }
}
