package Test;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;

public class Newtest1 {
	WebDriver driver;
  
  @BeforeMethod
  public void Setup() throws Throwable 
  {
	driver= new ChromeDriver();
	driver.get("http://primusbank.qedgetech.com/home.aspx");
	driver.manage().window().maximize();
	driver.findElement(By.xpath("//input[@id='txtuId']")).sendKeys("Admin");
	driver.findElement(By.xpath("//input[@id='txtPword']")).sendKeys("Admin");
	driver.findElement(By.xpath("//input[@id='login']")).click();
	Reporter.log("Running setup method",true);
	Thread.sleep(2000);
  }
  
  
  @Test(description="Verify Branches",priority=1,enabled=true)
  public void Branches() throws Throwable 
  {
	    driver.findElement(By.xpath("//tr//tr//tr//tr//tr[2]//td[1]//a[1]//img[1]")).click();
		Reporter.log("Running Branches",true);
		Thread.sleep(2000);
  }
  
 
  
  @Test(description="Verify Users",priority=0,enabled=true)
  public void Users() throws Throwable 
  {
	    driver.findElement(By.xpath("//tr//tr//tr[4]//td[1]//a[1]//img[1]")).click();
		Reporter.log("Running Users",true);
		Thread.sleep(2000);
  }

 
  @AfterMethod
  public void tearDown() throws Throwable {
	  Thread.sleep(2000);
	  driver.close();
	  Reporter.log("Running Tear Down",true);
  }

}
