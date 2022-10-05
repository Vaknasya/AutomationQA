package testAutoFramework.browser;

import org.openqa.selenium.WebDriver;

import static testAutoFramework.browser.DrivarFactory.createBrowserByArgument;
import static testAutoFramework.browser.DriverFactoryType.*;

public class WebDriverSingleton {
    private static WebDriver instance;

    private WebDriverSingleton() {
    }

    public static synchronized WebDriver getDriver() {
        if (instance == null) {
            instance = createBrowserByArgument(FIREFOX_INCOGNITO);
        }
        return instance;
    }

    public static WebDriver getInstance() {
        return instance;
    }

}
