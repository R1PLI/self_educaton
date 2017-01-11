package serenity_cucumber.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.WebElement;

import java.util.List;


@DefaultUrl("http://www.johnlewis.com/fitflop-bumple-toepost-sandals/p3112345?colour-Gold")
public class ProductPage extends PageObject {

    //shoes information link
    @FindBy(xpath = ".//*[@class='mod mod-size-guide']/a")
    private WebElement shoeSizeInfoLink;

    //Shoes quantity
    //need help
    @FindBy(xpath = ".//*[@id='product-sizes-section']/div[2]")
    private WebElement shoeQuanitityLabel;

    //label with shoes color
    @FindBy(xpath = ".//*[@class='detail-pair']/p")
    private WebElement shoeColorLabel;

    //basket label with shoes color
    @FindBy(xpath = ".//strong[@class='colour']")
    private WebElement basketColorText;

    //label with shoes size
    @FindBy(xpath = ".//*[@id='prod-product-size']/div[1]/p")
    private WebElement shoesSizeLabel;

    //basket label with shoes size
    @FindBy(xpath = ".//strong[@class='size']")
    private WebElement basketSizeText;

    @FindBy(xpath = ".//*[@id='prod-product-size']/ul/li")
    private List<WebElement> sizeGridCells;

    public List<WebElement> getSizeGridCells() {
        return sizeGridCells;
    }

    public WebElement getShoeSizeInfo() {
        return shoeSizeInfoLink;
    }

    public boolean getShoeQuantityLabel() {
        return shoeQuanitityLabel.isDisplayed();
    }

    public String getShoeSizeLabelText() {
        return shoesSizeLabel.getText();
    }

    public String getBasketSizeText() {
        return basketSizeText.getText();
    }

    public String getShoeColorLabelText() {
        return shoeColorLabel.getText();
    }

    public WebElement getBasketColorText() {
        return basketColorText;
    }
}
