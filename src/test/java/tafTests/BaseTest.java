package tafTests;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.*;
import testAutoFramework.browser.WebDriverSingleton;
import testAutoFramework.utils.LoggerManager;

import java.time.Duration;

public abstract class BaseTest {
    // переделать под конфиг и переименовать под BASE_URL или реализовать enum
    protected static final String STEAM_URL = "https://store.steampowered.com/";
    protected static final String DEMOQA_URL = "https://demoqa.com/";

    protected WebDriver driver = WebDriverSingleton.getDriver();
    protected static LoggerManager logger = new LoggerManager();

    @BeforeSuite
    protected void setupMethod() {
        logger.getLoggerMessage(this.getClass().toString(), "Was started");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
    }

    @AfterSuite
    public void quitTheApp() {
        logger.getLoggerMessage(this.getClass().toString(), "Was closed");
        driver.quit();
    }

    //  Getter есть, разобраться с ним
    protected WebDriverSingleton getBrowser() {
        return (WebDriverSingleton) WebDriverSingleton.getDriver();
    }



}
