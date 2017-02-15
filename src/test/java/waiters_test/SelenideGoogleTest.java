package waiters_test;


import org.testng.annotations.Test;
import waiters.data.SelenideDataProvider;
import waiters.selenide_pages.HomePageSelenide;
import waiters.selenide_pages.NewPageSelenide;
import waiters.selenide_pages.ResultPageSelenide;

public class SelenideGoogleTest {

    @Test(enabled = true, dataProvider = "GoogleSearch", dataProviderClass = SelenideDataProvider.class)
    public void basicTest(String searchQuery, String titleText) {
        new HomePageSelenide().open().search(searchQuery);
        new ResultPageSelenide()
                .followResultLink(0);
        new NewPageSelenide().shouldHavetitle(titleText);
    }


}
