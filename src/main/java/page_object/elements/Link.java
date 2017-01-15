package page_object.elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import page_object.core.baseelement.IClickedWebElement;
import page_object.core.baseelement.WeebElement;

public class Link extends WeebElement implements IClickedWebElement {
    public Link(WebDriver webDriver, By by) {
        super(webDriver, by);
    }

    public void click() {
        getWebElement().click();
    }

    public String getText() {
        return getWebElement().getText();
    }
}
