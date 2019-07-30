package com.ridezum;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class ApplicationPage extends BasePage {

    public ApplicationPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(css = "input[name=\"name\"]")
    private WebElement inputFullNameField;

    @FindBy(css = "input[name=\"email\"]")
    private WebElement inputEmailField;

    @FindBy(css = "input[name=\"phone\"]")
    private WebElement inputPhoneField;

    @FindBy(css = "input[name=\"org\"]")
    private WebElement inputCompanyField;

    @FindBy(css = "input[name=\"urls[LinkedIn]\"]")
    private WebElement inputURLLinkedInField;

    @FindBy(css = "textarea[name=\"comments\"]")
    private WebElement inputeCommentsField;

    @FindBy(css = "select[name=\"eeo[gender]\"]")
    private WebElement selectGenderDropDownList;

    @FindBy(css = "select[name=\"eeo[race]\"]")
    private WebElement selectRaceDropDownList;

    @FindBy(css = "select[name=\"eeo[veteran]\"]")
    private WebElement selectVeteranStatusDropdownList;

    @FindBy(css = "button[type=\"submit\"]")
    private WebElement submitApplicationButton;

    @FindBy(css = ".error-message")
    private List<WebElement> errorMessage;

    public String getErrorMissageAttachResume() {
        return errorMessage.get(0).getText();
    }

    public void clickSubmitApplicationButton() {
        submitApplicationButton.click();
    }

    public void selectVeteranStatus() {
        wait.until(ExpectedConditions.elementToBeClickable(selectVeteranStatusDropdownList));
        Select select = new Select(selectVeteranStatusDropdownList);
        select.selectByVisibleText("I am not a veteran");
    }

    public void selectRace() {
        wait.until(ExpectedConditions.elementToBeClickable(selectRaceDropDownList));
        Select select = new Select(selectRaceDropDownList);
        select.selectByVisibleText("White (Not Hispanic or Latino)");
    }

    public void selectGender() {
        wait.until(ExpectedConditions.elementToBeClickable(selectGenderDropDownList));
        Select select = new Select(selectGenderDropDownList);
        select.selectByIndex(2);
    }

    public void inputComments(String comments){
        inputeCommentsField.sendKeys(comments);
    }

    public void inputFullName(String name) {
        inputFullNameField.sendKeys(name);
    }

    public void inputEmail(String email) {
        inputEmailField.sendKeys(email);
    }

    public void inputePhone(String phone) {
        inputPhoneField.sendKeys(phone);
    }

    public void inputCompany(String org) {
        inputCompanyField.sendKeys(org);
    }

    public void inputeURLLinkedIn(String urllinkedin) {
        inputURLLinkedInField.sendKeys(urllinkedin);
    }
}
