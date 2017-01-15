package page_object.core.baseelement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public interface ISetWebElement {
    void setWebElementBy(WebDriver webDriver, By by);
}
