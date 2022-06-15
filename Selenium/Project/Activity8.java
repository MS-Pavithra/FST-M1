package TestNgActivities;

import org.testng.annotations.Test;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;

public class Activity8 {
	WebDriver driver;
	
	@BeforeMethod
	  public void beforeMethod() {
		  driver = new FirefoxDriver(); 
		  driver.get("https://alchemy.hguy.co/jobs/wp-admin");
	  }

		@Test
  public void f() throws InterruptedException {
			 WebElement userName = driver.findElement(By.xpath("//input[@id='user_login']"));
		        WebElement password = driver.findElement(By.xpath("//input[@id='user_pass']"));
		        
		        userName.sendKeys("root");
		        password.sendKeys("pa$$w0rd");

		        
		        driver.findElement(By.xpath("//input[@id='wp-submit']")).click();  
		        //Thread.sleep(15000);
		}	
		
  @AfterMethod
  public void afterMethod() {
	  driver.close();
  }

}
