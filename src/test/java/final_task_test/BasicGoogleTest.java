package final_task_test;



import final_task.helper.InboxPageHelper;
import final_task.pages.InboxPage;
import final_task.pages.SignInLoginPage;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.Test;

import static final_task.constants.assertion.AssertConstants.SUBJECT_TEXT;
import static final_task.constants.test.TestConstants.*;
import static final_task.pages.InboxPage.getMessageSubjectField;
import static final_task.pages.InboxPage.getWriteLetterButton;
import static java.lang.Thread.sleep;
import static org.assertj.core.api.Assertions.assertThat;


public class BasicGoogleTest extends BaseTest {

//  @Test(enabled = true, dataProvider = "GoogleSearch", dataProviderClass = DataProviderClass.class)
    @Test()
    public void googleSearch() throws InterruptedException {
        new SignInLoginPage().sendInputLogin(GMAIL_LOGIN_EMAIL)
                        .emailLoginButtonClick()
                        .sendInputPassword(GMAIL_LOGIN_PWD)
                        .pwdLoginButtonClick();

        assertThat(InboxPageHelper.isElementPresented(getWriteLetterButton()));

        new InboxPage().writeLetterButtonClick()
                .toInputFieldWrite(GMAIL_TO_EMAIL)
                .subjectInputFieldWrite(GMAIL_MESSAGE_SUBJECT)
                .messageInputFieldWrite(GMAIL_MESSAGE_TEXT)
                .sendMessageButtonClick()
                .newMessageLinkClick();

        ExpectedConditions.textToBePresentInElement(getMessageSubjectField().get(0), "hey");
        //assertThat(InboxPageHelper.isSubjectExists(getMessageSubjectField(), "her")).isTrue();
    }
}
