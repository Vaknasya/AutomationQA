package testAutoFramework.utils;

import org.openqa.selenium.WebDriver;
import testAutoFramework.browser.WebDriverSingleton;

public class ExecuteJavaScriptManager {
    WebDriver driver = WebDriverSingleton.getDriver();
    JavaScriptEnum scriptEnum;

    public static void executeJsScript(JavaScriptEnum scriptName) {
        switch (scriptName) {
            case OPEN_NEW_WINDOW -> {
                return;
            }

        }
    }
}
