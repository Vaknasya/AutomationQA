package testAutoFramework.browser;

import org.openqa.selenium.WebDriver;

import static testAutoFramework.browser.DrivarFactory.createBrowserByArgument;
import static testAutoFramework.browser.DriverEnum.CHROME;
import static testAutoFramework.browser.DriverEnum.FIREFOX_INCOGNITO;

public class Singleton {
    private static volatile WebDriver instance;

    private Singleton() {}

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
