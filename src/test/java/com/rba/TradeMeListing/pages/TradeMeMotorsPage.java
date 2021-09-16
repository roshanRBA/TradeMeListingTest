package com.rba.TradeMeListing.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.springframework.stereotype.Component;

@Component
public class TradeMeMotorsPage extends BasePage{

    //----- WebElements from the Trade Me Motors page -----

    @FindBy (how= How.XPATH, using= "//tg-tab-heading[contains(text(),\"Used\")]")
    private WebElement btnUsedCars;

    @FindBy (how= How.XPATH, using= "//input[@name='keyword']")
    private WebElement inputKeyword;

    @FindBy (how= How.XPATH, using= "//button[@type='submit']")
    private WebElement btnSearch;


    public void searchCars(String keywords){
        btnUsedCars.click();
        inputKeyword.sendKeys(keywords);
        btnSearch.click();

    }




}
