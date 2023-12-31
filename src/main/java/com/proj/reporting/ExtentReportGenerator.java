package com.proj.reporting;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class ExtentReportGenerator {

	//C:/Users/Ganesh Dandekar/Eclipse2023-03/IDE/eclipse-workspace/BEST_FrameWork/TestReports
	
	public static ExtentReports extentReportGenerator(String reportName)
	{
		//System.getProperty("user.dir")+
		String path=System.getProperty("user.dir")
				+ "\\TestReports\\"+reportName+".html";
		
		ExtentSparkReporter report=new ExtentSparkReporter(path);
		report.config().setDocumentTitle("NaukriWebApp");
		report.config().setReportName(reportName);
		report.config().setTheme(Theme.STANDARD);
		
		ExtentReports extent=new ExtentReports();
		extent.attachReporter(report);
		extent.setSystemInfo("WebApp", "Naukri.com");
		extent.setSystemInfo("QA Engineer", "XYZ");
		extent.setSystemInfo("O.S.", "Windows");
		return extent;
		
	}
	
	
	
	
}
