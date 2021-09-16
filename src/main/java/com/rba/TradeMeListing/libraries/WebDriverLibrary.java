package com.rba.TradeMeListing.libraries;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.concurrent.TimeUnit;

@Configuration
public class WebDriverLibrary {

    @Value("${implicitWaitTime}")
    private long waitTime;

    @Bean
    @ConditionalOnProperty(name="browser", havingValue = "chrome")
    public WebDriver getChromeDriver(){
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(waitTime, TimeUnit.SECONDS);
        return driver;
    }

    @Bean
    @ConditionalOnProperty(name="browser", havingValue = "firefox")
    public WebDriver getFirefoxDriver(){
        WebDriverManager.firefoxdriver().setup();
        WebDriver driver = new FirefoxDriver();
        driver.manage().timeouts().implicitlyWait(waitTime, TimeUnit.SECONDS);
        return driver;
    }

}
