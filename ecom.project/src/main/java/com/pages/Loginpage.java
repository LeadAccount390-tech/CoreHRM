package com.pages;
import java.util.Properties;
import org.openqa.selenium.By;
import com.util.Commonutils;
import com.util.TestNgutil;
   public class Loginpage {                                              
public static Properties properties;
		//web locators
		private final By by_username = By.xpath("//input[@name='txtUsername']");
		private final By by_password= By.xpath("//input[@name='txtPassword']");
		private final By by_signin = By.xpath("//input[@name='Submit']");
		private final By by_welcomepage= By.xpath("//li[text()='Welcome selenium']");
		public void login() throws Exception
		{
			try {
				Commonutils.enterValue(getUsername(), "selenium", true);
				Commonutils.enterValue(getPassword(),"selenium",true);
				Commonutils.clickElement(getSignin());
				
			}catch(Exception e)
			{
				TestNgutil.assertfail(e.getMessage());
			}
		}
		//create method for username
		public By getUsername()
		{
			return by_username;
		}
		//create method for password
		public By getPassword()
		{
			return by_password;
		}
		//create method for signin
		public By getSignin()
		{
			return by_signin;
		}
		//create method for welcomepage
		public By getWelcomepage()
		{
			return by_welcomepage;
		}

	}


