package finaltask.core.driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

import static finaltask.constants.TimeConstants.*;

public class Driver {

    private static WebDriver webDriver;

    private Driver() {

    }

    private static void setDriverImplicitly(int implicitlyTime, int pageLoadTime, int setScriptTime) {
        webDriver.manage().timeouts().implicitlyWait(implicitlyTime, TimeUnit.SECONDS);
        webDriver.manage().timeouts().pageLoadTimeout(pageLoadTime, TimeUnit.SECONDS);
        webDriver.manage().timeouts().setScriptTimeout(setScriptTime, TimeUnit.SECONDS);
    }

    public static WebDriver getInstance() {
        if (webDriver == null) {
            webDriver = new ChromeDriver();
            webDriver.manage().window().maximize();
            setDriverImplicitly(IMPLICITLY_WAIT_TIME, PAGE_LOAD_TIME, SET_SCRIPT_TIME);
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