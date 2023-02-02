package tests.steamTests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.steamPages.SteamStoreCSSForm;
import tests.BaseTest;

import static testAutoFramework.utils.Constants.STEAM_URL;

public class SteamStoreCSSTest extends BaseTest {

    SteamStoreCSSForm steamStoreCSSForm = new SteamStoreCSSForm(driver);

    @Test(description = "Тест с CSS-локаторами")
    public void steamStoreCSSTest(){

        steamStoreCSSForm.open(STEAM_URL);

        steamStoreCSSForm.clickSteamAboutBtn();

        Assert.assertTrue(steamStoreCSSForm.getOnlineStatInOnlineLabel() >steamStoreCSSForm.getOnlineStatInGameLabel(),
                "In Game less then In Onkline");

        steamStoreCSSForm.clickSteamStoreBtn();

    }
}
