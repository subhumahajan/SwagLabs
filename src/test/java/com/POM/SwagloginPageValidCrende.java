package com.POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

public class SwagloginPageValidCrende {

	WebDriver driver;

	@FindBy(id = "user-name")
	private WebElement username;

	@FindBy(id = "password")
	private WebElement password;

	@FindBy(id = "login-button")
	private WebElement loginbutton;

	public SwagloginPageValidCrende(WebDriver driver) {
		PageFactory.initElements(driver, this);
		this.driver = driver;
	}

	public void username() {
		username.sendKeys("standard_user");
	}

	public void password() {
		password.sendKeys("secret_sauce");
	}

	public void loginbutton() {
		loginbutton.click();
	}

	public void loginDashboardUrl() {
		Reporter.log(" CURRENT PAGE URL = "+driver.getCurrentUrl());
	}

	public void LoginDashboardTitle() {
		Reporter.log(" CURRENT PAGE TITLE = "+driver.getTitle());
	}

}
