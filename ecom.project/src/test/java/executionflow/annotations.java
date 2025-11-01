package executionflow;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;


public class annotations {
	WebDriver driver;
 
  @BeforeSuite
  public void beforeSuite() {
		System.out.println("connection is avaliable");
	  }
  @BeforeTest
  public void beforeTest() {
	//open the browser
			WebDriver driver=new FirefoxDriver();
			
			//maximize the window
			driver.manage().window().maximize();
			
			//navigate the current URL
			driver.get("http://127.0.0.1/orangehrm-2.5.0.2/login.php");
  }
  @BeforeClass
  public void beforeClass() {
	  
	//identify the username and enter the user
			driver.findElement(By.name("txtUserName")).sendKeys("selenium");  
			
			//identify the password and enter the passward
			driver.findElement(By.name("txtPassword")).sendKeys("selenium");
			
			//click on login
			driver.findElement(By.name("Submit")).click();
  }
  
  @BeforeMethod
  public void beforeMethod() {
	  
	
		//get the title
		String title =driver.getTitle();
		

		//print the title of webpage
		System.out.println("title of the webpage:"+title);

		
		
		//verification
		if(title.equals("OrangeHRM - New level of HR Management"))
		{
			System.out.println("title of the webpage is verified");	
	}else
	{
		System.out.println("title of the webpage is not verified");	
	}
 
  }
  
public  void f1()
{
	System.out.println("testcase passed");
	  
  }

  @AfterMethod
  public void afterMethod() {
	  
	  String text = driver.findElement(By.xpath("/html/body/div[3]/ul/li[1]")).getText();
		System.out.println(text);
		
		 if(text.equals("Welcome selenium"))
		 {
				System.out.println("welcom page is verified");
		 }else
		 {
			 System.out.println("Welcomepage is not verified");
		 }
  }

  @AfterClass
  public void afterClass() {
	  
	  System.out.println("verified");
  }
  
  @AfterTest
  public void afterTest() {
	  
	//click logout button
		driver.findElement(By.xpath("/html/body/div[3]/ul/li[3]/a")).click();
		
		//close the browser
		driver.close();
			
  }
  @AfterSuite
  public void afterSuite() {
	  
	System.out.println("unable to connect");
	
  }
 

}
