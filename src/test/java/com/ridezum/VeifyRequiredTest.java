package com.ridezum;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;

public class VeifyRequiredTest  extends BaseTest {

        private HomePage homePage;
        private ApplyToDriverPage applyToDriverPage;


        @Test
        public void testVerifyRequiredFields() {

            homePage = new HomePage(driver);

            applyToDriverPage = new ApplyToDriverPage(driver);

            homePage.clickApplyToDriveButton();
            driver.switchTo().frame(driver.findElement(By.cssSelector(".iframe-container.m-banner-drive__iframe")));
            applyToDriverPage.inputFirstName("ooooo");
            applyToDriverPage.inputLastname("yyyyy");

            applyToDriverPage.inputEmail("yyyyyy");
            String emailErrorNote = applyToDriverPage.getValidationEmailErrorNote();
            Assert.assertEquals("Please enter a valid email address",emailErrorNote);
            applyToDriverPage.clearEmailField();
            applyToDriverPage.inputEmail("ajsgs@gmail.com");



            applyToDriverPage.inputPhoneNumber("uytvvbnn");
            String phoneErrorNote = applyToDriverPage.getValidationPhoneNumberErrorNote();
            Assert.assertEquals("The phone number is not valid",phoneErrorNote);
            applyToDriverPage.clearPhoneField();
            applyToDriverPage.inputPhoneNumber("12345455656");


        }
    }

