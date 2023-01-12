package com.rcg.steps;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import junit.framework.Assert;
import net.thucydides.core.annotations.Managed;

import net.serenitybdd.core.pages.PageObject;

public class LoginToYahoo extends PageObject {

	@Managed
	WebDriver driver;
	
	//YahooHomePage hm;
	//YahooLogInPage lp;
	
	
	
	
	
	@Given("open the yahoo website on browser")
	public void open_the_yahoo_website_on_browser() {
		driver.get("https://sg.yahoo.com/");
	}
	
	@When("user clicks the signin button")
	public void user_clicks_the_signin_button(){
		driver.findElement(By.className("_yb_1nrnc")).click();
	}
	
	@And("user enters username {string} and click next button")
	public void user_enters_username_and_click_next_button(String uName){
		driver.findElement(By.xpath("//input[@id = 'login-username']")).sendKeys(uName);
		driver.findElement(By.id("login-signin")).click();
		
	
	}
	@And("user enters password {string} and click signin button")
	public void user_enters_password_and_click_signin_button(String passwd){
		driver.findElement(By.name("password")).sendKeys(passwd);
		driver.findElement(By.id("login-signin")).click();
	}
	
	@Then("user has logged in successfully")
	public void user_has_logged_in_successfully() {
		System.out.print("end");
	}
	



}


//https://github.com/johnpaulsalvador/serenetybdd-bootcamp.git