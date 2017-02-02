package waiters_test;


import org.testng.annotations.Test;
import waiters.pages.SearchPage;

import static org.assertj.core.api.Assertions.assertThat;
import static waiters.constants.ApplicationConstants.*;
import static waiters.pages.WebDriverPage.getTitleText;

public class BasicTest extends BaseTest {

    @Test
    public void googleWebDriverSearchTest() {
        new SearchPage()
                .searchRequest(WEB_DRIVER_SEARCH_QUERY)
                .searchButtonClick()
                .webDriverLinkClick(SECOND_LINK);
        assertThat(getTitleText().equalsIgnoreCase(SELENIUM_WEB_DRIVER_TITLE_TEXT));
    }
}
