package tafTests;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import testAutoFramework.browser.WebDriverSingleton;
import testAutoFramework.utils.LoggerManager;

public abstract class BaseTest {
    // переделать под конфиг и переименовать под BASE_URL или реализовать enum
    protected static final String STEAM_URL = "https://store.steampowered.com/";
    protected static final String DEMOQA_URL = "https://demoqa.com/webtables";

    protected WebDriver driver = WebDriverSingleton.getDriver();
    protected static LoggerManager logger = new LoggerManager();

    @BeforeMethod
    protected void setupMethod() {
        logger.getLoggerMessage(this.getClass().toString(), "Was started");
        driver.manage().window().maximize();
    }

    @AfterMethod
    public void quitTheApp() {
        logger.getLoggerMessage(this.getClass().toString(), "Was closed");
        driver.quit();
    }


    //  Getter есть, разобраться с ним
    protected WebDriverSingleton getBrowser() {
        return (WebDriverSingleton) WebDriverSingleton.getDriver();
    }

}
