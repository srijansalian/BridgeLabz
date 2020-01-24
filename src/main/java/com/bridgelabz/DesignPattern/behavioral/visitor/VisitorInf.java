package com.bridgelabz.DesignPattern.behavioral.visitor;

public interface VisitorInf {
	public double visit(Liquor liquorItem);

	public double visit(Tobacco tobaccoItem);

	public double visit(Necessity necessityItem);

}
