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

public class Activity3 {
	WebDriver driver;
	
	@BeforeMethod
	  public void beforeMethod() {
		  driver = new FirefoxDriver(); 
		  driver.get("https://alchemy.hguy.co/jobs/");
	  }

		@Test
  public void f() {
			
			WebElement l =driver.findElement(By.xpath("//img[@class='attachment-large size-large wp-post-image']"));
		      //getAttribute() to get src of image
		      System.out.println("Src attribute is: "+ l.getAttribute("src"));
			 		}
		
  @AfterMethod
  public void afterMethod() {
	  driver.close();
  }

}
