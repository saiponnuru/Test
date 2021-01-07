package com.nit.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Navigation {

	public static void main(String[] args) throws Throwable 
	{
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("http://orangehrm.qedgetech.com/");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		WebElement uname= driver.findElement(By.id("txtUsername"));
		uname.sendKeys("admin");
		WebElement pwd =driver.findElement(By.id("txtPassword"));
		pwd.sendKeys("Qedge123!@#");
		driver.findElement(By.id("btnLogin")).submit();;
		
		 String expected="dashboard";
		 String actual= driver.getCurrentUrl();
		 
		 if(actual.contains(expected))
		 {
			 System.out.println("Test Case Passed");
		 }
		 else
		 {
			 String e = driver.findElement(By.id("spanMessage")).getText();
			 System.out.println(e);
		 }
		
		 driver.close();
		
		
		

	}

}
