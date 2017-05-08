package final_task_test.steps;

import finaltask.helper.pagehelper.InboxPageHelper;
import finaltask.pages.InboxPage;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import ru.yandex.qatools.allure.annotations.Step;

import static org.assertj.core.api.Assertions.assertThat;

public class InboxPageSteps {

    private static final Logger logger = LogManager.getLogger(InboxPageSteps.class);

    private final InboxPage inboxPage = new InboxPage();
    private final InboxPageHelper inboxPageHelper = new InboxPageHelper();

    @Step("Open letter page")
    public void goToLetterPage() {
        inboxPageHelper.writeLetterButtonClick();
        logger.info("Switch to letter page");
    }

    @Step("Click 'New letters' for inbox updating")
    public void newLetterLinkClick() {
        inboxPageHelper.newLetterLinkClick();
        logger.info("Update inbox for new letters");
    }

    @Step("Verifying of element presenting")
    public void verifyElementIsPresented() {
        assertThat(inboxPageHelper.isElementDisplayedOnPage()).isTrue();
        logger.info("Verification for element's presenting");
    }

    @Step("Verifying subject name")
    public void verifyLetterSubject(String subjectToCompare) {
        assertThat(inboxPageHelper.getFirstMessageSubjectText()).isEqualToIgnoringCase(subjectToCompare);
        logger.info("Verification for message's subject");
    }

    @Step("Deleting all letters")
    public void deleteMessagesIfPossible() {
        if (!inboxPage.getMessageSubjectText().isEmpty()) {
            inboxPageHelper.allLetterCheckboxClick();
            inboxPageHelper.deleteLetterButtonClick();
            logger.info("Delete all letters in inbox");
        }
    }
}