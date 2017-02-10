package waiters_test;


import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import steps.HomePageSteps;
import steps.ResultPageSteps;
import steps.SearchedPageSteps;
import waiters.data.DataProviderClass;
import waiters.pages.ResultPage;
import waiters.pages.SearchedPage;

import static org.assertj.core.api.Assertions.assertThat;


public class BasicGoogleTest extends BaseTest {

    /*@Test(enabled = true, dataProvider = "GoogleSearch", dataProviderClass = DataProviderClass.class)
    public void googleSearch(String searchQuery, int linkNumber, String linkVerifying, String assertionText) {

        new HomePage()
                .searchRequest(searchQuery)
                .searchButtonClick();

        assertThat(verifyLinkContainsText(getLinksText(), linkVerifying.toLowerCase())).isTrue();

        new ResultPage().searchedPageClick(linkNumber);

        String pageTitle = new SearchedPage().getPageTitle();

        assertThat(pageTitle.contains(assertionText)).isTrue();
    }*/

    private HomePageSteps hps;
    private ResultPageSteps rps;
    private SearchedPageSteps sps;

    @BeforeMethod
    public void stepsSetUp() {
        hps = new HomePageSteps();
        rps = new ResultPageSteps();
        sps = new SearchedPageSteps();
    }

    @Test(enabled = true, dataProvider = "GoogleSearch", dataProviderClass = DataProviderClass.class)
    public void googleSearch(String searchQuery, int linkNumber, String linkVerifying, String assertionText) {

        hps.createSearchRequest(searchQuery);
        hps.verifyLinkText(linkVerifying);

        rps.clickSearchedLink(linkNumber);

        sps.verifyUrl(assertionText);
    }
}
