package com.dataprovider;

import java.util.HashMap;
import java.util.Map;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.fasterxml.jackson.databind.ObjectMapper;

import net.bytebuddy.jar.asm.TypeReference;

public class DataProviderWithJSON {
	
	@Test(dataProvider="getData")
	public void testDPWithJSON(Map<String,Object> map)
	{
		
	}
	
	@DataProvider
	public Object[] getData()
	{
//		HashMap<String, Object> mp1 = new ObjectMapper()
//				.readValue(new File(System.getProperty("user.dir")+"/src/test/resources/com.jsondata/config.json")),
//				new TypeReference<HashMap<String,Object>>(){});		
		return null;
		
	}

}
