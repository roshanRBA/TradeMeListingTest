package com.rba.TradeMeListing.steps;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = {"src/test/java/com/rba/TradeMeListing/features"},
        glue = "com.rba.TradeMeListing.steps",
        plugin= {"pretty","html:target/site/cucumber-pretty","json:target/cucumber/cucumber.json"}
)
class TestRunner extends AbstractTestNGCucumberTests {

}
