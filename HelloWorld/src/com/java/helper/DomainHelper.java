package com.java.helper;

public class DomainHelper {
	
	public static String getDate(String name) {
		if(name.startsWith("P"))
			return name;
		else
			return "Not Supported";
	}
	
	public static boolean isOddNumber(long number) {
		if(number % 2 == 0)
			return false;
		else
			return true;
	}
	
	public static boolean isEvenNum(long number) {
		if(number % 2 == 0)
			return true;
		else
			return false;
	}

}
