package com.bridgelabz.OOPS.Model;

public class InventoryModel {
	private String Rice;
	private String pluses;
	private String wheat;
	public String getRice() {
		return Rice;
	}
	public void setRice(String rice) {
		Rice = rice;
	}
	public String getPluses() {
		return pluses;
	}
	public void setPluses(String pluses) {
		this.pluses = pluses;
	}
	public String getWheat() {
		return wheat;
	}
	public void setWheat(String wheat) {
		this.wheat = wheat;
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
	private int weight;
	private int weight_per_kg;
	private int totalprize;

}
