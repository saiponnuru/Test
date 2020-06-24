package com.nit.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Xpathfacebook 
{
  public static void main(String args[]) throws Throwable
  {
	  WebDriver driver= new ChromeDriver();
	  driver.navigate().to("https://www.facebook.com");
	  driver.manage().window().maximize();
	  driver.findElement(By.xpath("(//input[@type='text'])[1]")).sendKeys("sai");
	  driver.findElement(By.xpath("(//input[@type='text'])[2]")).sendKeys("rita");
	  driver.findElement(By.xpath("(//input[@type='text'])[3]")).sendKeys("rita@gmail.com");
	  driver.findElement(By.xpath("(//input[@type='text'])[4]")).sendKeys("rita@gmail.com");
	  driver.findElement(By.xpath("(//input[@type='password'])[2]")).sendKeys("password123");
	  Thread.sleep(2000);
	  
	  Select dob1 = new Select(driver.findElement(By.xpath("//select[@id='day']")));
	  dob1.selectByVisibleText("8");
	  Select dob2 = new Select(driver.findElement(By.xpath("//select[@id='month']")));
	  dob2.selectByVisibleText("Jun");
	  Select dob3 = new Select(driver.findElement(By.xpath("//select[@id='year']")));
	  dob3.selectByVisibleText("1996");
	  Thread.sleep(2000);
	  
	 driver.findElement(By.xpath("//input[@id='u_0_7']")).click();
	 Thread.sleep(2000);
	  
	 driver.findElement(By.xpath("//button[text()='Sign Up'][1]")).click();
	 Thread.sleep(7000);
	  driver.close();
	  
	  
	
	  
	  
	  
	  
	  
	  
	  
  }
}
