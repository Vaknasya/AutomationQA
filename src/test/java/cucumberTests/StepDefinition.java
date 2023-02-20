package cucumberTests;

import Local.Calculator.CalculatorSum;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;


public class StepDefinition {
    CalculatorSum calculator;
    int result;

    @Given("I test calculator")
    public void i_test_calculator() {
        calculator = new CalculatorSum();
    }

    @When("I add {int} and {int}")
    public void i_add_and(Integer int1, Integer int2) {
        result = calculator.summing(int1, int2);
    }

    @Then("Result is {int}")
    public void result_is(Integer int1) {
        Assert.assertEquals(result, int1.intValue());

    }
}
