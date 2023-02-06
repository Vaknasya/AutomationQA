package tests;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.*;
import testAutoFramework.browser.WebDriverSingleton;
import testAutoFramework.utils.LoggerManager;

import java.time.Duration;

public abstract class BaseTest {

    protected WebDriver driver = WebDriverSingleton.getDriver();
    protected static LoggerManager logger = new LoggerManager();

    @BeforeSuite
    protected void setupMethod() {
        logger.getLoggerMessage(this.getClass().toString(), "Was started");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(100));
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(100));
    }

    @AfterSuite
    public void quitTheApp() {
        logger.getLoggerMessage(this.getClass().toString(), "Was closed");
        driver.quit();
    }


}
