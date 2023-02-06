package pages.demoqaPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import testAutoFramework.forms.BaseForm;

public class UploadPage extends BaseForm {

    protected UploadPage(By locator, String name) {
        super(locator, name);
    }

    public UploadPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver,this);
    }

    @FindBy(css = "#uploadFile")
    WebElement uploadButton;

    public void clickUploadBtn(String str){
        uploadButton.sendKeys(str);
    }

    @FindBy(xpath = "//*[@class=\"category-cards\"]/div[1]")
    WebElement elementsLabel;

    public void clickElementsLbl(){
        elementsLabel.click();
    }

    @FindBy(css = ".menu-list li[id=item-7]")
    WebElement uploadElementsButton;

    public void clickUploadElementsCard(){
        uploadElementsButton.click();
    }

}
