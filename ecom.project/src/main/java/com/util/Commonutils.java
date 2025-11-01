package com.util;
import java.io.FileInputStream;

import java.util.Properties;
import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Commonutils {
	public static Properties config;
	public static WebDriver driver;
	public static FileInputStream fis;

	public static void readPropertiesFile()
	{
		try {
			FileInputStream fis = new FileInputStream("C:\\Users\\mounika\\OneDrive\\Documents\\Failure1.png");
			 config = new Properties();
			config.load(fis);
			}catch(Exception e)
		{
				
		}
		
	}

	public static void LaunchBrowserAndNavigateurl()
	{
		String browserName=config.getProperty("browse");
		try {
	
		
			if(browserName.equals("Firefox"))
			{
				driver = new FirefoxDriver();
				driver.manage().window().maximize();
			}

			else if(browserName.equalsIgnoreCase("chrome"))
			{
				 driver = new ChromeDriver();
				driver.manage().window().maximize();
			}
			else if(browserName.equalsIgnoreCase("edge"))
			{
				 driver = new EdgeDriver();
					driver.manage().window().maximize();
			}
			else
			{
				System.out.println("unable to luanch the  browser");
			}
			
			driver.get(config.getProperty("Url"));
			}catch(Exception e)
			{
				System.out.println(e.getMessage());
			}
		}
	 
	public static WebElement FindElement( By by)
		{
		WebElement  element=null;
	          try
			{
	      
				 element =driver.findElement(by);
			}catch(Exception e)
			{
		TestNgutil.assertfail(e.getMessage());
			}
			return element;
		}
		//The method is used to delete all the text in a web element(like a text box or input field)
public static void clearWholeText(By by) 
		{
			try
			{
				//identify the Username and clearWholeText
				driver.findElement(by).clear();
			}
			catch(Exception e) {
			TestNgutil.assertfail(e.getMessage());
			}
		}
		public static void enterValue(By by,String value,boolean eClear) 
		{
			try
			{
				if(eClear)//eclear is return them enter value method in boolean value is true
			
					clearWholeText(by);//call them clear wholeText method
				
				//identify the username and enter the username
				driver.findElement(by).sendKeys(value);
			}
			catch(Exception e)
			{
				TestNgutil.assertfail(e.getMessage());
			}
			}

		public static void clickElement(By by)
		{
		try
		{
			FindElement(by).click();
			
		}catch(Exception e) {
			TestNgutil.assertfail(e.getMessage());
		}
		}
		public static String getElementText(By by)
		{
			String elementText=null;
			try
			{
				elementText=FindElement(by).getText();
			}catch(Exception e)
			{
				TestNgutil.assertfail(e.getMessage());
			}
			return elementText;
		}

	
	
  
		}