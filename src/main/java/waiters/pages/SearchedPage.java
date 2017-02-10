package waiters.pages;

import waiters.core.driver.Driver;
import waiters.core.page.BasePage;

public class SearchedPage extends BasePage {

    public SearchedPage() {
        super();
    }

    public String getPageTitle() {
        return Driver.getInstance().getTitle();
    }
}
