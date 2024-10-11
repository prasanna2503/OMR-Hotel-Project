package com.omrbranch.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.omrbranch.baseclass.BaseClass;

public class SearchHotelPage extends BaseClass {
	
	public SearchHotelPage() {
		
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//a[@data-testid='username']")
	private WebElement verifyAccount;
	
	@FindBy(id="state")
	private WebElement hotelState;
	
	@FindBy(id="city")
	private WebElement hotelCity;
	
	@FindBy(id="room_type")
	private WebElement hotelRoomType;
	
	@FindBy(name="check_in")
	private WebElement check_InDate;
	
	@FindBy(name="check_out")
	private WebElement check_OutDate;
	
	@FindBy(id="no_rooms")
	private WebElement roomCount;
	
	@FindBy(id="no_adults")
	private WebElement adultsCount;
	
	@FindBy(id="no_child")
	private WebElement childCount;
	
	@FindBy(xpath="//iframe[@id='hotelsearch_iframe']")
	private WebElement SwitchFrame;
	
	@FindBy(id="searchBtn")
	private WebElement searchBtn;
	
	@FindBy(id="invalid-state")
	private WebElement invalidState;
	
	@FindBy(id="invalid-city")
	private WebElement invalidCity;
	
	@FindBy(id="invalid-check_in")
	private WebElement invalidCheckInDate;
	
	@FindBy(id="invalid-check_out")
	private WebElement invalidCheckoutDate;
	
	@FindBy(id="invalid-no_rooms")
	private WebElement invalidRoom;
	
	@FindBy(id="invalid-no_adults")
	private WebElement invalidAdults;
	
	public WebElement getInvalidState() {
		return invalidState;
	}

	public WebElement getInvalidCity() {
		return invalidCity;
	}

	public WebElement getInvalidCheckInDate() {
		return invalidCheckInDate;
	}

	public WebElement getInvalidCheckoutDate() {
		return invalidCheckoutDate;
	}

	public WebElement getInvalidRoom() {
		return invalidRoom;
	}

	public WebElement getInvalidAdults() {
		return invalidAdults;
	}

	public WebElement getVerifyAccount() {
		return verifyAccount;
	}

	public WebElement getHotelState() {
		return hotelState;
	}

	public WebElement getHotelCity() {
		return hotelCity;
	}

	public WebElement getHotelRoomType() {
		return hotelRoomType;
	}

	public WebElement getCheckInDate() {
		return check_InDate;
	}

	public WebElement getCheckOutDate() {
		return check_OutDate;
	}

	public WebElement getRoomCount() {
		return roomCount;
	}

	public WebElement getAdultsCount() {
		return adultsCount;
	}

	public WebElement getChildCount() {
		return childCount;
	}

	public WebElement getSwitchFrame() {
		return SwitchFrame;
	}

	public WebElement getSearchBtn() {
		return searchBtn;
	}
	
	//Then User should verify success message after login "Welcome Prasanna"
	
	public String loginSuccessMsgText() {
		
		String loginSuccessMsgText = elementGetText(verifyAccount);
		System.out.println(loginSuccessMsgText);
		return loginSuccessMsgText;
	}
	
	public void selectRoomtype(String roomType) {
		String[] split = roomType.split("/");
		for (String v : split) {
			selectOptionByText(hotelRoomType, v);
		}
	}
	
	//When User search hotel "<state>","<city>","<roomType>","<checkIn>","<check-out>","<No of Room>","<No of Adults>" and "<No of Childs>"
	public void searchHotels(String stateName,String cityName,String roomType,String checkInDate,
			String checkOutDate,String noOfRoom,String noOfAdults,String noOfChild) throws InterruptedException {
		
		selectOptionByText(hotelState, stateName);
		Thread.sleep(2000);
		selectOptionByText(hotelCity, cityName);
		selectRoomtype(roomType);
		//selectOptionByText(hotelRoomType, roomType);
		elementSendKeysJs(check_InDate, checkInDate);
		elementSendKeysJs(check_OutDate, checkOutDate);
		selectOptionByText(roomCount,noOfRoom);
		selectOptionByText(adultsCount, noOfAdults);
		elementSendKeys(childCount, noOfChild);
		switchToFrameByWebElement(SwitchFrame);
		elementClick(searchBtn);
		defaultFrame();
	}
	public void searchHotelWithMandatory(String stateName,String cityName,String checkInDate,
			String checkOutDate,String noOfRoom,String noOfAdults) throws InterruptedException {
		
		selectOptionByText(hotelState, stateName);
		Thread.sleep(2000);
		selectOptionByText(hotelCity, cityName);
		elementSendKeysJs(check_InDate, checkInDate);
		elementSendKeysJs(check_OutDate, checkOutDate);
		selectOptionByText(roomCount,noOfRoom);
		selectOptionByText(adultsCount, noOfAdults);
		switchToFrameByWebElement(SwitchFrame);
		elementClick(searchBtn);
		defaultFrame();
		
	}
	public void clickSearchButton() {
		switchToFrameByWebElement(SwitchFrame);
		elementClick(searchBtn);
		defaultFrame();
	}
	
	public String stateErrorMsgText() {
		String stateErrorMsg = elementGetText(invalidState);
		System.out.println(stateErrorMsg);
		return stateErrorMsg;
	}
	public String cityErrorMsgText() {
		String cityErrorMsg = elementGetText(invalidCity);
		System.out.println(cityErrorMsg);
		return cityErrorMsg;
	}
	public String checkInErrorMsgText() {
		String checkInErrorMsg = elementGetText(invalidCheckInDate);
		System.out.println(checkInErrorMsg);
		return checkInErrorMsg;
	}
	public String checkOutErrorMsgText() {
		String checkOutErrorMsg = elementGetText(invalidCheckoutDate);
		System.out.println(checkOutErrorMsg);
		return checkOutErrorMsg;
	}
	public String roomErrorMsgText() {
		String roomErrorMsg = elementGetText(invalidRoom);
		System.out.println(roomErrorMsg);
		return roomErrorMsg;
	}
	public String adultErrorMsgText() {
		String adultErrorMsg = elementGetText(invalidAdults);
		System.out.println(adultErrorMsg);
		return adultErrorMsg;
	}
	

}
