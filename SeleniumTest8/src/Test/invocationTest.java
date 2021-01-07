package Test;

import org.testng.annotations.Test;

public class invocationTest {
  @Test (invocationCount=5)
  public void f() 
  {
	  double x=25;
	  double y=30;
	  double z=y/x;
	  System.out.println(z);
  }
}
