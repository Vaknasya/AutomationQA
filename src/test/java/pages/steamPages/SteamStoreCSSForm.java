package pages.steamPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import testAutoFramework.forms.BaseForm;

public class SteamStoreCSSForm extends BaseForm {

    protected SteamStoreCSSForm(By locator, String name) {
        super(locator, name);
    }

    public SteamStoreCSSForm(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    @FindBy(css = "div[class=supernav_container] a[href*=\"about\"]")
    WebElement steamAboutButton;

    public void clickSteamAboutBtn() {
        steamAboutButton.click();
    }

    @FindBy(css = "div[class='online_stat']:first-child")
    WebElement onlineStatInOnlineLabel;

    public long getOnlineStatInOnlineLabel(){
        return Long.parseLong(onlineStatInOnlineLabel.getText().replaceAll("[^0-9]", ""));
    }

    @FindBy(css = "div[class='online_stat']:last-child")
    WebElement onlineStatInGameLabel;

    public long getOnlineStatInGameLabel(){
        return Long.parseLong(onlineStatInGameLabel.getText().replaceAll("[^0-9]", ""));
    }

    @FindBy(css = "a.supernav[href$=\"header\"]")  // Неудачный локатор
    WebElement steamStoreButton;

    public void clickSteamStoreBtn(){
        steamStoreButton.click();
    }

}
