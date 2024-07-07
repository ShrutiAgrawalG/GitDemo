package test;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class NewTest2 {
  @Test
  public void f() {
	  System.out.println("hello2");
  }
  @Test
  public void f1() {
	  System.out.println("hello12");
  } 	
  @BeforeTest
  public void prerequired() {
	  System.out.println("I wil execute first");
  }
  @BeforeSuite //Generally used to set global environment variables
  public void prerequiredSuite() {
	  System.out.println("I wil execute first before suite");
  }
	  @BeforeMethod
	  public void bmethod() {
		  System.out.println("I will execute before every method");
	  }
	  @AfterMethod
	  public void Amethod() {
		  System.out.println("I will execute after every method");
	  }
	  @BeforeClass
	  public void bClass() {
		  System.out.println("Before executing all method i will excute before class");
	  }
	  @AfterClass
	  public void AClass() {
		  System.out.println("Before executing all method i will excute afetr class");
	  }
  }

