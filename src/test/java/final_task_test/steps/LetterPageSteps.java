package final_task_test.steps;

import finaltask.pages.LetterPage;

public class LetterPageSteps {
    LetterPage letterPage = new LetterPage();

    public void composeLetter(String to, String subject, String msg) {
        letterPage.toInputFieldWrite(to);
        letterPage.subjectInputFieldWrite(subject);
        letterPage.messageInputFieldWrite(msg);
    }

    public void sendLetter() {
        letterPage.sendMessageButtonClick();
    }
}