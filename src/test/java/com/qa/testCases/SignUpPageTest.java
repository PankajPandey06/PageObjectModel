package com.qa.testCases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.base.TestBase;
import com.qa.pages.BasePage;
import com.qa.pages.SignUpPage;

public class SignUpPageTest extends TestBase {

	BasePage basePage;
	SignUpPage signUpPage;

	public SignUpPageTest() {

		super();
	}

	@BeforeMethod
	public void setUp() {
		initialization();
		basePage = new BasePage();
		signUpPage = new SignUpPage();

	}

	@Test
	public void verifyTitleOfSignUpPageTest() {
		
		basePage.SignUpLandingpage();
		String actualTitle = signUpPage.verifyTitleOfSignUpPage();
		Assert.assertEquals(actualTitle, properties.getProperty("signUpPageTitle"));

	}

	@AfterMethod
	public void tearDown() {

		teardown();

	}

}
