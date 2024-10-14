package com.omrbranch.stepdefinition;

import org.junit.Assert;

import com.omrbranch.pagemanager.PageObjectManager;
import com.omrbranch.pages.BookHotelPage;
import com.omrbranch.pages.BookingConfirmPage;
import com.omrbranch.pages.MyBookingPage;
import com.omrbranch.pages.SelectHotelPage;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class TC5_ChangeBookingStep {
	
	PageObjectManager pom = new PageObjectManager();
	
	@When("User navigate to My Booking page")
	public void user_navigate_to_my_booking_page() throws InterruptedException {
		pom.getBookingConfirmPage().navigateMyBookingPage();
		
	}
	@Then("User should verify after navigate to My Booking page success message as {string}")
	public void user_should_verify_after_navigate_to_my_booking_page_success_message_as(String expBookingsText) {
		String actBookingsText = pom.getMyBookingPage().bookingsText();
		expBookingsText="Bookings";
		boolean contains = actBookingsText.contains(expBookingsText);
		Assert.assertTrue(contains);
		System.out.println(actBookingsText);
	}
	@When("User search the Order ID")
	public void user_search_the_order_id() throws InterruptedException {
		pom.getMyBookingPage().insertOrderId();
	}
	@Then("User should verify same booked Order ID is present or not")
	public void user_should_verify_same_booked_order_id_is_present_or_not() {
		String orderIdVerificationText = pom.getMyBookingPage().orderIdVerification();
		String orderIdNumber = BookingConfirmPage.orderIdNumber;
		boolean contains = orderIdVerificationText.contains(orderIdNumber);
		Assert.assertTrue(contains);
		System.out.println(orderIdNumber);
	}
	@Then("User should verify same booked Hotel Name is present or not")
	public void user_should_verify_same_booked_hotel_name_is_present_or_not() {
		String bookedHotelNameText = pom.getMyBookingPage().bookedHotelNameVerification();
		String lastHotelNameText = SelectHotelPage.lastHotelNameText;
		boolean contains = lastHotelNameText.contains(bookedHotelNameText);
		Assert.assertTrue(contains);
		System.out.println(bookedHotelNameText);
	}
	@Then("User should verify same booked Hotel Price is present or not")
	public void user_should_verify_same_booked_hotel_price_is_present_or_not() {
		String bookedHotelPrice = pom.getMyBookingPage().bookedHotelPrice();
		String lastPrice = SelectHotelPage.lastPrice;
		boolean equals = bookedHotelPrice.equals(lastPrice);
		System.out.println(bookedHotelPrice);
	}
	@When("User edit the Check-in Date {string}")
	public void user_edit_the_check_in_date(String CheckInDate) throws InterruptedException {
		pom.getMyBookingPage().modifyCheckInDate(CheckInDate);
	}
	@Then("User should verify after modify check-in date success message {string}")
	public void user_should_verify_after_modify_check_in_date_success_message(String expUpdateSuccessfulMsg) {
		String actUpdateSuccessfulMsg = pom.getMyBookingPage().updateSuccess();
		Assert.assertEquals("Verify Succcessful Message", expUpdateSuccessfulMsg, actUpdateSuccessfulMsg);
		System.out.println(actUpdateSuccessfulMsg);
	}

	@When("User search the Order ID {string}")
	public void user_search_the_order_id(String Id) {
		pom.getMyBookingPage().searchOrderId(Id);
	}
	
	@When("User edit the Check-in Date for the first displayed Order ID {string}")
	public void user_edit_the_check_in_date_for_the_first_displayed_order_id(String modifyCheckInDate) {
		pom.getMyBookingPage().firstHotelEditCheckIn(modifyCheckInDate);
	}

	@When("User edit the Check-in Date for the last displayed Order ID {string}")
	public void user_edit_the_check_in_date_for_the_last_displayed_order_id(String modifyCheckInDate) {
		pom.getMyBookingPage().lastHotelEditCheckIn(modifyCheckInDate);
	}










}
