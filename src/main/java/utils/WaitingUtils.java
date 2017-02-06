package utils;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;
import waiters.core.driver.Driver;

public final class WaitingUtils {

    public static <T> WebElement waitFor(ExpectedCondition<T> condition, long timeToWait) {
        return WebElement.class.cast(new WebDriverWait(Driver.getDriver(), timeToWait).until(condition));
    }
}
