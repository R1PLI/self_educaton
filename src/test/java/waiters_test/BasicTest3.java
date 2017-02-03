package waiters_test;


import org.testng.annotations.Test;
import waiters.data.DataProviderClass;
import waiters.pages.ResultPage;
import waiters.pages.SearchPage;
import waiters.pages.SearchedPage;

import static org.assertj.core.api.Assertions.assertThat;
import static org.testng.Assert.assertTrue;
import static waiters.pages.ResultPage.getLinksText;
import static waiters.helper.ResultPageHelper.verifyLinkContainsText;


public class BasicTest3 extends BaseTest {

    @Test(dataProvider = "GoogleSearch", dataProviderClass = DataProviderClass.class)
    public void googleSearch(String searchQuery, int linkNumber, String linkVerifying, String assertionText) {

         new SearchPage().
                 searchRequest(searchQuery)
                .searchButtonClick();

        assertTrue(verifyLinkContainsText(getLinksText(), linkVerifying));

            new ResultPage().searchedPageClick(linkNumber);

        assertThat(new SearchedPage().getPageTitle().contains(assertionText));
    }
}
