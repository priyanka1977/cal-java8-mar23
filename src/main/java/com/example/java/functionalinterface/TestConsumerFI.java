package com.example.java.functionalinterface;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class TestConsumerFI {

	public static void main(String[] args) {

		// lambda for void accept(T t)
		Consumer<String> consumer = (String str) -> System.out.println("String passed - " + str);

		// invoke the lambda expression
		consumer.accept("priyanka");
		consumer.accept("hello world");
		consumer.accept("1234");

		Consumer<String> consumer1 = (String str) -> System.out.println("In upper case - " + str.toUpperCase());

		// invoke the lambda expression
		consumer1.accept("priyanka");
		consumer1.accept("hello world");
		consumer1.accept("1234");

		// forEach method

		List<String> list = new ArrayList<String>();
		list.add("jack");
		list.add("jill");
		list.add("peter");
		list.add("paul");

		// java 1.5 - forEach() loop
		for (String name : list) {
            System.out.println("item - " + name);
		}


		Consumer<String> action = (String str) -> System.out.println("String passed - " + str);
		// Java 1.8 - forEach() method
		list.forEach(action);
		
		list.forEach((String str) -> System.out.println("element - " + str));
		
		
		// print every element from the list in upper case using forEach() method
		// declarative style of coding - what to do 
		list.forEach((String str) -> System.out.println(str.toUpperCase()));
				
		
		
		// Display Exam object details using Consumer interface
         // e will be inferred as Exam type by compiler  
		Consumer<Exam> consumerExam = (e) -> System.out.println(e.getName() + " " + e.getVersion());
		
		// test the behaviour of consumer
		consumerExam.accept(new Exam("Java", "1.8"));
		consumerExam.accept(new Exam("Snowflake", "COF-02"));
		
		
		
		// Display passed string "hello world" in uppercase and lowercase
		Consumer<String> stringConsumer = (String str) -> System.out.println("In uppercase - " + str.toUpperCase() + " In lowercase " + str.toLowerCase());

		stringConsumer.accept("hello world");
		
		
		// using .andThen() method
		
		// default methods are called on objects
		
		Consumer<String> upperCaseConsumer = (str) -> System.out.println(str.toUpperCase());
		
		Consumer<String> lowerCaseConsumer = (str) -> System.out.println(str.toLowerCase());
		
		
		Consumer<String> resultConsumer = upperCaseConsumer.andThen(lowerCaseConsumer);
		
		
		resultConsumer.accept("hello world");
		
		// resultconsumer = printActivateconsumer.andThen(personDetailConsumer);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}
}
