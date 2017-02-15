package waiters.data;

import org.testng.annotations.DataProvider;

public class SelenideDataProvider {
    private SelenideDataProvider() {

    }

    @DataProvider(name = "GoogleSearch")
    public static Object[][] query() {
        return new Object[][]{ {"Selenide", "Selenide: concise UI tests in Java"}, {"Steam", "Steam Community"}, {"vk", "VK (social networking) - Wikipedia"}
        };
    }
}
