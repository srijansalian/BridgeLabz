package com.bridgelabz.DesignPattern.behavioral.visitor;

public class Liquor implements Visitable {
	
	private double price;
	
	public Liquor(double item) {
		this.price = item;
	}
	
	public double getPrice() {
		return price;
	}

	@Override
	public double accept(VisitorInf visitor) {
		
		return visitor.visit(this);
	}

}
