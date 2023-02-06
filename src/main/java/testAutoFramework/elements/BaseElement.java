package testAutoFramework.elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import testAutoFramework.browser.WebDriverSingleton;
import testAutoFramework.utils.LoggerManager;

import java.time.Duration;
import java.util.List;
import java.util.NoSuchElementException;

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

    Wait<WebDriver> wait = new FluentWait<WebDriver>(instance)
            .withTimeout(Duration.ofSeconds(30))
            .pollingEvery(Duration.ofSeconds(5))
            .ignoring(NoSuchElementException.class);


    
}
