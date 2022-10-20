package tafTests.demoqaTests;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import tafPages.demoqaPages.WebTablesPage;
import tafTests.BaseTest;
import testAutoFramework.models.BaseModel;
import testAutoFramework.models.Person;

public class WebTablesTest extends BaseTest {

    private WebTablesPage webTablesForm = new WebTablesPage(driver);




    @Test
    public void webTablesPageTest() {

        // использовать дата провайдер и начать использовать вейтеры

        webTablesForm.open(DEMOQA_URL);

        webTablesForm.clickElementsCard();

        webTablesForm.clickWebTablesLabel();

        webTablesForm.clickAddNewRecordBtn();
        // Assert

        // Label Elements //*[@class='category-cards']/div[1]
        // Label webTables  //*[@class='accordion']/div[1]//li[@id='item-3']
        // Button addNewRecord //button[@id='addNewRecordButton']

        // Input //input[@id='firstName']
        //        //input[@id='lastName']
        //          //input[@id='userEmail']
        //          //input[@id='age']
        //          //input[@id='salary']
        //          //input[@id='department']

        // Button submit //button[@id='submit']
        //


    }

}
