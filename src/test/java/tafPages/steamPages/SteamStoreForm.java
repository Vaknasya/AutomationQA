package tafPages.steamPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import testAutoFramework.elements.clickableElements.Button;
import testAutoFramework.elements.clickableElements.Label;
import testAutoFramework.elements.clickableElements.TextBox;
import testAutoFramework.forms.BaseForm;

public class SteamStoreForm extends BaseForm {

    public SteamStoreForm(By locator, String name) {
        super(locator, name);
    }

    public SteamStoreForm(WebDriver instance) {
        super(instance);
    }

    // сделать фабрику элементов
    private final Button btnAboutSteam = new Button(By.xpath("//div[@class='supernav_container']//*[contains((@href), 'about')] "),
            "About Button");

    public void clickAboutBtn() {
        btnAboutSteam.click();
    }

    private final Label aboutMonitorLabel = new Label(By.xpath("//*[@id='about_monitor_video']"),
            "About Monitor Video");

    public boolean isAboutMonitorLabelDisplayed() {
        return aboutMonitorLabel.isDisplayed();
    }

    private final Button goToStoreButton = new Button(By.xpath("//div[@class='supernav_container']//a[contains((@data-tooltip-content), 'store')] "),
            "Go to the store page button");

    public void clickStoreBtn() {
        goToStoreButton.click();
    }

    public final Label onlinePlayersLabel = new Label(By.xpath("//div[contains((@class), 'gamers_online')]/parent::div"),
            "Online players count");

    public long getOnlinePlayerCount() {
        return Long.parseLong(onlinePlayersLabel.getText().replaceAll("[^0-9]", ""));
    }

    public final Label playersInGameCount = new Label(By.xpath("//div[contains((@class), 'gamers_in_game')]/parent::div"),
            "Players in gae count");

    public long getPlayersInGameCount() {
        return Long.parseLong(playersInGameCount.getText().replaceAll("[^0-9]", ""));
    }


}
