package com.nit.test;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Listbox {

	public static void main(String[] args) throws Throwable {
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("http://newtours.demoaut.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.findElement(By.partialLinkText("REGISTER")).click();
		Select country= new Select(driver.findElement(By.name("country")));
		boolean b= country.isMultiple();
		System.out.println(b);
		Thread.sleep(2000);
		country.selectByVisibleText("INDIA");
		Thread.sleep(2000);
		country.selectByIndex(17);
		Thread.sleep(2000);
		driver.close();
		
		
	}

}
