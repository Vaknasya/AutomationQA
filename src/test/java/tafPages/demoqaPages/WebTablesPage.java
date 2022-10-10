package tafPages.demoqaPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import testAutoFramework.elements.clickableElements.Button;
import testAutoFramework.elements.clickableElements.Input;
import testAutoFramework.elements.clickableElements.Label;
import testAutoFramework.forms.BaseForm;

public class WebTablesPage extends BaseForm {

    protected WebTablesPage(By locator, String name) {
        super(locator, name);
    }

    public WebTablesPage(WebDriver driver) {
        super(driver);
    }

    Label elementsCard = new Label(By.xpath("//*[@class='category-cards']/div[1]"),
            "Element Card");

    public void clickElementsCard(){
        elementsCard.click();
    }

    Label webTablesLabel = new Label(By.xpath("//*[@class='accordion']/div[1]//li[@id='item-3']"),
            "Web Tables card label");

    public void clickWebTablesLabel(){
        webTablesLabel.click();
    }

    Button addNewRecordBtn = new Button(By.xpath("//button[@id='addNewRecordButton']"),
            "Add new Record Button");

    public void clickAddNewRecordBtn(){
        addNewRecordBtn.click();
    }

    Input userFirstNameInput = new Input(By.xpath("//input[@id='firstName']"), "Input first name");

    public void sendUserFirstName(String firstName){
        userFirstNameInput.sendKeys(firstName);
    }

    Input userLastNameInput = new Input(By.xpath("//input[@id='lastName']"), "Input last name");

    public void sendUserLastName(String lastName){
        userLastNameInput.sendKeys(lastName);
    }

    Input userEmailInput = new Input(By.xpath("//input[@id='userEmail']"), "Input user email address");

    public void sendUserEmail(String email){
        userEmailInput.sendKeys(email);
    }

    Input userAgeInput = new Input(By.xpath("//input[@id='age']"), "Input User Age");

    public void sendUserAge(String ageValue){
        userAgeInput.sendKeys(ageValue);
    }

    Input userSalaryInput = new Input(By.xpath("//input[@id='salary']"), "Input user salary");

    public void sendUserSalary(String salaryValue){
        userSalaryInput.sendKeys(salaryValue);
    }

    Input userDepartmentInput = new Input(By.xpath("//input[@id='department']"), "Input user department");

    public void sendUserDepartment(String departmentValue){
        userDepartmentInput.sendKeys(departmentValue);
    }

    Button submitRecordBtn = new Button(By.xpath("//button[@id='submit']"), "Submit record button");

    public void clicksubmitBtn(){
        submitRecordBtn.click();
    }



}
