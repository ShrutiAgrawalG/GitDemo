package test;

import org.testng.annotations.Test;

public class day3 {
	
	@Test(priority = 1)
	public void WebLoginCarLoan() {
		//Selenium
		System.out.println("WebLoginCarLoan");
		//System.out.println("Changes made to check for git");
		System.out.println("Agagin changing");
	}
	@Test
	public void MobileLoginCarLoan() {
	//Appium	
		System.out.println("MobileLoginCarLoan");
	}
	@Test(groups = {"Smoke"})
	public void APILoginCarLoan() {
		//RESTAPI
		System.out.println("APILoginCarLoan");
	}
//	@Test
//	public void MobileLoginCarLoan1() {
//	//Appium	
//		System.out.println("MobileLoginCarLoan1");
//	}
//	@Test
//	public void MobileLoginCarLoan2() {
//	//Appium	
//		System.out.println("MobileLoginCarLoan2");
//	}

}
