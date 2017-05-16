package finaltask.helper.pagehelper;

import finaltask.pages.SignInPwdPage;
//TODO: DELETE THIS REDUNDANCY
public class SignInPwdPageHelper {

    private final SignInPwdPage signInPwdPage = new SignInPwdPage();

    public void sendInputLogin(String email) {
        signInPwdPage.getPasswordLoginField().sendKeys(email);
    }

    public void emailLoginButtonClick() {
        signInPwdPage.getSignInButton().click();
    }
}