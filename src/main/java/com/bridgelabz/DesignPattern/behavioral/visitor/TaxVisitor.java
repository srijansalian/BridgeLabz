package com.bridgelabz.DesignPattern.behavioral.visitor;

import java.text.DecimalFormat;

public class TaxVisitor implements VisitorInf {

	DecimalFormat df = new DecimalFormat("#.##"); // This formats the decimal into 2 decimal points

	public TaxVisitor() {
	}

	// Calculates total price based on this being taxed

	@Override
	public double visit(Liquor liquorItem) {
		System.out.println("The Liquor with Price with Tax");

		return Double.parseDouble(df.format((liquorItem.getPrice() * .18) + liquorItem.getPrice()));
	}

	@Override
	public double visit(Tobacco tobaccoItem) {
		System.out.println("The Tobacco Price with the Tax");

		return Double.parseDouble(df.format((tobaccoItem.getPrice() * .32) + tobaccoItem.getPrice()));
	}

	@Override
	public double visit(Necessity necessityItem) {
		System.out.println("The Necessity Price with the Tax");

		return Double.parseDouble(df.format(necessityItem.getPrice()));

	}

}
