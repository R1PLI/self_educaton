package page_object;

import org.junit.Assert;
import org.junit.Test;
import page_object.pages.LoginPage;

import static page_object.constants.ApplicationConstants.EMAIL;
import static page_object.constants.ApplicationConstants.PASS;
import static page_object.pages.AudioPage.getAudioPageMusicLabel;
import static page_object.pages.HomePage.profileNameText;
import static page_object.pages.MessagePage.verifyPrivateMessages;

public class LoginTest extends BaseTest {

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
        Assert.assertEquals("My music", getAudioPageMusicLabel());
    }


}
