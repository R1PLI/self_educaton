package final_task.data;

import org.testng.annotations.DataProvider;

import static final_task.constants.assertion.AssertConstants.*;
import static final_task.constants.test.TestConstants.*;

public class DataProviderClass {
    private DataProviderClass() {

    }

    @DataProvider(name = "GmailMailing")
    public static Object[][] query() {
        return new Object[][]{
                {GMAIL_LOGIN_EMAIL, GMAIL_LOGIN_PWD, GMAIL_TO_EMAIL, GMAIL_MESSAGE_SUBJECT, GMAIL_MESSAGE_TEXT, GMAIL_MESSAGE_SUBJECT}

        };
    }
}
