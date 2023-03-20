package com.example.java.functionalinterface;

import java.util.function.Predicate;

public class TestPredicateFI {
	
	public static void main(String[] args) {
	/*int  i = 6;
	if ( i < 0 )   // condition boolean predicate : boolean test(T t)
		System.out.println("true");
	else
		System.out.println("false");
	*/
	
	// Rewrite the above code with predicate interface
	
	
	// Lambda is written for boolean test(T)
	Predicate<Integer> predicate1 = (Integer intValue) ->  intValue < 0;
	
	// invoke lambda
	System.out.println(predicate1.test(6));
	System.out.println(predicate1.test(-6));
	System.out.println(predicate1.test(0));
	
	
	// check if the length of password string is greater than or equal 8 character using Predicate
	Predicate<String> predicate = name -> name.length() >= 8;
	String password = "Dilroz";
	System.out.println(predicate.test(password)); 
	
	
	
	// check if the given string "abcd" contains "a" using Predicate
	Predicate<String> predicate2 = name -> name.contains("a");
	
	System.out.println("=============Predicate(contains)================");
	
	System.out.println(predicate2.test(password)); 
	
	System.out.println(predicate2.test("abcd")); 
	
	System.out.println(predicate2.test("priyanka")); 
	
	
	
	}

}
