package com.testcases;

import org.junit.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;


import com.pages.OrangeHrmLoginPage;

public final class OrangeHrmTest extends BaseTest {

	private OrangeHrmTest()
	{}

	@Test(dataProvider = "LoginTestDataProvider")
	public void loginLogouttest(String username, String password)
	{
		String title = new OrangeHrmLoginPage()
				.enterUsername(username).enterPassword(password).clickLoginButton()
				.click_welcome().click_logout()
				.getTitle();
		System.out.println(title);
		
		Assert.assertEquals(title,"OrangeHRM");		
	}
	
	@DataProvider(name = "LoginTestDataProvider", parallel = true)
	public Object[][] getData()
	
	{
		return new Object[][]
				{
					{"Admin","admin123",},
					{"Admin12","admin12345",}
				};
	}
	
}
