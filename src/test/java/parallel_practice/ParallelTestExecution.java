package parallel_practice;



import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;
import parallel_practice.utils.BrowserSetup;

import static constants.WebSiteConstants.GOOGLE_COM;
import static constants.WebSiteConstants.STACKOVERFLOW;



public class ParallelTestExecution extends BrowserSetup {

    @Test
    public void SimpleStackOverflowTest() {
        driver.get(STACKOVERFLOW);
        String logoText = driver.findElement(By.cssSelector("#hlogo")).getText();
        Assert.assertEquals("Stack Overflow", logoText);
    }

    @Test
    public void SimpleGoogleTest() {
        driver.get(GOOGLE_COM);
        driver.findElement(By.name("q")).sendKeys("seleniumFirstTest");
    }

    @AfterTest
    public void tearDown() {
        driver.quit();
    }
}
