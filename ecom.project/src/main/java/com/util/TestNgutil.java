package com.util;

import org.testng.Assert;

public class TestNgutil {
	//this method checks whether the actual string contains the expected string
	public static void assertfail(String message) {
	}
		//The method checks if actual string contains the expected string
		public static void assertTrue(String actual,String expected)
		{
			if(actual.contains(expected))
			{
				Assert.assertTrue(actual.contains(expected));
			}else {
				System.out.println(expected+"not present in"+actual);
					}
	}
		}