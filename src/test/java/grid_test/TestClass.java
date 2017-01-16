package grid_test;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class TestClass extends BaseTest {

    @Test
    public void googleSearchOverwatchTest() {
        driver.get("http://www.google.com");
        driver.findElement(By.name("q")).sendKeys(("D.Va"));
        driver.findElement(By.name("btnG")).click();
        assertEquals(driver.findElement(By.xpath(".//*[@class='_Q1n']/div[1]")).getText(), "D.Va");
    }

    @Test
    public void googleSearchDotaTest() {
        driver.get("http://www.google.com");
        driver.findElement(By.name("q")).sendKeys(("Dota 2"));
        driver.findElement(By.name("btnG")).click();
        assertEquals(driver.findElement(By.xpath(".//*[@class='_Q1n']/div[1]")).getText(), "Dota 2");
    }
}
