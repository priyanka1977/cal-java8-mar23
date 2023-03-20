package com.example.java.lambda;

public class TestThreadWithAnonymousClass {

	public static void main(String[] args) {

		System.out.println("Main thread started...");
		// Runnable Interface in Java
		// anonymous classes are written for interfaces
		/*
		 * Runnable runnable = new Runnable() {
		 * 
		 * @Override public void run() {
		 * 
		 * int i = 0;
		 * 
		 * while (++i < 10) { System.out.println("It works!!"); } } };
		 */

		// Rewrite code as Lambda expression
		Runnable runnable = () -> {
			int i = 0;
			while (++i < 10) {
				System.out.println("It works!!");
			}
		};

		// Code of Runnable as a parameter to the Thread object
		Thread t1 = new Thread(runnable);
		t1.start();

	}

}
