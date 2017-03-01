package finaltask.data;

import org.testng.annotations.DataProvider;

import static finaltask.constants.TestConstants.*;

public class DataProviderClass {
    private DataProviderClass() {

    }

    @DataProvider(name = "GmailMailing")
    public static Object[][] query() {
        return new Object[][]{
                {GMAIL_LOGIN_EMAIL, GMAIL_LOGIN_PWD, GMAIL_TO_EMAIL, GMAIL_MESSAGE_SUBJECT, GMAIL_MESSAGE_TEXT, GMAIL_MESSAGE_SUBJECT, LETTER_INDEX}
        };
    }
}
