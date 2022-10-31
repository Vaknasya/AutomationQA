package testAutoFramework.browser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
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
                System.setProperty("webdriver.chrome.driver","J:\\WebDriversForSelenium\\chrome\\chromedriver.exe");
//              System.setProperty("webdriver.chrome.driver","/path/chromedriver");
                return new ChromeDriver();

            case FIREFOX:
                System.setProperty("webdriver.gecko.driver", "J:\\WebDriversForSelenium\\geckofirefox\\geckodriver.exe");
                return new FirefoxDriver();

            case CHROME_INCOGNITO:
                System.setProperty("webdriver.chrome.driver","J:\\WebDriversForSelenium\\chrome\\chromedriver.exe");
                ChromeOptions chromeOptions = new ChromeOptions();
                chromeOptions.addArguments("--incognito");
                return new ChromeDriver(chromeOptions);

            case FIREFOX_INCOGNITO:
                System.setProperty("webdriver.gecko.driver", "J:\\WebDriversForSelenium\\geckofirefox\\geckodriver.exe");
                FirefoxOptions firefoxOptions = new FirefoxOptions();
                firefoxOptions.addArguments("-private");
                return new FirefoxDriver(firefoxOptions);

            case EDGE:
                System.setProperty("webdriver.edge.driver", "J:\\WebDriversForSelenium\\edge\\msedgedriver.exe");
                return new EdgeDriver();
        }

        throw new RuntimeException(driverEnum + " is unknown argument");
    }
}

