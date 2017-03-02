package final_task_test.steps;

import finaltask.pages.LetterPage;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import ru.yandex.qatools.allure.annotations.Step;

public class LetterPageSteps {
    private static Logger logger = LogManager.getLogger(InboxPageSteps.class);

    LetterPage letterPage = new LetterPage();

    @Step("Composing a letter")
    public void composeLetter(String to, String subject, String msg) {
        letterPage.toInputFieldWrite(to);
        letterPage.subjectInputFieldWrite(subject);
        letterPage.messageInputFieldWrite(msg);
        logger.info("Composing a letter");
    }

    @Step("Sending a letter")
    public void sendLetter() {
        letterPage.sendMessageButtonClick();
        logger.info("Letter is send");
    }
}