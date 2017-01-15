package page_object.pages;

import org.openqa.selenium.By;
import page_object.core.basepage.BasePage;
import page_object.core.driver.Driver;
import page_object.elements.Area;
import page_object.elements.Button;
import page_object.elements.InputField;

import static page_object.constants.EmailAddresses.VK_LOGIN;

public class LoginPage extends BasePage {

    private Button newLoginButton;
    private InputField loginInputField;
    private InputField passwordInputField;

    public LoginPage() {
        open();
        newLoginButton = new Button(Driver.getInstance(), By.id("login_button"));
        loginInputField = new InputField(Driver.getInstance(), By.id("email"));
        passwordInputField = new InputField(Driver.getInstance(), By.id("pass"));
    }

    private LoginPage open() {
        Driver.getInstance().get(VK_LOGIN);
        return this;
    }

    private LoginPage enterUsername(String username) {
        loginInputField.sendKeys(username);
        return this;
    }

    private LoginPage enterPassword(String password) {
        passwordInputField.sendKeys(password);
        return this;
    }

    private LoginPage sendLoginInfo() {
        newLoginButton.click();
        return this;
    }

    public HomePage homePageLogin(String username, String password) {
        enterUsername(username);
        enterPassword(password);
        sendLoginInfo();
        return new HomePage();
    }

    public LoginPage invalidLogin(String username, String password) {
        enterUsername(username);
        enterPassword(password);
        sendLoginInfo();
        return this;
    }
}
