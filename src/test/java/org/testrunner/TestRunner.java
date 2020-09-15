package org.testrunner;


import org.baseclass.BaseClass;
import org.baseclass.JVMReport;
import org.junit.AfterClass;
import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features= {"src\\test\\resources"} , glue= {"org.stepdefenition"}, monochrome=true, plugin= {"html:src\\test\\resources\\Report\\"})
public class TestRunner extends BaseClass {

	@AfterClass
	public static void afterClass() {
		
	}
}
