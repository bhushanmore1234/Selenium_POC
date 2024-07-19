package com.driver;

import java.time.Duration;
import java.util.Objects;

import org.openqa.selenium.chrome.ChromeDriver;

import com.utils.ReadPropertyFile;

public final class Driver {
	private Driver()
	{}



	public static void initDriver() throws Exception {

		if(Objects.isNull(DriverManager.getDriver()))
		{

			DriverManager.setDriver(new ChromeDriver());
			DriverManager.getDriver().manage().window().maximize();

			DriverManager.getDriver().get(ReadPropertyFile.get("url"));
			DriverManager.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		}


	}

	public static void quitDriver()
	{
		if(Objects.nonNull(DriverManager.getDriver()))
		{
			DriverManager.getDriver().quit();
			DriverManager.unload();
		}
	}

}
