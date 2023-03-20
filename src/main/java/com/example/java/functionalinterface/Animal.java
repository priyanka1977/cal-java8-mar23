package com.example.java.functionalinterface;

public class Animal {
	
	private int count;
	
	public Animal() {
		this.count = 10;
		System.out.println("within no-args constructor of Animal");
	}
	
	public Animal(int count) {
		this.count = count;
	}
	
	public void move() {
        System.out.println("Move");
    }

    @Override
    public String toString() {
        return "Some Animal";
    }

}
