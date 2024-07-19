package com.enums;

public class enumRunner {
	
	public static void main(String[] args)
	{
		System.out.println(Severity.CRITICAL);
		
		Severity sev = Severity.CRITICAL;
		
		switch (sev) {
		case CRITICAL:
			System.out.println(Severity.CRITICAL);
			break;
		case MEDIUM:
			System.out.println(Severity.MEDIUM);
			break;
		case HIGH:
			System.out.println(Severity.HIGH);
			break;
		case LOW:
			System.out.println(Severity.LOW);
			break;
		}
		
	}

}
