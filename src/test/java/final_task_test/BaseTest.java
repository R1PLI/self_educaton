package final_task_test;


import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import final_task.core.driver.Driver;

import static final_task.constants.url.UrlConstants.GMAIL_MAIN_PAGE;

public abstract class BaseTest {

    private static Logger logger = LogManager.getLogger(BaseTest.class);

    @BeforeMethod
    public void setUp() {
        Driver.getInstance().get(GMAIL_MAIN_PAGE);
    }

    @AfterMethod
    public void tearDown() {
        try {
            Driver.clearCookie();
            Driver.driverKill();
        } catch (Exception e) {
            logger.error("Driver is dead");
        }
    }
}
