package com.qa.testCases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.base.TestBase;
import com.qa.pages.BasePage;
import com.qa.pages.HomePage;
import com.qa.pages.LoginPage;

public class LoginPageTest extends TestBase {

	BasePage basePage;
	LoginPage loginPage;
	HomePage homePage;

	public LoginPageTest() {
		super();

	}

	@BeforeMethod
	public void setUp() {
		initialization();
		basePage = new BasePage();
		loginPage = new LoginPage();
	}

	@Test(priority = 1)
	public void loginPageTitleTest() {

		String titleOfLoginpage = loginPage.verifyTitleOfLoginPage();
		Assert.assertEquals(titleOfLoginpage, properties.getProperty("loginPageTitle"));

	}

	@Test(priority = 0)
	public void loginButtonTest() {
		basePage.clickOnLoginBtn();
	}

	@Test(priority = 2)
	public void loginTest(){
		basePage.clickOnLoginBtn();
		homePage = loginPage.login(properties.getProperty("userName"), properties.getProperty("password"));
	}
	
	@AfterMethod
	public void tearDown() {
		 teardown();

	}

}
