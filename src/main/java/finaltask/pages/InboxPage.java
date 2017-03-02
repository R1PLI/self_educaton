package finaltask.pages;

import finaltask.core.page.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class InboxPage extends BasePage {

    @FindBy(className = "aic")
    private WebElement writeLetterButton;

    @FindBy(xpath = ".//*[@class='nU n1']/a")
    private WebElement newMessageLink;

    @FindBy(className = "T-Jo-auh")
    private WebElement allLetterSelector;

    @FindBy(xpath = ".//*[@class='G-tF']/div[2]/div[3]/div/div")
    private WebElement deleteLetterButton;

    @FindAll({@FindBy(className = "bog")})
    private List<WebElement> messageSubjectText;

    public InboxPage() {
        super();
    }

    public WebElement getWriteLetterButton() {
        return writeLetterButton;
    }


    public InboxPage newMessageLinkClick() {
        newMessageLink.click();
        return this;
    }

    public LetterPage writeLetterButtonClick() {
        writeLetterButton.click();
        return new LetterPage();
    }

    public InboxPage allMessageSelectorClick() {
        allLetterSelector.click();
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