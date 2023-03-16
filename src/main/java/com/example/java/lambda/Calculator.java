package com.example.java.lambda;

public class Calculator {

	public static void main(String[] args) {

		String message = "Hello from Lambda function";
		// Lambda Expression for MathOperation interface

		MathOperation adder; // reference of functional interface

		// syntax - expression = () -> { code will be for abstract method };

		// public abstract int operation(int num1, int num2);
		// compiler will infer the method of MathOperation based on given implemenation
		adder = (int num1, int num2) -> {
			System.out.println(message); // restrictions for variable and properties in the lambda code
			//message = "Hello agian"; // modify the value of variable
			int sum = num1 + num2;
			return sum;
		};

		MathOperation substractor = (int num1, int num2) -> {
			System.out.println("Within lambda function");
			int sum = num1 - num2;
			return sum;
		};

		MathOperation multipler = (int num1, int num2) -> {
			System.out.println("Within lambda function");
			int sum = num1 * num2;
			return sum;
		};

		MathOperation division = (int num1, int num2) -> { return num1/num2; };
		
		MathOperation division1 = (int num1, int num2) ->  num1/num2; 
		
		// invoke the lambda expression
		int result = adder.operation(10, 20);
		System.out.println("Result = " + result);

		// invoke the lambda expression
		 result = substractor.operation(10, 20);
		System.out.println("Result = " + result);

		// invoke the lambda expression
		 result = multipler.operation(10, 20);
		System.out.println("Result = " + result);

	}

}

/*
 * // anonymous style of code MathOperation operation1 = new MathOperation() {
 * 
 * @Override public int operation(int num1, int num2) {
 * System.out.println("Within lambda function"); int sum = num1 + num2; return
 * sum; } };
 * 
 * 
 * public class abc implements MathOperation{ operation(int num1, int num2) }
 */
