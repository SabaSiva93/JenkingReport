package org.baseclass;

import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hook_Class extends BaseClass { 
	
	@Before
	public void beforeMethod() {
		getDriver();
		enterUrl("http://adactinhotelapp.com/");		

	}
	
	@After
	public void afterMethod() {
		quit();

	}
	
}
