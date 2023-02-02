package pages.steamPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import testAutoFramework.elements.clickableElements.Button;
import testAutoFramework.forms.BaseForm;

public class SteamNameForm extends BaseForm {

    protected SteamNameForm(By locator, String name) {
        super(locator, name);
    }

    public SteamNameForm(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//div[@class='store_nav']//*[contains((@href), \"news\")]//*[1]")
    WebElement newsButton;

    public void clickNewsBtn() {
        newsButton.click();
    }

    @FindBy(xpath=  "//div[@class='eventcalendar_NewsChannelText_3giXA']//*[contains(text(), \"Предстоящие события\")]")
    WebElement uncommingButton;

    public void clickUncommingBtn(){
        uncommingButton.click();
    }

// form#searchform
}
