package com.rba.TradeMeListing.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.springframework.stereotype.Component;

@Component
public class SingleListing extends BasePage {

    //the first car which is not in the slider
    @FindBy(how= How.XPATH, using= "//tg-icon[@name='vehicle-odometer']")
    private WebElement kilometers;

    @FindBy(how= How.XPATH, using= "//tg-icon[@name='vehicle-car']")
    private WebElement body;

    @FindBy(how= How.XPATH, using= "//tg-icon[@name='vehicle-seat']")
    private WebElement seats;

    @FindBy(how= How.XPATH, using= "//tm-vehicle-attributes//span[contains(text(),'Number plate:')]")
    private WebElement numberPlate;


    public Boolean isNumberPlateShown(){
        return isElementDisplayed(numberPlate);
    }

    public Boolean isSeatsCountShown(){
        return isElementDisplayed(seats);
    }

    public Boolean isKilometersShown(){
        return isElementDisplayed(kilometers);
    }

    public Boolean isBodyTypeShown(){
        return isElementDisplayed(body);
    }



}
