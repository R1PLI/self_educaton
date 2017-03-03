package finaltask.pages;

import finaltask.core.page.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LetterPage extends BasePage {

    private static final String TO_INPUT_FIELD = "to";
    private static final String SUBJECT_INPUT_FIELD = "subjectbox";
    private static final String MESSAGE_TEXT_AREA = ".//*[@class='Ap']/div[2]/div";
    private static final String SEND_MESSAGE_BUTTON = ".//*[@class='n1tfz']/td[1]/div/div[2]";
    
    @FindBy(name = TO_INPUT_FIELD)
    private WebElement toInputField;

    @FindBy(name = SUBJECT_INPUT_FIELD)
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