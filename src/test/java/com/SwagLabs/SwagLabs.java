package com.SwagLabs;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.POM.SwagLabsAddToCard;
import com.POM.SwagLabsDashboard;
import com.POM.SwagLabsLoginPage;
import com.POM.SwagLabsShoppingCardContainer;
import com.POM.SwagloginPageValidCrende;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SwagLabs {
	WebDriver driver;

	@BeforeMethod
	public void SetUp() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.saucedemo.com/");
	}

	@Test(priority = 1)
	public void VerifyLoginPage() {
		SwagLabsLoginPage sl = new SwagLabsLoginPage(driver);

		Assert.assertTrue(sl.SwagLoginLogo());
		Assert.assertTrue(sl.SwagloginPageLogo());
		Assert.assertTrue(sl.SwagLoginusernameField());
		Assert.assertTrue(sl.SwagLoginpassword());
		Assert.assertTrue(sl.Swagloginbutton());
		Reporter.log(" LOgin Page Verifcation Functionality success ");
	}

	@Test(priority = 2)
	public void ValidLoginCredential() {
		SwagloginPageValidCrende sl = new SwagloginPageValidCrende(driver);

		sl.username();
		sl.password();
		sl.loginbutton();
		sl.loginDashboardUrl();
		sl.LoginDashboardTitle();
		Reporter.log(" Valid Login Credential Success ");
	}

	@Test(priority = 3)
	public void VerificationDashboard() {
		SwagLabsDashboard sl = new SwagLabsDashboard(driver);

		sl.username();
		sl.password();
		sl.loginbutton();
		sl.getDashboardUrl();
		sl.getDashboardTitle();
		Assert.assertTrue(sl.getDashboardLogo());
		sl.getInveteryList();
		Reporter.log(" Valid Dashboard Functionality Success");
	}

	@Test(priority = 4)
	public void AddToCardItem() {
		SwagLabsAddToCard sl = new SwagLabsAddToCard(driver);
		sl.username();
		sl.password();
		sl.loginbutton();
		sl.AddToCard();
		Reporter.log(" Add To Card Inventery Field Success ");
	}

	@Test(priority = 5)
	public void VerifyAddToCardItem() {
		SwagLabsShoppingCardContainer sl = new SwagLabsShoppingCardContainer(driver);
		sl.SwagLabsAddToCard();
		sl.ShopConatiner();
		sl.getShopConatinerURL();
		sl.getShopConatinerTitle();
		sl.getShoppingItemName();
		sl.getShoppingItemPrice();
		Reporter.log(" Add Card Item Same As Selected Item Name ");
	}

	@AfterMethod
	public void TearDown() throws InterruptedException {
		Thread.sleep(2000);
		driver.quit();
	}
}
