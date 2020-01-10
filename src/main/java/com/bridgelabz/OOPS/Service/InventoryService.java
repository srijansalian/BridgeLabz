package com.bridgelabz.OOPS.Service;

public class InventoryService {
	private String name;
	private int weight;
	private int weight_per_kg;
	private int totalprize;
	public String getName()     {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getWeight() {
		return weight;
	}
	public void setWeight(int weight) {
		this.weight = weight;
	}
	public int getWeight_per_kg() {
		return weight_per_kg;
	}
	public void setWeight_per_kg(int weight_per_kg) {
		this.weight_per_kg = weight_per_kg;
	}
	public int getTotalprize() {
		return totalprize;
	}
	public void setTotalprize(int totalprize) {
		this.totalprize = totalprize;
	}

}
