package finaltask.helper.pagehelper;

import finaltask.pages.SignInLoginPage;

public class SignInLoginPageHelper {

    private final SignInLoginPage signInLoginPage = new SignInLoginPage();

    public void sendInputLogin(String email) {
        signInLoginPage.getEmailLoginField().sendKeys(email);
    }

    public void emailLoginButtonClick() {
        signInLoginPage.getLoginNextButton().click();
    }
}