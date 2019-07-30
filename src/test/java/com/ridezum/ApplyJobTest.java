package com.ridezum;

import org.junit.Assert;
import org.junit.Test;

import java.util.logging.Logger;

public class ApplyJobTest extends BaseTest {

    private static Logger log = Logger.getLogger(ApplyJobTest.class.getName());

    private HomePage homePage;
    private CareerPage careerPage;
    private JobRidezumPage jobRidezumPage;
    private ApplyToDriverPage applyToDriverPage;
    private JobDescriptionPage jobDescriptionPage;
    private ApplicationPage applicationPage;

    @Test
    public void testApplyJob() {

        homePage = new HomePage(driver);
        careerPage = homePage.clickCareerButton();

        //remember window(tab)before switch
        String windowHandBefore = driver.getWindowHandle();

        jobRidezumPage = careerPage.clickViewJobsField();

        //`switch to new window(tab)
        for (String winHandle: driver.getWindowHandles()) {
            driver.switchTo().window(winHandle);
        }

        //close current window(tab)

        jobDescriptionPage = jobRidezumPage.clickButtonApplyRidezumPage();

        jobDescriptionPage.clickApplyJobButtonJD();

        applicationPage = new ApplicationPage(driver);
        applicationPage.inputFullName("Tom Cruise");
        applicationPage.inputEmail("tcruise@gmail.com");
        applicationPage.inputePhone("3123456544");
        applicationPage.inputCompany("Paramount studios");
        applicationPage.inputeURLLinkedIn("https://www.youtube.com/watch?v=wb49-oV0F78");
        applicationPage.inputComments("President Trump drew a torrent of criticism from Democrats on Saturday over a series of Twitter messages aimed at U.S. Rep. Elijah Cummings, D-Md., and the Baltimore district that Cummings represents in Congress.");
        applicationPage.selectGender();
        applicationPage.selectRace();
        applicationPage.selectVeteranStatus();
        applicationPage.clickSubmitApplicationButton();

        String errorMessage = applicationPage.getErrorMissageAttachResume();
        log.info(errorMessage);
        Assert.assertEquals("✱ Please attach a resume", errorMessage);


        driver.quit();
        //driver.switchTo().window(windowHandBefore);

    }

}
