package TestNgActivities;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;

public class Activity1 {
	WebDriver driver;

  @BeforeMethod
  public void beforeMethod() {
	  driver = new FirefoxDriver(); 
	  driver.get("https://alchemy.hguy.co/jobs/");
  }
  
  @Test
  public void f() {
	  String title = driver.getTitle();
	  System.out.println("Page title is: " + title);
	  Assert.assertEquals("Alchemy Jobs � Job Board Application", title);
  }

  @AfterMethod
  public void afterMethod() {
	 	  driver.close();
  }

}
