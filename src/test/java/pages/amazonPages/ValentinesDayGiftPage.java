package pages.amazonPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import testAutoFramework.forms.BaseForm;

public class ValentinesDayGiftPage extends BaseForm {

    protected ValentinesDayGiftPage(By locator, String name) {
        super(locator, name);
    }

    public ValentinesDayGiftPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    // necklace with fox

    @FindBy(css = "#twotabsearchtextbox")
    WebElement seacrhBox;

    public void enterSomeTextIntoSearchBox(String str){
        seacrhBox.sendKeys(str);
    }

    @FindBy(css = "#nav-search-submit-button")
    WebElement searchSubmitButton;

    public void clickSubmitSearchBtn(){
        searchSubmitButton.click();
    }

    @FindBy(css = "div[class*=\"s-visual-card-navigation-carousel-card-image-locator\"] img[alt*=\"Jewelry\"]")
    WebElement jewelryItemsImage;

    public void selectJewelryItems(){
        jewelryItemsImage.click();
    }

    @FindBy(css = "li[aria-label=\"Women\"] div[class*=\"a-checkbox\"]")
    WebElement checkBoxWomenSex;

    public void markSexCheckbox(){
        checkBoxWomenSex.click();
    }




}
