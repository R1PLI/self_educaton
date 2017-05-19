package finaltask.core.page;

import finaltask.core.driver.Driver;
import finaltask.core.utils.WaitCondition;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public abstract class BasePage {

  private static final Logger LOGGER = LogManager.getLogger(BasePage.class);
  private final WebDriverWait wait;
  protected WebDriver driver;

  protected BasePage() {
    driver = Driver.getInstance();
    this.wait = new WebDriverWait(driver, 2);
    LOGGER.info("Initialize waiter");
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
    List<WebElement> elements;

    elements = driver.findElements(locator);

    return elements;
  }

  protected abstract void pageRefresh();
}
