package serenity_cucumber.step_defenition;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;
import serenity_cucumber.steps.EndUserTaskSteps;


public class ShoesSizeGuideLink {

    @Steps
    EndUserTaskSteps endUserTaskSteps;

    @Given("user is on the product page")
    public void userIsOnTheProductPage() {
        endUserTaskSteps.verifyHomePageIsDisplayed();
    }

    @When("user sees shoe size guide link")
    public void userSeesShoeSizeGuideLink() {
        endUserTaskSteps.verifyLinkPresented();
    }

    @When("user chooses shoes size with index '(\\d+)'")
    public void userChoosesShoesSize(int index) {
        endUserTaskSteps.chooseShoesSize(index);
    }

    @Then("verify that shoes size link is presented and clickable")
    public void verifyShoesLinkPresentedAndClickable() {
        endUserTaskSteps.verifyShoesSizeLink();
    }

    @Then("verify shoes color")
    public void verifyShoesColor() {
        endUserTaskSteps.verifyShoesColorInBasket();
    }

    @Then("verify that product quantity is displayed")
    public void verifyThatProductQuantityIsDisplayed() {
        endUserTaskSteps.isShoesQuantityDisplayed();
    }

    @And("verify shoes size")
    public void verifyShoesSize() {
        endUserTaskSteps.verifyShoesSizeInBasket();
    }

}

