package final_task_test.steps;

import finaltask.helper.GeneralHelper;
import finaltask.pages.InboxPage;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import static org.assertj.core.api.Assertions.assertThat;

public class InboxPageSteps {
    private static Logger logger = LogManager.getLogger(InboxPageSteps.class);

    InboxPage inboxPage = new InboxPage();

    public void verifyElementIsPresented() {
        assertThat(GeneralHelper.isElementPresented(inboxPage.getWriteLetterButton())).isTrue();
    }

    public void goToLetterPage() {
        inboxPage.writeLetterButtonClick();
    }

    public void newLetterLinkClick() {
        inboxPage.newMessageLinkClick();
    }

    public void selectAllLetters() {
        inboxPage.allMessageSelectorClick();
    }

    public void deleteMessages() {
        inboxPage.deleteLetterButtonClick();
    }

    public void verifyLetterSubject(String subjectToCompare) {
        assertThat(inboxPage.getMessageSubjectTextElement().getText()).isEqualToIgnoringCase(subjectToCompare);
    }
}