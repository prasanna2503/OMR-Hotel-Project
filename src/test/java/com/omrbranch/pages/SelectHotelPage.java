package com.omrbranch.pages;

import java.util.ArrayList;
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
		System.out.println(selectHotelText);
		return selectHotelText;
	}
	
	public void clickLowToHigh() throws InterruptedException {
		elementClick(lowToHighBtn);
		Thread.sleep(2000);
	}
	
	public void clickDescendingOrder() {
		elementClick(DescendingOrder);
	}
	
	public List<Integer> allHotelPricesSort() {
		List<Integer> devPriceList= new ArrayList<>();
		List<Integer> testerPriceList = new ArrayList<>();
		for (WebElement price : allHotelPrices) {
			String eachHotelPrice = elementGetText(price);
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
	
}
