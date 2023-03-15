package com.example.java.v7.noanonymous;

public class MyRunnable implements Runnable {
	@Override
	public void run() {
		int i = 0;
		while (++i < 10) {
			System.out.println("It works!!");
		}
	}
}