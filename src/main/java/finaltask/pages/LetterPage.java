package finaltask.pages;

import finaltask.core.page.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LetterPage extends BasePage {

    private static final String TO_INPUT_FIELD = "//textarea[@name='to']";
    private static final String SUBJECT_INPUT_FIELD = "//input[@name='subjectbox']";
    private static final String MESSAGE_TEXT_AREA = "//input[@name='subjectbox']/ancestor::form/following-sibling::table//div[@role='textbox']";
    private static final String SEND_MESSAGE_BUTTON = "(//div[@role='dialog']//div[@role='button' and @tabindex='1'])[1]";
    
    @FindBy(xpath = TO_INPUT_FIELD)
    private WebElement toInputField;

    @FindBy(xpath = SUBJECT_INPUT_FIELD)
    private WebElement subjectInputField;

    @FindBy(xpath = MESSAGE_TEXT_AREA)
    private WebElement messageTextArea;

    @FindBy(xpath = SEND_MESSAGE_BUTTON)
    private WebElement sendMessageButton;

    public LetterPage() {
        super();
    }

    public LetterPage toInputFieldWrite(String to) {
        toInputField.sendKeys(to);
        return this;
    }

    public LetterPage subjectInputFieldWrite(String subject) {
        subjectInputField.sendKeys(subject);
        return this;
    }

    public LetterPage messageInputFieldWrite(String message) {
        messageTextArea.sendKeys(message);
        return this;
    }

    public InboxPage sendMessageButtonClick() {
        sendMessageButton.click();
        return new InboxPage();
    }
}