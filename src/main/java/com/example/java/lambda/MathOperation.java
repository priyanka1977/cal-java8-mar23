package com.example.java.lambda;

// Java 8 functional interface is the target for Lambda expression 
// Java 8 introduced 2 keyword for interface - static and default
// default methods behavior can be overidden by the implementation class
// every interface gets equals() method from Object class, however, it is ignored by compiler and JVM for interfaces
@FunctionalInterface
public interface MathOperation {

	public abstract int operation(int num1, int num2);
	
	//public abstract int multiply(int a, int b);
	
	public static void method1() {
		System.out.println("Static method of interface");
	}
	
	public default void method2() {
		System.out.println("Default method of interface");
	}
		
}
