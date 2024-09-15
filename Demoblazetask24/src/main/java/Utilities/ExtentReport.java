package Utilities;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtentReport {

	//method to create an object for generate report
	public static ExtentReports getExtentReports() {

		String extentReportpath=System.getProperty("user+dir")+ "\\Reports\\extentreport.html";

		//create a object of extentspark report
		ExtentSparkReporter reporter=new ExtentSparkReporter(extentReportpath);

		//set the report name
		reporter.config().setReportName("DemoBlaze");
		reporter.config().setDocumentTitle("DemoBlaze Automation Test Results");

		//create a object of extent report
		ExtentReports extentreport=new ExtentReports();

		extentreport.attachReporter(reporter);


		return extentreport;

	}

}
