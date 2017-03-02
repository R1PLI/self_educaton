package finaltask.core.page;

import finaltask.core.driver.Driver;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public abstract class BasePage {
    private static Logger logger = LogManager.getLogger(BasePage.class);

    private WebDriver driver;

    public BasePage() {
        driver = Driver.getInstance();
        PageFactory.initElements(driver, this);
        logger.info("Initialize page elements");
    }
}