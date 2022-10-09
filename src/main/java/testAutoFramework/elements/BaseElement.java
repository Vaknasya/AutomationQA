package testAutoFramework.elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import testAutoFramework.browser.WebDriverSingleton;
import testAutoFramework.utils.LoggerManager;

import java.util.List;

public abstract class BaseElement {
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

    public void click() {
        logger.getLoggerMessage(this.getClass().toString(), this.name);
        findElement().click();
    }

    public List<WebElement> findElements() {
        logger.getLoggerMessage("Finding elements: {}", this.name);
        return instance.findElements(this.locator);
    }

    public boolean isDisplayed() {
        logger.getLoggerMessage("Check is element displayed: {}", this.name);
        return findElement().isDisplayed();
    }

    public String getText(){
        logger.getLoggerMessage("Getting text text");
        return findElement().getText();
    }
    
    public void sendKeys(String keys){
        logger.getLoggerMessage("Getting text text");
        findElement().sendKeys(keys);
    }

    public void moveTo() {
        new Actions(instance).moveToElement(findElement()).build().perform();
    }

    
}
