package com.allianztarrifcalculator.qa.pageobjects;

import com.allianztarrifcalculator.qa.actiondriver.action;
import org.openqa.selenium.support.PageFactory;

/**
 * @author Bernard Akondoh
 * @Date 5/24/2022
 */
public class HomePage extends HomePageObjects {


    //Creating constructors to initialize the WebElements
    public HomePage(){
        PageFactory.initElements(getDriver(), this);
    }

    //Validating the indexPage title
    public String HomePageTitle(){
      String title = action.getTitle();
      return title;
   }

    //Checking if the website logo is displayed
    public boolean validateLogo(){
        action.isDisplayed(logo);
        return true;
    }

    //click On Calculate Now returns BasicDataPage
    public BasicDataPage clickOnCalculateNow(){
        action.click(calculateNowBtn);
        return new BasicDataPage();
    }

    //Accepts all Cookies
    public void acceptCookieNow(){
        action.click(acceptcookie);
    }

}
