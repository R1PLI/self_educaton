package finaltask.helper;

import org.openqa.selenium.WebElement;


public class GeneralHelper {

    private GeneralHelper() {
    }

    public static boolean isElementPresented(WebElement element) {
        return element.isDisplayed() && element.isEnabled();
    }
}
