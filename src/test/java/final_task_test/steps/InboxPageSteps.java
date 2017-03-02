package final_task_test.steps;

import finaltask.helper.GeneralHelper;
import finaltask.pages.InboxPage;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import ru.yandex.qatools.allure.annotations.Step;


import static org.assertj.core.api.Assertions.assertThat;

public class InboxPageSteps {
    private static Logger logger = LogManager.getLogger(InboxPageSteps.class);

    InboxPage inboxPage = new InboxPage();

    public void goToLetterPage() {
        inboxPage.writeLetterButtonClick();
        logger.info("Switch to letter page");
    }

    public void newLetterLinkClick() {
        inboxPage.newLetterLinkClick();
        logger.info("Update inbox for new letters");
    }

    @Step("Deleting all letters")
    public void deleteMessages() {
        inboxPage.allMessageSelectorClick();
        inboxPage.deleteLetterButtonClick();
        logger.info("Delete all letters in inbox");
    }

    @Step("Verifying of element presenting")
    public void verifyElementIsPresented() {
        assertThat(GeneralHelper.isElementPresented(inboxPage.getWriteLetterButton())).isTrue();
        logger.info("Verification for element's presenting");
    }

    @Step("Verifying subject name")
    public void verifyLetterSubject(String subjectToCompare) {
        assertThat(inboxPage.getMessageSubjectTextElement().getText()).isEqualToIgnoringCase(subjectToCompare);
        logger.info("Verification for message's subject");
    }
}