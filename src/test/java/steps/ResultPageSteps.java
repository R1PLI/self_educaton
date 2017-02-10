package steps;

import waiters.pages.ResultPage;

public class ResultPageSteps {
    ResultPage resultPage = new ResultPage();

    public void clickSearchedLink(int linkNumber) {
        resultPage.searchedPageClick(linkNumber);
    }
}
