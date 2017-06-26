package finaltask;

import finaltask.core.property.UrlConstants;
import finaltask.core.driver.Driver;
import lombok.extern.log4j.Log4j2;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

@Log4j2
public abstract class BaseTest {

    private final UrlConstants urlConstants = new UrlConstants();

    @BeforeTest
    public void setUp() {
        Driver.getInstance().get(urlConstants.getGmailMainPage());
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
