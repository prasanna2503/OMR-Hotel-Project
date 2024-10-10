package com.omrbranch.pages;

import java.awt.AWTException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.omrbranch.baseclass.BaseClass;

public class LoginPage extends BaseClass {
	
	public LoginPage() {
		
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="email")
	private WebElement emailTxtBox;
	
	@FindBy(id="pass")
	private WebElement passwordTxtBox;
	
	@FindBy(xpath="//button[@value='login']")
	private WebElement loginBtn;
	
	@FindBy(xpath="//div[@id='errorMessage']//b")
	private WebElement errorMsgText;

	public WebElement getEmailTxtBox() {
		return emailTxtBox;
	}

	public WebElement getPasswordTxtBox() {
		return passwordTxtBox;
	}

	public WebElement getLoginBtn() {
		return loginBtn;
	}
	
	public WebElement getErrorMsgText() {
		return errorMsgText;
	}

	
	// When User login "<userName>" and "<password>"
	
	public void login(String username,String password) {
		
		elementSendKeys(emailTxtBox, username);
		elementSendKeys(passwordTxtBox, password);
		elementClick(loginBtn);
	}
	
	public void loginWithEnterKey(String username,String password) throws AWTException {
		
		elementSendKeys(emailTxtBox, username);
		elementSendKeys(passwordTxtBox, password);
		pressEnter();
	}
	
	public String loginInvalidMsgText() {
		String loginErrorMsgText = elementGetText(errorMsgText);
		String replace = loginErrorMsgText.replace("Click here to reset your password", "");
		System.out.println(replace);
		return loginErrorMsgText;
	}
}

