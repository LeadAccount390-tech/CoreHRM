package Seleniunmjavatest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class logintest {
	void Logintest()
	{
		//open the browser
		WebDriver driver=new FirefoxDriver();
		
		//maximize the window
		driver.manage().window().maximize();
		
		//navigate the current URL
		driver.get("http://127.0.0.1/orangehrm-2.5.0.2/login.php");
		
		//get the title
		String title =driver.getTitle();
		
		//print the title of webpage
		System.out.println("title of the webpage:"+title);
		
		//verification
		if(title.equals("OrangeHRM-new level of HR Management")){
			System.out.println("title of the webpage is verified");	
	}else
	{
		System.out.println("title of the webpage is not verified");	
	}
		
		//identify the username and enter the user
		driver.findElement(By.name("txtUserName")).sendKeys("selenium");
		
		//identify the password and enter the passward
		driver.findElement(By.name("txtPassword")).sendKeys("selenium");
		
		//click on login
		driver.findElement(By.name("Submit")).click();
		
	//identify and get the welcome selenium page
		String Text =driver.findElement(By.xpath("/html/body/div[3]/ul/li[1]")).getText();
		System.out.println(Text);
		
			//click logout button
	driver.findElement(By.xpath("/html/body/div[3]/ul/li[3]/a")).click();
	
	//close the browser
	driver.close();
	}
	public static void main(String[] args) {
		logintest login = new logintest();
		login.Logintest();
		}

}
