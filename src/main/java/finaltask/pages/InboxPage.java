package finaltask.pages;

import finaltask.core.page.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class InboxPage extends BasePage {

    public static final String WRITE_ELEMENT_LETTER_BUTTON = "aic";
    public static final String NEW_LETTER_LINK = ".//*[@class='nU n1']/a";
    public static final String ALL_LETTER_CHECKBOX = "T-Jo-auh";
    public static final String DELETE_LETTER_BUTTON = ".//*[@class='G-tF']/div[2]/div[3]/div/div";
    public static final String MESSAGE_SUBJECT_LIST = "bog";

    @FindBy(className = WRITE_ELEMENT_LETTER_BUTTON)
    private WebElement writeLetterButton;

    @FindBy(xpath = NEW_LETTER_LINK)
    private WebElement newLetterLink;

    @FindBy(className = ALL_LETTER_CHECKBOX)
    private WebElement allLetterCheckbox;

    @FindBy(xpath = DELETE_LETTER_BUTTON)
    private WebElement deleteLetterButton;

    @FindAll({@FindBy(className = MESSAGE_SUBJECT_LIST)})
    private List<WebElement> messageSubjectText;

    public InboxPage() {
        super();
    }

    public WebElement getWriteLetterButton() {
        return writeLetterButton;
    }

    public InboxPage newLetterLinkClick() {
        newLetterLink.click();
        return this;
    }

    public LetterPage writeLetterButtonClick() {
        writeLetterButton.click();
        return new LetterPage();
    }

    public InboxPage allMessageSelectorClick() {
        allLetterCheckbox.click();
        return this;
    }

    public InboxPage deleteLetterButtonClick() {
        deleteLetterButton.click();
        return this;
    }

    public WebElement getMessageSubjectTextElement() {
        return messageSubjectText.get(messageSubjectText.size() - 1);
    }
}