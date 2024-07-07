package test;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class NewTest {
  @Test(groups = {"Smoke"})
  public void f() {
	  System.out.println("hello");
  }
  @Test
  public void f1() {
	  System.out.println("hello1");
  } 
  @AfterSuite
  public void last() {
	  System.out.println("I will execute last");
  }
}
