package org.pojo;

import org.baseclass.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BookaHotel extends BaseClass {

	public BookaHotel() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(id = "first_name")
	private WebElement firstName;
	@FindBy(id = "last_name")
	private WebElement lastName;
	@FindBy(id = "address")
	private WebElement address;
	@FindBy(id = "cc_num")
	private WebElement atmCardNumber;
	@FindBy(id = "cc_type")
	private WebElement cardType;
	@FindBy(id = "cc_exp_month")
	private WebElement expiryDate;
	@FindBy(id = "cc_exp_year")
	private WebElement expiryYear;
	@FindBy(id = "cc_cvv")
	private WebElement ccvNumber;
	@FindBy(id = "book_now")
	private WebElement submitClick;

	public WebElement getFirstName() {
		return firstName;
	}

	public WebElement getLastName() {
		return lastName;
	}

	public WebElement getAddress() {
		return address;
	}

	public WebElement getAtmCardNumber() {
		return atmCardNumber;
	}

	public WebElement getCardType() {
		return cardType;
	}

	public WebElement getExpiryDate() {
		return expiryDate;
	}

	public WebElement getExpiryYear() {
		return expiryYear;
	}

	public WebElement getCcvNumber() {
		return ccvNumber;
	}

	public WebElement getSubmitClick() {
		return submitClick;
	}

	public void bookHotel(String string, String string2, String string3, String string4, String string5, String string6,
			String string7, String string8) {
		enterTxtUser(getFirstName(), string);
		enterTxtUser(getLastName(), string2);
		enterTxtUser(getAddress(), string3);
		enterTxtUser(getAtmCardNumber(), string4);
		selectByVisibleText(getCardType(), string5);
		selectByVisibleText(getExpiryDate(), string6);
		selectByVisibleText(getExpiryYear(), string7);
		enterTxtUser(getCcvNumber(), string8);
		click(getSubmitClick());

	}
}
