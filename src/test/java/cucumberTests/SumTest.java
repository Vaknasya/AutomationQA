package cucumberTests;

import Local.Calculator.CalculatorSum;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

import java.util.Optional;

public class SumTest {
    CalculatorSum calculatorSum;
    Integer result;

    @Given("I test calculator")
    public void i_test_calculator() {
        calculatorSum = new CalculatorSum();
    }
    @When("I add {int} and {int}")
    public void i_add_and(Integer int1, Integer int2) {
      result = calculatorSum.summing(int1, int2);

    }
    @Then("Result is {int}")
    public void result_is(Integer int1) {
        Assert.assertEquals(Integer.valueOf(result),int1);
    }
}
