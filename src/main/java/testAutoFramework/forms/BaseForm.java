package testAutoFramework.forms;

import org.openqa.selenium.By;

public class BaseForm {

    private final By locator;

    private final String name;

    protected BaseForm(By locator, String name) {
        this.locator = locator;
        this.name = name;
    }

    public By getLocator() {
        return locator;
    }

    public String getName() {
        return name;
    }
    


}
