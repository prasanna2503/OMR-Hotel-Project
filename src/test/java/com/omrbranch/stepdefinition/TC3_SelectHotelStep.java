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
		pom.getSelectHotelPage().saveLastHotelName();
		pom.getSelectHotelPage().saveLastHotelPrice();
	}
	
	@When("User select the last hotel and accept the alert")
	public void selectLastHotelAndAcceptAlert() {
		pom.getSelectHotelPage().selectLastHotel();
	}
	
	@Then("User should verify after select success message {string}")
	public void vefirySelectSuccessMsg(String expHotelNameText) {
		String actHotelNameText = pom.getBookHotelPage().bookHotelText();
		boolean contains = actHotelNameText.contains(expHotelNameText);
		Assert.assertTrue(contains);
		System.out.println(actHotelNameText);
//		String actselectHotelText = pom.getSelectHotelPage().selectHotelText();
//		Assert.assertEquals("Verify Select Hotel Text", expHotelNameText, actselectHotelText);
//		System.out.println(actselectHotelText);
	}

	@When("User save the second from last hotel name and hotel price")
	public void saveSecondHotelAndPriceFromLast() {
		pom.getSelectHotelPage().saveLastSecondHotelNameAndPrice();
	}
	
	@When("User select the second from last hotel and accept the alert")
	public void selectSecondLastHotelAcceptAlert() {
		pom.getSelectHotelPage().selectSecondLastHotel();
	}

	@When("User save the first hotel name and hotel price")
	public void saveFirsHotelNameAndPrice() {
		pom.getSelectHotelPage().saveFirstHotelNameAndPrice();
	}
	
	@When("User select the first hotel and accept the alert")
	public void selectFirstHotelAndAcceptAlert() {
		pom.getSelectHotelPage().selectFirstHotel();
	}








}
