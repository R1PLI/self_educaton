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

    @FindAll({@FindBy(className = "bog")})
    private List<WebElement> messageSubjectText;

    public InboxPage() {
        super();
    }

    public WebElement getWriteLetterButton() {
        return writeLetterButton;
    }

    public List<WebElement> getMessageSubjectField() {
        return messageSubjectText;
    }

    public InboxPage newMessageLinkClick() {
        newMessageLink.click();
        return this;
    }

    public LetterPage writeLetterButtonClick() {
        writeLetterButton.click();
        return new LetterPage();
    }
}
