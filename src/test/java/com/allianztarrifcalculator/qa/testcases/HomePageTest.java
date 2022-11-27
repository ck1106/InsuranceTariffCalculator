package com.allianztarrifcalculator.qa.testcases;

import com.allianztarrifcalculator.qa.base.Base;
import com.allianztarrifcalculator.qa.pageobjects.BasicDataPage;
import com.allianztarrifcalculator.qa.pageobjects.HomePage;
import com.allianztarrifcalculator.qa.utility.Log;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

/**
 * @author Bernard Akondoh
 * @Date 5/24/2022
 */
public class HomePageTest extends Base {
    HomePage homePage;
    BasicDataPage basicDataPage;


    public HomePageTest(){
        super();
    }


    @BeforeMethod
    public void setUp(){
    LaunchBrowser();
    basicDataPage = new BasicDataPage();
    homePage = new HomePage();
    }

    @Test
    public void verifyHomePageTitle(){
        String actualTitle = homePage.HomePageTitle();
        String expectedTitle = prop.getProperty("expectedTitleIndex");
        Assert.assertEquals(actualTitle, expectedTitle);
    }

    @Test
    public void VerifyLogoTest(){
        boolean flag = homePage.validateLogo();
        Assert.assertTrue(flag);
    }


    @Test
    public void ClickOnCalculateTariffNow(){
        Log.startTestCase("ClickOnCalculateTariffNow");
        homePage.acceptCookieNow();
        Log.info("Clicking on Calculate Now Button");
        basicDataPage = homePage.clickOnCalculateNow();
        Log.info("user successfully clicked on the button");
        Log.endTestCase("ClickOnCalculateTariffNow");

    }
}
