package steps;

import waiters.pages.HomePage;
import waiters.pages.ResultPage;

import static org.assertj.core.api.Assertions.assertThat;
import static waiters.helper.ResultPageHelper.verifyLinkContainsText;
import static waiters.pages.ResultPage.getLinksText;

public class HomePageSteps {
    HomePage homePage = new HomePage();
    ResultPage resultPage = new ResultPage();

    public void createSearchRequest(String query) {
        homePage.searchRequest(query);
        resultPage.searchButtonClick();
    }

    public void verifyLinkText(String linkVerifying) {
        assertThat(verifyLinkContainsText(getLinksText(), linkVerifying.toLowerCase())).isTrue();
    }
}
