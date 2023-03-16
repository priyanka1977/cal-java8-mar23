package com.example.java.lambda;

public class TestGreetingService {
	public static void main(String[] args) {
	
		GreetingService greetService = (String str) -> System.out.println(str);
		
		GreetingService greetServiceLength = str -> System.out.println(str.length());
		
		GreetingService greetServiceUpperCase = (String str) -> System.out.println(str.toUpperCase());
	
		
		
		greetService.sayMessage("priyanka");
		greetServiceLength.sayMessage("priyanka");
		greetServiceUpperCase.sayMessage("priyanka");
	}
	
}