package finaltask;

import finaltask.core.property.UrlConstants;
import finaltask.core.driver.Driver;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;


public abstract class BaseTest {

    private static final Logger LOGGER = LogManager.getLogger(BaseTest.class);
    private final UrlConstants urlConstants = new UrlConstants();

    @BeforeTest
    public void setUp() {
        Driver.getInstance().get(urlConstants.getGmailMainPage());
        LOGGER.info("Creating driver's instance");
        LOGGER.info("Set url for driver");
    }

    @AfterTest
    public void tearDown() {
        try {
            Driver.clearCookie();
            Driver.driverKill();
        } catch (Exception e) {
            LOGGER.error("Driver is dead");
        }
    }
}
