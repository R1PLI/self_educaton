package waiters.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import waiters.core.driver.Driver;

public class OverwatchPage {

    @FindBy(className = "nav-logo")
    private static WebElement logoText;

    public OverwatchPage() {
        super();
    }

    public static String getLogoText() {
        return Driver.getInstance().getCurrentUrl();
    }
}
