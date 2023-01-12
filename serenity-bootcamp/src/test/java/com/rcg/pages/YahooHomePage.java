package com.rcg.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import net.thucydides.core.annotations.Step;

public class YahooHomePage {

	//BasePage bp;
	WebDriver driver;
	
	
	@Step
	public void openWebsite() {
		driver.get("https://sg.yahoo.com/");
	}
	
	
	@Step
	public void clickSignIn() {
		driver.findElement(By.className("_yb_1nrnc")).click();
	}
	
	
	
}
