package com.Tests;

import org.testng.annotations.Test;

import com.Base.Basepage;
import com.pages.Loginpage;
import com.util.Commonutils;
import com.util.TestNgutil;

public class TestPIMpage extends Basepage {
	
	Loginpage loginPage=new Loginpage();
  @Test(description="verify that an employee ")
  public void addEmployeeThenVerify() throws Exception{
  
	  loginPage.login();
	  TestNgutil.assertTrue(Commonutils.getElementText(loginPage.getWelcomepage(),"Welcome selenium"));
	  System.out.println("wlcome to github");
	  System.out.println("wlcome to github");
  }
}
