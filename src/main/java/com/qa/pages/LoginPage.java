package com.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.base.TestBase;

public class LoginPage extends TestBase {

	@FindBy(xpath = "//input[@name = 'email']")
	WebElement emailId;

	@FindBy(xpath = "//input[@name = 'password']")
	WebElement password;

	@FindBy(xpath = "//div[contains(text(), 'Login')]")
	WebElement loginBtn;

	@FindBy(xpath = "//a[contains(text(), 'Forgot ')]")
	WebElement forgotPassword;

	@FindBy(xpath = "//a[contains(text(), 'Classic CRM')]")
	WebElement classicCRMLogin;

	@FindBy(xpath = "//a[contains(text(), 'Sign Up')]")
	WebElement singUpBtn;

	// Initializing the Page Objects:
	public LoginPage() {
		PageFactory.initElements(driver, this);
	}

	public String verifyTitleOfLoginPage() {
		return driver.getTitle();
	}

	public HomePage login(String em, String pwd) {

		emailId.sendKeys(em);
		password.sendKeys(pwd);
		loginBtn.click();

		return new HomePage();

	}

}
