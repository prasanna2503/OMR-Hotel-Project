package com.omrbranch.pages;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.omrbranch.baseclass.BaseClass;

public class SelectHotelPage extends BaseClass {

	public SelectHotelPage() {

		PageFactory.initElements(driver, this);
	}
	
	public static String lastHotelNameText;
	public static String lastPrice;
	public static String lastSecondtHotelNameText;
	public static String lastSecondHotelPrice;
	public static String firstHotelNameText;
	public static String firstHotelPriceText;

	@FindBy(className = "explore-hotels")
	private WebElement exploreHotels;

	@FindBy(xpath = "//h5[contains(text(),'Select')]")
	private WebElement hotelText;

	@FindBy(xpath = "//div[@id='hotellist']//h5")
	private List<WebElement> allHotelNames;

	@FindBy(xpath = "//div[@id='hotellist']//strong")
	private List<WebElement> allHotelPrices;

	@FindBy(xpath = "//div[@id='hotellist']//a")
	private List<WebElement> allContinueBtn;
	
	@FindBy(xpath="//label[text()='Price low to high']")
	private WebElement lowToHighBtn;
	
	@FindBy(xpath="//label[text()='Name Descending']")
	private WebElement DescendingOrder;
	
	@FindBy(id="room_type")
	private WebElement roomTypeList;
	
	@FindBy(xpath = "//label[text()='Deluxe']")
	private WebElement deluxeCheckBox;
	
	@FindBy(xpath = "//label[text()='Suite']")
	private WebElement suiteCheckBox;
	
	public WebElement getRoomTypeList() {
		return roomTypeList;
	}

	public WebElement getDeluxeCheckBox() {
		return deluxeCheckBox;
	}

	public WebElement getSuiteCheckBox() {
		return suiteCheckBox;
	}

	public WebElement getDescendingOrder() {
		return DescendingOrder;
	}

	public WebElement getLowToHighBtn() {
		return lowToHighBtn;
	}

	public WebElement getExploreHotels() {
		return exploreHotels;
	}

	public WebElement getHotelText() {
		return hotelText;
	}

	public List<WebElement> getAllHotelNames() {
		return allHotelNames;
	}

	public List<WebElement> getAllHotelPrices() {
		return allHotelPrices;
	}

	public List<WebElement> getAllContinueBtn() {
		return allContinueBtn;
	}

	public String selectHotelText() {

		String selectHotelText = elementGetText(hotelText);
		return selectHotelText;
	}
	
	public void clickLowToHigh() throws InterruptedException {
		elementClick(lowToHighBtn);
		Thread.sleep(2000);
	}
	
	public void clickDescendingOrder() throws InterruptedException {
		Thread.sleep(2000);
		elementClick(DescendingOrder);
	}
	
	public List<Integer> allHotelPricesSort() {
		List<Integer> devPriceList= new ArrayList<>();
		List<Integer> testerPriceList = new ArrayList<>();
		for (WebElement price : allHotelPrices) {
			String eachHotelPrice = elementGetText(price);
			System.out.println(eachHotelPrice);
			String substring = eachHotelPrice.substring(1, 7);
			String replaceSpace = substring.replace(" ", "");
			String replaceComma = replaceSpace.replace(",", "");
			int pricesList = Integer.parseInt(replaceComma);
			devPriceList.add(pricesList);
		}
		System.out.println(devPriceList);
		testerPriceList.addAll(devPriceList);
		Collections.sort(testerPriceList);
		System.out.println(testerPriceList);
		boolean priceOrder = devPriceList.equals(testerPriceList);
		if (priceOrder) {
			System.out.println("All Hotel Price Lists are in Correct Order ");
		}else {
			System.out.println("All Hotel Price Lists are Not in Correct Order ");
		}
		return testerPriceList;	
	}
	
	public void allHotelNames() {
		List<String> devHotelList = new ArrayList<>();
		List<String> testerHotelList = new ArrayList<>();
		for (WebElement eachHotelNames : allHotelNames) {
			String allHotelNames = elementGetText(eachHotelNames);
			String replace = allHotelNames.replace(" ", "");
			devHotelList.add(replace);
		}
		System.out.println(devHotelList);
		testerHotelList.addAll(devHotelList);
		Collections.sort(testerHotelList);
		Collections.reverse(testerHotelList);
		System.out.println(testerHotelList);
		boolean equals = devHotelList.equals(testerHotelList);
		if (equals) {
			System.out.println("All Hotel Names are in Descending Order");
		}else {
			System.out.println("All Hotel Names are Not in Descending Order");
		}
	}
	
	public String allRoomType() {
		String roomTypeHeader = elementGetText(roomTypeList);
		return roomTypeHeader;
	}
	
	public void clickSuiteCheckBox() throws InterruptedException {
		elementClick(deluxeCheckBox);
		elementClick(suiteCheckBox);
		Thread.sleep(3000);
	}
	
	public void afterSortingHotelList() {
		List<Boolean> res = new ArrayList<>();
		List<String> devSuiteHotels = new ArrayList<>();
		for (WebElement eachHotel : allHotelNames) {
			String eachHotelList = elementGetText(eachHotel);
		//	System.out.println(eachHotelList);
			devSuiteHotels.add(eachHotelList);
		}
		//System.out.println(devSuiteHotels);
		for (String text : devSuiteHotels) {
			boolean e = text.endsWith("Suite");
			res.add(e);
		}
	//	System.out.println(res);
		boolean compareHotels = res.contains(false);
		if (compareHotels) {
			System.out.println("All Hotels are Not Suite Type");
		} else {
			System.out.println("All Hotels are Suite Type ");
		}
		
	}
	
	public void saveLastHotelName() {
		int size = allHotelNames.size();
		WebElement lastHotelName = allHotelNames.get(size-1);
		lastHotelNameText = elementGetText(lastHotelName);
	}
	
	public void saveLastHotelPrice() {
		int size = allHotelPrices.size();
		WebElement lastHotelPrice = allHotelPrices.get(size-1);
		lastPrice = elementGetText(lastHotelPrice);
	}
	
	public void selectLastHotel() {
		int allContinueBtnCount = allContinueBtn.size();
		WebElement lastContinueBtn = allContinueBtn.get(allContinueBtnCount-1);
		elementClick(lastContinueBtn);
		acceptAlert();
	}
	
	public void saveLastSecondHotelNameAndPrice() {
		int size = allHotelNames.size();
		WebElement secondLastHotelName = allHotelNames.get(size-2);
		lastSecondtHotelNameText = elementGetText(secondLastHotelName);
		
		int priceSize = allHotelPrices.size();
		WebElement lastHotelPrice = allHotelPrices.get(size-2);
		lastSecondHotelPrice = elementGetText(lastHotelPrice);
	}
	
	public void selectSecondLastHotel() {
		int allContinueBtnCountSize = allContinueBtn.size();
		WebElement lastSecondContinueBtn = allContinueBtn.get(allContinueBtnCountSize-2);
		elementClick(lastSecondContinueBtn);
		acceptAlert();
	}
	
	public void saveFirstHotelNameAndPrice() {
		//int size = allHotelNames.size();
		WebElement firstHotelName = allHotelNames.get(0);
		firstHotelNameText = elementGetText(firstHotelName);
		
		//int size2 = allHotelPrices.size();
		WebElement firstHotelPrice = allHotelPrices.get(0);
		firstHotelPriceText = elementGetText(firstHotelPrice);
	}
	
	public void selectFirstHotel() {
		WebElement firstHotelContinueBtn = allContinueBtn.get(0);
		elementClick(firstHotelContinueBtn);
		dismissAlert();
	}
	
}
