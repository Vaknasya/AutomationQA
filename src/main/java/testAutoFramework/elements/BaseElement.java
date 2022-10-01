package testAutoFramework.elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import testAutoFramework.browser.WebDriverSingleton;
import testAutoFramework.utils.LoggerManager;

public class BaseElement {
    protected static LoggerManager logger = new LoggerManager();
    protected static WebDriver instance = WebDriverSingleton.getInstance();
    public By locator;
    protected String name;

    public BaseElement(By locator, String name) {
        this.locator = locator;
        this.name = name;
    }

    public WebElement findElement() {
        logger.getLoggerMessage("Finding element: {}", this.name);
        return instance.findElement(this.locator);
    }


}
