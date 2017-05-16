package finaltask.pages;

import finaltask.core.page.BasePage;
import lombok.Getter;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

@Getter
public class SignInLoginPage extends BasePage {

//  google is providing new visual design for the login page, so this will replace older one
//  private static final String EMAIL_LOGIN_FIELD = "//input[type='password']";
//  private static final String LOGIN_NEXT_BUTTON = "//content/span";
    private static final String EMAIL_LOGIN_FIELD = "//*[@id=\"identifierId\"]";
    private static final String LOGIN_NEXT_BUTTON = "//*[@id=\"identifierNext\"]/content/span";

    @FindBy(xpath = EMAIL_LOGIN_FIELD)
    private WebElement emailLoginField;

    @FindBy(xpath = LOGIN_NEXT_BUTTON)
    private WebElement loginNextButton;

    public SignInLoginPage() {
        super();
    }
}