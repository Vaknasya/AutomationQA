package cucumberTests;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import testAutoFramework.browser.WebDriverSingleton;

public class GooglingTestDefinition {

    protected WebDriver driver = WebDriverSingleton.getDriver();

    @Given("I am on the Google search page")
    public void i_am_on_the_google_search_page() {
        driver.get("https://www.google.com/");
    }

    @When("I search for {string}")
    public void i_search_for(String string) {
        WebElement searchBox = driver.findElement(By.name("q"));
        searchBox.sendKeys("google terms");
        searchBox.submit();
    }

    @Then("I see search results for {string}")
    public void i_see_search_results_for(String string) {
        WebElement results = driver.findElement(By.cssSelector("h3.LC20lb"));
        Assert.assertTrue(results.getText().contains("term"));
        driver.quit();
    }

}
