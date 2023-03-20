package com.example.java.lambda;

import java.util.Arrays;
import java.util.Comparator;

public class TestComparatorWithAnonymousClass {

	public static void main(String[] args) {
		
		// anonymous block of code for Comparator interface
	/*	Comparator<String> comparator = new Comparator<String>() {
			@Override
			public int compare(String o1, String o2) {
				return Integer.compare(o1.length(), o2.length());
			}
		};
  */
		
		// Rewrite anonymous block as Lambda expression
		Comparator<String> comparator = (o1, o2) -> Integer.compare(o1.length(), o2.length()); 
		
		
		// Comparator object is used by Arrays.sort() method for comparing strings 
		
		String[] tabStrings = {"jill", "bar", "foo", "johan", "lily", "Amandar"};
	
	    Arrays.sort(tabStrings, comparator);
	    
	    for (String name : tabStrings) {
			System.out.println(name);
		}
	
	}
}







