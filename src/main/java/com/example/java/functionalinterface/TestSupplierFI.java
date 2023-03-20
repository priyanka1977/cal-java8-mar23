package com.example.java.functionalinterface;

import java.util.function.Supplier;

public class TestSupplierFI {

	public static void main(String[] args) {

		// Return object of Animal using Supplier interface
		// Supplier - T get()
		Supplier<Animal> supplier1 = () -> new Animal();

		Animal animal = supplier1.get();
		animal.move();
		System.out.println(animal);

		Supplier<Animal> supplier2 = () -> new Bird();
		animal = supplier2.get();
		animal.move();
		System.out.println(animal);
		
		
		//

	}

}
