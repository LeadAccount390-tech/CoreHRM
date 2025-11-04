package Seleniunmjavatest;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class kosmik {
	void Logintest()
	{
		WebDriver browser=new FirefoxDriver();
		browser.get("https://www.kosmiktechnologies.com/seleniumLiveProject/kosmik-hms/");
		
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
		//logout the web page
		browser.findElement(By.xpath("/html/body/div[2]/div/h3/a")).click();
		//close the web page
		browser.close();
	}

	public static void main(String[] args) {
		kosmik login=new kosmik();
	  login.Logintest();
	}

}
