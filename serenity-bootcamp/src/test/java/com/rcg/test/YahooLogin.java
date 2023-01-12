package com.rcg.test;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import junit.framework.Assert;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;

@RunWith(SerenityRunner.class)
public class YahooLogin {
	
	
	
	@Managed
	WebDriver driver;
	WebDriverWait wait;
	

	
	@Before
	public void openUrl() {
		driver.get("https://ph.search.yahoo.com/");
		driver.findElement(By.id("logo")).click();
		
	}
	
	@Test
	public void loginToYahoo() {
		driver.findElement(By.className("_yb_1nrnc")).click();
		driver.findElement(By.xpath("//input[@id = 'login-username']")).sendKeys("nikole.santiago@yahoo.com");
		driver.findElement(By.name("signin")).click();
		driver.findElement(By.xpath("//input[@id = 'login-passwd']")).sendKeys("redvelvet11");
		driver.findElement(By.name("verifyPassword")).click();
		
		
	}
	
	@After
	public void logoutYahoo() {
		driver.findElement(By.id("ybarAccountMenuOpener")).click();
		driver.findElement(By.linkText("Sign out")).click();
	
	}
	

}
