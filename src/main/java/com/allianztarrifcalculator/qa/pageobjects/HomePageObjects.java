package com.allianztarrifcalculator.qa.pageobjects;

import com.allianztarrifcalculator.qa.base.Base;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * @author time
 * @Date 11/27/2022
 */
public class HomePageObjects extends Base {
    @FindBy(css = "[data-component-id='root/stage/paragraphStageParsys/button_row/button-row-parsys/button_1992427019']")
    WebElement calculateNowBtn; // jetzt berechnen btn

    @FindBy( id = "onetrust-accept-btn-handler")
    WebElement acceptcookie; // accept all cookies

    @FindBy (xpath = "//*[@class='c-image']")
    WebElement logo; // company's logo
}
