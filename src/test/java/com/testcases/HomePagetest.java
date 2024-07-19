package com.testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

import com.driver.DriverManager;

public final class  HomePagetest extends BaseTest{
	
	
	private HomePagetest() {}

	@Test
	public void test1()
	{

		DriverManager.getDriver().findElement(By.id("s")).sendKeys("Automation",Keys.ENTER);

	}
	
	
	

}
