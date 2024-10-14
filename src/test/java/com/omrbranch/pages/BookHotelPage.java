package com.omrbranch.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.omrbranch.baseclass.BaseClass;

public class BookHotelPage extends BaseClass {
	
	public BookHotelPage() {

		PageFactory.initElements(driver, this);		
	}
	
	@FindBy(xpath="//h2[contains(text(),'Book Hotel')]")
	private WebElement bookingHotelName;
	
	@FindBy(xpath="//input[@id='own']")
	private WebElement guestSelection;
	
	@FindBy(id="user_title")
	private WebElement userTitle;
	
	@FindBy(id="first_name")
	private WebElement firstName;
	
	@FindBy(id="last_name")
	private WebElement lastName;
	
	@FindBy(id="user_phone")
	private WebElement userPhone;
	
	@FindBy(id="user_email")
	private WebElement userEmail;
	
	@FindBy(id="gst")
	private WebElement gstCheckBox;
	
	@FindBy(id="gst_registration")
	private WebElement gstRegNo;
	
	@FindBy(id="company_name")
	private WebElement gstCompanyName;
	
	@FindBy(id="company_address")
	private WebElement gstCompanyAddress;
	
	@FindBy(id="step1next")
	private WebElement gstNextBtn;
	
	@FindBy(id="high")
	private WebElement highFloor;
	
	@FindBy(id="other_request")
	private WebElement otherReqTxtBox;
	
	@FindBy(id="step2next")
	private WebElement splReqNextBtn;
	
	@FindBy(xpath="//h5[contains(text(),'Credit/Debit')]")
	private WebElement creditCard;
	
	@FindBy(id="payment_type")
	private WebElement paymentType;
	
	@FindBy(id="card_type")
	private WebElement cardType;
	
	@FindBy(id="card_no")
	private WebElement cardNo;
	
	@FindBy(id="card_name")
	private WebElement cardName;
	
	@FindBy(id="card_month")
	private WebElement cardMonth;
	
	@FindBy(id="card_year")
	private WebElement cardYear;
	
	@FindBy(id="cvv")
	private WebElement cvv;
	
	@FindBy(id="submitBtn")
	private WebElement submitBtn;
	
	@FindBy(id = "invalid-payment_type")
	private WebElement paymentTypeError;
	
	@FindBy(id = "invalid-card_type")
	private WebElement cardTypeError;
	
	@FindBy(id = "invalid-card_no")
	private WebElement cardNumError;
	
	@FindBy(id = "invalid-card_name")
	private WebElement cardNameError;
	
	@FindBy(id = "invalid-card_month")
	private WebElement cardMonthError;
	
	@FindBy(id = "invalid-cvv")
	private WebElement cvvError;
	
	@FindBy(xpath = "//p[contains(text(),'Bank Account')]")
	private WebElement upi;
	
	@FindBy(id = "upi_id")
	private WebElement upiId;
	
	@FindBy(id = "invalid-upi")
	private WebElement invalidUpi;
	
	
	public WebElement getInvalidUpi() {
		return invalidUpi;
	}

	public WebElement getUpi() {
		return upi;
	}

	public WebElement getUpiId() {
		return upiId;
	}

	public WebElement getCardType() {
		return cardType;
	}

	public WebElement getPaymentTypeError() {
		return paymentTypeError;
	}

	public WebElement getCardTypeError() {
		return cardTypeError;
	}

	public WebElement getCardNumError() {
		return cardNumError;
	}

	public WebElement getCardNameError() {
		return cardNameError;
	}

	public WebElement getCardMonthError() {
		return cardMonthError;
	}

	public WebElement getCvvError() {
		return cvvError;
	}

	public WebElement getBookingHotelName() {
		return bookingHotelName;
	}

	public WebElement getGuestSelection() {
		return guestSelection;
	}

	public WebElement getUserTitle() {
		return userTitle;
	}

	public WebElement getFirstName() {
		return firstName;
	}

	public WebElement getLastName() {
		return lastName;
	}

	public WebElement getUserPhone() {
		return userPhone;
	}

	public WebElement getUserEmail() {
		return userEmail;
	}

	public WebElement getGstCheckBox() {
		return gstCheckBox;
	}

	public WebElement getGstRegNo() {
		return gstRegNo;
	}

	public WebElement getGstCompanyName() {
		return gstCompanyName;
	}

	public WebElement getGstCompanyAddress() {
		return gstCompanyAddress;
	}

	public WebElement getGstNextBtn() {
		return gstNextBtn;
	}

	public WebElement getHighFloor() {
		return highFloor;
	}

	public WebElement getOtherReqTxtBox() {
		return otherReqTxtBox;
	}

	public WebElement getSplReqNextBtn() {
		return splReqNextBtn;
	}

	public WebElement getCreditCard() {
		return creditCard;
	}

	public WebElement getPaymentType() {
		return paymentType;
	}

	public WebElement getCardTppe() {
		return cardType;
	}

	public WebElement getCardNo() {
		return cardNo;
	}

	public WebElement getCardName() {
		return cardName;
	}

	public WebElement getCardMonth() {
		return cardMonth;
	}

	public WebElement getCardYear() {
		return cardYear;
	}

	public WebElement getCvv() {
		return cvv;
	}

	public WebElement getSubmitBtn() {
		return submitBtn;
	}
	
	public String bookHotelText() {
		String HotelNameText = elementGetText(bookingHotelName);
		return HotelNameText;
	}
	
	public void addGuestDeatils(String userType,String userFirstName,String userLastName,String userMobile,String email) {
		elementClick(guestSelection);
		selectOptionByText(userTitle, userType);
		elementSendKeys(firstName, userFirstName);
		elementSendKeys(lastName, userLastName);
		elementSendKeys(userPhone, userMobile);
		elementSendKeys(userEmail, email);
		
	}
	
	public void clickNxtBtn() {
		elementClick(gstNextBtn);
	}
	
	public void addGstDetails(String regNo,String companyName,String companyAddress) {
		elementClickJs(gstCheckBox);
		elementSendKeys(gstRegNo, regNo);
		elementSendKeys(gstCompanyName, companyName);
		elementSendKeys(gstCompanyAddress, companyAddress);
		elementClick(gstNextBtn);
	}
	
	public void addSpecialReq(String otherReq) {
		//elementClick(gstNextBtn);
		elementClick(highFloor);
		elementSendKeys(otherReqTxtBox, otherReq);
	}
	
	public void nextBtnAfterSplReq() {
		elementClick(splReqNextBtn);
	}
	public void addPaymentDetails(String payment) {
		elementClick(creditCard);
		selectOptionByText(paymentType, payment);
	}
	
	public void clickSubmitBtn() {
		elementClick(submitBtn);
	}
	
	public void gstNextBtn() {
		elementClick(gstNextBtn);
		//elementClick(splReqNextBtn);
	}
	public void clickPaymentOption() {
		elementClick(creditCard);
	}
	
	public String paymentTypeError() {
		String paymentTypeErrorMsg = elementGetText(paymentTypeError);
		return paymentTypeErrorMsg;
	}
	
	public String cardTypeError() {
		String cardTypeErrorMsg = elementGetText(cardTypeError);
		return cardTypeErrorMsg;
	}
	
	public String cardNumError() {
		String cardNumErrorMsg = elementGetText(cardNumError);
		return cardNumErrorMsg;
	}
	
	public String cardNameError() {
		String actCardNameErrorMsg = elementGetText(cardNameError);
		return actCardNameErrorMsg;
	}
	
	public String cardMonthError() {
		String cardMontErrorMsg = elementGetText(cardMonthError);
		return cardMontErrorMsg;
	}
	
	public String cvvError() {
		String cvvErrorMsg = elementGetText(cvvError);
		return cvvErrorMsg;
	}
	
	public void addUpiDetails(String upiIdText) {
		elementClick(upi);
		elementSendKeys(upiId, upiIdText);
		elementClick(submitBtn);
	}
	
	public void clickUpiBtn() {
		elementClick(upi);
	}
	
	public String upiError() {
		String invalidUpiErrorMsg = elementGetText(invalidUpi);
		return invalidUpiErrorMsg;
	}
	
}
