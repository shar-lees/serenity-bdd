package com.rcg.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import net.thucydides.core.annotations.Step;

public class YahooLogInPage {

	BasePage bp;
	WebDriver driver;
	
	@Step
	public void enterUsername(String uname) {
		driver.findElement(By.xpath("//input[@id = 'login-username']")).sendKeys(uname);
	}
	
	@Step
	public void clickNextBtn() {
		driver.findElement(By.id("login-signin")).click();
	}
	
	@Step
	public void enterPass(String pass) {
		driver.findElement(By.xpath("//input[@id = 'login-passwd']")).sendKeys(pass);
	}
	
	@Step
	public void clickSignIn() {
		bp.clickNextBtn();
	}
	
	@Step
	public void verify() {
		bp.verifyLog();
	}
}
