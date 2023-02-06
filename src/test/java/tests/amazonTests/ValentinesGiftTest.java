package tests.amazonTests;

import org.testng.annotations.Test;
import pages.amazonPages.ValentinesDayGiftPage;
import tests.BaseTest;

import static testAutoFramework.utils.Constants.AMAZON_URL;

public class ValentinesGiftTest extends BaseTest {

    ValentinesDayGiftPage valentinesDayGiftPage = new ValentinesDayGiftPage(driver);


    @Test
    public void valentinesDayGiftTest(){

        valentinesDayGiftPage.open(AMAZON_URL);

        valentinesDayGiftPage.enterSomeTextIntoSearchBox("valentines day gifts");
        valentinesDayGiftPage.clickSubmitSearchBtn();

        valentinesDayGiftPage.selectJewelryItems();

        valentinesDayGiftPage.markSexCheckbox();



    }
}

