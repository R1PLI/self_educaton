package waiters_test;


import org.testng.Assert;
import org.testng.annotations.Test;
import waiters.pages.SearchPage;

import static waiters.pages.WebDriverPage.getTitleText;

public class BasicTest extends BaseTest{

    @Test
    public void googleSearchTest() {
        new SearchPage()
                .searchRequest("Webdriver")
                .searchButtonClick()
                .linkClick("Selenium WebDriver — Selenium Documentation");
        Assert.assertEquals(getTitleText(), "Selenium WebDriver");
    }
}