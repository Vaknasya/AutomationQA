package tafTests.steamTests;

import org.testng.Assert;
import org.testng.annotations.Test;
import tafPages.steamPages.SteamStoreForm;
import tafTests.BaseTest;

public class storePageAboutPage extends BaseTest {

    @Test
    public void storePageAboutPageTest(){
        SteamStoreForm storeForm = new SteamStoreForm(driver);

        driver.get(STEAM_URL);
        storeForm.clickAboutBtn();
        Assert.assertTrue(storeForm.isAboutMonitorLabelDisplayed(), "The opened page is not About Steam page");

        storeForm.clickStoreBtn();





    }
}
