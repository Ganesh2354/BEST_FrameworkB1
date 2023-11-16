package com.proj.test.scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.proj.base.BaseClass;
import com.proj.pages.LoginPagePOM;
import com.proj.utilities.CaptureScreenShot;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TC001_NaukriLogin extends BaseClass{
	LoginPagePOM lppom;
	
	@Test
	public void loginNaukri() throws Exception
	{
		
		lppom=new  LoginPagePOM(driver);
		lppom.clickLoginBtn();
		Thread.sleep(4000);
		lppom.enterUserName();
		Thread.sleep(3000);
		lppom.enterPassword();
		Thread.sleep(3000);
		lppom.clickLoginUserBtn();
		Thread.sleep(3000);
		CaptureScreenShot.getScreenShotOfPage(driver, "Login Naukri");
		System.out.println("Screenshot captured and stored: "+CaptureScreenShot.getscreenshotPath());
		Thread.sleep(4000);
		//Screenshot ---> Name ---> AfterLoginPage
		
	 	
	 	
	}
	
	
	
	
	
}
