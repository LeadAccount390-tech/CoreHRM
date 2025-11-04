package Seleniunmjavatest;

import org.openqa.selenium.By;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ecommerce {
	
	void login()
	{
		//open the browser
		WebDriver driver=new FirefoxDriver();
		
		//maximize the browser
		driver.manage().window().maximize();
		
		//navigate to the application URL
		driver.get("https://admin-demo.nopcommerce.com/login?ReturnUrl=%2Fadmin%2F");
		
		//get the title of the web page
	    String title = driver.getTitle();
	    
	    //print the title of the web page 
	    System.out.println("title of the web page"+title);
	    
	    //verify the title of the web page
	  if(title.equals("nopCommerce demo store. Login"))
	  {
		  System.out.println("title verifed successfully");
	  }else 
	  {
		  System.out.println("title not verifed successfully");
	  }
	  
	    //enter the username 
	  driver.findElement(By.id("Email")).clear();
	  driver.findElement(By.id("Email")).sendKeys("admin@yourstore.com");
	  
	  //enter the  passward
	  driver.findElement(By.id("Password")).clear();
	  driver.findElement(By.id("Password")).sendKeys("admin");
	  
	  //click the login button
	  driver.findElement(By.xpath("/html/body/div[6]/div/div/div/div/div[2]/div[1]/div/form/div[3]/button")).click();
	  
	  
	  if(title.equals("Dashboard"))
	  {
		  System.out.println("Dashboard is verified");
	  }else
	  {
		  System.out.println("Dashboard is not  verified");
	  }
	  
	  //click the logout button
	 driver.findElement(By.xpath("/html/body/div[3]/nav/div/ul/li[3]/a")).click();
	 
	 //close the browser
	 driver.close();
	}
	
	public static void main(String[] args) {
		ecommerce ecom= new ecommerce();
		ecom.login();
	}
}
