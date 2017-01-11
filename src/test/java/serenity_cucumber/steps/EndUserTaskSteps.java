package serenity_cucumber.steps;

import net.thucydides.core.annotations.Step;
import org.assertj.core.api.Assertions;
import serenity_cucumber.pages.ProductPage;

import static org.junit.Assert.assertEquals;


public class EndUserTaskSteps {

    private ProductPage productPage;

    @Step
    public void verifyHomePageIsDisplayed() {
        productPage.getDriver().manage().window().maximize();
        productPage.open();
    }

    @Step
    public void verifyLinkPresented() {
        assertEquals(true, productPage.getShoeSizeInfo().isDisplayed());
    }

    @Step
    public void verifyShoesSizeLink() {
        assertEquals(true, productPage.getShoeSizeInfo().isEnabled());
    }

    @Step
    public void chooseShoesSize(int index) {
        productPage.getSizeGridCells().get(index).click();
    }

    @Step
    public void isShoesQuantityDisplayed() {
        productPage.getShoeQuantityLabel();
    }

    @Step
    public void verifyShoesSizeInBasket() {
        assertEquals(productPage.getShoeSizeLabelText(), productPage.getBasketSizeText());
    }

    @Step
    public void verifyShoesColorInBasket() {
        productPage.waitFor(productPage.getBasketColorText());
        assertEquals(productPage.getShoeColorLabelText(), productPage.getBasketColorText().getText());
    }

}
