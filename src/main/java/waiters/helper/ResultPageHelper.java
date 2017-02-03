package waiters.helper;

import org.openqa.selenium.WebElement;

import java.util.List;

public class ResultPageHelper {

    public static boolean verifyLinkContainsText(List<WebElement> resultList, String text) {
        for (WebElement linkText:resultList) {
            if(!linkText.getText().toLowerCase().contains(text)){
                return false;
            }
        }
        return true;
    }
}
