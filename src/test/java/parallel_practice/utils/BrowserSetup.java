package parallel_practice.utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

public class BrowserSetup {
    protected WebDriver driver;

    @Parameters("myBrowser")
    @BeforeTest
    public void launchBrowser(String myBrowser) {
        if(myBrowser.equalsIgnoreCase("firefox")) {
            driver = new FirefoxDriver();
        } else if (myBrowser.equalsIgnoreCase("chrome")) {
            driver = new ChromeDriver();
        }
    }
}
