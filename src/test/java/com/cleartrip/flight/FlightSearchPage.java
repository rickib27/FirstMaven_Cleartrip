package com.cleartrip.flight;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.aventstack.extentreports.ExtentTest;
import com.cleartrip.utils.BasePage;

public class FlightSearchPage extends BasePage {

	public FlightSearchPage(WebDriver driver) {
		super(driver);
	}

	public void doSearch(String from, String to, ExtentTest log) {
		log.info("typing from");
		driver.findElement(By.xpath(prop.getProperty("flight_from"))).sendKeys(from);
		log.info("Waiting for Options & Selecting");

		driver.findElement(By.xpath("//p[contains(text(),'" + from + "')]")).click();
		log.info("typing to");

		driver.findElement(By.xpath(prop.getProperty("flight_to"))).sendKeys(to);
		log.info("Waiting for Options & Selecting");
		driver.findElement(By.xpath("//p[contains(text(),'" + to + "')]")).click();

		//driver.findElement(By.xpath("(//*[text()='30'])[2]")).click();
		log.info("Clicking on Search");

		driver.findElement(By.xpath("//body/div[@id='root']/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[7]/div[2]/button[1]")).click();
	}
}
