package com.pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;

import com.google.common.util.concurrent.Uninterruptibles;

public final class OrangeHrmHomePage extends BasePage{
	
	private final By link_welcome = By.xpath("//span/img[@alt='profile picture']");
	private final By link_logout = By.xpath("//a[text()='Logout']");
	
	
	public OrangeHrmHomePage click_welcome()
	{
		Uninterruptibles.sleepUninterruptibly(3,TimeUnit.SECONDS);
		//DriverManager.getDriver().findElement(link_welcome).click();
		click(link_welcome);
			
		return this;
		
	}

	
	public OrangeHrmLoginPage click_logout()
	{
		
		//DriverManager.getDriver().findElement(link_logout).click();
		click(link_logout);
		return new OrangeHrmLoginPage();
		
	}

}
