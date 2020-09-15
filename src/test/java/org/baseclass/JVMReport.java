package org.baseclass;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import net.masterthought.cucumber.Configuration;
import net.masterthought.cucumber.ReportBuilder;

public class JVMReport {

	
	public static  void generateJVMReport(String jsonFile) {
		File loc=new File(System.getenv("user.dir")+"\\src\\test\\resources\\Report");
		Configuration configuration=new Configuration(loc, "Adacitin Hotel Application");
		configuration.addClassifications("sprint", "10");
		configuration.addClassifications("Browser", "Chrome");
		configuration.addClassifications("Env", "UAT");
		configuration.addClassifications("OS", "Win-10");
		
		List<String> jsonFiles=new ArrayList<String>();
		jsonFiles.add(jsonFile);
		ReportBuilder builder =new ReportBuilder(jsonFiles, configuration);
		builder.generateReports();
		
		

	}
}
