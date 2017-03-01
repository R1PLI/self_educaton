package final_task_test;



import final_task.data.DataProviderClass;
import final_task.helper.InboxPageHelper;
import final_task.pages.InboxPage;
import final_task.pages.SignInLoginPage;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.Test;

import static final_task.constants.test.TestConstants.*;
import static final_task.pages.InboxPage.getMessageSubjectField;
import static final_task.pages.InboxPage.getWriteLetterButton;
import static org.assertj.core.api.Assertions.assertThat;


public class BasicGoogleTest extends BaseTest {

    @Test(enabled = true, dataProvider = "GmailMailing", dataProviderClass = DataProviderClass.class)
    //@Test()
    public void googleSearch(String mailLogin, String mailPwd, String letterTo, String letterSubj, String letterMsg, String subjCmpr) {
        new SignInLoginPage().sendInputLogin(mailLogin)
                        .emailLoginButtonClick()
                        .sendInputPassword(mailPwd)
                        .pwdLoginButtonClick();

        assertThat(InboxPageHelper.isElementPresented(getWriteLetterButton())).isTrue();

        new InboxPage().writeLetterButtonClick()
                .toInputFieldWrite(letterTo)
                .subjectInputFieldWrite(letterSubj)
                .messageInputFieldWrite(letterMsg)
                .sendMessageButtonClick()
                .newMessageLinkClick();

        ExpectedConditions.textToBePresentInElement(getMessageSubjectField().get(0), subjCmpr);
        //assertThat(InboxPageHelper.isSubjectExists(getMessageSubjectField(), "her")).isTrue();
    }
}
