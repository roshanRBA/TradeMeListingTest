package com.rba.TradeMeListing;

import com.rba.TradeMeListing.pages.TradeMeMotorsPage;
import org.openqa.selenium.WebDriver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.testng.AbstractTestNGSpringContextTests;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

@SpringBootTest
public class TradeMeCarListingTests extends AbstractTestNGSpringContextTests {

    @Autowired
    private WebDriver webDriver;

    @Autowired
    private TradeMeMotorsPage tmMotors;

    @Value("${app.url}")
    private String appUrl;

    @BeforeTest
    protected void setUpWebDriver(){


    }

    @Test
    public void testCarDetails(){
        tmMotors.searchCars("Mazda 3 2018");
    }


    @BeforeSuite(alwaysRun = true)
    @Override
    protected void springTestContextPrepareTestInstance() throws Exception {
        super.springTestContextPrepareTestInstance();
    }


}
