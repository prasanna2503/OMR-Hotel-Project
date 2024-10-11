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
	
	@FindBy(id="own")
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
	
	@FindBy(className="credit-card")
	private WebElement creditCard;
	
	@FindBy(id="payment_type")
	private WebElement paymentType;
	
	@FindBy(id="card_type")
	private WebElement cardTppe;
	
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
		return cardTppe;
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
//		String[] bookHotelText = HotelNameText.split("-");
//		if (bookHotelText.equals("Book Hotel")) {
//			System.out.println(bookHotelText);
//		}
		return HotelNameText;
	}
	
	
}
