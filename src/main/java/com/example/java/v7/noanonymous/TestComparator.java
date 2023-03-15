package com.example.java.v7.noanonymous;

import java.util.Arrays;

public class TestComparator {
	
	public static void main(String[] args) {
		
		String[] tabStrings = {"jill", "bar", "foo", "johan", "lily", "Amandar"};
		
	    Arrays.sort(tabStrings, new MyComparator());
	    
	    for (String name : tabStrings) {
			System.out.println(name);
		}
	
	}

}
