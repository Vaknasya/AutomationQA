package tafTests.demoqaTests;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import tafPages.demoqaPages.WebTablesPage;
import tafTests.BaseTest;
import testAutoFramework.models.WebTablesTestPersonData;

public class WebTablesTest extends BaseTest {

    private WebTablesPage webTablesForm = new WebTablesPage(driver);

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

        webTablesForm.open(DEMOQA_URL);

        webTablesForm.clickElementsCard();

        webTablesForm.clickWebTablesLabel();

        webTablesForm.clickAddNewRecordBtn();
        // Assert

        webTablesForm.sendUserFirstName(personData.getFirstName());
        webTablesForm.sendUserLastName(personData.getLastName());
        webTablesForm.sendUserEmail(personData.getEmail());
        webTablesForm.sendUserAge(personData.getAge());
        webTablesForm.sendUserSalary(personData.getSalary());
        webTablesForm.sendUserDepartment(personData.getDepartment());

        webTablesForm.clickSubmitBtn();

    }

}
