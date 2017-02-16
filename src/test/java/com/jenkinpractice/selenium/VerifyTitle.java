package com.jenkinpractice.selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;

public class VerifyTitle {
	
	public void testTitle()
	{
		WebDriver driver=new FirefoxDriver();
		driver.get("http://www.learn-automation.com");
		Assert.assertTrue(driver.getTitle().contains("Selenium"));
	}

}
