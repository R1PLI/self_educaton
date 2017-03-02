package final_task_test;


import finaltask.core.driver.Driver;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import static finaltask.constants.UrlConstants.GMAIL_MAIN_PAGE;

public abstract class BaseTest {

    private static Logger logger = LogManager.getLogger(BaseTest.class);

    @BeforeTest
    public void setUp() {
        Driver.getInstance().get(GMAIL_MAIN_PAGE);
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