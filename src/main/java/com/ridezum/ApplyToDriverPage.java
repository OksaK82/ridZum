package com.ridezum;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class ApplyToDriverPage extends BasePage {

    public ApplyToDriverPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(css = "#application_form_first_name")
    private WebElement firstNameField;

    @FindBy (css = "#application_form_last_name")
    private WebElement lastNameField;

    @FindBy(css = "#application_form_email")
    private  WebElement emailField;

    @FindBy(css = "#application_form_phone_number")
    private WebElement phoneNumberField;

    @FindBy(css = ".selected-flag")
    private WebElement ariaField;

    @FindBy(css = ".country")
    private List<WebElement>countryListbox;

    @FindBy(css = "#application_form_applicant_region")
    private WebElement regionField;

    @FindBy(css ="#application_form_zipcode")
    private WebElement zipCodeField;

    @FindBy(css = "#application_form_refcode")
    private WebElement refferalCodeField;

    @FindBy(css = ".main-menu__link")
     private List<WebElement> careersField;

     @FindBy(css = ".help-block")
     private List<WebElement> validError;

     public String getValidationEmailErrorNote() {
         //wait.until(ExpectedConditions.visibilityOfAllElements(validError));
         return validError.get(4).getText();

     }
     public String getValidationPhoneNumberErrorNote() {
         wait.until(ExpectedConditions.visibilityOfAllElements(validError));
         return validError.get(6).getText();
     }

     public void clickCareersField(int i) {
        wait.until(ExpectedConditions.visibilityOfAllElements(careersField));
        careersField.get(i).click();
     }

     public void inputZipCode(String zipCode) {
        wait.until(ExpectedConditions.elementToBeClickable(zipCodeField));
        zipCodeField.sendKeys(zipCode);

     }
     public void selectAreaListbox(int i) {
        wait.until(ExpectedConditions.visibilityOfAllElements(countryListbox));
        countryListbox.get(i).click();
     }
     public void inputRefferalCode(String refferalCode) {
        wait.until(ExpectedConditions.elementToBeClickable(refferalCodeField));
        refferalCodeField.sendKeys(refferalCode);
     }
     public void selectRegion(int i) {
        Select select = new Select(regionField);
        select.selectByIndex(i);

     }

    public void clickAriaField() {
        ariaField.click();
    }
    public void inputPhoneNumber(String phoneNumber) {
        wait.until(ExpectedConditions.elementToBeClickable(phoneNumberField));
        phoneNumberField.sendKeys(phoneNumber);

    }
    public void inputEmail(String email) {
        wait.until(ExpectedConditions.elementToBeClickable(emailField));
        emailField.sendKeys(email);

    }
    public void inputLastname(String lastName) {
        wait.until(ExpectedConditions.elementToBeClickable(lastNameField));
        lastNameField.sendKeys(lastName);

    }
    public void inputFirstName(String firstName) {
        wait.until(ExpectedConditions.elementToBeClickable(firstNameField));
        firstNameField.sendKeys(firstName);

    }
    public void selectRegionByName() {

        Select select = new Select(regionField);

        select.selectByValue("Dallas, Texas");
    }
    public void selectRegionByVisName() {

        Select select = new Select(regionField);

        select.selectByVisibleText("Miami, Florida");
    }
    public void clearEmailField() {
         emailField.clear();
    }
    public void clearPhoneField() {
         phoneNumberField.clear();
    }


}
