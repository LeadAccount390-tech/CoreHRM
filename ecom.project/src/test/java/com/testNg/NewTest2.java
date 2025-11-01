package com.testNg;

import org.testng.annotations.Test;


import org.testng.annotations.BeforeClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;

public class NewTest2 {
	 WebDriver browser;
  @Test
  public void verifywelcomepage2() {
	  String title=browser.getTitle();
		System.out.println("title of the webpage:"+title);
		if(title.equals("Kosmik Hospital Management System"))
				{
			System.out.println("Title of webpage is verified successfull");
				}else
				{
					System.out.println("Title of webpage is not verified successfull");
				}
		//identify the username and enter the user
		browser.findElement(By.name("username")).sendKeys("kosmik");
		//identify the password and enter the password
		browser.findElement(By.name("password")).sendKeys("kosmik");
		//login the web page
		browser.findElement(By.name("submit")).click();
	   
  }
  @BeforeClass
  public void beforeClass() {
	  browser=new FirefoxDriver();
		browser.get("https://www.kosmiktechnologies.com/seleniumLiveProject/kosmik-hms/");
		
  }

  @AfterClass
  public void afterClass() {
	//logout the web page
			browser.findElement(By.xpath("/html/body/div[2]/div/h3/a")).click();
			//close the web page
			browser.close();
  }

}
