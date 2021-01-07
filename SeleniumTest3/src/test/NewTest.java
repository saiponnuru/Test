package test;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class NewTest {
  @Test
  public void f() 
  {
	  Reporter.log("My TestCase",true);
  }
  @BeforeMethod
  public void beforeMethod() {
	  Reporter.log("Before Method",true);
  }

  @AfterMethod
  public void afterMethod() {
	  Reporter.log("after Method",true);
  }

  @BeforeClass
  public void beforeClass() {
	  Reporter.log("Before class",true);
  }

  @AfterClass
  public void afterClass() {
  }

  @BeforeTest
  public void beforeTest() {
	  Reporter.log("before Test",true);
  }

  @AfterTest
  public void afterTest() {
	  Reporter.log("after Test",true);
  }

  @BeforeSuite
  public void beforeSuite() {
	  Reporter.log("Before suite",true);
  }

  @AfterSuite
  public void afterSuite() {
	  Reporter.log("after suite",true);
  }

}
