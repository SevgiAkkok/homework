package com.Test.homework;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseTest {
	protected static WebDriver driver;

	@BeforeClass
	protected static void before()
	{
		System.setProperty("webdriver.chrome.driver", "/Users/Asus/Desktop/chromedriver.exe");
		driver=new ChromeDriver();
	}
	@AfterClass
	public static void after() throws InterruptedException
	{
		Thread.sleep(3000);
	}
	public WebDriver getDriver()
	{
		return driver;
	}
}
