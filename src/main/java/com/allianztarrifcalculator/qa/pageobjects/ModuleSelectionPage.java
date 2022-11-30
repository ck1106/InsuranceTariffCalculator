package com.allianztarrifcalculator.qa.pageobjects;

import com.allianztarrifcalculator.qa.actiondriver.action;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static com.allianztarrifcalculator.qa.utility.utility.tOut;

/**
 * @author Bernard Akondoh
 * @Date 5/25/2022
 */
public class ModuleSelectionPage extends action {

    @CacheLookup
    @FindBy(css = "[name='payment_schedule'] [name='chevron-down']")
    WebElement paymentScheduleDrpDwn;
    @CacheLookup
    @FindBy(css = "[nxvalue='M'] > .nx-dropdown-results__option")
    WebElement monthlySchedule;
    @CacheLookup
    @FindBy(css = "[nxvalue='V'] > .nx-dropdown-results__option")
    WebElement quarterlySchedule;
    @CacheLookup
    @FindBy(css = "[nxvalue='H']  > .nx-dropdown-results__option")
    WebElement halfYearSchedule;
    @CacheLookup
    @FindBy(css = "[nxvalue='J'] > .nx-dropdown-results__option")
    WebElement YearlySchedule;

    @CacheLookup
    @FindBy(css = "[formcontrolname='coverageSuggestion'] [name='chevron-down']")
    WebElement coverageSuggestionDrpDwn;
    @CacheLookup
    @FindBy(css = "nx-dropdown-item:nth-of-type(1) > .nx-dropdown-results__option")
    WebElement recommendedCov;

    @CacheLookup
    @FindBy(css = "[name='retention'] [name='chevron-down']")
    WebElement retentionDrpDwn;
    @CacheLookup
    @FindBy(css = "[nxvalue='150'] > .nx-dropdown-results__option")
    WebElement retentionValue150;
    @CacheLookup
    @FindBy( css = "[nxvalue='300'] > .nx-dropdown-results__option")
    WebElement retentionValue300;
    @CacheLookup
    @FindBy( css = "[nxvalue='500'] > .nx-dropdown-results__option")
    WebElement retentionValue500;
    @CacheLookup
    @FindBy( css = "[nxvalue='1000'] > .nx-dropdown-results__option")
    WebElement retentionValue1000;


    //Basis
    @CacheLookup
    @FindBy(css = "body.allianzde-defaultpage.defaultpage.page.basicpage div.root.responsivegrid:nth-child(1) div.aem-Grid.aem-Grid--12.aem-Grid--default--12 main.parsys.aem-GridColumn.aem-GridColumn--default--12 div.app-int-with-header.container div.c-app-int-with-header__app-wrapper.app-int div.l-grid__column-medium-12.offset-medium-0 div.ps20-calculator:nth-child(2) page-offer.ng-star-inserted:nth-child(2) div.offer-component div.c-step.c-step-blue.u-padding-top-none.table-section:nth-child(3) div.container.table-spacing div.u-padding-top-45.u-padding-bottom-45.ng-star-inserted div.container-wrapper nx-comparison-table.ng-tns-c141-8.ng-star-inserted div.ng-tns-c141-8.ng-star-inserted nx-comparison-table-flex-row.ng-tns-c141-8.is-header-row div.nx-comparison-table__row:nth-child(2) div.nx-comparison-table__cell.ng-star-inserted.is-selected:nth-child(2) div.nx-comparison-table__cell-content div.header-container.ng-star-inserted > p.product-price.nx-margin-bottom-0.ng-star-inserted:nth-child(2)")
    WebElement basis_amount;
    @CacheLookup
    @FindBy(xpath = "(//button[@id='product_HH001'])[1]")
    WebElement basisChooseBtn;
    @CacheLookup
    @FindBy(css = "[headers='nx-comparison-table-cell-0 nx-comparison-table-description-cell-1 nx-comparison-table-toggle-section-header-0'] > .nx-comparison-table__cell-content")
    WebElement sumInsuredBasic;
    @CacheLookup
    @FindBy(css = "[headers='nx-comparison-table-cell-0 nx-comparison-table-description-cell-2 nx-comparison-table-toggle-section-header-0'] > .nx-comparison-table__cell-content")
    WebElement valuableSumBasic;

    //Smart
    @CacheLookup
    @FindBy(xpath = "(//button[@id='product_HH002'])[1]")
    WebElement smartChooseBtn;
    @CacheLookup
    @FindBy(xpath = "//div[@class='nx-comparison-table__table-body ng-tns-c141-8']/div[1]//nx-comparison-table-flex-row[1]//div[3]//span[@class='ng-star-inserted']")
    WebElement sumInsuredSmart;
    @CacheLookup
    @FindBy( xpath= "//div[@class='nx-comparison-table__table-body ng-tns-c141-8']/div[1]//nx-comparison-table-flex-row[2]//div[@class='nx-comparison-table__cell ng-star-inserted is-selected']//span[@class='ng-star-inserted']")
    WebElement valuableSumSmart;

    //comfort
    @CacheLookup
    @FindBy(xpath = "//div[@class='nx-comparison-table__table-body ng-tns-c141-8']/div[1]//nx-comparison-table-flex-row[1]//div[@class='nx-comparison-table__cell is-selected ng-star-inserted']//span[@class='ng-star-inserted']")
    WebElement comfortSumInsured;
    @CacheLookup
    @FindBy(xpath = "//div[@class='nx-comparison-table__table-body ng-tns-c141-8']/div[1]//nx-comparison-table-flex-row[2]//div[4]//span[@class='ng-star-inserted']")
    WebElement comfortValuableSum;
    @CacheLookup
    @FindBy(xpath = "(//button[@id='product_HH003'])[1]")
    WebElement comfortChooseBtn;

    //Premium
    @CacheLookup
    @FindBy(xpath = "(//div[@class='nx-comparison-table__table-body ng-tns-c141-8']/div[1]//nx-comparison-table-flex-row[1]//div[@class='nx-comparison-table__cell is-selected ng-star-inserted']//span[@class='ng-star-inserted']")
    WebElement premiumSumInsured;
    @CacheLookup
    @FindBy(xpath ="//div[@class='nx-comparison-table__table-body ng-tns-c141-8']/div[1]//nx-comparison-table-flex-row[2]//div[@class='nx-comparison-table__cell is-selected ng-star-inserted']//span[@class='ng-star-inserted']")
    WebElement premiumValuableSum;
    @CacheLookup
    @FindBy(xpath = "(//button[@id='product_HH004'])[1]")
    WebElement premiumChooseBtn;


    //additional packages to be added
    @CacheLookup
    @FindBy(xpath = "(//button[@class='nx-button--small nx-button nx-button--primary'])[1]")
    WebElement ext_weather_protectionBtn;
    @CacheLookup
    @FindBy(xpath = "(//button[@role='checkbox'])[2]")
    WebElement bike_protectionBtn;
    @CacheLookup
    @FindBy(xpath = "(//button[@role='checkbox'])[3]")
    WebElement glass_house_hold_protectionBtn;
    @CacheLookup
    @FindBy(xpath = "[aria-labelledby='nxt-option-card-heading-3 nxt-stateful-button-label-5']")
    WebElement glass_building_protectionBtn;

    //Your tariff
    @CacheLookup
    @FindBy(css = ".is-summary .nxt-price-tag__value")
    WebElement tarrifBasisLabel;
    @CacheLookup
    @FindBy( css = "nxt-shopping-cart-row:nth-of-type(1) .nxt-price-tag__value ")
    WebElement tarrifAmountPerMonth;
    @CacheLookup
    @FindBy( css = "nxt-shopping-cart-row:nth-of-type(1) .nxt-price-tag__value ")
    WebElement tarrifAmountPerMonthSmart;
    @CacheLookup
    @FindBy( css = "nxt-shopping-cart-row:nth-of-type(1) .nxt-price-tag__value")
    WebElement tarrifAmountPerMonthComfort;
    @CacheLookup
    @FindBy( css = "nxt-shopping-cart-row:nth-of-type(1) .nxt-price-tag__value")
    WebElement tarrifAmountPerMonthPremium;
    @CacheLookup
    @FindBy(css = "nxt-shopping-cart-row:nth-of-type(2) .nxt-price-tag__value")
    WebElement additionalPack1amount;
    @CacheLookup
    @FindBy (css = "nxt-shopping-cart-row:nth-of-type(3) .nxt-price-tag__value")//(xpath = " //div[@class='nxt-price-tag__value ng-tns-c255-31']")
    WebElement additionalPackComfortamount;
    @CacheLookup
    @FindBy(css = " nxt-shopping-cart-row:nth-of-type(4) .nxt-price-tag__value")
    WebElement additionalPack3amount;
    @CacheLookup
    @FindBy(css = " nxt-shopping-cart-row:nth-of-type(5) .nxt-price-tag__value")
    WebElement additionalPack4amount;
    @CacheLookup
    @FindBy(css= ".is-summary .nxt-price-tag__value")
    WebElement totalContributionMonthly;
    @CacheLookup
    @FindBy(css= ".is-summary .nxt-price-tag__value")
    WebElement totalContributionMonthlySmart;
    @CacheLookup
    @FindBy(css= ".is-summary .nxt-price-tag__value")
    WebElement totalContributionMonthlyComfort;
    @CacheLookup
    @FindBy(css= ".is-summary .nxt-price-tag__value")
    WebElement totalContributionMonthlyPremium;
    @CacheLookup
    @FindBy(css = "[currencycode='€'] .nxt-price-tag__value")
    WebElement monthlyAmountTopRight;



    public ModuleSelectionPage(){
        PageFactory.initElements( getDriver(),this);
    }

    public void setDataModuleSelection_Basis(){
        click(paymentScheduleDrpDwn);
        click(monthlySchedule);
        click(coverageSuggestionDrpDwn);
        click(recommendedCov);
        click(retentionDrpDwn);
        click(retentionValue150);
        scrollNow();
        fluentWait (basisChooseBtn,tOut);
        action.click(basisChooseBtn);
        action.isEnabled(basisChooseBtn);
    }


    public void setCustomerDataModuleSelection_Comfort(){
        click(paymentScheduleDrpDwn);
        click(halfYearSchedule);
        click(coverageSuggestionDrpDwn);
        click(recommendedCov);
        click(retentionDrpDwn);
        click(retentionValue500);
        scrollNow();
        fluentWait(comfortChooseBtn,tOut);
        click(comfortChooseBtn);
        isEnabled(comfortChooseBtn);
    }


    public void setDataModuleSelection_Smart(){
        click(paymentScheduleDrpDwn);
        click(quarterlySchedule);
        click(coverageSuggestionDrpDwn);
        click(recommendedCov);
        click(retentionDrpDwn);
        click(retentionValue300);
        scrollNow();
        fluentWait(smartChooseBtn,tOut);
        click (smartChooseBtn);
        isEnabled(smartChooseBtn);
    }


    public void setCustomerDataModuleSelection_Premium(){
        click(paymentScheduleDrpDwn);
        click(YearlySchedule);
        click(coverageSuggestionDrpDwn);
        click(recommendedCov);
        click(retentionDrpDwn);
        click(retentionValue1000);
        scrollPrem();
        click( premiumChooseBtn);

    }

   /*===========================Get SumInsured+========================================================================*/

    public double getSumInsuredBasic(){
        setDataModuleSelection_Basis();
        scrollMed();
        fluentWait(sumInsuredBasic,10);
        String sumInsured_amount= sumInsuredBasic.getText();
        String actualSumInsured_amount= sumInsured_amount.replaceAll("[€]", "");
        double finalSumInsured_amount = Double.parseDouble(actualSumInsured_amount);
        return finalSumInsured_amount;
    }
    public double getSumInsuredSmart(){
        String sumInsured_amount= sumInsuredSmart.getText();
        String actualSumInsured_amount= sumInsured_amount.replaceAll("[€]", "");
        double finalSumInsured_amount = Double.parseDouble(actualSumInsured_amount);
        return finalSumInsured_amount;
    }

    public double getSumInsuredComfort(){
        setCustomerDataModuleSelection_Comfort();
        scrollMed();
        String sumInsured_amount= comfortSumInsured.getText();
        String actualSumInsured_amount= sumInsured_amount.replaceAll("[€]", "");
        double finalSumInsured_amount = Double.parseDouble(actualSumInsured_amount);
        return finalSumInsured_amount;
    }


   /*=============================Get SumInsured Calculator=============================================================*/

    public double getSumInsuredCalculator(String roomSize){
        double rate = Integer.parseInt(prop.getProperty("flatRate"));
        double sumInsured= (rate * Integer.parseInt(roomSize))/1000;
        return sumInsured;
    }


    public double getSumInsuredCalculatorPremium(String roomSize){
        double rate = Integer.parseInt(prop.getProperty("preRate"));
        double sumInsured= (rate * Integer.parseInt(roomSize))/1000;
        return sumInsured;
    }

    /*==========================Get Valuable Sum Calculator=============================================================*/

    public double getValuableSumCalculatorBasic(String percent){
        double percentage = Double.parseDouble(percent);
        double NewValuableSum= (percentage * getSumInsuredBasic());
        return NewValuableSum;
    }

    public double getValuableSumCalculatorSmart(String percent){
        setDataModuleSelection_Smart();
        scrollMed();
        double percentage = Double.parseDouble(percent);
        double NewValuableSum= (percentage * getSumInsuredSmart());
        return NewValuableSum;
    }


    public double getValuableSumCalculatorComfort(String percent, double SumInsuredCom){
        double percentage = Double.parseDouble(percent);
        double NewValuableSum= (percentage * SumInsuredCom);
        return NewValuableSum;
    }



    /*==========================Get Valuable Sum =============================================================*/

    public double getValuableSumBasic(){
        String valuableSum_amount = valuableSumBasic.getText();
        String actualValuableSum= valuableSum_amount.replaceAll("[€]", "");
        double finalValuableSum_amount= Double.parseDouble(actualValuableSum);
        return finalValuableSum_amount;
    }

    public double getValuableSumSmart(){
        String valuableSum_amount = valuableSumSmart.getText();
        String actualValuableSum= valuableSum_amount.replaceAll("[€]", "");
        double finalValuableSum_amount= Double.parseDouble(actualValuableSum);
        return finalValuableSum_amount;
    }

    public double getValuableSumComfort(){
        setCustomerDataModuleSelection_Comfort();
        scrollMed();
        String valuableSum_amount = comfortValuableSum.getText();
        String actualValuableSum= valuableSum_amount.replaceAll("[€]", "");
        double finalValuableSum_amount= Double.parseDouble(actualValuableSum);
        return finalValuableSum_amount;

    }

    public double getValuableSumPremium(){
        setCustomerDataModuleSelection_Premium();
        scrollMed();
        String valuableSum_amount = premiumValuableSum.getText();
        String actualValuableSum= valuableSum_amount.replaceAll("[€]", "");
        double finalValuableSum_amount= Double.parseDouble(actualValuableSum);
        return finalValuableSum_amount;
    }




    //check if additional package in Basic default is auto-added
    public boolean addAdditionalPackageBasicSmart(){
        setDataModuleSelection_Basis();
        scrollMedio();
        isEnabled(ext_weather_protectionBtn);
        return true;
    }

    //total monthly contribution overall
    public double getTotalMonthlyAmountTopRight(){
        String topRightMonthly_amount = monthlyAmountTopRight.getText();
        String actualTopRightMonthly_amount =topRightMonthly_amount.replaceAll("[^a-zA-Z0-9]", "");
        double finalTopRightMonthly_amount= Double.parseDouble(actualTopRightMonthly_amount);
        return finalTopRightMonthly_amount/100;
    }




    /*
    *  getTotalContributionPerMonthAmount
    *  getCal_TotalContributionPerMonthAmount
    *
    *
    * */


    public double getAdditonalModuleAmount_1(){
        fluentWait( additionalPack1amount, 8);
        String additionalModule1_amount = additionalPack1amount.getText();
        String actualAdditionalModule1_amount =additionalModule1_amount.replaceAll("[^a-zA-Z0-9]", "");
        double finalAdditionalModule1_amount= Double.parseDouble(actualAdditionalModule1_amount);
        return finalAdditionalModule1_amount/100;
    }
    public double getAdditonalModuleAmount_2() {
        String additionalModule2_amount = additionalPackComfortamount.getText();
        String actualAdditionalModule2_amount = additionalModule2_amount.replaceAll("[^a-zA-Z0-9]", "");
        double finalAdditionalModule2_amount = Double.parseDouble(actualAdditionalModule2_amount);
        return finalAdditionalModule2_amount/100;
    }
    public double getAdditonalModuleAmount_3() {
        String additionalModule3_amount = additionalPack3amount.getText();
        String actualAdditionalModule3_amount = additionalModule3_amount.replaceAll("[€]", "");
        double finalAdditionalModule3_amount = Double.parseDouble(actualAdditionalModule3_amount);
        return finalAdditionalModule3_amount;
    }

    public double getAdditonalModuleAmount_4() {
        String additionalModule4_amount = additionalPack4amount.getText();
        String actualAdditionalModule4_amount = additionalModule4_amount.replaceAll("[^a-zA-Z0-9]", "");
        double finalAdditionalModule4_amount = Double.parseDouble(actualAdditionalModule4_amount);
        return finalAdditionalModule4_amount;
    }

 /*--------------------------------------------------------------------------------------------------------------------*/

/*=================================== Amount per month without additional Packages=====================================*/

    public double getYourTarrifMonthlyAmountBasic(){
        String yourTarrifMonthly_amount = tarrifAmountPerMonth.getText();
        String actualTarrifMonthly_amount = yourTarrifMonthly_amount.replaceAll("[^a-zA-Z0-9]", "");
        double finalTarrifMonthly_amount= Double.parseDouble(actualTarrifMonthly_amount);
        return finalTarrifMonthly_amount/100;
    }

    public double getYourTarrifMonthlyAmountSmart(){
        String yourTarrifMonthly_amount = tarrifAmountPerMonthSmart.getText();
        String actualTarrifMonthly_amount = yourTarrifMonthly_amount.replaceAll("[^a-zA-Z0-9]", "");
        double finalTarrifMonthly_amount= Double.parseDouble(actualTarrifMonthly_amount);
        return finalTarrifMonthly_amount/100;
    }

    public double getYourTarrifMonthlyAmountComfort(){
        String yourTarrifMonthly_amount = tarrifAmountPerMonthComfort.getText();
        String actualTarrifMonthly_amount = yourTarrifMonthly_amount.replaceAll("[^a-zA-Z0-9]", "");
        double finalTarrifMonthly_amount= Double.parseDouble(actualTarrifMonthly_amount);
        return finalTarrifMonthly_amount/100;
    }

    public double getYourTarrifMonthlyAmountPremium(){
        String yourTarrifMonthly_amount = tarrifAmountPerMonthPremium.getText();
        String actualTarrifMonthly_amount = yourTarrifMonthly_amount.replaceAll("[^a-zA-Z0-9]", "");
        double finalTarrifMonthly_amount= Double.parseDouble(actualTarrifMonthly_amount);
        return finalTarrifMonthly_amount/100;
    }
/*.....................................................................................................................*/


/*=================================== Get Total Contribution per month value ==========================================*/

    public double getTotalContributionPerMonthAmountBasic() throws InterruptedException {
        setDataModuleSelection_Basis();
        scrollHigh();
        hold();
        String yourTotalContribution_amount = totalContributionMonthly.getText();
        String actualTotalContribution_amount = yourTotalContribution_amount.replaceAll("[^a-zA-Z0-9]", "");
        double finalTotalContribution_amount= Double.parseDouble(actualTotalContribution_amount );
        return finalTotalContribution_amount/100;
    }

    public double getTotalContributionPerMonthAmountSmart() throws InterruptedException {
        setDataModuleSelection_Smart();
        scrollHigh();
        hold();
        String yourTotalContribution_amount = totalContributionMonthlySmart.getText();
        String actualTotalContribution_amount = yourTotalContribution_amount.replaceAll("[^a-zA-Z0-9]", "");
        double finalTotalContribution_amount= Double.parseDouble(actualTotalContribution_amount );
        return finalTotalContribution_amount/100;
    }

    public double getTotalContributionPerMonthAmountComfort() throws InterruptedException {
        setCustomerDataModuleSelection_Comfort();
        scrollHigh();
        hold();
        String yourTotalContribution_amount = totalContributionMonthlyComfort.getText();
        String actualTotalContribution_amount = yourTotalContribution_amount.replaceAll("[^a-zA-Z0-9]", "");
        double finalTotalContribution_amount= Double.parseDouble(actualTotalContribution_amount );
        return finalTotalContribution_amount/100;
    }

    public double getTotalContributionPerMonthAmountPremium() throws InterruptedException {
        setCustomerDataModuleSelection_Premium();
        scrollHigh();
        hold();
        //fluentWait( totalContributionMonthly, 8);
        String yourTotalContribution_amount = totalContributionMonthlyPremium.getText();
        String actualTotalContribution_amount = yourTotalContribution_amount.replaceAll("[^a-zA-Z0-9]", "");
        double finalTotalContribution_amount= Double.parseDouble(actualTotalContribution_amount );
        return finalTotalContribution_amount/100;
    }


    }
















