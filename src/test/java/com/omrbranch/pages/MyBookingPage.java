package com.omrbranch.pages;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.omrbranch.baseclass.BaseClass;

public class MyBookingPage extends BaseClass {
	

	public MyBookingPage() {
		
		PageFactory.initElements(driver, this);
	}
	
	public static String orderIdNumber;
	
	@FindBy(name="search")
	private WebElement searchTxtBox;
	
	@FindBy(xpath="//div[@class='room-code']")
	private WebElement orderIdForChange;
	
	@FindBy(xpath="//div[@id='bookinglist']//h5")
	private WebElement bookedHotelName;
	
	@FindBy(xpath="//strong[@class='total-prize']")
	private WebElement bookedHotelPrice;
	
	@FindBy(xpath="//button[text()='Edit']")
	private WebElement editBtn;
	
	@FindBy(name="check_in")
	private WebElement modifyCheckIn;
	
	@FindBy(xpath="//button[text()='Confirm']")
	private WebElement confirmBtn;
	
	@FindBy(xpath="//li[@class='alertMsg']")
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
	
	@FindBy(xpath = "//div[@id='bookings']//h4")
	private WebElement bookingText;
	
	@FindBy(xpath =  "//div[@id='bookinglist']//button[text()='Edit']")
	private List<WebElement> allEditbtn;
	
	public List<WebElement> getAllEditbtn() {
		return allEditbtn;
	}

	public WebElement getSearchTxtBox() {
		return searchTxtBox;
	}

	public WebElement getOrderIdForChange() {
		return orderIdForChange;
	}

	public WebElement getRoomHotelName() {
		return bookedHotelName;
	}

	public WebElement getHotelPrize() {
		return bookedHotelPrice;
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
	
	public String bookingsText() {
		String bookingsText = elementGetText(bookingText);
		return bookingsText;
		
	}
	
	public void insertOrderId() throws InterruptedException {
		String orderIdNumberInsert = BookingConfirmPage.orderIdNumber;
		elementSendKeysEnter(searchTxtBox, orderIdNumberInsert);
		Thread.sleep(2000);
	}
	
	public String orderIdVerification() {
		String orderIdVer = elementGetText(orderIdForChange);
		return orderIdVer;
	}

	public String bookedHotelNameVerification() {
		String bookedHotelNameText = elementGetText(bookedHotelName);
		return bookedHotelNameText;
	}
	
	public String bookedHotelPrice() {
		String bookedHotelPriceText = elementGetText(bookedHotelPrice);
		return bookedHotelPriceText;
	}
	
	public void modifyCheckInDate(String CheckInDate) throws InterruptedException {
		Thread.sleep(2000);
		elementClick(editBtn);
		Thread.sleep(2000);
		elementSendKeys(modifyCheckIn, CheckInDate);
		elementClick(confirmBtn);
	}
	
	public String updateSuccess() {
		String updateSuccessfulMsg = elementGetText(updateSuccessMsg);
		return updateSuccessfulMsg;
	}
	
	public void searchOrderId(String Id) {
		elementSendKeysEnter(searchTxtBox, Id);
	}
	
	public void firstHotelEditCheckIn(String modifyCheckInDate) {
		WebElement firstHotelEditBtn = allEditbtn.get(0);
		elementClick(firstHotelEditBtn);
		elementClear(modifyCheckIn);
		elementSendKeys(modifyCheckIn, modifyCheckInDate);
		elementClick(confirmBtn);
	}
	
	public void lastHotelEditCheckIn(String modifyCheckInDate) {
		int allEditBtnSize = allEditbtn.size();
		WebElement lastEditBtn = allEditbtn.get(allEditBtnSize-1);
		elementClick(lastEditBtn);
		elementClear(modifyCheckIn);
		elementSendKeys(modifyCheckIn, modifyCheckInDate);
		elementClick(confirmBtn);
	}
}
