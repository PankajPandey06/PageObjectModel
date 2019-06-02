package com.qa.testCases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.base.TestBase;
import com.qa.pages.BasePage;

public class BasePageTest extends TestBase {

	BasePage basePage;

	public BasePageTest() {

		super();
	}

	@BeforeMethod
	public void setUp() {
		initialization();
		basePage = new BasePage();

	}

	@Test(priority = 1)
	public void validateSignUpButtonTest() {

		boolean signUpBtnFlag = basePage.validateSignUpbutton();
		Assert.assertTrue(signUpBtnFlag);

	}

	@Test(priority = 2)
	public void validateLoginButtonTest() {

		boolean loginBtnFlag = basePage.validateLoginButton();
		Assert.assertTrue(loginBtnFlag);
	}

	@AfterMethod
	public void tearDown() {

		teardown();

	}

}