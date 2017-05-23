package finaltask.steps;

import finaltask.pages.LetterPage;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import ru.yandex.qatools.allure.annotations.Step;

public class LetterPageSteps {

  private static final Logger LOGGER = LogManager.getLogger(LetterPageSteps.class);

  private final LetterPage letterPage = new LetterPage();

  @Step("Composing a letter")
  public void composeLetter(final String to, final String subject, final String msg) {
    letterPage.toInputFieldWrite(to);
    letterPage.subjectInputFieldWrite(subject);
    letterPage.messageInputFieldWrite(msg);
    LOGGER.info("Composing a letter");
  }

  @Step("Sending a letter")
  public void sendLetter() {
    letterPage.sendMessageButtonClick();
    LOGGER.info("Letter is send");
  }
}
