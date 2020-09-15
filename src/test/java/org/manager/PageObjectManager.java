package org.manager;

import org.pojo.BookaHotel;
import org.pojo.Booked_Itinerary;
import org.pojo.BookingConformation;
import org.pojo.LoginPage;
import org.pojo.SearchHotel;
import org.pojo.SelectHotel;

public class PageObjectManager {
	private static PageObjectManager pageObjectManager;
	private static LoginPage login;
	private static SelectHotel selectHotel;
	private static SearchHotel searchHotel;
	private static BookaHotel bookHotel;
	private static BookingConformation bookingConformation;
	private static Booked_Itinerary bookingItinerary;
		
	
	
public static PageObjectManager getPageObjectManager() {
		return pageObjectManager;
	}

	public static Booked_Itinerary getBookingItinerary() {
		return (bookingItinerary==null)?bookingItinerary =new Booked_Itinerary() : bookingItinerary;
	}

private PageObjectManager() {
		
	}
	
	public static PageObjectManager getInstance() {
	
		return (pageObjectManager==null) ? pageObjectManager=new PageObjectManager() :pageObjectManager;

	}

	public LoginPage getLogin() {
	
		return (login==null)? login=new LoginPage() : login;
		
	}
	
	public SelectHotel getSelectHotel() {
		return (selectHotel==null)? selectHotel=new SelectHotel() : selectHotel;
	}
	public SearchHotel getSearchHotel() {
		return (searchHotel==null)? searchHotel=new SearchHotel() : searchHotel;
	}
	public BookaHotel getBookHotel() {
		return (bookHotel==null)? bookHotel =new BookaHotel() : bookHotel;
	}
	public BookingConformation getBookingConformation() {
		return (bookingConformation==null)?bookingConformation =new BookingConformation() : bookingConformation;
	}
}
