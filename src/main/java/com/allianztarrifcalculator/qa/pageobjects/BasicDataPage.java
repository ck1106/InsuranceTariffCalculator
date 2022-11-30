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
public class BasicDataPage extends BasicDataPageObjects{

    // constructor (initializing webElements on this page using PageFactory)
    public BasicDataPage() {
        PageFactory.initElements(getDriver(),this);
    }

    public String getBasicDataPageTitle() throws InterruptedException {
        action.hold();
        String title = getDriver().getTitle();
        return title;
    }


    public ModuleSelectionPage setCustomerBasicInfo(String postNum, String streetNo, String spaceSizeNo, String DoB){
        action.fluentWait( postcode,tOut);
        action.type(postcode, postNum);
        action.click(streetDropDownLink);
        action.click(streetNameBasic);
        action.type(streetNumber, streetNo);
        action.type(livingSpaceSize, spaceSizeNo);
        action.type(dateOfBirth, DoB);
        action.click(radioHouseLocationDetached);
        action.click(NoDamageResponseBtn);
        action.click(calculateTariffBtn);


        return new ModuleSelectionPage();


    }


    public ModuleSelectionPage setCustomerSmartInfoSmart(String postNum, String streetNo, String spaceSizeNo, String DoB,String houseDamageCountNo,String bikeTheftCountNo){
        action.fluentWait( postcode, tOut);
        action.type(postcode, postNum);
        action.click( streetDropDownLink);
        action.click( streetNameSmart);
        action.type(streetNumber, streetNo);
        action.type(livingSpaceSize, spaceSizeNo);
        action.type(dateOfBirth, DoB);
        action.click( radioHouseLocationDetached);
        action.click( YesDamageResponseBtn);
        action.click(houseDamageCount);
        action.type(houseDamageCount,houseDamageCountNo);
        action.click( bikeTheftCount);
        action.type(bikeTheftCount, bikeTheftCountNo);
        action.click(calculateTariffBtn);
        return new ModuleSelectionPage();
    }

    public ModuleSelectionPage setCustomerBasicInfoComfort(String postNum, String streetNo, String spaceSizeNo, String DoB){
        action.fluentWait( postcode, tOut);
        action.type(postcode, postNum);
        action.click( streetDropDownLink);
        action.click( streetNameComfort);
        action.type(streetNumber, streetNo);
        action.type(livingSpaceSize, spaceSizeNo);
        action.type(dateOfBirth, DoB);
        action.click( radioHouseLocationAttached);
        action.click( NoDamageResponseBtn);
        action.click(calculateTariffBtn);
        return new ModuleSelectionPage();
    }

    public ModuleSelectionPage setCustomerBasicInfoPremium(String postNum, String streetNo, String spaceSizeNo, String DoB,String houseDamageCountNo,String bikeTheftCountNo){
        action.fluentWait( postcode, tOut);
        action.type(postcode, postNum);
        action.click( streetDropDownLink);
        action.click( streetNamePremium);
        action.type(streetNumber, streetNo);
        action.type(livingSpaceSize, spaceSizeNo);
        action.type(dateOfBirth, DoB);
        action.click( radioHouseLocationAttached);
        action.click( YesDamageResponseBtn);
        action.click(houseDamageCount);
        action.type(houseDamageCount,houseDamageCountNo);
        action.click( bikeTheftCount);
        action.type(bikeTheftCount, bikeTheftCountNo);
        action.click(calculateTariffBtn);
        return new ModuleSelectionPage();
    }
}
