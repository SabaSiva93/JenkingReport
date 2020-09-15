package org.pojo;

import org.baseclass.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends BaseClass {
	public LoginPage() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(id = "username")
	private WebElement txtUserName;
	@FindBy(id = "password")
	private WebElement txtPass;
	@FindBy(id = "login")
	private WebElement butnClick;

	public WebElement getTxtUserName() {
		return txtUserName;
	}

	public WebElement getTxtPass() {
		return txtPass;
	}

	public WebElement getButnClick() {
		return butnClick;
	}
   public void login(String string, String string2) {
	
	enterTxtUser(getTxtUserName(),string);
	enterTxtUser(getTxtPass(), string2);
	click(getButnClick());

}
}
