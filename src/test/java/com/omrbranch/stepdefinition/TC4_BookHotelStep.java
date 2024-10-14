package com.omrbranch.stepdefinition;

import java.util.List;
import java.util.Map;

import org.junit.Assert;

import com.omrbranch.baseclass.BaseClass;
import com.omrbranch.pagemanager.PageObjectManager;
import com.omrbranch.pages.SelectHotelPage;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class TC4_BookHotelStep extends BaseClass {
	PageObjectManager pom = new PageObjectManager();

	@When("User add Guest Details {string},{string},{string},{string} and {string}")
	public void user_add_guest_details_and(String userType,String userFirstName,String userLastName,String userMobile,String email) {
		pom.getBookHotelPage().addGuestDeatils(userType, userFirstName, userLastName, userMobile, email);
		//pom.getBookHotelPage().gstNextBtn();
	}

	@When("User should not Enter GST Details and Special request")
	public void user_should_not_enter_gst_details_and_special_request() {
		pom.getBookHotelPage().gstNextBtn();
		pom.getBookHotelPage().nextBtnAfterSplReq();
	}



	@When("User add GST Details {string},{string} and {string}")
	public void user_add_gst_details_and(String regNo,String companyName,String companyAddress) {
		pom.getBookHotelPage().addGstDetails(regNo, companyName, companyAddress);
		//pom.getBookHotelPage().nextBtnAfterSplReq();
		
	}

	@When("User should not add GST details")
	public void user_should_not_add_gst_details() {
		pom.getBookHotelPage().gstNextBtn();
	}



	@When("User should not Enter any special request")
	public void user_should_not_enter_any_special_request() {
		pom.getBookHotelPage().nextBtnAfterSplReq();
	}



	@When("User add Special Request {string}")
	public void user_add_special_request(String otherReq) {
		pom.getBookHotelPage().addSpecialReq(otherReq);
		pom.getBookHotelPage().nextBtnAfterSplReq();
	}
	@When("User enter payment details, procced with Card Type {string}")
	public void user_enter_payment_details_procced_with_card_type(String payment, io.cucumber.datatable.DataTable dataTable) throws InterruptedException {
		pom.getBookHotelPage().clickPaymentOption();
		pom.getBookHotelPage().addPaymentDetails(payment);
		List<Map<String,String>> asMaps = dataTable.asMaps();
		Map<String, String> map = asMaps.get(0);
		String selectCard = map.get("Select Card");
		selectOptionByText(pom.getBookHotelPage().getCardTppe(), selectCard);
		String cardNum = map.get("Card No");
		elementSendKeys(pom.getBookHotelPage().getCardNo(), cardNum);
		String nameOnCard = map.get("Card Name");
		elementSendKeys(pom.getBookHotelPage().getCardName(), nameOnCard);
		String cardMonth = map.get("Month");
		selectOptionByText(pom.getBookHotelPage().getCardMonth(), cardMonth);
		String cardYear = map.get("Year");
		selectOptionByText(pom.getBookHotelPage().getCardYear(), cardYear);
		String cardCvv = map.get("CVV");
		elementSendKeys(pom.getBookHotelPage().getCvv(), cardCvv);
		elementClick(pom.getBookHotelPage().getSubmitBtn());
		Thread.sleep(2000);
	}



	@When("User should verify after hotel booking success message {string} and save the order ID")
	public void user_should_verify_after_hotel_booking_success_message_and_save_the_order_id(String expBookingCofirmMsg) {
		String actBookingCofirmMsg = pom.getBookingConfirmPage().bookingCofirmMsg();
		boolean contains = actBookingCofirmMsg.contains(expBookingCofirmMsg);
		Assert.assertTrue(contains);
		System.out.println(pom.getBookingConfirmPage().getOrderID());
		
	}
	@Then("User should verify same selected Hotel is booked or not")
	public void user_should_verify_same_selected_hotel_is_booked_or_not() {
		String bookedHotelNameText = pom.getBookingConfirmPage().bookedHotelNameText();
		String lastHotelNameTextPrint = SelectHotelPage.lastHotelNameText;
		
		boolean contains = lastHotelNameTextPrint.contains(bookedHotelNameText);
		Assert.assertTrue(contains);
		System.out.println("Selected Hotel "+bookedHotelNameText +" is Booked");
	}
	@When("User click credit card")
	public void user_click_credit_card() {
		pom.getBookHotelPage().clickPaymentOption();
		
	}
	@When("User click submit without enetring payment details")
	public void user_click_submit_without_enetring_payment_details() {
		pom.getBookHotelPage().clickSubmitBtn();
	}
	@Then("User should verify after payment details error message {string},{string},{string},{string},{string} and {string}")
	public void user_should_verify_after_payment_details_error_message_and(String expPaymentTypeErrorMsg, String expCardTypeErrorMsg, String expCardNumErrorMsg, String expCardNameErrorMsg, String expCardMonthErrorMsg, String expCvvErrorMsg) {
		
		String actPaymentTypeErrorMsg = pom.getBookHotelPage().paymentTypeError();
		Assert.assertEquals("Verify paymentType Error", expPaymentTypeErrorMsg, actPaymentTypeErrorMsg);
		System.out.println(actPaymentTypeErrorMsg);
		
		String actCardTypeErrorMsg = pom.getBookHotelPage().cardTypeError();
		Assert.assertEquals("Verify cardType Error", expCardTypeErrorMsg, actCardTypeErrorMsg);
		System.out.println(actCardTypeErrorMsg);
		
		String actCardNumErrorMsg = pom.getBookHotelPage().cardNumError();
		Assert.assertEquals("Verify card Number Error", expCardNumErrorMsg, actCardNumErrorMsg);
		System.out.println(actCardNumErrorMsg);
		
		String actCardNameErrorMsg = pom.getBookHotelPage().cardNameError();
		Assert.assertEquals("Verify card Name Error", expCardNameErrorMsg, actCardNameErrorMsg);
		System.out.println(actCardNameErrorMsg);
		
		String actcardMonthErrorMsg = pom.getBookHotelPage().cardMonthError();
		Assert.assertEquals("Verify card Month Error", expCardMonthErrorMsg, actcardMonthErrorMsg);
		System.out.println(actcardMonthErrorMsg);
		
		String actCvvErrorMsg = pom.getBookHotelPage().cvvError();
		Assert.assertEquals("Verify cvv Error", expCvvErrorMsg, actCvvErrorMsg);
		System.out.println(actCvvErrorMsg);
		
	}

	@When("User enter upi details {string} and click submit")
	public void user_enter_upi_details_and_click_submit(String upiIdText) {
		pom.getBookHotelPage().addUpiDetails(upiIdText);
	}

	@When("User click upi")
	public void user_click_upi() {
		pom.getBookHotelPage().clickUpiBtn();
	}
	
	@Then("User should verify after payment details error message {string}")
	public void user_should_verify_after_payment_details_error_message(String expInvalidUpiErrorMsg) {
		String actInvalidUpiErrorMsg = pom.getBookHotelPage().upiError();
		Assert.assertEquals("Verify UPI Id", expInvalidUpiErrorMsg, actInvalidUpiErrorMsg);
		System.out.println(actInvalidUpiErrorMsg);
	}








}
