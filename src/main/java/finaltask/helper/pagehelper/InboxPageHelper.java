package finaltask.helper.pagehelper;

import finaltask.helper.GeneralHelper;
import finaltask.pages.InboxPage;
import finaltask.pages.LetterPage;

public class InboxPageHelper {

    InboxPage inboxPage = new InboxPage();

    public void newLetterLinkClick() {
        inboxPage.getNewLetterLink().click();
    }

    public LetterPage writeLetterButtonClick() {
        inboxPage.getWriteLetterButton().click();
        return new LetterPage();
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