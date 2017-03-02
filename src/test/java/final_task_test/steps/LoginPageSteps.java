package final_task_test.steps;

import finaltask.pages.SignInLoginPage;
import finaltask.pages.SignInPwdPage;

public class LoginPageSteps {
    SignInLoginPage signInLogin = new SignInLoginPage();
    SignInPwdPage signInPwdPage = new SignInPwdPage();

    public void loginInInbox(String email, String pwd) {
        signInLogin.sendInputLogin(email);
        signInLogin.emailLoginButtonClick();
        signInPwdPage.sendInputPassword(pwd);
        signInPwdPage.pwdLoginButtonClick();
    }
}