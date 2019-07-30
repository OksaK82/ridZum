package com.ridezum;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseTest {

    protected WebDriver driver;


    @Before
    public void setUp() {

        System.setProperty("webdriver.chrome.driver","/Users/oksanakim/Downloads/chromedriver");

        driver = new ChromeDriver();

        driver.manage().window().fullscreen();

        driver.get("https://ridezum.com/");

        System.out.println("Start");







    }



    @After
    public void quit() {

        System.out.println("Finish");

//        driver.quit();


    }

}
