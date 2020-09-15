package org.pojo;

import org.baseclass.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SelectHotel extends BaseClass {

	public SelectHotel() {
		PageFactory.initElements(driver, this);
	}
	@FindBy(id="radiobutton_0")
	private WebElement radiobutton_0;

	public WebElement getRadiobutton_0() {
		return radiobutton_0;
	}
	@FindBy(id = "radiobutton_1")
	private WebElement radioButton1;
	@FindBy(id = "radiobutton_2")
	private WebElement radioButton2;
	@FindBy(id = "radiobutton_3")
	private WebElement radioButton3;
	@FindBy(id = "radiobutton_4")
	private WebElement radioButton4;
	@FindBy(id = "continue")
	private WebElement continueButton;

	public WebElement getRadioButton1() {
		return radioButton1;
	}

	public WebElement getRadioButton2() {
		return radioButton2;
	}

	public WebElement getRadioButton3() {
		return radioButton3;
	}

	public WebElement getRadioButton4() {
		return radioButton4;
	}

	public WebElement getContinueButton() {
		return continueButton;
	}
	public void selectHotel() {
		click(getRadiobutton_0());
		click(getContinueButton());

	}

}
