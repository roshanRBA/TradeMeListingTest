package com.rba.TradeMeListing.steps;

import com.rba.TradeMeListing.pages.SearchResults;
import com.rba.TradeMeListing.pages.SingleListing;
import com.rba.TradeMeListing.pages.TradeMeMotorsPage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class CarListingSteps {

    @Autowired
    public TradeMeMotorsPage tmMotors;

    @Autowired
    public SearchResults searchResults;

    @Autowired
    public SingleListing singleListing;

    @Value("${app.url}")
    private String appUrl;

    @Given("^the user is on TradeMe Motors page$")
    public void user_is_on_trademe_motors_page() throws Throwable {
        tmMotors.navigate_to(appUrl);
    }

    @When("^the user searches a car providing some (.+)$")
    public void the_user_searches_a_car_providing_some(String keywords) throws Throwable {
        tmMotors.searchCars(keywords);
    }

    @And("^opens one of the listings$")
    public void opens_one_of_the_listings() throws Throwable {
        searchResults.selectRandomCar();
    }

    @Then("the car number plate is displayed")
    public void theCarNumberPlateIsDisplayed() {
        Assert.assertTrue(singleListing.isNumberPlateShown(),"Number plate is not present!");
    }

    @And("the odometer reading is displayed")
    public void theOdometerReadingIsDisplayed() {
        Assert.assertTrue(singleListing.isKilometersShown(), "Odometer reading is not present!");
    }

    @And("the body type of the car is displayed")
    public void theBodyTypeOfTheCarIsDisplayed() {
        Assert.assertTrue(singleListing.isBodyTypeShown(),"Body type is not present!");
    }

    @And("the seat count is displayed")
    public void theSeatCountIsDisplayed() {
        Assert.assertTrue(singleListing.isSeatsCountShown(),"Seat count is not present!");
    }
}


