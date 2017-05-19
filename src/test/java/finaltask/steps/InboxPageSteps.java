package finaltask.steps;

import finaltask.core.driver.Driver;
import finaltask.pages.InboxPage;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import ru.yandex.qatools.allure.annotations.Step;

import static org.assertj.core.api.Assertions.assertThat;

public class InboxPageSteps {

  private static final Logger LOGGER = LogManager.getLogger(InboxPageSteps.class);

  private final InboxPage inboxPage = new InboxPage();

  @Step("Open letter page")
  public void goToLetterPage() {
    inboxPage.writeNewLetterLinkClick();
    LOGGER.info("Switch to letter page");
  }

  @Step("Refresh inbox page to update mailbox")
  public void refreshPageForNewLetters() {
    inboxPage.pageRefresh();
    LOGGER.info("Update inbox for new letters");
  }

  @Step("Verifying subject name")
  public void verifyLetterSubject(String subjectToCompare) {
    String subjectText = inboxPage.getSubjectText();
    assertThat(subjectText).isEqualToIgnoringCase(subjectToCompare);
    LOGGER.info("Verification for message's subject");
  }

  @Step("Deleting all letters")
  public void deleteMessagesIfPossible() {
    if (!inboxPage.isSubjectListEmpty()) {
      inboxPage.allLettersCheckboxClick();
      inboxPage.deleteLetterButtonClick();
      LOGGER.info("Delete all letters in inbox");
    }
  }
}
