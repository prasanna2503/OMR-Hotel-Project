package com.omrbranch.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.omrbranch.baseclass.BaseClass;

public class BookingConfirmPage extends BaseClass {
	
	public BookingConfirmPage() {

		PageFactory.initElements(driver, this);
	}
	
	@FindBy(className="successful")
	private WebElement orderDetails;
	
	@FindBy(xpath="//strong[contains(text(),'#')]")
	private WebElement orderId;
	
	@FindBy(xpath="//h2[contains(text(),'Booking')]")
	private WebElement bookingText;
	
	@FindBy(xpath="//p[contains(text(),'Hotel ')]//strong")
	private WebElement bookedHotelName;
	
	@FindBy(xpath="//button[text()='My Booking']")
	private WebElement myBookingBtn;

	public WebElement getOrderDetails() {
		return orderDetails;
	}

	public WebElement getOrderId() {
		return orderId;
	}

	public WebElement getBookingText() {
		return bookingText;
	}

	public WebElement getBookedHotelName() {
		return bookedHotelName;
	}

	public WebElement getMyBookingBtn() {
		return myBookingBtn;
	}
	
	
}
