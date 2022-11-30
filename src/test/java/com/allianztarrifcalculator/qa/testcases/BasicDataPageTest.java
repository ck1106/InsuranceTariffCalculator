package com.allianztarrifcalculator.qa.testcases;

import com.allianztarrifcalculator.qa.base.Base;
import com.allianztarrifcalculator.qa.dataprovider.dataprovider;
import com.allianztarrifcalculator.qa.pageobjects.BasicDataPage;
import com.allianztarrifcalculator.qa.pageobjects.HomePage;
import com.allianztarrifcalculator.qa.pageobjects.ModuleSelectionPage;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

/**
 * @author Bernard Akondoh
 * @Date 5/25/2022
 */
public class BasicDataPageTest extends Base {
    HomePage homePage;
    BasicDataPage basicDataPage;
    ModuleSelectionPage moduleSelectionPage;


    public BasicDataPageTest(){
        super();
    }


    // Launches browser and executes before every Method in the class
    @BeforeMethod
    public void setUp(){
        LaunchBrowser();

        homePage = new HomePage(); // HomePage object
        basicDataPage = new BasicDataPage();// Basic Data page object
        moduleSelectionPage = new ModuleSelectionPage();// Module selection page object
        homePage.acceptCookieNow();//  Accepts all cookies
        basicDataPage = homePage.clickOnCalculateNow();// Clicks on clickOnCalculateNow button and returns Basic DataPage
    }


    @Test(dataProvider = "basicdataprovider", dataProviderClass = dataprovider.class)
    public void VerifySetCustomerBasicInfo(String postNum,	String streetNum,  String spaceSize, String DOB) {
        moduleSelectionPage = basicDataPage.setCustomerBasicInfo(postNum, streetNum, spaceSize, DOB);
    }

    @Test(enabled = false)
    public void verifyBasicDataPageTitle() throws InterruptedException {
        String actualTitle = basicDataPage.getBasicDataPageTitle();
        String expectedTitle = prop.getProperty("expectedTitleBasic");
        Assert.assertEquals(actualTitle, expectedTitle);
    }



}
