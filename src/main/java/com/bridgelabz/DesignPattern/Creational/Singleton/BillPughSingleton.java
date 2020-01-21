package com.bridgelabz.DesignPattern.Creational.Singleton;

public class BillPughSingleton {
	
	private BillPughSingleton() {}
	
	private static class Innerclass{
		private static final BillPughSingleton INSTANCE = new BillPughSingleton();
	}
	
	public static BillPughSingleton getInstance() {
		return Innerclass.INSTANCE;
	}

}
