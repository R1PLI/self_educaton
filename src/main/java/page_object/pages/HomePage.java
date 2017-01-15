package page_object.pages;


import org.openqa.selenium.By;
import page_object.core.basepage.BasePage;
import page_object.core.driver.Driver;
import page_object.elements.Link;


public class HomePage extends BasePage {

    private Link messageLink;
    private Link audioLink;
    private static Link profileLink;

    public HomePage() {
        messageLink = new Link(Driver.getInstance(), By.id("l_msg"));
        audioLink = new Link(Driver.getInstance(), By.id("l_aud"));
        profileLink = new Link(Driver.getInstance(), By.className("top_profile_name"));
    }

    private HomePage messageLinkClick() {
        messageLink.click();
        return this;
    }

    private HomePage audioLinkClick() {
        audioLink.click();
        return this;
    }

    public static String profileNameText() {
        return profileLink.getText();
    }

    public MessagePage enterPrivateMessage() {
        messageLinkClick();
        return new MessagePage();
    }

    public AudioPage enterAudioPage() {
        audioLinkClick();
        return new AudioPage();
    }
}
