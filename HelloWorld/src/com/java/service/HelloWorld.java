package com.java.service;

import com.java.helper.DomainHelper;

public class HelloWorld {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(DomainHelper.getDate("Hello DevOps!!!!"));
		
		System.out.println(" Is 5 odd number ::" + DomainHelper.isOddNumber(5));
	}

}
