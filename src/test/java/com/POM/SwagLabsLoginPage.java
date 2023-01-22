package com.POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SwagLabsLoginPage {

	WebDriver driver;

	@FindBy(css = "div.login_logo")
	private WebElement LoginLogo;

	@FindBy(css = ".bot_column")
	private WebElement loginPageLogo;

	@FindBy(id = "user-name")
	private WebElement username;

	@FindBy(id = "password")
	private WebElement password;

	@FindBy(id = "login-button")
	private WebElement loginbutton;

	public SwagLabsLoginPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		this.driver = driver;

	}

	public boolean SwagLoginLogo() {
		return LoginLogo.isDisplayed();
	}

	public boolean SwagloginPageLogo() {
		return loginPageLogo.isDisplayed();
	}

	public boolean SwagLoginusernameField() {
		return username.isDisplayed();
	}

	public boolean SwagLoginpassword() {
		return password.isDisplayed();
	}

	public boolean Swagloginbutton() {
		return loginbutton.isDisplayed();
	}

}
