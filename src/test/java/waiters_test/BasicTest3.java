package waiters_test;


import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import waiters.pages.SearchPage;

import static org.assertj.core.api.Assertions.assertThat;
import static waiters.constants.ApplicationConstants.*;
import static waiters.pages.SearchedPage.getPageTitle;
import static waiters.pages.WebDriverPage.getTitleText;

public class BasicTest3 extends BaseTest {

    @DataProvider(name = "GoogleSearch")
    public static Object[][] query() {
        return new Object[][]{  {YOUTUBE_SEARCH_QUERY, FIRST_LINK, YOUTUBE_URL},
                                {STEAM_SEARCH_QUERY, FIRST_LINK, STEAM_URL},
                                {DOTA2_SEARCH_QUERY, FIRST_LINK, DOTA2_URL}
        };
    }

    @Test(dataProvider = "GoogleSearch")
    public void googleSearch(String searchQuery, int linkNumber, String assertionText) {
        new SearchPage()
                .searchRequest(searchQuery)
                .searchButtonClick()
                .searchedPageClick(linkNumber);
        assertThat(getPageTitle().contains(assertionText));
    }
}
