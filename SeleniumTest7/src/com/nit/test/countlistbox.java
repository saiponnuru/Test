package com.nit.test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class countlistbox {

	public static void main(String[] args) throws Throwable {
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("http://primusbank.qedgetech.com/");
		driver.manage().window().maximize();
		Select lbox = new Select(driver.findElement(By.id("drlist")));
		List<WebElement> olist = lbox.getOptions();
		System.out.println(olist.size());
		for(WebElement each: olist )
		{
			System.out.println(each.getText());
		}
		Thread.sleep(2000);
		driver.close();
         
	}

}
