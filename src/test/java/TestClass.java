import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.*;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class TestClass {

    private RemoteWebDriver driver;

    @BeforeTest
    @Parameters({"browser", "remoteURL"})
    public void setUp(String browser, String remoteURL) throws MalformedURLException {
        if(browser.equals("firefox")){
            driver = new RemoteWebDriver(new URL(remoteURL), DesiredCapabilities.firefox());
        } else {
            driver = new RemoteWebDriver(new URL(remoteURL), DesiredCapabilities.chrome());
        }

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
        driver.manage().timeouts().setScriptTimeout(30, TimeUnit.SECONDS);
    }

    @AfterTest
    public void tearDown() {
        //driver.close();
    }

    @Test
    public void googleSearchDotaTest() {
        driver.get("http://www.google.com");
        driver.findElement(By.name("q")).sendKeys(("D.Va!"));
        driver.findElement(By.name("btnG")).click();
    }

    @Test
    public void googleSearchOverwatchTest() {
        driver.get("http://www.google.com");
        driver.findElement(By.name("q")).sendKeys(("Dota2!"));
        driver.findElement(By.name("btnG")).click();
    }
}
