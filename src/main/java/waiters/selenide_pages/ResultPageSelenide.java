package waiters.selenide_pages;


import com.codeborne.selenide.ElementsCollection;

import static com.codeborne.selenide.Selenide.$$;

public class ResultPageSelenide {

    public ElementsCollection results() {
        return $$(".srg>.g");
    }

    public void followResultLink(int index) {
        this.results().get(index).find(".r>a").click();
    }
}
