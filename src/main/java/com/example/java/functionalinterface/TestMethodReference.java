package com.example.java.functionalinterface;

import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;

public class TestMethodReference {
	
	public static void main(String[] args) {
		
		/*String x = "abcd";
		
		Consumer<String> consumer = (str) -> System.out.println(x); // cannot write the syso(x) as method reference
		
		// void accept(T)
		Consumer<String> consumer1 = System.out :: println;
		
		consumer1.accept("mastek");
		*/
		
		// method on static methods
		//BiFunction<Integer, Integer, Integer> function1 = (num1, num2) -> Integer.max(num1, num2);
	 	BiFunction<Integer, Integer, Integer> function1 = Integer :: max;
	  // BiFunction<Integer, Integer, Integer> function1 = Integer :: sum;
		int max = function1.apply(20,  40);
		System.out.println("Max of 2 number - " + max);
		
		
		Supplier<Animal> supplier2 = () -> new Animal();  // () -> new Animal();
		Animal animal = supplier2.get();
		System.out.println(animal);
		
		Supplier<Animal> supplier1 = Animal :: new;  // () -> new Animal();
	    animal = supplier1.get();
		System.out.println(animal);
		
		
		// Supplier Interface - we want to invoke the parameterized constructor of Animal class
		// new Animal(10);
		// T get()
		
		
		Function<Exam, String> function2 =   Exam :: getName;  // getName is the instancemethod  of Exam class
		
		String name  = function2.apply(new Exam("snowflake", "COF-02"));
		
		System.out.println(name);
		
		
		
		
		
		
		
		
	}

}
