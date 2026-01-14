package com.example.claims.controller;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class Java_Test {

	public static void main(String[] args) {
		System.out.println("Hi");
	
		int [] myArray = {2,5,7} ;
		int i=0;
		for(i=0;i<myArray.length-1; i++);{
			System.out.println(myArray[i]);
		}
		
		Map<String, Integer> scores = new HashMap<String, Integer>() {
			{
				put("Alice", 90);
				put("Bob", 85);
				put("Charlie", 92);
			}
		};
		System.out.println(scores);
		
		Map<String, Integer> scores1 = new LinkedHashMap<>() {
		    {
		        put("Alice", 90);
		        put("Bob", 85);
		        put("Charlie", 92);
		    }
		};
		System.out.println(scores1);
		
	}

}
