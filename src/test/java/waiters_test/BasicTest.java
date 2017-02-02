package waiters_test;


import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import waiters.pages.SearchPage;


import static org.assertj.core.api.Assertions.assertThat;
import static waiters.constants.ApplicationConstants.*;
import static waiters.pages.WebDriverPage.getTitleText;

public class BasicTest extends BaseTest {

    @DataProvider(name = "WebDriver")
    public static Object[][] query() {
        return new Object[][] { {WEB_DRIVER_SEARCH_QUERY, SECOND_LINK, SELENIUM_WEB_DRIVER_TITLE_TEXT} };
    }

    @Test(dataProvider = "WebDriver")
    public void googleWebDriverSearchTest(String searchQuery, int linkNumber, String assertionText) {
        new SearchPage()
                .searchRequest(searchQuery)
                .searchButtonClick()
                .webDriverLinkClick(linkNumber);
        assertThat(getTitleText().equalsIgnoreCase(assertionText));
    }
}
