 package com.Base;

import org.openqa.selenium.WebDriver;

import org.testng.annotations.BeforeTest;

import com.util.Commonutils;

public class Basepage {
	WebDriver driver;
		@BeforeTest
		public void setup()
		{
			Commonutils.readPropertiesFile();
			Commonutils.LaunchBrowserAndNavigateurl();
			
		}
	
	}
