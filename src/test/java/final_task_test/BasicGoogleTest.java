package final_task_test;

import finaltask.data.DataProviderClass;
import finaltask.helper.GeneralHelper;
import finaltask.pages.InboxPage;
import finaltask.pages.SignInLoginPage;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class BasicGoogleTest extends BaseTest {

    @Test(enabled = true, dataProvider = "GmailMailing", dataProviderClass = DataProviderClass.class)
    public void googleSearch(String mailLogin, String mailPwd, String letterTo, String letterSubj, String letterMsg, String subjCompare, int index) {
        new SignInLoginPage().sendInputLogin(mailLogin)
                .emailLoginButtonClick()
                .sendInputPassword(mailPwd)
                .pwdLoginButtonClick();

        //TODO: add steps
        assertThat(GeneralHelper.isElementPresented(new InboxPage().getWriteLetterButton())).isTrue();

        new InboxPage().writeLetterButtonClick()
                .toInputFieldWrite(letterTo)
                .subjectInputFieldWrite(letterSubj)
                .messageInputFieldWrite(letterMsg)
                .sendMessageButtonClick()
                .newMessageLinkClick();

        //TODO: add steps
        ExpectedConditions.textToBePresentInElement(new InboxPage().getMessageSubjectField().get(index), subjCompare);
    }
}
