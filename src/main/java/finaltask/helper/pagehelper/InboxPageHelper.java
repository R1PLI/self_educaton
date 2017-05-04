package finaltask.helper.pagehelper;

import finaltask.helper.GeneralHelper;
import finaltask.pages.InboxPage;

public class InboxPageHelper {

    private InboxPage inboxPage = new InboxPage();

    public void newLetterLinkClick() {
        inboxPage.getNewLetterLink().click();
    }

    public void writeLetterButtonClick() {
        inboxPage.getWriteLetterButton().click();

    }

    public void deleteLetterButtonClick() {
        inboxPage.getDeleteLetterButton().click();
    }

    public String getFirstMessageSubjectText() {
        return inboxPage.getFirstMessageSubject().getText();
    }

    public void allLetterCheckboxClick() {
        inboxPage.getAllLetterCheckbox().click();
    }

    public boolean isElementDisplayedOnPage() {
        return GeneralHelper.isElementPresented(inboxPage.getWriteLetterButton());
    }
}