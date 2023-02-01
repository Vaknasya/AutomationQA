package tests.demoqaTests;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import pages.demoqaPages.WebTablesPage;
import tests.BaseTest;
import testAutoFramework.models.WebTablesTestPersonData;
import testAutoFramework.utils.Constants;


public class WebTablesTest extends BaseTest {

    private WebTablesPage webTablesForm = new WebTablesPage(driver);
    JavascriptExecutor js = (JavascriptExecutor) driver;

    @DataProvider(name = "webTablesPageTestDataProvider")
    public Object[][] userDetails() {

        return new Object[][]{
                {new WebTablesTestPersonData("Jessy", "Popkorn", "heel@mail.ru", "25", "2500", "B2B")},
                {new WebTablesTestPersonData("Makaron", "Ssosiskami", "hefl@mail.ru", "20", "2000", "E2B")},
                {new WebTablesTestPersonData("Jessyoooook", "Popkor231321n", "he12312321el@mail.ru", "235", "25002", "B2Beeee")}
        };

    }

    @Test(dataProvider = "webTablesPageTestDataProvider")
    public void webTablesPageTest(WebTablesTestPersonData personData) {

        webTablesForm.open(Constants.DEMOQA_URL);
        js.executeScript("window.scrollBy(0, 250)");

        webTablesForm.clickElementsCard();
        js.executeScript("window.scrollBy(0, 100)");

        webTablesForm.clickWebTablesLabel();

        webTablesForm.clickAddNewRecordBtn();
        // Assert

        webTablesForm.sendUserData(
                personData.getFirstName(),
                personData.getLastName(),
                personData.getEmail(),
                personData.getAge(),
                personData.getSalary(),
                personData.getDepartment()
        );

        webTablesForm.clickSubmitBtn();

        // List<WebElement> usersData = webTablesForm.getTableContentList();

    }

}
