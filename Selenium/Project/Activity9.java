package TestNgActivities;

import org.testng.annotations.Test;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;

public class Activity9 {
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
		        Actions act = new Actions(driver);
		        userName.sendKeys("root");
		        password.sendKeys("pa$$w0rd");

		        
		        driver.findElement(By.xpath("//input[@id='wp-submit']")).click();  
		        
		        driver.findElement(By.xpath("//div[contains(text(),'Job Listings')]")).click();
		      //Thread.sleep(15000);
		      
		      driver.findElement(By.xpath("//a[@class='page-title-action']")).click();
		      
		      driver.findElement(By.xpath("//div[@class='components-modal__header']//button[@type='button']//*[@width='24']")).click(); 
		      //Thread.sleep(15000);
		      
		      WebElement Position = driver.findElement(By.xpath("//textarea[@id='post-title-0']"));
		      Position.sendKeys(" Cloud Data Analyst");
		      //Thread.sleep(15000);
		      
		      driver.findElement(By.xpath("//button[contains(text(),'Publish…')]")).click();  
		      Thread.sleep(5000);
		      driver.findElement(By.xpath("//div[@class='editor-post-publish-panel__header-publish-button']//button[@type='button'][contains(text(),'Publish')]")).click(); 
		      //act.doubleClick(cta).perform();
		      Thread.sleep(15000);
		      
		      driver.findElement(By.xpath("//a[@class='components-button edit-post-fullscreen-mode-close has-icon']")).click();   
		      
		      Thread.sleep(15000);
		}	
		
  @AfterMethod
  public void afterMethod() {
	  driver.close();
  }

}
