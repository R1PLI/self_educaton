package page_object;

import org.junit.After;
import page_object.core.driver.Driver;

abstract public class BaseTest {
    @After
    public void tearDown() {
        Driver.close();
    }
}
