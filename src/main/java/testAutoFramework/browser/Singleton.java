package testAutoFramework.browser;

import org.openqa.selenium.WebDriver;

import static testAutoFramework.browser.DrivarFactory.createBrowserByArgument;
import static testAutoFramework.browser.DriverEnum.CHROME;

public class Singleton {
    private static volatile WebDriver instance;

    private Singleton() {}

    public static WebDriver getInstance() {
        WebDriver localInstance = instance;
        if (localInstance == null) {
            synchronized (WebDriver.class) {
                localInstance = instance;
                if (localInstance == null) {
                    instance = localInstance = createBrowserByArgument(CHROME);
                }
            }
        }
        return localInstance;
    }
}
