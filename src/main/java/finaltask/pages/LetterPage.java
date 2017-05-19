package finaltask.pages;

import finaltask.core.page.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static finaltask.core.utils.WaitCondition.clickable;
import static finaltask.core.utils.WaitCondition.presented;
import static finaltask.core.utils.WaitCondition.visible;


public class LetterPage extends BasePage {

  private final By toInputField = By.xpath("//textarea[@name='to']");
  private final By subjectInputField = By.xpath("//input[@name='subjectbox']");
  private final By messageAreaText = By.xpath("//input[@name='subjectbox']/ancestor::form/following-sibling::table//div[@role='textbox']");
  private final By sendMessageButton = By.xpath("(//div[@role='dialog']//div[@role='button' and @tabindex='1'])[1]");

  @Override
  protected void pageRefresh() {

  }

  public void toInputFieldWrite(final String to) {
    type(toInputField, visible, to);
  }

  public void subjectInputFieldWrite(final String subject) {
    type(subjectInputField, visible, subject);
  }

  public void messageInputFieldWrite(final String message) {
    type(messageAreaText, visible, message);
  }

  public void sendMessageButtonClick() {
    click(sendMessageButton, clickable);
  }
}
