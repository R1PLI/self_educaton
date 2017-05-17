package finaltask.pages;

import finaltask.core.page.BasePage;
import org.openqa.selenium.By;

import static finaltask.core.utils.WaitCondition.clickable;
import static finaltask.core.utils.WaitCondition.visible;


public class LoginPage extends BasePage {

  private final By emailLoginField = By.xpath("//*[@id=\"identifierId\"]");
  private final By loginNextButton = By.xpath("//*[@id=\"passwordNext\"]/content");
  private final By pwdInputField = By.xpath("//*[@id=\"password\"]/div[1]/div/div[1]/input");
  private final By signInButton = By.xpath("//*[@id=\"identifierNext\"]/content/span");

  public LoginPage() {
    super();
  }

  public void loginButtonClick() {
    click(signInButton, clickable);
  }

  public void pwdButtonClick() {
    click(loginNextButton, clickable);
  }

  public void inputCredentialsInEmailField(final String email) {
    type(emailLoginField, visible, email);
  }

  public void inputCredentialsInPasswordField(final String email) {
    type(pwdInputField, visible, email);
  }
}
