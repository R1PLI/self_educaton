package final_task_test.steps;

import finaltask.helper.pagehelper.SignInLoginPageHelper;
import finaltask.helper.pagehelper.SignInPwdPageHelper;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import ru.yandex.qatools.allure.annotations.Step;

public class LoginPageSteps {

    private static final Logger logger = LogManager.getLogger(InboxPageSteps.class);

    private final SignInLoginPageHelper signInLoginHelper = new SignInLoginPageHelper();
    private final SignInPwdPageHelper signInPwdPageHelper = new SignInPwdPageHelper();

    @Step("Login in inbox")
    public void loginInInbox(String email, String pwd) throws InterruptedException {
        signInLoginHelper.sendInputLogin(email);
        signInLoginHelper.emailLoginButtonClick();
        signInPwdPageHelper.sendInputLogin(pwd);
        //TODO: DELETE THIS SHIT
        Thread.sleep(1000);
        signInPwdPageHelper.emailLoginButtonClick();
        logger.info("Login in inbox");
    }
}