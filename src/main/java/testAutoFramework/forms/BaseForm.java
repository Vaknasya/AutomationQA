package testAutoFramework.forms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import testAutoFramework.browser.WebDriverSingleton;

public abstract class BaseForm {
    protected WebDriver driver = WebDriverSingleton.getDriver();
    private By locator;
    private String name;

    protected BaseForm(By locator, String name) {
        this.locator = locator;
        this.name = name;
    }

    public BaseForm(WebDriver driver) {
        this.driver = driver;
    }

    public By getLocator() {
        return locator;
    }

    public String getName() {
        return name;
    }

    public void open(String url) {
        driver.get(url);
    }

    public WebDriver getInstance() {
        return driver;
    }

    public void closeWindow() {
        driver.close();
    }

    public void navigateBack() {
        driver.navigate().back();
    }

}
