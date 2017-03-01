package finaltask.core.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import finaltask.core.driver.Driver;

public abstract class BasePage {
    private WebDriver driver;

    public BasePage() {
        driver = Driver.getInstance();
        PageFactory.initElements(driver, this);
    }
}
