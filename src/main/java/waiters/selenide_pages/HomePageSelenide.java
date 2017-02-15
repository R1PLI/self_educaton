package waiters.selenide_pages;

import com.codeborne.selenide.Selenide;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class HomePageSelenide {

    public HomePageSelenide open() {
        Selenide.open("http://google.co.uk");
        return this;
    }

    public void search(String text) {
        $(By.name("q")).setValue(text).pressEnter();
    }
}
