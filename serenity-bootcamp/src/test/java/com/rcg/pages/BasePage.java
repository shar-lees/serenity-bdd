package com.rcg.pages;

import org.openqa.selenium.By;


import net.serenitybdd.core.pages.PageObject;


public class BasePage extends PageObject {

	
	
	public void openUrl() {
		//driver.get("https://sg.yahoo.com/");
	}
	
	
	public void clickSignInBtn() {
		
		$(By.className("_yb_1nrnc")).click();
	}
	
	public void enterUname() {
		$(By.xpath("//input[@id = 'login-username']")).type("nikole.santiago@yahoo.com");
	}
	
	public void clickNextBtn() {
		$(By.id("login-signin")).click();
	}
	
	public void enterPass() {
		$(By.xpath("//input[@id = 'login-passwd']")).type("redvelvet11");
	}
	
	public void verifyLog() {
		System.out.println(getDriver().getTitle());
	}
	
}
