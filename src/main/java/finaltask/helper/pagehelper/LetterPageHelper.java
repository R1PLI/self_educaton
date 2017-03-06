package finaltask.helper.pagehelper;

import finaltask.pages.InboxPage;
import finaltask.pages.LetterPage;

public class LetterPageHelper {
    LetterPage letterPage = new LetterPage();

    public void toInputFieldWrite(String to) {
        letterPage.getToInputField().sendKeys(to);
    }

    public void subjectInputFieldWrite(String subject) {
        letterPage.getSubjectInputField().sendKeys(subject);
    }

    public void messageInputFieldWrite(String message) {
        letterPage.getMessageTextArea().sendKeys(message);
    }

    public InboxPage sendMessageButtonClick() {
        letterPage.getSendMessageButton().click();
        return new InboxPage();
    }
}