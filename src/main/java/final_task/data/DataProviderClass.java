package final_task.data;

import org.testng.annotations.DataProvider;

import static final_task.constants.assertion.AssertConstants.*;
import static final_task.constants.test.TestConstants.*;

public class DataProviderClass {
    private DataProviderClass() {

    }

    /*@DataProvider(name = "GoogleSearch")
    public static Object[][] query() {
        return new Object[][]{  {YOUTUBE_SEARCH_QUERY, FIRST_LINK, YOUTUBE_LINK_VERIFYING, YOUTUBE_URL},
                                {STEAM_SEARCH_QUERY, FIRST_LINK, STEAM_LINK_VERIFYING, STEAM_URL},
                                {FACEBOOK_SEARCH_QUERY, FIRST_LINK, FACEBOOK_LINK_VERIFYING, FACEBOOK_URL}
        };
    }*/
}
