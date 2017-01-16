package page_object.pages;

import org.openqa.selenium.By;
import page_object.core.basepage.BasePage;
import page_object.core.driver.Driver;
import page_object.elements.Link;

public class AudioPage extends BasePage {

    private static final String AUDIO_PAGE_LABEL_XPATH = "//*[@id=\"ui_rmenu_audio_album_405355403_-2\"]/span";
    private static Link myMusicLink;

    public AudioPage() {
        myMusicLink = new Link(Driver.getInstance(), By.xpath(AUDIO_PAGE_LABEL_XPATH));
    }

    public static String getAudioPageMusicLabel() {
        return myMusicLink.getText();
    }

}
