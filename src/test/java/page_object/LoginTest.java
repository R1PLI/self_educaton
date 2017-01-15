package page_object;

import org.junit.After;
import org.junit.Assert;
import org.junit.Test;
import page_object.core.driver.Driver;
import page_object.pages.LoginPage;

import static page_object.constants.ApplicationConstants.*;
import static page_object.pages.AudioPage.getAudioPageMusic;
import static page_object.pages.HomePage.profileNameText;
import static page_object.pages.MessagePage.verifyPrivateMessages;

public class LoginTest {

    @Test
    public void verifyUserOnHomePage() {
        new LoginPage()
                .homePageLogin(EMAIL, PASS);
        Assert.assertEquals("Rina", profileNameText());
    }

    @Test
    public void verifyLoginEnterMessagePage() {
        new LoginPage()
                .homePageLogin(EMAIL, PASS)
                .enterPrivateMessage();
        Assert.assertEquals("All messages", verifyPrivateMessages());

    }

    @Test
    public void verifyLoginEnterAudioPage() {
        new LoginPage()
                .homePageLogin(EMAIL, PASS)
                .enterAudioPage();
        Assert.assertEquals("My music", getAudioPageMusic());
    }

    @After
    public void tearDown() {
        Driver.close();
    }
}
