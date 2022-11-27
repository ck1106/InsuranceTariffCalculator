package com.allianztarrifcalculator.qa.pageobjects;

import com.allianztarrifcalculator.qa.actiondriver.action;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * @author Bernard Akondoh
 * @Date 5/24/2022
 */
public class HomePage extends action {
    @FindBy(id = "Content_LeadIn::Button::Jetzt-berechnen")
    WebElement calculateNowBtn; // jetzt berechnen btn

    @FindBy( id = "onetrust-accept-btn-handler")
    WebElement acceptcookie;

    @FindBy (xpath = "//*[@class='c-image']")
    WebElement logo; // company's logo

    //Creating constructors to initialize the WebElements
    public HomePage(){
        PageFactory.initElements(getDriver(), this);
    }

    //validating the indexPage title
   public String HomePageTitle(){
       getTitle(getDriver());
       return getTitle(getDriver());
   }

    //validating the websites logo
    public boolean validateLogo(){
        action.isDisplayed(getDriver(), logo);
        return true;
    }

    //
    public BasicDataPage clickOnCalculateNow(){
        action.click(getDriver(), calculateNowBtn);
        return new BasicDataPage();
    }

    public void acceptCookieNow(){
        action.click(getDriver(), acceptcookie);
    }
}
