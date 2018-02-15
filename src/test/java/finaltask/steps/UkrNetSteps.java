package finaltask.steps;

import finaltask.pages.MainPage;
import lombok.extern.log4j.Log4j2;
import ru.yandex.qatools.allure.annotations.Step;

@Log4j2
public class UkrNetSteps {
    private MainPage mainPage = new MainPage();

    @Step("Login in mailbox")
    public void loginStep(String email, String pwd) {
        mainPage.inputCredentialsInEmailField(email);
        mainPage.inputCredentialsInPwdField(pwd);
        mainPage.writeNewLetterLinkClick();
        log.info("Login in mailbox");
    }

    @Step("Logout from mailbox")
    public void logoutStep() {
        mainPage.clickLogoutButton();
        log.info("Logout from mailbox");
    }
}
