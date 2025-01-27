package com.constants;

public final class FrameworkConstants {
	
	private FrameworkConstants()
	{}
	
	private static final String RESOURCESPATH = System.getProperty("user.dir")+"/src/test/resources";
	private static final String CONFIGFILEPATH = RESOURCESPATH+"/com.config/Config.properties";
	private static final int EXPLICITWAIT = 10; 

	public static int getExplicitwait() {
		return EXPLICITWAIT;
	}

	public static String getConfigfilePath() {
		return CONFIGFILEPATH;
	}

}
