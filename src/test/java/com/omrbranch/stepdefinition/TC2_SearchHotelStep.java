package com.omrbranch.stepdefinition;

import java.util.List;

import org.junit.Assert;

import com.omrbranch.pagemanager.PageObjectManager;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class TC2_SearchHotelStep {
	
	PageObjectManager pom = new PageObjectManager();

	@When("User search hotel {string},{string},{string},{string},{string},{string},{string} and {string}")
	public void user_search_hotel_and(String stateName,String cityName,String roomType,String checkInDate,
			String checkOutDate,String noOfRoom,String noOfAdults,String noOfChild) throws InterruptedException {
		
		pom.getSearchHotelPage().searchHotels(stateName,cityName, roomType, checkInDate,checkOutDate, noOfRoom, noOfAdults, noOfChild);
	}
	
	@Then("User should verify after search hotel success message {string}")
	public void searchHotelSuccessMsg(String expSelectHotelTxt) {
		String actselectHotelText = pom.getSelectHotelPage().selectHotelText();
		Assert.assertEquals("Select Hotel", expSelectHotelTxt, actselectHotelText);
	}
	

	@When("User search hotel {string},{string},{string},{string},{string} and {string}")
	public void searchHotelMandatory(String stateName,String cityName,String checkInDate,
			String checkOutDate,String noOfRoom,String noOfAdults) throws InterruptedException {
		
		pom.getSearchHotelPage().searchHotelWithMandatory(stateName, cityName, checkInDate, checkOutDate, noOfRoom, noOfAdults);
		
	}
	
	@Then("User click Search button")
	public void clickSearchButton() {
		pom.getSearchHotelPage().clickSearchButton();
	}
	
	@Then("User should verify after search hotel error message {string},{string},{string},{string},{string} and {string}")
	public void afterSearchHotelErrorMsg(String expStateErrorMsgText, String expCityErrorMsgText, String expCheckInErrorMsgText, String expCheckOuErrorMsgText, String expRoomErrorMsgText, String expAdultErrorMsgText) {
		
		//State Error
		String actStateErrorMsgText = pom.getSearchHotelPage().stateErrorMsgText();
		Assert.assertEquals("Please select state", expStateErrorMsgText, actStateErrorMsgText);
		
		//City Error
		String actCityErrorMsgText = pom.getSearchHotelPage().cityErrorMsgText();
		Assert.assertEquals("Please select city", expCityErrorMsgText, actCityErrorMsgText);
		
		//CheckIn Error  
		String actCheckInErrorMsgText = pom.getSearchHotelPage().checkInErrorMsgText();
		Assert.assertEquals("Please select Check-in date", expCheckInErrorMsgText, actCheckInErrorMsgText);
		
		//CheckOut Error
		String actCheckOutErrorMsgText = pom.getSearchHotelPage().checkOutErrorMsgText();
		Assert.assertEquals("Please select Check-out date", expCheckOuErrorMsgText, actCheckOutErrorMsgText);
		
		//No.Of Rooms Error
		String actRoomErrorMsgText = pom.getSearchHotelPage().roomErrorMsgText();
		Assert.assertEquals("Please select no. of rooms", expRoomErrorMsgText, actRoomErrorMsgText);
		
		//No.Of Adults Error
		String actAdultErrorMsgText = pom.getSearchHotelPage().adultErrorMsgText();
		Assert.assertEquals("Please select no. of adults", actRoomErrorMsgText, actAdultErrorMsgText);
		
		
	}
	

	@When("User click sort from low to high")
	public void clickSortLowToHigh() throws InterruptedException {
		pom.getSelectHotelPage().clickLowToHigh();
	}

	@Then("User should verify after sorting that price are listed from low to high")
	public void user_should_verify_after_sorting_that_price_are_listed_from_low_to_high() {
		 pom.getSelectHotelPage().allHotelPricesSort();
		
		//String actinvalidMsgText = pom.getLoginPage().loginInvalidMsgText();
		//boolean contains = actinvalidMsgText.contains(expLoginErrorMsgTxt);
		//Assert.assertTrue(contains);
	}
	

	@When("User click sort from Descending order")
	public void clickSortDescendingOrder() {
		pom.getSelectHotelPage().clickDescendingOrder();
	}
	
	@Then("User should verify after sorting that name in Descending order")
	public void user_should_verify_after_sorting_that_name_in_descending_order() {
		pom.getSelectHotelPage().allHotelNames();
	}
	

	@When("User click Suite room type")
	public void user_click_suite_room_type() {
	}
	
	@Then("User should verify after sorting that Suite room type is listed")
	public void user_should_verify_after_sorting_that_suite_room_type_is_listed() {
	}
	
	@Then("User should verify the header contains {string}")
	public void user_should_verify_the_header_contains(String string) {
	}





















}
