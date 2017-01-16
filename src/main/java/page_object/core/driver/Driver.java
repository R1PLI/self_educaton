package page_object.core.driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Driver {

    private static WebDriver driver;

    public static WebDriver getInstance() {
        if (driver == null) {
            driver = new ChromeDriver();
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
            driver.manage().timeouts().setScriptTimeout(10, TimeUnit.SECONDS);
            driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
            return driver;
        } else {
            return driver;
        }
    }

    public static void close() {
        if(driver != null) {
            driver.close();
            driver = null;
        }
    }
}
