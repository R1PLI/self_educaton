package waiters.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import waiters.core.driver.Driver;

import static org.testng.Assert.assertTrue;

public class OverwatchPage {

    /*@FindBy(className = "nav-logo")
    private static WebElement logoText;*/

    public OverwatchPage() {
        super();
    }

    public static String getUrlText() {
        return Driver.getInstance().getCurrentUrl();
    }
}
