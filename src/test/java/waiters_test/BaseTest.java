package waiters_test;


import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import waiters.core.driver.Driver;

import static waiters.constants.url.UrlConstants.GOOGLE_COM;

public abstract class BaseTest {

    @BeforeMethod
    public void setUp() {
        Driver.getInstance().get(GOOGLE_COM);
    }

    @AfterMethod
    public void tearDown() {
        try {
            Driver.clearCookie();
            Driver.driverKill();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
