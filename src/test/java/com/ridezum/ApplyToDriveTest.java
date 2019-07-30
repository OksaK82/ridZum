package com.ridezum;

import org.junit.Test;
import org.openqa.selenium.By;

import java.util.Random;

public class ApplyToDriveTest extends BaseTest {

    private HomePage homePage;
    private ApplyToDriverPage applyToDrivePage;
    private Random random;


    @Test
    public void testApplyToDrive() {

        homePage = new HomePage(driver);

        applyToDrivePage = new ApplyToDriverPage(driver);

        homePage.clickApplyToDriveButton();

        driver.switchTo().frame(driver.findElement(By.cssSelector(".iframe-container.m-banner-drive__iframe")));

        applyToDrivePage.inputFirstName("Olga");
        applyToDrivePage.inputLastname("Petrova");
        applyToDrivePage.inputEmail("kim2345.com");
        applyToDrivePage.inputPhoneNumber("1244555iuy");
       // applyToDrivePage.clickAriaField();

        //random = new Random();
        //int randomSelectRegion = random.nextInt(6);
        //applyToDrivePage.selectRegion(randomSelectRegion);

        //applyToDrivePage.selectRegionByName();

        applyToDrivePage.selectRegionByVisName();

       // Random random = new Random();
       // int randomCountryListbox = random.nextInt(245);
       // applyToDrivePage.selectAreaListbox(randomCountryListbox);


        //Random random = new Random();
        //int randomNumber = random.nextInt(7);
        //applyToDrivePage.clickAriaField();

        applyToDrivePage.inputZipCode("91381");
        applyToDrivePage.inputRefferalCode("123456gJYT766");

        driver.switchTo().defaultContent();
        applyToDrivePage.clickCareersField(4);








    }



}
