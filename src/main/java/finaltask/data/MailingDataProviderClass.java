package finaltask.data;

import org.testng.annotations.DataProvider;

import static finaltask.constants.AssertConstants.SUBJECT_TEXT;
import static finaltask.constants.TestConstants.*;

public class MailingDataProviderClass {

    private MailingDataProviderClass() {
    }

    @DataProvider(name = "G-mailMailing")
    public static Object[][] mailingQuery() {
        return new Object[][]{
                {GMAIL_LOGIN_EMAIL, GMAIL_LOGIN_PSS, GMAIL_TO_EMAIL, GMAIL_MESSAGE_SUBJECT, GMAIL_MESSAGE_TEXT, SUBJECT_TEXT}
        };
    }

    @DataProvider(name = "DeleteInboxLetter")
    public static Object[][] deletingQuery() {
        return new Object[][]{
                {GMAIL_LOGIN_EMAIL, GMAIL_LOGIN_PSS}
        };
    }
}