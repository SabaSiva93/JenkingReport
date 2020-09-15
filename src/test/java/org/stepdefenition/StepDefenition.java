package org.stepdefenition;

import java.net.MalformedURLException;

import org.baseclass.BaseClass;
import org.manager.PageObjectManager;
import org.pojo.BookaHotel;
import org.pojo.BookingConformation;
import org.pojo.LoginPage;
import org.pojo.SearchHotel;
import org.pojo.SelectHotel;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDefenition extends BaseClass {

	PageObjectManager pageObjectManager;
	LoginPage login;
	SearchHotel searchHotel;
	SelectHotel selectHotel;
	BookaHotel bookHotel;
	BookingConformation bookingConformation;
	@Given("User shoud enter into Adactin login page")
	public void user_shoud_enter_into_Adactin_login_page() throws MalformedURLException {
		driver=getDriverCloud();
		enterUrl("http://adactinhotelapp.com/");

	}

	@When("user should enter {string} and {string}")
	public void user_should_enter_and(String string, String string2) {
		pageObjectManager = PageObjectManager.getInstance();
		login = pageObjectManager.getLogin();
		login.login(string, string2);
	}

	@When("user should {string}, {string},{string},{string},{string},{string},{string},{string}")
	public void user_should(String string, String string2, String string3, String string4, String string5, String string6, String string7, String string8) {
		pageObjectManager = PageObjectManager.getInstance();
		searchHotel = pageObjectManager.getSearchHotel();
		searchHotel.serachHotel(string, string2, string3, string4, string5, string6, string7, string8);
	}

	@When("user should click continue button")
	public void user_should_click_continue_button() {
		searchHotel.clickSearchHotel();
	}

	@When("user should select hotel and click continue button")
	public void user_should_select_hotel_and_click_continue_button() {
		pageObjectManager = PageObjectManager.getInstance();
		selectHotel = pageObjectManager.getSelectHotel();
		selectHotel.selectHotel();
	}

	@When("user should enter {string},{string},{string},{string},{string},{string},{string},{string} and user should click continue")
	public void user_should_enter_and_user_should_click_continue(String string, String string2, String string3, String string4, String string5, String string6, String string7, String string8) {
		pageObjectManager = PageObjectManager.getInstance();
		bookHotel = pageObjectManager.getBookHotel();
		bookHotel.bookHotel(string, string2, string3, string4, string5, string6, string7, string8);
	}

	@Then("user should get order detail")
	public void user_should_get_order_detail() {
//		pageObjectManager = PageObjectManager.getInstance();
//		bookingConformation = pageObjectManager.getBookingConformation();
//		bookingConformation.getorderNumber();
	}

	

//	@Given("User shoud enter into Adactin login page")
//	public void user_shoud_enter_into_Adactin_login_page() {
//		getDriver();
//		enterUrl("http://adactinhotelapp.com/");
//	}
//
//	@When("user should enter {string} and {string}")
//	public void user_should_enter_and(String string, String string2) {
//		pageObjectManager = PageObjectManager.getInstance();
//		login = pageObjectManager.getLogin();
//		login.login(string, string2);
//		
//	}
//
//	@When("user should {string}, {string},{string},{string},{string},{string},{string},{string}")
//	public void user_should(String string, String string2, String string3, String string4, String string5,
//			String string6, String string7, String string8) {
//		pageObjectManager = PageObjectManager.getInstance();
//		searchHotel = pageObjectManager.getSearchHotel();
//		searchHotel.serachHotel(string, string2, string3, string4, string5, string6, string7, string8);
//		
//	}
//
//	@When("user should click continue button")
//	public void user_should_click_continue_button() {
//		searchHotel.clickSearchHotel();
//
//	}
//
//	@When("user should select hotel and click continue button")
//	public void user_should_select_hotel_and_click_continue_button() {
//		pageObjectManager = PageObjectManager.getInstance();
//		selectHotel = pageObjectManager.getSelectHotel();
//		selectHotel.selectHotel();
//		
//	}
//
//	@When("user should enter {string},{string},{string},{string},{string},{string},{string},{string} and user should click continue")
//	public void user_should_enter_and_user_should_click_continue(String string, String string2, String string3,
//			String string4, String string5, String string6, String string7, String string8) {
//		pageObjectManager = PageObjectManager.getInstance();
//		bookHotel = pageObjectManager.getBookHotel();
//		bookHotel.bookHotel(string, string2, string3, string4, string5, string6, string7, string8);
//	}
//	@Then("user should get order detail")
//	public void user_should_get_order_detail() {
//		pageObjectManager = PageObjectManager.getInstance();
//		bookingConformation = pageObjectManager.getBookingConformation();
//		bookingConformation.getorderNumber();
//		
//	}
//
//	@Then("click litinery button")
//	public void click_litinery_button() {
//		bookingConformation.getMyitineary();
//	}
	
	
}
