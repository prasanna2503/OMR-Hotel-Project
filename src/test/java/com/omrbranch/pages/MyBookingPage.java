package com.omrbranch.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.omrbranch.baseclass.BaseClass;

public class MyBookingPage extends BaseClass {
	
	public MyBookingPage() {
		
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(name="search")
	private WebElement searchTxtBox;
	
	@FindBy(className="room-code")
	private WebElement orderIdForChange;
	
	@FindBy(xpath="//div[@id='bookinglist']//h5")
	private WebElement roomHotelName;
	
	@FindBy(className="total-prize")
	private WebElement hotelPrize;
	
	@FindBy(xpath="//button[text()='Edit']")
	private WebElement editBtn;
	
	@FindBy(name="check_in")
	private WebElement modifyCheckIn;
	
	@FindBy(xpath="//button[text()='Confirm']")
	private WebElement confirmBtn;
	
	@FindBy(className="alertMsg")
	private WebElement updateSuccessMsg;
	
	@FindBy(id="step2")
	private WebElement myBookingTab;
	
	@FindBy(name="search")
	private WebElement searchForCancel;
	
	@FindBy(className="room-code")
	private WebElement orderIdForCancel;
	
	@FindBy(xpath="//div[@id='bookinglist']//h5")
	private WebElement HotelNameForCancel;
	
	@FindBy(className="total-prize")
	private WebElement totalPrizeConfirmationForCancel;
	
	@FindBy(xpath="//a[text()='Cancel']")
	private WebElement cancelBtn;
	
	@FindBy(xpath="//li[contains(text(),'cancelled')]")
	private WebElement cancelMessage;

	public WebElement getSearchTxtBox() {
		return searchTxtBox;
	}

	public WebElement getOrderIdForChange() {
		return orderIdForChange;
	}

	public WebElement getRoomHotelName() {
		return roomHotelName;
	}

	public WebElement getHotelPrize() {
		return hotelPrize;
	}

	public WebElement getEditBtn() {
		return editBtn;
	}

	public WebElement getModifyCheckIn() {
		return modifyCheckIn;
	}

	public WebElement getConfirmBtn() {
		return confirmBtn;
	}

	public WebElement getUpdateSuccessMsg() {
		return updateSuccessMsg;
	}

	public WebElement getMyBookingTab() {
		return myBookingTab;
	}

	public WebElement getSearchForCancel() {
		return searchForCancel;
	}

	public WebElement getOrderIdForCancel() {
		return orderIdForCancel;
	}

	public WebElement getHotelNameForCancel() {
		return HotelNameForCancel;
	}

	public WebElement getTotalPrizeConfirmationForCancel() {
		return totalPrizeConfirmationForCancel;
	}

	public WebElement getCancelBtn() {
		return cancelBtn;
	}

	public WebElement getCancelMessage() {
		return cancelMessage;
	}
	
	
}
