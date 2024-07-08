package test;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class day4 {
	
	@Parameters({"URl","UserName"})
	@Test(groups = {"Smoke"})
	public void WebLoginHomeLoan(String siteName,String userid) {//sitename will have parameter url value
		//Selenium
		System.out.println("WebLoginHomeLoan");
		//System.out.println("Agagin changing");
		//Commented to check
		System.out.println(siteName);
		System.out.println(userid);
	}
	@Test(enabled = false)
	public void MobileLoginHomeLoan() {
	//Appium	
		System.out.println("MobileLoginHomeLoan");
		
		
	}
	@Test(groups = {"Smoke"},dataProvider = "getData")
	public void Login(String userName,String userPassword) {
	//Appium	
		System.out.println("Login");
		System.out.println(userName);
		System.out.println(userPassword);
	}
	@Test(dependsOnMethods = {"WebLoginHomeLoan"})
	public void APILoginhomeLoan() {
		//RESTAPI
		System.out.println("APILoginhomeLoan");
	}
	@Test(timeOut = 1000,groups = {"Smoke"}) //wait for 1 seconds before you throw an error
	public void helperAttributes() {
		//RESTAPI
		System.out.println("helperAttributes");
		Assert.assertTrue(false);
	}
	@DataProvider
	public Object[][] getData() {
		//1st combination - username amd password - good credit history
		//2nd combination - username amd password - no credit history
		//3rd combination - username amd password - fraudulent history
		Object[][] data = new Object[3][2]; //3 rows and 2 columns - we are defining multidimensional Object
		
		//1st set
		data[0][0] = "firstuserName";
		data[0][1] = "firstPassword";
		//2nd set
		data[1][0] = "seconduserName";
		data[1][1] = "secondPassword";
		//3rd set
		data[2][0] = "thirduserName";
		data[2][1] = "thirdPassword";
		
		return data; //sending data  
	}
}
