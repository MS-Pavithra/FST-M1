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

public class Activity6 {
	WebDriver driver;
	
	@BeforeMethod
	  public void beforeMethod() {
		  driver = new FirefoxDriver(); 
		  driver.get("https://alchemy.hguy.co/jobs/");
	  }

		@Test
  public void f() throws InterruptedException {
			driver.findElement(By.xpath("//a[@href='https://alchemy.hguy.co/jobs/jobs/']")).click();
			WebElement searchKey  = driver.findElement(By.xpath("//input[@id='search_keywords']"));
			searchKey.sendKeys("Banking");
			driver.findElement(By.xpath("//input[@type='submit']")).click();
			Thread.sleep(15000);
			driver.findElement(By.xpath("//a[@href='https://alchemy.hguy.co/jobs/job/ibm-banglore-3-sap-testing-2/']//div[@class='position']//h3[contains(text(),'SAP Testing')]")).click();
			Thread.sleep(15000);
			driver.findElement(By.xpath("//input[@type='button']")).click();
			
			driver.findElement(By.xpath("//div[@class='application_details']//a")).getText();
			String email =driver.findElement(By.xpath("//div[@class='application_details']//a")).getText();
			System.out.println("Page email is: " + email);
					  
		}	
		
  @AfterMethod
  public void afterMethod() {
	  driver.close();
  }

}
