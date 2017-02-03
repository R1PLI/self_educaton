package waiters.pages;

import waiters.core.driver.Driver;
import waiters.core.page.BasePage;

public class SearchedPage extends BasePage {

    public SearchedPage() {
        super();
    }

    public static String getPageTitle() {
        return Driver.getInstance().getTitle();
    }
}
