package com.pages;

import org.openqa.selenium.By;

public final class OrangeHrmLoginPage extends BasePage{
	
	
	
	private final By textbox_username = By.xpath("//input[@name='username']");
	private final By textbox_password = By.xpath("//input[@name='password']");
	private final By button_login = By.xpath("//button[@type='submit']");
	
	
	public OrangeHrmLoginPage enterUsername(String username)
	{
		//DriverManager.getDriver().findElement(textbox_username).sendKeys(username);
		sendKeys(textbox_username, username);
		return this;
	}
	
	public OrangeHrmLoginPage enterPassword(String password)
	{
		//DriverManager.getDriver().findElement(textbox_password).sendKeys(password);
		sendKeys(textbox_password,password);
		return this;
	}
	
	public OrangeHrmHomePage clickLoginButton()
	{
		//DriverManager.getDriver().findElement(button_login).click();
		click(button_login);
		return new OrangeHrmHomePage();
	}
	
	public String getTitle()
	{

		return getpageTitle();
	}
	
	

}
