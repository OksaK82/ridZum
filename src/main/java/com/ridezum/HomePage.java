package com.ridezum;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.util.List;

public class HomePage  extends BasePage{

    public HomePage(WebDriver driver) {
        super(driver);
    }

        @FindBy(css =".m-btn.front-banner__btn")
        private List<WebElement> applyButtons;

        @FindBy(css = ".main-menu__link")
        private List<WebElement> careerButton;

        public CareerPage clickCareerButton() {
            careerButton.get(4).click();
            return new CareerPage(driver);
        }

        public ApplyToDriverPage clickApplyToDriveButton () {

            wait.until(ExpectedConditions.visibilityOfAllElements(applyButtons));

            applyButtons.get(1).click();

            return new ApplyToDriverPage(driver);
        }



    }

