package Test;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class NewTest {
	WebDriver driver;
  

  @BeforeTest
  public void setup() throws Throwable
  {
	  driver = new ChromeDriver();
	  driver.get("http://newtours.demoaut.com/");
	  driver.manage().window().maximize();
	  Thread.sleep(2000);
	  Reporter.log("Running setup",true);
  }
  
  
  @Test
  public void register() throws Throwable
  {
	  driver.findElement(By.partialLinkText("REGISTER")).click();
	  Thread.sleep(2000);
	  Reporter.log("Executing register Test",true);
  }
  
  @Test
  public void signin() throws Throwable
  {
	  driver.findElement(By.partialLinkText("SIGN-ON")).click();
	  Thread.sleep(2000);
	  Reporter.log("Executing signin Test",true);
  }
  
  @AfterTest
  public void tearDown()
  {
	  driver.close();
	  Reporter.log("Running Tear Down",true);
  }

  
}
