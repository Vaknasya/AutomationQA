package tests.steamTests;

import org.testng.annotations.Test;
import pages.steamPages.SteamNameForm;
import testAutoFramework.utils.Constants;
import tests.BaseTest;

public class SteamNameTest extends BaseTest {

    private SteamNameForm steamNameForm = new SteamNameForm(driver);

    @Test(description = "Этот тест на PageFactory")
    public void pageFactoryTest(){

        steamNameForm.open(Constants.STEAM_URL);

        steamNameForm.clickNewsBtn();
        steamNameForm.clickUncommingBtn();
    }
}
