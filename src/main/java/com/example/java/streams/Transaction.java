package com.example.java.streams;

import java.util.ArrayList;
import java.util.List;

public class Transaction {
	
	private String type;
	private int id;
	private int value;
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getValue() {
		return value;
	}
	public void setValue(int value) {
		this.value = value;
	}
	public Transaction(String type, int id, int value) {
		super();
		this.type = type;
		this.id = id;
		this.value = value;
	}
	
	
	public static List<Transaction> allTransactions(){
		
		List<Transaction> list = new ArrayList<Transaction>();
		list.add(new Transaction("grocery", 1, 2000));
		list.add(new Transaction("cleaning items", 2, 120));
		list.add(new Transaction("electronic", 6, 4500));
		list.add(new Transaction("Bakery items", 3, 180));
		list.add(new Transaction("grocery", 5, 800));
		list.add(new Transaction("stationary", 10, 450));
		list.add(new Transaction("grocery", 4, 78999));
		list.add(new Transaction("cutlery", 7, 320));
		return list;
	}

}
