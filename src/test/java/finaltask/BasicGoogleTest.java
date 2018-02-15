package finaltask;

import finaltask.core.driver.Driver;
import finaltask.data.MailingDataProviderClass;
import finaltask.steps.InboxPageSteps;
import finaltask.steps.LetterPageSteps;
import finaltask.steps.LoginPageSteps;
import finaltask.steps.UkrNetSteps;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import ru.yandex.qatools.allure.annotations.Features;
import ru.yandex.qatools.allure.annotations.Severity;
import ru.yandex.qatools.allure.annotations.Stories;
import ru.yandex.qatools.allure.annotations.Title;
import ru.yandex.qatools.allure.model.SeverityLevel;

@Features("Email feature")
@Stories({"Letter sending"})
public class BasicGoogleTest extends BaseTest {

    private LoginPageSteps loginPageSteps;
    private InboxPageSteps inboxPageSteps;
    private LetterPageSteps letterPageSteps;
    private UkrNetSteps ukrNetSteps;

    @BeforeTest
    public void stepsInit() {
        loginPageSteps = new LoginPageSteps();
        inboxPageSteps = new InboxPageSteps();
        letterPageSteps = new LetterPageSteps();
        ukrNetSteps = new UkrNetSteps();
    }

    @Severity(SeverityLevel.CRITICAL)
    @Title("G-mail test")
    @Test(dataProvider = "G-mailMailing", dataProviderClass = MailingDataProviderClass.class)
    public void emailSending(final String mailLogin, final String mailPwd, final String letterTo, final String letterSubj, final String letterMsg, final String subjCompare) {
        driver.get(urlConstants.getGmailMainPage());
        loginPageSteps.loginInInbox(mailLogin, mailPwd);
        inboxPageSteps.goToLetterPage();
        letterPageSteps.composeLetter(letterTo, letterSubj, letterMsg);
        letterPageSteps.sendLetter();
        inboxPageSteps.refreshPageForNewLetters();
        inboxPageSteps.verifyLetterSubject(subjCompare);
    }

    @Test
    public void ukrNetTest() {
        driver.get(urlConstants.getUkrnetMainPage());
        ukrNetSteps.loginStep("treadz11@ukr.net", "tinker11");
        ukrNetSteps.logoutStep();
    }

    @AfterMethod
    public void inboxCleaning() {
        inboxPageSteps.deleteMessagesIfPossible();
    }
}
