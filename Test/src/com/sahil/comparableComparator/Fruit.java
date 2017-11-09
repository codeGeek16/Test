package com.sahil.comparableComparator;

import java.util.Arrays;

public class Fruit implements Comparable<Fruit>{
	private String name;
	private String desc;
	private int quantity;
	
	//constructor
	public Fruit(String name, String desc, int quantity) {
		super();
		this.name = name;
		this.desc = desc;
		this.quantity = quantity;
	}
	//gettes & setters

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDesc() {
		return desc;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	
	//compare to override
	public int compareTo(Fruit f){
		//compare based on string value
		return this.name.toUpperCase().compareTo(f.name.toUpperCase());
		//compare based on integer value
		//return this.quantity - f.quantity;
	}
	
	// to string override
	public String toString() {
		return "Fruit [name=" + name + ", desc=" + desc + ", quantity=" + quantity + "] \n";
	}
	
	public static void main(String args[]){
		Fruit[] fruit = new Fruit[3];
		Fruit pineapple = new Fruit("Pineapple","Pine apple desc",10);
		Fruit apple = new Fruit("apple","apple desc",18);
		Fruit orange = new Fruit("orange","orange apple desc",9);
		fruit[0] = pineapple;
		fruit[1] = apple;
		fruit[2] = orange;
		Arrays.sort(fruit);
		System.out.println(Arrays.toString(fruit));
	}

}
