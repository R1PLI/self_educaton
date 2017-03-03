package final_task_test.steps;

import finaltask.pages.SignInLoginPage;
import finaltask.pages.SignInPwdPage;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import ru.yandex.qatools.allure.annotations.Step;

public class LoginPageSteps {

    private static Logger logger = LogManager.getLogger(InboxPageSteps.class);

    SignInLoginPage signInLogin = new SignInLoginPage();
    SignInPwdPage signInPwdPage = new SignInPwdPage();

    @Step("Login in inbox")
    public void loginInInbox(String email, String pwd) {
        signInLogin.sendInputLogin(email);
        signInLogin.emailLoginButtonClick();
        signInPwdPage.sendInputPassword(pwd);
        signInPwdPage.pwdLoginButtonClick();
        logger.info("Login in inbox");
    }
}