package com.bridgelabz.DesignPattern.behavioral.visitor;

import java.text.DecimalFormat;

public class TaxHoildayVisitor implements VisitorInf {
	
	DecimalFormat df = new DecimalFormat("#.##"); // This formats the decimal into 2 decimal points

	public TaxHoildayVisitor() {
	}

	// Calculates total price based on this being taxed

	@Override
	public double visit(Liquor liquorItem) {
		System.out.println("The Liquor with Price");

		return Double.parseDouble(df.format((liquorItem.getPrice() * .10) + liquorItem.getPrice()));
	}

	@Override
	public double visit(Tobacco tobaccoItem) {
		System.out.println("The Tobacco Price with the Tax");

		return Double.parseDouble(df.format((tobaccoItem.getPrice() * .25) + tobaccoItem.getPrice()));
	}

	@Override
	public double visit(Necessity necessityItem) {
		System.out.println("The Necessity Price with the Tax");

		return Double.parseDouble(df.format(necessityItem.getPrice()));

	}

}
