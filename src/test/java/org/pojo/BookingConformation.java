package org.pojo;

import org.baseclass.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BookingConformation extends BaseClass {
	public BookingConformation() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "(//input[@class='disable_text'])[15]")
	private WebElement orderNo;

	@FindBy(xpath ="//input[@id='my_itinerary']")
	private WebElement myitineary;
	
	
	public WebElement getOrderNo() {
		return orderNo;
	}

	public WebElement getMyitineary() {
		return myitineary;
	}
	
	public void getorderNumber() {
		getAttribute(getOrderNo(), "value");

	}
	public void itineary() {
		click(getMyitineary());

	}
	
}
