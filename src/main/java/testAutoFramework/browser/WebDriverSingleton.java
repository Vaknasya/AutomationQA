package testAutoFramework.browser;

import org.openqa.selenium.WebDriver;

import static testAutoFramework.browser.DrivarFactory.createBrowserByArgument;

public class WebDriverSingleton {
    private static WebDriver instance;

    private WebDriverSingleton() {
    }

    public static synchronized WebDriver getDriver() {
        if (instance == null) {
            instance = createBrowserByArgument(DriverFactoryType.CHROME);
        }
        return instance;
    }

    public static WebDriver getInstance() {
        return instance;
    }

}
