package com.POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

public class SwagLabsAddToCard {

	WebDriver driver;

	@FindBy(id = "user-name")
	private WebElement username;

	@FindBy(id = "password")
	private WebElement password;

	@FindBy(id = "login-button")
	private WebElement loginbutton;

	@FindBy(id = "item_5_title_link")
	private WebElement AddToCardItemName;

	@FindBy(id = "add-to-cart-sauce-labs-fleece-jacket")
	private WebElement AddToCard;

	public SwagLabsAddToCard(WebDriver driver) {
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

	public void AddToCard() {
		Reporter.log(" ADD to card Item is = " + AddToCardItemName.getText());
		AddToCard.click();
	}
}
