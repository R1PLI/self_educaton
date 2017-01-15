package page_object.elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import page_object.core.baseelement.WeebElement;

public class InputField extends WeebElement {
    public InputField(WebDriver webDriver, By by) {
        super(webDriver, by);
    }

    public void sendKeys(String string) {
        getWebElement().sendKeys(string);
    }
}
