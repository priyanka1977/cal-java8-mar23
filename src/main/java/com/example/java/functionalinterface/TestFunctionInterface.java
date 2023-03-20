package com.example.java.functionalinterface;

import java.util.function.Function;
import java.util.function.UnaryOperator;

//Controller <---------> Service (method(Lambda)) <-----------> Repository
public class TestFunctionInterface {
	
	public static void invokeFunction(Function<Exam, String> functionLambda) {
		
		String res = functionLambda.apply(new Exam("ocjp", "1.8"));
		System.out.println("res - " + res);
	}
	
	public static void main(String[] args) {
		
		// Function Interface =  R apply(T)
		// String class 
	
		
		Function<Exam, String> lambda4= exam  -> exam.getName() + " - " + exam.getVersion();
		
		TestFunctionInterface.invokeFunction(exam  -> exam.getName().toUpperCase() + " - " + exam.getVersion().toUpperCase());
		
		TestFunctionInterface.invokeFunction(lambda4);
		
		
		UnaryOperator<Integer> unaryOperator1 =  i   ->  i * i; 
		
		UnaryOperator<Integer> unaryOperator2 =  i -> i + 10;
		
		
		Integer returnInt = unaryOperator1.apply(10);
		System.out.println("Returned int - " + returnInt);
		returnInt = unaryOperator2.apply(20);
		System.out.println("Returned int - " + returnInt);
		
	/*	Function<String, Integer> functionLambda  = (String str) -> {
			System.out.println("within the lambda function");
			return str.length();
		};
		
		// invoke function interface - R apply(T)
		
		System.out.println(functionLambda.apply("hello"));
		System.out.println(functionLambda.apply("hello world"));
		
		
		// () -> {} rewritten as Method reference ::
		// Method reference
		Function<String, Integer> lambda2 =  String :: length;
		
		System.out.println(" Length of passed string - " +  lambda2.apply("priyanka"));
		
		
		// use Function interface - pass Exam object and return object as string 
		
         // write the lambda expression
		Function<Exam, String> functionLambda2 = exam -> exam.getName() + "  " + exam.getVersion();
		
		 // invoke the lambda code
		System.out.println(functionLambda2.apply(new Exam("Snowflake", "COF-02")));
		
		*/
		
		
		
	}

}
