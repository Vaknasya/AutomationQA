package testAutoFramework.forms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import testAutoFramework.browser.WebDriverSingleton;

public class BaseForm {
    protected WebDriver instance = WebDriverSingleton.getDriver();
    private  By locator;
    private String name;

    protected BaseForm(By locator, String name) {
        this.locator = locator;
        this.name = name;
    }

    public BaseForm(WebDriver instance){
        this.instance = instance;
    }

//    public BaseForm(WebDriver instance) {
//        this.instance = instance;
//    }

    public By getLocator() {
        return locator;
    }

    public String getName() {
        return name;
    }
    


}
