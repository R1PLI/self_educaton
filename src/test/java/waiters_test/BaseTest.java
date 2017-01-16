package waiters_test;


import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import waiters.core.driver.Driver;

public abstract class BaseTest {
    @BeforeTest
    public void setUp() {
        Driver.getInstance().get("http://google.co.uk");
    }

    @AfterTest
    public void tearDown() {
        try{
            Driver.driverKill();
        } catch (Exception e) {
            Driver.driverKill();
        }

    }
}
