package tafTests.steamTests;

import org.testng.Assert;
import org.testng.annotations.Test;
import tafPages.steamPages.SteamStoreForm;
import tafTests.BaseTest;

public class storePageAboutTest extends BaseTest {

    private SteamStoreForm storeForm = new SteamStoreForm(driver);

    @Test
    public void storePageAboutPageTest(){

        storeForm.open(STEAM_URL);
        Assert.assertTrue(storeForm.isHomePageGutterDisplayed(), "The page is opened is not STEAM_URL");

        storeForm.clickAboutBtn();
        Assert.assertTrue(storeForm.isAboutMonitorLabelDisplayed(), "The opened page is not About Steam page");

        Assert.assertTrue(storeForm.getOnlinePlayerCount() > storeForm.getPlayersInGameCount(),
                "Variables have different values because there are fewer players online for some reason");

        storeForm.clickStoreBtn();
        Assert.assertTrue(storeForm.isHomePageGutterDisplayed(), "The page is opened is not STEAM_URL");

    }
}
