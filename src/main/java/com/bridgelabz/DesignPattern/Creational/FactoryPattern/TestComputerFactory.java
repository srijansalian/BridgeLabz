package com.bridgelabz.DesignPattern.Creational.FactoryPattern;

public class TestComputerFactory {

	public static void main(String[] args) {
	 Computer pc = ComputerFactory.getComputer("Pc", "4GB ", "500Gb ", "i3");
	 Computer server = ComputerFactory.getComputer("Server", "8GB ", "1TB ", "i5");
	 System.out.println("The Computer config are ::" +pc);
	 System.out.println("The Server config are   ::"+server);
	 

	}

}
