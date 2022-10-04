package tafTests;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import testAutoFramework.browser.WebDriverSingleton;

public abstract class BaseTest {
    // переделать под конфиг и переименовать под BASE_URL
    private static final String STEAM_URL = "//https://store.steampowered.com/";
    protected WebDriver driver = WebDriverSingleton.getDriver();

    protected BaseTest(){
        WebDriver driver = WebDriverSingleton.getDriver();
    }

    @BeforeMethod
    protected void setupMethod() {
        driver.get(STEAM_URL);
        driver.manage().window().maximize();
    }

    @AfterMethod
    public void quitTheApp() {
        driver.quit();
    }


    // А здесь странный метод (реализовать геттер драйвера) чтобы заменить инициализацию сверху
    //   protected WebDriverSingleton getBrowser() {
    //   return getBrowser();
    // }

}
