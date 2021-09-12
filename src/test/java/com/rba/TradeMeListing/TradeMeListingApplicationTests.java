package com.rba.TradeMeListing;

import com.rba.TradeMeListing.pages.TradeMeMotorsPage;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class TradeMeListingApplicationTests {

	@Autowired
	private TradeMeMotorsPage tmMotors;

	@Value("chrome,firefox,edge")
	private List<String> browsers;

	@Value("${app.url}")
	private String appUrl;

	@Autowired
	private WebDriver webDriver;



	@Test
	void searchCar() {

	}

}
