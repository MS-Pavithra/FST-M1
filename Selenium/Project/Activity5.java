package TestNgActivities;

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

public class Activity5 {
	WebDriver driver;
	
	@BeforeMethod
	  public void beforeMethod() {
		  driver = new FirefoxDriver(); 
		  driver.get("https://alchemy.hguy.co/jobs/");
	  }

		@Test
  public void f() {
			driver.findElement(By.xpath("//a[@href='https://alchemy.hguy.co/jobs/jobs/']")).click();
			String title = driver.getTitle();
			  System.out.println("Page title is: " + title);
			  Assert.assertEquals("Jobs – Alchemy Jobs", title);			  
		}	
		
  @AfterMethod
  public void afterMethod() {
	  driver.close();
  }

}
