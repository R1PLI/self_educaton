package page_object.elements;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import page_object.core.baseelement.CustomWebElement;
import page_object.core.baseelement.IClickedWebElement;

public class Button extends CustomWebElement implements IClickedWebElement {
    public Button(WebDriver webDriver, By by) {
        super(webDriver, by);
    }

    public void click() {
        getWebElement().click();
    }
}
