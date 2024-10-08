package com.omrbranch.pages;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.omrbranch.baseclass.BaseClass;

public class SelectHotelPage extends BaseClass {
	
	public SelectHotelPage() {

		PageFactory.initElements(driver, this);
	}
	
	@FindBy(className="explore-hotels")
	private WebElement exploreHotels;
	
	@FindBy(xpath="//h5[contains(text(),'Select')]")
	private WebElement hotelText;
	
	@FindBy(xpath="//div[@id='hotellist']//h5")
	private List<WebElement> allHotelNames;
	
	@FindBy(xpath="//div[@id='hotellist']//strong")
	private List<WebElement> allHotelPrices;
	
	@FindBy(xpath="//div[@id='hotellist']//a")
	private List<WebElement> allContinueBtn;

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
		
	
}
