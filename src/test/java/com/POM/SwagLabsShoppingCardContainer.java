package com.POM;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;

public class SwagLabsShoppingCardContainer {

	WebDriver driver;

	@FindBy(css = ".shopping_cart_link > span")
	private WebElement ShopConatiner;

	@FindBy(css = "div.inventory_item_name")
	private WebElement ShoppingItemName;

	@FindBy(css = ".item_pricebar > .inventory_item_price")
	private WebElement ShoppingItemPrice;

	public SwagLabsShoppingCardContainer(WebDriver driver) {
		PageFactory.initElements(driver, this);
		this.driver = driver;

	}

	public void SwagLabsAddToCard() {
		SwagLabsAddToCard addToCard = new SwagLabsAddToCard(driver);
		addToCard.username();
		addToCard.password();
		addToCard.loginbutton();
		addToCard.AddToCard();
	}

	public void ShopConatiner() {
		ShopConatiner.click();
	}

	public void getShopConatinerURL() {
		Reporter.log(" CURRENT URL = " + driver.getCurrentUrl());
	}

	public void getShopConatinerTitle() {
		Reporter.log(" CURRENT PAGE TITLE = " + driver.getTitle());
	}

	public void getShoppingItemName() {
		Reporter.log(" ITEM NAME = " + ShoppingItemName.getText());
	}

	public void getShoppingItemPrice() {
		Reporter.log(" ITEM PRICE = " + ShoppingItemPrice.getText());
	}

}
