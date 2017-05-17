package finaltask.pages;

import finaltask.core.page.BasePage;
import org.openqa.selenium.By;

import static finaltask.core.utils.WaitCondition.clickable;
import static finaltask.core.utils.WaitCondition.visible;
import static finaltask.core.utils.WaitCondition.presented;


public class InboxPage extends BasePage {

  private final By writeElementButton = By.xpath("//div[@role='navigation']/preceding-sibling:: div//div[@role='button']");
  private final By newLetterLink = By.xpath("(//div[@role='navigation']//a)[1]");
  private final By messageSubjectList = By.xpath("//div[@role='main']/descendant::table/descendant::tr/descendant::span/b");
  private final By allLettersCheckbox = By.xpath("//span[@role='checkbox']/div");
  private final By deleteLetterButton = By.xpath("//div/div[@role='button' and @tabindex='0'][3]/div");
  private final By firstMessage = By.xpath("//div[@role='main']/descendant::table/descendant::tr[1]/descendant::span/b");

  public InboxPage() {
    super();
  }

  public void writeNewLetterLinkClick() {
    click(writeElementButton, visible);
  }

  public void deleteLetterButtonClick() {
    click(deleteLetterButton, clickable);
  }

  public void allLettersCheckboxClick() {
    click(allLettersCheckbox, clickable);
  }

  public boolean isSubjectListEmpty() {
    return getListOfElements(messageSubjectList).isEmpty();
  }

  public String getSubjectText() {
    return getText(firstMessage, presented);
  }

  public void newLetterLink() {
    click(newLetterLink, clickable);
  }
}
