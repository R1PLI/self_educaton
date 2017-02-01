package jbehave.steps;

import jbehave.example.Calculator;
import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Named;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;

public class AddTwoNumbersSteps {
    private Calculator calculator;

    @Given("a calculator")
    public void given_a_calculator() {
        calculator = new Calculator();
    }

    @When("I add <number1> and <number2>")
    public void when_i_add_number1_and_number2(@Named("number1") int number1, @Named("number2") int number2) {
        calculator.add(number1, number2);
    }

    @Then("the outcome should <result>")
    public void then_the_outcome_should(@Named("result") int result) {
        assert calculator.getResult() == result;
    }
}
