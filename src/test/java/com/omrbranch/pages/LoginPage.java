package com.omrbranch.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.omrbranch.baseclass.BaseClass;

public class LoginPage extends BaseClass {
	
	public LoginPage() {
		
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="eamil")
	private WebElement emailTxtBox;
	
	@FindBy(id="pass")
	private WebElement passwordTxtBox;
	
	@FindBy(xpath="//button[@value='login']")
	private WebElement loginBtn;

	public WebElement getEmailTxtBox() {
		return emailTxtBox;
	}

	public WebElement getPasswordTxtBox() {
		return passwordTxtBox;
	}

	public WebElement getLoginBtn() {
		return loginBtn;
	}
	
	
}
