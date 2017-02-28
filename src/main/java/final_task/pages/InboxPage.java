package final_task.pages;

import final_task.core.page.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class InboxPage extends BasePage{

    @FindBy(className = "aic")
    private static WebElement writeLetterButton;

    @FindBy(xpath = ".//*[@class='nU n1']/a")
    private static WebElement newMessageLink;

    @FindAll({@FindBy(className = "bog")})
    private static List<WebElement> messageSubjectText;

    public InboxPage() {
        super();
    }

    public static WebElement getWriteLetterButton() {
        return writeLetterButton;
    }

    public static List<WebElement> getMessageSubjectField() {
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
