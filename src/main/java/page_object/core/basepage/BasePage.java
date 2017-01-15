package page_object.core.basepage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import page_object.core.driver.Driver;

public abstract class BasePage {

    protected String url;
    private WebDriver driver;

    public BasePage() {
        driver = Driver.getInstance();
        PageFactory.initElements(driver, this);
    }

}
