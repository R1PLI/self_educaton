package parallel_practice;

import org.junit.Test;
import org.testng.Assert;


public class SimpleTest {
    @Test
    public void helloWorldSimpleTest() {
        String helloWorld = "Hello World";
        Assert.assertEquals("Hello World", helloWorld);
    }
}
