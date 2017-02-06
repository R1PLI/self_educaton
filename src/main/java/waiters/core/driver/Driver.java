package waiters.core.driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;


public class Driver {
    private static WebDriver webDriver;
    private static ThreadLocal<WebDriver> webDriverThreadLocal = new ThreadLocal<>();

    private Driver() {

    }

    public static WebDriver getInstance() {
        if (webDriver == null) {
            webDriver = new ChromeDriver();
            webDriver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
            webDriver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
            webDriver.manage().timeouts().setScriptTimeout(30, TimeUnit.SECONDS);
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

    private static void setWebDriver() {
        webDriverThreadLocal.set(new ChromeDriver());
    }

    public static WebDriver getDriver() {
        return webDriverThreadLocal.get();
    }

    public static  void removeDriver() {
        webDriverThreadLocal.get().quit();
    }
}
