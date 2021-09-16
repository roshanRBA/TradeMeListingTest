package com.rba.TradeMeListing.steps;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.openqa.selenium.WebDriver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;

public class Hooks {

    @Value("${browser.maximized}")
    private boolean maximized;

    @Autowired
    private WebDriver driver;

    @Before
    public void setupSuite(){
        //maximize the browser if the system property: browser.maximized = true
        if (maximized){
            driver.manage().window().maximize();
        }
    }

    @After
    public void tearDownTest(Scenario scenario){
        //print the scenario name if failed
        if (scenario.isFailed()){
            System.out.println("Failed Scenario: " + scenario.getName());
        }
        //Quit the WebDriver after running the scenario
        driver.quit();

    }

}
