package finaltask.core.page;

import finaltask.core.driver.Driver;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public abstract class BasePage {

    private static final Logger logger = LogManager.getLogger(BasePage.class);

    protected BasePage() {
        WebDriver driver = Driver.getInstance();
        PageFactory.initElements(driver, this);
        logger.info("Initialize page elements");
    }
}