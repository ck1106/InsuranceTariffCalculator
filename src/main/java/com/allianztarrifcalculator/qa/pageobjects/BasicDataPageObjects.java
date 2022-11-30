package com.allianztarrifcalculator.qa.pageobjects;

import com.allianztarrifcalculator.qa.base.Base;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

/**
 * @author time
 * @Date 11/27/2022
 */
public class BasicDataPageObjects extends Base {

    @CacheLookup
    @FindBy(xpath = "//input[@id='nx-input-0'][1]")
    WebElement postcode;
    @CacheLookup
    @FindBy(xpath = "//nx-dropdown[@class='nx-dropdown ng-pristine ng-invalid ng-touched']//nx-icon[@name='chevron-down']")
    WebElement streetDropDownLink;
    @CacheLookup
    @FindBy( xpath = "//span[normalize-space()='Abtsleitenweg'][1]")
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
    @FindBy(xpath = "//input[@id='nx-input-3']")
    WebElement streetNumber;   //street number
    @CacheLookup
    @FindBy(xpath = "//input[@id='nx-input-1']")
    WebElement livingSpaceSize;
    @CacheLookup
    @FindBy(css = "//input[@id='nx-input-2']")
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


}
