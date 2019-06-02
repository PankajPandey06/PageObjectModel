package com.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.base.TestBase;

public class BasePage extends TestBase {

	@FindBy(xpath = "//a[contains(text(),'Sign Up')]")
	WebElement signUpBtn;

	@FindBy(xpath = "//span[contains(text(),'Log In')]")
	WebElement loginBtn;

	public BasePage() {
		PageFactory.initElements(driver, this);
	}

	public boolean validateSignUpbutton() {

		return signUpBtn.isDisplayed();

	}

	public boolean validateLoginButton() {

		 return loginBtn.isDisplayed();
	}

}
