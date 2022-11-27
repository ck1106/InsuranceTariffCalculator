package com.allianztarrifcalculator.qa.pageobjects;

import com.allianztarrifcalculator.qa.actiondriver.action;
import com.allianztarrifcalculator.qa.base.Base;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import static com.allianztarrifcalculator.qa.utility.utility.tOut;

/**
 * @author Bernard Akondoh
 * @Date 5/24/2022
 */
public class BasicDataPage extends Base{

    @CacheLookup
    @FindBy(xpath = "//*[@formcontrolname='zip']")
    WebElement postcode;
    @CacheLookup
    @FindBy(xpath = "//nx-dropdown[@class='nx-dropdown ng-untouched ng-pristine ng-invalid']//nx-icon[@name='chevron-down']")
    WebElement streetDropDownLink;
    @CacheLookup
    @FindBy( xpath = "//span[.='Abtsleitenweg']")
    WebElement streetNameBasic;
    @CacheLookup
    @FindBy(css = "nx-dropdown-item:nth-of-type(1) .nx-dropdown-results__option-label")
    WebElement streetNameSmart;
    @CacheLookup
    @FindBy(css = "nx-dropdown-item:nth-of-type(3) .nx-dropdown-results__option-label > [_ngcontent-xsc-c156]")
    WebElement streetNameComfort;
    @CacheLookup
    @FindBy(css = "nx-dropdown-item:nth-of-type(4) .nx-dropdown-results__option-label > [_ngcontent-xsc-c156]")
    WebElement streetNamePremium;
    @CacheLookup
    @FindBy(xpath = "//*[@formcontrolname='streetNumber']")
    WebElement streetNumber;   //street number
    @CacheLookup
    @FindBy(xpath = "//input[@class='nowrap cdk-text-field-autofill-monitored c-input nx-input ng-untouched ng-pristine ng-invalid']")
    WebElement livingSpaceSize;
    @CacheLookup
    @FindBy(css = "[placeholder='TT.MM.JJJJ']")
    WebElement dateOfBirth;
    @CacheLookup
    @FindBy(css = "[for='nx-radio-6-input'] > .nx-radio__circle")
    WebElement radioHouseLocationDetached; //detached house
    @CacheLookup
    @FindBy(css = "[for='nx-radio-7-input'] > .nx-radio__circle")
    WebElement radioHouseLocationAttached;//apartment
    @CacheLookup

    @FindBy(css = "[for='nx-radio-5-input'] > .nx-radio__circle")
    WebElement NoDamageResponseBtn;
    @CacheLookup
    @FindBy(css = "[for='nx-radio-4-input'] > .nx-radio__circle")
    WebElement YesDamageResponseBtn;
    @CacheLookup
    @FindBy(css = "[formcontrolname='houseDamageCount'] .nx-stepper__input")
    WebElement houseDamageCount;
    @CacheLookup
    @FindBy(css = ".u-margin-top-md .nx-stepper__input")
    WebElement bikeTheftCount;
    @CacheLookup
    @FindBy(css = ".u-margin-none")
    WebElement calculateTariffBtn;


    // constructor (initializing webElements on this page using PageFactory)
    public BasicDataPage() {
        PageFactory.initElements(getDriver(), this);
    }

    public String getBasicDataPageTitle() throws InterruptedException {
        action.hold();
        String title = getDriver().getTitle();
        return title;
    }


    public ModuleSelectionPage setCustomerBasicInfo(String postNum, String streetNo, String spaceSizeNo, String DoB){
        action.fluentWait(getDriver(), postcode, tOut);
        action.type(postcode, postNum);
        action.click(getDriver(), streetDropDownLink);
        action.click(getDriver(), streetNameBasic);
        action.type(streetNumber, streetNo);
        action.type(livingSpaceSize, spaceSizeNo);
        action.type(dateOfBirth, DoB);
        action.click(getDriver(), radioHouseLocationDetached);
        action.click(getDriver(), NoDamageResponseBtn);
        action.click(getDriver(),calculateTariffBtn);
        return new ModuleSelectionPage();
    }


    public ModuleSelectionPage setCustomerSmartInfoSmart(String postNum, String streetNo, String spaceSizeNo, String DoB,String houseDamageCountNo,String bikeTheftCountNo){
        action.fluentWait(getDriver(), postcode, tOut);
        action.type(postcode, postNum);
        action.click(getDriver(), streetDropDownLink);
        action.click(getDriver(), streetNameSmart);
        action.type(streetNumber, streetNo);
        action.type(livingSpaceSize, spaceSizeNo);
        action.type(dateOfBirth, DoB);
        action.click(getDriver(), radioHouseLocationDetached);
        action.click(getDriver(), YesDamageResponseBtn);
        action.click(getDriver(),houseDamageCount);
        action.type(houseDamageCount,houseDamageCountNo);
        action.click(getDriver(), bikeTheftCount);
        action.type(bikeTheftCount, bikeTheftCountNo);
        action.click(getDriver(),calculateTariffBtn);
        return new ModuleSelectionPage();
    }

    public ModuleSelectionPage setCustomerBasicInfoComfort(String postNum, String streetNo, String spaceSizeNo, String DoB){
        action.fluentWait(getDriver(), postcode, tOut);
        action.type(postcode, postNum);
        action.click(getDriver(), streetDropDownLink);
        action.click(getDriver(), streetNameComfort);
        action.type(streetNumber, streetNo);
        action.type(livingSpaceSize, spaceSizeNo);
        action.type(dateOfBirth, DoB);
        action.click(getDriver(), radioHouseLocationAttached);
        action.click(getDriver(), NoDamageResponseBtn);
        action.click(getDriver(),calculateTariffBtn);
        return new ModuleSelectionPage();
    }

    public ModuleSelectionPage setCustomerBasicInfoPremium(String postNum, String streetNo, String spaceSizeNo, String DoB,String houseDamageCountNo,String bikeTheftCountNo){
        action.fluentWait(getDriver(), postcode, tOut);
        action.type(postcode, postNum);
        action.click(getDriver(), streetDropDownLink);
        action.click(getDriver(), streetNamePremium);
        action.type(streetNumber, streetNo);
        action.type(livingSpaceSize, spaceSizeNo);
        action.type(dateOfBirth, DoB);
        action.click(getDriver(), radioHouseLocationAttached);
        action.click(getDriver(), YesDamageResponseBtn);
        action.click(getDriver(),houseDamageCount);
        action.type(houseDamageCount,houseDamageCountNo);
        action.click(getDriver(), bikeTheftCount);
        action.type(bikeTheftCount, bikeTheftCountNo);
        action.click(getDriver(),calculateTariffBtn);
        return new ModuleSelectionPage();
    }
}
