package final_task_test.steps;

import finaltask.helper.pagehelper.SignInLoginPageHelper;
import finaltask.helper.pagehelper.SignInPwdPageHelper;
import finaltask.pages.SignInLoginPage;
import finaltask.pages.SignInPwdPage;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import ru.yandex.qatools.allure.annotations.Step;

public class LoginPageSteps {

    private static Logger logger = LogManager.getLogger(InboxPageSteps.class);

    private SignInLoginPageHelper signInLoginHelper = new SignInLoginPageHelper();
    private SignInPwdPageHelper signInPwdPageHelper = new SignInPwdPageHelper();

    @Step("Login in inbox")
    public void loginInInbox(String email, String pwd) {
        signInLoginHelper.sendInputLogin(email);
        signInLoginHelper.emailLoginButtonClick();
        signInPwdPageHelper.sendInputLogin(pwd);
        signInPwdPageHelper.emailLoginButtonClick();
        logger.info("Login in inbox");
    }
}