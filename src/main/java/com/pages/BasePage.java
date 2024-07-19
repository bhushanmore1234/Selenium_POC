package com.pages;

import org.openqa.selenium.By;

import com.driver.DriverManager;

public class BasePage {
	
	protected void click(By by)
	{
		explicitlyWaitForElementToBeClickable(by);
		DriverManager.getDriver().findElement(by).click();
	}

	protected void sendKeys(By by, String value)
	{
		explicitlyWaitForElementToBeClickable(by);
		explicitlyWaitForElementToBePresent(by);
		DriverManager.getDriver().findElement(by).sendKeys(value);
	}
	
	protected String getpageTitle()
	{

		
		return DriverManager.getDriver().getTitle();
	}

	//----------------This method will call in this class only once implemented 
	
	private void explicitlyWaitForElementToBeClickable(By by)
	{
		System.out.println("----------Need impleimentation of wait ");
	}
	private void explicitlyWaitForElementToBePresent(By by)
	{
		System.out.println("----------Need impleimentation of wait ");
	}
}
