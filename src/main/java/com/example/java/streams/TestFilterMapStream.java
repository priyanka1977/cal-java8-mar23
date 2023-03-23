package com.example.java.streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class TestFilterMapStream {

	public static void main(String[] args) {

		// of() is a factory method
		Stream<Integer> stream = Stream.of(10, 20, 30, 43, 25, 9, 6, 15);

		// print the stream

		System.out.println(stream);

		// filter method takes predicate is an intermediate method
		Predicate<Integer> predicate1 = (i) -> i % 2 == 0;
		Stream<Integer> filterStream = stream.filter(predicate1);

		// System.out.println("filtered data - " + filterStream);

		// use terminate operation to print elements from the stream
		// forEach() method is a terminal method
		filterStream.forEach((intObj) -> System.out.println(intObj));

		// once terminal operation is completed on streams, you can not print the data
		// streams does not store the data
		// filterStream.forEach((intObj) -> System.out.println(intObj));

		System.out.println("==============================================================");

		Stream<Integer> stream2 = Stream.of(10, 30, 45, 67, 77, 12);

		/*
		 * stream2.filter((i) -> i % 2 == 0) .forEach((i) -> System.out.println(i));
		 */

		/*
		 * stream2.filter((i) -> { System.out.println("within filter - " + i); return
		 * i%2 == 0; // 10 %2 == 0 true }) .forEach((i) ->
		 * System.out.println("Filtered Data - " + i));
		 */

		// Function<T, R> - t (10, 20) -> 10 * 10

		// filter the positive value, then square them, and display result

		List<Integer> squareIntegers = stream2.filter((intObj) -> {
			System.out.println("withinfilter - " + intObj);
			return intObj % 2 == 0;
		}).map((intObj) -> {
			System.out.println("within map - " + intObj);
			return intObj * intObj;
		}).collect(Collectors.toList());

		System.out.println("List = " + squareIntegers);

		List<Integer> list = Arrays.asList(10, 30, 45, 78, 6);

		List<Integer> listInteger = list.stream().filter((intObj) -> intObj % 2 == 0).map((intObj) -> intObj * intObj)
				.collect(Collectors.toList());

		System.out.println(listInteger);

		System.out.println("========================================================");
		// allMatch(), anyMatch() method
		List<String> list3 = Arrays.asList("java", "junit", "Jasmine", "SQL-PLSQL", "Angular");

		Boolean lengthResult = list3.stream() // all data flowing on pipe will be of String
				.allMatch((str) -> str.length() > 3);

		System.out.println(lengthResult);

		// anyMatch
		boolean res = list3.stream().anyMatch((str) -> {
			System.out.println("string - " + str);
			return Character.isUpperCase(str.charAt(0));
		});

		System.out.println("string at postiiton 1 capital? " + res);

		System.out.println("====================================================");
		// noneMatch()
		IntStream intStream = IntStream.of(7, 9, 3, 1);
		boolean positiveResult = intStream.noneMatch((num) -> num % 2 == 0);
		System.out.println("Not Divide by zero - " + positiveResult);
		
		

	}
}
