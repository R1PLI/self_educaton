package final_task.helper;

import org.openqa.selenium.WebElement;

import java.util.List;

public class InboxPageHelper {
    public static boolean isElementPresented(WebElement element) {
        return element.isDisplayed() && element.isEnabled();
    }

    public static boolean isSubjectExists(List<WebElement> webElements, String subjectMessage) {
        for(WebElement webElement : webElements) {
            if(webElement.getText().contains(subjectMessage)) {
                return true;
            }
        }
        return false;
    }
}
