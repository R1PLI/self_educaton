package finaltask.core.driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public final class Driver {

  private static WebDriver webDriver;

  private Driver() {

  }

  public static WebDriver getInstance() {
    if (webDriver == null) {
      webDriver = new ChromeDriver();
      webDriver.manage().window().maximize();
      return webDriver;
    } else {
      return webDriver;
    }
  }

  public static void driverKill() {
    if (webDriver != null) {
      webDriver.quit();
      webDriver = null;
    }
  }

  public static void clearCookie() {
    if (webDriver != null) {
      webDriver.manage().deleteAllCookies();
    }
  }
}
