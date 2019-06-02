package com.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.base.TestBase;

public class SignUpPage extends TestBase {

	@FindBy(xpath = "//input[@name = 'email']")
	WebElement emailId;

	@FindBy(xpath = "//input[@name = 'phone']")
	WebElement phone;

	@FindBy(xpath = "//input[@name = 'terms']")
	WebElement toc;

	@FindBy(xpath = "//input[@class= 'search']")
	WebElement dropDownCountry;

	@FindBy(xpath = "//div[@class= 'recaptcha-checkbox-checkmark']")
	WebElement captchaCheckbox;

	@FindBy(xpath = "//button[contains(text(), 'Sign Up')]")
	WebElement signUpButton;

	// Initializing the Page Objects:
	public SignUpPage() {
		PageFactory.initElements(driver, this);
	}

	public String verifyTitleOfSignUpPage() {
		return driver.getTitle();
	}

}
