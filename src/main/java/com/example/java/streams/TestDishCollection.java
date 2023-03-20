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

import com.training.streams.Dish.Type;

public class TestDishCollection {
	public static void getDishesCaloriesLessThan400(List<Dish> menu) {
		
			
	}

	public static void getDishWithMaximumCalories(List<Dish> menu) {
		
		
		

	public static void Skip2AndLimit3Dishes(List<Dish> menu) {
	}

	public static void getTwoMeatDishes(List<Dish> menu) {
		
	}

	public static void getVegetrianDishes(List<Dish> menu) {
		
	}

	public static void printAllDishTypes() {
		// use distinct
	}

	public static void printSumofCalories(List<Dish> menu) {
		
	}

	public static void AnyDishwithCaloriesLess400(List<Dish> menu) {

	
	}

	
	public static void printTotalCaloriesofEveryDish(List<Dish> menu) {
		
		
		
	}

	public static void main(String[] args) {
		List<Dish> menu = Dish.getDishes();
		printTotalCaloriesofEveryDish(menu);
		//printSumofCalories(menu);
		//getVegetrianDishes(menu);
		// AnyDishwithCaloriesLess400(menu);
		// getVegetrianDishes(menu);
		// getDishWithMaximumCalories(menu);
		// getDishesCaloriesLessThan400(menu);
		// getDishWithMaximumCalories(menu);
		// Skip2AndLimit3Dishes(menu);
		// getTwoMeatDishes(menu);
	}

}
