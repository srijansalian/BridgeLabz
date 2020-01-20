package com.bridgelabz.DesignPattern.Creational.FactoryPattern;

public abstract class Computer {
	public abstract String getRam();
	public abstract String getHDD();
	public abstract String getCPU();
	
	public String toString() {
		return "Ram " +this.getRam() + "HDD " +this.getHDD() + " CPU " +this.getCPU();
	}
	

}
