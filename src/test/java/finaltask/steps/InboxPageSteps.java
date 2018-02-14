package finaltask.steps;

import finaltask.core.driver.Driver;
import finaltask.core.utils.Waiter;
import finaltask.pages.InboxPage;
import lombok.extern.log4j.Log4j2;
import ru.yandex.qatools.allure.annotations.Step;

import static finaltask.core.utils.Waiter.*;
import static org.assertj.core.api.Assertions.assertThat;

@Log4j2
public class InboxPageSteps {

  private final InboxPage inboxPage = new InboxPage();

  @Step("Open letter page")
  public void goToLetterPage() {
    inboxPage.writeNewLetterLinkClick();
    log.info("Switch to letter page");
  }

  @Step("Refresh inbox page to update mailbox")
  public void refreshPageForNewLetters() {
    inboxPage.pageRefresh();
    log.info("Update inbox for new letters");
  }

  @Step("Verifying subject name")
  public void verifyLetterSubject(String subjectToCompare) {
    String subjectText = inboxPage.getSubjectText();
    assertThat(subjectText).isEqualToIgnoringCase(subjectToCompare);
    log.info("Verification for message's subject");
  }

  @Step("Deleting all letters")
  public void deleteMessagesIfPossible() {
    if (!inboxPage.isSubjectListEmpty()) {
      inboxPage.allLettersCheckboxClick();
      inboxPage.deleteLetterButtonClick();
      waitWithNoCondition(1000);
      log.info("Delete all letters in inbox");
    }
  }
}
