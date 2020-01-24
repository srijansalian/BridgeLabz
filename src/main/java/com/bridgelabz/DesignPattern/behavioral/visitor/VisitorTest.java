package com.bridgelabz.DesignPattern.behavioral.visitor;

public class VisitorTest {

	public static void main(String[] args) {

		TaxVisitor Taxvistor = new TaxVisitor();

		TaxHoildayVisitor TaxHoilday = new TaxHoildayVisitor();

		Liquor Beer = new Liquor(195);
		Tobacco cigar = new Tobacco(45);
		Necessity juice = new Necessity(80);

		System.out.println(Beer.accept(Taxvistor) + "\n");
		System.out.println(cigar.accept(Taxvistor) + "\n");
		System.out.println(juice.accept(Taxvistor) + "\n");

		System.out.println("HOILDAY DISCOUNT !!!!!!!!! ");

		System.out.println(Beer.accept(TaxHoilday) + "\n");
		System.out.println(cigar.accept(TaxHoilday) + "\n");
		System.out.println(juice.accept(TaxHoilday) + "\n");

	}

}
