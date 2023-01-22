package com.POM;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

public class SwagLabsDashboard {

	WebDriver driver;

	@FindBy(id = "user-name")
	private WebElement username;

	@FindBy(id = "password")
	private WebElement password;

	@FindBy(id = "login-button")
	private WebElement loginbutton;

	@FindBy(css = ".header_label> .app_logo")
	private WebElement Dashboardlogo;

	@FindBy(css = "inventory_item")
	private List<WebElement> InveteryList;

	@FindBy(css = "div.inventory_item_name")
	private List<WebElement> InveteryItemName;

	@FindBy(css = "div.inventory_item_price")
	private List<WebElement> InveteryItemPrice;

	// Constructor
	public SwagLabsDashboard(WebDriver driver) {
		PageFactory.initElements(driver, this);
		this.driver = driver;
	}

	// WebElement Actions

	public void username() {
		username.sendKeys("standard_user");
	}

	public void password() {
		password.sendKeys("secret_sauce");
	}

	public void loginbutton() {
		loginbutton.click();
	}

	public void getDashboardUrl() {
		Reporter.log(" CURRENT PAGE URL = "+driver.getCurrentUrl());
	}

	public void getDashboardTitle() {
		Reporter.log(" CURRENT PAGE TITLE = "+driver.getTitle());
	}

	public boolean getDashboardLogo() {
		return Dashboardlogo.isDisplayed();
	}

	public void getInveteryList() {

		for (int i = 0; i < InveteryItemName.size(); i++) {
			Reporter.log(" Item Name[" + i + "] : " + InveteryItemName.get(i).getText() + " : ItemPrice : "
					+ InveteryItemPrice.get(i).getText());
		}

	}

}
