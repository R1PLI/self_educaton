package waiters.core.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import waiters.core.driver.Driver;

public class BasePage {

    private WebDriver driver;

    public BasePage() {
        driver = Driver.getInstance();
        PageFactory.initElements(driver, this);
    }
}
