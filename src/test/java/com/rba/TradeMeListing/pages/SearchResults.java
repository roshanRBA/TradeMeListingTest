package com.rba.TradeMeListing.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Random;

@Component
public class SearchResults extends BasePage {


    @FindBy(how= How.XPATH, using= "//div[@class='o-card']")
    private List<WebElement> carListFromFirstPage;

    public void selectRandomCar(){
        getRandomCar().click();
    }

    private WebElement getRandomCar(){
        //returns a random car from a list of cars appeared in the search result.
        Random rand = new Random();
        return (WebElement) carListFromFirstPage.get(rand.nextInt(carListFromFirstPage.size()));
    }



}
