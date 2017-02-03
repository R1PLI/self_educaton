package waiters_test;

import org.testng.annotations.Test;
import waiters.pages.SearchPage;

import static org.assertj.core.api.Assertions.assertThat;
import static waiters.constants.assertion.AssertConstants.OVERWATCH_SITE_URL;
import static waiters.constants.test.TestConstants.FIRST_LINK;
import static waiters.constants.test.TestConstants.OVERWATCH_SEARCH_QUERY;
import static waiters.pages.OverwatchPage.getUrlText;


public class BasicTest2 extends BaseTest {

    @Test
    public void googleOverwatchSearchTest() {
        new SearchPage()
                .searchRequest(OVERWATCH_SEARCH_QUERY)
                .searchButtonClick()
                .overwatchLinkClick(FIRST_LINK);
        assertThat(getUrlText().contains(OVERWATCH_SITE_URL));
    }
}
