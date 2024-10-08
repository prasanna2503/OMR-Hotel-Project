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
	private WebElement checkInDate;
	
	@FindBy(name="check_out")
	private WebElement checkOutDate;
	
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
		return checkInDate;
	}

	public WebElement getCheckOutDate() {
		return checkOutDate;
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
	

}
