package com.omrbranch.stepdefinition;

import java.awt.AWTException;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.junit.Assert;
import org.openqa.selenium.WebElement;

import com.omrbranch.baseclass.BaseClass;
import com.omrbranch.pagemanager.PageObjectManager;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class TC1_LoginStep extends BaseClass {

	PageObjectManager pom = new PageObjectManager();

	@Given("User is on the OMR Branch hotel page")
	public void user_is_on_the_omr_branch_hotel_page() throws FileNotFoundException, IOException {
		browserLaunch(getPropertyFileValue("browser"));
		enterApplnUrl(getPropertyFileValue("url"));
		maximizeWindow();
		implicitWait();
	}

	@When("User login {string} and {string}")
	public void user_login_and(String username, String password) {
		pom.getLoginPage().login(username, password);
	}

	@Then("User should verify success message after login {string}")
	public void user_should_verify_success_message_after_login(String expLoginSuccessMsgTxt) {
		String actualLoginSuccessMsgText = pom.getSearchHotelPage().loginSuccessMsgText();

		Assert.assertEquals("verify after login success msg", expLoginSuccessMsgTxt, actualLoginSuccessMsgText);

	}

	@When("User login {string} and {string} with enter key")
	public void user_login_and_with_enter_key(String username, String password) throws AWTException {
		pom.getLoginPage().loginWithEnterKey(username, password);
	}

	@Then("User should verify error message after login {string}")
	public void user_should_verify_error_message_after_login(String expLoginErrorMsgTxt) {
		String actinvalidMsgText = pom.getLoginPage().loginInvalidMsgText();
		boolean contains = actinvalidMsgText.contains(expLoginErrorMsgTxt);
		Assert.assertTrue(contains);
	}

}
