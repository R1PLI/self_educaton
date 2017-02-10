package steps;

import waiters.pages.SearchedPage;

import static org.assertj.core.api.Assertions.assertThat;

public class SearchedPageSteps {
    SearchedPage searchedPage = new SearchedPage();

    public void verifyUrl(String assertionText) {
        assertThat(searchedPage.getPageTitle().toLowerCase().contains(assertionText)).isTrue();
    }
}
