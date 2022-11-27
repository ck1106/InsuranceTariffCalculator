package com.allianztarrifcalculator.qa.testcases;

import com.allianztarrifcalculator.qa.base.Base;
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


    @BeforeMethod
    public void setUp(){
        LaunchBrowser();

        homePage = new HomePage();
        basicDataPage = new BasicDataPage();
        moduleSelectionPage = new ModuleSelectionPage();
        homePage.acceptCookieNow();
        basicDataPage = homePage.clickOnCalculateNow();
    }


    @Test
    public void VerifySetCustomerBasicInfo() {
        moduleSelectionPage = basicDataPage.setCustomerBasicInfo(
                prop.getProperty("BasicPostCodeNumber"),
                prop.getProperty("BasicStreetNumber"),
                prop.getProperty("BasicSpaceSizeNumber"),
                prop.getProperty("BasicDateOfBirth"));
    }

    @Test(enabled = false)
    public void verifyBasicDataPageTitle() throws InterruptedException {
        String actualTitle = basicDataPage.getBasicDataPageTitle();
        String expectedTitle = prop.getProperty("expectedTitleBasic");
        Assert.assertEquals(actualTitle, expectedTitle);
    }



}
