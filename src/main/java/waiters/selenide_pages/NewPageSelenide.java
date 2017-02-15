package waiters.selenide_pages;

import com.codeborne.selenide.Selenide;

import static org.openqa.selenium.support.ui.ExpectedConditions.titleIs;

public class NewPageSelenide {

    public void shouldHavetitle(String text) {
        Selenide.Wait().until(titleIs(text));
    }
}
