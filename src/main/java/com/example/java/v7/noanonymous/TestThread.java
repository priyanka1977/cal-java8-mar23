package com.example.java.v7.noanonymous;

public class TestThread {

	public static void main(String[] args) {
		
		System.out.println("In main thread");
		Thread t1 = new Thread(new MyRunnable());
		t1.start();
		
	}
}
