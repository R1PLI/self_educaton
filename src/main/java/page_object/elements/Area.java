package page_object.elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import page_object.core.baseelement.IClickedWebElement;
import page_object.core.baseelement.WeebElement;

public class Area extends WeebElement implements IClickedWebElement{
    public Area(WebDriver webDriver, By by) {
        super(webDriver, by);
    }

    public void click() {
        getWebElement().click();
    }

    public boolean isPresentedOnPage() {
        return getWebElement().isDisplayed();
    }

    public String getAreaText() {
        return getWebElement().getText();
    }
}
