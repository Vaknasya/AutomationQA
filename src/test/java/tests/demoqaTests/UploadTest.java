package tests.demoqaTests;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;
import pages.demoqaPages.UploadPage;
import tests.BaseTest;

import java.time.Duration;

import static testAutoFramework.utils.Constants.DEMOQA_URL;

public class UploadTest extends BaseTest {

    UploadPage uploadPage = new UploadPage(driver);
    JavascriptExecutor js = (JavascriptExecutor) driver;

    @Test
    public void uploadFileTest() {

        uploadPage.open(DEMOQA_URL);

        uploadPage.clickElementsLbl();
        js.executeScript("window.scrollBy(0, 250)");
        uploadPage.clickUploadElementsCard();


        uploadPage.clickUploadBtn("C:\\Users\\Ася(Любимый енотик)\\Downloads");
    }

}
