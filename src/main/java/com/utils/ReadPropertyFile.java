package com.utils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Objects;
import java.util.Properties;

import com.constants.FrameworkConstants;

public final class ReadPropertyFile {


	private ReadPropertyFile()
	{}

	private static Properties property = new Properties();

	static
	{
		try {
			FileInputStream file = new FileInputStream(FrameworkConstants.getConfigfilePath());
			property.load(file);
		}
		catch(FileNotFoundException e)
		{
			e.printStackTrace();
		} catch (IOException e) {

			e.printStackTrace();
		}
	}

	public static String get(String key) throws Exception
	{

		if(Objects.isNull(property.getProperty(key))||Objects.isNull(key))
		{
			throw new Exception("Property Name "+key+"Is Not Found . Please Check config.properties");
		}
		return  property.getProperty(key);
	}

}
