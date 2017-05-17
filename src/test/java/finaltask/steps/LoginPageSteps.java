package finaltask.steps;

import finaltask.pages.LoginPage;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import ru.yandex.qatools.allure.annotations.Step;

public class LoginPageSteps {

  private static final Logger LOGGER = LogManager.getLogger(LoginPageSteps.class);

  private final LoginPage loginPage = new LoginPage();

  @Step("Login in inbox")
  public void loginInInbox(final String email, final String pwd) {
    loginPage.inputCredentialsInEmailField(email);
    loginPage.loginButtonClick();
    loginPage.inputCredentialsInPasswordField(pwd);
    loginPage.pwdButtonClick();
    LOGGER.info("Login in inbox");
  }
}
