package grid_test;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.*;

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
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
        driver.manage().timeouts().setScriptTimeout(30, TimeUnit.SECONDS);
        driver.get("https://www.google.co.uk/");
    }

    @AfterTest
    public void tearDown() {
        driver.quit();
    }
}
