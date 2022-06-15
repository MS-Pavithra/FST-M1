package TestNgActivities;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;

public class Activity7 {
	WebDriver driver;
	
	@BeforeMethod
	  public void beforeMethod() {
		  driver = new FirefoxDriver(); 
		  driver.get("https://alchemy.hguy.co/jobs/");
	  }

		@Test
  public void f() throws InterruptedException {
			driver.findElement(By.xpath("//a[contains(text(),'Post a Job')]")).click();
			
			
			//Enter the email
	        driver.findElement(By.xpath("//input[@id='create_account_email']")).sendKeys("qmsp2@example.com");
			
	      //Enter the Job Title
	        driver.findElement(By.xpath("//input[@id='job_title']")).sendKeys("TestLead");
	        
	        //Enter the email
	        driver.findElement(By.xpath("//input[@id='application']")).sendKeys("qmsp2@example.com");
	        
	        //Enter the Company name
	        driver.findElement(By.xpath("//input[@id='company_name']")).sendKeys("XYZ"); 
	        
	      //Enter the Description
	        driver.findElement(By.xpath("//iframe[@id='job_description_ifr']")).sendKeys(" Automation test");
	       // Thread.sleep(25000);
	      
	        driver.findElement(By.cssSelector("input.button:nth-child(4)")).click();   
	        //Thread.sleep(35000);		
		
	        driver.findElement(By.cssSelector("#job_preview_submit_button")).click();   
	        //Thread.sleep(35000);	
		}	
		
  @AfterMethod
  public void afterMethod() {
	  driver.close();
  }

}
