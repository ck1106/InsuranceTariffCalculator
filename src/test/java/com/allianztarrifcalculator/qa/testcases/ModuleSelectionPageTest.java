package com.allianztarrifcalculator.qa.testcases;

import com.allianztarrifcalculator.qa.base.Base;
import com.allianztarrifcalculator.qa.pageobjects.BasicDataPage;
import com.allianztarrifcalculator.qa.pageobjects.HomePage;
import com.allianztarrifcalculator.qa.pageobjects.ModuleSelectionPage;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.text.DecimalFormat;
import java.text.NumberFormat;

/**
 * @author Bernard Akondoh
 * @Date 5/26/2022
 */
public class ModuleSelectionPageTest extends Base {
    HomePage homePage;
    BasicDataPage basicDataPage;
    ModuleSelectionPage moduleSelectionPage;

    public ModuleSelectionPageTest() {
        super();
    }

    // Launches browser and executes before every Method in the class
    @BeforeMethod
    public void setUp() {
    LaunchBrowser();

    homePage = new HomePage();
    basicDataPage = new BasicDataPage();
    moduleSelectionPage = new ModuleSelectionPage();
    homePage.acceptCookieNow();
    basicDataPage = homePage.clickOnCalculateNow();
    moduleSelectionPage = basicDataPage.setCustomerBasicInfo(
            prop.getProperty("BasicPostCodeNumber"),
            prop.getProperty("BasicStreetNumber"),
            prop.getProperty("BasicSpaceSizeNumber"),
            prop.getProperty("BasicDateOfBirth"));

    }


    /*
    * BASIC PACKAGE TEST (user sample data and verification for the Basic product)
    * ----------------------------------------------------------------------------
    * verifySetDataModuleSelection_Basis()
    * verifySumInsuredBasic()
    * verifyValuableSumBasic()
    * verifyAddAdditionalPackBasis()
    * verifyTotalContributionPerMonthBasis()
    * ----------------------------------------------------------------------------
    * */

    @Test
    public void verifySetDataModuleSelection_Basis() {
        moduleSelectionPage.setDataModuleSelection_Basis();
    }

    @Test
    public void verifySumInsuredBasic(){
       double result = moduleSelectionPage.getSumInsuredBasic();
       double calculatorSumResult = moduleSelectionPage.getSumInsuredCalculator(prop.getProperty("BasicSpaceSizeNumber"));
       NumberFormat formatter = new DecimalFormat(prop.getProperty("format"));
       String newResult =formatter.format(result);
       String sumResult =formatter.format(calculatorSumResult);
       Assert.assertEquals(newResult, sumResult );
       if (result == calculatorSumResult ) {
           System.out.println("valid Basic SumInsured is " +sumResult + " €");
       } else{
           System.out.println("difference in value Basic SumInsured");
       }
   }

   @Test
   public void verifyValuableSumBasic(){
        double result = moduleSelectionPage.getValuableSumBasic();
        double calculatorVarResult= moduleSelectionPage.getValuableSumCalculatorBasic(prop.getProperty("ValSumPercentageBasic"));
        NumberFormat formatter = new DecimalFormat(prop.getProperty("format"));
        String newResult =formatter.format(result);
        String varResult =formatter.format(calculatorVarResult);
        Assert.assertEquals(newResult, varResult);
        System.out.println("valid Basic ValuableSum is: " +varResult + " €");
    }

   @Test
    public void verifyAddAdditionalPackBasis() {
       boolean flag = moduleSelectionPage.addAdditionalPackageBasicSmart();
       Assert.assertTrue(flag);
   }

   @Test
    public void verifyTotalContributionPerMonthBasis() throws InterruptedException {
       double contributionPerMonthAmount =moduleSelectionPage.getTotalContributionPerMonthAmountBasic();
       double tarrifMonthlyAmount= moduleSelectionPage.getYourTarrifMonthlyAmountBasic();
       double additonalModuleAmount_1= moduleSelectionPage.getAdditonalModuleAmount_1();

       double results = Double.sum(tarrifMonthlyAmount,additonalModuleAmount_1);
       double result1 = contributionPerMonthAmount;
       System.out.println("cont= "+"€" +result1+ "  results = " +"€"+results );
       Assert.assertEquals(result1, results);
       System.out.println("Total contribution per month tarrif: Basic is €" +results);

   }


    /*
     * Smart PACKAGE TEST (user sample data and verification for the Smart product)
     * ----------------------------------------------------------------------------
     * verifySetDataModuleSelection_Smart()
     * verifySumInsuredSmart()
     * verifyValuableSumSmart()
     * verifyAddAdditionalPackSmart()
     * verifyTotalContributionPerMonthSmart()
     * ----------------------------------------------------------------------------
     * */


    @Test
    public void verifySetDataModuleSection_Smart(){
        moduleSelectionPage.setDataModuleSelection_Smart();
    }

    @Test
    public void verifySumInsuredSmart(){
        double result = moduleSelectionPage.getSumInsuredSmart();
        double calculatorSumResult = moduleSelectionPage.getSumInsuredCalculator(prop.getProperty("BasicSpaceSizeNumber"));
        NumberFormat formatter = new DecimalFormat(prop.getProperty("format"));
        String newResult =formatter.format(result);
        String sumResult =formatter.format(calculatorSumResult);
        Assert.assertEquals(newResult, sumResult );
        if (result == calculatorSumResult ) {
            System.out.println("valid Smart SumInsured is " +sumResult + " €");
        } else{
            System.out.println("difference in value Smart SumInsured");
        }
    }

    @Test
    public void verifyValuableSumSmart(){
        //double result = moduleSelectionPage.getValuableSumSmart();
        double calculatorVarResult= moduleSelectionPage.getValuableSumCalculatorSmart(prop.getProperty("ValSumPercentageSmart"));
        double result = moduleSelectionPage.getValuableSumSmart();
        NumberFormat formatter = new DecimalFormat(prop.getProperty("format"));
        String newResult =formatter.format(result);
        String varResult =formatter.format(calculatorVarResult);
        Assert.assertEquals(newResult, varResult);
        System.out.println("valid Smart ValuableSum is: " +varResult + " €");
    }

    @Test
    public void verifyAddAdditionalPackSmart() {
        boolean flag = moduleSelectionPage.addAdditionalPackageBasicSmart();
        Assert.assertTrue(flag);
    }


    @Test
    public void verifyTotalContributionPerMonthSmart() throws InterruptedException {
        double contributionPerMonthAmount =moduleSelectionPage.getTotalContributionPerMonthAmountSmart();
        double tarrifMonthlyAmount= moduleSelectionPage.getYourTarrifMonthlyAmountSmart();
        double additonalModuleAmount_1= moduleSelectionPage.getAdditonalModuleAmount_1();

        double results = Double.sum(tarrifMonthlyAmount,additonalModuleAmount_1);
        double result1 = contributionPerMonthAmount;
        Assert.assertEquals(result1, results);
        System.out.println("Total contribution per month tarrif: Smart is €" +results);

    }

    /*
     * Comfort PACKAGE TEST (user sample data and verification for the Comfort product)
     * ----------------------------------------------------------------------------
     * verifySetDataModuleSelection_Comfort()
     * verifySumInsuredComfort()
     * verifyValuableSumComfort()
     * verifyTotalContributionPerMonthComfort()
     * ----------------------------------------------------------------------------
     * */

    @Test
    public void verifySetDataModuleSection_Comfort(){
        moduleSelectionPage.setCustomerDataModuleSelection_Comfort();
    }


    @Test
    public void verifySumInsuredComfort(){
        double result = moduleSelectionPage.getSumInsuredComfort();
        double calculatorSumResult = moduleSelectionPage.getSumInsuredCalculator(prop.getProperty("BasicSpaceSizeNumber"));
        NumberFormat formatter = new DecimalFormat(prop.getProperty("format"));
        String newResult =formatter.format(result);
        String sumResult =formatter.format(calculatorSumResult);
        Assert.assertEquals(newResult, sumResult );
        if (result == calculatorSumResult ) {
            System.out.println("valid Comfort SumInsured is " +sumResult + " €");
        } else{
            System.out.println("difference in value Comfort SumInsured");
        }
    }



    @Test
    public void verifyValuableSumComfort(){
        double result = moduleSelectionPage.getValuableSumComfort();
        double calculatorVarResult= moduleSelectionPage.getValuableSumCalculatorComfort(prop.getProperty("ValSumPercentageComfort"), Double.parseDouble(prop.getProperty("SumInsuredCom")));
        NumberFormat formatter = new DecimalFormat(prop.getProperty("format"));
        String newResult =formatter.format(result);
        String varResult =formatter.format(calculatorVarResult);
        Assert.assertEquals(newResult, varResult);
        System.out.println("valid Comfort ValuableSum is:   €" +varResult +" and " +newResult+  " €" );
    }


    @Test
    public void verifyTotalContributionPerMonthComfort() throws InterruptedException {
        double contributionPerMonthAmount =moduleSelectionPage.getTotalContributionPerMonthAmountComfort();
        double tarrifMonthlyAmount= moduleSelectionPage.getYourTarrifMonthlyAmountComfort();
        double additonalModuleAmount_1= moduleSelectionPage.getAdditonalModuleAmount_2();

        double results = Double.sum(tarrifMonthlyAmount,additonalModuleAmount_1);
        double result1 = contributionPerMonthAmount;
        Assert.assertEquals(result1, results);
        System.out.println("Total contribution per month tarrif: Comfort is €" +results);

    }

    /*
     * Premium PACKAGE TEST (user sample data and verification for the Comfort product)
     * ----------------------------------------------------------------------------
     * verifySetDataModuleSelection_Premium()
     * verifyTotalContributionPerMonthPremium()
     * ----------------------------------------------------------------------------
     * */


    @Test
    public void verifySetDataModuleSelection_Premium(){
        moduleSelectionPage.setCustomerDataModuleSelection_Premium();
    }

    @Test
    public void verifyTotalContributionPerMonthPremium() throws InterruptedException {
        double contributionPerMonthAmount =moduleSelectionPage.getTotalContributionPerMonthAmountPremium();
        double yourTarrifMonthlyAmountPremium= moduleSelectionPage.getYourTarrifMonthlyAmountPremium();

        Assert.assertEquals(contributionPerMonthAmount,yourTarrifMonthlyAmountPremium);
        System.out.println("Total contribution per month tarrif: Premium is €" +contributionPerMonthAmount);

    }
}