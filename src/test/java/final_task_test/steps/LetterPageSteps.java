package final_task_test.steps;

import finaltask.helper.pagehelper.LetterPageHelper;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import ru.yandex.qatools.allure.annotations.Step;

public class LetterPageSteps {

    private static final Logger logger = LogManager.getLogger(InboxPageSteps.class);

    private final LetterPageHelper letterPageHelper = new LetterPageHelper();

    @Step("Composing a letter")
    public void composeLetter(String to, String subject, String msg) {
        letterPageHelper.toInputFieldWrite(to);
        letterPageHelper.subjectInputFieldWrite(subject);
        letterPageHelper.messageInputFieldWrite(msg);
        logger.info("Composing a letter");
    }

    @Step("Sending a letter")
    public void sendLetter() {
        letterPageHelper.sendMessageButtonClick();
        logger.info("Letter is send");
    }
}