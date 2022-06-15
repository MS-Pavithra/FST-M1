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

public class Activity4 {
	WebDriver driver;
	
	@BeforeMethod
	  public void beforeMethod() {
		  driver = new FirefoxDriver(); 
		  driver.get("https://alchemy.hguy.co/jobs/");
	  }

		@Test
  public void f() {
			String heading  = driver.findElement(By.xpath("//h2[contains(text(),'Quia quis non')]")).getText();
					
			  System.out.println("Page heading is: " + heading);
			Assert.assertEquals("Quia quis non", heading);			  
		}	
		
  @AfterMethod
  public void afterMethod() {
	  driver.close();
  }

}
