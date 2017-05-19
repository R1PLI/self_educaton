package finaltask;

import finaltask.core.driver.Driver;
import finaltask.steps.InboxPageSteps;
import finaltask.steps.LetterPageSteps;
import finaltask.steps.LoginPageSteps;
import finaltask.data.MailingDataProviderClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.annotations.AfterMethod;
import ru.yandex.qatools.allure.annotations.Features;
import ru.yandex.qatools.allure.annotations.Severity;
import ru.yandex.qatools.allure.annotations.Stories;
import ru.yandex.qatools.allure.annotations.Title;
import ru.yandex.qatools.allure.model.SeverityLevel;

@Features("Email feature")
@Stories( {"Letter sending"})
public class BasicGoogleTest extends BaseTest {

  private LoginPageSteps loginPageSteps;
  private InboxPageSteps inboxPageSteps;
  private LetterPageSteps letterPageSteps;

  @BeforeTest
  public void stepsInit() {
    loginPageSteps = new LoginPageSteps();
    inboxPageSteps = new InboxPageSteps();
    letterPageSteps = new LetterPageSteps();
  }

  @Severity(SeverityLevel.CRITICAL)
  @Title("G-mail test")
  @Test(dataProvider = "G-mailMailing", dataProviderClass = MailingDataProviderClass.class)
  public void emailSending(final String mailLogin, final String mailPwd, final String letterTo, final String letterSubj, final String letterMsg, final String subjCompare) {
    loginPageSteps.loginInInbox(mailLogin, mailPwd);
    inboxPageSteps.goToLetterPage();
    letterPageSteps.composeLetter(letterTo, letterSubj, letterMsg);
    letterPageSteps.sendLetter();
    inboxPageSteps.refreshPageForNewLetters();
    inboxPageSteps.verifyLetterSubject(subjCompare);
  }

  @AfterMethod
  public void inboxCleaning() {
    inboxPageSteps.deleteMessagesIfPossible();
  }
}
