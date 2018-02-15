package finaltask;

import finaltask.core.driver.Driver;
import finaltask.core.property.UrlConstants;
import lombok.extern.log4j.Log4j2;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

@Log4j2
public abstract class BaseTest {

    final UrlConstants urlConstants = new UrlConstants();
    WebDriver driver;

    @BeforeTest
    public void setUp() {
        driver = Driver.getInstance();
        log.info("Creating driver's instance");
        log.info("Set url for driver");
    }

    @AfterTest
    public void tearDown() {
        try {
            Driver.clearCookie();
            Driver.driverKill();
        } catch (Exception e) {
            log.error("Driver is dead");
        }
    }
}
