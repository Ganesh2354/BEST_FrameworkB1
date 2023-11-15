package com.proj.base;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

import com.proj.utilities.SeleniumUtils;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {

	public WebDriver driver;
	public SeleniumUtils utils=new SeleniumUtils();
	public Properties prop;
	public BaseClass()
	{
		String path="C:\\Users\\Ganesh Dandekar\\Eclipse2023-03\\IDE\\eclipse-workspace"
				+ "\\BEST_FrameWork\\src\\main\\java\\com\\proj\\config\\properties"
				+ "\\Configuration.properties";
		try {
		File file=new File(path);
		FileInputStream fis=new FileInputStream(file);
		prop=new Properties();
		prop.load(fis);
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
	}
	
	
	
	@Parameters ("browser")
	
	@BeforeClass
	public void browserSetup(String browser) throws Exception {
		
		
		if(browser.equalsIgnoreCase("chrome"))
		{
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(prop.getProperty("globalURL"));
		Thread.sleep(5000);
		}
		
		if(browser.equalsIgnoreCase("edge"))
		{
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
			driver.manage().window().maximize();
			driver.get(prop.getProperty("globalURL"));
			Thread.sleep(5000);
		}
		
		
	}

	@AfterClass
	public void closeBrowser() {
		driver.close();
	}

}
