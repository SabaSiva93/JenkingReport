package org.pojo;

import org.baseclass.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchHotel extends BaseClass {
	public SearchHotel() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(id = "location")
	private WebElement location;
	@FindBy(id = "hotels")
	private WebElement hotels;
	@FindBy(id = "room_type")
	private WebElement roomType;
	@FindBy(id = "room_nos")
	private WebElement roomsNumber;
	@FindBy(id = "datepick_in")
	private WebElement checkInDate;
	@FindBy(id = "datepick_out")
	private WebElement checkOutDate;
	@FindBy(id = "adult_room")
	private WebElement adultRoom;
	@FindBy(id = "child_room")
	private WebElement childRoom;
	@FindBy(id = "Submit")
	private WebElement searchHotel;

	public WebElement getLocation() {
		return location;
	}

	public WebElement getHotels() {
		return hotels;
	}

	public WebElement getRoomType() {
		return roomType;
	}

	public WebElement getRoomsNumber() {
		return roomsNumber;
	}

	public WebElement getCheckInDate() {
		return checkInDate;
	}

	public WebElement getCheckOutDate() {
		return checkOutDate;
	}

	public WebElement getAdultRoom() {
		return adultRoom;
	}

	public WebElement getChildRoom() {
		return childRoom;
	}

	public WebElement getSearchHotel() {
		return searchHotel;
	}
	public void serachHotel(String string, String string2, String string3, String string4, String string5,
			String string6, String string7, String string8) {
		selectByVisibleText(getLocation(), string);
		selectByVisibleText(getHotels(), string2);
		selectByVisibleText(getRoomType(), string3);
		selectByVisibleText(getRoomsNumber(), string4);
		enterTxtUser(getCheckInDate(), string5);
		enterTxtUser(getCheckOutDate(), string6);
		selectByVisibleText(getAdultRoom(), string7);
		selectByVisibleText(getChildRoom(), string8);
		

	}
	public void clickSearchHotel() {
		click(getSearchHotel());

	}
}
