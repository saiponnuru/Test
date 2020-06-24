package com.nit.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath {

	public static void main(String[] args) throws Throwable {
	WebDriver driver = new ChromeDriver();
	driver.navigate().to("https://www.facebook.com");
	driver.manage().window().maximize();
	driver.findElement(By.xpath("//input[@id='u_0_w']")).sendKeys("sai");
	driver.findElement(By.xpath("//input[@name='reg_passwd__']")).sendKeys("kiran");
	driver.findElement(By.xpath("//input[@name='reg_passwd__']")).sendKeys("kiran");
	driver.findElement(By.xpath("//input[@type='password'][1]")).sendKeys("kiran");
	
	driver.findElement(By.xpath("//a[text()='Terms']")).click();
	
    driver.findElement(By.xpath("//a[contains(@id,'terms-link')]")).click();
    driver.findElement(By.xpath("//a[contains(text(),'Terms')]")).click();
	
    driver.findElement(By.xpath("//a[starts-with (@id,'terms-link')]"));
    driver.findElement(By.xpath("//a[starts-with (text(),'Terms')]"));
    
    
  
	driver.close();
	

	}

}
