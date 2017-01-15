package page_object.core.baseelement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public abstract class WeebElement{
    private WebElement webElement;

    protected WebElement getWebElement() {
        return webElement;
    }

    public WeebElement(WebDriver webDriver, By by) {
        this.webElement = webDriver.findElement(by);
    }
}
