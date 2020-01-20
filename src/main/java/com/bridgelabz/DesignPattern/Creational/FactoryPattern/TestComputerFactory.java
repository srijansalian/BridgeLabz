package com.bridgelabz.DesignPattern.Creational.FactoryPattern;

public class TestComputerFactory {

	public static void main(String[] args) {
	 Computer pc = ComputerFactory.getComputer("Pc", "4GB ", "500 Gb ", "i3");
	 Computer server = ComputerFactory.getComputer("Server", "8 GB ", "1 TB ", "i5");
	 Computer Laptop = ComputerFactory.getComputer("Laptop", "16 GB ", "2 TB ", "i7");
	 System.out.println("The Computer config are ::" +pc);
	 System.out.println("The Server config are   ::"+server);
	 System.out.println("The Laptop config are   ::"+Laptop);
	 

	}

}
