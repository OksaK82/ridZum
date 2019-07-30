package com.ridezum;
import org.junit.Assert;
import org.junit.Test;


public class MainTest extends BaseTest {


    @Test
    public void testFirst() {

        String actualTitle = driver.getTitle();

        System.out.println(actualTitle);

        String expectedTitle = "Zūm | Your school’s one-stop partner for safe & reliable student transportation";

        Assert.assertEquals(expectedTitle, actualTitle);

    }
}



