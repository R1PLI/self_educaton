package finaltask.pages;

import finaltask.core.page.BasePage;
import lombok.Getter;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

@Getter
public class SignInPwdPage extends BasePage {

//  google is providing new visual design for the login page, so this will replace older one
//  private static final String PSS_INPUT_FIELD = "//input[type='password']";
//  private static final String SIGN_IN_BUTTON = "//content/span";
    private static final String PSS_INPUT_FIELD = "//*[@id=\"password\"]/div[1]/div/div[1]/input";
    private static final String SIGN_IN_BUTTON = "//*[@id=\"passwordNext\"]/content/span";

    @FindBy(xpath = PSS_INPUT_FIELD)
    private WebElement passwordLoginField;

    @FindBy(xpath = SIGN_IN_BUTTON)
    private WebElement signInButton;

    public SignInPwdPage() {
        super();
    }
}