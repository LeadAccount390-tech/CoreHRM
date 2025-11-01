package com.testNg;

import java.io.FileInputStream;

import java.io.IOException;
import java.util.Properties;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class NewTest1 {
	WebDriver driver;
	Properties config;
	Properties OR;
  @Test
  public void verifywelcomepage() {
	  
	  driver.get(config.getProperty("URL"));
	  
		//get the title
		String title =driver.getTitle();
		
		//print the title of webpage
		System.out.println("title of the webpage:"+title);
		
		
		//verification
		Assert.assertEquals(title,"OrangeHRM - New Level of HR Management");

		
		//identify the username and enter the user
		driver.findElement(By.xpath(OR.getProperty("Login_userID"))).sendKeys("selenium");
		
		//identify the passward and enter the passward
		driver.findElement(By.xpath(OR.getProperty("Login_password"))).sendKeys("selenium");
		
		//click on login
		driver.findElement(By.name("Submit")).click();
		
	//identify and get the welcome selenium page
		String text =driver.findElement(By.xpath(OR.getProperty("Welcome_selenium"))).getText();
		System.out.println(text);
		Assert.assertEquals(text,"Welcome selenium");	
  }
  
  @BeforeClass
  public void beforeClass() throws IOException {
	  
	//access the config.properties file into working environment
	  FileInputStream fis= new FileInputStream("C:\\Users\\mounika\\Downloads\\Selenium software dump\\HRMSProject\\ecom.project\\src\\main\\java\\ecom\\properties\\config.properties");
	  
  //create memory space for the config.properties file
	  config=new Properties();
	  
	  //store config.properties file into memory space
	  config.load(fis);
	  
	//access the OR.properties file into working environment
	  FileInputStream fis1= new FileInputStream("C:\\Users\\mounika\\Downloads\\Selenium software dump\\HRMSProject\\ecom.project\\src\\main\\java\\ecom\\properties\\OR.properties");
	  
	  //create memory space for the config.properties file
	  OR=new Properties();
	  
	  //store config.properties file into memory space
	  OR.load(fis1);
	  
	  if(config.getProperty("browser").equals("Firefox"))
	  {
		  driver=new FirefoxDriver();
	  }else
	  {
		  System.out.println("unable to lunch browser");
	  }
	  driver.get(config.getProperty("URL"));
  }

  @AfterClass
  public void afterClass() {
	  
		//click logout button
	driver.findElement( By.xpath(OR.getProperty("Logout_button"))).click();
	
	//close the browser
	driver.close();
	
  }
  
}
