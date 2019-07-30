package com.ridezum;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

  public class JobRidezumPage extends BasePage{


       public JobRidezumPage(WebDriver driver){
       super(driver);

      }

       @FindBy(css = ".posting-btn-submit.template-btn-submit.hex-color")
       private List<WebElement> applyButtonJobRidezumPage;

       public JobDescriptionPage clickButtonApplyRidezumPage(){
           applyButtonJobRidezumPage.get(0).click();
           return new JobDescriptionPage(driver);
    }

}