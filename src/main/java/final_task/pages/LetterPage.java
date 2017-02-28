package final_task.pages;

import final_task.core.page.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LetterPage extends BasePage {
    public LetterPage() {
        super();
    }

    @FindBy(name = "to")
    private WebElement toInputField;

    @FindBy(name = "subjectbox")
    private WebElement subjectInputField;

    @FindBy(xpath = ".//*[@class='Ap']/div[2]/div")
    private WebElement messageTextArea;

    @FindBy(xpath = ".//*[@class='n1tfz']/td[1]/div/div[2]")
    private WebElement sendMessageButton;

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
