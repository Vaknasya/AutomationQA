package tafTests;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import testAutoFramework.browser.WebDriverSingleton;

public abstract class BaseTest {
    // переделать под конфиг и переименовать под BASE_URL
    protected static final String STEAM_URL = "//https://store.steampowered.com/";
    protected WebDriver driver = WebDriverSingleton.getDriver();

    protected BaseTest(){
        WebDriver driver = WebDriverSingleton.getDriver();
    }

    @BeforeTest
    protected void setupMethod() {
        driver.manage().window().maximize();
    }

    @AfterTest
    public void quitTheApp() {
        driver.quit();
    }


    // А здесь странный метод (реализовать геттер драйвера) чтобы заменить инициализацию сверху
    //   protected WebDriverSingleton getBrowser() {
    //   return getBrowser();
    // }

}
