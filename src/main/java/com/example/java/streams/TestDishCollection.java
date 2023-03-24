package com.example.java.streams;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Optional;
import java.util.OptionalInt;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import com.example.java.streams.Dish.Type;

public class TestDishCollection {
	public static void getDishesCaloriesLessThan400(List<Dish> menu) {
		// sort dishes based on filter

		List<Dish> lessCaloriesDishes =

				menu.stream().filter((dish) -> dish.getCalories() < 400)
						.sorted((d1, d2) -> d1.getName().compareTo(d2.getName())).collect(Collectors.toList());

		// System.out.println("Less 400 calories dishes - " + lessCaloriesDishes);

		for (Dish dish : lessCaloriesDishes) {
			System.out.println(dish);
		}
	}

	public static void getDishWithMaximumCalories(List<Dish> menu) {
		// max
		OptionalInt value = menu.stream() // return Stream<Dish>
				.mapToInt(d -> d.getCalories()) // return Intstream
				.max(); // return OptionalInt

		System.out.println(value);
		if (value.isPresent()) {
			System.out.println(value.getAsInt());
		}
	}

	public static void Skip2AndLimit3Dishes(List<Dish> menu) {
		// use skip() and limit() in stream api

		menu.stream().peek((d) -> System.out.println("before skipping - " + d)).skip(2)
				.peek((d) -> System.out.println("after skipping " + d)).limit(3).forEach((d) -> System.out.println(d));

	}

	public static void getTwoMeatDishes(List<Dish> menu) {
		// Limit
		List<Dish> meat1 = menu.stream().filter(d -> d.getType() == Dish.Type.MEAT).limit(2)
				.collect(Collectors.toList());
		System.out.println(meat1);
	}

	public static void getVegetrianDishes(List<Dish> menu) {
		// filter and method reference
		  List<String> list=menu.stream().filter(Dish::isVegetarian)
                .map(Dish::getName)
                .collect(Collectors.toList());
		  
		  System.out.println(list);
	}

	public static void printAllDishTypes() {
		// use distinct
	}

	public static void printSumofCalories(List<Dish> menu) {
		// aggregate function - sum() - it is available in IntStream api
		// IntStream is a return of mapToInt(function<T, R>)

		int totalCalories = menu.stream().mapToInt((dish) -> dish.getCalories()) // IntStream(100, 200, 300)
				.sum();

		System.out.println("total calories - " + totalCalories);

		OptionalInt returnMaxValue = menu.stream().mapToInt((dish) -> dish.getCalories()) // IntStream(100, 200, 300)
				.max();

		System.out.println("Max calories - " + returnMaxValue); // optional[value]
		System.out.println("Max calories - " + returnMaxValue.getAsInt()); // value

		// reduce a, b reduce 0, a, b

		OptionalInt sumValues = menu.stream().mapToInt(dish -> dish.getCalories()).reduce((a, b) -> a + b);

		System.out.println("Total calories - " + sumValues); // optional[value]
		System.out.println("Total calories - " + sumValues.getAsInt()); // value

	}

	public static void anyDishwithCaloriesLess400(List<Dish> menu) {
	
		// findAny() in serial stream will return first value whose value < 400
		/*String dishName = menu.stream() // Data is divided into chunks and given to CPUs
				.filter(dish -> dish.getCalories() < 400)
				 .map(dish -> dish.getName())
				 .findAny()
				.orElseThrow(NoSuchElementException::new);
		System.out.println("Find any dish < 400 calories - " + dishName);
		*/
		
		// You can also use parallelStream where data is divided on multiple threads to run filter
		// in parallelStream, findAny() may not return same record everytime
		// reason - because multiple threads are working on data, who ever returns with value < 400.
		
		String dishName = menu.parallelStream() // Data is divided into chunks and given to CPUs
				.filter(dish -> dish.getCalories() < 400)
				 .map(dish -> dish.getName())
				 .findAny()
				.orElseThrow(NoSuchElementException::new);
		System.out.println("Find any dish < 400 calories - " + dishName);
	}
	

	//  groupby - value -> aggregate function
	public static void printTotalCaloriesofEveryDish(List<Dish> menu) {

		// Group by Dish Type, then sum of calories
				Map<Type, Integer> sum = menu.stream()
						.collect(
		                Collectors.groupingBy(Dish::getType, 
		                		Collectors.summingInt((d) -> d.getCalories())
		               ));
				
				System.out.println(sum);
	}

	public static void main(String[] args) {
		List<Dish> menu = Dish.getDishes();
		// System.out.println(menu);
		// getDishesCaloriesLessThan400(menu);

		// printTotalCaloriesofEveryDish(menu);
		//printSumofCalories(menu);
		// getVegetrianDishes(menu);
		anyDishwithCaloriesLess400(menu);
		// getVegetrianDishes(menu);
		// getDishWithMaximumCalories(menu);
		// getDishesCaloriesLessThan400(menu);
		// getDishWithMaximumCalories(menu);
		// Skip2AndLimit3Dishes(menu);
		// getTwoMeatDishes(menu);
	}

}
