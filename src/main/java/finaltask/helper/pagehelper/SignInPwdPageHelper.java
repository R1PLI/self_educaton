package finaltask.helper.pagehelper;

import finaltask.pages.SignInPwdPage;

public class SignInPwdPageHelper {

    private SignInPwdPage signInPwdPage = new SignInPwdPage();

    public void sendInputLogin(String email) {
        signInPwdPage.getPasswordLoginField().sendKeys(email);
    }

    public void emailLoginButtonClick() {
        signInPwdPage.getSignInButton().click();
    }
}