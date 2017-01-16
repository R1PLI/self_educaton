package page_object.core.baseelement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public abstract class CustomWebElement {
    private WebElement webElement;

    protected WebElement getWebElement() {
        return webElement;
    }

    public CustomWebElement(WebDriver webDriver, By by) {
        this.webElement = webDriver.findElement(by);
    }
}
