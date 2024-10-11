package com.omrbranch.stepdefinition;

import org.junit.Assert;

import com.omrbranch.baseclass.BaseClass;
import com.omrbranch.pagemanager.PageObjectManager;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class TC3_SelectHotelStep {
	
	PageObjectManager pom = new PageObjectManager();
	

	@When("User save the last hotel name and hotel price")
	public void saveLastHotelAndPrice() {
		pom.getSelectHotelPage().selectLastHotelNameAndPrice();
	}
	
	@When("User select the last hotel and accept the alert")
	public void selectLastHotelAndAcceptAlert() {
		pom.getSelectHotelPage().selectLastHotel();
	}
	
	@Then("User should verify after select success message {string}")
	public void user_should_verify_after_select_success_message(String expHotelNameText) {
		String actHotelNameText = pom.getBookHotelPage().bookHotelText();
		boolean contains = actHotelNameText.contains(expHotelNameText);
		Assert.assertTrue(contains);
	}

	@When("User save the second from last hotel name and hotel price")
	public void user_save_the_second_from_last_hotel_name_and_hotel_price() {
	}
	
	@When("User select the second from last hotel and accept the alert")
	public void user_select_the_second_from_last_hotel_and_accept_the_alert() {
	}

	@When("User save the first hotel name and hotel price")
	public void user_save_the_first_hotel_name_and_hotel_price() {
	}
	
	@When("User select the first hotel and accept the alert")
	public void user_select_the_first_hotel_and_accept_the_alert() {
	}








}
