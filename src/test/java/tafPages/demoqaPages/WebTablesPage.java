package tafPages.demoqaPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import testAutoFramework.forms.BaseForm;

public class WebTablesPage extends BaseForm {

    protected WebTablesPage(By locator, String name) {
        super(locator, name);
    }

    public WebTablesPage(WebDriver driver) {
        super(driver);
    }





}
