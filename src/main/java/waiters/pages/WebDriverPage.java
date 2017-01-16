package waiters.pages;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import waiters.core.page.BasePage;
import waiters.core.driver.Driver;

public class WebDriverPage extends BasePage {
    @FindBy(xpath = ".//*[@id='selenium-webdriver']/h1")
    private static WebElement titleText;

    public WebDriverPage() {
        super();
        PageFactory.initElements(Driver.getInstance(), this);
    }

    public static String getTitleText() {
        return titleText.getText();
    }
}
