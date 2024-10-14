package com.omrbranch.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.omrbranch.baseclass.BaseClass;

public class BookingConfirmPage extends BaseClass {
	
	public BookingConfirmPage() {

		PageFactory.initElements(driver, this);
	}
	
	public static String orderIdNumber;
	
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
	
	@FindBy(xpath = "//a[@data-testid='username']")
	private WebElement profileTab;
	
	@FindBy(xpath = "//a[text()='My Account']")
	private WebElement myAccountTab;

	public WebElement getMyAccountTab() {
		return myAccountTab;
	}

	public WebElement getProfileTab() {
		return profileTab;
	}

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
	
	public String getOrderID() {
		String orderIdNo = elementGetText(orderId);
		orderIdNumber = orderIdNo.substring(1, 11);
		return orderIdNumber;
	}
	
	public String bookingCofirmMsg() {
		String hotelName = elementGetText(bookingText);
		return hotelName;
	}
	
	public String bookedHotelNameText() {
		String bookedHotelNameText = elementGetText(bookedHotelName);
		//System.out.println(bookedHotelNameText);
		return bookedHotelNameText;
	}
	
	public void navigateMyBookingPage() throws InterruptedException {
		elementClick(profileTab);
		elementClick(myAccountTab);
		Thread.sleep(2000);
	}
}
