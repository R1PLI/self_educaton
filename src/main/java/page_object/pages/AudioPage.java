package page_object.pages;

import org.openqa.selenium.By;
import page_object.core.basepage.BasePage;
import page_object.core.driver.Driver;
import page_object.elements.Link;

public class AudioPage extends BasePage {

    private static Link myMusicLink;

    public AudioPage() {
        myMusicLink = new Link(Driver.getInstance(), By.xpath("//*[@id=\"ui_rmenu_audio_album_405355403_-2\"]/span"));
    }

    public static String getAudioPageMusic() {
        return myMusicLink.getText();
    }

}
