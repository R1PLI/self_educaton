import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.*;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;


import static org.testng.Assert.assertEquals;

public class TestClass {

    private RemoteWebDriver driver;

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

    @Test
    public void googleSearchOverwatchTest() {
        driver.get("http://www.google.com");
        driver.findElement(By.name("q")).sendKeys(("D.Va"));
        driver.findElement(By.name("btnG")).click();
        assertEquals(driver.findElement(By.xpath(".//*[@class='_Q1n']/div[1]")).getText(), "D.Va");
    }

    @Test
    public void googleSearchDotaTest() {
        driver.get("http://www.google.com");
        driver.findElement(By.name("q")).sendKeys(("Dota 2"));
        driver.findElement(By.name("btnG")).click();
        assertEquals(driver.findElement(By.xpath(".//*[@class='_Q1n']/div[1]")).getText(), "Dota 2");
    }

    @AfterTest
    public void tearDown() {
        driver.quit();
    }
}
