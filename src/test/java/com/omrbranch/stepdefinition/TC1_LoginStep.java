package com.omrbranch.stepdefinition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class TC1_LoginStep {
	

	@Given("User is on the OMR Branch hotel page")
	public void user_is_on_the_omr_branch_hotel_page() {
	}
	@When("User login {string} and {string}")
	public void user_login_and(String string, String string2) {
	}
	@Then("User should verify success message after login {string}")
	public void user_should_verify_success_message_after_login(String string) {
	}

	@When("User login {string} and {string} with enter key")
	public void user_login_and_with_enter_key(String string, String string2) {
	}

	@Then("User should verify error message after login {string}")
	public void user_should_verify_error_message_after_login(String string) {
	}








}
