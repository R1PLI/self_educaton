package finaltask.steps;

import finaltask.pages.LetterPage;
import lombok.extern.log4j.Log4j2;
import ru.yandex.qatools.allure.annotations.Step;

@Log4j2
public class LetterPageSteps {

  private final LetterPage letterPage = new LetterPage();

  @Step("Composing a letter")
  public void composeLetter(final String to, final String subject, final String msg) {
    letterPage.toInputFieldWrite(to);
    letterPage.subjectInputFieldWrite(subject);
    letterPage.messageInputFieldWrite(msg);
    log.info("Composing a letter");
  }

  @Step("Sending a letter")
  public void sendLetter() {
    letterPage.sendMessageButtonClick();
    log.info("Letter is send");
  }
}
