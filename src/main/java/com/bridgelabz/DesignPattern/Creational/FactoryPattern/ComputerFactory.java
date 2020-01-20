package com.bridgelabz.DesignPattern.Creational.FactoryPattern;

public class ComputerFactory {
	public static Computer getComputer(String  tpye,String Ram,String HDD,String CPU)
	{
		if("PC".equalsIgnoreCase(tpye)) 
			return new PC(Ram,HDD,CPU);
		else
			if("Server".equalsIgnoreCase(tpye)) 
				return new Server(Ram,HDD,CPU);
			else
				if("Laptop".equalsIgnoreCase(tpye))
					return new Laptop(Ram,HDD,CPU);
		
		return null;
	}
}
