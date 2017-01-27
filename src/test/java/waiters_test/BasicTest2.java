package waiters_test;

import org.testng.annotations.Test;
import waiters.pages.SearchPage;

import static org.assertj.core.api.Assertions.assertThat;
import static waiters.constants.ApplicationConstants.OVERWATCH_SEARCH_QUERY;
import static waiters.constants.ApplicationConstants.OVERWATCH_SITE_URL;
import static waiters.pages.OverwatchPage.getLogoText;

public class BasicTest2 extends BaseTest {
    @Test
    public void googleOverwatchSearchTest() {
        new SearchPage()
                .searchRequest(OVERWATCH_SEARCH_QUERY)
                .searchButtonClick()
                .linkClick();
        assertThat(getLogoText().contains(OVERWATCH_SITE_URL));
    }
}
