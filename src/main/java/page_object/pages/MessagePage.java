package page_object.pages;

import net.serenitybdd.core.annotations.findby.By;
import page_object.core.basepage.BasePage;
import page_object.core.driver.Driver;
import page_object.elements.Link;



public class MessagePage extends BasePage {

    private static Link messageLink;

    public MessagePage() {
        messageLink = new Link(Driver.getInstance(), By.xpath("//*[@id=\"ui_rmenu_all\"]/span"));
    }

    public static String verifyPrivateMessages() {
        return messageLink.getText();
    }
}
