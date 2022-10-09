package testAutoFramework.browser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import testAutoFramework.utils.LoggerManager;


public class DrivarFactory {
    DriverEnum driverEnum;
    protected static LoggerManager logger = new LoggerManager();

    static WebDriver createBrowserByArgument(DriverEnum driverEnum) {
       logger.getLoggerInfo("Setup webDriver" + driverEnum);
        switch (driverEnum) {
            case CHROME:
                return new ChromeDriver();

            case FIREFOX:
                return new FirefoxDriver();

            case CHROME_INCOGNITO:
                ChromeOptions chromeOptions = new ChromeOptions();
                chromeOptions.addArguments("--incognito");
                return new ChromeDriver(chromeOptions);

            case FIREFOX_INCOGNITO:
                FirefoxOptions firefoxOptions = new FirefoxOptions();
                firefoxOptions.addArguments("-private");
                return new FirefoxDriver(firefoxOptions);
        }

        throw new RuntimeException(driverEnum + " is unknown argument");
    }
}

