package final_task_test;

import finaltask.core.property.UrlConstants;
import finaltask.core.driver.Driver;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;


public abstract class BaseTest {

    private static final Logger logger = LogManager.getLogger(BaseTest.class);
    private final UrlConstants urlConstants = new UrlConstants();

    @BeforeTest
    public void setUp() {
        Driver.getInstance().get(urlConstants.getGmailMainPage());
        logger.info("Creating driver's instance");
        logger.info("Set url for driver");
    }

    @AfterTest
    public void tearDown() {
        try {
            Driver.clearCookie();
            Driver.driverKill();
        } catch (Exception e) {
            logger.error("Driver is dead");
        }
    }
}