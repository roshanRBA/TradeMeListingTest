package com.rba.TradeMeListing.steps;

import io.cucumber.java.After;
import io.cucumber.java.Scenario;
import org.openqa.selenium.WebDriver;
import org.springframework.beans.factory.annotation.Autowired;

public class Hooks {

    @Autowired
    private WebDriver webDriver;



    @After
    public void TearDownTest(Scenario scenario){
        if (scenario.isFailed()){
            // A screenshot can be taken. haven't included since it's out of scope
            System.out.println("Failed Scenario: " + scenario.getName());
        }
        webDriver.quit();
    }

}
