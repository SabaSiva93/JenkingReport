package org.pojo;

import org.baseclass.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Booked_Itinerary extends BaseClass{
	public Booked_Itinerary() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath="//a[@href='BookedItinerary.php']")
	private WebElement bitinerary;

	public WebElement getBitinerary() {
		return bitinerary;
	}

	
	
}
