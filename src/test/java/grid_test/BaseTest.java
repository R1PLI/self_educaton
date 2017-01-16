package grid_test;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

abstract public class BaseTest {

    protected static RemoteWebDriver driver;

    @BeforeTest
    @Parameters({"browser", "remoteURL"})
    public void setUp(String browser, String remoteURL) throws MalformedURLException {
        if (browser.equals("firefox")) {
            driver = new RemoteWebDriver(new URL(remoteURL), DesiredCapabilities.firefox());
        } else if (browser.equals("chrome")) {
            driver = new RemoteWebDriver(new URL(remoteURL), DesiredCapabilities.chrome());
        }

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
        driver.manage().timeouts().setScriptTimeout(30, TimeUnit.SECONDS);
    }

    @AfterTest
    public void tearDown() {
        driver.quit();
    }
}
