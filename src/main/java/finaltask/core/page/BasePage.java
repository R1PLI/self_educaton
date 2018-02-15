package finaltask.core.page;

import finaltask.core.driver.Driver;
import finaltask.core.utils.WaitCondition;
import lombok.extern.log4j.Log4j2;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.ArrayList;
import java.util.List;

@Log4j2
public abstract class BasePage {

  private final WebDriverWait wait;
  protected WebDriver driver = Driver.getInstance();

  protected BasePage() {
    this.wait = new WebDriverWait(driver, 2);
    log.info("Initialize waiter");
  }

  private WebElement waitFor(final By locator, final WaitCondition condition) {
    return wait.until(condition.getType().apply(locator));
  }

  protected void click(final By locator, final WaitCondition condition) {
    waitFor(locator, condition).click();
  }

  protected void type(final By locator, final WaitCondition condition, final CharSequence text) {
    waitFor(locator, condition).sendKeys(text);
  }

  protected String getText(final By locator, final WaitCondition condition) {
    return waitFor(locator, condition).getText();
  }

  protected List<WebElement> getListOfElements(final By locator) {
    return new ArrayList<>(driver.findElements(locator));
  }

  protected abstract void pageRefresh();
}
