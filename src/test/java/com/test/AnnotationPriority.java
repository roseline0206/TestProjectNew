package com.test;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

public class AnnotationPriority {
	
	
	@BeforeClass
	public void beforeClass() {
		System.out.println("Inside Before Class");
	}
	
	@org.testng.annotations.Test(groups = {"Regression","Sanity","Smoke"})
	public void testMethod() {
		System.out.println("In Test Method ");
	}
	
	@org.testng.annotations.Test(groups = {"Regression"})
	public void testMethod1() {
		System.out.println("In Test Method 1");
	}
	
	@org.testng.annotations.Test(groups = {"Sanity"})
	public void testMethod2() {
		System.out.println("In Test Method 2");
	}
	
	@org.testng.annotations.Test(groups = {"Sanity","Smoke"})
	public void testMethod3() {
		System.out.println("In Test Method 3");
	}
	
	@AfterSuite
	public void afterSuite() {
		System.out.println("Inside After Suite");
	}
	
	@BeforeMethod
	public void beforeMethod() {
		System.out.println("Inside Before Method");
	}
	
	@AfterTest
	public void afterTest() {
		System.out.println("Inside After Test");
	}
	
	@BeforeSuite
	public void beforeSuite() {
		System.out.println("Inside before Suite");
	}
	
	@AfterMethod
	public void afterMethod() {
		System.out.println("Inside After Method");
	}
	
	@BeforeTest
	public void beforeTest() {
		System.out.println("Inside before test");
	}
	
	@AfterClass
	public void afterClass() {
		System.out.println("Inside After Class");
	}
}
