package waiters.core.driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;


public class Driver {
    private static WebDriver webDriver;

    private Driver() {

    }

    public static WebDriver getInstance() {
        if (webDriver == null) {
            webDriver = new ChromeDriver();
            webDriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
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
}
