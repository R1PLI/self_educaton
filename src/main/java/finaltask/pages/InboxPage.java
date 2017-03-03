package finaltask.pages;

import finaltask.core.page.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class InboxPage extends BasePage {

    private static final String WRITE_ELEMENT_LETTER_BUTTON = "//div[@role='navigation']/preceding-sibling:: div//div[@role='button']";
    private static final String NEW_LETTER_LINK = "(//div[@role='navigation']//a)[1]";
    private static final String MESSAGE_SUBJECT_LIST = "//div[@role='link']//b";
    private static final String ALL_LETTER_CHECKBOX = "//span[@role='checkbox']/div";
    private static final String DELETE_LETTER_BUTTON = "//div/div[@role='button' and @tabindex='0'][3]/div";

    @FindBy(xpath = WRITE_ELEMENT_LETTER_BUTTON)
    private WebElement writeLetterButton;

    @FindBy(xpath = NEW_LETTER_LINK)
    private WebElement newLetterLink;

    @FindBy(xpath = ALL_LETTER_CHECKBOX)
    private WebElement allLetterCheckbox;

    @FindBy(xpath = DELETE_LETTER_BUTTON)
    private WebElement deleteLetterButton;

    @FindAll({@FindBy(xpath = MESSAGE_SUBJECT_LIST)})
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
        return messageSubjectText.get(0);
    }
}