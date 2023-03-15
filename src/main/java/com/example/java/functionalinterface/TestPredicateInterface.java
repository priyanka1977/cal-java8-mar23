package com.example.java.functionalinterface;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.function.Predicate;

public class TestPredicateInterface {
	
	public static void process(Collection<String> names, Predicate condition) {
		
		for(String name : names) {
			if(condition.test(name)) {
				System.out.printf("%s ", name);
			}
		}
	}
	
	public static void main(String[] args) {
		
		List<String> names = Arrays.asList("John", "Jacky", "Jason", "Barry", "Frank", "Andrew");

		// Display names which starts with "J"
		
		// Display names which starts with "n"
		
		// Display names that are no longer than 4 characters
		
		// Display names whose length is greater than 4 and less than 6
		
		// Display names whose length is 4
		
		
		
		
		
	}

}
