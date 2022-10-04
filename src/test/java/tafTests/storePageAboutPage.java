package tafTests;

import org.testng.annotations.Test;
import tafPages.SteamStoreForm;
import tafTests.BaseTest;

public class storePageAboutPage extends BaseTest {

    @Test
    public void storePageAboutPageTest(){
        SteamStoreForm storeForm = new SteamStoreForm(driver);

        driver.get(STEAM_URL);
        storeForm.clickAboutBtn();

    }
}
