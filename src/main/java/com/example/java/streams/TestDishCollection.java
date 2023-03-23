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


public class TestDishCollection {
	public static void getDishesCaloriesLessThan400(List<Dish> menu) {
	// sort dishes based on filter
		
		List<Dish> lessCaloriesDishes =
			
			menu.stream()
		    .filter((dish) -> dish.getCalories() < 400)
		    .sorted((d1, d2) -> d1.getName().compareTo(d2.getName()))   
		    .collect(Collectors.toList());
	
	//System.out.println("Less 400 calories dishes - " + lessCaloriesDishes);
	
		for (Dish dish : lessCaloriesDishes) {
			System.out.println(dish);
		}
	}

	public static void getDishWithMaximumCalories(List<Dish> menu) {
		
		
	}

	public static void Skip2AndLimit3Dishes(List<Dish> menu) {
		// use skip() and limit() in stream api
		
		menu.stream()
		    .peek((d) -> System.out.println("before skipping - " + d))
		    .skip(2)
		    .peek((d) -> System.out.println("after skipping " +d))
		    .limit(3)
		    .forEach((d) -> System.out.println(d));
		
	}

	public static void getTwoMeatDishes(List<Dish> menu) {
		
	}

	public static void getVegetrianDishes(List<Dish> menu) {
		
	}

	public static void printAllDishTypes() {
		// use distinct
	}

	public static void printSumofCalories(List<Dish> menu) {
		// aggregate function - sum()  - it is available in IntStream api
		// IntStream is a  return of mapToInt(function<T, R>)
		
  int totalCalories = 		menu.stream()
		    .mapToInt((dish) -> dish.getCalories()) // IntStream(100, 200, 300)
		    .sum();
		
		System.out.println("total calories - " +  totalCalories);
		
		
		OptionalInt returnMaxValue  = menu.stream()
			    .mapToInt((dish) -> dish.getCalories()) // IntStream(100, 200, 300)
			    .max();
			
			System.out.println("Max calories - " +  returnMaxValue); // optional[value]
			System.out.println("Max calories - " +  returnMaxValue.getAsInt()); // value
			
			// reduce a, b  reduce 0, a, b 
			
		OptionalInt sumValues = 	menu.stream()
			.mapToInt(dish -> dish.getCalories())
			.reduce((a, b) ->  a + b);
		
		System.out.println("Total calories - " +  sumValues); // optional[value]
		System.out.println("Total calories - " +  sumValues.getAsInt()); // value
			
	}

	public static void AnyDishwithCaloriesLess400(List<Dish> menu) {

	
	}

	
	public static void printTotalCaloriesofEveryDish(List<Dish> menu) {
		
		
		
	}

	public static void main(String[] args) {
		List<Dish> menu = Dish.getDishes();
		//System.out.println(menu);
		//getDishesCaloriesLessThan400(menu);
		
		//printTotalCaloriesofEveryDish(menu);
		printSumofCalories(menu);
		//getVegetrianDishes(menu);
		// AnyDishwithCaloriesLess400(menu);
		// getVegetrianDishes(menu);
		// getDishWithMaximumCalories(menu);
		// getDishesCaloriesLessThan400(menu);
		// getDishWithMaximumCalories(menu);
		   //Skip2AndLimit3Dishes(menu);
		// getTwoMeatDishes(menu);
	}

}
