package com.example.java.v7.anonymous;

public class TestThreadWithAnonymousClass {

	public static void main(String[] args) {

		System.out.println("Main thread started...");
		// Runnable Interface in Java
		// anonymous classes are written for interfaces
		Runnable runnable = new Runnable() {

			@Override
			public void run() {

				int i = 0;

				while (++i < 10) {
					System.out.println("It works!!");
				}
			}
		};

		// Code of Runnable as a parameter to the Thread object
		Thread t1 = new Thread(runnable);
		t1.start();

	}

}
