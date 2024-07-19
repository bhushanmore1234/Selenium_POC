package com.testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import com.driver.Driver;

public class BaseTest {
	
	protected BaseTest()
	{}
	
	
	@BeforeMethod
	protected void setup() throws Exception
	{

		Driver.initDriver();
	}

	@AfterMethod
	protected void tearDown()
	{
		Driver.quitDriver();
		System.out.println("Practice");
	}
}
