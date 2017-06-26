package finaltask.steps;

import finaltask.pages.LoginPage;
import lombok.extern.log4j.Log4j2;
import ru.yandex.qatools.allure.annotations.Step;

@Log4j2
public class LoginPageSteps {

  private final LoginPage loginPage = new LoginPage();

  @Step("Login in inbox")
  public void loginInInbox(final String email, final String pwd) {
    loginPage.inputCredentialsInEmailField(email);
    loginPage.loginButtonClick();
    loginPage.inputCredentialsInPasswordField(pwd);
    loginPage.pwdButtonClick();
    log.info("Login in inbox");
  }
}
