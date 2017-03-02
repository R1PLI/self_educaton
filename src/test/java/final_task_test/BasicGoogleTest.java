package final_task_test;

import final_task_test.steps.InboxPageSteps;
import final_task_test.steps.LetterPageSteps;
import final_task_test.steps.LoginPageSteps;
import finaltask.data.MailingDataProviderClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class BasicGoogleTest extends BaseTest {

    private LoginPageSteps loginPageSteps;
    private InboxPageSteps inboxPageSteps;
    private LetterPageSteps letterPageSteps;

    @BeforeMethod
    public void stepsInit() {
        loginPageSteps = new LoginPageSteps();
        inboxPageSteps = new InboxPageSteps();
        letterPageSteps = new LetterPageSteps();
    }

    @Test(enabled = true, dataProvider = "GmailMailing", dataProviderClass = MailingDataProviderClass.class)
    public void googleSearch(String mailLogin, String mailPwd, String letterTo, String letterSubj, String letterMsg, String subjCompare) {

        loginPageSteps.loginInInbox(mailLogin, mailPwd);

        inboxPageSteps.verifyElementIsPresented();
        inboxPageSteps.goToLetterPage();

        letterPageSteps.composeLetter(letterTo, letterSubj, letterMsg);
        letterPageSteps.sendLetter();

        inboxPageSteps.newLetterLinkClick();
        inboxPageSteps.verifyLetterSubject(subjCompare);
    }

    @Test(enabled = true, dataProvider = "DeleteInboxLetter", dataProviderClass = MailingDataProviderClass.class)
    public void inboxCleaning(String mailLogin, String mailPwd) {

        loginPageSteps.loginInInbox(mailLogin, mailPwd);

        inboxPageSteps.selectAllLetters();
        inboxPageSteps.deleteMessages();
    }
}